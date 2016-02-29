package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.ComunidadesNativasDto;
import wcmc.hef.business.core.capa.service.ComunidadesNativasService;
import wcmc.hef.dao.capa.domain.ComunidadesNativas;
import wcmc.hef.dao.capa.domain.ComunidadesNativasParamDef;
import wcmc.hef.dao.capa.domain.ComunidadesNativasParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.ComunidadesNativasMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class ComunidadesNativasServiceImpl implements ComunidadesNativasService {
	@Autowired
	private ComunidadesNativasMapper comunidadesNativasMapper;
	public List<ComunidadesNativas> buscar(ComunidadesNativasDto comunidadesNativasDto) throws Exception {
		ComunidadesNativasParamDef comunidadesNativasParamDef		= new ComunidadesNativasParamDef();
		
		Criteria criteria		= comunidadesNativasParamDef.createCriteria();
		if(comunidadesNativasDto != null) {
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(comunidadesNativasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(comunidadesNativasDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(comunidadesNativasDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdLike(comunidadesNativasDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(comunidadesNativasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(comunidadesNativasDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrCodigo()) != null) {
				criteria.andStrCodigoLike(comunidadesNativasDto.getStrCodigo());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrCodBib()) != null) {
				criteria.andStrCodBibLike(comunidadesNativasDto.getStrCodBib());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrGeorefer()) != null) {
				criteria.andStrGeoreferLike(comunidadesNativasDto.getStrGeorefer());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrSituacion()) != null) {
				criteria.andStrSituacionLike(comunidadesNativasDto.getStrSituacion());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrSector()) != null) {
				criteria.andStrSectorLike(comunidadesNativasDto.getStrSector());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrZona()) != null) {
				criteria.andStrZonaLike(comunidadesNativasDto.getStrZona());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrSubzona()) != null) {
				criteria.andStrSubzonaLike(comunidadesNativasDto.getStrSubzona());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(comunidadesNativasDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrFederacion()) != null) {
				criteria.andStrFederacionLike(comunidadesNativasDto.getStrFederacion());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrFamLingui()) != null) {
				criteria.andStrFamLinguiLike(comunidadesNativasDto.getStrFamLingui());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrEtnia1()) != null) {
				criteria.andStrEtnia1Like(comunidadesNativasDto.getStrEtnia1());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrEtnia2()) != null) {
				criteria.andStrEtnia2Like(comunidadesNativasDto.getStrEtnia2());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblPoblacion()) != null) {
				criteria.andDblPoblacionEqualTo(comunidadesNativasDto.getDblPoblacion());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblFamilias()) != null) {
				criteria.andDblFamiliasEqualTo(comunidadesNativasDto.getDblFamilias());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblEscolares()) != null) {
				criteria.andDblEscolaresEqualTo(comunidadesNativasDto.getDblEscolares());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrRio()) != null) {
				criteria.andStrRioLike(comunidadesNativasDto.getStrRio());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrPuebCerc()) != null) {
				criteria.andStrPuebCercLike(comunidadesNativasDto.getStrPuebCerc());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrDpto()) != null) {
				criteria.andStrDptoLike(comunidadesNativasDto.getStrDpto());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrProvincia()) != null) {
				criteria.andStrProvinciaLike(comunidadesNativasDto.getStrProvincia());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrDistrito()) != null) {
				criteria.andStrDistritoLike(comunidadesNativasDto.getStrDistrito());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrLongitud()) != null) {
				criteria.andStrLongitudLike(comunidadesNativasDto.getStrLongitud());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrLatitud()) != null) {
				criteria.andStrLatitudLike(comunidadesNativasDto.getStrLatitud());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrResolIn()) != null) {
				criteria.andStrResolInLike(comunidadesNativasDto.getStrResolIn());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrAnoinscrip()) != null) {
				criteria.andStrAnoinscripLike(comunidadesNativasDto.getStrAnoinscrip());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrTitulo()) != null) {
				criteria.andStrTituloLike(comunidadesNativasDto.getStrTitulo());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrResolTit()) != null) {
				criteria.andStrResolTitLike(comunidadesNativasDto.getStrResolTit());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrAnotitulo()) != null) {
				criteria.andStrAnotituloLike(comunidadesNativasDto.getStrAnotitulo());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblAreaTotal()) != null) {
				criteria.andDblAreaTotalEqualTo(comunidadesNativasDto.getDblAreaTotal());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblAreaTitul()) != null) {
				criteria.andDblAreaTitulEqualTo(comunidadesNativasDto.getDblAreaTitul());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblAreaUso()) != null) {
				criteria.andDblAreaUsoEqualTo(comunidadesNativasDto.getDblAreaUso());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblAreaFisc()) != null) {
				criteria.andDblAreaFiscEqualTo(comunidadesNativasDto.getDblAreaFisc());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblAreaProte()) != null) {
				criteria.andDblAreaProteEqualTo(comunidadesNativasDto.getDblAreaProte());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblAreaReser()) != null) {
				criteria.andDblAreaReserEqualTo(comunidadesNativasDto.getDblAreaReser());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblAreaDemar()) != null) {
				criteria.andDblAreaDemarEqualTo(comunidadesNativasDto.getDblAreaDemar());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(comunidadesNativasDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblPerimTitu()) != null) {
				criteria.andDblPerimTituEqualTo(comunidadesNativasDto.getDblPerimTitu());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrResolAm1()) != null) {
				criteria.andStrResolAm1Like(comunidadesNativasDto.getStrResolAm1());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrTituloAm1()) != null) {
				criteria.andStrTituloAm1Like(comunidadesNativasDto.getStrTituloAm1());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblArTotAm1()) != null) {
				criteria.andDblArTotAm1EqualTo(comunidadesNativasDto.getDblArTotAm1());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblArSigAm1()) != null) {
				criteria.andDblArSigAm1EqualTo(comunidadesNativasDto.getDblArSigAm1());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblPerimAm1()) != null) {
				criteria.andDblPerimAm1EqualTo(comunidadesNativasDto.getDblPerimAm1());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrResolAm2()) != null) {
				criteria.andStrResolAm2Like(comunidadesNativasDto.getStrResolAm2());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrTituloAm2()) != null) {
				criteria.andStrTituloAm2Like(comunidadesNativasDto.getStrTituloAm2());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblArTotAm2()) != null) {
				criteria.andDblArTotAm2EqualTo(comunidadesNativasDto.getDblArTotAm2());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblArSigAm2()) != null) {
				criteria.andDblArSigAm2EqualTo(comunidadesNativasDto.getDblArSigAm2());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblPerimAm2()) != null) {
				criteria.andDblPerimAm2EqualTo(comunidadesNativasDto.getDblPerimAm2());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrPrimaria()) != null) {
				criteria.andStrPrimariaLike(comunidadesNativasDto.getStrPrimaria());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrBilingue()) != null) {
				criteria.andStrBilingueLike(comunidadesNativasDto.getStrBilingue());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrSecundaria()) != null) {
				criteria.andStrSecundariaLike(comunidadesNativasDto.getStrSecundaria());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrPuesSalud()) != null) {
				criteria.andStrPuesSaludLike(comunidadesNativasDto.getStrPuesSalud());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrCentSalud()) != null) {
				criteria.andStrCentSaludLike(comunidadesNativasDto.getStrCentSalud());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrProdVent1()) != null) {
				criteria.andStrProdVent1Like(comunidadesNativasDto.getStrProdVent1());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrProdVent2()) != null) {
				criteria.andStrProdVent2Like(comunidadesNativasDto.getStrProdVent2());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrProdVent3()) != null) {
				criteria.andStrProdVent3Like(comunidadesNativasDto.getStrProdVent3());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrFuente()) != null) {
				criteria.andStrFuenteLike(comunidadesNativasDto.getStrFuente());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrFecha()) != null) {
				criteria.andStrFechaLike(comunidadesNativasDto.getStrFecha());
			}
			if(CadenaUtil.getStrNull(comunidadesNativasDto.getStrNotas()) != null) {
				criteria.andStrNotasLike(comunidadesNativasDto.getStrNotas());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblShapeStar()) != null) {
				criteria.andDblShapeStarEqualTo(comunidadesNativasDto.getDblShapeStar());
			}
			if(CadenaUtil.getDoubNull(comunidadesNativasDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(comunidadesNativasDto.getDblShapeStle());
			}
		}
		
		List<ComunidadesNativas>	 list	= comunidadesNativasMapper.selectByDefaultParameter(comunidadesNativasParamDef);
		return list;
	}
	
	public ComunidadesNativas buscarById(ComunidadesNativasDto comunidadesNativasDto) throws Exception {
		ComunidadesNativas comunidadesNativas		= new ComunidadesNativas();
		BeanUtils.copyProperties(comunidadesNativasDto, comunidadesNativas);
		return comunidadesNativasMapper.selectByPrimaryKey(comunidadesNativas);
	}
	
	@Transactional
	public Integer guardar(ComunidadesNativasDto comunidadesNativasDto) throws Exception {
		ComunidadesNativas comunidadesNativas		= new ComunidadesNativas();
		BeanUtils.copyProperties(comunidadesNativasDto, comunidadesNativas);
		int rs	= 0;
		ComunidadesNativas exiteComunidadesNativas		= comunidadesNativasMapper.selectByPrimaryKey(comunidadesNativas);
		if(exiteComunidadesNativas != null) {
			rs	= comunidadesNativasMapper.updateByPrimaryKeySelective(comunidadesNativas);
		} else {
			rs	= comunidadesNativasMapper.insertSelective(comunidadesNativas);
			
			Integer srlGid	= comunidadesNativasMapper.lastSequence();
			comunidadesNativasDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(ComunidadesNativasDto comunidadesNativasDto) throws Exception {
		ComunidadesNativas comunidadesNativas		= new ComunidadesNativas();
		BeanUtils.copyProperties(comunidadesNativasDto, comunidadesNativas);
		Integer rs	= comunidadesNativasMapper.deleteByPrimaryKey(comunidadesNativas);
		return rs;
	}
	
}
