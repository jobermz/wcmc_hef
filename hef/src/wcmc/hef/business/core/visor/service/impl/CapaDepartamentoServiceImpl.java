package wcmc.hef.business.core.visor.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.visor.dto.CapaDepartamentoDto;
import wcmc.hef.business.core.visor.service.CapaDepartamentoService;
import wcmc.hef.dao.visor.domain.CapaDepartamento;
import wcmc.hef.dao.visor.domain.CapaDepartamentoParamDef;
import wcmc.hef.dao.visor.domain.CapaDepartamentoParamDef.Criteria;
import wcmc.hef.dao.visor.mapper.CapaDepartamentoMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class CapaDepartamentoServiceImpl implements CapaDepartamentoService {
	@Autowired
	private CapaDepartamentoMapper capaDepartamentoMapper;
	public List<CapaDepartamento> buscar(CapaDepartamentoDto capaDepartamentoDto) throws Exception {
		CapaDepartamentoParamDef capaDepartamentoParamDef		= new CapaDepartamentoParamDef();
		
		Criteria criteria		= capaDepartamentoParamDef.createCriteria();
		if(capaDepartamentoDto != null) {
			if(CadenaUtil.getStrNull(capaDepartamentoDto.getStrIdDepartamento()) != null) {
				criteria.andStrIdDepartamentoLike(capaDepartamentoDto.getStrIdDepartamento());
			}
			if(CadenaUtil.getStrNull(capaDepartamentoDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(capaDepartamentoDto.getStrNombre());
			}
		}
		
		capaDepartamentoParamDef.setOrderByClause("nom_departamento");
		List<CapaDepartamento>	 list	= capaDepartamentoMapper.selectByDefaultParameter(capaDepartamentoParamDef);
		return list;
	}
	
	public CapaDepartamento buscarById(CapaDepartamentoDto capaDepartamentoDto) throws Exception {
		CapaDepartamento capaDepartamento		= new CapaDepartamento();
		BeanUtils.copyProperties(capaDepartamentoDto, capaDepartamento);
		return capaDepartamentoMapper.selectByPrimaryKey(capaDepartamento);
	}
	
	@Transactional
	public Integer guardar(CapaDepartamentoDto capaDepartamentoDto) throws Exception {
		CapaDepartamento capaDepartamento		= new CapaDepartamento();
		BeanUtils.copyProperties(capaDepartamentoDto, capaDepartamento);
		int rs	= 0;
		CapaDepartamento exiteCapaDepartamento		= capaDepartamentoMapper.selectByPrimaryKey(capaDepartamento);
		if(exiteCapaDepartamento != null) {
			rs	= capaDepartamentoMapper.updateByPrimaryKeySelective(capaDepartamento);
		} else {
			rs	= capaDepartamentoMapper.insertSelective(capaDepartamento);
			

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(CapaDepartamentoDto capaDepartamentoDto) throws Exception {
		CapaDepartamento capaDepartamento		= new CapaDepartamento();
		BeanUtils.copyProperties(capaDepartamentoDto, capaDepartamento);
		Integer rs	= capaDepartamentoMapper.deleteByPrimaryKey(capaDepartamento);
		return rs;
	}
	
}
