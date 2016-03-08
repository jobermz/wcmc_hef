package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemComunidadesNativasDto;
import wcmc.hef.business.core.capa.service.TemComunidadesNativasService;
import wcmc.hef.dao.capa.domain.TemComunidadesNativas;
import wcmc.hef.dao.capa.domain.TemComunidadesNativasParamDef;
import wcmc.hef.dao.capa.domain.TemComunidadesNativasParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemComunidadesNativasMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemComunidadesNativasServiceImpl implements TemComunidadesNativasService {
	@Autowired
	private TemComunidadesNativasMapper temComunidadesNativasMapper;
	public List<TemComunidadesNativas> buscar(TemComunidadesNativasDto temComunidadesNativasDto) throws Exception {
		TemComunidadesNativasParamDef temComunidadesNativasParamDef		= new TemComunidadesNativasParamDef();
		
		Criteria criteria		= temComunidadesNativasParamDef.createCriteria();
		if(temComunidadesNativasDto != null) {
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temComunidadesNativasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temComunidadesNativasDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(temComunidadesNativasDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdLike(temComunidadesNativasDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(temComunidadesNativasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temComunidadesNativasDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrCodigo()) != null) {
				criteria.andStrCodigoLike(temComunidadesNativasDto.getStrCodigo());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrCodBib()) != null) {
				criteria.andStrCodBibLike(temComunidadesNativasDto.getStrCodBib());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrGeorefer()) != null) {
				criteria.andStrGeoreferLike(temComunidadesNativasDto.getStrGeorefer());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrSituacion()) != null) {
				criteria.andStrSituacionLike(temComunidadesNativasDto.getStrSituacion());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrSector()) != null) {
				criteria.andStrSectorLike(temComunidadesNativasDto.getStrSector());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrZona()) != null) {
				criteria.andStrZonaLike(temComunidadesNativasDto.getStrZona());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrSubzona()) != null) {
				criteria.andStrSubzonaLike(temComunidadesNativasDto.getStrSubzona());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(temComunidadesNativasDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrFederacion()) != null) {
				criteria.andStrFederacionLike(temComunidadesNativasDto.getStrFederacion());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrFamLingui()) != null) {
				criteria.andStrFamLinguiLike(temComunidadesNativasDto.getStrFamLingui());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrEtnia1()) != null) {
				criteria.andStrEtnia1Like(temComunidadesNativasDto.getStrEtnia1());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrEtnia2()) != null) {
				criteria.andStrEtnia2Like(temComunidadesNativasDto.getStrEtnia2());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblPoblacion()) != null) {
				criteria.andDblPoblacionEqualTo(temComunidadesNativasDto.getDblPoblacion());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblFamilias()) != null) {
				criteria.andDblFamiliasEqualTo(temComunidadesNativasDto.getDblFamilias());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblEscolares()) != null) {
				criteria.andDblEscolaresEqualTo(temComunidadesNativasDto.getDblEscolares());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrRio()) != null) {
				criteria.andStrRioLike(temComunidadesNativasDto.getStrRio());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrPuebCerc()) != null) {
				criteria.andStrPuebCercLike(temComunidadesNativasDto.getStrPuebCerc());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrDpto()) != null) {
				criteria.andStrDptoLike(temComunidadesNativasDto.getStrDpto());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrProvincia()) != null) {
				criteria.andStrProvinciaLike(temComunidadesNativasDto.getStrProvincia());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrDistrito()) != null) {
				criteria.andStrDistritoLike(temComunidadesNativasDto.getStrDistrito());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrLongitud()) != null) {
				criteria.andStrLongitudLike(temComunidadesNativasDto.getStrLongitud());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrLatitud()) != null) {
				criteria.andStrLatitudLike(temComunidadesNativasDto.getStrLatitud());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrResolIn()) != null) {
				criteria.andStrResolInLike(temComunidadesNativasDto.getStrResolIn());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrAnoinscrip()) != null) {
				criteria.andStrAnoinscripLike(temComunidadesNativasDto.getStrAnoinscrip());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrTitulo()) != null) {
				criteria.andStrTituloLike(temComunidadesNativasDto.getStrTitulo());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrResolTit()) != null) {
				criteria.andStrResolTitLike(temComunidadesNativasDto.getStrResolTit());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrAnotitulo()) != null) {
				criteria.andStrAnotituloLike(temComunidadesNativasDto.getStrAnotitulo());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblAreaTotal()) != null) {
				criteria.andDblAreaTotalEqualTo(temComunidadesNativasDto.getDblAreaTotal());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblAreaTitul()) != null) {
				criteria.andDblAreaTitulEqualTo(temComunidadesNativasDto.getDblAreaTitul());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblAreaUso()) != null) {
				criteria.andDblAreaUsoEqualTo(temComunidadesNativasDto.getDblAreaUso());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblAreaFisc()) != null) {
				criteria.andDblAreaFiscEqualTo(temComunidadesNativasDto.getDblAreaFisc());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblAreaProte()) != null) {
				criteria.andDblAreaProteEqualTo(temComunidadesNativasDto.getDblAreaProte());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblAreaReser()) != null) {
				criteria.andDblAreaReserEqualTo(temComunidadesNativasDto.getDblAreaReser());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblAreaDemar()) != null) {
				criteria.andDblAreaDemarEqualTo(temComunidadesNativasDto.getDblAreaDemar());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temComunidadesNativasDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblPerimTitu()) != null) {
				criteria.andDblPerimTituEqualTo(temComunidadesNativasDto.getDblPerimTitu());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrResolAm1()) != null) {
				criteria.andStrResolAm1Like(temComunidadesNativasDto.getStrResolAm1());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrTituloAm1()) != null) {
				criteria.andStrTituloAm1Like(temComunidadesNativasDto.getStrTituloAm1());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblArTotAm1()) != null) {
				criteria.andDblArTotAm1EqualTo(temComunidadesNativasDto.getDblArTotAm1());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblArSigAm1()) != null) {
				criteria.andDblArSigAm1EqualTo(temComunidadesNativasDto.getDblArSigAm1());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblPerimAm1()) != null) {
				criteria.andDblPerimAm1EqualTo(temComunidadesNativasDto.getDblPerimAm1());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrResolAm2()) != null) {
				criteria.andStrResolAm2Like(temComunidadesNativasDto.getStrResolAm2());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrTituloAm2()) != null) {
				criteria.andStrTituloAm2Like(temComunidadesNativasDto.getStrTituloAm2());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblArTotAm2()) != null) {
				criteria.andDblArTotAm2EqualTo(temComunidadesNativasDto.getDblArTotAm2());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblArSigAm2()) != null) {
				criteria.andDblArSigAm2EqualTo(temComunidadesNativasDto.getDblArSigAm2());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblPerimAm2()) != null) {
				criteria.andDblPerimAm2EqualTo(temComunidadesNativasDto.getDblPerimAm2());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrPrimaria()) != null) {
				criteria.andStrPrimariaLike(temComunidadesNativasDto.getStrPrimaria());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrBilingue()) != null) {
				criteria.andStrBilingueLike(temComunidadesNativasDto.getStrBilingue());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrSecundaria()) != null) {
				criteria.andStrSecundariaLike(temComunidadesNativasDto.getStrSecundaria());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrPuesSalud()) != null) {
				criteria.andStrPuesSaludLike(temComunidadesNativasDto.getStrPuesSalud());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrCentSalud()) != null) {
				criteria.andStrCentSaludLike(temComunidadesNativasDto.getStrCentSalud());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrProdVent1()) != null) {
				criteria.andStrProdVent1Like(temComunidadesNativasDto.getStrProdVent1());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrProdVent2()) != null) {
				criteria.andStrProdVent2Like(temComunidadesNativasDto.getStrProdVent2());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrProdVent3()) != null) {
				criteria.andStrProdVent3Like(temComunidadesNativasDto.getStrProdVent3());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrFuente()) != null) {
				criteria.andStrFuenteLike(temComunidadesNativasDto.getStrFuente());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrFecha()) != null) {
				criteria.andStrFechaLike(temComunidadesNativasDto.getStrFecha());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrNotas()) != null) {
				criteria.andStrNotasLike(temComunidadesNativasDto.getStrNotas());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblShapeStar()) != null) {
				criteria.andDblShapeStarEqualTo(temComunidadesNativasDto.getDblShapeStar());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(temComunidadesNativasDto.getDblShapeStle());
			}
		}
		
		List<TemComunidadesNativas>	 list	= temComunidadesNativasMapper.selectByDefaultParameter(temComunidadesNativasParamDef);
		return list;
	}
	
		public List<TemComunidadesNativas> buscarGeometry(TemComunidadesNativasDto temComunidadesNativasDto) throws Exception {
		TemComunidadesNativasParamDef temComunidadesNativasParamDef		= new TemComunidadesNativasParamDef();
		
		Criteria criteria		= temComunidadesNativasParamDef.createCriteria();
		if(temComunidadesNativasDto != null) {
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temComunidadesNativasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(temComunidadesNativasDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(temComunidadesNativasDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdLike(temComunidadesNativasDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(temComunidadesNativasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(temComunidadesNativasDto.getIntObjectid());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrCodigo()) != null) {
				criteria.andStrCodigoLike(temComunidadesNativasDto.getStrCodigo());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrCodBib()) != null) {
				criteria.andStrCodBibLike(temComunidadesNativasDto.getStrCodBib());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrGeorefer()) != null) {
				criteria.andStrGeoreferLike(temComunidadesNativasDto.getStrGeorefer());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrSituacion()) != null) {
				criteria.andStrSituacionLike(temComunidadesNativasDto.getStrSituacion());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrSector()) != null) {
				criteria.andStrSectorLike(temComunidadesNativasDto.getStrSector());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrZona()) != null) {
				criteria.andStrZonaLike(temComunidadesNativasDto.getStrZona());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrSubzona()) != null) {
				criteria.andStrSubzonaLike(temComunidadesNativasDto.getStrSubzona());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(temComunidadesNativasDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrFederacion()) != null) {
				criteria.andStrFederacionLike(temComunidadesNativasDto.getStrFederacion());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrFamLingui()) != null) {
				criteria.andStrFamLinguiLike(temComunidadesNativasDto.getStrFamLingui());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrEtnia1()) != null) {
				criteria.andStrEtnia1Like(temComunidadesNativasDto.getStrEtnia1());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrEtnia2()) != null) {
				criteria.andStrEtnia2Like(temComunidadesNativasDto.getStrEtnia2());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblPoblacion()) != null) {
				criteria.andDblPoblacionEqualTo(temComunidadesNativasDto.getDblPoblacion());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblFamilias()) != null) {
				criteria.andDblFamiliasEqualTo(temComunidadesNativasDto.getDblFamilias());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblEscolares()) != null) {
				criteria.andDblEscolaresEqualTo(temComunidadesNativasDto.getDblEscolares());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrRio()) != null) {
				criteria.andStrRioLike(temComunidadesNativasDto.getStrRio());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrPuebCerc()) != null) {
				criteria.andStrPuebCercLike(temComunidadesNativasDto.getStrPuebCerc());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrDpto()) != null) {
				criteria.andStrDptoLike(temComunidadesNativasDto.getStrDpto());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrProvincia()) != null) {
				criteria.andStrProvinciaLike(temComunidadesNativasDto.getStrProvincia());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrDistrito()) != null) {
				criteria.andStrDistritoLike(temComunidadesNativasDto.getStrDistrito());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrLongitud()) != null) {
				criteria.andStrLongitudLike(temComunidadesNativasDto.getStrLongitud());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrLatitud()) != null) {
				criteria.andStrLatitudLike(temComunidadesNativasDto.getStrLatitud());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrResolIn()) != null) {
				criteria.andStrResolInLike(temComunidadesNativasDto.getStrResolIn());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrAnoinscrip()) != null) {
				criteria.andStrAnoinscripLike(temComunidadesNativasDto.getStrAnoinscrip());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrTitulo()) != null) {
				criteria.andStrTituloLike(temComunidadesNativasDto.getStrTitulo());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrResolTit()) != null) {
				criteria.andStrResolTitLike(temComunidadesNativasDto.getStrResolTit());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrAnotitulo()) != null) {
				criteria.andStrAnotituloLike(temComunidadesNativasDto.getStrAnotitulo());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblAreaTotal()) != null) {
				criteria.andDblAreaTotalEqualTo(temComunidadesNativasDto.getDblAreaTotal());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblAreaTitul()) != null) {
				criteria.andDblAreaTitulEqualTo(temComunidadesNativasDto.getDblAreaTitul());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblAreaUso()) != null) {
				criteria.andDblAreaUsoEqualTo(temComunidadesNativasDto.getDblAreaUso());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblAreaFisc()) != null) {
				criteria.andDblAreaFiscEqualTo(temComunidadesNativasDto.getDblAreaFisc());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblAreaProte()) != null) {
				criteria.andDblAreaProteEqualTo(temComunidadesNativasDto.getDblAreaProte());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblAreaReser()) != null) {
				criteria.andDblAreaReserEqualTo(temComunidadesNativasDto.getDblAreaReser());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblAreaDemar()) != null) {
				criteria.andDblAreaDemarEqualTo(temComunidadesNativasDto.getDblAreaDemar());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblAreaSig()) != null) {
				criteria.andDblAreaSigEqualTo(temComunidadesNativasDto.getDblAreaSig());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblPerimTitu()) != null) {
				criteria.andDblPerimTituEqualTo(temComunidadesNativasDto.getDblPerimTitu());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrResolAm1()) != null) {
				criteria.andStrResolAm1Like(temComunidadesNativasDto.getStrResolAm1());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrTituloAm1()) != null) {
				criteria.andStrTituloAm1Like(temComunidadesNativasDto.getStrTituloAm1());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblArTotAm1()) != null) {
				criteria.andDblArTotAm1EqualTo(temComunidadesNativasDto.getDblArTotAm1());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblArSigAm1()) != null) {
				criteria.andDblArSigAm1EqualTo(temComunidadesNativasDto.getDblArSigAm1());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblPerimAm1()) != null) {
				criteria.andDblPerimAm1EqualTo(temComunidadesNativasDto.getDblPerimAm1());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrResolAm2()) != null) {
				criteria.andStrResolAm2Like(temComunidadesNativasDto.getStrResolAm2());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrTituloAm2()) != null) {
				criteria.andStrTituloAm2Like(temComunidadesNativasDto.getStrTituloAm2());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblArTotAm2()) != null) {
				criteria.andDblArTotAm2EqualTo(temComunidadesNativasDto.getDblArTotAm2());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblArSigAm2()) != null) {
				criteria.andDblArSigAm2EqualTo(temComunidadesNativasDto.getDblArSigAm2());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblPerimAm2()) != null) {
				criteria.andDblPerimAm2EqualTo(temComunidadesNativasDto.getDblPerimAm2());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrPrimaria()) != null) {
				criteria.andStrPrimariaLike(temComunidadesNativasDto.getStrPrimaria());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrBilingue()) != null) {
				criteria.andStrBilingueLike(temComunidadesNativasDto.getStrBilingue());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrSecundaria()) != null) {
				criteria.andStrSecundariaLike(temComunidadesNativasDto.getStrSecundaria());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrPuesSalud()) != null) {
				criteria.andStrPuesSaludLike(temComunidadesNativasDto.getStrPuesSalud());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrCentSalud()) != null) {
				criteria.andStrCentSaludLike(temComunidadesNativasDto.getStrCentSalud());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrProdVent1()) != null) {
				criteria.andStrProdVent1Like(temComunidadesNativasDto.getStrProdVent1());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrProdVent2()) != null) {
				criteria.andStrProdVent2Like(temComunidadesNativasDto.getStrProdVent2());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrProdVent3()) != null) {
				criteria.andStrProdVent3Like(temComunidadesNativasDto.getStrProdVent3());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrFuente()) != null) {
				criteria.andStrFuenteLike(temComunidadesNativasDto.getStrFuente());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrFecha()) != null) {
				criteria.andStrFechaLike(temComunidadesNativasDto.getStrFecha());
			}
			if(CadenaUtil.getStrNull(temComunidadesNativasDto.getStrNotas()) != null) {
				criteria.andStrNotasLike(temComunidadesNativasDto.getStrNotas());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblShapeStar()) != null) {
				criteria.andDblShapeStarEqualTo(temComunidadesNativasDto.getDblShapeStar());
			}
			if(CadenaUtil.getDoubNull(temComunidadesNativasDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(temComunidadesNativasDto.getDblShapeStle());
			}
		}
		
		List<TemComunidadesNativas>	 list	= temComunidadesNativasMapper.selectByDefaultParameterGeometry(temComunidadesNativasParamDef);
		return list;
	}
	
	public TemComunidadesNativas buscarById(TemComunidadesNativasDto temComunidadesNativasDto) throws Exception {
		TemComunidadesNativas temComunidadesNativas		= new TemComunidadesNativas();
		BeanUtils.copyProperties(temComunidadesNativasDto, temComunidadesNativas);
		return temComunidadesNativasMapper.selectByPrimaryKey(temComunidadesNativas);
	}
	
	@Transactional
	public Integer guardar(TemComunidadesNativasDto temComunidadesNativasDto) throws Exception {
		TemComunidadesNativas temComunidadesNativas		= new TemComunidadesNativas();
		BeanUtils.copyProperties(temComunidadesNativasDto, temComunidadesNativas);
		int rs	= 0;
		TemComunidadesNativas exiteTemComunidadesNativas		= temComunidadesNativasMapper.selectByPrimaryKey(temComunidadesNativas);
		if(exiteTemComunidadesNativas != null) {
			rs	= temComunidadesNativasMapper.updateByPrimaryKeySelective(temComunidadesNativas);
		} else {
			rs	= temComunidadesNativasMapper.insertSelective(temComunidadesNativas);
			
			Integer srlGid	= temComunidadesNativasMapper.lastSequence();
			temComunidadesNativasDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemComunidadesNativasDto temComunidadesNativasDto) throws Exception {
		TemComunidadesNativas temComunidadesNativas		= new TemComunidadesNativas();
		BeanUtils.copyProperties(temComunidadesNativasDto, temComunidadesNativas);
		Integer rs	= temComunidadesNativasMapper.deleteByPrimaryKey(temComunidadesNativas);
		return rs;
	}
	
}
