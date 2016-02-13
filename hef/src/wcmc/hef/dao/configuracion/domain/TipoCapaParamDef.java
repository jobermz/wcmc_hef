package wcmc.hef.dao.configuracion.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class TipoCapaParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TipoCapaParamDef() {
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
        
                
        
        public Criteria andSrlIdTipoCapaEqualTo(Integer value) {
            addCriterion("cd_tipocapa =", value, "cd_tipocapa");
            return (Criteria) this;
        }

        public Criteria andSrlIdTipoCapaNotEqualTo(Integer value) {
            addCriterion("cd_tipocapa <>", value, "cd_tipocapa");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdTipoCapaIsNull() {
            addCriterion("cd_tipocapa is null");
            return (Criteria) this;
        }

        public Criteria andSrlIdTipoCapaIsNotNull() {
            addCriterion("cd_tipocapa is not null");
            return (Criteria) this;
        }

        public Criteria andSrlIdTipoCapaGreaterThan(Integer value) {
            addCriterion("cd_tipocapa >", value, "cd_tipocapa");
            return (Criteria) this;
        }

        public Criteria andSrlIdTipoCapaGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_tipocapa >=", value, "cd_tipocapa");
            return (Criteria) this;
        }

        public Criteria andSrlIdTipoCapaLessThan(Integer value) {
            addCriterion("cd_tipocapa <", value, "cd_tipocapa");
            return (Criteria) this;
        }

        public Criteria andSrlIdTipoCapaLessThanOrEqualTo(Integer value) {
            addCriterion("cd_tipocapa <=", value, "cd_tipocapa");
            return (Criteria) this;
        }

        public Criteria andSrlIdTipoCapaIn(List<Integer> values) {
            addCriterion("cd_tipocapa in", values, "cd_tipocapa");
            return (Criteria) this;
        }

        public Criteria andSrlIdTipoCapaNotIn(List<Integer> values) {
            addCriterion("cd_tipocapa not in", values, "cd_tipocapa");
            return (Criteria) this;
        }

        public Criteria andSrlIdTipoCapaBetween(Integer value1, Integer value2) {
            addCriterion("cd_tipocapa between", value1, value2, "cd_tipocapa");
            return (Criteria) this;
        }

        public Criteria andSrlIdTipoCapaNotBetween(Integer value1, Integer value2) {
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
