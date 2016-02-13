package wcmc.hef.dao.configuracion.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class CapaUmbralParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CapaUmbralParamDef() {
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
        
                
        
        public Criteria andSrlIdCapaUmbralEqualTo(Integer value) {
            addCriterion("cd_capaumb =", value, "cd_capaumb");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaUmbralNotEqualTo(Integer value) {
            addCriterion("cd_capaumb <>", value, "cd_capaumb");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdCapaUmbralIsNull() {
            addCriterion("cd_capaumb is null");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaUmbralIsNotNull() {
            addCriterion("cd_capaumb is not null");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaUmbralGreaterThan(Integer value) {
            addCriterion("cd_capaumb >", value, "cd_capaumb");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaUmbralGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_capaumb >=", value, "cd_capaumb");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaUmbralLessThan(Integer value) {
            addCriterion("cd_capaumb <", value, "cd_capaumb");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaUmbralLessThanOrEqualTo(Integer value) {
            addCriterion("cd_capaumb <=", value, "cd_capaumb");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaUmbralIn(List<Integer> values) {
            addCriterion("cd_capaumb in", values, "cd_capaumb");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaUmbralNotIn(List<Integer> values) {
            addCriterion("cd_capaumb not in", values, "cd_capaumb");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaUmbralBetween(Integer value1, Integer value2) {
            addCriterion("cd_capaumb between", value1, value2, "cd_capaumb");
            return (Criteria) this;
        }

        public Criteria andSrlIdCapaUmbralNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_capaumb not between", value1, value2, "cd_capaumb");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdCapaEqualTo(Integer value) {
            addCriterion("cd_capa =", value, "cd_capa");
            return (Criteria) this;
        }

        public Criteria andIntIdCapaNotEqualTo(Integer value) {
            addCriterion("cd_capa <>", value, "cd_capa");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdCapaIsNull() {
            addCriterion("cd_capa is null");
            return (Criteria) this;
        }

        public Criteria andIntIdCapaIsNotNull() {
            addCriterion("cd_capa is not null");
            return (Criteria) this;
        }

        public Criteria andIntIdCapaGreaterThan(Integer value) {
            addCriterion("cd_capa >", value, "cd_capa");
            return (Criteria) this;
        }

        public Criteria andIntIdCapaGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_capa >=", value, "cd_capa");
            return (Criteria) this;
        }

        public Criteria andIntIdCapaLessThan(Integer value) {
            addCriterion("cd_capa <", value, "cd_capa");
            return (Criteria) this;
        }

        public Criteria andIntIdCapaLessThanOrEqualTo(Integer value) {
            addCriterion("cd_capa <=", value, "cd_capa");
            return (Criteria) this;
        }

        public Criteria andIntIdCapaIn(List<Integer> values) {
            addCriterion("cd_capa in", values, "cd_capa");
            return (Criteria) this;
        }

        public Criteria andIntIdCapaNotIn(List<Integer> values) {
            addCriterion("cd_capa not in", values, "cd_capa");
            return (Criteria) this;
        }

        public Criteria andIntIdCapaBetween(Integer value1, Integer value2) {
            addCriterion("cd_capa between", value1, value2, "cd_capa");
            return (Criteria) this;
        }

        public Criteria andIntIdCapaNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_capa not between", value1, value2, "cd_capa");
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
        
        
        public Criteria andIntValorMinimoEqualTo(Integer value) {
            addCriterion("ha_valmin =", value, "ha_valmin");
            return (Criteria) this;
        }

        public Criteria andIntValorMinimoNotEqualTo(Integer value) {
            addCriterion("ha_valmin <>", value, "ha_valmin");
            return (Criteria) this;
        }
        
        
        public Criteria andIntValorMinimoIsNull() {
            addCriterion("ha_valmin is null");
            return (Criteria) this;
        }

        public Criteria andIntValorMinimoIsNotNull() {
            addCriterion("ha_valmin is not null");
            return (Criteria) this;
        }

        public Criteria andIntValorMinimoGreaterThan(Integer value) {
            addCriterion("ha_valmin >", value, "ha_valmin");
            return (Criteria) this;
        }

        public Criteria andIntValorMinimoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ha_valmin >=", value, "ha_valmin");
            return (Criteria) this;
        }

        public Criteria andIntValorMinimoLessThan(Integer value) {
            addCriterion("ha_valmin <", value, "ha_valmin");
            return (Criteria) this;
        }

        public Criteria andIntValorMinimoLessThanOrEqualTo(Integer value) {
            addCriterion("ha_valmin <=", value, "ha_valmin");
            return (Criteria) this;
        }

        public Criteria andIntValorMinimoIn(List<Integer> values) {
            addCriterion("ha_valmin in", values, "ha_valmin");
            return (Criteria) this;
        }

        public Criteria andIntValorMinimoNotIn(List<Integer> values) {
            addCriterion("ha_valmin not in", values, "ha_valmin");
            return (Criteria) this;
        }

        public Criteria andIntValorMinimoBetween(Integer value1, Integer value2) {
            addCriterion("ha_valmin between", value1, value2, "ha_valmin");
            return (Criteria) this;
        }

        public Criteria andIntValorMinimoNotBetween(Integer value1, Integer value2) {
            addCriterion("ha_valmin not between", value1, value2, "ha_valmin");
            return (Criteria) this;
        }
        
        
        public Criteria andIntValorMaximoEqualTo(Integer value) {
            addCriterion("ha_valmax =", value, "ha_valmax");
            return (Criteria) this;
        }

        public Criteria andIntValorMaximoNotEqualTo(Integer value) {
            addCriterion("ha_valmax <>", value, "ha_valmax");
            return (Criteria) this;
        }
        
        
        public Criteria andIntValorMaximoIsNull() {
            addCriterion("ha_valmax is null");
            return (Criteria) this;
        }

        public Criteria andIntValorMaximoIsNotNull() {
            addCriterion("ha_valmax is not null");
            return (Criteria) this;
        }

        public Criteria andIntValorMaximoGreaterThan(Integer value) {
            addCriterion("ha_valmax >", value, "ha_valmax");
            return (Criteria) this;
        }

        public Criteria andIntValorMaximoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ha_valmax >=", value, "ha_valmax");
            return (Criteria) this;
        }

        public Criteria andIntValorMaximoLessThan(Integer value) {
            addCriterion("ha_valmax <", value, "ha_valmax");
            return (Criteria) this;
        }

        public Criteria andIntValorMaximoLessThanOrEqualTo(Integer value) {
            addCriterion("ha_valmax <=", value, "ha_valmax");
            return (Criteria) this;
        }

        public Criteria andIntValorMaximoIn(List<Integer> values) {
            addCriterion("ha_valmax in", values, "ha_valmax");
            return (Criteria) this;
        }

        public Criteria andIntValorMaximoNotIn(List<Integer> values) {
            addCriterion("ha_valmax not in", values, "ha_valmax");
            return (Criteria) this;
        }

        public Criteria andIntValorMaximoBetween(Integer value1, Integer value2) {
            addCriterion("ha_valmax between", value1, value2, "ha_valmax");
            return (Criteria) this;
        }

        public Criteria andIntValorMaximoNotBetween(Integer value1, Integer value2) {
            addCriterion("ha_valmax not between", value1, value2, "ha_valmax");
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
