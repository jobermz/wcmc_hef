package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class TemCoverturaVegetal2015ParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TemCoverturaVegetal2015ParamDef() {
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
        
        
        public Criteria andStrCobveg2013Like(String value) {
            addCriterion("upper(de_cobveg2013) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_cobveg2013");
            return (Criteria) this;
        }
        
        public Criteria andStrCobveg2013NotLike(String value) {
            addCriterion("de_cobveg2013 not like", "%" + CadenaUtil.getStr(value) + "%", "de_cobveg2013");
            return (Criteria) this;
        }
        
        public Criteria andStrCobveg2013EqualTo(String value) {
            addCriterion("de_cobveg2013 =", CadenaUtil.getStr(value), "de_cobveg2013");
            return (Criteria) this;
        }
        
        public Criteria andStrCobveg2013NotEqualTo(String value) {
            addCriterion("de_cobveg2013 <>", CadenaUtil.getStr(value), "de_cobveg2013");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCobveg2013IsNull() {
            addCriterion("de_cobveg2013 is null");
            return (Criteria) this;
        }
        
        public Criteria andStrCobveg2013IsNotNull() {
            addCriterion("de_cobveg2013 is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrCobveg2013GreaterThan(String value) {
            addCriterion("de_cobveg2013 >", value, "de_cobveg2013");
            return (Criteria) this;
        }
        
        public Criteria andStrCobveg2013GreaterThanOrEqualTo(String value) {
            addCriterion("de_cobveg2013 >=", value, "de_cobveg2013");
            return (Criteria) this;
        }
        
        public Criteria andStrCobveg2013LessThan(String value) {
            addCriterion("de_cobveg2013 <", value, "de_cobveg2013");
            return (Criteria) this;
        }
        
        public Criteria andStrCobveg2013LessThanOrEqualTo(String value) {
            addCriterion("de_cobveg2013 <=", value, "de_cobveg2013");
            return (Criteria) this;
        }
        
        public Criteria andStrCobveg2013In(List<String> values) {
            addCriterion("de_cobveg2013 in", values, "de_cobveg2013");
            return (Criteria) this;
        }
        
        public Criteria andStrCobveg2013NotIn(List<String> values) {
            addCriterion("de_cobveg2013 not in", values, "de_cobveg2013");
            return (Criteria) this;
        }
        
        public Criteria andStrCobveg2013Between(String value1, String value2) {
            addCriterion("de_cobveg2013 between", value1, value2, "de_cobveg2013");
            return (Criteria) this;
        }
        
        public Criteria andStrCobveg2013NotBetween(String value1, String value2) {
            addCriterion("de_cobveg2013 not between", value1, value2, "de_cobveg2013");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSimboloLike(String value) {
            addCriterion("upper(de_simbolo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_simbolo");
            return (Criteria) this;
        }
        
        public Criteria andStrSimboloNotLike(String value) {
            addCriterion("de_simbolo not like", "%" + CadenaUtil.getStr(value) + "%", "de_simbolo");
            return (Criteria) this;
        }
        
        public Criteria andStrSimboloEqualTo(String value) {
            addCriterion("de_simbolo =", CadenaUtil.getStr(value), "de_simbolo");
            return (Criteria) this;
        }
        
        public Criteria andStrSimboloNotEqualTo(String value) {
            addCriterion("de_simbolo <>", CadenaUtil.getStr(value), "de_simbolo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSimboloIsNull() {
            addCriterion("de_simbolo is null");
            return (Criteria) this;
        }
        
        public Criteria andStrSimboloIsNotNull() {
            addCriterion("de_simbolo is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrSimboloGreaterThan(String value) {
            addCriterion("de_simbolo >", value, "de_simbolo");
            return (Criteria) this;
        }
        
        public Criteria andStrSimboloGreaterThanOrEqualTo(String value) {
            addCriterion("de_simbolo >=", value, "de_simbolo");
            return (Criteria) this;
        }
        
        public Criteria andStrSimboloLessThan(String value) {
            addCriterion("de_simbolo <", value, "de_simbolo");
            return (Criteria) this;
        }
        
        public Criteria andStrSimboloLessThanOrEqualTo(String value) {
            addCriterion("de_simbolo <=", value, "de_simbolo");
            return (Criteria) this;
        }
        
        public Criteria andStrSimboloIn(List<String> values) {
            addCriterion("de_simbolo in", values, "de_simbolo");
            return (Criteria) this;
        }
        
        public Criteria andStrSimboloNotIn(List<String> values) {
            addCriterion("de_simbolo not in", values, "de_simbolo");
            return (Criteria) this;
        }
        
        public Criteria andStrSimboloBetween(String value1, String value2) {
            addCriterion("de_simbolo between", value1, value2, "de_simbolo");
            return (Criteria) this;
        }
        
        public Criteria andStrSimboloNotBetween(String value1, String value2) {
            addCriterion("de_simbolo not between", value1, value2, "de_simbolo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFisiogrLike(String value) {
            addCriterion("upper(de_fisiogr) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_fisiogr");
            return (Criteria) this;
        }
        
        public Criteria andStrFisiogrNotLike(String value) {
            addCriterion("de_fisiogr not like", "%" + CadenaUtil.getStr(value) + "%", "de_fisiogr");
            return (Criteria) this;
        }
        
        public Criteria andStrFisiogrEqualTo(String value) {
            addCriterion("de_fisiogr =", CadenaUtil.getStr(value), "de_fisiogr");
            return (Criteria) this;
        }
        
        public Criteria andStrFisiogrNotEqualTo(String value) {
            addCriterion("de_fisiogr <>", CadenaUtil.getStr(value), "de_fisiogr");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFisiogrIsNull() {
            addCriterion("de_fisiogr is null");
            return (Criteria) this;
        }
        
        public Criteria andStrFisiogrIsNotNull() {
            addCriterion("de_fisiogr is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrFisiogrGreaterThan(String value) {
            addCriterion("de_fisiogr >", value, "de_fisiogr");
            return (Criteria) this;
        }
        
        public Criteria andStrFisiogrGreaterThanOrEqualTo(String value) {
            addCriterion("de_fisiogr >=", value, "de_fisiogr");
            return (Criteria) this;
        }
        
        public Criteria andStrFisiogrLessThan(String value) {
            addCriterion("de_fisiogr <", value, "de_fisiogr");
            return (Criteria) this;
        }
        
        public Criteria andStrFisiogrLessThanOrEqualTo(String value) {
            addCriterion("de_fisiogr <=", value, "de_fisiogr");
            return (Criteria) this;
        }
        
        public Criteria andStrFisiogrIn(List<String> values) {
            addCriterion("de_fisiogr in", values, "de_fisiogr");
            return (Criteria) this;
        }
        
        public Criteria andStrFisiogrNotIn(List<String> values) {
            addCriterion("de_fisiogr not in", values, "de_fisiogr");
            return (Criteria) this;
        }
        
        public Criteria andStrFisiogrBetween(String value1, String value2) {
            addCriterion("de_fisiogr between", value1, value2, "de_fisiogr");
            return (Criteria) this;
        }
        
        public Criteria andStrFisiogrNotBetween(String value1, String value2) {
            addCriterion("de_fisiogr not between", value1, value2, "de_fisiogr");
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
        
        
        public Criteria andDblShapeAreaEqualTo(Double value) {
            addCriterion("ha_shape_area =", value, "ha_shape_area");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeAreaNotEqualTo(Double value) {
            addCriterion("ha_shape_area <>", value, "ha_shape_area");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeAreaIsNull() {
            addCriterion("ha_shape_area is null");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeAreaIsNotNull() {
            addCriterion("ha_shape_area is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeAreaGreaterThan(Double value) {
            addCriterion("ha_shape_area >", value, "ha_shape_area");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_shape_area >=", value, "ha_shape_area");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeAreaLessThan(Double value) {
            addCriterion("ha_shape_area <", value, "ha_shape_area");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeAreaLessThanOrEqualTo(Double value) {
            addCriterion("ha_shape_area <=", value, "ha_shape_area");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeAreaIn(List<Double> values) {
            addCriterion("ha_shape_area in", values, "ha_shape_area");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeAreaNotIn(List<Double> values) {
            addCriterion("ha_shape_area not in", values, "ha_shape_area");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeAreaBetween(Double value1, Double value2) {
            addCriterion("ha_shape_area between", value1, value2, "ha_shape_area");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeAreaNotBetween(Double value1, Double value2) {
            addCriterion("ha_shape_area not between", value1, value2, "ha_shape_area");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCvLabelLike(String value) {
            addCriterion("upper(de_cv_label) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_cv_label");
            return (Criteria) this;
        }
        
        public Criteria andStrCvLabelNotLike(String value) {
            addCriterion("de_cv_label not like", "%" + CadenaUtil.getStr(value) + "%", "de_cv_label");
            return (Criteria) this;
        }
        
        public Criteria andStrCvLabelEqualTo(String value) {
            addCriterion("de_cv_label =", CadenaUtil.getStr(value), "de_cv_label");
            return (Criteria) this;
        }
        
        public Criteria andStrCvLabelNotEqualTo(String value) {
            addCriterion("de_cv_label <>", CadenaUtil.getStr(value), "de_cv_label");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCvLabelIsNull() {
            addCriterion("de_cv_label is null");
            return (Criteria) this;
        }
        
        public Criteria andStrCvLabelIsNotNull() {
            addCriterion("de_cv_label is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrCvLabelGreaterThan(String value) {
            addCriterion("de_cv_label >", value, "de_cv_label");
            return (Criteria) this;
        }
        
        public Criteria andStrCvLabelGreaterThanOrEqualTo(String value) {
            addCriterion("de_cv_label >=", value, "de_cv_label");
            return (Criteria) this;
        }
        
        public Criteria andStrCvLabelLessThan(String value) {
            addCriterion("de_cv_label <", value, "de_cv_label");
            return (Criteria) this;
        }
        
        public Criteria andStrCvLabelLessThanOrEqualTo(String value) {
            addCriterion("de_cv_label <=", value, "de_cv_label");
            return (Criteria) this;
        }
        
        public Criteria andStrCvLabelIn(List<String> values) {
            addCriterion("de_cv_label in", values, "de_cv_label");
            return (Criteria) this;
        }
        
        public Criteria andStrCvLabelNotIn(List<String> values) {
            addCriterion("de_cv_label not in", values, "de_cv_label");
            return (Criteria) this;
        }
        
        public Criteria andStrCvLabelBetween(String value1, String value2) {
            addCriterion("de_cv_label between", value1, value2, "de_cv_label");
            return (Criteria) this;
        }
        
        public Criteria andStrCvLabelNotBetween(String value1, String value2) {
            addCriterion("de_cv_label not between", value1, value2, "de_cv_label");
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
