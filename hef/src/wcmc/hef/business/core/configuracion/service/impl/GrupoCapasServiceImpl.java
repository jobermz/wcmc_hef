package wcmc.hef.business.core.configuracion.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.configuracion.dto.GrupoCapasDto;
import wcmc.hef.business.core.configuracion.service.GrupoCapasService;
import wcmc.hef.dao.configuracion.domain.GrupoCapas;
import wcmc.hef.dao.configuracion.domain.GrupoCapasParamDef;
import wcmc.hef.dao.configuracion.domain.GrupoCapasParamDef.Criteria;
import wcmc.hef.dao.configuracion.mapper.GrupoCapasMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class GrupoCapasServiceImpl implements GrupoCapasService {
	@Autowired
	private GrupoCapasMapper grupoCapasMapper;
	public List<GrupoCapas> buscar(GrupoCapasDto grupoCapasDto) throws Exception {
		GrupoCapasParamDef grupoCapasParamDef		= new GrupoCapasParamDef();
		Criteria criteria		= grupoCapasParamDef.createCriteria();
		if(grupoCapasDto != null) {
			if(CadenaUtil.getStrNull(grupoCapasDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(grupoCapasDto.getStrNombre());
			}
			if(CadenaUtil.getInteNull(grupoCapasDto.getIntIdGrupoCapasPadre()) != null) {
				criteria.andIntIdGrupoCapasPadreEqualTo(grupoCapasDto.getIntIdGrupoCapasPadre());
			} else {
				criteria.andIntIdGrupoCapasPadreIsNull();
			}
		}
		grupoCapasParamDef.setOrderByClause("cd_grcapad desc, nm_orden, de_nombre");
		List<GrupoCapas>	 list	= grupoCapasMapper.selectByDefaultParameter(grupoCapasParamDef);
		return list;
	}
	public List<GrupoCapas> buscarTodos(GrupoCapasDto grupoCapasDto) throws Exception {
		GrupoCapasParamDef grupoCapasParamDef		= new GrupoCapasParamDef();
		Criteria criteria		= grupoCapasParamDef.createCriteria();
		if(grupoCapasDto != null) {
			if(CadenaUtil.getStrNull(grupoCapasDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(grupoCapasDto.getStrNombre());
			}
		}
		grupoCapasParamDef.setOrderByClause("cd_grcapad desc, nm_orden, de_nombre");
		List<GrupoCapas>	 list	= grupoCapasMapper.selectByDefaultParameter(grupoCapasParamDef);
		return list;
	}
	
	public List<GrupoCapas> buscarGruposBase(GrupoCapasDto grupoCapasDto) throws Exception {
		GrupoCapasParamDef grupoCapasParamDef		= new GrupoCapasParamDef();
		Criteria criteria		= grupoCapasParamDef.createCriteria();
		criteria.andIntIdGrupoCapasPadreIsNull();
		grupoCapasParamDef.setOrderByClause("nm_orden");
		List<GrupoCapas>	 list	= grupoCapasMapper.selectByDefaultParameter(grupoCapasParamDef);
		return list;
	}
	
	public GrupoCapas buscarById(GrupoCapasDto grupoCapasDto) throws Exception {
		GrupoCapas grupoCapas		= new GrupoCapas();
		BeanUtils.copyProperties(grupoCapasDto, grupoCapas);
		return grupoCapasMapper.selectByPrimaryKey(grupoCapas);
	}
	
	@Transactional
	public Integer guardar(GrupoCapasDto grupoCapasDto) throws Exception {
		GrupoCapas grupoCapas		= new GrupoCapas();
		BeanUtils.copyProperties(grupoCapasDto, grupoCapas);
		int rs	= 0;
		GrupoCapas exiteGrupoCapas		= grupoCapasMapper.selectByPrimaryKey(grupoCapas);
		if(exiteGrupoCapas != null) {
			rs	= grupoCapasMapper.updateByPrimaryKeySelective(grupoCapas);
		} else {
			rs	= grupoCapasMapper.insertSelective(grupoCapas);
			
			Integer srlIdGrupoCapas	= grupoCapasMapper.lastSequence();
			grupoCapasDto.setSrlIdGrupoCapas(srlIdGrupoCapas);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(GrupoCapasDto grupoCapasDto) throws Exception {
		GrupoCapas grupoCapas		= new GrupoCapas();
		BeanUtils.copyProperties(grupoCapasDto, grupoCapas);
		Integer rs	= grupoCapasMapper.deleteByPrimaryKey(grupoCapas);
		return rs;
	}
	
}
