package wcmc.hef.dao.configuracion.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class CapasBaseParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CapasBaseParamDef() {
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
        
                
        
        public Criteria andSrlIdCapasBaseEqualTo(Integer value) {
            addCriterion("id_capasbase =", value, "id_capasbase");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapasBaseNotEqualTo(Integer value) {
            addCriterion("id_capasbase <>", value, "id_capasbase");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdCapasBaseIsNull() {
            addCriterion("id_capasbase is null");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapasBaseIsNotNull() {
            addCriterion("id_capasbase is not null");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapasBaseGreaterThan(Integer value) {
            addCriterion("id_capasbase >", value, "id_capasbase");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapasBaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_capasbase >=", value, "id_capasbase");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapasBaseLessThan(Integer value) {
            addCriterion("id_capasbase <", value, "id_capasbase");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapasBaseLessThanOrEqualTo(Integer value) {
            addCriterion("id_capasbase <=", value, "id_capasbase");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapasBaseIn(List<Integer> values) {
            addCriterion("id_capasbase in", values, "id_capasbase");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapasBaseNotIn(List<Integer> values) {
            addCriterion("id_capasbase not in", values, "id_capasbase");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapasBaseBetween(Integer value1, Integer value2) {
            addCriterion("id_capasbase between", value1, value2, "id_capasbase");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapasBaseNotBetween(Integer value1, Integer value2) {
            addCriterion("id_capasbase not between", value1, value2, "id_capasbase");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombreLike(String value) {
            addCriterion("upper(des_nombre) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotLike(String value) {
            addCriterion("des_nombre not like", "%" + CadenaUtil.getStr(value) + "%", "des_nombre");
            return (Criteria) this;
        }
			
        public Criteria andStrNombreEqualTo(String value) {
            addCriterion("des_nombre =", CadenaUtil.getStr(value), "des_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotEqualTo(String value) {
            addCriterion("des_nombre <>", CadenaUtil.getStr(value), "des_nombre");
            return (Criteria) this;
        }

        
        public Criteria andStrNombreIsNull() {
            addCriterion("des_nombre is null");
            return (Criteria) this;
        }

        public Criteria andStrNombreIsNotNull() {
            addCriterion("des_nombre is not null");
            return (Criteria) this;
        }

        public Criteria andStrNombreGreaterThan(String value) {
            addCriterion("des_nombre >", value, "des_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreGreaterThanOrEqualTo(String value) {
            addCriterion("des_nombre >=", value, "des_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreLessThan(String value) {
            addCriterion("des_nombre <", value, "des_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreLessThanOrEqualTo(String value) {
            addCriterion("des_nombre <=", value, "des_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreIn(List<String> values) {
            addCriterion("des_nombre in", values, "des_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotIn(List<String> values) {
            addCriterion("des_nombre not in", values, "des_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreBetween(String value1, String value2) {
            addCriterion("des_nombre between", value1, value2, "des_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotBetween(String value1, String value2) {
            addCriterion("des_nombre not between", value1, value2, "des_nombre");
            return (Criteria) this;
        }
        
        
        public Criteria andStrComentariosLike(String value) {
            addCriterion("upper(des_comentarios) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_comentarios");
            return (Criteria) this;
        }

        public Criteria andStrComentariosNotLike(String value) {
            addCriterion("des_comentarios not like", "%" + CadenaUtil.getStr(value) + "%", "des_comentarios");
            return (Criteria) this;
        }
			
        public Criteria andStrComentariosEqualTo(String value) {
            addCriterion("des_comentarios =", CadenaUtil.getStr(value), "des_comentarios");
            return (Criteria) this;
        }

        public Criteria andStrComentariosNotEqualTo(String value) {
            addCriterion("des_comentarios <>", CadenaUtil.getStr(value), "des_comentarios");
            return (Criteria) this;
        }

        
        public Criteria andStrComentariosIsNull() {
            addCriterion("des_comentarios is null");
            return (Criteria) this;
        }

        public Criteria andStrComentariosIsNotNull() {
            addCriterion("des_comentarios is not null");
            return (Criteria) this;
        }

        public Criteria andStrComentariosGreaterThan(String value) {
            addCriterion("des_comentarios >", value, "des_comentarios");
            return (Criteria) this;
        }

        public Criteria andStrComentariosGreaterThanOrEqualTo(String value) {
            addCriterion("des_comentarios >=", value, "des_comentarios");
            return (Criteria) this;
        }

        public Criteria andStrComentariosLessThan(String value) {
            addCriterion("des_comentarios <", value, "des_comentarios");
            return (Criteria) this;
        }

        public Criteria andStrComentariosLessThanOrEqualTo(String value) {
            addCriterion("des_comentarios <=", value, "des_comentarios");
            return (Criteria) this;
        }

        public Criteria andStrComentariosIn(List<String> values) {
            addCriterion("des_comentarios in", values, "des_comentarios");
            return (Criteria) this;
        }

        public Criteria andStrComentariosNotIn(List<String> values) {
            addCriterion("des_comentarios not in", values, "des_comentarios");
            return (Criteria) this;
        }

        public Criteria andStrComentariosBetween(String value1, String value2) {
            addCriterion("des_comentarios between", value1, value2, "des_comentarios");
            return (Criteria) this;
        }

        public Criteria andStrComentariosNotBetween(String value1, String value2) {
            addCriterion("des_comentarios not between", value1, value2, "des_comentarios");
            return (Criteria) this;
        }
        
        
        public Criteria andStrUrlLike(String value) {
            addCriterion("upper(des_url) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlNotLike(String value) {
            addCriterion("des_url not like", "%" + CadenaUtil.getStr(value) + "%", "des_url");
            return (Criteria) this;
        }
			
        public Criteria andStrUrlEqualTo(String value) {
            addCriterion("des_url =", CadenaUtil.getStr(value), "des_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlNotEqualTo(String value) {
            addCriterion("des_url <>", CadenaUtil.getStr(value), "des_url");
            return (Criteria) this;
        }

        
        public Criteria andStrUrlIsNull() {
            addCriterion("des_url is null");
            return (Criteria) this;
        }

        public Criteria andStrUrlIsNotNull() {
            addCriterion("des_url is not null");
            return (Criteria) this;
        }

        public Criteria andStrUrlGreaterThan(String value) {
            addCriterion("des_url >", value, "des_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlGreaterThanOrEqualTo(String value) {
            addCriterion("des_url >=", value, "des_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlLessThan(String value) {
            addCriterion("des_url <", value, "des_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlLessThanOrEqualTo(String value) {
            addCriterion("des_url <=", value, "des_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlIn(List<String> values) {
            addCriterion("des_url in", values, "des_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlNotIn(List<String> values) {
            addCriterion("des_url not in", values, "des_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlBetween(String value1, String value2) {
            addCriterion("des_url between", value1, value2, "des_url");
            return (Criteria) this;
        }

        public Criteria andStrUrlNotBetween(String value1, String value2) {
            addCriterion("des_url not between", value1, value2, "des_url");
            return (Criteria) this;
        }
        
        
        public Criteria andTimFechaRegistroEqualTo(Date value) {
            addCriterion("fec_registro =", value, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroNotEqualTo(Date value) {
            addCriterion("fec_registro <>", value, "fec_registro");
            return (Criteria) this;
        }
        
        
        public Criteria andTimFechaRegistroIsNull() {
            addCriterion("fec_registro is null");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroIsNotNull() {
            addCriterion("fec_registro is not null");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroGreaterThan(Date value) {
            addCriterion("fec_registro >", value, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroGreaterThanOrEqualTo(Date value) {
            addCriterion("fec_registro >=", value, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroLessThan(Date value) {
            addCriterion("fec_registro <", value, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroLessThanOrEqualTo(Date value) {
            addCriterion("fec_registro <=", value, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroIn(List<Date> values) {
            addCriterion("fec_registro in", values, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroNotIn(List<Date> values) {
            addCriterion("fec_registro not in", values, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroBetween(Date value1, Date value2) {
            addCriterion("fec_registro between", value1, value2, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroNotBetween(Date value1, Date value2) {
            addCriterion("fec_registro not between", value1, value2, "fec_registro");
            return (Criteria) this;
        }
        
        
        public Criteria andStrWmsUrlLike(String value) {
            addCriterion("upper(des_wmsurl) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlNotLike(String value) {
            addCriterion("des_wmsurl not like", "%" + CadenaUtil.getStr(value) + "%", "des_wmsurl");
            return (Criteria) this;
        }
			
        public Criteria andStrWmsUrlEqualTo(String value) {
            addCriterion("des_wmsurl =", CadenaUtil.getStr(value), "des_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlNotEqualTo(String value) {
            addCriterion("des_wmsurl <>", CadenaUtil.getStr(value), "des_wmsurl");
            return (Criteria) this;
        }

        
        public Criteria andStrWmsUrlIsNull() {
            addCriterion("des_wmsurl is null");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlIsNotNull() {
            addCriterion("des_wmsurl is not null");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlGreaterThan(String value) {
            addCriterion("des_wmsurl >", value, "des_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("des_wmsurl >=", value, "des_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlLessThan(String value) {
            addCriterion("des_wmsurl <", value, "des_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlLessThanOrEqualTo(String value) {
            addCriterion("des_wmsurl <=", value, "des_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlIn(List<String> values) {
            addCriterion("des_wmsurl in", values, "des_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlNotIn(List<String> values) {
            addCriterion("des_wmsurl not in", values, "des_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlBetween(String value1, String value2) {
            addCriterion("des_wmsurl between", value1, value2, "des_wmsurl");
            return (Criteria) this;
        }

        public Criteria andStrWmsUrlNotBetween(String value1, String value2) {
            addCriterion("des_wmsurl not between", value1, value2, "des_wmsurl");
            return (Criteria) this;
        }
        
        
        public Criteria andStrWmsCapasLike(String value) {
            addCriterion("upper(des_wmscapas) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_wmscapas");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasNotLike(String value) {
            addCriterion("des_wmscapas not like", "%" + CadenaUtil.getStr(value) + "%", "des_wmscapas");
            return (Criteria) this;
        }
			
        public Criteria andStrWmsCapasEqualTo(String value) {
            addCriterion("des_wmscapas =", CadenaUtil.getStr(value), "des_wmscapas");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasNotEqualTo(String value) {
            addCriterion("des_wmscapas <>", CadenaUtil.getStr(value), "des_wmscapas");
            return (Criteria) this;
        }

        
        public Criteria andStrWmsCapasIsNull() {
            addCriterion("des_wmscapas is null");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasIsNotNull() {
            addCriterion("des_wmscapas is not null");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasGreaterThan(String value) {
            addCriterion("des_wmscapas >", value, "des_wmscapas");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasGreaterThanOrEqualTo(String value) {
            addCriterion("des_wmscapas >=", value, "des_wmscapas");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasLessThan(String value) {
            addCriterion("des_wmscapas <", value, "des_wmscapas");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasLessThanOrEqualTo(String value) {
            addCriterion("des_wmscapas <=", value, "des_wmscapas");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasIn(List<String> values) {
            addCriterion("des_wmscapas in", values, "des_wmscapas");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasNotIn(List<String> values) {
            addCriterion("des_wmscapas not in", values, "des_wmscapas");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasBetween(String value1, String value2) {
            addCriterion("des_wmscapas between", value1, value2, "des_wmscapas");
            return (Criteria) this;
        }

        public Criteria andStrWmsCapasNotBetween(String value1, String value2) {
            addCriterion("des_wmscapas not between", value1, value2, "des_wmscapas");
            return (Criteria) this;
        }
        
        
        public Criteria andStrWfsUrlLike(String value) {
            addCriterion("upper(des_wfsurl) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlNotLike(String value) {
            addCriterion("des_wfsurl not like", "%" + CadenaUtil.getStr(value) + "%", "des_wfsurl");
            return (Criteria) this;
        }
			
        public Criteria andStrWfsUrlEqualTo(String value) {
            addCriterion("des_wfsurl =", CadenaUtil.getStr(value), "des_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlNotEqualTo(String value) {
            addCriterion("des_wfsurl <>", CadenaUtil.getStr(value), "des_wfsurl");
            return (Criteria) this;
        }

        
        public Criteria andStrWfsUrlIsNull() {
            addCriterion("des_wfsurl is null");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlIsNotNull() {
            addCriterion("des_wfsurl is not null");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlGreaterThan(String value) {
            addCriterion("des_wfsurl >", value, "des_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("des_wfsurl >=", value, "des_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlLessThan(String value) {
            addCriterion("des_wfsurl <", value, "des_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlLessThanOrEqualTo(String value) {
            addCriterion("des_wfsurl <=", value, "des_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlIn(List<String> values) {
            addCriterion("des_wfsurl in", values, "des_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlNotIn(List<String> values) {
            addCriterion("des_wfsurl not in", values, "des_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlBetween(String value1, String value2) {
            addCriterion("des_wfsurl between", value1, value2, "des_wfsurl");
            return (Criteria) this;
        }

        public Criteria andStrWfsUrlNotBetween(String value1, String value2) {
            addCriterion("des_wfsurl not between", value1, value2, "des_wfsurl");
            return (Criteria) this;
        }
        
        
        public Criteria andIntGrupoCapasEqualTo(Integer value) {
            addCriterion("id_grupocapas =", value, "id_grupocapas");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasNotEqualTo(Integer value) {
            addCriterion("id_grupocapas <>", value, "id_grupocapas");
            return (Criteria) this;
        }
        
        
        public Criteria andIntGrupoCapasIsNull() {
            addCriterion("id_grupocapas is null");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasIsNotNull() {
            addCriterion("id_grupocapas is not null");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasGreaterThan(Integer value) {
            addCriterion("id_grupocapas >", value, "id_grupocapas");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_grupocapas >=", value, "id_grupocapas");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasLessThan(Integer value) {
            addCriterion("id_grupocapas <", value, "id_grupocapas");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasLessThanOrEqualTo(Integer value) {
            addCriterion("id_grupocapas <=", value, "id_grupocapas");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasIn(List<Integer> values) {
            addCriterion("id_grupocapas in", values, "id_grupocapas");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasNotIn(List<Integer> values) {
            addCriterion("id_grupocapas not in", values, "id_grupocapas");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasBetween(Integer value1, Integer value2) {
            addCriterion("id_grupocapas between", value1, value2, "id_grupocapas");
            return (Criteria) this;
        }

        public Criteria andIntGrupoCapasNotBetween(Integer value1, Integer value2) {
            addCriterion("id_grupocapas not between", value1, value2, "id_grupocapas");
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
