package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class TemViasTrochasParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected String strHashConsulta;
	
    public TemViasTrochasParamDef() {
        oredCriteria = new ArrayList<Criteria>();
    }
	
    public void setStrHashConsulta(String strHashConsulta) {
    	if(CadenaUtil.getStrNull(strHashConsulta) != null) {
        	this.strHashConsulta = " inner join wcmc_hef.tem_query_acl qry on de_hash_consulta = '"+CadenaUtil.getStr(strHashConsulta)+"' and ST_Intersects(ST_Transform(si_the_geom, 32718), cd_rast) ";
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
        	addCriterion("ST_Intersects(si_the_geom, ST_GeomFromText('"+CadenaUtil.getStr(value)+"',4326)) ");
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
        
        
        public Criteria andStrDescripLike(String value) {
            addCriterion("upper(de_descrip) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_descrip");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripNotLike(String value) {
            addCriterion("de_descrip not like", "%" + CadenaUtil.getStr(value) + "%", "de_descrip");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripEqualTo(String value) {
            addCriterion("de_descrip =", CadenaUtil.getStr(value), "de_descrip");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripNotEqualTo(String value) {
            addCriterion("de_descrip <>", CadenaUtil.getStr(value), "de_descrip");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDescripIsNull() {
            addCriterion("de_descrip is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripIsNotNull() {
            addCriterion("de_descrip is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripGreaterThan(String value) {
            addCriterion("de_descrip >", value, "de_descrip");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripGreaterThanOrEqualTo(String value) {
            addCriterion("de_descrip >=", value, "de_descrip");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripLessThan(String value) {
            addCriterion("de_descrip <", value, "de_descrip");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripLessThanOrEqualTo(String value) {
            addCriterion("de_descrip <=", value, "de_descrip");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripIn(List<String> values) {
            addCriterion("de_descrip in", values, "de_descrip");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripNotIn(List<String> values) {
            addCriterion("de_descrip not in", values, "de_descrip");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripBetween(String value1, String value2) {
            addCriterion("de_descrip between", value1, value2, "de_descrip");
            return (Criteria) this;
        }
        
        public Criteria andStrDescripNotBetween(String value1, String value2) {
            addCriterion("de_descrip not between", value1, value2, "de_descrip");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeLengEqualTo(Double value) {
            addCriterion("ha_shape_leng =", value, "ha_shape_leng");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengNotEqualTo(Double value) {
            addCriterion("ha_shape_leng <>", value, "ha_shape_leng");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeLengIsNull() {
            addCriterion("ha_shape_leng is null");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengIsNotNull() {
            addCriterion("ha_shape_leng is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengGreaterThan(Double value) {
            addCriterion("ha_shape_leng >", value, "ha_shape_leng");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_shape_leng >=", value, "ha_shape_leng");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengLessThan(Double value) {
            addCriterion("ha_shape_leng <", value, "ha_shape_leng");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengLessThanOrEqualTo(Double value) {
            addCriterion("ha_shape_leng <=", value, "ha_shape_leng");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengIn(List<Double> values) {
            addCriterion("ha_shape_leng in", values, "ha_shape_leng");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengNotIn(List<Double> values) {
            addCriterion("ha_shape_leng not in", values, "ha_shape_leng");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengBetween(Double value1, Double value2) {
            addCriterion("ha_shape_leng between", value1, value2, "ha_shape_leng");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengNotBetween(Double value1, Double value2) {
            addCriterion("ha_shape_leng not between", value1, value2, "ha_shape_leng");
            return (Criteria) this;
        }
        
        
        public Criteria andDblStLengthEqualTo(Double value) {
            addCriterion("ha_st_length_ =", value, "ha_st_length_");
            return (Criteria) this;
        }
        
        public Criteria andDblStLengthNotEqualTo(Double value) {
            addCriterion("ha_st_length_ <>", value, "ha_st_length_");
            return (Criteria) this;
        }
        
        
        public Criteria andDblStLengthIsNull() {
            addCriterion("ha_st_length_ is null");
            return (Criteria) this;
        }
        
        public Criteria andDblStLengthIsNotNull() {
            addCriterion("ha_st_length_ is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblStLengthGreaterThan(Double value) {
            addCriterion("ha_st_length_ >", value, "ha_st_length_");
            return (Criteria) this;
        }
        
        public Criteria andDblStLengthGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_st_length_ >=", value, "ha_st_length_");
            return (Criteria) this;
        }
        
        public Criteria andDblStLengthLessThan(Double value) {
            addCriterion("ha_st_length_ <", value, "ha_st_length_");
            return (Criteria) this;
        }
        
        public Criteria andDblStLengthLessThanOrEqualTo(Double value) {
            addCriterion("ha_st_length_ <=", value, "ha_st_length_");
            return (Criteria) this;
        }
        
        public Criteria andDblStLengthIn(List<Double> values) {
            addCriterion("ha_st_length_ in", values, "ha_st_length_");
            return (Criteria) this;
        }
        
        public Criteria andDblStLengthNotIn(List<Double> values) {
            addCriterion("ha_st_length_ not in", values, "ha_st_length_");
            return (Criteria) this;
        }
        
        public Criteria andDblStLengthBetween(Double value1, Double value2) {
            addCriterion("ha_st_length_ between", value1, value2, "ha_st_length_");
            return (Criteria) this;
        }
        
        public Criteria andDblStLengthNotBetween(Double value1, Double value2) {
            addCriterion("ha_st_length_ not between", value1, value2, "ha_st_length_");
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
