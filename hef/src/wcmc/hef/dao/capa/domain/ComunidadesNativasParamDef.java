package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class ComunidadesNativasParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComunidadesNativasParamDef() {
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
        
        
        public Criteria andStrTheGeomLike(String value) {
            addCriterion("upper(si_the_geom) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomNotLike(String value) {
            addCriterion("si_the_geom not like", "%" + CadenaUtil.getStr(value) + "%", "si_the_geom");
            return (Criteria) this;
        }
			
        public Criteria andStrTheGeomEqualTo(String value) {
            addCriterion("si_the_geom =", CadenaUtil.getStr(value), "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomNotEqualTo(String value) {
            addCriterion("si_the_geom <>", CadenaUtil.getStr(value), "si_the_geom");
            return (Criteria) this;
        }

        
        public Criteria andStrTheGeomIsNull() {
            addCriterion("si_the_geom is null");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomIsNotNull() {
            addCriterion("si_the_geom is not null");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomGreaterThan(String value) {
            addCriterion("si_the_geom >", value, "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomGreaterThanOrEqualTo(String value) {
            addCriterion("si_the_geom >=", value, "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomLessThan(String value) {
            addCriterion("si_the_geom <", value, "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomLessThanOrEqualTo(String value) {
            addCriterion("si_the_geom <=", value, "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomIn(List<String> values) {
            addCriterion("si_the_geom in", values, "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomNotIn(List<String> values) {
            addCriterion("si_the_geom not in", values, "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomBetween(String value1, String value2) {
            addCriterion("si_the_geom between", value1, value2, "si_the_geom");
            return (Criteria) this;
        }

        public Criteria andStrTheGeomNotBetween(String value1, String value2) {
            addCriterion("si_the_geom not between", value1, value2, "si_the_geom");
            return (Criteria) this;
        }
        
        
        public Criteria andIntObjectid1EqualTo(Integer value) {
            addCriterion("cd_objectid_1 =", value, "cd_objectid_1");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1NotEqualTo(Integer value) {
            addCriterion("cd_objectid_1 <>", value, "cd_objectid_1");
            return (Criteria) this;
        }
        
        
        public Criteria andIntObjectid1IsNull() {
            addCriterion("cd_objectid_1 is null");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1IsNotNull() {
            addCriterion("cd_objectid_1 is not null");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1GreaterThan(Integer value) {
            addCriterion("cd_objectid_1 >", value, "cd_objectid_1");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1GreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_objectid_1 >=", value, "cd_objectid_1");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1LessThan(Integer value) {
            addCriterion("cd_objectid_1 <", value, "cd_objectid_1");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1LessThanOrEqualTo(Integer value) {
            addCriterion("cd_objectid_1 <=", value, "cd_objectid_1");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1In(List<Integer> values) {
            addCriterion("cd_objectid_1 in", values, "cd_objectid_1");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1NotIn(List<Integer> values) {
            addCriterion("cd_objectid_1 not in", values, "cd_objectid_1");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1Between(Integer value1, Integer value2) {
            addCriterion("cd_objectid_1 between", value1, value2, "cd_objectid_1");
            return (Criteria) this;
        }

        public Criteria andIntObjectid1NotBetween(Integer value1, Integer value2) {
            addCriterion("cd_objectid_1 not between", value1, value2, "cd_objectid_1");
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
        
        
        public Criteria andStrCodBibLike(String value) {
            addCriterion("upper(de_cod_bib) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_cod_bib");
            return (Criteria) this;
        }

        public Criteria andStrCodBibNotLike(String value) {
            addCriterion("de_cod_bib not like", "%" + CadenaUtil.getStr(value) + "%", "de_cod_bib");
            return (Criteria) this;
        }
			
        public Criteria andStrCodBibEqualTo(String value) {
            addCriterion("de_cod_bib =", CadenaUtil.getStr(value), "de_cod_bib");
            return (Criteria) this;
        }

        public Criteria andStrCodBibNotEqualTo(String value) {
            addCriterion("de_cod_bib <>", CadenaUtil.getStr(value), "de_cod_bib");
            return (Criteria) this;
        }

        
        public Criteria andStrCodBibIsNull() {
            addCriterion("de_cod_bib is null");
            return (Criteria) this;
        }

        public Criteria andStrCodBibIsNotNull() {
            addCriterion("de_cod_bib is not null");
            return (Criteria) this;
        }

        public Criteria andStrCodBibGreaterThan(String value) {
            addCriterion("de_cod_bib >", value, "de_cod_bib");
            return (Criteria) this;
        }

        public Criteria andStrCodBibGreaterThanOrEqualTo(String value) {
            addCriterion("de_cod_bib >=", value, "de_cod_bib");
            return (Criteria) this;
        }

        public Criteria andStrCodBibLessThan(String value) {
            addCriterion("de_cod_bib <", value, "de_cod_bib");
            return (Criteria) this;
        }

        public Criteria andStrCodBibLessThanOrEqualTo(String value) {
            addCriterion("de_cod_bib <=", value, "de_cod_bib");
            return (Criteria) this;
        }

        public Criteria andStrCodBibIn(List<String> values) {
            addCriterion("de_cod_bib in", values, "de_cod_bib");
            return (Criteria) this;
        }

        public Criteria andStrCodBibNotIn(List<String> values) {
            addCriterion("de_cod_bib not in", values, "de_cod_bib");
            return (Criteria) this;
        }

        public Criteria andStrCodBibBetween(String value1, String value2) {
            addCriterion("de_cod_bib between", value1, value2, "de_cod_bib");
            return (Criteria) this;
        }

        public Criteria andStrCodBibNotBetween(String value1, String value2) {
            addCriterion("de_cod_bib not between", value1, value2, "de_cod_bib");
            return (Criteria) this;
        }
        
        
        public Criteria andStrGeoreferLike(String value) {
            addCriterion("upper(de_georefer) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_georefer");
            return (Criteria) this;
        }

        public Criteria andStrGeoreferNotLike(String value) {
            addCriterion("de_georefer not like", "%" + CadenaUtil.getStr(value) + "%", "de_georefer");
            return (Criteria) this;
        }
			
        public Criteria andStrGeoreferEqualTo(String value) {
            addCriterion("de_georefer =", CadenaUtil.getStr(value), "de_georefer");
            return (Criteria) this;
        }

        public Criteria andStrGeoreferNotEqualTo(String value) {
            addCriterion("de_georefer <>", CadenaUtil.getStr(value), "de_georefer");
            return (Criteria) this;
        }

        
        public Criteria andStrGeoreferIsNull() {
            addCriterion("de_georefer is null");
            return (Criteria) this;
        }

        public Criteria andStrGeoreferIsNotNull() {
            addCriterion("de_georefer is not null");
            return (Criteria) this;
        }

        public Criteria andStrGeoreferGreaterThan(String value) {
            addCriterion("de_georefer >", value, "de_georefer");
            return (Criteria) this;
        }

        public Criteria andStrGeoreferGreaterThanOrEqualTo(String value) {
            addCriterion("de_georefer >=", value, "de_georefer");
            return (Criteria) this;
        }

        public Criteria andStrGeoreferLessThan(String value) {
            addCriterion("de_georefer <", value, "de_georefer");
            return (Criteria) this;
        }

        public Criteria andStrGeoreferLessThanOrEqualTo(String value) {
            addCriterion("de_georefer <=", value, "de_georefer");
            return (Criteria) this;
        }

        public Criteria andStrGeoreferIn(List<String> values) {
            addCriterion("de_georefer in", values, "de_georefer");
            return (Criteria) this;
        }

        public Criteria andStrGeoreferNotIn(List<String> values) {
            addCriterion("de_georefer not in", values, "de_georefer");
            return (Criteria) this;
        }

        public Criteria andStrGeoreferBetween(String value1, String value2) {
            addCriterion("de_georefer between", value1, value2, "de_georefer");
            return (Criteria) this;
        }

        public Criteria andStrGeoreferNotBetween(String value1, String value2) {
            addCriterion("de_georefer not between", value1, value2, "de_georefer");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSituacionLike(String value) {
            addCriterion("upper(de_situacion) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionNotLike(String value) {
            addCriterion("de_situacion not like", "%" + CadenaUtil.getStr(value) + "%", "de_situacion");
            return (Criteria) this;
        }
			
        public Criteria andStrSituacionEqualTo(String value) {
            addCriterion("de_situacion =", CadenaUtil.getStr(value), "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionNotEqualTo(String value) {
            addCriterion("de_situacion <>", CadenaUtil.getStr(value), "de_situacion");
            return (Criteria) this;
        }

        
        public Criteria andStrSituacionIsNull() {
            addCriterion("de_situacion is null");
            return (Criteria) this;
        }

        public Criteria andStrSituacionIsNotNull() {
            addCriterion("de_situacion is not null");
            return (Criteria) this;
        }

        public Criteria andStrSituacionGreaterThan(String value) {
            addCriterion("de_situacion >", value, "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionGreaterThanOrEqualTo(String value) {
            addCriterion("de_situacion >=", value, "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionLessThan(String value) {
            addCriterion("de_situacion <", value, "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionLessThanOrEqualTo(String value) {
            addCriterion("de_situacion <=", value, "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionIn(List<String> values) {
            addCriterion("de_situacion in", values, "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionNotIn(List<String> values) {
            addCriterion("de_situacion not in", values, "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionBetween(String value1, String value2) {
            addCriterion("de_situacion between", value1, value2, "de_situacion");
            return (Criteria) this;
        }

        public Criteria andStrSituacionNotBetween(String value1, String value2) {
            addCriterion("de_situacion not between", value1, value2, "de_situacion");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSectorLike(String value) {
            addCriterion("upper(de_sector) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_sector");
            return (Criteria) this;
        }

        public Criteria andStrSectorNotLike(String value) {
            addCriterion("de_sector not like", "%" + CadenaUtil.getStr(value) + "%", "de_sector");
            return (Criteria) this;
        }
			
        public Criteria andStrSectorEqualTo(String value) {
            addCriterion("de_sector =", CadenaUtil.getStr(value), "de_sector");
            return (Criteria) this;
        }

        public Criteria andStrSectorNotEqualTo(String value) {
            addCriterion("de_sector <>", CadenaUtil.getStr(value), "de_sector");
            return (Criteria) this;
        }

        
        public Criteria andStrSectorIsNull() {
            addCriterion("de_sector is null");
            return (Criteria) this;
        }

        public Criteria andStrSectorIsNotNull() {
            addCriterion("de_sector is not null");
            return (Criteria) this;
        }

        public Criteria andStrSectorGreaterThan(String value) {
            addCriterion("de_sector >", value, "de_sector");
            return (Criteria) this;
        }

        public Criteria andStrSectorGreaterThanOrEqualTo(String value) {
            addCriterion("de_sector >=", value, "de_sector");
            return (Criteria) this;
        }

        public Criteria andStrSectorLessThan(String value) {
            addCriterion("de_sector <", value, "de_sector");
            return (Criteria) this;
        }

        public Criteria andStrSectorLessThanOrEqualTo(String value) {
            addCriterion("de_sector <=", value, "de_sector");
            return (Criteria) this;
        }

        public Criteria andStrSectorIn(List<String> values) {
            addCriterion("de_sector in", values, "de_sector");
            return (Criteria) this;
        }

        public Criteria andStrSectorNotIn(List<String> values) {
            addCriterion("de_sector not in", values, "de_sector");
            return (Criteria) this;
        }

        public Criteria andStrSectorBetween(String value1, String value2) {
            addCriterion("de_sector between", value1, value2, "de_sector");
            return (Criteria) this;
        }

        public Criteria andStrSectorNotBetween(String value1, String value2) {
            addCriterion("de_sector not between", value1, value2, "de_sector");
            return (Criteria) this;
        }
        
        
        public Criteria andStrZonaLike(String value) {
            addCriterion("upper(de_zona) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaNotLike(String value) {
            addCriterion("de_zona not like", "%" + CadenaUtil.getStr(value) + "%", "de_zona");
            return (Criteria) this;
        }
			
        public Criteria andStrZonaEqualTo(String value) {
            addCriterion("de_zona =", CadenaUtil.getStr(value), "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaNotEqualTo(String value) {
            addCriterion("de_zona <>", CadenaUtil.getStr(value), "de_zona");
            return (Criteria) this;
        }

        
        public Criteria andStrZonaIsNull() {
            addCriterion("de_zona is null");
            return (Criteria) this;
        }

        public Criteria andStrZonaIsNotNull() {
            addCriterion("de_zona is not null");
            return (Criteria) this;
        }

        public Criteria andStrZonaGreaterThan(String value) {
            addCriterion("de_zona >", value, "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaGreaterThanOrEqualTo(String value) {
            addCriterion("de_zona >=", value, "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaLessThan(String value) {
            addCriterion("de_zona <", value, "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaLessThanOrEqualTo(String value) {
            addCriterion("de_zona <=", value, "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaIn(List<String> values) {
            addCriterion("de_zona in", values, "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaNotIn(List<String> values) {
            addCriterion("de_zona not in", values, "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaBetween(String value1, String value2) {
            addCriterion("de_zona between", value1, value2, "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaNotBetween(String value1, String value2) {
            addCriterion("de_zona not between", value1, value2, "de_zona");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSubzonaLike(String value) {
            addCriterion("upper(de_subzona) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_subzona");
            return (Criteria) this;
        }

        public Criteria andStrSubzonaNotLike(String value) {
            addCriterion("de_subzona not like", "%" + CadenaUtil.getStr(value) + "%", "de_subzona");
            return (Criteria) this;
        }
			
        public Criteria andStrSubzonaEqualTo(String value) {
            addCriterion("de_subzona =", CadenaUtil.getStr(value), "de_subzona");
            return (Criteria) this;
        }

        public Criteria andStrSubzonaNotEqualTo(String value) {
            addCriterion("de_subzona <>", CadenaUtil.getStr(value), "de_subzona");
            return (Criteria) this;
        }

        
        public Criteria andStrSubzonaIsNull() {
            addCriterion("de_subzona is null");
            return (Criteria) this;
        }

        public Criteria andStrSubzonaIsNotNull() {
            addCriterion("de_subzona is not null");
            return (Criteria) this;
        }

        public Criteria andStrSubzonaGreaterThan(String value) {
            addCriterion("de_subzona >", value, "de_subzona");
            return (Criteria) this;
        }

        public Criteria andStrSubzonaGreaterThanOrEqualTo(String value) {
            addCriterion("de_subzona >=", value, "de_subzona");
            return (Criteria) this;
        }

        public Criteria andStrSubzonaLessThan(String value) {
            addCriterion("de_subzona <", value, "de_subzona");
            return (Criteria) this;
        }

        public Criteria andStrSubzonaLessThanOrEqualTo(String value) {
            addCriterion("de_subzona <=", value, "de_subzona");
            return (Criteria) this;
        }

        public Criteria andStrSubzonaIn(List<String> values) {
            addCriterion("de_subzona in", values, "de_subzona");
            return (Criteria) this;
        }

        public Criteria andStrSubzonaNotIn(List<String> values) {
            addCriterion("de_subzona not in", values, "de_subzona");
            return (Criteria) this;
        }

        public Criteria andStrSubzonaBetween(String value1, String value2) {
            addCriterion("de_subzona between", value1, value2, "de_subzona");
            return (Criteria) this;
        }

        public Criteria andStrSubzonaNotBetween(String value1, String value2) {
            addCriterion("de_subzona not between", value1, value2, "de_subzona");
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
        
        
        public Criteria andStrFederacionLike(String value) {
            addCriterion("upper(de_federacion) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_federacion");
            return (Criteria) this;
        }

        public Criteria andStrFederacionNotLike(String value) {
            addCriterion("de_federacion not like", "%" + CadenaUtil.getStr(value) + "%", "de_federacion");
            return (Criteria) this;
        }
			
        public Criteria andStrFederacionEqualTo(String value) {
            addCriterion("de_federacion =", CadenaUtil.getStr(value), "de_federacion");
            return (Criteria) this;
        }

        public Criteria andStrFederacionNotEqualTo(String value) {
            addCriterion("de_federacion <>", CadenaUtil.getStr(value), "de_federacion");
            return (Criteria) this;
        }

        
        public Criteria andStrFederacionIsNull() {
            addCriterion("de_federacion is null");
            return (Criteria) this;
        }

        public Criteria andStrFederacionIsNotNull() {
            addCriterion("de_federacion is not null");
            return (Criteria) this;
        }

        public Criteria andStrFederacionGreaterThan(String value) {
            addCriterion("de_federacion >", value, "de_federacion");
            return (Criteria) this;
        }

        public Criteria andStrFederacionGreaterThanOrEqualTo(String value) {
            addCriterion("de_federacion >=", value, "de_federacion");
            return (Criteria) this;
        }

        public Criteria andStrFederacionLessThan(String value) {
            addCriterion("de_federacion <", value, "de_federacion");
            return (Criteria) this;
        }

        public Criteria andStrFederacionLessThanOrEqualTo(String value) {
            addCriterion("de_federacion <=", value, "de_federacion");
            return (Criteria) this;
        }

        public Criteria andStrFederacionIn(List<String> values) {
            addCriterion("de_federacion in", values, "de_federacion");
            return (Criteria) this;
        }

        public Criteria andStrFederacionNotIn(List<String> values) {
            addCriterion("de_federacion not in", values, "de_federacion");
            return (Criteria) this;
        }

        public Criteria andStrFederacionBetween(String value1, String value2) {
            addCriterion("de_federacion between", value1, value2, "de_federacion");
            return (Criteria) this;
        }

        public Criteria andStrFederacionNotBetween(String value1, String value2) {
            addCriterion("de_federacion not between", value1, value2, "de_federacion");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFamLinguiLike(String value) {
            addCriterion("upper(de_fam_lingui) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_fam_lingui");
            return (Criteria) this;
        }

        public Criteria andStrFamLinguiNotLike(String value) {
            addCriterion("de_fam_lingui not like", "%" + CadenaUtil.getStr(value) + "%", "de_fam_lingui");
            return (Criteria) this;
        }
			
        public Criteria andStrFamLinguiEqualTo(String value) {
            addCriterion("de_fam_lingui =", CadenaUtil.getStr(value), "de_fam_lingui");
            return (Criteria) this;
        }

        public Criteria andStrFamLinguiNotEqualTo(String value) {
            addCriterion("de_fam_lingui <>", CadenaUtil.getStr(value), "de_fam_lingui");
            return (Criteria) this;
        }

        
        public Criteria andStrFamLinguiIsNull() {
            addCriterion("de_fam_lingui is null");
            return (Criteria) this;
        }

        public Criteria andStrFamLinguiIsNotNull() {
            addCriterion("de_fam_lingui is not null");
            return (Criteria) this;
        }

        public Criteria andStrFamLinguiGreaterThan(String value) {
            addCriterion("de_fam_lingui >", value, "de_fam_lingui");
            return (Criteria) this;
        }

        public Criteria andStrFamLinguiGreaterThanOrEqualTo(String value) {
            addCriterion("de_fam_lingui >=", value, "de_fam_lingui");
            return (Criteria) this;
        }

        public Criteria andStrFamLinguiLessThan(String value) {
            addCriterion("de_fam_lingui <", value, "de_fam_lingui");
            return (Criteria) this;
        }

        public Criteria andStrFamLinguiLessThanOrEqualTo(String value) {
            addCriterion("de_fam_lingui <=", value, "de_fam_lingui");
            return (Criteria) this;
        }

        public Criteria andStrFamLinguiIn(List<String> values) {
            addCriterion("de_fam_lingui in", values, "de_fam_lingui");
            return (Criteria) this;
        }

        public Criteria andStrFamLinguiNotIn(List<String> values) {
            addCriterion("de_fam_lingui not in", values, "de_fam_lingui");
            return (Criteria) this;
        }

        public Criteria andStrFamLinguiBetween(String value1, String value2) {
            addCriterion("de_fam_lingui between", value1, value2, "de_fam_lingui");
            return (Criteria) this;
        }

        public Criteria andStrFamLinguiNotBetween(String value1, String value2) {
            addCriterion("de_fam_lingui not between", value1, value2, "de_fam_lingui");
            return (Criteria) this;
        }
        
        
        public Criteria andStrEtnia1Like(String value) {
            addCriterion("upper(de_etnia1) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_etnia1");
            return (Criteria) this;
        }

        public Criteria andStrEtnia1NotLike(String value) {
            addCriterion("de_etnia1 not like", "%" + CadenaUtil.getStr(value) + "%", "de_etnia1");
            return (Criteria) this;
        }
			
        public Criteria andStrEtnia1EqualTo(String value) {
            addCriterion("de_etnia1 =", CadenaUtil.getStr(value), "de_etnia1");
            return (Criteria) this;
        }

        public Criteria andStrEtnia1NotEqualTo(String value) {
            addCriterion("de_etnia1 <>", CadenaUtil.getStr(value), "de_etnia1");
            return (Criteria) this;
        }

        
        public Criteria andStrEtnia1IsNull() {
            addCriterion("de_etnia1 is null");
            return (Criteria) this;
        }

        public Criteria andStrEtnia1IsNotNull() {
            addCriterion("de_etnia1 is not null");
            return (Criteria) this;
        }

        public Criteria andStrEtnia1GreaterThan(String value) {
            addCriterion("de_etnia1 >", value, "de_etnia1");
            return (Criteria) this;
        }

        public Criteria andStrEtnia1GreaterThanOrEqualTo(String value) {
            addCriterion("de_etnia1 >=", value, "de_etnia1");
            return (Criteria) this;
        }

        public Criteria andStrEtnia1LessThan(String value) {
            addCriterion("de_etnia1 <", value, "de_etnia1");
            return (Criteria) this;
        }

        public Criteria andStrEtnia1LessThanOrEqualTo(String value) {
            addCriterion("de_etnia1 <=", value, "de_etnia1");
            return (Criteria) this;
        }

        public Criteria andStrEtnia1In(List<String> values) {
            addCriterion("de_etnia1 in", values, "de_etnia1");
            return (Criteria) this;
        }

        public Criteria andStrEtnia1NotIn(List<String> values) {
            addCriterion("de_etnia1 not in", values, "de_etnia1");
            return (Criteria) this;
        }

        public Criteria andStrEtnia1Between(String value1, String value2) {
            addCriterion("de_etnia1 between", value1, value2, "de_etnia1");
            return (Criteria) this;
        }

        public Criteria andStrEtnia1NotBetween(String value1, String value2) {
            addCriterion("de_etnia1 not between", value1, value2, "de_etnia1");
            return (Criteria) this;
        }
        
        
        public Criteria andStrEtnia2Like(String value) {
            addCriterion("upper(de_etnia2) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_etnia2");
            return (Criteria) this;
        }

        public Criteria andStrEtnia2NotLike(String value) {
            addCriterion("de_etnia2 not like", "%" + CadenaUtil.getStr(value) + "%", "de_etnia2");
            return (Criteria) this;
        }
			
        public Criteria andStrEtnia2EqualTo(String value) {
            addCriterion("de_etnia2 =", CadenaUtil.getStr(value), "de_etnia2");
            return (Criteria) this;
        }

        public Criteria andStrEtnia2NotEqualTo(String value) {
            addCriterion("de_etnia2 <>", CadenaUtil.getStr(value), "de_etnia2");
            return (Criteria) this;
        }

        
        public Criteria andStrEtnia2IsNull() {
            addCriterion("de_etnia2 is null");
            return (Criteria) this;
        }

        public Criteria andStrEtnia2IsNotNull() {
            addCriterion("de_etnia2 is not null");
            return (Criteria) this;
        }

        public Criteria andStrEtnia2GreaterThan(String value) {
            addCriterion("de_etnia2 >", value, "de_etnia2");
            return (Criteria) this;
        }

        public Criteria andStrEtnia2GreaterThanOrEqualTo(String value) {
            addCriterion("de_etnia2 >=", value, "de_etnia2");
            return (Criteria) this;
        }

        public Criteria andStrEtnia2LessThan(String value) {
            addCriterion("de_etnia2 <", value, "de_etnia2");
            return (Criteria) this;
        }

        public Criteria andStrEtnia2LessThanOrEqualTo(String value) {
            addCriterion("de_etnia2 <=", value, "de_etnia2");
            return (Criteria) this;
        }

        public Criteria andStrEtnia2In(List<String> values) {
            addCriterion("de_etnia2 in", values, "de_etnia2");
            return (Criteria) this;
        }

        public Criteria andStrEtnia2NotIn(List<String> values) {
            addCriterion("de_etnia2 not in", values, "de_etnia2");
            return (Criteria) this;
        }

        public Criteria andStrEtnia2Between(String value1, String value2) {
            addCriterion("de_etnia2 between", value1, value2, "de_etnia2");
            return (Criteria) this;
        }

        public Criteria andStrEtnia2NotBetween(String value1, String value2) {
            addCriterion("de_etnia2 not between", value1, value2, "de_etnia2");
            return (Criteria) this;
        }
        
        
        public Criteria andDblPoblacionEqualTo(Double value) {
            addCriterion("ha_poblacion =", value, "ha_poblacion");
            return (Criteria) this;
        }

        public Criteria andDblPoblacionNotEqualTo(Double value) {
            addCriterion("ha_poblacion <>", value, "ha_poblacion");
            return (Criteria) this;
        }
        
        
        public Criteria andDblPoblacionIsNull() {
            addCriterion("ha_poblacion is null");
            return (Criteria) this;
        }

        public Criteria andDblPoblacionIsNotNull() {
            addCriterion("ha_poblacion is not null");
            return (Criteria) this;
        }

        public Criteria andDblPoblacionGreaterThan(Double value) {
            addCriterion("ha_poblacion >", value, "ha_poblacion");
            return (Criteria) this;
        }

        public Criteria andDblPoblacionGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_poblacion >=", value, "ha_poblacion");
            return (Criteria) this;
        }

        public Criteria andDblPoblacionLessThan(Double value) {
            addCriterion("ha_poblacion <", value, "ha_poblacion");
            return (Criteria) this;
        }

        public Criteria andDblPoblacionLessThanOrEqualTo(Double value) {
            addCriterion("ha_poblacion <=", value, "ha_poblacion");
            return (Criteria) this;
        }

        public Criteria andDblPoblacionIn(List<Double> values) {
            addCriterion("ha_poblacion in", values, "ha_poblacion");
            return (Criteria) this;
        }

        public Criteria andDblPoblacionNotIn(List<Double> values) {
            addCriterion("ha_poblacion not in", values, "ha_poblacion");
            return (Criteria) this;
        }

        public Criteria andDblPoblacionBetween(Double value1, Double value2) {
            addCriterion("ha_poblacion between", value1, value2, "ha_poblacion");
            return (Criteria) this;
        }

        public Criteria andDblPoblacionNotBetween(Double value1, Double value2) {
            addCriterion("ha_poblacion not between", value1, value2, "ha_poblacion");
            return (Criteria) this;
        }
        
        
        public Criteria andDblFamiliasEqualTo(Double value) {
            addCriterion("ha_familias =", value, "ha_familias");
            return (Criteria) this;
        }

        public Criteria andDblFamiliasNotEqualTo(Double value) {
            addCriterion("ha_familias <>", value, "ha_familias");
            return (Criteria) this;
        }
        
        
        public Criteria andDblFamiliasIsNull() {
            addCriterion("ha_familias is null");
            return (Criteria) this;
        }

        public Criteria andDblFamiliasIsNotNull() {
            addCriterion("ha_familias is not null");
            return (Criteria) this;
        }

        public Criteria andDblFamiliasGreaterThan(Double value) {
            addCriterion("ha_familias >", value, "ha_familias");
            return (Criteria) this;
        }

        public Criteria andDblFamiliasGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_familias >=", value, "ha_familias");
            return (Criteria) this;
        }

        public Criteria andDblFamiliasLessThan(Double value) {
            addCriterion("ha_familias <", value, "ha_familias");
            return (Criteria) this;
        }

        public Criteria andDblFamiliasLessThanOrEqualTo(Double value) {
            addCriterion("ha_familias <=", value, "ha_familias");
            return (Criteria) this;
        }

        public Criteria andDblFamiliasIn(List<Double> values) {
            addCriterion("ha_familias in", values, "ha_familias");
            return (Criteria) this;
        }

        public Criteria andDblFamiliasNotIn(List<Double> values) {
            addCriterion("ha_familias not in", values, "ha_familias");
            return (Criteria) this;
        }

        public Criteria andDblFamiliasBetween(Double value1, Double value2) {
            addCriterion("ha_familias between", value1, value2, "ha_familias");
            return (Criteria) this;
        }

        public Criteria andDblFamiliasNotBetween(Double value1, Double value2) {
            addCriterion("ha_familias not between", value1, value2, "ha_familias");
            return (Criteria) this;
        }
        
        
        public Criteria andDblEscolaresEqualTo(Double value) {
            addCriterion("ha_escolares =", value, "ha_escolares");
            return (Criteria) this;
        }

        public Criteria andDblEscolaresNotEqualTo(Double value) {
            addCriterion("ha_escolares <>", value, "ha_escolares");
            return (Criteria) this;
        }
        
        
        public Criteria andDblEscolaresIsNull() {
            addCriterion("ha_escolares is null");
            return (Criteria) this;
        }

        public Criteria andDblEscolaresIsNotNull() {
            addCriterion("ha_escolares is not null");
            return (Criteria) this;
        }

        public Criteria andDblEscolaresGreaterThan(Double value) {
            addCriterion("ha_escolares >", value, "ha_escolares");
            return (Criteria) this;
        }

        public Criteria andDblEscolaresGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_escolares >=", value, "ha_escolares");
            return (Criteria) this;
        }

        public Criteria andDblEscolaresLessThan(Double value) {
            addCriterion("ha_escolares <", value, "ha_escolares");
            return (Criteria) this;
        }

        public Criteria andDblEscolaresLessThanOrEqualTo(Double value) {
            addCriterion("ha_escolares <=", value, "ha_escolares");
            return (Criteria) this;
        }

        public Criteria andDblEscolaresIn(List<Double> values) {
            addCriterion("ha_escolares in", values, "ha_escolares");
            return (Criteria) this;
        }

        public Criteria andDblEscolaresNotIn(List<Double> values) {
            addCriterion("ha_escolares not in", values, "ha_escolares");
            return (Criteria) this;
        }

        public Criteria andDblEscolaresBetween(Double value1, Double value2) {
            addCriterion("ha_escolares between", value1, value2, "ha_escolares");
            return (Criteria) this;
        }

        public Criteria andDblEscolaresNotBetween(Double value1, Double value2) {
            addCriterion("ha_escolares not between", value1, value2, "ha_escolares");
            return (Criteria) this;
        }
        
        
        public Criteria andStrRioLike(String value) {
            addCriterion("upper(de_rio) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_rio");
            return (Criteria) this;
        }

        public Criteria andStrRioNotLike(String value) {
            addCriterion("de_rio not like", "%" + CadenaUtil.getStr(value) + "%", "de_rio");
            return (Criteria) this;
        }
			
        public Criteria andStrRioEqualTo(String value) {
            addCriterion("de_rio =", CadenaUtil.getStr(value), "de_rio");
            return (Criteria) this;
        }

        public Criteria andStrRioNotEqualTo(String value) {
            addCriterion("de_rio <>", CadenaUtil.getStr(value), "de_rio");
            return (Criteria) this;
        }

        
        public Criteria andStrRioIsNull() {
            addCriterion("de_rio is null");
            return (Criteria) this;
        }

        public Criteria andStrRioIsNotNull() {
            addCriterion("de_rio is not null");
            return (Criteria) this;
        }

        public Criteria andStrRioGreaterThan(String value) {
            addCriterion("de_rio >", value, "de_rio");
            return (Criteria) this;
        }

        public Criteria andStrRioGreaterThanOrEqualTo(String value) {
            addCriterion("de_rio >=", value, "de_rio");
            return (Criteria) this;
        }

        public Criteria andStrRioLessThan(String value) {
            addCriterion("de_rio <", value, "de_rio");
            return (Criteria) this;
        }

        public Criteria andStrRioLessThanOrEqualTo(String value) {
            addCriterion("de_rio <=", value, "de_rio");
            return (Criteria) this;
        }

        public Criteria andStrRioIn(List<String> values) {
            addCriterion("de_rio in", values, "de_rio");
            return (Criteria) this;
        }

        public Criteria andStrRioNotIn(List<String> values) {
            addCriterion("de_rio not in", values, "de_rio");
            return (Criteria) this;
        }

        public Criteria andStrRioBetween(String value1, String value2) {
            addCriterion("de_rio between", value1, value2, "de_rio");
            return (Criteria) this;
        }

        public Criteria andStrRioNotBetween(String value1, String value2) {
            addCriterion("de_rio not between", value1, value2, "de_rio");
            return (Criteria) this;
        }
        
        
        public Criteria andStrPuebCercLike(String value) {
            addCriterion("upper(de_pueb_cerc) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_pueb_cerc");
            return (Criteria) this;
        }

        public Criteria andStrPuebCercNotLike(String value) {
            addCriterion("de_pueb_cerc not like", "%" + CadenaUtil.getStr(value) + "%", "de_pueb_cerc");
            return (Criteria) this;
        }
			
        public Criteria andStrPuebCercEqualTo(String value) {
            addCriterion("de_pueb_cerc =", CadenaUtil.getStr(value), "de_pueb_cerc");
            return (Criteria) this;
        }

        public Criteria andStrPuebCercNotEqualTo(String value) {
            addCriterion("de_pueb_cerc <>", CadenaUtil.getStr(value), "de_pueb_cerc");
            return (Criteria) this;
        }

        
        public Criteria andStrPuebCercIsNull() {
            addCriterion("de_pueb_cerc is null");
            return (Criteria) this;
        }

        public Criteria andStrPuebCercIsNotNull() {
            addCriterion("de_pueb_cerc is not null");
            return (Criteria) this;
        }

        public Criteria andStrPuebCercGreaterThan(String value) {
            addCriterion("de_pueb_cerc >", value, "de_pueb_cerc");
            return (Criteria) this;
        }

        public Criteria andStrPuebCercGreaterThanOrEqualTo(String value) {
            addCriterion("de_pueb_cerc >=", value, "de_pueb_cerc");
            return (Criteria) this;
        }

        public Criteria andStrPuebCercLessThan(String value) {
            addCriterion("de_pueb_cerc <", value, "de_pueb_cerc");
            return (Criteria) this;
        }

        public Criteria andStrPuebCercLessThanOrEqualTo(String value) {
            addCriterion("de_pueb_cerc <=", value, "de_pueb_cerc");
            return (Criteria) this;
        }

        public Criteria andStrPuebCercIn(List<String> values) {
            addCriterion("de_pueb_cerc in", values, "de_pueb_cerc");
            return (Criteria) this;
        }

        public Criteria andStrPuebCercNotIn(List<String> values) {
            addCriterion("de_pueb_cerc not in", values, "de_pueb_cerc");
            return (Criteria) this;
        }

        public Criteria andStrPuebCercBetween(String value1, String value2) {
            addCriterion("de_pueb_cerc between", value1, value2, "de_pueb_cerc");
            return (Criteria) this;
        }

        public Criteria andStrPuebCercNotBetween(String value1, String value2) {
            addCriterion("de_pueb_cerc not between", value1, value2, "de_pueb_cerc");
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
        
        
        public Criteria andStrProvinciaLike(String value) {
            addCriterion("upper(de_provincia) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_provincia");
            return (Criteria) this;
        }

        public Criteria andStrProvinciaNotLike(String value) {
            addCriterion("de_provincia not like", "%" + CadenaUtil.getStr(value) + "%", "de_provincia");
            return (Criteria) this;
        }
			
        public Criteria andStrProvinciaEqualTo(String value) {
            addCriterion("de_provincia =", CadenaUtil.getStr(value), "de_provincia");
            return (Criteria) this;
        }

        public Criteria andStrProvinciaNotEqualTo(String value) {
            addCriterion("de_provincia <>", CadenaUtil.getStr(value), "de_provincia");
            return (Criteria) this;
        }

        
        public Criteria andStrProvinciaIsNull() {
            addCriterion("de_provincia is null");
            return (Criteria) this;
        }

        public Criteria andStrProvinciaIsNotNull() {
            addCriterion("de_provincia is not null");
            return (Criteria) this;
        }

        public Criteria andStrProvinciaGreaterThan(String value) {
            addCriterion("de_provincia >", value, "de_provincia");
            return (Criteria) this;
        }

        public Criteria andStrProvinciaGreaterThanOrEqualTo(String value) {
            addCriterion("de_provincia >=", value, "de_provincia");
            return (Criteria) this;
        }

        public Criteria andStrProvinciaLessThan(String value) {
            addCriterion("de_provincia <", value, "de_provincia");
            return (Criteria) this;
        }

        public Criteria andStrProvinciaLessThanOrEqualTo(String value) {
            addCriterion("de_provincia <=", value, "de_provincia");
            return (Criteria) this;
        }

        public Criteria andStrProvinciaIn(List<String> values) {
            addCriterion("de_provincia in", values, "de_provincia");
            return (Criteria) this;
        }

        public Criteria andStrProvinciaNotIn(List<String> values) {
            addCriterion("de_provincia not in", values, "de_provincia");
            return (Criteria) this;
        }

        public Criteria andStrProvinciaBetween(String value1, String value2) {
            addCriterion("de_provincia between", value1, value2, "de_provincia");
            return (Criteria) this;
        }

        public Criteria andStrProvinciaNotBetween(String value1, String value2) {
            addCriterion("de_provincia not between", value1, value2, "de_provincia");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDistritoLike(String value) {
            addCriterion("upper(de_distrito) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_distrito");
            return (Criteria) this;
        }

        public Criteria andStrDistritoNotLike(String value) {
            addCriterion("de_distrito not like", "%" + CadenaUtil.getStr(value) + "%", "de_distrito");
            return (Criteria) this;
        }
			
        public Criteria andStrDistritoEqualTo(String value) {
            addCriterion("de_distrito =", CadenaUtil.getStr(value), "de_distrito");
            return (Criteria) this;
        }

        public Criteria andStrDistritoNotEqualTo(String value) {
            addCriterion("de_distrito <>", CadenaUtil.getStr(value), "de_distrito");
            return (Criteria) this;
        }

        
        public Criteria andStrDistritoIsNull() {
            addCriterion("de_distrito is null");
            return (Criteria) this;
        }

        public Criteria andStrDistritoIsNotNull() {
            addCriterion("de_distrito is not null");
            return (Criteria) this;
        }

        public Criteria andStrDistritoGreaterThan(String value) {
            addCriterion("de_distrito >", value, "de_distrito");
            return (Criteria) this;
        }

        public Criteria andStrDistritoGreaterThanOrEqualTo(String value) {
            addCriterion("de_distrito >=", value, "de_distrito");
            return (Criteria) this;
        }

        public Criteria andStrDistritoLessThan(String value) {
            addCriterion("de_distrito <", value, "de_distrito");
            return (Criteria) this;
        }

        public Criteria andStrDistritoLessThanOrEqualTo(String value) {
            addCriterion("de_distrito <=", value, "de_distrito");
            return (Criteria) this;
        }

        public Criteria andStrDistritoIn(List<String> values) {
            addCriterion("de_distrito in", values, "de_distrito");
            return (Criteria) this;
        }

        public Criteria andStrDistritoNotIn(List<String> values) {
            addCriterion("de_distrito not in", values, "de_distrito");
            return (Criteria) this;
        }

        public Criteria andStrDistritoBetween(String value1, String value2) {
            addCriterion("de_distrito between", value1, value2, "de_distrito");
            return (Criteria) this;
        }

        public Criteria andStrDistritoNotBetween(String value1, String value2) {
            addCriterion("de_distrito not between", value1, value2, "de_distrito");
            return (Criteria) this;
        }
        
        
        public Criteria andStrLongitudLike(String value) {
            addCriterion("upper(de_longitud) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_longitud");
            return (Criteria) this;
        }

        public Criteria andStrLongitudNotLike(String value) {
            addCriterion("de_longitud not like", "%" + CadenaUtil.getStr(value) + "%", "de_longitud");
            return (Criteria) this;
        }
			
        public Criteria andStrLongitudEqualTo(String value) {
            addCriterion("de_longitud =", CadenaUtil.getStr(value), "de_longitud");
            return (Criteria) this;
        }

        public Criteria andStrLongitudNotEqualTo(String value) {
            addCriterion("de_longitud <>", CadenaUtil.getStr(value), "de_longitud");
            return (Criteria) this;
        }

        
        public Criteria andStrLongitudIsNull() {
            addCriterion("de_longitud is null");
            return (Criteria) this;
        }

        public Criteria andStrLongitudIsNotNull() {
            addCriterion("de_longitud is not null");
            return (Criteria) this;
        }

        public Criteria andStrLongitudGreaterThan(String value) {
            addCriterion("de_longitud >", value, "de_longitud");
            return (Criteria) this;
        }

        public Criteria andStrLongitudGreaterThanOrEqualTo(String value) {
            addCriterion("de_longitud >=", value, "de_longitud");
            return (Criteria) this;
        }

        public Criteria andStrLongitudLessThan(String value) {
            addCriterion("de_longitud <", value, "de_longitud");
            return (Criteria) this;
        }

        public Criteria andStrLongitudLessThanOrEqualTo(String value) {
            addCriterion("de_longitud <=", value, "de_longitud");
            return (Criteria) this;
        }

        public Criteria andStrLongitudIn(List<String> values) {
            addCriterion("de_longitud in", values, "de_longitud");
            return (Criteria) this;
        }

        public Criteria andStrLongitudNotIn(List<String> values) {
            addCriterion("de_longitud not in", values, "de_longitud");
            return (Criteria) this;
        }

        public Criteria andStrLongitudBetween(String value1, String value2) {
            addCriterion("de_longitud between", value1, value2, "de_longitud");
            return (Criteria) this;
        }

        public Criteria andStrLongitudNotBetween(String value1, String value2) {
            addCriterion("de_longitud not between", value1, value2, "de_longitud");
            return (Criteria) this;
        }
        
        
        public Criteria andStrLatitudLike(String value) {
            addCriterion("upper(de_latitud) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_latitud");
            return (Criteria) this;
        }

        public Criteria andStrLatitudNotLike(String value) {
            addCriterion("de_latitud not like", "%" + CadenaUtil.getStr(value) + "%", "de_latitud");
            return (Criteria) this;
        }
			
        public Criteria andStrLatitudEqualTo(String value) {
            addCriterion("de_latitud =", CadenaUtil.getStr(value), "de_latitud");
            return (Criteria) this;
        }

        public Criteria andStrLatitudNotEqualTo(String value) {
            addCriterion("de_latitud <>", CadenaUtil.getStr(value), "de_latitud");
            return (Criteria) this;
        }

        
        public Criteria andStrLatitudIsNull() {
            addCriterion("de_latitud is null");
            return (Criteria) this;
        }

        public Criteria andStrLatitudIsNotNull() {
            addCriterion("de_latitud is not null");
            return (Criteria) this;
        }

        public Criteria andStrLatitudGreaterThan(String value) {
            addCriterion("de_latitud >", value, "de_latitud");
            return (Criteria) this;
        }

        public Criteria andStrLatitudGreaterThanOrEqualTo(String value) {
            addCriterion("de_latitud >=", value, "de_latitud");
            return (Criteria) this;
        }

        public Criteria andStrLatitudLessThan(String value) {
            addCriterion("de_latitud <", value, "de_latitud");
            return (Criteria) this;
        }

        public Criteria andStrLatitudLessThanOrEqualTo(String value) {
            addCriterion("de_latitud <=", value, "de_latitud");
            return (Criteria) this;
        }

        public Criteria andStrLatitudIn(List<String> values) {
            addCriterion("de_latitud in", values, "de_latitud");
            return (Criteria) this;
        }

        public Criteria andStrLatitudNotIn(List<String> values) {
            addCriterion("de_latitud not in", values, "de_latitud");
            return (Criteria) this;
        }

        public Criteria andStrLatitudBetween(String value1, String value2) {
            addCriterion("de_latitud between", value1, value2, "de_latitud");
            return (Criteria) this;
        }

        public Criteria andStrLatitudNotBetween(String value1, String value2) {
            addCriterion("de_latitud not between", value1, value2, "de_latitud");
            return (Criteria) this;
        }
        
        
        public Criteria andStrResolInLike(String value) {
            addCriterion("upper(de_resol_in) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_resol_in");
            return (Criteria) this;
        }

        public Criteria andStrResolInNotLike(String value) {
            addCriterion("de_resol_in not like", "%" + CadenaUtil.getStr(value) + "%", "de_resol_in");
            return (Criteria) this;
        }
			
        public Criteria andStrResolInEqualTo(String value) {
            addCriterion("de_resol_in =", CadenaUtil.getStr(value), "de_resol_in");
            return (Criteria) this;
        }

        public Criteria andStrResolInNotEqualTo(String value) {
            addCriterion("de_resol_in <>", CadenaUtil.getStr(value), "de_resol_in");
            return (Criteria) this;
        }

        
        public Criteria andStrResolInIsNull() {
            addCriterion("de_resol_in is null");
            return (Criteria) this;
        }

        public Criteria andStrResolInIsNotNull() {
            addCriterion("de_resol_in is not null");
            return (Criteria) this;
        }

        public Criteria andStrResolInGreaterThan(String value) {
            addCriterion("de_resol_in >", value, "de_resol_in");
            return (Criteria) this;
        }

        public Criteria andStrResolInGreaterThanOrEqualTo(String value) {
            addCriterion("de_resol_in >=", value, "de_resol_in");
            return (Criteria) this;
        }

        public Criteria andStrResolInLessThan(String value) {
            addCriterion("de_resol_in <", value, "de_resol_in");
            return (Criteria) this;
        }

        public Criteria andStrResolInLessThanOrEqualTo(String value) {
            addCriterion("de_resol_in <=", value, "de_resol_in");
            return (Criteria) this;
        }

        public Criteria andStrResolInIn(List<String> values) {
            addCriterion("de_resol_in in", values, "de_resol_in");
            return (Criteria) this;
        }

        public Criteria andStrResolInNotIn(List<String> values) {
            addCriterion("de_resol_in not in", values, "de_resol_in");
            return (Criteria) this;
        }

        public Criteria andStrResolInBetween(String value1, String value2) {
            addCriterion("de_resol_in between", value1, value2, "de_resol_in");
            return (Criteria) this;
        }

        public Criteria andStrResolInNotBetween(String value1, String value2) {
            addCriterion("de_resol_in not between", value1, value2, "de_resol_in");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnoinscripLike(String value) {
            addCriterion("upper(de_anoinscrip) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anoinscrip");
            return (Criteria) this;
        }

        public Criteria andStrAnoinscripNotLike(String value) {
            addCriterion("de_anoinscrip not like", "%" + CadenaUtil.getStr(value) + "%", "de_anoinscrip");
            return (Criteria) this;
        }
			
        public Criteria andStrAnoinscripEqualTo(String value) {
            addCriterion("de_anoinscrip =", CadenaUtil.getStr(value), "de_anoinscrip");
            return (Criteria) this;
        }

        public Criteria andStrAnoinscripNotEqualTo(String value) {
            addCriterion("de_anoinscrip <>", CadenaUtil.getStr(value), "de_anoinscrip");
            return (Criteria) this;
        }

        
        public Criteria andStrAnoinscripIsNull() {
            addCriterion("de_anoinscrip is null");
            return (Criteria) this;
        }

        public Criteria andStrAnoinscripIsNotNull() {
            addCriterion("de_anoinscrip is not null");
            return (Criteria) this;
        }

        public Criteria andStrAnoinscripGreaterThan(String value) {
            addCriterion("de_anoinscrip >", value, "de_anoinscrip");
            return (Criteria) this;
        }

        public Criteria andStrAnoinscripGreaterThanOrEqualTo(String value) {
            addCriterion("de_anoinscrip >=", value, "de_anoinscrip");
            return (Criteria) this;
        }

        public Criteria andStrAnoinscripLessThan(String value) {
            addCriterion("de_anoinscrip <", value, "de_anoinscrip");
            return (Criteria) this;
        }

        public Criteria andStrAnoinscripLessThanOrEqualTo(String value) {
            addCriterion("de_anoinscrip <=", value, "de_anoinscrip");
            return (Criteria) this;
        }

        public Criteria andStrAnoinscripIn(List<String> values) {
            addCriterion("de_anoinscrip in", values, "de_anoinscrip");
            return (Criteria) this;
        }

        public Criteria andStrAnoinscripNotIn(List<String> values) {
            addCriterion("de_anoinscrip not in", values, "de_anoinscrip");
            return (Criteria) this;
        }

        public Criteria andStrAnoinscripBetween(String value1, String value2) {
            addCriterion("de_anoinscrip between", value1, value2, "de_anoinscrip");
            return (Criteria) this;
        }

        public Criteria andStrAnoinscripNotBetween(String value1, String value2) {
            addCriterion("de_anoinscrip not between", value1, value2, "de_anoinscrip");
            return (Criteria) this;
        }
        
        
        public Criteria andStrTituloLike(String value) {
            addCriterion("upper(de_titulo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_titulo");
            return (Criteria) this;
        }

        public Criteria andStrTituloNotLike(String value) {
            addCriterion("de_titulo not like", "%" + CadenaUtil.getStr(value) + "%", "de_titulo");
            return (Criteria) this;
        }
			
        public Criteria andStrTituloEqualTo(String value) {
            addCriterion("de_titulo =", CadenaUtil.getStr(value), "de_titulo");
            return (Criteria) this;
        }

        public Criteria andStrTituloNotEqualTo(String value) {
            addCriterion("de_titulo <>", CadenaUtil.getStr(value), "de_titulo");
            return (Criteria) this;
        }

        
        public Criteria andStrTituloIsNull() {
            addCriterion("de_titulo is null");
            return (Criteria) this;
        }

        public Criteria andStrTituloIsNotNull() {
            addCriterion("de_titulo is not null");
            return (Criteria) this;
        }

        public Criteria andStrTituloGreaterThan(String value) {
            addCriterion("de_titulo >", value, "de_titulo");
            return (Criteria) this;
        }

        public Criteria andStrTituloGreaterThanOrEqualTo(String value) {
            addCriterion("de_titulo >=", value, "de_titulo");
            return (Criteria) this;
        }

        public Criteria andStrTituloLessThan(String value) {
            addCriterion("de_titulo <", value, "de_titulo");
            return (Criteria) this;
        }

        public Criteria andStrTituloLessThanOrEqualTo(String value) {
            addCriterion("de_titulo <=", value, "de_titulo");
            return (Criteria) this;
        }

        public Criteria andStrTituloIn(List<String> values) {
            addCriterion("de_titulo in", values, "de_titulo");
            return (Criteria) this;
        }

        public Criteria andStrTituloNotIn(List<String> values) {
            addCriterion("de_titulo not in", values, "de_titulo");
            return (Criteria) this;
        }

        public Criteria andStrTituloBetween(String value1, String value2) {
            addCriterion("de_titulo between", value1, value2, "de_titulo");
            return (Criteria) this;
        }

        public Criteria andStrTituloNotBetween(String value1, String value2) {
            addCriterion("de_titulo not between", value1, value2, "de_titulo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrResolTitLike(String value) {
            addCriterion("upper(de_resol_tit) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_resol_tit");
            return (Criteria) this;
        }

        public Criteria andStrResolTitNotLike(String value) {
            addCriterion("de_resol_tit not like", "%" + CadenaUtil.getStr(value) + "%", "de_resol_tit");
            return (Criteria) this;
        }
			
        public Criteria andStrResolTitEqualTo(String value) {
            addCriterion("de_resol_tit =", CadenaUtil.getStr(value), "de_resol_tit");
            return (Criteria) this;
        }

        public Criteria andStrResolTitNotEqualTo(String value) {
            addCriterion("de_resol_tit <>", CadenaUtil.getStr(value), "de_resol_tit");
            return (Criteria) this;
        }

        
        public Criteria andStrResolTitIsNull() {
            addCriterion("de_resol_tit is null");
            return (Criteria) this;
        }

        public Criteria andStrResolTitIsNotNull() {
            addCriterion("de_resol_tit is not null");
            return (Criteria) this;
        }

        public Criteria andStrResolTitGreaterThan(String value) {
            addCriterion("de_resol_tit >", value, "de_resol_tit");
            return (Criteria) this;
        }

        public Criteria andStrResolTitGreaterThanOrEqualTo(String value) {
            addCriterion("de_resol_tit >=", value, "de_resol_tit");
            return (Criteria) this;
        }

        public Criteria andStrResolTitLessThan(String value) {
            addCriterion("de_resol_tit <", value, "de_resol_tit");
            return (Criteria) this;
        }

        public Criteria andStrResolTitLessThanOrEqualTo(String value) {
            addCriterion("de_resol_tit <=", value, "de_resol_tit");
            return (Criteria) this;
        }

        public Criteria andStrResolTitIn(List<String> values) {
            addCriterion("de_resol_tit in", values, "de_resol_tit");
            return (Criteria) this;
        }

        public Criteria andStrResolTitNotIn(List<String> values) {
            addCriterion("de_resol_tit not in", values, "de_resol_tit");
            return (Criteria) this;
        }

        public Criteria andStrResolTitBetween(String value1, String value2) {
            addCriterion("de_resol_tit between", value1, value2, "de_resol_tit");
            return (Criteria) this;
        }

        public Criteria andStrResolTitNotBetween(String value1, String value2) {
            addCriterion("de_resol_tit not between", value1, value2, "de_resol_tit");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnotituloLike(String value) {
            addCriterion("upper(de_anotitulo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anotitulo");
            return (Criteria) this;
        }

        public Criteria andStrAnotituloNotLike(String value) {
            addCriterion("de_anotitulo not like", "%" + CadenaUtil.getStr(value) + "%", "de_anotitulo");
            return (Criteria) this;
        }
			
        public Criteria andStrAnotituloEqualTo(String value) {
            addCriterion("de_anotitulo =", CadenaUtil.getStr(value), "de_anotitulo");
            return (Criteria) this;
        }

        public Criteria andStrAnotituloNotEqualTo(String value) {
            addCriterion("de_anotitulo <>", CadenaUtil.getStr(value), "de_anotitulo");
            return (Criteria) this;
        }

        
        public Criteria andStrAnotituloIsNull() {
            addCriterion("de_anotitulo is null");
            return (Criteria) this;
        }

        public Criteria andStrAnotituloIsNotNull() {
            addCriterion("de_anotitulo is not null");
            return (Criteria) this;
        }

        public Criteria andStrAnotituloGreaterThan(String value) {
            addCriterion("de_anotitulo >", value, "de_anotitulo");
            return (Criteria) this;
        }

        public Criteria andStrAnotituloGreaterThanOrEqualTo(String value) {
            addCriterion("de_anotitulo >=", value, "de_anotitulo");
            return (Criteria) this;
        }

        public Criteria andStrAnotituloLessThan(String value) {
            addCriterion("de_anotitulo <", value, "de_anotitulo");
            return (Criteria) this;
        }

        public Criteria andStrAnotituloLessThanOrEqualTo(String value) {
            addCriterion("de_anotitulo <=", value, "de_anotitulo");
            return (Criteria) this;
        }

        public Criteria andStrAnotituloIn(List<String> values) {
            addCriterion("de_anotitulo in", values, "de_anotitulo");
            return (Criteria) this;
        }

        public Criteria andStrAnotituloNotIn(List<String> values) {
            addCriterion("de_anotitulo not in", values, "de_anotitulo");
            return (Criteria) this;
        }

        public Criteria andStrAnotituloBetween(String value1, String value2) {
            addCriterion("de_anotitulo between", value1, value2, "de_anotitulo");
            return (Criteria) this;
        }

        public Criteria andStrAnotituloNotBetween(String value1, String value2) {
            addCriterion("de_anotitulo not between", value1, value2, "de_anotitulo");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaTotalEqualTo(Double value) {
            addCriterion("ha_area_total =", value, "ha_area_total");
            return (Criteria) this;
        }

        public Criteria andDblAreaTotalNotEqualTo(Double value) {
            addCriterion("ha_area_total <>", value, "ha_area_total");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaTotalIsNull() {
            addCriterion("ha_area_total is null");
            return (Criteria) this;
        }

        public Criteria andDblAreaTotalIsNotNull() {
            addCriterion("ha_area_total is not null");
            return (Criteria) this;
        }

        public Criteria andDblAreaTotalGreaterThan(Double value) {
            addCriterion("ha_area_total >", value, "ha_area_total");
            return (Criteria) this;
        }

        public Criteria andDblAreaTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_area_total >=", value, "ha_area_total");
            return (Criteria) this;
        }

        public Criteria andDblAreaTotalLessThan(Double value) {
            addCriterion("ha_area_total <", value, "ha_area_total");
            return (Criteria) this;
        }

        public Criteria andDblAreaTotalLessThanOrEqualTo(Double value) {
            addCriterion("ha_area_total <=", value, "ha_area_total");
            return (Criteria) this;
        }

        public Criteria andDblAreaTotalIn(List<Double> values) {
            addCriterion("ha_area_total in", values, "ha_area_total");
            return (Criteria) this;
        }

        public Criteria andDblAreaTotalNotIn(List<Double> values) {
            addCriterion("ha_area_total not in", values, "ha_area_total");
            return (Criteria) this;
        }

        public Criteria andDblAreaTotalBetween(Double value1, Double value2) {
            addCriterion("ha_area_total between", value1, value2, "ha_area_total");
            return (Criteria) this;
        }

        public Criteria andDblAreaTotalNotBetween(Double value1, Double value2) {
            addCriterion("ha_area_total not between", value1, value2, "ha_area_total");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaTitulEqualTo(Double value) {
            addCriterion("ha_area_titul =", value, "ha_area_titul");
            return (Criteria) this;
        }

        public Criteria andDblAreaTitulNotEqualTo(Double value) {
            addCriterion("ha_area_titul <>", value, "ha_area_titul");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaTitulIsNull() {
            addCriterion("ha_area_titul is null");
            return (Criteria) this;
        }

        public Criteria andDblAreaTitulIsNotNull() {
            addCriterion("ha_area_titul is not null");
            return (Criteria) this;
        }

        public Criteria andDblAreaTitulGreaterThan(Double value) {
            addCriterion("ha_area_titul >", value, "ha_area_titul");
            return (Criteria) this;
        }

        public Criteria andDblAreaTitulGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_area_titul >=", value, "ha_area_titul");
            return (Criteria) this;
        }

        public Criteria andDblAreaTitulLessThan(Double value) {
            addCriterion("ha_area_titul <", value, "ha_area_titul");
            return (Criteria) this;
        }

        public Criteria andDblAreaTitulLessThanOrEqualTo(Double value) {
            addCriterion("ha_area_titul <=", value, "ha_area_titul");
            return (Criteria) this;
        }

        public Criteria andDblAreaTitulIn(List<Double> values) {
            addCriterion("ha_area_titul in", values, "ha_area_titul");
            return (Criteria) this;
        }

        public Criteria andDblAreaTitulNotIn(List<Double> values) {
            addCriterion("ha_area_titul not in", values, "ha_area_titul");
            return (Criteria) this;
        }

        public Criteria andDblAreaTitulBetween(Double value1, Double value2) {
            addCriterion("ha_area_titul between", value1, value2, "ha_area_titul");
            return (Criteria) this;
        }

        public Criteria andDblAreaTitulNotBetween(Double value1, Double value2) {
            addCriterion("ha_area_titul not between", value1, value2, "ha_area_titul");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaUsoEqualTo(Double value) {
            addCriterion("ha_area_uso =", value, "ha_area_uso");
            return (Criteria) this;
        }

        public Criteria andDblAreaUsoNotEqualTo(Double value) {
            addCriterion("ha_area_uso <>", value, "ha_area_uso");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaUsoIsNull() {
            addCriterion("ha_area_uso is null");
            return (Criteria) this;
        }

        public Criteria andDblAreaUsoIsNotNull() {
            addCriterion("ha_area_uso is not null");
            return (Criteria) this;
        }

        public Criteria andDblAreaUsoGreaterThan(Double value) {
            addCriterion("ha_area_uso >", value, "ha_area_uso");
            return (Criteria) this;
        }

        public Criteria andDblAreaUsoGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_area_uso >=", value, "ha_area_uso");
            return (Criteria) this;
        }

        public Criteria andDblAreaUsoLessThan(Double value) {
            addCriterion("ha_area_uso <", value, "ha_area_uso");
            return (Criteria) this;
        }

        public Criteria andDblAreaUsoLessThanOrEqualTo(Double value) {
            addCriterion("ha_area_uso <=", value, "ha_area_uso");
            return (Criteria) this;
        }

        public Criteria andDblAreaUsoIn(List<Double> values) {
            addCriterion("ha_area_uso in", values, "ha_area_uso");
            return (Criteria) this;
        }

        public Criteria andDblAreaUsoNotIn(List<Double> values) {
            addCriterion("ha_area_uso not in", values, "ha_area_uso");
            return (Criteria) this;
        }

        public Criteria andDblAreaUsoBetween(Double value1, Double value2) {
            addCriterion("ha_area_uso between", value1, value2, "ha_area_uso");
            return (Criteria) this;
        }

        public Criteria andDblAreaUsoNotBetween(Double value1, Double value2) {
            addCriterion("ha_area_uso not between", value1, value2, "ha_area_uso");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaFiscEqualTo(Double value) {
            addCriterion("ha_area_fisc =", value, "ha_area_fisc");
            return (Criteria) this;
        }

        public Criteria andDblAreaFiscNotEqualTo(Double value) {
            addCriterion("ha_area_fisc <>", value, "ha_area_fisc");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaFiscIsNull() {
            addCriterion("ha_area_fisc is null");
            return (Criteria) this;
        }

        public Criteria andDblAreaFiscIsNotNull() {
            addCriterion("ha_area_fisc is not null");
            return (Criteria) this;
        }

        public Criteria andDblAreaFiscGreaterThan(Double value) {
            addCriterion("ha_area_fisc >", value, "ha_area_fisc");
            return (Criteria) this;
        }

        public Criteria andDblAreaFiscGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_area_fisc >=", value, "ha_area_fisc");
            return (Criteria) this;
        }

        public Criteria andDblAreaFiscLessThan(Double value) {
            addCriterion("ha_area_fisc <", value, "ha_area_fisc");
            return (Criteria) this;
        }

        public Criteria andDblAreaFiscLessThanOrEqualTo(Double value) {
            addCriterion("ha_area_fisc <=", value, "ha_area_fisc");
            return (Criteria) this;
        }

        public Criteria andDblAreaFiscIn(List<Double> values) {
            addCriterion("ha_area_fisc in", values, "ha_area_fisc");
            return (Criteria) this;
        }

        public Criteria andDblAreaFiscNotIn(List<Double> values) {
            addCriterion("ha_area_fisc not in", values, "ha_area_fisc");
            return (Criteria) this;
        }

        public Criteria andDblAreaFiscBetween(Double value1, Double value2) {
            addCriterion("ha_area_fisc between", value1, value2, "ha_area_fisc");
            return (Criteria) this;
        }

        public Criteria andDblAreaFiscNotBetween(Double value1, Double value2) {
            addCriterion("ha_area_fisc not between", value1, value2, "ha_area_fisc");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaProteEqualTo(Double value) {
            addCriterion("ha_area_prote =", value, "ha_area_prote");
            return (Criteria) this;
        }

        public Criteria andDblAreaProteNotEqualTo(Double value) {
            addCriterion("ha_area_prote <>", value, "ha_area_prote");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaProteIsNull() {
            addCriterion("ha_area_prote is null");
            return (Criteria) this;
        }

        public Criteria andDblAreaProteIsNotNull() {
            addCriterion("ha_area_prote is not null");
            return (Criteria) this;
        }

        public Criteria andDblAreaProteGreaterThan(Double value) {
            addCriterion("ha_area_prote >", value, "ha_area_prote");
            return (Criteria) this;
        }

        public Criteria andDblAreaProteGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_area_prote >=", value, "ha_area_prote");
            return (Criteria) this;
        }

        public Criteria andDblAreaProteLessThan(Double value) {
            addCriterion("ha_area_prote <", value, "ha_area_prote");
            return (Criteria) this;
        }

        public Criteria andDblAreaProteLessThanOrEqualTo(Double value) {
            addCriterion("ha_area_prote <=", value, "ha_area_prote");
            return (Criteria) this;
        }

        public Criteria andDblAreaProteIn(List<Double> values) {
            addCriterion("ha_area_prote in", values, "ha_area_prote");
            return (Criteria) this;
        }

        public Criteria andDblAreaProteNotIn(List<Double> values) {
            addCriterion("ha_area_prote not in", values, "ha_area_prote");
            return (Criteria) this;
        }

        public Criteria andDblAreaProteBetween(Double value1, Double value2) {
            addCriterion("ha_area_prote between", value1, value2, "ha_area_prote");
            return (Criteria) this;
        }

        public Criteria andDblAreaProteNotBetween(Double value1, Double value2) {
            addCriterion("ha_area_prote not between", value1, value2, "ha_area_prote");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaReserEqualTo(Double value) {
            addCriterion("ha_area_reser =", value, "ha_area_reser");
            return (Criteria) this;
        }

        public Criteria andDblAreaReserNotEqualTo(Double value) {
            addCriterion("ha_area_reser <>", value, "ha_area_reser");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaReserIsNull() {
            addCriterion("ha_area_reser is null");
            return (Criteria) this;
        }

        public Criteria andDblAreaReserIsNotNull() {
            addCriterion("ha_area_reser is not null");
            return (Criteria) this;
        }

        public Criteria andDblAreaReserGreaterThan(Double value) {
            addCriterion("ha_area_reser >", value, "ha_area_reser");
            return (Criteria) this;
        }

        public Criteria andDblAreaReserGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_area_reser >=", value, "ha_area_reser");
            return (Criteria) this;
        }

        public Criteria andDblAreaReserLessThan(Double value) {
            addCriterion("ha_area_reser <", value, "ha_area_reser");
            return (Criteria) this;
        }

        public Criteria andDblAreaReserLessThanOrEqualTo(Double value) {
            addCriterion("ha_area_reser <=", value, "ha_area_reser");
            return (Criteria) this;
        }

        public Criteria andDblAreaReserIn(List<Double> values) {
            addCriterion("ha_area_reser in", values, "ha_area_reser");
            return (Criteria) this;
        }

        public Criteria andDblAreaReserNotIn(List<Double> values) {
            addCriterion("ha_area_reser not in", values, "ha_area_reser");
            return (Criteria) this;
        }

        public Criteria andDblAreaReserBetween(Double value1, Double value2) {
            addCriterion("ha_area_reser between", value1, value2, "ha_area_reser");
            return (Criteria) this;
        }

        public Criteria andDblAreaReserNotBetween(Double value1, Double value2) {
            addCriterion("ha_area_reser not between", value1, value2, "ha_area_reser");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaDemarEqualTo(Double value) {
            addCriterion("ha_area_demar =", value, "ha_area_demar");
            return (Criteria) this;
        }

        public Criteria andDblAreaDemarNotEqualTo(Double value) {
            addCriterion("ha_area_demar <>", value, "ha_area_demar");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaDemarIsNull() {
            addCriterion("ha_area_demar is null");
            return (Criteria) this;
        }

        public Criteria andDblAreaDemarIsNotNull() {
            addCriterion("ha_area_demar is not null");
            return (Criteria) this;
        }

        public Criteria andDblAreaDemarGreaterThan(Double value) {
            addCriterion("ha_area_demar >", value, "ha_area_demar");
            return (Criteria) this;
        }

        public Criteria andDblAreaDemarGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_area_demar >=", value, "ha_area_demar");
            return (Criteria) this;
        }

        public Criteria andDblAreaDemarLessThan(Double value) {
            addCriterion("ha_area_demar <", value, "ha_area_demar");
            return (Criteria) this;
        }

        public Criteria andDblAreaDemarLessThanOrEqualTo(Double value) {
            addCriterion("ha_area_demar <=", value, "ha_area_demar");
            return (Criteria) this;
        }

        public Criteria andDblAreaDemarIn(List<Double> values) {
            addCriterion("ha_area_demar in", values, "ha_area_demar");
            return (Criteria) this;
        }

        public Criteria andDblAreaDemarNotIn(List<Double> values) {
            addCriterion("ha_area_demar not in", values, "ha_area_demar");
            return (Criteria) this;
        }

        public Criteria andDblAreaDemarBetween(Double value1, Double value2) {
            addCriterion("ha_area_demar between", value1, value2, "ha_area_demar");
            return (Criteria) this;
        }

        public Criteria andDblAreaDemarNotBetween(Double value1, Double value2) {
            addCriterion("ha_area_demar not between", value1, value2, "ha_area_demar");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaSigEqualTo(Double value) {
            addCriterion("ha_area_sig =", value, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigNotEqualTo(Double value) {
            addCriterion("ha_area_sig <>", value, "ha_area_sig");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaSigIsNull() {
            addCriterion("ha_area_sig is null");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigIsNotNull() {
            addCriterion("ha_area_sig is not null");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigGreaterThan(Double value) {
            addCriterion("ha_area_sig >", value, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_area_sig >=", value, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigLessThan(Double value) {
            addCriterion("ha_area_sig <", value, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigLessThanOrEqualTo(Double value) {
            addCriterion("ha_area_sig <=", value, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigIn(List<Double> values) {
            addCriterion("ha_area_sig in", values, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigNotIn(List<Double> values) {
            addCriterion("ha_area_sig not in", values, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigBetween(Double value1, Double value2) {
            addCriterion("ha_area_sig between", value1, value2, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigNotBetween(Double value1, Double value2) {
            addCriterion("ha_area_sig not between", value1, value2, "ha_area_sig");
            return (Criteria) this;
        }
        
        
        public Criteria andDblPerimTituEqualTo(Double value) {
            addCriterion("ha_perim_titu =", value, "ha_perim_titu");
            return (Criteria) this;
        }

        public Criteria andDblPerimTituNotEqualTo(Double value) {
            addCriterion("ha_perim_titu <>", value, "ha_perim_titu");
            return (Criteria) this;
        }
        
        
        public Criteria andDblPerimTituIsNull() {
            addCriterion("ha_perim_titu is null");
            return (Criteria) this;
        }

        public Criteria andDblPerimTituIsNotNull() {
            addCriterion("ha_perim_titu is not null");
            return (Criteria) this;
        }

        public Criteria andDblPerimTituGreaterThan(Double value) {
            addCriterion("ha_perim_titu >", value, "ha_perim_titu");
            return (Criteria) this;
        }

        public Criteria andDblPerimTituGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_perim_titu >=", value, "ha_perim_titu");
            return (Criteria) this;
        }

        public Criteria andDblPerimTituLessThan(Double value) {
            addCriterion("ha_perim_titu <", value, "ha_perim_titu");
            return (Criteria) this;
        }

        public Criteria andDblPerimTituLessThanOrEqualTo(Double value) {
            addCriterion("ha_perim_titu <=", value, "ha_perim_titu");
            return (Criteria) this;
        }

        public Criteria andDblPerimTituIn(List<Double> values) {
            addCriterion("ha_perim_titu in", values, "ha_perim_titu");
            return (Criteria) this;
        }

        public Criteria andDblPerimTituNotIn(List<Double> values) {
            addCriterion("ha_perim_titu not in", values, "ha_perim_titu");
            return (Criteria) this;
        }

        public Criteria andDblPerimTituBetween(Double value1, Double value2) {
            addCriterion("ha_perim_titu between", value1, value2, "ha_perim_titu");
            return (Criteria) this;
        }

        public Criteria andDblPerimTituNotBetween(Double value1, Double value2) {
            addCriterion("ha_perim_titu not between", value1, value2, "ha_perim_titu");
            return (Criteria) this;
        }
        
        
        public Criteria andStrResolAm1Like(String value) {
            addCriterion("upper(de_resol_am1) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_resol_am1");
            return (Criteria) this;
        }

        public Criteria andStrResolAm1NotLike(String value) {
            addCriterion("de_resol_am1 not like", "%" + CadenaUtil.getStr(value) + "%", "de_resol_am1");
            return (Criteria) this;
        }
			
        public Criteria andStrResolAm1EqualTo(String value) {
            addCriterion("de_resol_am1 =", CadenaUtil.getStr(value), "de_resol_am1");
            return (Criteria) this;
        }

        public Criteria andStrResolAm1NotEqualTo(String value) {
            addCriterion("de_resol_am1 <>", CadenaUtil.getStr(value), "de_resol_am1");
            return (Criteria) this;
        }

        
        public Criteria andStrResolAm1IsNull() {
            addCriterion("de_resol_am1 is null");
            return (Criteria) this;
        }

        public Criteria andStrResolAm1IsNotNull() {
            addCriterion("de_resol_am1 is not null");
            return (Criteria) this;
        }

        public Criteria andStrResolAm1GreaterThan(String value) {
            addCriterion("de_resol_am1 >", value, "de_resol_am1");
            return (Criteria) this;
        }

        public Criteria andStrResolAm1GreaterThanOrEqualTo(String value) {
            addCriterion("de_resol_am1 >=", value, "de_resol_am1");
            return (Criteria) this;
        }

        public Criteria andStrResolAm1LessThan(String value) {
            addCriterion("de_resol_am1 <", value, "de_resol_am1");
            return (Criteria) this;
        }

        public Criteria andStrResolAm1LessThanOrEqualTo(String value) {
            addCriterion("de_resol_am1 <=", value, "de_resol_am1");
            return (Criteria) this;
        }

        public Criteria andStrResolAm1In(List<String> values) {
            addCriterion("de_resol_am1 in", values, "de_resol_am1");
            return (Criteria) this;
        }

        public Criteria andStrResolAm1NotIn(List<String> values) {
            addCriterion("de_resol_am1 not in", values, "de_resol_am1");
            return (Criteria) this;
        }

        public Criteria andStrResolAm1Between(String value1, String value2) {
            addCriterion("de_resol_am1 between", value1, value2, "de_resol_am1");
            return (Criteria) this;
        }

        public Criteria andStrResolAm1NotBetween(String value1, String value2) {
            addCriterion("de_resol_am1 not between", value1, value2, "de_resol_am1");
            return (Criteria) this;
        }
        
        
        public Criteria andStrTituloAm1Like(String value) {
            addCriterion("upper(de_titulo_am1) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_titulo_am1");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm1NotLike(String value) {
            addCriterion("de_titulo_am1 not like", "%" + CadenaUtil.getStr(value) + "%", "de_titulo_am1");
            return (Criteria) this;
        }
			
        public Criteria andStrTituloAm1EqualTo(String value) {
            addCriterion("de_titulo_am1 =", CadenaUtil.getStr(value), "de_titulo_am1");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm1NotEqualTo(String value) {
            addCriterion("de_titulo_am1 <>", CadenaUtil.getStr(value), "de_titulo_am1");
            return (Criteria) this;
        }

        
        public Criteria andStrTituloAm1IsNull() {
            addCriterion("de_titulo_am1 is null");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm1IsNotNull() {
            addCriterion("de_titulo_am1 is not null");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm1GreaterThan(String value) {
            addCriterion("de_titulo_am1 >", value, "de_titulo_am1");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm1GreaterThanOrEqualTo(String value) {
            addCriterion("de_titulo_am1 >=", value, "de_titulo_am1");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm1LessThan(String value) {
            addCriterion("de_titulo_am1 <", value, "de_titulo_am1");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm1LessThanOrEqualTo(String value) {
            addCriterion("de_titulo_am1 <=", value, "de_titulo_am1");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm1In(List<String> values) {
            addCriterion("de_titulo_am1 in", values, "de_titulo_am1");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm1NotIn(List<String> values) {
            addCriterion("de_titulo_am1 not in", values, "de_titulo_am1");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm1Between(String value1, String value2) {
            addCriterion("de_titulo_am1 between", value1, value2, "de_titulo_am1");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm1NotBetween(String value1, String value2) {
            addCriterion("de_titulo_am1 not between", value1, value2, "de_titulo_am1");
            return (Criteria) this;
        }
        
        
        public Criteria andDblArTotAm1EqualTo(Double value) {
            addCriterion("ha_ar_tot_am1 =", value, "ha_ar_tot_am1");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm1NotEqualTo(Double value) {
            addCriterion("ha_ar_tot_am1 <>", value, "ha_ar_tot_am1");
            return (Criteria) this;
        }
        
        
        public Criteria andDblArTotAm1IsNull() {
            addCriterion("ha_ar_tot_am1 is null");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm1IsNotNull() {
            addCriterion("ha_ar_tot_am1 is not null");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm1GreaterThan(Double value) {
            addCriterion("ha_ar_tot_am1 >", value, "ha_ar_tot_am1");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm1GreaterThanOrEqualTo(Double value) {
            addCriterion("ha_ar_tot_am1 >=", value, "ha_ar_tot_am1");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm1LessThan(Double value) {
            addCriterion("ha_ar_tot_am1 <", value, "ha_ar_tot_am1");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm1LessThanOrEqualTo(Double value) {
            addCriterion("ha_ar_tot_am1 <=", value, "ha_ar_tot_am1");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm1In(List<Double> values) {
            addCriterion("ha_ar_tot_am1 in", values, "ha_ar_tot_am1");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm1NotIn(List<Double> values) {
            addCriterion("ha_ar_tot_am1 not in", values, "ha_ar_tot_am1");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm1Between(Double value1, Double value2) {
            addCriterion("ha_ar_tot_am1 between", value1, value2, "ha_ar_tot_am1");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm1NotBetween(Double value1, Double value2) {
            addCriterion("ha_ar_tot_am1 not between", value1, value2, "ha_ar_tot_am1");
            return (Criteria) this;
        }
        
        
        public Criteria andDblArSigAm1EqualTo(Double value) {
            addCriterion("ha_ar_sig_am1 =", value, "ha_ar_sig_am1");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm1NotEqualTo(Double value) {
            addCriterion("ha_ar_sig_am1 <>", value, "ha_ar_sig_am1");
            return (Criteria) this;
        }
        
        
        public Criteria andDblArSigAm1IsNull() {
            addCriterion("ha_ar_sig_am1 is null");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm1IsNotNull() {
            addCriterion("ha_ar_sig_am1 is not null");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm1GreaterThan(Double value) {
            addCriterion("ha_ar_sig_am1 >", value, "ha_ar_sig_am1");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm1GreaterThanOrEqualTo(Double value) {
            addCriterion("ha_ar_sig_am1 >=", value, "ha_ar_sig_am1");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm1LessThan(Double value) {
            addCriterion("ha_ar_sig_am1 <", value, "ha_ar_sig_am1");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm1LessThanOrEqualTo(Double value) {
            addCriterion("ha_ar_sig_am1 <=", value, "ha_ar_sig_am1");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm1In(List<Double> values) {
            addCriterion("ha_ar_sig_am1 in", values, "ha_ar_sig_am1");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm1NotIn(List<Double> values) {
            addCriterion("ha_ar_sig_am1 not in", values, "ha_ar_sig_am1");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm1Between(Double value1, Double value2) {
            addCriterion("ha_ar_sig_am1 between", value1, value2, "ha_ar_sig_am1");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm1NotBetween(Double value1, Double value2) {
            addCriterion("ha_ar_sig_am1 not between", value1, value2, "ha_ar_sig_am1");
            return (Criteria) this;
        }
        
        
        public Criteria andDblPerimAm1EqualTo(Double value) {
            addCriterion("ha_perim_am1 =", value, "ha_perim_am1");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm1NotEqualTo(Double value) {
            addCriterion("ha_perim_am1 <>", value, "ha_perim_am1");
            return (Criteria) this;
        }
        
        
        public Criteria andDblPerimAm1IsNull() {
            addCriterion("ha_perim_am1 is null");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm1IsNotNull() {
            addCriterion("ha_perim_am1 is not null");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm1GreaterThan(Double value) {
            addCriterion("ha_perim_am1 >", value, "ha_perim_am1");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm1GreaterThanOrEqualTo(Double value) {
            addCriterion("ha_perim_am1 >=", value, "ha_perim_am1");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm1LessThan(Double value) {
            addCriterion("ha_perim_am1 <", value, "ha_perim_am1");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm1LessThanOrEqualTo(Double value) {
            addCriterion("ha_perim_am1 <=", value, "ha_perim_am1");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm1In(List<Double> values) {
            addCriterion("ha_perim_am1 in", values, "ha_perim_am1");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm1NotIn(List<Double> values) {
            addCriterion("ha_perim_am1 not in", values, "ha_perim_am1");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm1Between(Double value1, Double value2) {
            addCriterion("ha_perim_am1 between", value1, value2, "ha_perim_am1");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm1NotBetween(Double value1, Double value2) {
            addCriterion("ha_perim_am1 not between", value1, value2, "ha_perim_am1");
            return (Criteria) this;
        }
        
        
        public Criteria andStrResolAm2Like(String value) {
            addCriterion("upper(de_resol_am2) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_resol_am2");
            return (Criteria) this;
        }

        public Criteria andStrResolAm2NotLike(String value) {
            addCriterion("de_resol_am2 not like", "%" + CadenaUtil.getStr(value) + "%", "de_resol_am2");
            return (Criteria) this;
        }
			
        public Criteria andStrResolAm2EqualTo(String value) {
            addCriterion("de_resol_am2 =", CadenaUtil.getStr(value), "de_resol_am2");
            return (Criteria) this;
        }

        public Criteria andStrResolAm2NotEqualTo(String value) {
            addCriterion("de_resol_am2 <>", CadenaUtil.getStr(value), "de_resol_am2");
            return (Criteria) this;
        }

        
        public Criteria andStrResolAm2IsNull() {
            addCriterion("de_resol_am2 is null");
            return (Criteria) this;
        }

        public Criteria andStrResolAm2IsNotNull() {
            addCriterion("de_resol_am2 is not null");
            return (Criteria) this;
        }

        public Criteria andStrResolAm2GreaterThan(String value) {
            addCriterion("de_resol_am2 >", value, "de_resol_am2");
            return (Criteria) this;
        }

        public Criteria andStrResolAm2GreaterThanOrEqualTo(String value) {
            addCriterion("de_resol_am2 >=", value, "de_resol_am2");
            return (Criteria) this;
        }

        public Criteria andStrResolAm2LessThan(String value) {
            addCriterion("de_resol_am2 <", value, "de_resol_am2");
            return (Criteria) this;
        }

        public Criteria andStrResolAm2LessThanOrEqualTo(String value) {
            addCriterion("de_resol_am2 <=", value, "de_resol_am2");
            return (Criteria) this;
        }

        public Criteria andStrResolAm2In(List<String> values) {
            addCriterion("de_resol_am2 in", values, "de_resol_am2");
            return (Criteria) this;
        }

        public Criteria andStrResolAm2NotIn(List<String> values) {
            addCriterion("de_resol_am2 not in", values, "de_resol_am2");
            return (Criteria) this;
        }

        public Criteria andStrResolAm2Between(String value1, String value2) {
            addCriterion("de_resol_am2 between", value1, value2, "de_resol_am2");
            return (Criteria) this;
        }

        public Criteria andStrResolAm2NotBetween(String value1, String value2) {
            addCriterion("de_resol_am2 not between", value1, value2, "de_resol_am2");
            return (Criteria) this;
        }
        
        
        public Criteria andStrTituloAm2Like(String value) {
            addCriterion("upper(de_titulo_am2) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_titulo_am2");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm2NotLike(String value) {
            addCriterion("de_titulo_am2 not like", "%" + CadenaUtil.getStr(value) + "%", "de_titulo_am2");
            return (Criteria) this;
        }
			
        public Criteria andStrTituloAm2EqualTo(String value) {
            addCriterion("de_titulo_am2 =", CadenaUtil.getStr(value), "de_titulo_am2");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm2NotEqualTo(String value) {
            addCriterion("de_titulo_am2 <>", CadenaUtil.getStr(value), "de_titulo_am2");
            return (Criteria) this;
        }

        
        public Criteria andStrTituloAm2IsNull() {
            addCriterion("de_titulo_am2 is null");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm2IsNotNull() {
            addCriterion("de_titulo_am2 is not null");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm2GreaterThan(String value) {
            addCriterion("de_titulo_am2 >", value, "de_titulo_am2");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm2GreaterThanOrEqualTo(String value) {
            addCriterion("de_titulo_am2 >=", value, "de_titulo_am2");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm2LessThan(String value) {
            addCriterion("de_titulo_am2 <", value, "de_titulo_am2");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm2LessThanOrEqualTo(String value) {
            addCriterion("de_titulo_am2 <=", value, "de_titulo_am2");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm2In(List<String> values) {
            addCriterion("de_titulo_am2 in", values, "de_titulo_am2");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm2NotIn(List<String> values) {
            addCriterion("de_titulo_am2 not in", values, "de_titulo_am2");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm2Between(String value1, String value2) {
            addCriterion("de_titulo_am2 between", value1, value2, "de_titulo_am2");
            return (Criteria) this;
        }

        public Criteria andStrTituloAm2NotBetween(String value1, String value2) {
            addCriterion("de_titulo_am2 not between", value1, value2, "de_titulo_am2");
            return (Criteria) this;
        }
        
        
        public Criteria andDblArTotAm2EqualTo(Double value) {
            addCriterion("ha_ar_tot_am2 =", value, "ha_ar_tot_am2");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm2NotEqualTo(Double value) {
            addCriterion("ha_ar_tot_am2 <>", value, "ha_ar_tot_am2");
            return (Criteria) this;
        }
        
        
        public Criteria andDblArTotAm2IsNull() {
            addCriterion("ha_ar_tot_am2 is null");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm2IsNotNull() {
            addCriterion("ha_ar_tot_am2 is not null");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm2GreaterThan(Double value) {
            addCriterion("ha_ar_tot_am2 >", value, "ha_ar_tot_am2");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm2GreaterThanOrEqualTo(Double value) {
            addCriterion("ha_ar_tot_am2 >=", value, "ha_ar_tot_am2");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm2LessThan(Double value) {
            addCriterion("ha_ar_tot_am2 <", value, "ha_ar_tot_am2");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm2LessThanOrEqualTo(Double value) {
            addCriterion("ha_ar_tot_am2 <=", value, "ha_ar_tot_am2");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm2In(List<Double> values) {
            addCriterion("ha_ar_tot_am2 in", values, "ha_ar_tot_am2");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm2NotIn(List<Double> values) {
            addCriterion("ha_ar_tot_am2 not in", values, "ha_ar_tot_am2");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm2Between(Double value1, Double value2) {
            addCriterion("ha_ar_tot_am2 between", value1, value2, "ha_ar_tot_am2");
            return (Criteria) this;
        }

        public Criteria andDblArTotAm2NotBetween(Double value1, Double value2) {
            addCriterion("ha_ar_tot_am2 not between", value1, value2, "ha_ar_tot_am2");
            return (Criteria) this;
        }
        
        
        public Criteria andDblArSigAm2EqualTo(Double value) {
            addCriterion("ha_ar_sig_am2 =", value, "ha_ar_sig_am2");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm2NotEqualTo(Double value) {
            addCriterion("ha_ar_sig_am2 <>", value, "ha_ar_sig_am2");
            return (Criteria) this;
        }
        
        
        public Criteria andDblArSigAm2IsNull() {
            addCriterion("ha_ar_sig_am2 is null");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm2IsNotNull() {
            addCriterion("ha_ar_sig_am2 is not null");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm2GreaterThan(Double value) {
            addCriterion("ha_ar_sig_am2 >", value, "ha_ar_sig_am2");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm2GreaterThanOrEqualTo(Double value) {
            addCriterion("ha_ar_sig_am2 >=", value, "ha_ar_sig_am2");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm2LessThan(Double value) {
            addCriterion("ha_ar_sig_am2 <", value, "ha_ar_sig_am2");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm2LessThanOrEqualTo(Double value) {
            addCriterion("ha_ar_sig_am2 <=", value, "ha_ar_sig_am2");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm2In(List<Double> values) {
            addCriterion("ha_ar_sig_am2 in", values, "ha_ar_sig_am2");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm2NotIn(List<Double> values) {
            addCriterion("ha_ar_sig_am2 not in", values, "ha_ar_sig_am2");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm2Between(Double value1, Double value2) {
            addCriterion("ha_ar_sig_am2 between", value1, value2, "ha_ar_sig_am2");
            return (Criteria) this;
        }

        public Criteria andDblArSigAm2NotBetween(Double value1, Double value2) {
            addCriterion("ha_ar_sig_am2 not between", value1, value2, "ha_ar_sig_am2");
            return (Criteria) this;
        }
        
        
        public Criteria andDblPerimAm2EqualTo(Double value) {
            addCriterion("ha_perim_am2 =", value, "ha_perim_am2");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm2NotEqualTo(Double value) {
            addCriterion("ha_perim_am2 <>", value, "ha_perim_am2");
            return (Criteria) this;
        }
        
        
        public Criteria andDblPerimAm2IsNull() {
            addCriterion("ha_perim_am2 is null");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm2IsNotNull() {
            addCriterion("ha_perim_am2 is not null");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm2GreaterThan(Double value) {
            addCriterion("ha_perim_am2 >", value, "ha_perim_am2");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm2GreaterThanOrEqualTo(Double value) {
            addCriterion("ha_perim_am2 >=", value, "ha_perim_am2");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm2LessThan(Double value) {
            addCriterion("ha_perim_am2 <", value, "ha_perim_am2");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm2LessThanOrEqualTo(Double value) {
            addCriterion("ha_perim_am2 <=", value, "ha_perim_am2");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm2In(List<Double> values) {
            addCriterion("ha_perim_am2 in", values, "ha_perim_am2");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm2NotIn(List<Double> values) {
            addCriterion("ha_perim_am2 not in", values, "ha_perim_am2");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm2Between(Double value1, Double value2) {
            addCriterion("ha_perim_am2 between", value1, value2, "ha_perim_am2");
            return (Criteria) this;
        }

        public Criteria andDblPerimAm2NotBetween(Double value1, Double value2) {
            addCriterion("ha_perim_am2 not between", value1, value2, "ha_perim_am2");
            return (Criteria) this;
        }
        
        
        public Criteria andStrPrimariaLike(String value) {
            addCriterion("upper(de_primaria) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_primaria");
            return (Criteria) this;
        }

        public Criteria andStrPrimariaNotLike(String value) {
            addCriterion("de_primaria not like", "%" + CadenaUtil.getStr(value) + "%", "de_primaria");
            return (Criteria) this;
        }
			
        public Criteria andStrPrimariaEqualTo(String value) {
            addCriterion("de_primaria =", CadenaUtil.getStr(value), "de_primaria");
            return (Criteria) this;
        }

        public Criteria andStrPrimariaNotEqualTo(String value) {
            addCriterion("de_primaria <>", CadenaUtil.getStr(value), "de_primaria");
            return (Criteria) this;
        }

        
        public Criteria andStrPrimariaIsNull() {
            addCriterion("de_primaria is null");
            return (Criteria) this;
        }

        public Criteria andStrPrimariaIsNotNull() {
            addCriterion("de_primaria is not null");
            return (Criteria) this;
        }

        public Criteria andStrPrimariaGreaterThan(String value) {
            addCriterion("de_primaria >", value, "de_primaria");
            return (Criteria) this;
        }

        public Criteria andStrPrimariaGreaterThanOrEqualTo(String value) {
            addCriterion("de_primaria >=", value, "de_primaria");
            return (Criteria) this;
        }

        public Criteria andStrPrimariaLessThan(String value) {
            addCriterion("de_primaria <", value, "de_primaria");
            return (Criteria) this;
        }

        public Criteria andStrPrimariaLessThanOrEqualTo(String value) {
            addCriterion("de_primaria <=", value, "de_primaria");
            return (Criteria) this;
        }

        public Criteria andStrPrimariaIn(List<String> values) {
            addCriterion("de_primaria in", values, "de_primaria");
            return (Criteria) this;
        }

        public Criteria andStrPrimariaNotIn(List<String> values) {
            addCriterion("de_primaria not in", values, "de_primaria");
            return (Criteria) this;
        }

        public Criteria andStrPrimariaBetween(String value1, String value2) {
            addCriterion("de_primaria between", value1, value2, "de_primaria");
            return (Criteria) this;
        }

        public Criteria andStrPrimariaNotBetween(String value1, String value2) {
            addCriterion("de_primaria not between", value1, value2, "de_primaria");
            return (Criteria) this;
        }
        
        
        public Criteria andStrBilingueLike(String value) {
            addCriterion("upper(de_bilingue) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_bilingue");
            return (Criteria) this;
        }

        public Criteria andStrBilingueNotLike(String value) {
            addCriterion("de_bilingue not like", "%" + CadenaUtil.getStr(value) + "%", "de_bilingue");
            return (Criteria) this;
        }
			
        public Criteria andStrBilingueEqualTo(String value) {
            addCriterion("de_bilingue =", CadenaUtil.getStr(value), "de_bilingue");
            return (Criteria) this;
        }

        public Criteria andStrBilingueNotEqualTo(String value) {
            addCriterion("de_bilingue <>", CadenaUtil.getStr(value), "de_bilingue");
            return (Criteria) this;
        }

        
        public Criteria andStrBilingueIsNull() {
            addCriterion("de_bilingue is null");
            return (Criteria) this;
        }

        public Criteria andStrBilingueIsNotNull() {
            addCriterion("de_bilingue is not null");
            return (Criteria) this;
        }

        public Criteria andStrBilingueGreaterThan(String value) {
            addCriterion("de_bilingue >", value, "de_bilingue");
            return (Criteria) this;
        }

        public Criteria andStrBilingueGreaterThanOrEqualTo(String value) {
            addCriterion("de_bilingue >=", value, "de_bilingue");
            return (Criteria) this;
        }

        public Criteria andStrBilingueLessThan(String value) {
            addCriterion("de_bilingue <", value, "de_bilingue");
            return (Criteria) this;
        }

        public Criteria andStrBilingueLessThanOrEqualTo(String value) {
            addCriterion("de_bilingue <=", value, "de_bilingue");
            return (Criteria) this;
        }

        public Criteria andStrBilingueIn(List<String> values) {
            addCriterion("de_bilingue in", values, "de_bilingue");
            return (Criteria) this;
        }

        public Criteria andStrBilingueNotIn(List<String> values) {
            addCriterion("de_bilingue not in", values, "de_bilingue");
            return (Criteria) this;
        }

        public Criteria andStrBilingueBetween(String value1, String value2) {
            addCriterion("de_bilingue between", value1, value2, "de_bilingue");
            return (Criteria) this;
        }

        public Criteria andStrBilingueNotBetween(String value1, String value2) {
            addCriterion("de_bilingue not between", value1, value2, "de_bilingue");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSecundariaLike(String value) {
            addCriterion("upper(de_secundaria) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_secundaria");
            return (Criteria) this;
        }

        public Criteria andStrSecundariaNotLike(String value) {
            addCriterion("de_secundaria not like", "%" + CadenaUtil.getStr(value) + "%", "de_secundaria");
            return (Criteria) this;
        }
			
        public Criteria andStrSecundariaEqualTo(String value) {
            addCriterion("de_secundaria =", CadenaUtil.getStr(value), "de_secundaria");
            return (Criteria) this;
        }

        public Criteria andStrSecundariaNotEqualTo(String value) {
            addCriterion("de_secundaria <>", CadenaUtil.getStr(value), "de_secundaria");
            return (Criteria) this;
        }

        
        public Criteria andStrSecundariaIsNull() {
            addCriterion("de_secundaria is null");
            return (Criteria) this;
        }

        public Criteria andStrSecundariaIsNotNull() {
            addCriterion("de_secundaria is not null");
            return (Criteria) this;
        }

        public Criteria andStrSecundariaGreaterThan(String value) {
            addCriterion("de_secundaria >", value, "de_secundaria");
            return (Criteria) this;
        }

        public Criteria andStrSecundariaGreaterThanOrEqualTo(String value) {
            addCriterion("de_secundaria >=", value, "de_secundaria");
            return (Criteria) this;
        }

        public Criteria andStrSecundariaLessThan(String value) {
            addCriterion("de_secundaria <", value, "de_secundaria");
            return (Criteria) this;
        }

        public Criteria andStrSecundariaLessThanOrEqualTo(String value) {
            addCriterion("de_secundaria <=", value, "de_secundaria");
            return (Criteria) this;
        }

        public Criteria andStrSecundariaIn(List<String> values) {
            addCriterion("de_secundaria in", values, "de_secundaria");
            return (Criteria) this;
        }

        public Criteria andStrSecundariaNotIn(List<String> values) {
            addCriterion("de_secundaria not in", values, "de_secundaria");
            return (Criteria) this;
        }

        public Criteria andStrSecundariaBetween(String value1, String value2) {
            addCriterion("de_secundaria between", value1, value2, "de_secundaria");
            return (Criteria) this;
        }

        public Criteria andStrSecundariaNotBetween(String value1, String value2) {
            addCriterion("de_secundaria not between", value1, value2, "de_secundaria");
            return (Criteria) this;
        }
        
        
        public Criteria andStrPuesSaludLike(String value) {
            addCriterion("upper(de_pues_salud) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_pues_salud");
            return (Criteria) this;
        }

        public Criteria andStrPuesSaludNotLike(String value) {
            addCriterion("de_pues_salud not like", "%" + CadenaUtil.getStr(value) + "%", "de_pues_salud");
            return (Criteria) this;
        }
			
        public Criteria andStrPuesSaludEqualTo(String value) {
            addCriterion("de_pues_salud =", CadenaUtil.getStr(value), "de_pues_salud");
            return (Criteria) this;
        }

        public Criteria andStrPuesSaludNotEqualTo(String value) {
            addCriterion("de_pues_salud <>", CadenaUtil.getStr(value), "de_pues_salud");
            return (Criteria) this;
        }

        
        public Criteria andStrPuesSaludIsNull() {
            addCriterion("de_pues_salud is null");
            return (Criteria) this;
        }

        public Criteria andStrPuesSaludIsNotNull() {
            addCriterion("de_pues_salud is not null");
            return (Criteria) this;
        }

        public Criteria andStrPuesSaludGreaterThan(String value) {
            addCriterion("de_pues_salud >", value, "de_pues_salud");
            return (Criteria) this;
        }

        public Criteria andStrPuesSaludGreaterThanOrEqualTo(String value) {
            addCriterion("de_pues_salud >=", value, "de_pues_salud");
            return (Criteria) this;
        }

        public Criteria andStrPuesSaludLessThan(String value) {
            addCriterion("de_pues_salud <", value, "de_pues_salud");
            return (Criteria) this;
        }

        public Criteria andStrPuesSaludLessThanOrEqualTo(String value) {
            addCriterion("de_pues_salud <=", value, "de_pues_salud");
            return (Criteria) this;
        }

        public Criteria andStrPuesSaludIn(List<String> values) {
            addCriterion("de_pues_salud in", values, "de_pues_salud");
            return (Criteria) this;
        }

        public Criteria andStrPuesSaludNotIn(List<String> values) {
            addCriterion("de_pues_salud not in", values, "de_pues_salud");
            return (Criteria) this;
        }

        public Criteria andStrPuesSaludBetween(String value1, String value2) {
            addCriterion("de_pues_salud between", value1, value2, "de_pues_salud");
            return (Criteria) this;
        }

        public Criteria andStrPuesSaludNotBetween(String value1, String value2) {
            addCriterion("de_pues_salud not between", value1, value2, "de_pues_salud");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCentSaludLike(String value) {
            addCriterion("upper(de_cent_salud) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_cent_salud");
            return (Criteria) this;
        }

        public Criteria andStrCentSaludNotLike(String value) {
            addCriterion("de_cent_salud not like", "%" + CadenaUtil.getStr(value) + "%", "de_cent_salud");
            return (Criteria) this;
        }
			
        public Criteria andStrCentSaludEqualTo(String value) {
            addCriterion("de_cent_salud =", CadenaUtil.getStr(value), "de_cent_salud");
            return (Criteria) this;
        }

        public Criteria andStrCentSaludNotEqualTo(String value) {
            addCriterion("de_cent_salud <>", CadenaUtil.getStr(value), "de_cent_salud");
            return (Criteria) this;
        }

        
        public Criteria andStrCentSaludIsNull() {
            addCriterion("de_cent_salud is null");
            return (Criteria) this;
        }

        public Criteria andStrCentSaludIsNotNull() {
            addCriterion("de_cent_salud is not null");
            return (Criteria) this;
        }

        public Criteria andStrCentSaludGreaterThan(String value) {
            addCriterion("de_cent_salud >", value, "de_cent_salud");
            return (Criteria) this;
        }

        public Criteria andStrCentSaludGreaterThanOrEqualTo(String value) {
            addCriterion("de_cent_salud >=", value, "de_cent_salud");
            return (Criteria) this;
        }

        public Criteria andStrCentSaludLessThan(String value) {
            addCriterion("de_cent_salud <", value, "de_cent_salud");
            return (Criteria) this;
        }

        public Criteria andStrCentSaludLessThanOrEqualTo(String value) {
            addCriterion("de_cent_salud <=", value, "de_cent_salud");
            return (Criteria) this;
        }

        public Criteria andStrCentSaludIn(List<String> values) {
            addCriterion("de_cent_salud in", values, "de_cent_salud");
            return (Criteria) this;
        }

        public Criteria andStrCentSaludNotIn(List<String> values) {
            addCriterion("de_cent_salud not in", values, "de_cent_salud");
            return (Criteria) this;
        }

        public Criteria andStrCentSaludBetween(String value1, String value2) {
            addCriterion("de_cent_salud between", value1, value2, "de_cent_salud");
            return (Criteria) this;
        }

        public Criteria andStrCentSaludNotBetween(String value1, String value2) {
            addCriterion("de_cent_salud not between", value1, value2, "de_cent_salud");
            return (Criteria) this;
        }
        
        
        public Criteria andStrProdVent1Like(String value) {
            addCriterion("upper(de_prod_vent1) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_prod_vent1");
            return (Criteria) this;
        }

        public Criteria andStrProdVent1NotLike(String value) {
            addCriterion("de_prod_vent1 not like", "%" + CadenaUtil.getStr(value) + "%", "de_prod_vent1");
            return (Criteria) this;
        }
			
        public Criteria andStrProdVent1EqualTo(String value) {
            addCriterion("de_prod_vent1 =", CadenaUtil.getStr(value), "de_prod_vent1");
            return (Criteria) this;
        }

        public Criteria andStrProdVent1NotEqualTo(String value) {
            addCriterion("de_prod_vent1 <>", CadenaUtil.getStr(value), "de_prod_vent1");
            return (Criteria) this;
        }

        
        public Criteria andStrProdVent1IsNull() {
            addCriterion("de_prod_vent1 is null");
            return (Criteria) this;
        }

        public Criteria andStrProdVent1IsNotNull() {
            addCriterion("de_prod_vent1 is not null");
            return (Criteria) this;
        }

        public Criteria andStrProdVent1GreaterThan(String value) {
            addCriterion("de_prod_vent1 >", value, "de_prod_vent1");
            return (Criteria) this;
        }

        public Criteria andStrProdVent1GreaterThanOrEqualTo(String value) {
            addCriterion("de_prod_vent1 >=", value, "de_prod_vent1");
            return (Criteria) this;
        }

        public Criteria andStrProdVent1LessThan(String value) {
            addCriterion("de_prod_vent1 <", value, "de_prod_vent1");
            return (Criteria) this;
        }

        public Criteria andStrProdVent1LessThanOrEqualTo(String value) {
            addCriterion("de_prod_vent1 <=", value, "de_prod_vent1");
            return (Criteria) this;
        }

        public Criteria andStrProdVent1In(List<String> values) {
            addCriterion("de_prod_vent1 in", values, "de_prod_vent1");
            return (Criteria) this;
        }

        public Criteria andStrProdVent1NotIn(List<String> values) {
            addCriterion("de_prod_vent1 not in", values, "de_prod_vent1");
            return (Criteria) this;
        }

        public Criteria andStrProdVent1Between(String value1, String value2) {
            addCriterion("de_prod_vent1 between", value1, value2, "de_prod_vent1");
            return (Criteria) this;
        }

        public Criteria andStrProdVent1NotBetween(String value1, String value2) {
            addCriterion("de_prod_vent1 not between", value1, value2, "de_prod_vent1");
            return (Criteria) this;
        }
        
        
        public Criteria andStrProdVent2Like(String value) {
            addCriterion("upper(de_prod_vent2) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_prod_vent2");
            return (Criteria) this;
        }

        public Criteria andStrProdVent2NotLike(String value) {
            addCriterion("de_prod_vent2 not like", "%" + CadenaUtil.getStr(value) + "%", "de_prod_vent2");
            return (Criteria) this;
        }
			
        public Criteria andStrProdVent2EqualTo(String value) {
            addCriterion("de_prod_vent2 =", CadenaUtil.getStr(value), "de_prod_vent2");
            return (Criteria) this;
        }

        public Criteria andStrProdVent2NotEqualTo(String value) {
            addCriterion("de_prod_vent2 <>", CadenaUtil.getStr(value), "de_prod_vent2");
            return (Criteria) this;
        }

        
        public Criteria andStrProdVent2IsNull() {
            addCriterion("de_prod_vent2 is null");
            return (Criteria) this;
        }

        public Criteria andStrProdVent2IsNotNull() {
            addCriterion("de_prod_vent2 is not null");
            return (Criteria) this;
        }

        public Criteria andStrProdVent2GreaterThan(String value) {
            addCriterion("de_prod_vent2 >", value, "de_prod_vent2");
            return (Criteria) this;
        }

        public Criteria andStrProdVent2GreaterThanOrEqualTo(String value) {
            addCriterion("de_prod_vent2 >=", value, "de_prod_vent2");
            return (Criteria) this;
        }

        public Criteria andStrProdVent2LessThan(String value) {
            addCriterion("de_prod_vent2 <", value, "de_prod_vent2");
            return (Criteria) this;
        }

        public Criteria andStrProdVent2LessThanOrEqualTo(String value) {
            addCriterion("de_prod_vent2 <=", value, "de_prod_vent2");
            return (Criteria) this;
        }

        public Criteria andStrProdVent2In(List<String> values) {
            addCriterion("de_prod_vent2 in", values, "de_prod_vent2");
            return (Criteria) this;
        }

        public Criteria andStrProdVent2NotIn(List<String> values) {
            addCriterion("de_prod_vent2 not in", values, "de_prod_vent2");
            return (Criteria) this;
        }

        public Criteria andStrProdVent2Between(String value1, String value2) {
            addCriterion("de_prod_vent2 between", value1, value2, "de_prod_vent2");
            return (Criteria) this;
        }

        public Criteria andStrProdVent2NotBetween(String value1, String value2) {
            addCriterion("de_prod_vent2 not between", value1, value2, "de_prod_vent2");
            return (Criteria) this;
        }
        
        
        public Criteria andStrProdVent3Like(String value) {
            addCriterion("upper(de_prod_vent3) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_prod_vent3");
            return (Criteria) this;
        }

        public Criteria andStrProdVent3NotLike(String value) {
            addCriterion("de_prod_vent3 not like", "%" + CadenaUtil.getStr(value) + "%", "de_prod_vent3");
            return (Criteria) this;
        }
			
        public Criteria andStrProdVent3EqualTo(String value) {
            addCriterion("de_prod_vent3 =", CadenaUtil.getStr(value), "de_prod_vent3");
            return (Criteria) this;
        }

        public Criteria andStrProdVent3NotEqualTo(String value) {
            addCriterion("de_prod_vent3 <>", CadenaUtil.getStr(value), "de_prod_vent3");
            return (Criteria) this;
        }

        
        public Criteria andStrProdVent3IsNull() {
            addCriterion("de_prod_vent3 is null");
            return (Criteria) this;
        }

        public Criteria andStrProdVent3IsNotNull() {
            addCriterion("de_prod_vent3 is not null");
            return (Criteria) this;
        }

        public Criteria andStrProdVent3GreaterThan(String value) {
            addCriterion("de_prod_vent3 >", value, "de_prod_vent3");
            return (Criteria) this;
        }

        public Criteria andStrProdVent3GreaterThanOrEqualTo(String value) {
            addCriterion("de_prod_vent3 >=", value, "de_prod_vent3");
            return (Criteria) this;
        }

        public Criteria andStrProdVent3LessThan(String value) {
            addCriterion("de_prod_vent3 <", value, "de_prod_vent3");
            return (Criteria) this;
        }

        public Criteria andStrProdVent3LessThanOrEqualTo(String value) {
            addCriterion("de_prod_vent3 <=", value, "de_prod_vent3");
            return (Criteria) this;
        }

        public Criteria andStrProdVent3In(List<String> values) {
            addCriterion("de_prod_vent3 in", values, "de_prod_vent3");
            return (Criteria) this;
        }

        public Criteria andStrProdVent3NotIn(List<String> values) {
            addCriterion("de_prod_vent3 not in", values, "de_prod_vent3");
            return (Criteria) this;
        }

        public Criteria andStrProdVent3Between(String value1, String value2) {
            addCriterion("de_prod_vent3 between", value1, value2, "de_prod_vent3");
            return (Criteria) this;
        }

        public Criteria andStrProdVent3NotBetween(String value1, String value2) {
            addCriterion("de_prod_vent3 not between", value1, value2, "de_prod_vent3");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFuenteLike(String value) {
            addCriterion("upper(de_fuente) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteNotLike(String value) {
            addCriterion("de_fuente not like", "%" + CadenaUtil.getStr(value) + "%", "de_fuente");
            return (Criteria) this;
        }
			
        public Criteria andStrFuenteEqualTo(String value) {
            addCriterion("de_fuente =", CadenaUtil.getStr(value), "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteNotEqualTo(String value) {
            addCriterion("de_fuente <>", CadenaUtil.getStr(value), "de_fuente");
            return (Criteria) this;
        }

        
        public Criteria andStrFuenteIsNull() {
            addCriterion("de_fuente is null");
            return (Criteria) this;
        }

        public Criteria andStrFuenteIsNotNull() {
            addCriterion("de_fuente is not null");
            return (Criteria) this;
        }

        public Criteria andStrFuenteGreaterThan(String value) {
            addCriterion("de_fuente >", value, "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteGreaterThanOrEqualTo(String value) {
            addCriterion("de_fuente >=", value, "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteLessThan(String value) {
            addCriterion("de_fuente <", value, "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteLessThanOrEqualTo(String value) {
            addCriterion("de_fuente <=", value, "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteIn(List<String> values) {
            addCriterion("de_fuente in", values, "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteNotIn(List<String> values) {
            addCriterion("de_fuente not in", values, "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteBetween(String value1, String value2) {
            addCriterion("de_fuente between", value1, value2, "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteNotBetween(String value1, String value2) {
            addCriterion("de_fuente not between", value1, value2, "de_fuente");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFechaLike(String value) {
            addCriterion("upper(de_fecha) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaNotLike(String value) {
            addCriterion("de_fecha not like", "%" + CadenaUtil.getStr(value) + "%", "de_fecha");
            return (Criteria) this;
        }
			
        public Criteria andStrFechaEqualTo(String value) {
            addCriterion("de_fecha =", CadenaUtil.getStr(value), "de_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaNotEqualTo(String value) {
            addCriterion("de_fecha <>", CadenaUtil.getStr(value), "de_fecha");
            return (Criteria) this;
        }

        
        public Criteria andStrFechaIsNull() {
            addCriterion("de_fecha is null");
            return (Criteria) this;
        }

        public Criteria andStrFechaIsNotNull() {
            addCriterion("de_fecha is not null");
            return (Criteria) this;
        }

        public Criteria andStrFechaGreaterThan(String value) {
            addCriterion("de_fecha >", value, "de_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaGreaterThanOrEqualTo(String value) {
            addCriterion("de_fecha >=", value, "de_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaLessThan(String value) {
            addCriterion("de_fecha <", value, "de_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaLessThanOrEqualTo(String value) {
            addCriterion("de_fecha <=", value, "de_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaIn(List<String> values) {
            addCriterion("de_fecha in", values, "de_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaNotIn(List<String> values) {
            addCriterion("de_fecha not in", values, "de_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaBetween(String value1, String value2) {
            addCriterion("de_fecha between", value1, value2, "de_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaNotBetween(String value1, String value2) {
            addCriterion("de_fecha not between", value1, value2, "de_fecha");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNotasLike(String value) {
            addCriterion("upper(de_notas) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_notas");
            return (Criteria) this;
        }

        public Criteria andStrNotasNotLike(String value) {
            addCriterion("de_notas not like", "%" + CadenaUtil.getStr(value) + "%", "de_notas");
            return (Criteria) this;
        }
			
        public Criteria andStrNotasEqualTo(String value) {
            addCriterion("de_notas =", CadenaUtil.getStr(value), "de_notas");
            return (Criteria) this;
        }

        public Criteria andStrNotasNotEqualTo(String value) {
            addCriterion("de_notas <>", CadenaUtil.getStr(value), "de_notas");
            return (Criteria) this;
        }

        
        public Criteria andStrNotasIsNull() {
            addCriterion("de_notas is null");
            return (Criteria) this;
        }

        public Criteria andStrNotasIsNotNull() {
            addCriterion("de_notas is not null");
            return (Criteria) this;
        }

        public Criteria andStrNotasGreaterThan(String value) {
            addCriterion("de_notas >", value, "de_notas");
            return (Criteria) this;
        }

        public Criteria andStrNotasGreaterThanOrEqualTo(String value) {
            addCriterion("de_notas >=", value, "de_notas");
            return (Criteria) this;
        }

        public Criteria andStrNotasLessThan(String value) {
            addCriterion("de_notas <", value, "de_notas");
            return (Criteria) this;
        }

        public Criteria andStrNotasLessThanOrEqualTo(String value) {
            addCriterion("de_notas <=", value, "de_notas");
            return (Criteria) this;
        }

        public Criteria andStrNotasIn(List<String> values) {
            addCriterion("de_notas in", values, "de_notas");
            return (Criteria) this;
        }

        public Criteria andStrNotasNotIn(List<String> values) {
            addCriterion("de_notas not in", values, "de_notas");
            return (Criteria) this;
        }

        public Criteria andStrNotasBetween(String value1, String value2) {
            addCriterion("de_notas between", value1, value2, "de_notas");
            return (Criteria) this;
        }

        public Criteria andStrNotasNotBetween(String value1, String value2) {
            addCriterion("de_notas not between", value1, value2, "de_notas");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeStarEqualTo(Double value) {
            addCriterion("ha_shape_star =", value, "ha_shape_star");
            return (Criteria) this;
        }

        public Criteria andDblShapeStarNotEqualTo(Double value) {
            addCriterion("ha_shape_star <>", value, "ha_shape_star");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeStarIsNull() {
            addCriterion("ha_shape_star is null");
            return (Criteria) this;
        }

        public Criteria andDblShapeStarIsNotNull() {
            addCriterion("ha_shape_star is not null");
            return (Criteria) this;
        }

        public Criteria andDblShapeStarGreaterThan(Double value) {
            addCriterion("ha_shape_star >", value, "ha_shape_star");
            return (Criteria) this;
        }

        public Criteria andDblShapeStarGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_shape_star >=", value, "ha_shape_star");
            return (Criteria) this;
        }

        public Criteria andDblShapeStarLessThan(Double value) {
            addCriterion("ha_shape_star <", value, "ha_shape_star");
            return (Criteria) this;
        }

        public Criteria andDblShapeStarLessThanOrEqualTo(Double value) {
            addCriterion("ha_shape_star <=", value, "ha_shape_star");
            return (Criteria) this;
        }

        public Criteria andDblShapeStarIn(List<Double> values) {
            addCriterion("ha_shape_star in", values, "ha_shape_star");
            return (Criteria) this;
        }

        public Criteria andDblShapeStarNotIn(List<Double> values) {
            addCriterion("ha_shape_star not in", values, "ha_shape_star");
            return (Criteria) this;
        }

        public Criteria andDblShapeStarBetween(Double value1, Double value2) {
            addCriterion("ha_shape_star between", value1, value2, "ha_shape_star");
            return (Criteria) this;
        }

        public Criteria andDblShapeStarNotBetween(Double value1, Double value2) {
            addCriterion("ha_shape_star not between", value1, value2, "ha_shape_star");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeStleEqualTo(Double value) {
            addCriterion("ha_shape_stle =", value, "ha_shape_stle");
            return (Criteria) this;
        }

        public Criteria andDblShapeStleNotEqualTo(Double value) {
            addCriterion("ha_shape_stle <>", value, "ha_shape_stle");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeStleIsNull() {
            addCriterion("ha_shape_stle is null");
            return (Criteria) this;
        }

        public Criteria andDblShapeStleIsNotNull() {
            addCriterion("ha_shape_stle is not null");
            return (Criteria) this;
        }

        public Criteria andDblShapeStleGreaterThan(Double value) {
            addCriterion("ha_shape_stle >", value, "ha_shape_stle");
            return (Criteria) this;
        }

        public Criteria andDblShapeStleGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_shape_stle >=", value, "ha_shape_stle");
            return (Criteria) this;
        }

        public Criteria andDblShapeStleLessThan(Double value) {
            addCriterion("ha_shape_stle <", value, "ha_shape_stle");
            return (Criteria) this;
        }

        public Criteria andDblShapeStleLessThanOrEqualTo(Double value) {
            addCriterion("ha_shape_stle <=", value, "ha_shape_stle");
            return (Criteria) this;
        }

        public Criteria andDblShapeStleIn(List<Double> values) {
            addCriterion("ha_shape_stle in", values, "ha_shape_stle");
            return (Criteria) this;
        }

        public Criteria andDblShapeStleNotIn(List<Double> values) {
            addCriterion("ha_shape_stle not in", values, "ha_shape_stle");
            return (Criteria) this;
        }

        public Criteria andDblShapeStleBetween(Double value1, Double value2) {
            addCriterion("ha_shape_stle between", value1, value2, "ha_shape_stle");
            return (Criteria) this;
        }

        public Criteria andDblShapeStleNotBetween(Double value1, Double value2) {
            addCriterion("ha_shape_stle not between", value1, value2, "ha_shape_stle");
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
