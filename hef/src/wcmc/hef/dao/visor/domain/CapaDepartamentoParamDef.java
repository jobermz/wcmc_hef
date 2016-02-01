package wcmc.hef.dao.visor.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class CapaDepartamentoParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CapaDepartamentoParamDef() {
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
        
                
        
        public Criteria andIntIdGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andIntIdGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andIntIdGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIdDepartamentoLike(String value) {
            addCriterion("upper(id_departamento) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoNotLike(String value) {
            addCriterion("id_departamento not like", "%" + CadenaUtil.getStr(value) + "%", "id_departamento");
            return (Criteria) this;
        }
			
        public Criteria andStrIdDepartamentoEqualTo(String value) {
            addCriterion("id_departamento =", CadenaUtil.getStr(value), "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoNotEqualTo(String value) {
            addCriterion("id_departamento <>", CadenaUtil.getStr(value), "id_departamento");
            return (Criteria) this;
        }

        
        public Criteria andStrIdDepartamentoIsNull() {
            addCriterion("id_departamento is null");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoIsNotNull() {
            addCriterion("id_departamento is not null");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoGreaterThan(String value) {
            addCriterion("id_departamento >", value, "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoGreaterThanOrEqualTo(String value) {
            addCriterion("id_departamento >=", value, "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoLessThan(String value) {
            addCriterion("id_departamento <", value, "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoLessThanOrEqualTo(String value) {
            addCriterion("id_departamento <=", value, "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoIn(List<String> values) {
            addCriterion("id_departamento in", values, "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoNotIn(List<String> values) {
            addCriterion("id_departamento not in", values, "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoBetween(String value1, String value2) {
            addCriterion("id_departamento between", value1, value2, "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoNotBetween(String value1, String value2) {
            addCriterion("id_departamento not between", value1, value2, "id_departamento");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombreLike(String value) {
            addCriterion("upper(nom_departamento) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotLike(String value) {
            addCriterion("nom_departamento not like", "%" + CadenaUtil.getStr(value) + "%", "nom_departamento");
            return (Criteria) this;
        }
			
        public Criteria andStrNombreEqualTo(String value) {
            addCriterion("nom_departamento =", CadenaUtil.getStr(value), "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotEqualTo(String value) {
            addCriterion("nom_departamento <>", CadenaUtil.getStr(value), "nom_departamento");
            return (Criteria) this;
        }

        
        public Criteria andStrNombreIsNull() {
            addCriterion("nom_departamento is null");
            return (Criteria) this;
        }

        public Criteria andStrNombreIsNotNull() {
            addCriterion("nom_departamento is not null");
            return (Criteria) this;
        }

        public Criteria andStrNombreGreaterThan(String value) {
            addCriterion("nom_departamento >", value, "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreGreaterThanOrEqualTo(String value) {
            addCriterion("nom_departamento >=", value, "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreLessThan(String value) {
            addCriterion("nom_departamento <", value, "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreLessThanOrEqualTo(String value) {
            addCriterion("nom_departamento <=", value, "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreIn(List<String> values) {
            addCriterion("nom_departamento in", values, "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotIn(List<String> values) {
            addCriterion("nom_departamento not in", values, "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreBetween(String value1, String value2) {
            addCriterion("nom_departamento between", value1, value2, "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotBetween(String value1, String value2) {
            addCriterion("nom_departamento not between", value1, value2, "nom_departamento");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaEqualTo(Double value) {
            addCriterion("num_area =", value, "num_area");
            return (Criteria) this;
        }

        public Criteria andDblAreaNotEqualTo(Double value) {
            addCriterion("num_area <>", value, "num_area");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaIsNull() {
            addCriterion("num_area is null");
            return (Criteria) this;
        }

        public Criteria andDblAreaIsNotNull() {
            addCriterion("num_area is not null");
            return (Criteria) this;
        }

        public Criteria andDblAreaGreaterThan(Double value) {
            addCriterion("num_area >", value, "num_area");
            return (Criteria) this;
        }

        public Criteria andDblAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("num_area >=", value, "num_area");
            return (Criteria) this;
        }

        public Criteria andDblAreaLessThan(Double value) {
            addCriterion("num_area <", value, "num_area");
            return (Criteria) this;
        }

        public Criteria andDblAreaLessThanOrEqualTo(Double value) {
            addCriterion("num_area <=", value, "num_area");
            return (Criteria) this;
        }

        public Criteria andDblAreaIn(List<Double> values) {
            addCriterion("num_area in", values, "num_area");
            return (Criteria) this;
        }

        public Criteria andDblAreaNotIn(List<Double> values) {
            addCriterion("num_area not in", values, "num_area");
            return (Criteria) this;
        }

        public Criteria andDblAreaBetween(Double value1, Double value2) {
            addCriterion("num_area between", value1, value2, "num_area");
            return (Criteria) this;
        }

        public Criteria andDblAreaNotBetween(Double value1, Double value2) {
            addCriterion("num_area not between", value1, value2, "num_area");
            return (Criteria) this;
        }
        
        
        public Criteria andTimFechaRegistroEqualTo(Date value) {
            addCriterion("fec_registro =", value, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroNotEqualTo(Date value) {
            addCriterion("fec_registro <>", value, "fec_registro");
            return (Criteria) this;
        }
        
        
        public Criteria andTimFechaRegistroIsNull() {
            addCriterion("fec_registro is null");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroIsNotNull() {
            addCriterion("fec_registro is not null");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroGreaterThan(Date value) {
            addCriterion("fec_registro >", value, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroGreaterThanOrEqualTo(Date value) {
            addCriterion("fec_registro >=", value, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroLessThan(Date value) {
            addCriterion("fec_registro <", value, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroLessThanOrEqualTo(Date value) {
            addCriterion("fec_registro <=", value, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroIn(List<Date> values) {
            addCriterion("fec_registro in", values, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroNotIn(List<Date> values) {
            addCriterion("fec_registro not in", values, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroBetween(Date value1, Date value2) {
            addCriterion("fec_registro between", value1, value2, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroNotBetween(Date value1, Date value2) {
            addCriterion("fec_registro not between", value1, value2, "fec_registro");
            return (Criteria) this;
        }
        
        
        public Criteria andStrGeometriaLike(String value) {
            addCriterion("upper(shp_geometria) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaNotLike(String value) {
            addCriterion("shp_geometria not like", "%" + CadenaUtil.getStr(value) + "%", "shp_geometria");
            return (Criteria) this;
        }
			
        public Criteria andStrGeometriaEqualTo(String value) {
            addCriterion("shp_geometria =", CadenaUtil.getStr(value), "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaNotEqualTo(String value) {
            addCriterion("shp_geometria <>", CadenaUtil.getStr(value), "shp_geometria");
            return (Criteria) this;
        }

        
        public Criteria andStrGeometriaIsNull() {
            addCriterion("shp_geometria is null");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaIsNotNull() {
            addCriterion("shp_geometria is not null");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaGreaterThan(String value) {
            addCriterion("shp_geometria >", value, "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaGreaterThanOrEqualTo(String value) {
            addCriterion("shp_geometria >=", value, "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaLessThan(String value) {
            addCriterion("shp_geometria <", value, "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaLessThanOrEqualTo(String value) {
            addCriterion("shp_geometria <=", value, "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaIn(List<String> values) {
            addCriterion("shp_geometria in", values, "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaNotIn(List<String> values) {
            addCriterion("shp_geometria not in", values, "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaBetween(String value1, String value2) {
            addCriterion("shp_geometria between", value1, value2, "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaNotBetween(String value1, String value2) {
            addCriterion("shp_geometria not between", value1, value2, "shp_geometria");
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
