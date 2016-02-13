package wcmc.hef.business.core.seguridad.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.seguridad.dto.CuentaUsuarioDto;
import wcmc.hef.business.core.seguridad.service.CuentaUsuarioService;
import wcmc.hef.dao.seguridad.domain.CuentaUsuario;
import wcmc.hef.dao.seguridad.domain.CuentaUsuarioParamDef;
import wcmc.hef.dao.seguridad.domain.CuentaUsuarioParamDef.Criteria;
import wcmc.hef.dao.seguridad.mapper.CuentaUsuarioMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class CuentaUsuarioServiceImpl implements CuentaUsuarioService {
	@Autowired
	private CuentaUsuarioMapper cuentaUsuarioMapper;
	public List<CuentaUsuario> buscar(CuentaUsuarioDto cuentaUsuarioDto) throws Exception {
		CuentaUsuarioParamDef cuentaUsuarioParamDef		= new CuentaUsuarioParamDef();
		
		Criteria criteria		= cuentaUsuarioParamDef.createCriteria();
		if(cuentaUsuarioDto != null) {
			if(CadenaUtil.getStrNull(cuentaUsuarioDto.getStrNombres()) != null) {
				criteria.andStrNombresLike(cuentaUsuarioDto.getStrNombres());
			}
			if(CadenaUtil.getStrNull(cuentaUsuarioDto.getStrEsActivo()) != null) {
				criteria.andStrEsActivoLike(cuentaUsuarioDto.getStrEsActivo());
			}
			
			if(CadenaUtil.getStrNull(cuentaUsuarioDto.getStrUsuario()) != null) {
				criteria.andStrUsuarioEqualTo(cuentaUsuarioDto.getStrUsuario());
			}
			if(CadenaUtil.getStrNull(cuentaUsuarioDto.getStrClave()) != null) {
				criteria.andStrClaveEqualTo(cuentaUsuarioDto.getStrClave());
			}
		}
		
		cuentaUsuarioParamDef.setOrderByClause("nm_nombre, nm_apellid");
		List<CuentaUsuario>	 list	= cuentaUsuarioMapper.selectByDefaultParameter(cuentaUsuarioParamDef);
		return list;
	}
	
	public CuentaUsuario buscarById(CuentaUsuarioDto cuentaUsuarioDto) throws Exception {
		CuentaUsuario cuentaUsuario		= new CuentaUsuario();
		BeanUtils.copyProperties(cuentaUsuarioDto, cuentaUsuario);
		return cuentaUsuarioMapper.selectByPrimaryKey(cuentaUsuario);
	}
	
	@Transactional
	public Integer guardar(CuentaUsuarioDto cuentaUsuarioDto) throws Exception {
		CuentaUsuario cuentaUsuario		= new CuentaUsuario();
		BeanUtils.copyProperties(cuentaUsuarioDto, cuentaUsuario);
		int rs	= 0;
		CuentaUsuario exiteCuentaUsuario		= cuentaUsuarioMapper.selectByPrimaryKey(cuentaUsuario);
		if(exiteCuentaUsuario != null) {
			rs	= cuentaUsuarioMapper.updateByPrimaryKeySelective(cuentaUsuario);
		} else {
			rs	= cuentaUsuarioMapper.insertSelective(cuentaUsuario);
			
			Integer srlId	= cuentaUsuarioMapper.lastSequence();
			cuentaUsuarioDto.setSrlId(srlId);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(CuentaUsuarioDto cuentaUsuarioDto) throws Exception {
		CuentaUsuario cuentaUsuario		= new CuentaUsuario();
		BeanUtils.copyProperties(cuentaUsuarioDto, cuentaUsuario);
		Integer rs	= cuentaUsuarioMapper.deleteByPrimaryKey(cuentaUsuario);
		return rs;
	}
	
}
