package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemSoeconConcesionesElectricasGeneracionDto;
import wcmc.hef.business.core.capa.service.TemSoeconConcesionesElectricasGeneracionService;
import wcmc.hef.dao.capa.domain.TemSoeconConcesionesElectricasGeneracion;
import wcmc.hef.dao.capa.domain.TemSoeconConcesionesElectricasGeneracionParamDef;
import wcmc.hef.dao.capa.domain.TemSoeconConcesionesElectricasGeneracionParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemSoeconConcesionesElectricasGeneracionMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemSoeconConcesionesElectricasGeneracionServiceImpl implements TemSoeconConcesionesElectricasGeneracionService {
	@Autowired
	private TemSoeconConcesionesElectricasGeneracionMapper temSoeconConcesionesElectricasGeneracionMapper;
	public List<TemSoeconConcesionesElectricasGeneracion> buscar(TemSoeconConcesionesElectricasGeneracionDto temSoeconConcesionesElectricasGeneracionDto) throws Exception {
		TemSoeconConcesionesElectricasGeneracionParamDef temSoeconConcesionesElectricasGeneracionParamDef		= new TemSoeconConcesionesElectricasGeneracionParamDef();
		
		Criteria criteria		= temSoeconConcesionesElectricasGeneracionParamDef.createCriteria();
		if(temSoeconConcesionesElectricasGeneracionDto != null) {
			if(CadenaUtil.getStrNull(temSoeconConcesionesElectricasGeneracionDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(temSoeconConcesionesElectricasGeneracionDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temSoeconConcesionesElectricasGeneracionDto.getStrIdGrafico()) != null) {
				criteria.andStrIdGraficoLike(temSoeconConcesionesElectricasGeneracionDto.getStrIdGrafico());
			}
			if(CadenaUtil.getStrNull(temSoeconConcesionesElectricasGeneracionDto.getStrExpediente()) != null) {
				criteria.andStrExpedienteLike(temSoeconConcesionesElectricasGeneracionDto.getStrExpediente());
			}
			if(CadenaUtil.getInteNull(temSoeconConcesionesElectricasGeneracionDto.getIntSeccion()) != null) {
				criteria.andIntSeccionEqualTo(temSoeconConcesionesElectricasGeneracionDto.getIntSeccion());
			}
			if(CadenaUtil.getStrNull(temSoeconConcesionesElectricasGeneracionDto.getStrConcesion()) != null) {
				criteria.andStrConcesionLike(temSoeconConcesionesElectricasGeneracionDto.getStrConcesion());
			}
			if(CadenaUtil.getStrNull(temSoeconConcesionesElectricasGeneracionDto.getStrEmpresa()) != null) {
				criteria.andStrEmpresaLike(temSoeconConcesionesElectricasGeneracionDto.getStrEmpresa());
			}
			if(CadenaUtil.getStrNull(temSoeconConcesionesElectricasGeneracionDto.getStrRuc()) != null) {
				criteria.andStrRucLike(temSoeconConcesionesElectricasGeneracionDto.getStrRuc());
			}
			if(CadenaUtil.getStrNull(temSoeconConcesionesElectricasGeneracionDto.getStrFuente()) != null) {
				criteria.andStrFuenteLike(temSoeconConcesionesElectricasGeneracionDto.getStrFuente());
			}
			if(CadenaUtil.getStrNull(temSoeconConcesionesElectricasGeneracionDto.getStrSituacion()) != null) {
				criteria.andStrSituacionLike(temSoeconConcesionesElectricasGeneracionDto.getStrSituacion());
			}
			if(CadenaUtil.getStrNull(temSoeconConcesionesElectricasGeneracionDto.getStrTipoConce()) != null) {
				criteria.andStrTipoConceLike(temSoeconConcesionesElectricasGeneracionDto.getStrTipoConce());
			}
			if(temSoeconConcesionesElectricasGeneracionDto.getDteFechaPres() != null) {
				criteria.andDteFechaPresEqualTo(temSoeconConcesionesElectricasGeneracionDto.getDteFechaPres());
			}
			if(temSoeconConcesionesElectricasGeneracionDto.getDteFechaReso() != null) {
				criteria.andDteFechaResoEqualTo(temSoeconConcesionesElectricasGeneracionDto.getDteFechaReso());
			}
			if(CadenaUtil.getStrNull(temSoeconConcesionesElectricasGeneracionDto.getStrActivo()) != null) {
				criteria.andStrActivoLike(temSoeconConcesionesElectricasGeneracionDto.getStrActivo());
			}
			if(CadenaUtil.getDoubNull(temSoeconConcesionesElectricasGeneracionDto.getDblAreaGrafi()) != null) {
				criteria.andDblAreaGrafiEqualTo(temSoeconConcesionesElectricasGeneracionDto.getDblAreaGrafi());
			}
			if(CadenaUtil.getStrNull(temSoeconConcesionesElectricasGeneracionDto.getStrCodigoCon()) != null) {
				criteria.andStrCodigoConLike(temSoeconConcesionesElectricasGeneracionDto.getStrCodigoCon());
			}
			if(CadenaUtil.getDoubNull(temSoeconConcesionesElectricasGeneracionDto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temSoeconConcesionesElectricasGeneracionDto.getDblShapeArea());
			}
			if(CadenaUtil.getDoubNull(temSoeconConcesionesElectricasGeneracionDto.getDblShapeLen()) != null) {
				criteria.andDblShapeLenEqualTo(temSoeconConcesionesElectricasGeneracionDto.getDblShapeLen());
			}
		}
		
		List<TemSoeconConcesionesElectricasGeneracion>	 list	= temSoeconConcesionesElectricasGeneracionMapper.selectByDefaultParameter(temSoeconConcesionesElectricasGeneracionParamDef);
		return list;
	}
	
	public TemSoeconConcesionesElectricasGeneracion buscarById(TemSoeconConcesionesElectricasGeneracionDto temSoeconConcesionesElectricasGeneracionDto) throws Exception {
		TemSoeconConcesionesElectricasGeneracion temSoeconConcesionesElectricasGeneracion		= new TemSoeconConcesionesElectricasGeneracion();
		BeanUtils.copyProperties(temSoeconConcesionesElectricasGeneracionDto, temSoeconConcesionesElectricasGeneracion);
		return temSoeconConcesionesElectricasGeneracionMapper.selectByPrimaryKey(temSoeconConcesionesElectricasGeneracion);
	}
	
	@Transactional
	public Integer guardar(TemSoeconConcesionesElectricasGeneracionDto temSoeconConcesionesElectricasGeneracionDto) throws Exception {
		TemSoeconConcesionesElectricasGeneracion temSoeconConcesionesElectricasGeneracion		= new TemSoeconConcesionesElectricasGeneracion();
		BeanUtils.copyProperties(temSoeconConcesionesElectricasGeneracionDto, temSoeconConcesionesElectricasGeneracion);
		int rs	= 0;
		TemSoeconConcesionesElectricasGeneracion exiteTemSoeconConcesionesElectricasGeneracion		= temSoeconConcesionesElectricasGeneracionMapper.selectByPrimaryKey(temSoeconConcesionesElectricasGeneracion);
		if(exiteTemSoeconConcesionesElectricasGeneracion != null) {
			rs	= temSoeconConcesionesElectricasGeneracionMapper.updateByPrimaryKeySelective(temSoeconConcesionesElectricasGeneracion);
		} else {
			rs	= temSoeconConcesionesElectricasGeneracionMapper.insertSelective(temSoeconConcesionesElectricasGeneracion);
			
			Integer srlGid	= temSoeconConcesionesElectricasGeneracionMapper.lastSequence();
			temSoeconConcesionesElectricasGeneracionDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemSoeconConcesionesElectricasGeneracionDto temSoeconConcesionesElectricasGeneracionDto) throws Exception {
		TemSoeconConcesionesElectricasGeneracion temSoeconConcesionesElectricasGeneracion		= new TemSoeconConcesionesElectricasGeneracion();
		BeanUtils.copyProperties(temSoeconConcesionesElectricasGeneracionDto, temSoeconConcesionesElectricasGeneracion);
		Integer rs	= temSoeconConcesionesElectricasGeneracionMapper.deleteByPrimaryKey(temSoeconConcesionesElectricasGeneracion);
		return rs;
	}
	
}
