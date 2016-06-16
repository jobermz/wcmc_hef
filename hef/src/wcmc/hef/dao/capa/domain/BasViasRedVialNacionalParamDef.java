package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class BasViasRedVialNacionalParamDef {
		
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected String strHashConsulta;
	
    public BasViasRedVialNacionalParamDef() {
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
        
        
        public Criteria andStrDptoLike(String value) {
            addCriterion("upper(de_dpto) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_dpto");
            return (Criteria) this;
        }
        
        public Criteria andStrDptoNotLike(String value) {
            addCriterion("de_dpto not like", "%" + CadenaUtil.getStr(value) + "%", "de_dpto");
            return (Criteria) this;
        }
        
        public Criteria andStrDptoEqualTo(String value) {
            addCriterion("de_dpto =", CadenaUtil.getStr(value), "de_dpto");
            return (Criteria) this;
        }
        
        public Criteria andStrDptoNotEqualTo(String value) {
            addCriterion("de_dpto <>", CadenaUtil.getStr(value), "de_dpto");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDptoIsNull() {
            addCriterion("de_dpto is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDptoIsNotNull() {
            addCriterion("de_dpto is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDptoGreaterThan(String value) {
            addCriterion("de_dpto >", value, "de_dpto");
            return (Criteria) this;
        }
        
        public Criteria andStrDptoGreaterThanOrEqualTo(String value) {
            addCriterion("de_dpto >=", value, "de_dpto");
            return (Criteria) this;
        }
        
        public Criteria andStrDptoLessThan(String value) {
            addCriterion("de_dpto <", value, "de_dpto");
            return (Criteria) this;
        }
        
        public Criteria andStrDptoLessThanOrEqualTo(String value) {
            addCriterion("de_dpto <=", value, "de_dpto");
            return (Criteria) this;
        }
        
        public Criteria andStrDptoIn(List<String> values) {
            addCriterion("de_dpto in", values, "de_dpto");
            return (Criteria) this;
        }
        
        public Criteria andStrDptoNotIn(List<String> values) {
            addCriterion("de_dpto not in", values, "de_dpto");
            return (Criteria) this;
        }
        
        public Criteria andStrDptoBetween(String value1, String value2) {
            addCriterion("de_dpto between", value1, value2, "de_dpto");
            return (Criteria) this;
        }
        
        public Criteria andStrDptoNotBetween(String value1, String value2) {
            addCriterion("de_dpto not between", value1, value2, "de_dpto");
            return (Criteria) this;
        }
        
        
        public Criteria andStrRutaD044Like(String value) {
            addCriterion("upper(de_ruta_d044) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_ruta_d044");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaD044NotLike(String value) {
            addCriterion("de_ruta_d044 not like", "%" + CadenaUtil.getStr(value) + "%", "de_ruta_d044");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaD044EqualTo(String value) {
            addCriterion("de_ruta_d044 =", CadenaUtil.getStr(value), "de_ruta_d044");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaD044NotEqualTo(String value) {
            addCriterion("de_ruta_d044 <>", CadenaUtil.getStr(value), "de_ruta_d044");
            return (Criteria) this;
        }
        
        
        public Criteria andStrRutaD044IsNull() {
            addCriterion("de_ruta_d044 is null");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaD044IsNotNull() {
            addCriterion("de_ruta_d044 is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaD044GreaterThan(String value) {
            addCriterion("de_ruta_d044 >", value, "de_ruta_d044");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaD044GreaterThanOrEqualTo(String value) {
            addCriterion("de_ruta_d044 >=", value, "de_ruta_d044");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaD044LessThan(String value) {
            addCriterion("de_ruta_d044 <", value, "de_ruta_d044");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaD044LessThanOrEqualTo(String value) {
            addCriterion("de_ruta_d044 <=", value, "de_ruta_d044");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaD044In(List<String> values) {
            addCriterion("de_ruta_d044 in", values, "de_ruta_d044");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaD044NotIn(List<String> values) {
            addCriterion("de_ruta_d044 not in", values, "de_ruta_d044");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaD044Between(String value1, String value2) {
            addCriterion("de_ruta_d044 between", value1, value2, "de_ruta_d044");
            return (Criteria) this;
        }
        
        public Criteria andStrRutaD044NotBetween(String value1, String value2) {
            addCriterion("de_ruta_d044 not between", value1, value2, "de_ruta_d044");
            return (Criteria) this;
        }
        
        
        public Criteria andStrRed044Like(String value) {
            addCriterion("upper(de_red_044) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_red_044");
            return (Criteria) this;
        }
        
        public Criteria andStrRed044NotLike(String value) {
            addCriterion("de_red_044 not like", "%" + CadenaUtil.getStr(value) + "%", "de_red_044");
            return (Criteria) this;
        }
        
        public Criteria andStrRed044EqualTo(String value) {
            addCriterion("de_red_044 =", CadenaUtil.getStr(value), "de_red_044");
            return (Criteria) this;
        }
        
        public Criteria andStrRed044NotEqualTo(String value) {
            addCriterion("de_red_044 <>", CadenaUtil.getStr(value), "de_red_044");
            return (Criteria) this;
        }
        
        
        public Criteria andStrRed044IsNull() {
            addCriterion("de_red_044 is null");
            return (Criteria) this;
        }
        
        public Criteria andStrRed044IsNotNull() {
            addCriterion("de_red_044 is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrRed044GreaterThan(String value) {
            addCriterion("de_red_044 >", value, "de_red_044");
            return (Criteria) this;
        }
        
        public Criteria andStrRed044GreaterThanOrEqualTo(String value) {
            addCriterion("de_red_044 >=", value, "de_red_044");
            return (Criteria) this;
        }
        
        public Criteria andStrRed044LessThan(String value) {
            addCriterion("de_red_044 <", value, "de_red_044");
            return (Criteria) this;
        }
        
        public Criteria andStrRed044LessThanOrEqualTo(String value) {
            addCriterion("de_red_044 <=", value, "de_red_044");
            return (Criteria) this;
        }
        
        public Criteria andStrRed044In(List<String> values) {
            addCriterion("de_red_044 in", values, "de_red_044");
            return (Criteria) this;
        }
        
        public Criteria andStrRed044NotIn(List<String> values) {
            addCriterion("de_red_044 not in", values, "de_red_044");
            return (Criteria) this;
        }
        
        public Criteria andStrRed044Between(String value1, String value2) {
            addCriterion("de_red_044 between", value1, value2, "de_red_044");
            return (Criteria) this;
        }
        
        public Criteria andStrRed044NotBetween(String value1, String value2) {
            addCriterion("de_red_044 not between", value1, value2, "de_red_044");
            return (Criteria) this;
        }
        
        
        public Criteria andDblLongkmD44EqualTo(Double value) {
            addCriterion("ha_longkm_d44 =", value, "ha_longkm_d44");
            return (Criteria) this;
        }
        
        public Criteria andDblLongkmD44NotEqualTo(Double value) {
            addCriterion("ha_longkm_d44 <>", value, "ha_longkm_d44");
            return (Criteria) this;
        }
        
        
        public Criteria andDblLongkmD44IsNull() {
            addCriterion("ha_longkm_d44 is null");
            return (Criteria) this;
        }
        
        public Criteria andDblLongkmD44IsNotNull() {
            addCriterion("ha_longkm_d44 is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblLongkmD44GreaterThan(Double value) {
            addCriterion("ha_longkm_d44 >", value, "ha_longkm_d44");
            return (Criteria) this;
        }
        
        public Criteria andDblLongkmD44GreaterThanOrEqualTo(Double value) {
            addCriterion("ha_longkm_d44 >=", value, "ha_longkm_d44");
            return (Criteria) this;
        }
        
        public Criteria andDblLongkmD44LessThan(Double value) {
            addCriterion("ha_longkm_d44 <", value, "ha_longkm_d44");
            return (Criteria) this;
        }
        
        public Criteria andDblLongkmD44LessThanOrEqualTo(Double value) {
            addCriterion("ha_longkm_d44 <=", value, "ha_longkm_d44");
            return (Criteria) this;
        }
        
        public Criteria andDblLongkmD44In(List<Double> values) {
            addCriterion("ha_longkm_d44 in", values, "ha_longkm_d44");
            return (Criteria) this;
        }
        
        public Criteria andDblLongkmD44NotIn(List<Double> values) {
            addCriterion("ha_longkm_d44 not in", values, "ha_longkm_d44");
            return (Criteria) this;
        }
        
        public Criteria andDblLongkmD44Between(Double value1, Double value2) {
            addCriterion("ha_longkm_d44 between", value1, value2, "ha_longkm_d44");
            return (Criteria) this;
        }
        
        public Criteria andDblLongkmD44NotBetween(Double value1, Double value2) {
            addCriterion("ha_longkm_d44 not between", value1, value2, "ha_longkm_d44");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSuperRodLike(String value) {
            addCriterion("upper(de_super_rod) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_super_rod");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperRodNotLike(String value) {
            addCriterion("de_super_rod not like", "%" + CadenaUtil.getStr(value) + "%", "de_super_rod");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperRodEqualTo(String value) {
            addCriterion("de_super_rod =", CadenaUtil.getStr(value), "de_super_rod");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperRodNotEqualTo(String value) {
            addCriterion("de_super_rod <>", CadenaUtil.getStr(value), "de_super_rod");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSuperRodIsNull() {
            addCriterion("de_super_rod is null");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperRodIsNotNull() {
            addCriterion("de_super_rod is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperRodGreaterThan(String value) {
            addCriterion("de_super_rod >", value, "de_super_rod");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperRodGreaterThanOrEqualTo(String value) {
            addCriterion("de_super_rod >=", value, "de_super_rod");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperRodLessThan(String value) {
            addCriterion("de_super_rod <", value, "de_super_rod");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperRodLessThanOrEqualTo(String value) {
            addCriterion("de_super_rod <=", value, "de_super_rod");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperRodIn(List<String> values) {
            addCriterion("de_super_rod in", values, "de_super_rod");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperRodNotIn(List<String> values) {
            addCriterion("de_super_rod not in", values, "de_super_rod");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperRodBetween(String value1, String value2) {
            addCriterion("de_super_rod between", value1, value2, "de_super_rod");
            return (Criteria) this;
        }
        
        public Criteria andStrSuperRodNotBetween(String value1, String value2) {
            addCriterion("de_super_rod not between", value1, value2, "de_super_rod");
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
