package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class BasLimDepartamentoParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasLimDepartamentoParamDef() {
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
        
        
        public Criteria andStrTheGeomIntersectsTo(String value) {
        	addCriterion("ST_Intersects(si_the_geom, ST_GeomFromText('"+CadenaUtil.getStr(value)+"',4326)) ");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIddptoLike(String value) {
            addCriterion("upper(de_iddpto) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoNotLike(String value) {
            addCriterion("de_iddpto not like", "%" + CadenaUtil.getStr(value) + "%", "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoEqualTo(String value) {
            addCriterion("de_iddpto =", CadenaUtil.getStr(value), "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoNotEqualTo(String value) {
            addCriterion("de_iddpto <>", CadenaUtil.getStr(value), "de_iddpto");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIddptoIsNull() {
            addCriterion("de_iddpto is null");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoIsNotNull() {
            addCriterion("de_iddpto is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoGreaterThan(String value) {
            addCriterion("de_iddpto >", value, "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoGreaterThanOrEqualTo(String value) {
            addCriterion("de_iddpto >=", value, "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoLessThan(String value) {
            addCriterion("de_iddpto <", value, "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoLessThanOrEqualTo(String value) {
            addCriterion("de_iddpto <=", value, "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoIn(List<String> values) {
            addCriterion("de_iddpto in", values, "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoNotIn(List<String> values) {
            addCriterion("de_iddpto not in", values, "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoBetween(String value1, String value2) {
            addCriterion("de_iddpto between", value1, value2, "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoNotBetween(String value1, String value2) {
            addCriterion("de_iddpto not between", value1, value2, "de_iddpto");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombdepLike(String value) {
            addCriterion("upper(de_nombdep) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepNotLike(String value) {
            addCriterion("de_nombdep not like", "%" + CadenaUtil.getStr(value) + "%", "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepEqualTo(String value) {
            addCriterion("de_nombdep =", CadenaUtil.getStr(value), "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepNotEqualTo(String value) {
            addCriterion("de_nombdep <>", CadenaUtil.getStr(value), "de_nombdep");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombdepIsNull() {
            addCriterion("de_nombdep is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepIsNotNull() {
            addCriterion("de_nombdep is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepGreaterThan(String value) {
            addCriterion("de_nombdep >", value, "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepGreaterThanOrEqualTo(String value) {
            addCriterion("de_nombdep >=", value, "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepLessThan(String value) {
            addCriterion("de_nombdep <", value, "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepLessThanOrEqualTo(String value) {
            addCriterion("de_nombdep <=", value, "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepIn(List<String> values) {
            addCriterion("de_nombdep in", values, "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepNotIn(List<String> values) {
            addCriterion("de_nombdep not in", values, "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepBetween(String value1, String value2) {
            addCriterion("de_nombdep between", value1, value2, "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepNotBetween(String value1, String value2) {
            addCriterion("de_nombdep not between", value1, value2, "de_nombdep");
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
