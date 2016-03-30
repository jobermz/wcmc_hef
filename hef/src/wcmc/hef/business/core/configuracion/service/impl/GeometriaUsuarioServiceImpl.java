package wcmc.hef.business.core.configuracion.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.configuracion.dto.GeometriaUsuarioDto;
import wcmc.hef.business.core.configuracion.service.GeometriaUsuarioService;
import wcmc.hef.dao.configuracion.domain.GeometriaUsuario;
import wcmc.hef.dao.configuracion.domain.GeometriaUsuarioParamDef;
import wcmc.hef.dao.configuracion.domain.GeometriaUsuarioParamDef.Criteria;
import wcmc.hef.dao.configuracion.mapper.GeometriaUsuarioMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class GeometriaUsuarioServiceImpl implements GeometriaUsuarioService {
	@Autowired
	private GeometriaUsuarioMapper geometriaUsuarioMapper;
	public List<GeometriaUsuario> buscar(GeometriaUsuarioDto geometriaUsuarioDto) throws Exception {
		GeometriaUsuarioParamDef geometriaUsuarioParamDef		= new GeometriaUsuarioParamDef();
		
		Criteria criteria		= geometriaUsuarioParamDef.createCriteria();
		if(geometriaUsuarioDto != null) {
			if(CadenaUtil.getStrNull(geometriaUsuarioDto.getStrGeometry()) != null) {
				criteria.andStrGeometryIntersectsTo(geometriaUsuarioDto.getStrGeometry());
			}
			if(CadenaUtil.getInteNull(geometriaUsuarioDto.getIntIdCapa()) != null) {
				criteria.andIntIdCapaEqualTo(geometriaUsuarioDto.getIntIdCapa());
			}
			geometriaUsuarioParamDef.setStrHashConsulta(geometriaUsuarioDto.getStrHashConsulta());
		}
		
		geometriaUsuarioParamDef.setOrderByClause("cd_geometria");
		List<GeometriaUsuario>	 list	= geometriaUsuarioMapper.selectByDefaultParameter(geometriaUsuarioParamDef);
		return list;
	}
	
	public GeometriaUsuario buscarById(GeometriaUsuarioDto geometriaUsuarioDto) throws Exception {
		GeometriaUsuario geometriaUsuario		= new GeometriaUsuario();
		BeanUtils.copyProperties(geometriaUsuarioDto, geometriaUsuario);
		return geometriaUsuarioMapper.selectByPrimaryKey(geometriaUsuario);
	}

	@Transactional
	public Integer guardar(GeometriaUsuarioDto geometriaUsuarioDto) throws Exception {
		GeometriaUsuario geometriaUsuario		= new GeometriaUsuario();
		BeanUtils.copyProperties(geometriaUsuarioDto, geometriaUsuario);
		int rs	= 0;
		GeometriaUsuario exiteGeometriaUsuario		= geometriaUsuarioMapper.selectByPrimaryKey(geometriaUsuario);
		if(exiteGeometriaUsuario != null) {
			rs	= geometriaUsuarioMapper.updateByPrimaryKeySelective(geometriaUsuario);
		} else {
			rs	= geometriaUsuarioMapper.insertSelective(geometriaUsuario);
			
			Integer srlIdGeometriaUsuario	= geometriaUsuarioMapper.lastSequence();
			geometriaUsuarioDto.setSrlIdGeometriaUsuario(srlIdGeometriaUsuario);

		}
		return rs;
	}

	public void insert(GeometriaUsuarioDto geometriaUsuarioDto) throws Exception {
		GeometriaUsuario geometriaUsuario		= new GeometriaUsuario();
		BeanUtils.copyProperties(geometriaUsuarioDto, geometriaUsuario);
		geometriaUsuarioMapper.insertSelective(geometriaUsuario);
	}
	
	@Transactional
	public Integer eliminar(GeometriaUsuarioDto geometriaUsuarioDto) throws Exception {
		GeometriaUsuario geometriaUsuario		= new GeometriaUsuario();
		BeanUtils.copyProperties(geometriaUsuarioDto, geometriaUsuario);
		Integer rs	= geometriaUsuarioMapper.deleteByPrimaryKey(geometriaUsuario);
		return rs;
	}
	
}
