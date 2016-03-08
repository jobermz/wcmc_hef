package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemHumedalesRamsarDto;
import wcmc.hef.business.core.capa.service.TemHumedalesRamsarService;
import wcmc.hef.dao.capa.domain.TemHumedalesRamsar;
import wcmc.hef.dao.capa.domain.TemHumedalesRamsarParamDef;
import wcmc.hef.dao.capa.domain.TemHumedalesRamsarParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemHumedalesRamsarMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemHumedalesRamsarServiceImpl implements TemHumedalesRamsarService {
	@Autowired
	private TemHumedalesRamsarMapper temHumedalesRamsarMapper;
	public List<TemHumedalesRamsar> buscar(TemHumedalesRamsarDto temHumedalesRamsarDto) throws Exception {
		TemHumedalesRamsarParamDef temHumedalesRamsarParamDef		= new TemHumedalesRamsarParamDef();
		
		Criteria criteria		= temHumedalesRamsarParamDef.createCriteria();
		if(temHumedalesRamsarDto != null) {
			if(CadenaUtil.getStrNull(temHumedalesRamsarDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temHumedalesRamsarDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temHumedalesRamsarDto.getStrCategorias()) != null) {
				criteria.andStrCategoriasLike(temHumedalesRamsarDto.getStrCategorias());
			}
			if(CadenaUtil.getStrNull(temHumedalesRamsarDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(temHumedalesRamsarDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(temHumedalesRamsarDto.getStrBaseLegal()) != null) {
				criteria.andStrBaseLegalLike(temHumedalesRamsarDto.getStrBaseLegal());
			}
			if(CadenaUtil.getStrNull(temHumedalesRamsarDto.getStrUbicaPoli()) != null) {
				criteria.andStrUbicaPoliLike(temHumedalesRamsarDto.getStrUbicaPoli());
			}
			if(CadenaUtil.getDoubNull(temHumedalesRamsarDto.getDblAreaLegal()) != null) {
				criteria.andDblAreaLegalEqualTo(temHumedalesRamsarDto.getDblAreaLegal());
			}
			if(CadenaUtil.getInteNull(temHumedalesRamsarDto.getIntId()) != null) {
				criteria.andIntIdEqualTo(temHumedalesRamsarDto.getIntId());
			}
			if(CadenaUtil.getStrNull(temHumedalesRamsarDto.getStrObserva()) != null) {
				criteria.andStrObservaLike(temHumedalesRamsarDto.getStrObserva());
			}
			if(CadenaUtil.getDoubNull(temHumedalesRamsarDto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temHumedalesRamsarDto.getDblShapeArea());
			}
			if(CadenaUtil.getDoubNull(temHumedalesRamsarDto.getDblShapeLen()) != null) {
				criteria.andDblShapeLenEqualTo(temHumedalesRamsarDto.getDblShapeLen());
			}
		}
		
		List<TemHumedalesRamsar>	 list	= temHumedalesRamsarMapper.selectByDefaultParameter(temHumedalesRamsarParamDef);
		return list;
	}
	
		public List<TemHumedalesRamsar> buscarGeometry(TemHumedalesRamsarDto temHumedalesRamsarDto) throws Exception {
		TemHumedalesRamsarParamDef temHumedalesRamsarParamDef		= new TemHumedalesRamsarParamDef();
		
		Criteria criteria		= temHumedalesRamsarParamDef.createCriteria();
		if(temHumedalesRamsarDto != null) {
			if(CadenaUtil.getStrNull(temHumedalesRamsarDto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temHumedalesRamsarDto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temHumedalesRamsarDto.getStrCategorias()) != null) {
				criteria.andStrCategoriasLike(temHumedalesRamsarDto.getStrCategorias());
			}
			if(CadenaUtil.getStrNull(temHumedalesRamsarDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(temHumedalesRamsarDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(temHumedalesRamsarDto.getStrBaseLegal()) != null) {
				criteria.andStrBaseLegalLike(temHumedalesRamsarDto.getStrBaseLegal());
			}
			if(CadenaUtil.getStrNull(temHumedalesRamsarDto.getStrUbicaPoli()) != null) {
				criteria.andStrUbicaPoliLike(temHumedalesRamsarDto.getStrUbicaPoli());
			}
			if(CadenaUtil.getDoubNull(temHumedalesRamsarDto.getDblAreaLegal()) != null) {
				criteria.andDblAreaLegalEqualTo(temHumedalesRamsarDto.getDblAreaLegal());
			}
			if(CadenaUtil.getInteNull(temHumedalesRamsarDto.getIntId()) != null) {
				criteria.andIntIdEqualTo(temHumedalesRamsarDto.getIntId());
			}
			if(CadenaUtil.getStrNull(temHumedalesRamsarDto.getStrObserva()) != null) {
				criteria.andStrObservaLike(temHumedalesRamsarDto.getStrObserva());
			}
			if(CadenaUtil.getDoubNull(temHumedalesRamsarDto.getDblShapeArea()) != null) {
				criteria.andDblShapeAreaEqualTo(temHumedalesRamsarDto.getDblShapeArea());
			}
			if(CadenaUtil.getDoubNull(temHumedalesRamsarDto.getDblShapeLen()) != null) {
				criteria.andDblShapeLenEqualTo(temHumedalesRamsarDto.getDblShapeLen());
			}
		}
		
		List<TemHumedalesRamsar>	 list	= temHumedalesRamsarMapper.selectByDefaultParameterGeometry(temHumedalesRamsarParamDef);
		return list;
	}
	
	public TemHumedalesRamsar buscarById(TemHumedalesRamsarDto temHumedalesRamsarDto) throws Exception {
		TemHumedalesRamsar temHumedalesRamsar		= new TemHumedalesRamsar();
		BeanUtils.copyProperties(temHumedalesRamsarDto, temHumedalesRamsar);
		return temHumedalesRamsarMapper.selectByPrimaryKey(temHumedalesRamsar);
	}
	
	@Transactional
	public Integer guardar(TemHumedalesRamsarDto temHumedalesRamsarDto) throws Exception {
		TemHumedalesRamsar temHumedalesRamsar		= new TemHumedalesRamsar();
		BeanUtils.copyProperties(temHumedalesRamsarDto, temHumedalesRamsar);
		int rs	= 0;
		TemHumedalesRamsar exiteTemHumedalesRamsar		= temHumedalesRamsarMapper.selectByPrimaryKey(temHumedalesRamsar);
		if(exiteTemHumedalesRamsar != null) {
			rs	= temHumedalesRamsarMapper.updateByPrimaryKeySelective(temHumedalesRamsar);
		} else {
			rs	= temHumedalesRamsarMapper.insertSelective(temHumedalesRamsar);
			
			Integer srlGid	= temHumedalesRamsarMapper.lastSequence();
			temHumedalesRamsarDto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemHumedalesRamsarDto temHumedalesRamsarDto) throws Exception {
		TemHumedalesRamsar temHumedalesRamsar		= new TemHumedalesRamsar();
		BeanUtils.copyProperties(temHumedalesRamsarDto, temHumedalesRamsar);
		Integer rs	= temHumedalesRamsarMapper.deleteByPrimaryKey(temHumedalesRamsar);
		return rs;
	}
	
}
