package wcmc.hef.dao.configuracion.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class PerfilParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PerfilParamDef() {
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
        
                
        
        public Criteria andSrlIdPerfilEqualTo(Integer value) {
            addCriterion("cd_perfil =", value, "cd_perfil");
            return (Criteria) this;
        }

        public Criteria andSrlIdPerfilNotEqualTo(Integer value) {
            addCriterion("cd_perfil <>", value, "cd_perfil");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdPerfilIsNull() {
            addCriterion("cd_perfil is null");
            return (Criteria) this;
        }

        public Criteria andSrlIdPerfilIsNotNull() {
            addCriterion("cd_perfil is not null");
            return (Criteria) this;
        }

        public Criteria andSrlIdPerfilGreaterThan(Integer value) {
            addCriterion("cd_perfil >", value, "cd_perfil");
            return (Criteria) this;
        }

        public Criteria andSrlIdPerfilGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_perfil >=", value, "cd_perfil");
            return (Criteria) this;
        }

        public Criteria andSrlIdPerfilLessThan(Integer value) {
            addCriterion("cd_perfil <", value, "cd_perfil");
            return (Criteria) this;
        }

        public Criteria andSrlIdPerfilLessThanOrEqualTo(Integer value) {
            addCriterion("cd_perfil <=", value, "cd_perfil");
            return (Criteria) this;
        }

        public Criteria andSrlIdPerfilIn(List<Integer> values) {
            addCriterion("cd_perfil in", values, "cd_perfil");
            return (Criteria) this;
        }

        public Criteria andSrlIdPerfilNotIn(List<Integer> values) {
            addCriterion("cd_perfil not in", values, "cd_perfil");
            return (Criteria) this;
        }

        public Criteria andSrlIdPerfilBetween(Integer value1, Integer value2) {
            addCriterion("cd_perfil between", value1, value2, "cd_perfil");
            return (Criteria) this;
        }

        public Criteria andSrlIdPerfilNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_perfil not between", value1, value2, "cd_perfil");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombreLike(String value) {
            addCriterion("upper(nm_perfil) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nm_perfil");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotLike(String value) {
            addCriterion("nm_perfil not like", "%" + CadenaUtil.getStr(value) + "%", "nm_perfil");
            return (Criteria) this;
        }
			
        public Criteria andStrNombreEqualTo(String value) {
            addCriterion("nm_perfil =", CadenaUtil.getStr(value), "nm_perfil");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotEqualTo(String value) {
            addCriterion("nm_perfil <>", CadenaUtil.getStr(value), "nm_perfil");
            return (Criteria) this;
        }

        
        public Criteria andStrNombreIsNull() {
            addCriterion("nm_perfil is null");
            return (Criteria) this;
        }

        public Criteria andStrNombreIsNotNull() {
            addCriterion("nm_perfil is not null");
            return (Criteria) this;
        }

        public Criteria andStrNombreGreaterThan(String value) {
            addCriterion("nm_perfil >", value, "nm_perfil");
            return (Criteria) this;
        }

        public Criteria andStrNombreGreaterThanOrEqualTo(String value) {
            addCriterion("nm_perfil >=", value, "nm_perfil");
            return (Criteria) this;
        }

        public Criteria andStrNombreLessThan(String value) {
            addCriterion("nm_perfil <", value, "nm_perfil");
            return (Criteria) this;
        }

        public Criteria andStrNombreLessThanOrEqualTo(String value) {
            addCriterion("nm_perfil <=", value, "nm_perfil");
            return (Criteria) this;
        }

        public Criteria andStrNombreIn(List<String> values) {
            addCriterion("nm_perfil in", values, "nm_perfil");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotIn(List<String> values) {
            addCriterion("nm_perfil not in", values, "nm_perfil");
            return (Criteria) this;
        }

        public Criteria andStrNombreBetween(String value1, String value2) {
            addCriterion("nm_perfil between", value1, value2, "nm_perfil");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotBetween(String value1, String value2) {
            addCriterion("nm_perfil not between", value1, value2, "nm_perfil");
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
