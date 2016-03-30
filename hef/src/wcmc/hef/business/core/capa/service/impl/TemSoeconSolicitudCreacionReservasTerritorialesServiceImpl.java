package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemSoeconSolicitudCreacionReservasTerritorialesDto;
import wcmc.hef.business.core.capa.service.TemSoeconSolicitudCreacionReservasTerritorialesService;
import wcmc.hef.dao.capa.domain.TemSoeconSolicitudCreacionReservasTerritoriales;
import wcmc.hef.dao.capa.domain.TemSoeconSolicitudCreacionReservasTerritorialesParamDef;
import wcmc.hef.dao.capa.domain.TemSoeconSolicitudCreacionReservasTerritorialesParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemSoeconSolicitudCreacionReservasTerritorialesMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemSoeconSolicitudCreacionReservasTerritorialesServiceImpl implements TemSoeconSolicitudCreacionReservasTerritorialesService {
	@Autowired
	private TemSoeconSolicitudCreacionReservasTerritorialesMapper temSoeconSolicitudCreacionReservasTerritorialesMapper;
	public List<TemSoeconSolicitudCreacionReservasTerritoriales> buscar(TemSoeconSolicitudCreacionReservasTerritorialesDto temSoeconSolicitudCreacionReservasTerritorialesDto) throws Exception {
		TemSoeconSolicitudCreacionReservasTerritorialesParamDef temSoeconSolicitudCreacionReservasTerritorialesParamDef		= new TemSoeconSolicitudCreacionReservasTerritorialesParamDef();
		
		Criteria criteria		= temSoeconSolicitudCreacionReservasTerritorialesParamDef.createCriteria();
		if(temSoeconSolicitudCreacionReservasTerritorialesDto != null) {
			if(CadenaUtil.getStrNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrNomret()) != null) {
				criteria.andStrNomretEqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrNomret());
			}
			if(CadenaUtil.getStrNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrCatego()) != null) {
				criteria.andStrCategoEqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrCatego());
			}
			if(CadenaUtil.getStrNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrUbipol()) != null) {
				criteria.andStrUbipolEqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrUbipol());
			}
			if(CadenaUtil.getDoubNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getDblAreleg()) != null) {
				criteria.andDblArelegEqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getDblAreleg());
			}
			if(CadenaUtil.getStrNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrEstado()) != null) {
				criteria.andStrEstadoEqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrEstado());
			}
			temSoeconSolicitudCreacionReservasTerritorialesParamDef.setStrHashConsulta(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrHashConsulta());
		}
		
		temSoeconSolicitudCreacionReservasTerritorialesParamDef.setOrderByClause("de_nomret");
		List<TemSoeconSolicitudCreacionReservasTerritoriales>	 list	= temSoeconSolicitudCreacionReservasTerritorialesMapper.selectByDefaultParameter(temSoeconSolicitudCreacionReservasTerritorialesParamDef);
		return list;
	}
	
	public List<TemSoeconSolicitudCreacionReservasTerritoriales> buscarGeometry(TemSoeconSolicitudCreacionReservasTerritorialesDto temSoeconSolicitudCreacionReservasTerritorialesDto) throws Exception {
		TemSoeconSolicitudCreacionReservasTerritorialesParamDef temSoeconSolicitudCreacionReservasTerritorialesParamDef		= new TemSoeconSolicitudCreacionReservasTerritorialesParamDef();
		
		Criteria criteria		= temSoeconSolicitudCreacionReservasTerritorialesParamDef.createCriteria();
		if(temSoeconSolicitudCreacionReservasTerritorialesDto != null) {
			if(CadenaUtil.getStrNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrNomret()) != null) {
				criteria.andStrNomretEqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrNomret());
			}
			if(CadenaUtil.getStrNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrCatego()) != null) {
				criteria.andStrCategoEqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrCatego());
			}
			if(CadenaUtil.getStrNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrUbipol()) != null) {
				criteria.andStrUbipolEqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrUbipol());
			}
			if(CadenaUtil.getDoubNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getDblAreleg()) != null) {
				criteria.andDblArelegEqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getDblAreleg());
			}
			if(CadenaUtil.getStrNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrEstado()) != null) {
				criteria.andStrEstadoEqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrEstado());
			}
		}
		
		temSoeconSolicitudCreacionReservasTerritorialesParamDef.setOrderByClause("de_nomret");
		List<TemSoeconSolicitudCreacionReservasTerritoriales>	 list	= temSoeconSolicitudCreacionReservasTerritorialesMapper.selectByDefaultParameterGeometry(temSoeconSolicitudCreacionReservasTerritorialesParamDef);
		return list;
	}
	
	public List<TemSoeconSolicitudCreacionReservasTerritoriales> buscarCombo(TemSoeconSolicitudCreacionReservasTerritorialesDto temSoeconSolicitudCreacionReservasTerritorialesDto) throws Exception {
		TemSoeconSolicitudCreacionReservasTerritorialesParamDef temSoeconSolicitudCreacionReservasTerritorialesParamDef		= new TemSoeconSolicitudCreacionReservasTerritorialesParamDef();
		
		Criteria criteria		= temSoeconSolicitudCreacionReservasTerritorialesParamDef.createCriteria();
		if(temSoeconSolicitudCreacionReservasTerritorialesDto != null) {
			if(CadenaUtil.getStrNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrNomret()) != null) {
				criteria.andStrNomretEqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrNomret());
			}
			if(CadenaUtil.getStrNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrCatego()) != null) {
				criteria.andStrCategoEqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrCatego());
			}
			if(CadenaUtil.getStrNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrUbipol()) != null) {
				criteria.andStrUbipolEqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrUbipol());
			}
			if(CadenaUtil.getDoubNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getDblAreleg()) != null) {
				criteria.andDblArelegEqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getDblAreleg());
			}
			if(CadenaUtil.getStrNull(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrEstado()) != null) {
				criteria.andStrEstadoEqualTo(temSoeconSolicitudCreacionReservasTerritorialesDto.getStrEstado());
			}
		}
		
		temSoeconSolicitudCreacionReservasTerritorialesParamDef.setOrderByClause("de_nomret");
		List<TemSoeconSolicitudCreacionReservasTerritoriales>	 list	= temSoeconSolicitudCreacionReservasTerritorialesMapper.selectByDefaultParameterCombo(temSoeconSolicitudCreacionReservasTerritorialesParamDef);
		return list;
	}
	
	public TemSoeconSolicitudCreacionReservasTerritoriales buscarById(TemSoeconSolicitudCreacionReservasTerritorialesDto temSoeconSolicitudCreacionReservasTerritorialesDto) throws Exception {
		TemSoeconSolicitudCreacionReservasTerritoriales temSoeconSolicitudCreacionReservasTerritoriales		= new TemSoeconSolicitudCreacionReservasTerritoriales();
		BeanUtils.copyProperties(temSoeconSolicitudCreacionReservasTerritorialesDto, temSoeconSolicitudCreacionReservasTerritoriales);
		return temSoeconSolicitudCreacionReservasTerritorialesMapper.selectByPrimaryKey(temSoeconSolicitudCreacionReservasTerritoriales);
	}
	
	public TemSoeconSolicitudCreacionReservasTerritoriales buscarGeometryById(TemSoeconSolicitudCreacionReservasTerritorialesDto temSoeconSolicitudCreacionReservasTerritorialesDto) throws Exception {
		TemSoeconSolicitudCreacionReservasTerritoriales temSoeconSolicitudCreacionReservasTerritoriales		= new TemSoeconSolicitudCreacionReservasTerritoriales();
		BeanUtils.copyProperties(temSoeconSolicitudCreacionReservasTerritorialesDto, temSoeconSolicitudCreacionReservasTerritoriales);
		return temSoeconSolicitudCreacionReservasTerritorialesMapper.selectByPrimaryKeyGeometry(temSoeconSolicitudCreacionReservasTerritoriales);
	}
	
	@Transactional
	public Integer guardar(TemSoeconSolicitudCreacionReservasTerritorialesDto temSoeconSolicitudCreacionReservasTerritorialesDto) throws Exception {
		TemSoeconSolicitudCreacionReservasTerritoriales temSoeconSolicitudCreacionReservasTerritoriales		= new TemSoeconSolicitudCreacionReservasTerritoriales();
		BeanUtils.copyProperties(temSoeconSolicitudCreacionReservasTerritorialesDto, temSoeconSolicitudCreacionReservasTerritoriales);
		int rs	= 0;
		TemSoeconSolicitudCreacionReservasTerritoriales exiteTemSoeconSolicitudCreacionReservasTerritoriales		= temSoeconSolicitudCreacionReservasTerritorialesMapper.selectByPrimaryKey(temSoeconSolicitudCreacionReservasTerritoriales);
		if(exiteTemSoeconSolicitudCreacionReservasTerritoriales != null) {
			rs	= temSoeconSolicitudCreacionReservasTerritorialesMapper.updateByPrimaryKeySelective(temSoeconSolicitudCreacionReservasTerritoriales);
		} else {
			rs	= temSoeconSolicitudCreacionReservasTerritorialesMapper.insertSelective(temSoeconSolicitudCreacionReservasTerritoriales);
			
			Integer srlGid	= temSoeconSolicitudCreacionReservasTerritorialesMapper.lastSequence();
			temSoeconSolicitudCreacionReservasTerritorialesDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemSoeconSolicitudCreacionReservasTerritorialesDto temSoeconSolicitudCreacionReservasTerritorialesDto) throws Exception {
		TemSoeconSolicitudCreacionReservasTerritoriales temSoeconSolicitudCreacionReservasTerritoriales		= new TemSoeconSolicitudCreacionReservasTerritoriales();
		BeanUtils.copyProperties(temSoeconSolicitudCreacionReservasTerritorialesDto, temSoeconSolicitudCreacionReservasTerritoriales);
		Integer rs	= temSoeconSolicitudCreacionReservasTerritorialesMapper.deleteByPrimaryKey(temSoeconSolicitudCreacionReservasTerritoriales);
		return rs;
	}
	
}
