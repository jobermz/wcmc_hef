package wcmc.hef.business.core.visor.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.visor.dto.CapaDistritoDto;
import wcmc.hef.business.core.visor.service.CapaDistritoService;
import wcmc.hef.dao.visor.domain.CapaDistrito;
import wcmc.hef.dao.visor.domain.CapaDistritoParamDef;
import wcmc.hef.dao.visor.domain.CapaDistritoParamDef.Criteria;
import wcmc.hef.dao.visor.mapper.CapaDistritoMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class CapaDistritoServiceImpl implements CapaDistritoService {
	@Autowired
	private CapaDistritoMapper capaDistritoMapper;
	public List<CapaDistrito> buscar(CapaDistritoDto capaDistritoDto) throws Exception {
		CapaDistritoParamDef capaDistritoParamDef		= new CapaDistritoParamDef();
		
		Criteria criteria		= capaDistritoParamDef.createCriteria();
		if(capaDistritoDto != null) {
			if(CadenaUtil.getStrNull(capaDistritoDto.getStrIdDistrito()) != null) {
				criteria.andStrIdDistritoLike(capaDistritoDto.getStrIdDistrito());
			}
			if(CadenaUtil.getStrNull(capaDistritoDto.getStrIdProvincia()) != null) {
				criteria.andStrIdProvinciaLike(capaDistritoDto.getStrIdProvincia());
			}
			if(CadenaUtil.getStrNull(capaDistritoDto.getStrIdDepartamento()) != null) {
				criteria.andStrIdDepartamentoLike(capaDistritoDto.getStrIdDepartamento());
			}
			if(CadenaUtil.getStrNull(capaDistritoDto.getStrNombreDistrito()) != null) {
				criteria.andStrNombreDistritoLike(capaDistritoDto.getStrNombreDistrito());
			}
			if(CadenaUtil.getStrNull(capaDistritoDto.getStrNombreProvincia()) != null) {
				criteria.andStrNombreProvinciaLike(capaDistritoDto.getStrNombreProvincia());
			}
			if(CadenaUtil.getStrNull(capaDistritoDto.getStrNombreDepartamento()) != null) {
				criteria.andStrNombreDepartamentoLike(capaDistritoDto.getStrNombreDepartamento());
			}
		}
		
		capaDistritoParamDef.setOrderByClause("nm_distrit, nm_provinc");
		List<CapaDistrito>	 list	= capaDistritoMapper.selectByDefaultParameter(capaDistritoParamDef);
		return list;
	}
	
	public CapaDistrito buscarById(CapaDistritoDto capaDistritoDto) throws Exception {
		CapaDistrito capaDistrito		= new CapaDistrito();
		BeanUtils.copyProperties(capaDistritoDto, capaDistrito);
		return capaDistritoMapper.selectByPrimaryKey(capaDistrito);
	}
	
	@Transactional
	public Integer guardar(CapaDistritoDto capaDistritoDto) throws Exception {
		CapaDistrito capaDistrito		= new CapaDistrito();
		BeanUtils.copyProperties(capaDistritoDto, capaDistrito);
		int rs	= 0;
		CapaDistrito exiteCapaDistrito		= capaDistritoMapper.selectByPrimaryKey(capaDistrito);
		if(exiteCapaDistrito != null) {
			rs	= capaDistritoMapper.updateByPrimaryKeySelective(capaDistrito);
		} else {
			rs	= capaDistritoMapper.insertSelective(capaDistrito);
			

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(CapaDistritoDto capaDistritoDto) throws Exception {
		CapaDistrito capaDistrito		= new CapaDistrito();
		BeanUtils.copyProperties(capaDistritoDto, capaDistrito);
		Integer rs	= capaDistritoMapper.deleteByPrimaryKey(capaDistrito);
		return rs;
	}
	
}
