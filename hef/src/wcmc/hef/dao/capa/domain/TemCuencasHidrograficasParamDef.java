package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class TemCuencasHidrograficasParamDef {
		
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected String strHashConsulta;
	
    public TemCuencasHidrograficasParamDef() {
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
        
        
        public Criteria andIntObjectidEqualTo(Integer value) {
            addCriterion("cd_objectid =", value, "cd_objectid");
            return (Criteria) this;
        }
        
        public Criteria andIntObjectidNotEqualTo(Integer value) {
            addCriterion("cd_objectid <>", value, "cd_objectid");
            return (Criteria) this;
        }
        
        
        public Criteria andIntObjectidIsNull() {
            addCriterion("cd_objectid is null");
            return (Criteria) this;
        }
        
        public Criteria andIntObjectidIsNotNull() {
            addCriterion("cd_objectid is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntObjectidGreaterThan(Integer value) {
            addCriterion("cd_objectid >", value, "cd_objectid");
            return (Criteria) this;
        }
        
        public Criteria andIntObjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_objectid >=", value, "cd_objectid");
            return (Criteria) this;
        }
        
        public Criteria andIntObjectidLessThan(Integer value) {
            addCriterion("cd_objectid <", value, "cd_objectid");
            return (Criteria) this;
        }
        
        public Criteria andIntObjectidLessThanOrEqualTo(Integer value) {
            addCriterion("cd_objectid <=", value, "cd_objectid");
            return (Criteria) this;
        }
        
        public Criteria andIntObjectidIn(List<Integer> values) {
            addCriterion("cd_objectid in", values, "cd_objectid");
            return (Criteria) this;
        }
        
        public Criteria andIntObjectidNotIn(List<Integer> values) {
            addCriterion("cd_objectid not in", values, "cd_objectid");
            return (Criteria) this;
        }
        
        public Criteria andIntObjectidBetween(Integer value1, Integer value2) {
            addCriterion("cd_objectid between", value1, value2, "cd_objectid");
            return (Criteria) this;
        }
        
        public Criteria andIntObjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_objectid not between", value1, value2, "cd_objectid");
            return (Criteria) this;
        }
        
        
        public Criteria andStrGmlIdLike(String value) {
            addCriterion("upper(de_gml_id) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdNotLike(String value) {
            addCriterion("de_gml_id not like", "%" + CadenaUtil.getStr(value) + "%", "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdEqualTo(String value) {
            addCriterion("de_gml_id =", CadenaUtil.getStr(value), "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdNotEqualTo(String value) {
            addCriterion("de_gml_id <>", CadenaUtil.getStr(value), "de_gml_id");
            return (Criteria) this;
        }
        
        
        public Criteria andStrGmlIdIsNull() {
            addCriterion("de_gml_id is null");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdIsNotNull() {
            addCriterion("de_gml_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdGreaterThan(String value) {
            addCriterion("de_gml_id >", value, "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdGreaterThanOrEqualTo(String value) {
            addCriterion("de_gml_id >=", value, "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdLessThan(String value) {
            addCriterion("de_gml_id <", value, "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdLessThanOrEqualTo(String value) {
            addCriterion("de_gml_id <=", value, "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdIn(List<String> values) {
            addCriterion("de_gml_id in", values, "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdNotIn(List<String> values) {
            addCriterion("de_gml_id not in", values, "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdBetween(String value1, String value2) {
            addCriterion("de_gml_id between", value1, value2, "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdNotBetween(String value1, String value2) {
            addCriterion("de_gml_id not between", value1, value2, "de_gml_id");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIdLike(String value) {
            addCriterion("upper(de_id) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_id");
            return (Criteria) this;
        }
        
        public Criteria andStrIdNotLike(String value) {
            addCriterion("de_id not like", "%" + CadenaUtil.getStr(value) + "%", "de_id");
            return (Criteria) this;
        }
        
        public Criteria andStrIdEqualTo(String value) {
            addCriterion("de_id =", CadenaUtil.getStr(value), "de_id");
            return (Criteria) this;
        }
        
        public Criteria andStrIdNotEqualTo(String value) {
            addCriterion("de_id <>", CadenaUtil.getStr(value), "de_id");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIdIsNull() {
            addCriterion("de_id is null");
            return (Criteria) this;
        }
        
        public Criteria andStrIdIsNotNull() {
            addCriterion("de_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrIdGreaterThan(String value) {
            addCriterion("de_id >", value, "de_id");
            return (Criteria) this;
        }
        
        public Criteria andStrIdGreaterThanOrEqualTo(String value) {
            addCriterion("de_id >=", value, "de_id");
            return (Criteria) this;
        }
        
        public Criteria andStrIdLessThan(String value) {
            addCriterion("de_id <", value, "de_id");
            return (Criteria) this;
        }
        
        public Criteria andStrIdLessThanOrEqualTo(String value) {
            addCriterion("de_id <=", value, "de_id");
            return (Criteria) this;
        }
        
        public Criteria andStrIdIn(List<String> values) {
            addCriterion("de_id in", values, "de_id");
            return (Criteria) this;
        }
        
        public Criteria andStrIdNotIn(List<String> values) {
            addCriterion("de_id not in", values, "de_id");
            return (Criteria) this;
        }
        
        public Criteria andStrIdBetween(String value1, String value2) {
            addCriterion("de_id between", value1, value2, "de_id");
            return (Criteria) this;
        }
        
        public Criteria andStrIdNotBetween(String value1, String value2) {
            addCriterion("de_id not between", value1, value2, "de_id");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCodigoLike(String value) {
            addCriterion("upper(de_codigo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoNotLike(String value) {
            addCriterion("de_codigo not like", "%" + CadenaUtil.getStr(value) + "%", "de_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoEqualTo(String value) {
            addCriterion("de_codigo =", CadenaUtil.getStr(value), "de_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoNotEqualTo(String value) {
            addCriterion("de_codigo <>", CadenaUtil.getStr(value), "de_codigo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCodigoIsNull() {
            addCriterion("de_codigo is null");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoIsNotNull() {
            addCriterion("de_codigo is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoGreaterThan(String value) {
            addCriterion("de_codigo >", value, "de_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoGreaterThanOrEqualTo(String value) {
            addCriterion("de_codigo >=", value, "de_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoLessThan(String value) {
            addCriterion("de_codigo <", value, "de_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoLessThanOrEqualTo(String value) {
            addCriterion("de_codigo <=", value, "de_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoIn(List<String> values) {
            addCriterion("de_codigo in", values, "de_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoNotIn(List<String> values) {
            addCriterion("de_codigo not in", values, "de_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoBetween(String value1, String value2) {
            addCriterion("de_codigo between", value1, value2, "de_codigo");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoNotBetween(String value1, String value2) {
            addCriterion("de_codigo not between", value1, value2, "de_codigo");
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
        
        
        public Criteria andStrGeometriaLike(String value) {
            addCriterion("upper(de_geometria) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_geometria");
            return (Criteria) this;
        }
        
        public Criteria andStrGeometriaNotLike(String value) {
            addCriterion("de_geometria not like", "%" + CadenaUtil.getStr(value) + "%", "de_geometria");
            return (Criteria) this;
        }
        
        public Criteria andStrGeometriaEqualTo(String value) {
            addCriterion("de_geometria =", CadenaUtil.getStr(value), "de_geometria");
            return (Criteria) this;
        }
        
        public Criteria andStrGeometriaNotEqualTo(String value) {
            addCriterion("de_geometria <>", CadenaUtil.getStr(value), "de_geometria");
            return (Criteria) this;
        }
        
        
        public Criteria andStrGeometriaIsNull() {
            addCriterion("de_geometria is null");
            return (Criteria) this;
        }
        
        public Criteria andStrGeometriaIsNotNull() {
            addCriterion("de_geometria is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrGeometriaGreaterThan(String value) {
            addCriterion("de_geometria >", value, "de_geometria");
            return (Criteria) this;
        }
        
        public Criteria andStrGeometriaGreaterThanOrEqualTo(String value) {
            addCriterion("de_geometria >=", value, "de_geometria");
            return (Criteria) this;
        }
        
        public Criteria andStrGeometriaLessThan(String value) {
            addCriterion("de_geometria <", value, "de_geometria");
            return (Criteria) this;
        }
        
        public Criteria andStrGeometriaLessThanOrEqualTo(String value) {
            addCriterion("de_geometria <=", value, "de_geometria");
            return (Criteria) this;
        }
        
        public Criteria andStrGeometriaIn(List<String> values) {
            addCriterion("de_geometria in", values, "de_geometria");
            return (Criteria) this;
        }
        
        public Criteria andStrGeometriaNotIn(List<String> values) {
            addCriterion("de_geometria not in", values, "de_geometria");
            return (Criteria) this;
        }
        
        public Criteria andStrGeometriaBetween(String value1, String value2) {
            addCriterion("de_geometria between", value1, value2, "de_geometria");
            return (Criteria) this;
        }
        
        public Criteria andStrGeometriaNotBetween(String value1, String value2) {
            addCriterion("de_geometria not between", value1, value2, "de_geometria");
            return (Criteria) this;
        }
        
        
        public Criteria andIntEsriOidEqualTo(Integer value) {
            addCriterion("cd_esri_oid =", value, "cd_esri_oid");
            return (Criteria) this;
        }
        
        public Criteria andIntEsriOidNotEqualTo(Integer value) {
            addCriterion("cd_esri_oid <>", value, "cd_esri_oid");
            return (Criteria) this;
        }
        
        
        public Criteria andIntEsriOidIsNull() {
            addCriterion("cd_esri_oid is null");
            return (Criteria) this;
        }
        
        public Criteria andIntEsriOidIsNotNull() {
            addCriterion("cd_esri_oid is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntEsriOidGreaterThan(Integer value) {
            addCriterion("cd_esri_oid >", value, "cd_esri_oid");
            return (Criteria) this;
        }
        
        public Criteria andIntEsriOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_esri_oid >=", value, "cd_esri_oid");
            return (Criteria) this;
        }
        
        public Criteria andIntEsriOidLessThan(Integer value) {
            addCriterion("cd_esri_oid <", value, "cd_esri_oid");
            return (Criteria) this;
        }
        
        public Criteria andIntEsriOidLessThanOrEqualTo(Integer value) {
            addCriterion("cd_esri_oid <=", value, "cd_esri_oid");
            return (Criteria) this;
        }
        
        public Criteria andIntEsriOidIn(List<Integer> values) {
            addCriterion("cd_esri_oid in", values, "cd_esri_oid");
            return (Criteria) this;
        }
        
        public Criteria andIntEsriOidNotIn(List<Integer> values) {
            addCriterion("cd_esri_oid not in", values, "cd_esri_oid");
            return (Criteria) this;
        }
        
        public Criteria andIntEsriOidBetween(Integer value1, Integer value2) {
            addCriterion("cd_esri_oid between", value1, value2, "cd_esri_oid");
            return (Criteria) this;
        }
        
        public Criteria andIntEsriOidNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_esri_oid not between", value1, value2, "cd_esri_oid");
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
