package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class ZonaAmortiguamientoEstablecidasParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZonaAmortiguamientoEstablecidasParamDef() {
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
        
        
        public Criteria andLngObjectidEqualTo(Long value) {
            addCriterion("cd_objectid =", value, "cd_objectid");
            return (Criteria) this;
        }

        public Criteria andLngObjectidNotEqualTo(Long value) {
            addCriterion("cd_objectid <>", value, "cd_objectid");
            return (Criteria) this;
        }
        
        
        public Criteria andLngObjectidIsNull() {
            addCriterion("cd_objectid is null");
            return (Criteria) this;
        }

        public Criteria andLngObjectidIsNotNull() {
            addCriterion("cd_objectid is not null");
            return (Criteria) this;
        }

        public Criteria andLngObjectidGreaterThan(Long value) {
            addCriterion("cd_objectid >", value, "cd_objectid");
            return (Criteria) this;
        }

        public Criteria andLngObjectidGreaterThanOrEqualTo(Long value) {
            addCriterion("cd_objectid >=", value, "cd_objectid");
            return (Criteria) this;
        }

        public Criteria andLngObjectidLessThan(Long value) {
            addCriterion("cd_objectid <", value, "cd_objectid");
            return (Criteria) this;
        }

        public Criteria andLngObjectidLessThanOrEqualTo(Long value) {
            addCriterion("cd_objectid <=", value, "cd_objectid");
            return (Criteria) this;
        }

        public Criteria andLngObjectidIn(List<Long> values) {
            addCriterion("cd_objectid in", values, "cd_objectid");
            return (Criteria) this;
        }

        public Criteria andLngObjectidNotIn(List<Long> values) {
            addCriterion("cd_objectid not in", values, "cd_objectid");
            return (Criteria) this;
        }

        public Criteria andLngObjectidBetween(Long value1, Long value2) {
            addCriterion("cd_objectid between", value1, value2, "cd_objectid");
            return (Criteria) this;
        }

        public Criteria andLngObjectidNotBetween(Long value1, Long value2) {
            addCriterion("cd_objectid not between", value1, value2, "cd_objectid");
            return (Criteria) this;
        }
        
        
        public Criteria andStrZaNombLike(String value) {
            addCriterion("upper(de_za_nomb) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_za_nomb");
            return (Criteria) this;
        }

        public Criteria andStrZaNombNotLike(String value) {
            addCriterion("de_za_nomb not like", "%" + CadenaUtil.getStr(value) + "%", "de_za_nomb");
            return (Criteria) this;
        }
			
        public Criteria andStrZaNombEqualTo(String value) {
            addCriterion("de_za_nomb =", CadenaUtil.getStr(value), "de_za_nomb");
            return (Criteria) this;
        }

        public Criteria andStrZaNombNotEqualTo(String value) {
            addCriterion("de_za_nomb <>", CadenaUtil.getStr(value), "de_za_nomb");
            return (Criteria) this;
        }

        
        public Criteria andStrZaNombIsNull() {
            addCriterion("de_za_nomb is null");
            return (Criteria) this;
        }

        public Criteria andStrZaNombIsNotNull() {
            addCriterion("de_za_nomb is not null");
            return (Criteria) this;
        }

        public Criteria andStrZaNombGreaterThan(String value) {
            addCriterion("de_za_nomb >", value, "de_za_nomb");
            return (Criteria) this;
        }

        public Criteria andStrZaNombGreaterThanOrEqualTo(String value) {
            addCriterion("de_za_nomb >=", value, "de_za_nomb");
            return (Criteria) this;
        }

        public Criteria andStrZaNombLessThan(String value) {
            addCriterion("de_za_nomb <", value, "de_za_nomb");
            return (Criteria) this;
        }

        public Criteria andStrZaNombLessThanOrEqualTo(String value) {
            addCriterion("de_za_nomb <=", value, "de_za_nomb");
            return (Criteria) this;
        }

        public Criteria andStrZaNombIn(List<String> values) {
            addCriterion("de_za_nomb in", values, "de_za_nomb");
            return (Criteria) this;
        }

        public Criteria andStrZaNombNotIn(List<String> values) {
            addCriterion("de_za_nomb not in", values, "de_za_nomb");
            return (Criteria) this;
        }

        public Criteria andStrZaNombBetween(String value1, String value2) {
            addCriterion("de_za_nomb between", value1, value2, "de_za_nomb");
            return (Criteria) this;
        }

        public Criteria andStrZaNombNotBetween(String value1, String value2) {
            addCriterion("de_za_nomb not between", value1, value2, "de_za_nomb");
            return (Criteria) this;
        }
        
        
        public Criteria andStrZaBaleLike(String value) {
            addCriterion("upper(de_za_bale) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_za_bale");
            return (Criteria) this;
        }

        public Criteria andStrZaBaleNotLike(String value) {
            addCriterion("de_za_bale not like", "%" + CadenaUtil.getStr(value) + "%", "de_za_bale");
            return (Criteria) this;
        }
			
        public Criteria andStrZaBaleEqualTo(String value) {
            addCriterion("de_za_bale =", CadenaUtil.getStr(value), "de_za_bale");
            return (Criteria) this;
        }

        public Criteria andStrZaBaleNotEqualTo(String value) {
            addCriterion("de_za_bale <>", CadenaUtil.getStr(value), "de_za_bale");
            return (Criteria) this;
        }

        
        public Criteria andStrZaBaleIsNull() {
            addCriterion("de_za_bale is null");
            return (Criteria) this;
        }

        public Criteria andStrZaBaleIsNotNull() {
            addCriterion("de_za_bale is not null");
            return (Criteria) this;
        }

        public Criteria andStrZaBaleGreaterThan(String value) {
            addCriterion("de_za_bale >", value, "de_za_bale");
            return (Criteria) this;
        }

        public Criteria andStrZaBaleGreaterThanOrEqualTo(String value) {
            addCriterion("de_za_bale >=", value, "de_za_bale");
            return (Criteria) this;
        }

        public Criteria andStrZaBaleLessThan(String value) {
            addCriterion("de_za_bale <", value, "de_za_bale");
            return (Criteria) this;
        }

        public Criteria andStrZaBaleLessThanOrEqualTo(String value) {
            addCriterion("de_za_bale <=", value, "de_za_bale");
            return (Criteria) this;
        }

        public Criteria andStrZaBaleIn(List<String> values) {
            addCriterion("de_za_bale in", values, "de_za_bale");
            return (Criteria) this;
        }

        public Criteria andStrZaBaleNotIn(List<String> values) {
            addCriterion("de_za_bale not in", values, "de_za_bale");
            return (Criteria) this;
        }

        public Criteria andStrZaBaleBetween(String value1, String value2) {
            addCriterion("de_za_bale between", value1, value2, "de_za_bale");
            return (Criteria) this;
        }

        public Criteria andStrZaBaleNotBetween(String value1, String value2) {
            addCriterion("de_za_bale not between", value1, value2, "de_za_bale");
            return (Criteria) this;
        }
        
        
        public Criteria andDteZaFecrEqualTo(Date value) {
            addCriterion("fc_za_fecr =", value, "fc_za_fecr");
            return (Criteria) this;
        }

        public Criteria andDteZaFecrNotEqualTo(Date value) {
            addCriterion("fc_za_fecr <>", value, "fc_za_fecr");
            return (Criteria) this;
        }
        
        
        public Criteria andDteZaFecrIsNull() {
            addCriterion("fc_za_fecr is null");
            return (Criteria) this;
        }

        public Criteria andDteZaFecrIsNotNull() {
            addCriterion("fc_za_fecr is not null");
            return (Criteria) this;
        }

        public Criteria andDteZaFecrGreaterThan(Date value) {
            addCriterion("fc_za_fecr >", value, "fc_za_fecr");
            return (Criteria) this;
        }

        public Criteria andDteZaFecrGreaterThanOrEqualTo(Date value) {
            addCriterion("fc_za_fecr >=", value, "fc_za_fecr");
            return (Criteria) this;
        }

        public Criteria andDteZaFecrLessThan(Date value) {
            addCriterion("fc_za_fecr <", value, "fc_za_fecr");
            return (Criteria) this;
        }

        public Criteria andDteZaFecrLessThanOrEqualTo(Date value) {
            addCriterion("fc_za_fecr <=", value, "fc_za_fecr");
            return (Criteria) this;
        }

        public Criteria andDteZaFecrIn(List<Date> values) {
            addCriterion("fc_za_fecr in", values, "fc_za_fecr");
            return (Criteria) this;
        }

        public Criteria andDteZaFecrNotIn(List<Date> values) {
            addCriterion("fc_za_fecr not in", values, "fc_za_fecr");
            return (Criteria) this;
        }

        public Criteria andDteZaFecrBetween(Date value1, Date value2) {
            addCriterion("fc_za_fecr between", value1, value2, "fc_za_fecr");
            return (Criteria) this;
        }

        public Criteria andDteZaFecrNotBetween(Date value1, Date value2) {
            addCriterion("fc_za_fecr not between", value1, value2, "fc_za_fecr");
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
