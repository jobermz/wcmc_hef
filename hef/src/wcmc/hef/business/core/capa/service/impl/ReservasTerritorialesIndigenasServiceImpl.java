package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.ReservasTerritorialesIndigenasDto;
import wcmc.hef.business.core.capa.service.ReservasTerritorialesIndigenasService;
import wcmc.hef.dao.capa.domain.ReservasTerritorialesIndigenas;
import wcmc.hef.dao.capa.domain.ReservasTerritorialesIndigenasParamDef;
import wcmc.hef.dao.capa.domain.ReservasTerritorialesIndigenasParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.ReservasTerritorialesIndigenasMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class ReservasTerritorialesIndigenasServiceImpl implements ReservasTerritorialesIndigenasService {
	@Autowired
	private ReservasTerritorialesIndigenasMapper reservasTerritorialesIndigenasMapper;
	public List<ReservasTerritorialesIndigenas> buscar(ReservasTerritorialesIndigenasDto reservasTerritorialesIndigenasDto) throws Exception {
		ReservasTerritorialesIndigenasParamDef reservasTerritorialesIndigenasParamDef		= new ReservasTerritorialesIndigenasParamDef();
		
		Criteria criteria		= reservasTerritorialesIndigenasParamDef.createCriteria();
		if(reservasTerritorialesIndigenasDto != null) {
			if(CadenaUtil.getStrNull(reservasTerritorialesIndigenasDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomLike(reservasTerritorialesIndigenasDto.getStrTheGeom());
			}
			if(CadenaUtil.getInteNull(reservasTerritorialesIndigenasDto.getIntObjectid1()) != null) {
				criteria.andIntObjectid1EqualTo(reservasTerritorialesIndigenasDto.getIntObjectid1());
			}
			if(CadenaUtil.getStrNull(reservasTerritorialesIndigenasDto.getStrGmlId()) != null) {
				criteria.andStrGmlIdLike(reservasTerritorialesIndigenasDto.getStrGmlId());
			}
			if(CadenaUtil.getInteNull(reservasTerritorialesIndigenasDto.getIntObjectid()) != null) {
				criteria.andIntObjectidEqualTo(reservasTerritorialesIndigenasDto.getIntObjectid());
			}
			if(CadenaUtil.getInteNull(reservasTerritorialesIndigenasDto.getIntId()) != null) {
				criteria.andIntIdEqualTo(reservasTerritorialesIndigenasDto.getIntId());
			}
			if(CadenaUtil.getDoubNull(reservasTerritorialesIndigenasDto.getDblSdeDboTe()) != null) {
				criteria.andDblSdeDboTeEqualTo(reservasTerritorialesIndigenasDto.getDblSdeDboTe());
			}
			if(CadenaUtil.getDoubNull(reservasTerritorialesIndigenasDto.getDblPerimeter()) != null) {
				criteria.andDblPerimeterEqualTo(reservasTerritorialesIndigenasDto.getDblPerimeter());
			}
			if(CadenaUtil.getStrNull(reservasTerritorialesIndigenasDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(reservasTerritorialesIndigenasDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(reservasTerritorialesIndigenasDto.getStrBaseLegal()) != null) {
				criteria.andStrBaseLegalLike(reservasTerritorialesIndigenasDto.getStrBaseLegal());
			}
			if(CadenaUtil.getDoubNull(reservasTerritorialesIndigenasDto.getDblNHaIbc()) != null) {
				criteria.andDblNHaIbcEqualTo(reservasTerritorialesIndigenasDto.getDblNHaIbc());
			}
			if(CadenaUtil.getStrNull(reservasTerritorialesIndigenasDto.getStrNUbicAnp()) != null) {
				criteria.andStrNUbicAnpLike(reservasTerritorialesIndigenasDto.getStrNUbicAnp());
			}
			if(CadenaUtil.getStrNull(reservasTerritorialesIndigenasDto.getStrNMapA0()) != null) {
				criteria.andStrNMapA0Like(reservasTerritorialesIndigenasDto.getStrNMapA0());
			}
			if(CadenaUtil.getStrNull(reservasTerritorialesIndigenasDto.getStrCategoria()) != null) {
				criteria.andStrCategoriaLike(reservasTerritorialesIndigenasDto.getStrCategoria());
			}
			if(CadenaUtil.getStrNull(reservasTerritorialesIndigenasDto.getStrEtnia()) != null) {
				criteria.andStrEtniaLike(reservasTerritorialesIndigenasDto.getStrEtnia());
			}
			if(CadenaUtil.getStrNull(reservasTerritorialesIndigenasDto.getStrUbicaPoli()) != null) {
				criteria.andStrUbicaPoliLike(reservasTerritorialesIndigenasDto.getStrUbicaPoli());
			}
			if(CadenaUtil.getStrNull(reservasTerritorialesIndigenasDto.getStrAreaLegal()) != null) {
				criteria.andStrAreaLegalLike(reservasTerritorialesIndigenasDto.getStrAreaLegal());
			}
			if(CadenaUtil.getDoubNull(reservasTerritorialesIndigenasDto.getDblShapeStar()) != null) {
				criteria.andDblShapeStarEqualTo(reservasTerritorialesIndigenasDto.getDblShapeStar());
			}
			if(CadenaUtil.getDoubNull(reservasTerritorialesIndigenasDto.getDblShapeStle()) != null) {
				criteria.andDblShapeStleEqualTo(reservasTerritorialesIndigenasDto.getDblShapeStle());
			}
		}
		
		List<ReservasTerritorialesIndigenas>	 list	= reservasTerritorialesIndigenasMapper.selectByDefaultParameter(reservasTerritorialesIndigenasParamDef);
		return list;
	}
	
	public ReservasTerritorialesIndigenas buscarById(ReservasTerritorialesIndigenasDto reservasTerritorialesIndigenasDto) throws Exception {
		ReservasTerritorialesIndigenas reservasTerritorialesIndigenas		= new ReservasTerritorialesIndigenas();
		BeanUtils.copyProperties(reservasTerritorialesIndigenasDto, reservasTerritorialesIndigenas);
		return reservasTerritorialesIndigenasMapper.selectByPrimaryKey(reservasTerritorialesIndigenas);
	}
	
	@Transactional
	public Integer guardar(ReservasTerritorialesIndigenasDto reservasTerritorialesIndigenasDto) throws Exception {
		ReservasTerritorialesIndigenas reservasTerritorialesIndigenas		= new ReservasTerritorialesIndigenas();
		BeanUtils.copyProperties(reservasTerritorialesIndigenasDto, reservasTerritorialesIndigenas);
		int rs	= 0;
		ReservasTerritorialesIndigenas exiteReservasTerritorialesIndigenas		= reservasTerritorialesIndigenasMapper.selectByPrimaryKey(reservasTerritorialesIndigenas);
		if(exiteReservasTerritorialesIndigenas != null) {
			rs	= reservasTerritorialesIndigenasMapper.updateByPrimaryKeySelective(reservasTerritorialesIndigenas);
		} else {
			rs	= reservasTerritorialesIndigenasMapper.insertSelective(reservasTerritorialesIndigenas);
			
			Integer srlGid	= reservasTerritorialesIndigenasMapper.lastSequence();
			reservasTerritorialesIndigenasDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(ReservasTerritorialesIndigenasDto reservasTerritorialesIndigenasDto) throws Exception {
		ReservasTerritorialesIndigenas reservasTerritorialesIndigenas		= new ReservasTerritorialesIndigenas();
		BeanUtils.copyProperties(reservasTerritorialesIndigenasDto, reservasTerritorialesIndigenas);
		Integer rs	= reservasTerritorialesIndigenasMapper.deleteByPrimaryKey(reservasTerritorialesIndigenas);
		return rs;
	}
	
}
