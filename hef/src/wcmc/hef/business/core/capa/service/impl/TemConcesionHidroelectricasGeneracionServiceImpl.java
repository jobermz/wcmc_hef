package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemConcesionHidroelectricasGeneracionDto;
import wcmc.hef.business.core.capa.service.TemConcesionHidroelectricasGeneracionService;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasGeneracion;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasGeneracionParamDef;
import wcmc.hef.dao.capa.domain.TemConcesionHidroelectricasGeneracionParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemConcesionHidroelectricasGeneracionMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemConcesionHidroelectricasGeneracionServiceImpl implements TemConcesionHidroelectricasGeneracionService {
	@Autowired
	private TemConcesionHidroelectricasGeneracionMapper temConcesionHidroelectricasGeneracionMapper;
	public List<TemConcesionHidroelectricasGeneracion> buscar(TemConcesionHidroelectricasGeneracionDto temConcesionHidroelectricasGeneracionDto) throws Exception {
		TemConcesionHidroelectricasGeneracionParamDef temConcesionHidroelectricasGeneracionParamDef		= new TemConcesionHidroelectricasGeneracionParamDef();
		
		Criteria criteria		= temConcesionHidroelectricasGeneracionParamDef.createCriteria();
		if(temConcesionHidroelectricasGeneracionDto != null) {
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasGeneracionDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temConcesionHidroelectricasGeneracionDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasGeneracionDto.getStrIdGrafico()) != null) {
				criteria.andStrIdGraficoLike(temConcesionHidroelectricasGeneracionDto.getStrIdGrafico());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasGeneracionDto.getStrExpediente()) != null) {
				criteria.andStrExpedienteLike(temConcesionHidroelectricasGeneracionDto.getStrExpediente());
			}
			if(CadenaUtil.getInteNull(temConcesionHidroelectricasGeneracionDto.getIntSeccion()) != null) {
				criteria.andIntSeccionEqualTo(temConcesionHidroelectricasGeneracionDto.getIntSeccion());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasGeneracionDto.getStrConcesion()) != null) {
				criteria.andStrConcesionLike(temConcesionHidroelectricasGeneracionDto.getStrConcesion());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasGeneracionDto.getStrEmpresa()) != null) {
				criteria.andStrEmpresaLike(temConcesionHidroelectricasGeneracionDto.getStrEmpresa());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasGeneracionDto.getStrRuc()) != null) {
				criteria.andStrRucLike(temConcesionHidroelectricasGeneracionDto.getStrRuc());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasGeneracionDto.getStrFuente()) != null) {
				criteria.andStrFuenteLike(temConcesionHidroelectricasGeneracionDto.getStrFuente());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasGeneracionDto.getStrSituacion()) != null) {
				criteria.andStrSituacionLike(temConcesionHidroelectricasGeneracionDto.getStrSituacion());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasGeneracionDto.getStrTipoConce()) != null) {
				criteria.andStrTipoConceLike(temConcesionHidroelectricasGeneracionDto.getStrTipoConce());
			}
			if(temConcesionHidroelectricasGeneracionDto.getDteFechaPres() != null) {
				criteria.andDteFechaPresEqualTo(temConcesionHidroelectricasGeneracionDto.getDteFechaPres());
			}
			if(temConcesionHidroelectricasGeneracionDto.getDteFechaReso() != null) {
				criteria.andDteFechaResoEqualTo(temConcesionHidroelectricasGeneracionDto.getDteFechaReso());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasGeneracionDto.getStrActivo()) != null) {
				criteria.andStrActivoLike(temConcesionHidroelectricasGeneracionDto.getStrActivo());
			}
			if(CadenaUtil.getDoubNull(temConcesionHidroelectricasGeneracionDto.getDblAreaGrafi()) != null) {
				criteria.andDblAreaGrafiEqualTo(temConcesionHidroelectricasGeneracionDto.getDblAreaGrafi());
			}
			if(CadenaUtil.getStrNull(temConcesionHidroelectricasGeneracionDto.getStrCodigoCon()) != null) {
				criteria.andStrCodigoConLike(temConcesionHidroelectricasGeneracionDto.getStrCodigoCon());
			}
			if(CadenaUtil.getDoubNull(temConcesionHidroelectricasGeneracionDto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temConcesionHidroelectricasGeneracionDto.getDblShapeArea());
			}
			if(CadenaUtil.getDoubNull(temConcesionHidroelectricasGeneracionDto.getDblShapeLen()) != null) {
				criteria.andDblShapeLenEqualTo(temConcesionHidroelectricasGeneracionDto.getDblShapeLen());
			}
		}
		
		List<TemConcesionHidroelectricasGeneracion>	 list	= temConcesionHidroelectricasGeneracionMapper.selectByDefaultParameter(temConcesionHidroelectricasGeneracionParamDef);
		return list;
	}
	
	public TemConcesionHidroelectricasGeneracion buscarById(TemConcesionHidroelectricasGeneracionDto temConcesionHidroelectricasGeneracionDto) throws Exception {
		TemConcesionHidroelectricasGeneracion temConcesionHidroelectricasGeneracion		= new TemConcesionHidroelectricasGeneracion();
		BeanUtils.copyProperties(temConcesionHidroelectricasGeneracionDto, temConcesionHidroelectricasGeneracion);
		return temConcesionHidroelectricasGeneracionMapper.selectByPrimaryKey(temConcesionHidroelectricasGeneracion);
	}
	
	@Transactional
	public Integer guardar(TemConcesionHidroelectricasGeneracionDto temConcesionHidroelectricasGeneracionDto) throws Exception {
		TemConcesionHidroelectricasGeneracion temConcesionHidroelectricasGeneracion		= new TemConcesionHidroelectricasGeneracion();
		BeanUtils.copyProperties(temConcesionHidroelectricasGeneracionDto, temConcesionHidroelectricasGeneracion);
		int rs	= 0;
		TemConcesionHidroelectricasGeneracion exiteTemConcesionHidroelectricasGeneracion		= temConcesionHidroelectricasGeneracionMapper.selectByPrimaryKey(temConcesionHidroelectricasGeneracion);
		if(exiteTemConcesionHidroelectricasGeneracion != null) {
			rs	= temConcesionHidroelectricasGeneracionMapper.updateByPrimaryKeySelective(temConcesionHidroelectricasGeneracion);
		} else {
			rs	= temConcesionHidroelectricasGeneracionMapper.insertSelective(temConcesionHidroelectricasGeneracion);
			
			Integer srlGid	= temConcesionHidroelectricasGeneracionMapper.lastSequence();
			temConcesionHidroelectricasGeneracionDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemConcesionHidroelectricasGeneracionDto temConcesionHidroelectricasGeneracionDto) throws Exception {
		TemConcesionHidroelectricasGeneracion temConcesionHidroelectricasGeneracion		= new TemConcesionHidroelectricasGeneracion();
		BeanUtils.copyProperties(temConcesionHidroelectricasGeneracionDto, temConcesionHidroelectricasGeneracion);
		Integer rs	= temConcesionHidroelectricasGeneracionMapper.deleteByPrimaryKey(temConcesionHidroelectricasGeneracion);
		return rs;
	}
	
}
