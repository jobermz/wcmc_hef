package wcmc.hef.business.core.configuracion.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcmc.hef.business.core.configuracion.dto.CapaDto;
import wcmc.hef.business.core.configuracion.service.CapaService;
import wcmc.hef.dao.configuracion.domain.Capa;
import wcmc.hef.dao.configuracion.domain.CapaParamDef;
import wcmc.hef.dao.configuracion.domain.CapaParamDef.Criteria;
import wcmc.hef.dao.configuracion.mapper.CapaMapper;
import wcmc.hef.general.util.CadenaUtil;

@Service
public class CapaServiceImpl implements CapaService {
	@Autowired
	private CapaMapper capaMapper;
	public List<Capa> buscar(CapaDto capaDto) throws Exception {
		CapaParamDef capaParamDef		= new CapaParamDef();
		
		Criteria criteria		= capaParamDef.createCriteria();
		if(capaDto != null) {
			if(CadenaUtil.getStrNull(capaDto.getStrNombre()) != null) {
				criteria.andStrNombreLike(capaDto.getStrNombre());
			}
			if(CadenaUtil.getStrNull(capaDto.getStrComentarios()) != null) {
				criteria.andStrComentariosLike(capaDto.getStrComentarios());
			}
			if(CadenaUtil.getInteNull(capaDto.getIntGrupoCapas()) != null) {
				criteria.andIntGrupoCapasEqualTo(capaDto.getIntGrupoCapas());
			}
		}
		
		capaParamDef.setOrderByClause("nm_orden");
		List<Capa>	 list	= capaMapper.selectByDefaultParameter(capaParamDef);
		return list;
	}
	
	public Capa buscarById(CapaDto capaDto) throws Exception {
		Capa capa		= new Capa();
		BeanUtils.copyProperties(capaDto, capa);
		return capaMapper.selectByPrimaryKey(capa);
	}
	
	@Transactional
	public Integer guardar(CapaDto capaDto) throws Exception {
		Capa capa		= new Capa();
		BeanUtils.copyProperties(capaDto, capa);
		int rs	= 0;
		Capa exiteCapa		= capaMapper.selectByPrimaryKey(capa);
		if(exiteCapa != null) {
			rs	= capaMapper.updateByPrimaryKeySelective(capa);
		} else {
			rs	= capaMapper.insertSelective(capa);
			
			Integer srlIdCapa	= capaMapper.lastSequence();
			capaDto.setSrlIdCapa(srlIdCapa);

		}
		return rs;
	}
	
	@Transactional
	public Integer eliminar(CapaDto capaDto) throws Exception {
		Capa capa		= new Capa();
		BeanUtils.copyProperties(capaDto, capa);
		Integer rs	= capaMapper.deleteByPrimaryKey(capa);
		return rs;
	}
	
}
