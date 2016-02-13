package wcmc.hef.business.core.configuracion.service.impl;

import java.util.List;
import java.util.Date;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.configuracion.dto.TipoCapaDto;
import wcmc.hef.business.core.configuracion.service.TipoCapaService;
import wcmc.hef.dao.configuracion.domain.TipoCapa;
import wcmc.hef.dao.configuracion.domain.TipoCapaParamDef;
import wcmc.hef.dao.configuracion.domain.TipoCapaParamDef.Criteria;
import wcmc.hef.dao.configuracion.mapper.TipoCapaMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class TipoCapaServiceImpl implements TipoCapaService {
	@Autowired
	private TipoCapaMapper tipoCapaMapper;
	public List<TipoCapa> buscar(TipoCapaDto tipoCapaDto) throws Exception {
		TipoCapaParamDef tipoCapaParamDef		= new TipoCapaParamDef();
		
		Criteria criteria		= tipoCapaParamDef.createCriteria();
		if(tipoCapaDto != null) {
			if(CadenaUtil.getStrNull(tipoCapaDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(tipoCapaDto.getStrNombre());
			}
		}
		
		List<TipoCapa>	 list	= tipoCapaMapper.selectByDefaultParameter(tipoCapaParamDef);
		return list;
	}
	
	public TipoCapa buscarById(TipoCapaDto tipoCapaDto) throws Exception {
		TipoCapa tipoCapa		= new TipoCapa();
		BeanUtils.copyProperties(tipoCapaDto, tipoCapa);
		return tipoCapaMapper.selectByPrimaryKey(tipoCapa);
	}
	
	@Transactional
	public Integer guardar(TipoCapaDto tipoCapaDto) throws Exception {
		TipoCapa tipoCapa		= new TipoCapa();
		BeanUtils.copyProperties(tipoCapaDto, tipoCapa);
		int rs	= 0;
		TipoCapa exiteTipoCapa		= tipoCapaMapper.selectByPrimaryKey(tipoCapa);
		if(exiteTipoCapa != null) {
			rs	= tipoCapaMapper.updateByPrimaryKeySelective(tipoCapa);
		} else {
			rs	= tipoCapaMapper.insertSelective(tipoCapa);
			
			Integer srlIdTipoCapa	= tipoCapaMapper.lastSequence();
			tipoCapaDto.setSrlIdTipoCapa(srlIdTipoCapa);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(TipoCapaDto tipoCapaDto) throws Exception {
		TipoCapa tipoCapa		= new TipoCapa();
		BeanUtils.copyProperties(tipoCapaDto, tipoCapa);
		Integer rs	= tipoCapaMapper.deleteByPrimaryKey(tipoCapa);
		return rs;
	}
	
}
