package wcmc.hef.dao.configuracion.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class CapaParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CapaParamDef() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }
        
                
        
        public Criteria andSrlIdCapaEqualTo(Integer value) {
            addCriterion("cd_capa =", value, "cd_capa");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaNotEqualTo(Integer value) {
            addCriterion("cd_capa <>", value, "cd_capa");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdCapaIsNull() {
            addCriterion("cd_capa is null");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaIsNotNull() {
            addCriterion("cd_capa is not null");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaGreaterThan(Integer value) {
            addCriterion("cd_capa >", value, "cd_capa");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_capa >=", value, "cd_capa");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaLessThan(Integer value) {
            addCriterion("cd_capa <", value, "cd_capa");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaLessThanOrEqualTo(Integer value) {
            addCriterion("cd_capa <=", value, "cd_capa");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaIn(List<Integer> values) {
            addCriterion("cd_capa in", values, "cd_capa");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaNotIn(List<Integer> values) {
            addCriterion("cd_capa not in", values, "cd_capa");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaBetween(Integer value1, Integer value2) {
            addCriterion("cd_capa between", value1, value2, "cd_capa");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_capa not between", value1, value2, "cd_capa");
            return (Criteria) this;
        }
        
        
        public Criteria andIntGrupoCapasEqualTo(Integer value) {
            addCriterion("cd_grupcap =", value, "cd_grupcap");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasNotEqualTo(Integer value) {
            addCriterion("cd_grupcap <>", value, "cd_grupcap");
            return (Criteria) this;
        }
        
        
        public Criteria andIntGrupoCapasIsNull() {
            addCriterion("cd_grupcap is null");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasIsNotNull() {
            addCriterion("cd_grupcap is not null");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasGreaterThan(Integer value) {
            addCriterion("cd_grupcap >", value, "cd_grupcap");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_grupcap >=", value, "cd_grupcap");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasLessThan(Integer value) {
            addCriterion("cd_grupcap <", value, "cd_grupcap");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasLessThanOrEqualTo(Integer value) {
            addCriterion("cd_grupcap <=", value, "cd_grupcap");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasIn(List<Integer> values) {
            addCriterion("cd_grupcap in", values, "cd_grupcap");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasNotIn(List<Integer> values) {
            addCriterion("cd_grupcap not in", values, "cd_grupcap");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasBetween(Integer value1, Integer value2) {
            addCriterion("cd_grupcap between", value1, value2, "cd_grupcap");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_grupcap not between", value1, value2, "cd_grupcap");
            return (Criteria) this;
        }
        
        
        public Criteria andIntTipoCapaEqualTo(Integer value) {
            addCriterion("cd_tipocapa =", value, "cd_tipocapa");
            return (Criteria) this;
        }

        public Criteria andIntTipoCapaNotEqualTo(Integer value) {
            addCriterion("cd_tipocapa <>", value, "cd_tipocapa");
            return (Criteria) this;
        }
        
        
        public Criteria andIntTipoCapaIsNull() {
            addCriterion("cd_tipocapa is null");
            return (Criteria) this;
        }

        public Criteria andIntTipoCapaIsNotNull() {
            addCriterion("cd_tipocapa is not null");
            return (Criteria) this;
        }

        public Criteria andIntTipoCapaGreaterThan(Integer value) {
            addCriterion("cd_tipocapa >", value, "cd_tipocapa");
            return (Criteria) this;
        }

        public Criteria andIntTipoCapaGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_tipocapa >=", value, "cd_tipocapa");
            return (Criteria) this;
        }

        public Criteria andIntTipoCapaLessThan(Integer value) {
            addCriterion("cd_tipocapa <", value, "cd_tipocapa");
            return (Criteria) this;
        }

        public Criteria andIntTipoCapaLessThanOrEqualTo(Integer value) {
            addCriterion("cd_tipocapa <=", value, "cd_tipocapa");
            return (Criteria) this;
        }

        public Criteria andIntTipoCapaIn(List<Integer> values) {
            addCriterion("cd_tipocapa in", values, "cd_tipocapa");
            return (Criteria) this;
        }

        public Criteria andIntTipoCapaNotIn(List<Integer> values) {
            addCriterion("cd_tipocapa not in", values, "cd_tipocapa");
            return (Criteria) this;
        }

        public Criteria andIntTipoCapaBetween(Integer value1, Integer value2) {
            addCriterion("cd_tipocapa between", value1, value2, "cd_tipocapa");
            return (Criteria) this;
        }

        public Criteria andIntTipoCapaNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_tipocapa not between", value1, value2, "cd_tipocapa");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombreLike(String value) {
            addCriterion("upper(de_nombre) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotLike(String value) {
            addCriterion("de_nombre not like", "%" + CadenaUtil.getStr(value) + "%", "de_nombre");
            return (Criteria) this;
        }
			
        public Criteria andStrNombreEqualTo(String value) {
            addCriterion("de_nombre =", CadenaUtil.getStr(value), "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotEqualTo(String value) {
            addCriterion("de_nombre <>", CadenaUtil.getStr(value), "de_nombre");
            return (Criteria) this;
        }

        
        public Criteria andStrNombreIsNull() {
            addCriterion("de_nombre is null");
            return (Criteria) this;
        }

        public Criteria andStrNombreIsNotNull() {
            addCriterion("de_nombre is not null");
            return (Criteria) this;
        }

        public Criteria andStrNombreGreaterThan(String value) {
            addCriterion("de_nombre >", value, "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreGreaterThanOrEqualTo(String value) {
            addCriterion("de_nombre >=", value, "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreLessThan(String value) {
            addCriterion("de_nombre <", value, "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreLessThanOrEqualTo(String value) {
            addCriterion("de_nombre <=", value, "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreIn(List<String> values) {
            addCriterion("de_nombre in", values, "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotIn(List<String> values) {
            addCriterion("de_nombre not in", values, "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreBetween(String value1, String value2) {
            addCriterion("de_nombre between", value1, value2, "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotBetween(String value1, String value2) {
            addCriterion("de_nombre not between", value1, value2, "de_nombre");
            return (Criteria) this;
        }
        
        
        public Criteria andStrComentariosLike(String value) {
            addCriterion("upper(de_coment) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_coment");
            return (Criteria) this;
        }

        public Criteria andStrComentariosNotLike(String value) {
            addCriterion("de_coment not like", "%" + CadenaUtil.getStr(value) + "%", "de_coment");
            return (Criteria) this;
        }
			
        public Criteria andStrComentariosEqualTo(String value) {
            addCriterion("de_coment =", CadenaUtil.getStr(value), "de_coment");
            return (Criteria) this;
        }

        public Criteria andStrComentariosNotEqualTo(String value) {
            addCriterion("de_coment <>", CadenaUtil.getStr(value), "de_coment");
            return (Criteria) this;
        }

        
        public Criteria andStrComentariosIsNull() {
            addCriterion("de_coment is null");
            return (Criteria) this;
        }

        public Criteria andStrComentariosIsNotNull() {
            addCriterion("de_coment is not null");
            return (Criteria) this;
        }

        public Criteria andStrComentariosGreaterThan(String value) {
            addCriterion("de_coment >", value, "de_coment");
            return (Criteria) this;
        }

        public Criteria andStrComentariosGreaterThanOrEqualTo(String value) {
            addCriterion("de_coment >=", value, "de_coment");
            return (Criteria) this;
        }

        public Criteria andStrComentariosLessThan(String value) {
            addCriterion("de_coment <", value, "de_coment");
            return (Criteria) this;
        }

        public Criteria andStrComentariosLessThanOrEqualTo(String value) {
            addCriterion("de_coment <=", value, "de_coment");
            return (Criteria) this;
        }

        public Criteria andStrComentariosIn(List<String> values) {
            addCriterion("de_coment in", values, "de_coment");
            return (Criteria) this;
        }

        public Criteria andStrComentariosNotIn(List<String> values) {
            addCriterion("de_coment not in", values, "de_coment");
            return (Criteria) this;
        }

        public Criteria andStrComentariosBetween(String value1, String value2) {
            addCriterion("de_coment between", value1, value2, "de_coment");
            return (Criteria) this;
        }

        public Criteria andStrComentariosNotBetween(String value1, String value2) {
            addCriterion("de_coment not between", value1, value2, "de_coment");
            return (Criteria) this;
        }
        
        
        public Criteria andStrUrlLike(String value) {
            addCriterion("upper(de_url) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlNotLike(String value) {
            addCriterion("de_url not like", "%" + CadenaUtil.getStr(value) + "%", "de_url");
            return (Criteria) this;
        }
			
        public Criteria andStrUrlEqualTo(String value) {
            addCriterion("de_url =", CadenaUtil.getStr(value), "de_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlNotEqualTo(String value) {
            addCriterion("de_url <>", CadenaUtil.getStr(value), "de_url");
            return (Criteria) this;
        }

        
        public Criteria andStrUrlIsNull() {
            addCriterion("de_url is null");
            return (Criteria) this;
        }

        public Criteria andStrUrlIsNotNull() {
            addCriterion("de_url is not null");
            return (Criteria) this;
        }

        public Criteria andStrUrlGreaterThan(String value) {
            addCriterion("de_url >", value, "de_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlGreaterThanOrEqualTo(String value) {
            addCriterion("de_url >=", value, "de_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlLessThan(String value) {
            addCriterion("de_url <", value, "de_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlLessThanOrEqualTo(String value) {
            addCriterion("de_url <=", value, "de_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlIn(List<String> values) {
            addCriterion("de_url in", values, "de_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlNotIn(List<String> values) {
            addCriterion("de_url not in", values, "de_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlBetween(String value1, String value2) {
            addCriterion("de_url between", value1, value2, "de_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlNotBetween(String value1, String value2) {
            addCriterion("de_url not between", value1, value2, "de_url");
            return (Criteria) this;
        }
        
        
        public Criteria andStrWmsUrlLike(String value) {
            addCriterion("upper(de_wmsurl) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlNotLike(String value) {
            addCriterion("de_wmsurl not like", "%" + CadenaUtil.getStr(value) + "%", "de_wmsurl");
            return (Criteria) this;
        }
			
        public Criteria andStrWmsUrlEqualTo(String value) {
            addCriterion("de_wmsurl =", CadenaUtil.getStr(value), "de_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlNotEqualTo(String value) {
            addCriterion("de_wmsurl <>", CadenaUtil.getStr(value), "de_wmsurl");
            return (Criteria) this;
        }

        
        public Criteria andStrWmsUrlIsNull() {
            addCriterion("de_wmsurl is null");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlIsNotNull() {
            addCriterion("de_wmsurl is not null");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlGreaterThan(String value) {
            addCriterion("de_wmsurl >", value, "de_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("de_wmsurl >=", value, "de_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlLessThan(String value) {
            addCriterion("de_wmsurl <", value, "de_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlLessThanOrEqualTo(String value) {
            addCriterion("de_wmsurl <=", value, "de_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlIn(List<String> values) {
            addCriterion("de_wmsurl in", values, "de_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlNotIn(List<String> values) {
            addCriterion("de_wmsurl not in", values, "de_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlBetween(String value1, String value2) {
            addCriterion("de_wmsurl between", value1, value2, "de_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlNotBetween(String value1, String value2) {
            addCriterion("de_wmsurl not between", value1, value2, "de_wmsurl");
            return (Criteria) this;
        }
        
        
        public Criteria andStrWmsCapasLike(String value) {
            addCriterion("upper(de_wmscapa) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_wmscapa");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasNotLike(String value) {
            addCriterion("de_wmscapa not like", "%" + CadenaUtil.getStr(value) + "%", "de_wmscapa");
            return (Criteria) this;
        }
			
        public Criteria andStrWmsCapasEqualTo(String value) {
            addCriterion("de_wmscapa =", CadenaUtil.getStr(value), "de_wmscapa");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasNotEqualTo(String value) {
            addCriterion("de_wmscapa <>", CadenaUtil.getStr(value), "de_wmscapa");
            return (Criteria) this;
        }

        
        public Criteria andStrWmsCapasIsNull() {
            addCriterion("de_wmscapa is null");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasIsNotNull() {
            addCriterion("de_wmscapa is not null");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasGreaterThan(String value) {
            addCriterion("de_wmscapa >", value, "de_wmscapa");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasGreaterThanOrEqualTo(String value) {
            addCriterion("de_wmscapa >=", value, "de_wmscapa");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasLessThan(String value) {
            addCriterion("de_wmscapa <", value, "de_wmscapa");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasLessThanOrEqualTo(String value) {
            addCriterion("de_wmscapa <=", value, "de_wmscapa");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasIn(List<String> values) {
            addCriterion("de_wmscapa in", values, "de_wmscapa");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasNotIn(List<String> values) {
            addCriterion("de_wmscapa not in", values, "de_wmscapa");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasBetween(String value1, String value2) {
            addCriterion("de_wmscapa between", value1, value2, "de_wmscapa");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasNotBetween(String value1, String value2) {
            addCriterion("de_wmscapa not between", value1, value2, "de_wmscapa");
            return (Criteria) this;
        }
        
        
        public Criteria andStrWfsUrlLike(String value) {
            addCriterion("upper(de_wfsurl) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlNotLike(String value) {
            addCriterion("de_wfsurl not like", "%" + CadenaUtil.getStr(value) + "%", "de_wfsurl");
            return (Criteria) this;
        }
			
        public Criteria andStrWfsUrlEqualTo(String value) {
            addCriterion("de_wfsurl =", CadenaUtil.getStr(value), "de_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlNotEqualTo(String value) {
            addCriterion("de_wfsurl <>", CadenaUtil.getStr(value), "de_wfsurl");
            return (Criteria) this;
        }

        
        public Criteria andStrWfsUrlIsNull() {
            addCriterion("de_wfsurl is null");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlIsNotNull() {
            addCriterion("de_wfsurl is not null");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlGreaterThan(String value) {
            addCriterion("de_wfsurl >", value, "de_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("de_wfsurl >=", value, "de_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlLessThan(String value) {
            addCriterion("de_wfsurl <", value, "de_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlLessThanOrEqualTo(String value) {
            addCriterion("de_wfsurl <=", value, "de_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlIn(List<String> values) {
            addCriterion("de_wfsurl in", values, "de_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlNotIn(List<String> values) {
            addCriterion("de_wfsurl not in", values, "de_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlBetween(String value1, String value2) {
            addCriterion("de_wfsurl between", value1, value2, "de_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlNotBetween(String value1, String value2) {
            addCriterion("de_wfsurl not between", value1, value2, "de_wfsurl");
            return (Criteria) this;
        }
        
        
        public Criteria andTimFechaRegistroEqualTo(Date value) {
            addCriterion("fc_fecreg =", value, "fc_fecreg");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroNotEqualTo(Date value) {
            addCriterion("fc_fecreg <>", value, "fc_fecreg");
            return (Criteria) this;
        }
        
        
        public Criteria andTimFechaRegistroIsNull() {
            addCriterion("fc_fecreg is null");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroIsNotNull() {
            addCriterion("fc_fecreg is not null");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroGreaterThan(Date value) {
            addCriterion("fc_fecreg >", value, "fc_fecreg");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroGreaterThanOrEqualTo(Date value) {
            addCriterion("fc_fecreg >=", value, "fc_fecreg");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroLessThan(Date value) {
            addCriterion("fc_fecreg <", value, "fc_fecreg");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroLessThanOrEqualTo(Date value) {
            addCriterion("fc_fecreg <=", value, "fc_fecreg");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroIn(List<Date> values) {
            addCriterion("fc_fecreg in", values, "fc_fecreg");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroNotIn(List<Date> values) {
            addCriterion("fc_fecreg not in", values, "fc_fecreg");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroBetween(Date value1, Date value2) {
            addCriterion("fc_fecreg between", value1, value2, "fc_fecreg");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroNotBetween(Date value1, Date value2) {
            addCriterion("fc_fecreg not between", value1, value2, "fc_fecreg");
            return (Criteria) this;
        }
        
        public Criteria andIntIdUsuarioEqualTo(Integer value) {
//            addCriterion("cd_usuario =", value, "cd_usuario");
            addCriterion("(cd_usuario is null or cd_usuario = "+value+")");
            return (Criteria) this;
        }
        public Criteria andIntIdUsuarioIsNull() {
            addCriterion("cd_usuario is null");
            return (Criteria) this;
        }
        
        public Criteria andStrEsActivaEqualTo(String value) {
            addCriterion("de_es_activa =", CadenaUtil.getStr(value), "de_es_activa");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
	
}
