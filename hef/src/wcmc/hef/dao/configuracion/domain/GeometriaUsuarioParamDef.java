package wcmc.hef.dao.configuracion.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class GeometriaUsuarioParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected String strHashConsulta;
	
    public GeometriaUsuarioParamDef() {
        oredCriteria = new ArrayList<Criteria>();
    }
	
    public void setStrHashConsulta(String strHashConsulta) {
    	if(CadenaUtil.getStrNull(strHashConsulta) != null) {
        	this.strHashConsulta = " inner join wcmc_hef.tem_query_acl qry on de_hash_consulta = '"+CadenaUtil.getStr(strHashConsulta)+"' and ST_Intersects(ST_Transform(si_geometr, 32718), cd_rast) ";
    	}
    }
	
    public String getStrHashConsulta() {
        return CadenaUtil.getStr(strHashConsulta);
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
        
                
        
        public Criteria andSrlIdGeometriaUsuarioEqualTo(Integer value) {
            addCriterion("cd_geometria =", value, "cd_geometria");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdGeometriaUsuarioNotEqualTo(Integer value) {
            addCriterion("cd_geometria <>", value, "cd_geometria");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdGeometriaUsuarioIsNull() {
            addCriterion("cd_geometria is null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdGeometriaUsuarioIsNotNull() {
            addCriterion("cd_geometria is not null");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdGeometriaUsuarioGreaterThan(Integer value) {
            addCriterion("cd_geometria >", value, "cd_geometria");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdGeometriaUsuarioGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_geometria >=", value, "cd_geometria");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdGeometriaUsuarioLessThan(Integer value) {
            addCriterion("cd_geometria <", value, "cd_geometria");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdGeometriaUsuarioLessThanOrEqualTo(Integer value) {
            addCriterion("cd_geometria <=", value, "cd_geometria");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdGeometriaUsuarioIn(List<Integer> values) {
            addCriterion("cd_geometria in", values, "cd_geometria");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdGeometriaUsuarioNotIn(List<Integer> values) {
            addCriterion("cd_geometria not in", values, "cd_geometria");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdGeometriaUsuarioBetween(Integer value1, Integer value2) {
            addCriterion("cd_geometria between", value1, value2, "cd_geometria");
            return (Criteria) this;
        }
        
        public Criteria andSrlIdGeometriaUsuarioNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_geometria not between", value1, value2, "cd_geometria");
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
        
        
        public Criteria andStrGeometryIntersectsTo(String value) {
        	addCriterion("ST_Intersects(si_geometr, ST_GeomFromText('"+CadenaUtil.getStr(value)+"',4326)) ");
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
