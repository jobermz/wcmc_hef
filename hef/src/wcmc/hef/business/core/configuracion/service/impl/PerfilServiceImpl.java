package wcmc.hef.business.core.configuracion.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.configuracion.dto.PerfilDto;
import wcmc.hef.business.core.configuracion.service.PerfilService;
import wcmc.hef.dao.configuracion.domain.Perfil;
import wcmc.hef.dao.configuracion.domain.PerfilParamDef;
import wcmc.hef.dao.configuracion.domain.PerfilParamDef.Criteria;
import wcmc.hef.dao.configuracion.mapper.PerfilMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class PerfilServiceImpl implements PerfilService {
	@Autowired
	private PerfilMapper perfilMapper;
	public List<Perfil> buscar(PerfilDto perfilDto) throws Exception {
		PerfilParamDef perfilParamDef		= new PerfilParamDef();
		
		Criteria criteria		= perfilParamDef.createCriteria();
		if(perfilDto != null) {
			if(CadenaUtil.getStrNull(perfilDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(perfilDto.getStrNombre());
			}
		}
		
		List<Perfil>	 list	= perfilMapper.selectByDefaultParameter(perfilParamDef);
		return list;
	}
	
	public Perfil buscarById(PerfilDto perfilDto) throws Exception {
		Perfil perfil		= new Perfil();
		BeanUtils.copyProperties(perfilDto, perfil);
		return perfilMapper.selectByPrimaryKey(perfil);
	}
	
	@Transactional
	public Integer guardar(PerfilDto perfilDto) throws Exception {
		Perfil perfil		= new Perfil();
		BeanUtils.copyProperties(perfilDto, perfil);
		int rs	= 0;
		Perfil exitePerfil		= perfilMapper.selectByPrimaryKey(perfil);
		if(exitePerfil != null) {
			rs	= perfilMapper.updateByPrimaryKeySelective(perfil);
		} else {
			rs	= perfilMapper.insertSelective(perfil);
			
			Integer srlIdPerfil	= perfilMapper.lastSequence();
			perfilDto.setSrlIdPerfil(srlIdPerfil);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(PerfilDto perfilDto) throws Exception {
		Perfil perfil		= new Perfil();
		BeanUtils.copyProperties(perfilDto, perfil);
		Integer rs	= perfilMapper.deleteByPrimaryKey(perfil);
		return rs;
	}
	
}
