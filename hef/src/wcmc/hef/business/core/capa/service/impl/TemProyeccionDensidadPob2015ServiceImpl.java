package wcmc.hef.business.core.capa.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.capa.dto.TemProyeccionDensidadPob2015Dto;
import wcmc.hef.business.core.capa.service.TemProyeccionDensidadPob2015Service;
import wcmc.hef.dao.capa.domain.TemProyeccionDensidadPob2015;
import wcmc.hef.dao.capa.domain.TemProyeccionDensidadPob2015ParamDef;
import wcmc.hef.dao.capa.domain.TemProyeccionDensidadPob2015ParamDef.Criteria;
import wcmc.hef.dao.capa.mapper.TemProyeccionDensidadPob2015Mapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TemProyeccionDensidadPob2015ServiceImpl implements TemProyeccionDensidadPob2015Service {
	@Autowired
	private TemProyeccionDensidadPob2015Mapper temProyeccionDensidadPob2015Mapper;
	public List<TemProyeccionDensidadPob2015> buscar(TemProyeccionDensidadPob2015Dto temProyeccionDensidadPob2015Dto) throws Exception {
		TemProyeccionDensidadPob2015ParamDef temProyeccionDensidadPob2015ParamDef		= new TemProyeccionDensidadPob2015ParamDef();
		
		Criteria criteria		= temProyeccionDensidadPob2015ParamDef.createCriteria();
		if(temProyeccionDensidadPob2015Dto != null) {
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temProyeccionDensidadPob2015Dto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrIddpto()) != null) {
				criteria.andStrIddptoLike(temProyeccionDensidadPob2015Dto.getStrIddpto());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrNombdep()) != null) {
				criteria.andStrNombdepLike(temProyeccionDensidadPob2015Dto.getStrNombdep());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrIdprov()) != null) {
				criteria.andStrIdprovLike(temProyeccionDensidadPob2015Dto.getStrIdprov());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrNombprov()) != null) {
				criteria.andStrNombprovLike(temProyeccionDensidadPob2015Dto.getStrNombprov());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrIddist()) != null) {
				criteria.andStrIddistLike(temProyeccionDensidadPob2015Dto.getStrIddist());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrNombdist()) != null) {
				criteria.andStrNombdistLike(temProyeccionDensidadPob2015Dto.getStrNombdist());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrDcto()) != null) {
				criteria.andStrDctoLike(temProyeccionDensidadPob2015Dto.getStrDcto());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrLey()) != null) {
				criteria.andStrLeyLike(temProyeccionDensidadPob2015Dto.getStrLey());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrFecha()) != null) {
				criteria.andStrFechaLike(temProyeccionDensidadPob2015Dto.getStrFecha());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrNomCap()) != null) {
				criteria.andStrNomCapLike(temProyeccionDensidadPob2015Dto.getStrNomCap());
			}
			if(CadenaUtil.getDoubNull(temProyeccionDensidadPob2015Dto.getDblSupContin()) != null) {
				criteria.andDblSupContinEqualTo(temProyeccionDensidadPob2015Dto.getDblSupContin());
			}
			if(CadenaUtil.getDoubNull(temProyeccionDensidadPob2015Dto.getDblSupInsula()) != null) {
				criteria.andDblSupInsulaEqualTo(temProyeccionDensidadPob2015Dto.getDblSupInsula());
			}
			if(CadenaUtil.getDoubNull(temProyeccionDensidadPob2015Dto.getDblSupLacust()) != null) {
				criteria.andDblSupLacustEqualTo(temProyeccionDensidadPob2015Dto.getDblSupLacust());
			}
			if(CadenaUtil.getDoubNull(temProyeccionDensidadPob2015Dto.getDblSupInsD()) != null) {
				criteria.andDblSupInsDEqualTo(temProyeccionDensidadPob2015Dto.getDblSupInsD());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrUbigeo()) != null) {
				criteria.andStrUbigeoLike(temProyeccionDensidadPob2015Dto.getStrUbigeo());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrUbigeo1()) != null) {
				criteria.andStrUbigeo1Like(temProyeccionDensidadPob2015Dto.getStrUbigeo1());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrDistrito()) != null) {
				criteria.andStrDistritoLike(temProyeccionDensidadPob2015Dto.getStrDistrito());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrTotal2015()) != null) {
				criteria.andStrTotal2015Like(temProyeccionDensidadPob2015Dto.getStrTotal2015());
			}
			if(CadenaUtil.getDoubNull(temProyeccionDensidadPob2015Dto.getDblArea()) != null) {
				criteria.andDblAreaEqualTo(temProyeccionDensidadPob2015Dto.getDblArea());
			}
			if(CadenaUtil.getDoubNull(temProyeccionDensidadPob2015Dto.getDblPopDens()) != null) {
				criteria.andDblPopDensEqualTo(temProyeccionDensidadPob2015Dto.getDblPopDens());
			}
		}
		
		List<TemProyeccionDensidadPob2015>	 list	= temProyeccionDensidadPob2015Mapper.selectByDefaultParameter(temProyeccionDensidadPob2015ParamDef);
		return list;
	}
	
		public List<TemProyeccionDensidadPob2015> buscarGeometry(TemProyeccionDensidadPob2015Dto temProyeccionDensidadPob2015Dto) throws Exception {
		TemProyeccionDensidadPob2015ParamDef temProyeccionDensidadPob2015ParamDef		= new TemProyeccionDensidadPob2015ParamDef();
		
		Criteria criteria		= temProyeccionDensidadPob2015ParamDef.createCriteria();
		if(temProyeccionDensidadPob2015Dto != null) {
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrTheGeom()) != null) {
				criteria.andStrTheGeomIntersectsTo(temProyeccionDensidadPob2015Dto.getStrTheGeom());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrIddpto()) != null) {
				criteria.andStrIddptoLike(temProyeccionDensidadPob2015Dto.getStrIddpto());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrNombdep()) != null) {
				criteria.andStrNombdepLike(temProyeccionDensidadPob2015Dto.getStrNombdep());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrIdprov()) != null) {
				criteria.andStrIdprovLike(temProyeccionDensidadPob2015Dto.getStrIdprov());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrNombprov()) != null) {
				criteria.andStrNombprovLike(temProyeccionDensidadPob2015Dto.getStrNombprov());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrIddist()) != null) {
				criteria.andStrIddistLike(temProyeccionDensidadPob2015Dto.getStrIddist());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrNombdist()) != null) {
				criteria.andStrNombdistLike(temProyeccionDensidadPob2015Dto.getStrNombdist());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrDcto()) != null) {
				criteria.andStrDctoLike(temProyeccionDensidadPob2015Dto.getStrDcto());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrLey()) != null) {
				criteria.andStrLeyLike(temProyeccionDensidadPob2015Dto.getStrLey());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrFecha()) != null) {
				criteria.andStrFechaLike(temProyeccionDensidadPob2015Dto.getStrFecha());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrNomCap()) != null) {
				criteria.andStrNomCapLike(temProyeccionDensidadPob2015Dto.getStrNomCap());
			}
			if(CadenaUtil.getDoubNull(temProyeccionDensidadPob2015Dto.getDblSupContin()) != null) {
				criteria.andDblSupContinEqualTo(temProyeccionDensidadPob2015Dto.getDblSupContin());
			}
			if(CadenaUtil.getDoubNull(temProyeccionDensidadPob2015Dto.getDblSupInsula()) != null) {
				criteria.andDblSupInsulaEqualTo(temProyeccionDensidadPob2015Dto.getDblSupInsula());
			}
			if(CadenaUtil.getDoubNull(temProyeccionDensidadPob2015Dto.getDblSupLacust()) != null) {
				criteria.andDblSupLacustEqualTo(temProyeccionDensidadPob2015Dto.getDblSupLacust());
			}
			if(CadenaUtil.getDoubNull(temProyeccionDensidadPob2015Dto.getDblSupInsD()) != null) {
				criteria.andDblSupInsDEqualTo(temProyeccionDensidadPob2015Dto.getDblSupInsD());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrUbigeo()) != null) {
				criteria.andStrUbigeoLike(temProyeccionDensidadPob2015Dto.getStrUbigeo());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrUbigeo1()) != null) {
				criteria.andStrUbigeo1Like(temProyeccionDensidadPob2015Dto.getStrUbigeo1());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrDistrito()) != null) {
				criteria.andStrDistritoLike(temProyeccionDensidadPob2015Dto.getStrDistrito());
			}
			if(CadenaUtil.getStrNull(temProyeccionDensidadPob2015Dto.getStrTotal2015()) != null) {
				criteria.andStrTotal2015Like(temProyeccionDensidadPob2015Dto.getStrTotal2015());
			}
			if(CadenaUtil.getDoubNull(temProyeccionDensidadPob2015Dto.getDblArea()) != null) {
				criteria.andDblAreaEqualTo(temProyeccionDensidadPob2015Dto.getDblArea());
			}
			if(CadenaUtil.getDoubNull(temProyeccionDensidadPob2015Dto.getDblPopDens()) != null) {
				criteria.andDblPopDensEqualTo(temProyeccionDensidadPob2015Dto.getDblPopDens());
			}
		}
		
		List<TemProyeccionDensidadPob2015>	 list	= temProyeccionDensidadPob2015Mapper.selectByDefaultParameterGeometry(temProyeccionDensidadPob2015ParamDef);
		return list;
	}
	
	public TemProyeccionDensidadPob2015 buscarById(TemProyeccionDensidadPob2015Dto temProyeccionDensidadPob2015Dto) throws Exception {
		TemProyeccionDensidadPob2015 temProyeccionDensidadPob2015		= new TemProyeccionDensidadPob2015();
		BeanUtils.copyProperties(temProyeccionDensidadPob2015Dto, temProyeccionDensidadPob2015);
		return temProyeccionDensidadPob2015Mapper.selectByPrimaryKey(temProyeccionDensidadPob2015);
	}
	
	@Transactional
	public Integer guardar(TemProyeccionDensidadPob2015Dto temProyeccionDensidadPob2015Dto) throws Exception {
		TemProyeccionDensidadPob2015 temProyeccionDensidadPob2015		= new TemProyeccionDensidadPob2015();
		BeanUtils.copyProperties(temProyeccionDensidadPob2015Dto, temProyeccionDensidadPob2015);
		int rs	= 0;
		TemProyeccionDensidadPob2015 exiteTemProyeccionDensidadPob2015		= temProyeccionDensidadPob2015Mapper.selectByPrimaryKey(temProyeccionDensidadPob2015);
		if(exiteTemProyeccionDensidadPob2015 != null) {
			rs	= temProyeccionDensidadPob2015Mapper.updateByPrimaryKeySelective(temProyeccionDensidadPob2015);
		} else {
			rs	= temProyeccionDensidadPob2015Mapper.insertSelective(temProyeccionDensidadPob2015);
			
			Integer srlGid	= temProyeccionDensidadPob2015Mapper.lastSequence();
			temProyeccionDensidadPob2015Dto.setSrlGid(srlGid);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TemProyeccionDensidadPob2015Dto temProyeccionDensidadPob2015Dto) throws Exception {
		TemProyeccionDensidadPob2015 temProyeccionDensidadPob2015		= new TemProyeccionDensidadPob2015();
		BeanUtils.copyProperties(temProyeccionDensidadPob2015Dto, temProyeccionDensidadPob2015);
		Integer rs	= temProyeccionDensidadPob2015Mapper.deleteByPrimaryKey(temProyeccionDensidadPob2015);
		return rs;
	}
	
}
