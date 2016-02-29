package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class OpbParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OpbParamDef() {
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
        
        
        public Criteria andStrModalidadLike(String value) {
            addCriterion("upper(de_modalidad) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_modalidad");
            return (Criteria) this;
        }

        public Criteria andStrModalidadNotLike(String value) {
            addCriterion("de_modalidad not like", "%" + CadenaUtil.getStr(value) + "%", "de_modalidad");
            return (Criteria) this;
        }
			
        public Criteria andStrModalidadEqualTo(String value) {
            addCriterion("de_modalidad =", CadenaUtil.getStr(value), "de_modalidad");
            return (Criteria) this;
        }

        public Criteria andStrModalidadNotEqualTo(String value) {
            addCriterion("de_modalidad <>", CadenaUtil.getStr(value), "de_modalidad");
            return (Criteria) this;
        }

        
        public Criteria andStrModalidadIsNull() {
            addCriterion("de_modalidad is null");
            return (Criteria) this;
        }

        public Criteria andStrModalidadIsNotNull() {
            addCriterion("de_modalidad is not null");
            return (Criteria) this;
        }

        public Criteria andStrModalidadGreaterThan(String value) {
            addCriterion("de_modalidad >", value, "de_modalidad");
            return (Criteria) this;
        }

        public Criteria andStrModalidadGreaterThanOrEqualTo(String value) {
            addCriterion("de_modalidad >=", value, "de_modalidad");
            return (Criteria) this;
        }

        public Criteria andStrModalidadLessThan(String value) {
            addCriterion("de_modalidad <", value, "de_modalidad");
            return (Criteria) this;
        }

        public Criteria andStrModalidadLessThanOrEqualTo(String value) {
            addCriterion("de_modalidad <=", value, "de_modalidad");
            return (Criteria) this;
        }

        public Criteria andStrModalidadIn(List<String> values) {
            addCriterion("de_modalidad in", values, "de_modalidad");
            return (Criteria) this;
        }

        public Criteria andStrModalidadNotIn(List<String> values) {
            addCriterion("de_modalidad not in", values, "de_modalidad");
            return (Criteria) this;
        }

        public Criteria andStrModalidadBetween(String value1, String value2) {
            addCriterion("de_modalidad between", value1, value2, "de_modalidad");
            return (Criteria) this;
        }

        public Criteria andStrModalidadNotBetween(String value1, String value2) {
            addCriterion("de_modalidad not between", value1, value2, "de_modalidad");
            return (Criteria) this;
        }
        
        
        public Criteria andStrTitularLike(String value) {
            addCriterion("upper(de_titular) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_titular");
            return (Criteria) this;
        }

        public Criteria andStrTitularNotLike(String value) {
            addCriterion("de_titular not like", "%" + CadenaUtil.getStr(value) + "%", "de_titular");
            return (Criteria) this;
        }
			
        public Criteria andStrTitularEqualTo(String value) {
            addCriterion("de_titular =", CadenaUtil.getStr(value), "de_titular");
            return (Criteria) this;
        }

        public Criteria andStrTitularNotEqualTo(String value) {
            addCriterion("de_titular <>", CadenaUtil.getStr(value), "de_titular");
            return (Criteria) this;
        }

        
        public Criteria andStrTitularIsNull() {
            addCriterion("de_titular is null");
            return (Criteria) this;
        }

        public Criteria andStrTitularIsNotNull() {
            addCriterion("de_titular is not null");
            return (Criteria) this;
        }

        public Criteria andStrTitularGreaterThan(String value) {
            addCriterion("de_titular >", value, "de_titular");
            return (Criteria) this;
        }

        public Criteria andStrTitularGreaterThanOrEqualTo(String value) {
            addCriterion("de_titular >=", value, "de_titular");
            return (Criteria) this;
        }

        public Criteria andStrTitularLessThan(String value) {
            addCriterion("de_titular <", value, "de_titular");
            return (Criteria) this;
        }

        public Criteria andStrTitularLessThanOrEqualTo(String value) {
            addCriterion("de_titular <=", value, "de_titular");
            return (Criteria) this;
        }

        public Criteria andStrTitularIn(List<String> values) {
            addCriterion("de_titular in", values, "de_titular");
            return (Criteria) this;
        }

        public Criteria andStrTitularNotIn(List<String> values) {
            addCriterion("de_titular not in", values, "de_titular");
            return (Criteria) this;
        }

        public Criteria andStrTitularBetween(String value1, String value2) {
            addCriterion("de_titular between", value1, value2, "de_titular");
            return (Criteria) this;
        }

        public Criteria andStrTitularNotBetween(String value1, String value2) {
            addCriterion("de_titular not between", value1, value2, "de_titular");
            return (Criteria) this;
        }
        
        
        public Criteria andStrContratoLike(String value) {
            addCriterion("upper(de_contrato) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_contrato");
            return (Criteria) this;
        }

        public Criteria andStrContratoNotLike(String value) {
            addCriterion("de_contrato not like", "%" + CadenaUtil.getStr(value) + "%", "de_contrato");
            return (Criteria) this;
        }
			
        public Criteria andStrContratoEqualTo(String value) {
            addCriterion("de_contrato =", CadenaUtil.getStr(value), "de_contrato");
            return (Criteria) this;
        }

        public Criteria andStrContratoNotEqualTo(String value) {
            addCriterion("de_contrato <>", CadenaUtil.getStr(value), "de_contrato");
            return (Criteria) this;
        }

        
        public Criteria andStrContratoIsNull() {
            addCriterion("de_contrato is null");
            return (Criteria) this;
        }

        public Criteria andStrContratoIsNotNull() {
            addCriterion("de_contrato is not null");
            return (Criteria) this;
        }

        public Criteria andStrContratoGreaterThan(String value) {
            addCriterion("de_contrato >", value, "de_contrato");
            return (Criteria) this;
        }

        public Criteria andStrContratoGreaterThanOrEqualTo(String value) {
            addCriterion("de_contrato >=", value, "de_contrato");
            return (Criteria) this;
        }

        public Criteria andStrContratoLessThan(String value) {
            addCriterion("de_contrato <", value, "de_contrato");
            return (Criteria) this;
        }

        public Criteria andStrContratoLessThanOrEqualTo(String value) {
            addCriterion("de_contrato <=", value, "de_contrato");
            return (Criteria) this;
        }

        public Criteria andStrContratoIn(List<String> values) {
            addCriterion("de_contrato in", values, "de_contrato");
            return (Criteria) this;
        }

        public Criteria andStrContratoNotIn(List<String> values) {
            addCriterion("de_contrato not in", values, "de_contrato");
            return (Criteria) this;
        }

        public Criteria andStrContratoBetween(String value1, String value2) {
            addCriterion("de_contrato between", value1, value2, "de_contrato");
            return (Criteria) this;
        }

        public Criteria andStrContratoNotBetween(String value1, String value2) {
            addCriterion("de_contrato not between", value1, value2, "de_contrato");
            return (Criteria) this;
        }
        
        
        public Criteria andStrRegionLike(String value) {
            addCriterion("upper(de_region) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionNotLike(String value) {
            addCriterion("de_region not like", "%" + CadenaUtil.getStr(value) + "%", "de_region");
            return (Criteria) this;
        }
			
        public Criteria andStrRegionEqualTo(String value) {
            addCriterion("de_region =", CadenaUtil.getStr(value), "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionNotEqualTo(String value) {
            addCriterion("de_region <>", CadenaUtil.getStr(value), "de_region");
            return (Criteria) this;
        }

        
        public Criteria andStrRegionIsNull() {
            addCriterion("de_region is null");
            return (Criteria) this;
        }

        public Criteria andStrRegionIsNotNull() {
            addCriterion("de_region is not null");
            return (Criteria) this;
        }

        public Criteria andStrRegionGreaterThan(String value) {
            addCriterion("de_region >", value, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionGreaterThanOrEqualTo(String value) {
            addCriterion("de_region >=", value, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionLessThan(String value) {
            addCriterion("de_region <", value, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionLessThanOrEqualTo(String value) {
            addCriterion("de_region <=", value, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionIn(List<String> values) {
            addCriterion("de_region in", values, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionNotIn(List<String> values) {
            addCriterion("de_region not in", values, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionBetween(String value1, String value2) {
            addCriterion("de_region between", value1, value2, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionNotBetween(String value1, String value2) {
            addCriterion("de_region not between", value1, value2, "de_region");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaSigEqualTo(Double value) {
            addCriterion("ha_area_sig =", value, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigNotEqualTo(Double value) {
            addCriterion("ha_area_sig <>", value, "ha_area_sig");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaSigIsNull() {
            addCriterion("ha_area_sig is null");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigIsNotNull() {
            addCriterion("ha_area_sig is not null");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigGreaterThan(Double value) {
            addCriterion("ha_area_sig >", value, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_area_sig >=", value, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigLessThan(Double value) {
            addCriterion("ha_area_sig <", value, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigLessThanOrEqualTo(Double value) {
            addCriterion("ha_area_sig <=", value, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigIn(List<Double> values) {
            addCriterion("ha_area_sig in", values, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigNotIn(List<Double> values) {
            addCriterion("ha_area_sig not in", values, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigBetween(Double value1, Double value2) {
            addCriterion("ha_area_sig between", value1, value2, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigNotBetween(Double value1, Double value2) {
            addCriterion("ha_area_sig not between", value1, value2, "ha_area_sig");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSituacionLike(String value) {
            addCriterion("upper(de_situacion) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionNotLike(String value) {
            addCriterion("de_situacion not like", "%" + CadenaUtil.getStr(value) + "%", "de_situacion");
            return (Criteria) this;
        }
			
        public Criteria andStrSituacionEqualTo(String value) {
            addCriterion("de_situacion =", CadenaUtil.getStr(value), "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionNotEqualTo(String value) {
            addCriterion("de_situacion <>", CadenaUtil.getStr(value), "de_situacion");
            return (Criteria) this;
        }

        
        public Criteria andStrSituacionIsNull() {
            addCriterion("de_situacion is null");
            return (Criteria) this;
        }

        public Criteria andStrSituacionIsNotNull() {
            addCriterion("de_situacion is not null");
            return (Criteria) this;
        }

        public Criteria andStrSituacionGreaterThan(String value) {
            addCriterion("de_situacion >", value, "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionGreaterThanOrEqualTo(String value) {
            addCriterion("de_situacion >=", value, "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionLessThan(String value) {
            addCriterion("de_situacion <", value, "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionLessThanOrEqualTo(String value) {
            addCriterion("de_situacion <=", value, "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionIn(List<String> values) {
            addCriterion("de_situacion in", values, "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionNotIn(List<String> values) {
            addCriterion("de_situacion not in", values, "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionBetween(String value1, String value2) {
            addCriterion("de_situacion between", value1, value2, "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionNotBetween(String value1, String value2) {
            addCriterion("de_situacion not between", value1, value2, "de_situacion");
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
