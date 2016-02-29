package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class TemSoeconSolicitudCreacionReservasTerritorialesParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TemSoeconSolicitudCreacionReservasTerritorialesParamDef() {
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
        
                
        
        public Criteria andSrlGidEqualTo(Integer value) {
            addCriterion("cd_gid =", value, "cd_gid");
            return (Criteria) this;
        }

        public Criteria andSrlGidNotEqualTo(Integer value) {
            addCriterion("cd_gid <>", value, "cd_gid");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlGidIsNull() {
            addCriterion("cd_gid is null");
            return (Criteria) this;
        }

        public Criteria andSrlGidIsNotNull() {
            addCriterion("cd_gid is not null");
            return (Criteria) this;
        }

        public Criteria andSrlGidGreaterThan(Integer value) {
            addCriterion("cd_gid >", value, "cd_gid");
            return (Criteria) this;
        }

        public Criteria andSrlGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_gid >=", value, "cd_gid");
            return (Criteria) this;
        }

        public Criteria andSrlGidLessThan(Integer value) {
            addCriterion("cd_gid <", value, "cd_gid");
            return (Criteria) this;
        }

        public Criteria andSrlGidLessThanOrEqualTo(Integer value) {
            addCriterion("cd_gid <=", value, "cd_gid");
            return (Criteria) this;
        }

        public Criteria andSrlGidIn(List<Integer> values) {
            addCriterion("cd_gid in", values, "cd_gid");
            return (Criteria) this;
        }

        public Criteria andSrlGidNotIn(List<Integer> values) {
            addCriterion("cd_gid not in", values, "cd_gid");
            return (Criteria) this;
        }

        public Criteria andSrlGidBetween(Integer value1, Integer value2) {
            addCriterion("cd_gid between", value1, value2, "cd_gid");
            return (Criteria) this;
        }

        public Criteria andSrlGidNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_gid not between", value1, value2, "cd_gid");
            return (Criteria) this;
        }
        
        
        public Criteria andStrTheGeomLike(String value) {
            addCriterion("upper(si_the_geom) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomNotLike(String value) {
            addCriterion("si_the_geom not like", "%" + CadenaUtil.getStr(value) + "%", "si_the_geom");
            return (Criteria) this;
        }
			
        public Criteria andStrTheGeomEqualTo(String value) {
            addCriterion("si_the_geom =", CadenaUtil.getStr(value), "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomNotEqualTo(String value) {
            addCriterion("si_the_geom <>", CadenaUtil.getStr(value), "si_the_geom");
            return (Criteria) this;
        }

        
        public Criteria andStrTheGeomIsNull() {
            addCriterion("si_the_geom is null");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomIsNotNull() {
            addCriterion("si_the_geom is not null");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomGreaterThan(String value) {
            addCriterion("si_the_geom >", value, "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomGreaterThanOrEqualTo(String value) {
            addCriterion("si_the_geom >=", value, "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomLessThan(String value) {
            addCriterion("si_the_geom <", value, "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomLessThanOrEqualTo(String value) {
            addCriterion("si_the_geom <=", value, "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomIn(List<String> values) {
            addCriterion("si_the_geom in", values, "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomNotIn(List<String> values) {
            addCriterion("si_the_geom not in", values, "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomBetween(String value1, String value2) {
            addCriterion("si_the_geom between", value1, value2, "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomNotBetween(String value1, String value2) {
            addCriterion("si_the_geom not between", value1, value2, "si_the_geom");
            return (Criteria) this;
        }
        
        
        public Criteria andIntObjectid1EqualTo(Integer value) {
            addCriterion("cd_objectid_1 =", value, "cd_objectid_1");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1NotEqualTo(Integer value) {
            addCriterion("cd_objectid_1 <>", value, "cd_objectid_1");
            return (Criteria) this;
        }
        
        
        public Criteria andIntObjectid1IsNull() {
            addCriterion("cd_objectid_1 is null");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1IsNotNull() {
            addCriterion("cd_objectid_1 is not null");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1GreaterThan(Integer value) {
            addCriterion("cd_objectid_1 >", value, "cd_objectid_1");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1GreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_objectid_1 >=", value, "cd_objectid_1");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1LessThan(Integer value) {
            addCriterion("cd_objectid_1 <", value, "cd_objectid_1");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1LessThanOrEqualTo(Integer value) {
            addCriterion("cd_objectid_1 <=", value, "cd_objectid_1");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1In(List<Integer> values) {
            addCriterion("cd_objectid_1 in", values, "cd_objectid_1");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1NotIn(List<Integer> values) {
            addCriterion("cd_objectid_1 not in", values, "cd_objectid_1");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1Between(Integer value1, Integer value2) {
            addCriterion("cd_objectid_1 between", value1, value2, "cd_objectid_1");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1NotBetween(Integer value1, Integer value2) {
            addCriterion("cd_objectid_1 not between", value1, value2, "cd_objectid_1");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomretLike(String value) {
            addCriterion("upper(de_nomret) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_nomret");
            return (Criteria) this;
        }

        public Criteria andStrNomretNotLike(String value) {
            addCriterion("de_nomret not like", "%" + CadenaUtil.getStr(value) + "%", "de_nomret");
            return (Criteria) this;
        }
			
        public Criteria andStrNomretEqualTo(String value) {
            addCriterion("de_nomret =", CadenaUtil.getStr(value), "de_nomret");
            return (Criteria) this;
        }

        public Criteria andStrNomretNotEqualTo(String value) {
            addCriterion("de_nomret <>", CadenaUtil.getStr(value), "de_nomret");
            return (Criteria) this;
        }

        
        public Criteria andStrNomretIsNull() {
            addCriterion("de_nomret is null");
            return (Criteria) this;
        }

        public Criteria andStrNomretIsNotNull() {
            addCriterion("de_nomret is not null");
            return (Criteria) this;
        }

        public Criteria andStrNomretGreaterThan(String value) {
            addCriterion("de_nomret >", value, "de_nomret");
            return (Criteria) this;
        }

        public Criteria andStrNomretGreaterThanOrEqualTo(String value) {
            addCriterion("de_nomret >=", value, "de_nomret");
            return (Criteria) this;
        }

        public Criteria andStrNomretLessThan(String value) {
            addCriterion("de_nomret <", value, "de_nomret");
            return (Criteria) this;
        }

        public Criteria andStrNomretLessThanOrEqualTo(String value) {
            addCriterion("de_nomret <=", value, "de_nomret");
            return (Criteria) this;
        }

        public Criteria andStrNomretIn(List<String> values) {
            addCriterion("de_nomret in", values, "de_nomret");
            return (Criteria) this;
        }

        public Criteria andStrNomretNotIn(List<String> values) {
            addCriterion("de_nomret not in", values, "de_nomret");
            return (Criteria) this;
        }

        public Criteria andStrNomretBetween(String value1, String value2) {
            addCriterion("de_nomret between", value1, value2, "de_nomret");
            return (Criteria) this;
        }

        public Criteria andStrNomretNotBetween(String value1, String value2) {
            addCriterion("de_nomret not between", value1, value2, "de_nomret");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCategoLike(String value) {
            addCriterion("upper(de_catego) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_catego");
            return (Criteria) this;
        }

        public Criteria andStrCategoNotLike(String value) {
            addCriterion("de_catego not like", "%" + CadenaUtil.getStr(value) + "%", "de_catego");
            return (Criteria) this;
        }
			
        public Criteria andStrCategoEqualTo(String value) {
            addCriterion("de_catego =", CadenaUtil.getStr(value), "de_catego");
            return (Criteria) this;
        }

        public Criteria andStrCategoNotEqualTo(String value) {
            addCriterion("de_catego <>", CadenaUtil.getStr(value), "de_catego");
            return (Criteria) this;
        }

        
        public Criteria andStrCategoIsNull() {
            addCriterion("de_catego is null");
            return (Criteria) this;
        }

        public Criteria andStrCategoIsNotNull() {
            addCriterion("de_catego is not null");
            return (Criteria) this;
        }

        public Criteria andStrCategoGreaterThan(String value) {
            addCriterion("de_catego >", value, "de_catego");
            return (Criteria) this;
        }

        public Criteria andStrCategoGreaterThanOrEqualTo(String value) {
            addCriterion("de_catego >=", value, "de_catego");
            return (Criteria) this;
        }

        public Criteria andStrCategoLessThan(String value) {
            addCriterion("de_catego <", value, "de_catego");
            return (Criteria) this;
        }

        public Criteria andStrCategoLessThanOrEqualTo(String value) {
            addCriterion("de_catego <=", value, "de_catego");
            return (Criteria) this;
        }

        public Criteria andStrCategoIn(List<String> values) {
            addCriterion("de_catego in", values, "de_catego");
            return (Criteria) this;
        }

        public Criteria andStrCategoNotIn(List<String> values) {
            addCriterion("de_catego not in", values, "de_catego");
            return (Criteria) this;
        }

        public Criteria andStrCategoBetween(String value1, String value2) {
            addCriterion("de_catego between", value1, value2, "de_catego");
            return (Criteria) this;
        }

        public Criteria andStrCategoNotBetween(String value1, String value2) {
            addCriterion("de_catego not between", value1, value2, "de_catego");
            return (Criteria) this;
        }
        
        
        public Criteria andStrUbipolLike(String value) {
            addCriterion("upper(de_ubipol) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_ubipol");
            return (Criteria) this;
        }

        public Criteria andStrUbipolNotLike(String value) {
            addCriterion("de_ubipol not like", "%" + CadenaUtil.getStr(value) + "%", "de_ubipol");
            return (Criteria) this;
        }
			
        public Criteria andStrUbipolEqualTo(String value) {
            addCriterion("de_ubipol =", CadenaUtil.getStr(value), "de_ubipol");
            return (Criteria) this;
        }

        public Criteria andStrUbipolNotEqualTo(String value) {
            addCriterion("de_ubipol <>", CadenaUtil.getStr(value), "de_ubipol");
            return (Criteria) this;
        }

        
        public Criteria andStrUbipolIsNull() {
            addCriterion("de_ubipol is null");
            return (Criteria) this;
        }

        public Criteria andStrUbipolIsNotNull() {
            addCriterion("de_ubipol is not null");
            return (Criteria) this;
        }

        public Criteria andStrUbipolGreaterThan(String value) {
            addCriterion("de_ubipol >", value, "de_ubipol");
            return (Criteria) this;
        }

        public Criteria andStrUbipolGreaterThanOrEqualTo(String value) {
            addCriterion("de_ubipol >=", value, "de_ubipol");
            return (Criteria) this;
        }

        public Criteria andStrUbipolLessThan(String value) {
            addCriterion("de_ubipol <", value, "de_ubipol");
            return (Criteria) this;
        }

        public Criteria andStrUbipolLessThanOrEqualTo(String value) {
            addCriterion("de_ubipol <=", value, "de_ubipol");
            return (Criteria) this;
        }

        public Criteria andStrUbipolIn(List<String> values) {
            addCriterion("de_ubipol in", values, "de_ubipol");
            return (Criteria) this;
        }

        public Criteria andStrUbipolNotIn(List<String> values) {
            addCriterion("de_ubipol not in", values, "de_ubipol");
            return (Criteria) this;
        }

        public Criteria andStrUbipolBetween(String value1, String value2) {
            addCriterion("de_ubipol between", value1, value2, "de_ubipol");
            return (Criteria) this;
        }

        public Criteria andStrUbipolNotBetween(String value1, String value2) {
            addCriterion("de_ubipol not between", value1, value2, "de_ubipol");
            return (Criteria) this;
        }
        
        
        public Criteria andDblArelegEqualTo(Double value) {
            addCriterion("ha_areleg =", value, "ha_areleg");
            return (Criteria) this;
        }

        public Criteria andDblArelegNotEqualTo(Double value) {
            addCriterion("ha_areleg <>", value, "ha_areleg");
            return (Criteria) this;
        }
        
        
        public Criteria andDblArelegIsNull() {
            addCriterion("ha_areleg is null");
            return (Criteria) this;
        }

        public Criteria andDblArelegIsNotNull() {
            addCriterion("ha_areleg is not null");
            return (Criteria) this;
        }

        public Criteria andDblArelegGreaterThan(Double value) {
            addCriterion("ha_areleg >", value, "ha_areleg");
            return (Criteria) this;
        }

        public Criteria andDblArelegGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_areleg >=", value, "ha_areleg");
            return (Criteria) this;
        }

        public Criteria andDblArelegLessThan(Double value) {
            addCriterion("ha_areleg <", value, "ha_areleg");
            return (Criteria) this;
        }

        public Criteria andDblArelegLessThanOrEqualTo(Double value) {
            addCriterion("ha_areleg <=", value, "ha_areleg");
            return (Criteria) this;
        }

        public Criteria andDblArelegIn(List<Double> values) {
            addCriterion("ha_areleg in", values, "ha_areleg");
            return (Criteria) this;
        }

        public Criteria andDblArelegNotIn(List<Double> values) {
            addCriterion("ha_areleg not in", values, "ha_areleg");
            return (Criteria) this;
        }

        public Criteria andDblArelegBetween(Double value1, Double value2) {
            addCriterion("ha_areleg between", value1, value2, "ha_areleg");
            return (Criteria) this;
        }

        public Criteria andDblArelegNotBetween(Double value1, Double value2) {
            addCriterion("ha_areleg not between", value1, value2, "ha_areleg");
            return (Criteria) this;
        }
        
        
        public Criteria andStrEstadoLike(String value) {
            addCriterion("upper(de_estado) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_estado");
            return (Criteria) this;
        }

        public Criteria andStrEstadoNotLike(String value) {
            addCriterion("de_estado not like", "%" + CadenaUtil.getStr(value) + "%", "de_estado");
            return (Criteria) this;
        }
			
        public Criteria andStrEstadoEqualTo(String value) {
            addCriterion("de_estado =", CadenaUtil.getStr(value), "de_estado");
            return (Criteria) this;
        }

        public Criteria andStrEstadoNotEqualTo(String value) {
            addCriterion("de_estado <>", CadenaUtil.getStr(value), "de_estado");
            return (Criteria) this;
        }

        
        public Criteria andStrEstadoIsNull() {
            addCriterion("de_estado is null");
            return (Criteria) this;
        }

        public Criteria andStrEstadoIsNotNull() {
            addCriterion("de_estado is not null");
            return (Criteria) this;
        }

        public Criteria andStrEstadoGreaterThan(String value) {
            addCriterion("de_estado >", value, "de_estado");
            return (Criteria) this;
        }

        public Criteria andStrEstadoGreaterThanOrEqualTo(String value) {
            addCriterion("de_estado >=", value, "de_estado");
            return (Criteria) this;
        }

        public Criteria andStrEstadoLessThan(String value) {
            addCriterion("de_estado <", value, "de_estado");
            return (Criteria) this;
        }

        public Criteria andStrEstadoLessThanOrEqualTo(String value) {
            addCriterion("de_estado <=", value, "de_estado");
            return (Criteria) this;
        }

        public Criteria andStrEstadoIn(List<String> values) {
            addCriterion("de_estado in", values, "de_estado");
            return (Criteria) this;
        }

        public Criteria andStrEstadoNotIn(List<String> values) {
            addCriterion("de_estado not in", values, "de_estado");
            return (Criteria) this;
        }

        public Criteria andStrEstadoBetween(String value1, String value2) {
            addCriterion("de_estado between", value1, value2, "de_estado");
            return (Criteria) this;
        }

        public Criteria andStrEstadoNotBetween(String value1, String value2) {
            addCriterion("de_estado not between", value1, value2, "de_estado");
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
