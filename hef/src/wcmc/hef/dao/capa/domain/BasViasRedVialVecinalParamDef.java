package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class BasViasRedVialVecinalParamDef {
		
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected String strHashConsulta;
	
    public BasViasRedVialVecinalParamDef() {
        oredCriteria = new ArrayList<Criteria>();
    }
	
    public void setStrHashConsulta(String strHashConsulta) {
    	if(CadenaUtil.getStrNull(strHashConsulta) != null) {
        	this.strHashConsulta = " inner join wcmc_hef.tem_query_acl qry on de_hash_consulta = '"+CadenaUtil.getStr(strHashConsulta)+"' and ST_Intersects(ST_Transform(si_the_geom, 32718), cd_rast, 1) ";
        	setDistinct(true);
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
        	if(CadenaUtil.getStr(value).toUpperCase().indexOf("POINT") != -1) {
            	addCriterion("ST_Intersects(si_the_geom, ST_GeomFromText('"+CadenaUtil.getStr(value)+"',4326))  ");
        	} else {
            	addCriterion("ST_Intersects(si_the_geom, ST_BUFFER(ST_GeomFromText('"+CadenaUtil.getStr(value)+"',4326), -0.00001))  ");
        	}
            return (Criteria) this;
        }
        
        
        public Criteria andStrProvincLike(String value) {
            addCriterion("upper(de_provinc) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_provinc");
            return (Criteria) this;
        }
        
        public Criteria andStrProvincNotLike(String value) {
            addCriterion("de_provinc not like", "%" + CadenaUtil.getStr(value) + "%", "de_provinc");
            return (Criteria) this;
        }
        
        public Criteria andStrProvincEqualTo(String value) {
            addCriterion("de_provinc =", CadenaUtil.getStr(value), "de_provinc");
            return (Criteria) this;
        }
        
        public Criteria andStrProvincNotEqualTo(String value) {
            addCriterion("de_provinc <>", CadenaUtil.getStr(value), "de_provinc");
            return (Criteria) this;
        }
        
        
        public Criteria andStrProvincIsNull() {
            addCriterion("de_provinc is null");
            return (Criteria) this;
        }
        
        public Criteria andStrProvincIsNotNull() {
            addCriterion("de_provinc is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrProvincGreaterThan(String value) {
            addCriterion("de_provinc >", value, "de_provinc");
            return (Criteria) this;
        }
        
        public Criteria andStrProvincGreaterThanOrEqualTo(String value) {
            addCriterion("de_provinc >=", value, "de_provinc");
            return (Criteria) this;
        }
        
        public Criteria andStrProvincLessThan(String value) {
            addCriterion("de_provinc <", value, "de_provinc");
            return (Criteria) this;
        }
        
        public Criteria andStrProvincLessThanOrEqualTo(String value) {
            addCriterion("de_provinc <=", value, "de_provinc");
            return (Criteria) this;
        }
        
        public Criteria andStrProvincIn(List<String> values) {
            addCriterion("de_provinc in", values, "de_provinc");
            return (Criteria) this;
        }
        
        public Criteria andStrProvincNotIn(List<String> values) {
            addCriterion("de_provinc not in", values, "de_provinc");
            return (Criteria) this;
        }
        
        public Criteria andStrProvincBetween(String value1, String value2) {
            addCriterion("de_provinc between", value1, value2, "de_provinc");
            return (Criteria) this;
        }
        
        public Criteria andStrProvincNotBetween(String value1, String value2) {
            addCriterion("de_provinc not between", value1, value2, "de_provinc");
            return (Criteria) this;
        }
        
        
        public Criteria andStrRutaLike(String value) {
            addCriterion("upper(de_ruta) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_ruta");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaNotLike(String value) {
            addCriterion("de_ruta not like", "%" + CadenaUtil.getStr(value) + "%", "de_ruta");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaEqualTo(String value) {
            addCriterion("de_ruta =", CadenaUtil.getStr(value), "de_ruta");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaNotEqualTo(String value) {
            addCriterion("de_ruta <>", CadenaUtil.getStr(value), "de_ruta");
            return (Criteria) this;
        }
        
        
        public Criteria andStrRutaIsNull() {
            addCriterion("de_ruta is null");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaIsNotNull() {
            addCriterion("de_ruta is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaGreaterThan(String value) {
            addCriterion("de_ruta >", value, "de_ruta");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaGreaterThanOrEqualTo(String value) {
            addCriterion("de_ruta >=", value, "de_ruta");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaLessThan(String value) {
            addCriterion("de_ruta <", value, "de_ruta");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaLessThanOrEqualTo(String value) {
            addCriterion("de_ruta <=", value, "de_ruta");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaIn(List<String> values) {
            addCriterion("de_ruta in", values, "de_ruta");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaNotIn(List<String> values) {
            addCriterion("de_ruta not in", values, "de_ruta");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaBetween(String value1, String value2) {
            addCriterion("de_ruta between", value1, value2, "de_ruta");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaNotBetween(String value1, String value2) {
            addCriterion("de_ruta not between", value1, value2, "de_ruta");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSuperficieLike(String value) {
            addCriterion("upper(de_superficie) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_superficie");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperficieNotLike(String value) {
            addCriterion("de_superficie not like", "%" + CadenaUtil.getStr(value) + "%", "de_superficie");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperficieEqualTo(String value) {
            addCriterion("de_superficie =", CadenaUtil.getStr(value), "de_superficie");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperficieNotEqualTo(String value) {
            addCriterion("de_superficie <>", CadenaUtil.getStr(value), "de_superficie");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSuperficieIsNull() {
            addCriterion("de_superficie is null");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperficieIsNotNull() {
            addCriterion("de_superficie is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperficieGreaterThan(String value) {
            addCriterion("de_superficie >", value, "de_superficie");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperficieGreaterThanOrEqualTo(String value) {
            addCriterion("de_superficie >=", value, "de_superficie");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperficieLessThan(String value) {
            addCriterion("de_superficie <", value, "de_superficie");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperficieLessThanOrEqualTo(String value) {
            addCriterion("de_superficie <=", value, "de_superficie");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperficieIn(List<String> values) {
            addCriterion("de_superficie in", values, "de_superficie");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperficieNotIn(List<String> values) {
            addCriterion("de_superficie not in", values, "de_superficie");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperficieBetween(String value1, String value2) {
            addCriterion("de_superficie between", value1, value2, "de_superficie");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperficieNotBetween(String value1, String value2) {
            addCriterion("de_superficie not between", value1, value2, "de_superficie");
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
