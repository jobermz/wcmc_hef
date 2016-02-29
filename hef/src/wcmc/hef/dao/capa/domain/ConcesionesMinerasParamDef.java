package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class ConcesionesMinerasParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConcesionesMinerasParamDef() {
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
        
        
        public Criteria andStrCodigouLike(String value) {
            addCriterion("upper(de_codigou) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_codigou");
            return (Criteria) this;
        }

        public Criteria andStrCodigouNotLike(String value) {
            addCriterion("de_codigou not like", "%" + CadenaUtil.getStr(value) + "%", "de_codigou");
            return (Criteria) this;
        }
			
        public Criteria andStrCodigouEqualTo(String value) {
            addCriterion("de_codigou =", CadenaUtil.getStr(value), "de_codigou");
            return (Criteria) this;
        }

        public Criteria andStrCodigouNotEqualTo(String value) {
            addCriterion("de_codigou <>", CadenaUtil.getStr(value), "de_codigou");
            return (Criteria) this;
        }

        
        public Criteria andStrCodigouIsNull() {
            addCriterion("de_codigou is null");
            return (Criteria) this;
        }

        public Criteria andStrCodigouIsNotNull() {
            addCriterion("de_codigou is not null");
            return (Criteria) this;
        }

        public Criteria andStrCodigouGreaterThan(String value) {
            addCriterion("de_codigou >", value, "de_codigou");
            return (Criteria) this;
        }

        public Criteria andStrCodigouGreaterThanOrEqualTo(String value) {
            addCriterion("de_codigou >=", value, "de_codigou");
            return (Criteria) this;
        }

        public Criteria andStrCodigouLessThan(String value) {
            addCriterion("de_codigou <", value, "de_codigou");
            return (Criteria) this;
        }

        public Criteria andStrCodigouLessThanOrEqualTo(String value) {
            addCriterion("de_codigou <=", value, "de_codigou");
            return (Criteria) this;
        }

        public Criteria andStrCodigouIn(List<String> values) {
            addCriterion("de_codigou in", values, "de_codigou");
            return (Criteria) this;
        }

        public Criteria andStrCodigouNotIn(List<String> values) {
            addCriterion("de_codigou not in", values, "de_codigou");
            return (Criteria) this;
        }

        public Criteria andStrCodigouBetween(String value1, String value2) {
            addCriterion("de_codigou between", value1, value2, "de_codigou");
            return (Criteria) this;
        }

        public Criteria andStrCodigouNotBetween(String value1, String value2) {
            addCriterion("de_codigou not between", value1, value2, "de_codigou");
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
        
        
        public Criteria andStrConcesionLike(String value) {
            addCriterion("upper(de_concesion) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_concesion");
            return (Criteria) this;
        }

        public Criteria andStrConcesionNotLike(String value) {
            addCriterion("de_concesion not like", "%" + CadenaUtil.getStr(value) + "%", "de_concesion");
            return (Criteria) this;
        }
			
        public Criteria andStrConcesionEqualTo(String value) {
            addCriterion("de_concesion =", CadenaUtil.getStr(value), "de_concesion");
            return (Criteria) this;
        }

        public Criteria andStrConcesionNotEqualTo(String value) {
            addCriterion("de_concesion <>", CadenaUtil.getStr(value), "de_concesion");
            return (Criteria) this;
        }

        
        public Criteria andStrConcesionIsNull() {
            addCriterion("de_concesion is null");
            return (Criteria) this;
        }

        public Criteria andStrConcesionIsNotNull() {
            addCriterion("de_concesion is not null");
            return (Criteria) this;
        }

        public Criteria andStrConcesionGreaterThan(String value) {
            addCriterion("de_concesion >", value, "de_concesion");
            return (Criteria) this;
        }

        public Criteria andStrConcesionGreaterThanOrEqualTo(String value) {
            addCriterion("de_concesion >=", value, "de_concesion");
            return (Criteria) this;
        }

        public Criteria andStrConcesionLessThan(String value) {
            addCriterion("de_concesion <", value, "de_concesion");
            return (Criteria) this;
        }

        public Criteria andStrConcesionLessThanOrEqualTo(String value) {
            addCriterion("de_concesion <=", value, "de_concesion");
            return (Criteria) this;
        }

        public Criteria andStrConcesionIn(List<String> values) {
            addCriterion("de_concesion in", values, "de_concesion");
            return (Criteria) this;
        }

        public Criteria andStrConcesionNotIn(List<String> values) {
            addCriterion("de_concesion not in", values, "de_concesion");
            return (Criteria) this;
        }

        public Criteria andStrConcesionBetween(String value1, String value2) {
            addCriterion("de_concesion between", value1, value2, "de_concesion");
            return (Criteria) this;
        }

        public Criteria andStrConcesionNotBetween(String value1, String value2) {
            addCriterion("de_concesion not between", value1, value2, "de_concesion");
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
        
        
        public Criteria andStrTitConcesLike(String value) {
            addCriterion("upper(de_tit_conces) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_tit_conces");
            return (Criteria) this;
        }

        public Criteria andStrTitConcesNotLike(String value) {
            addCriterion("de_tit_conces not like", "%" + CadenaUtil.getStr(value) + "%", "de_tit_conces");
            return (Criteria) this;
        }
			
        public Criteria andStrTitConcesEqualTo(String value) {
            addCriterion("de_tit_conces =", CadenaUtil.getStr(value), "de_tit_conces");
            return (Criteria) this;
        }

        public Criteria andStrTitConcesNotEqualTo(String value) {
            addCriterion("de_tit_conces <>", CadenaUtil.getStr(value), "de_tit_conces");
            return (Criteria) this;
        }

        
        public Criteria andStrTitConcesIsNull() {
            addCriterion("de_tit_conces is null");
            return (Criteria) this;
        }

        public Criteria andStrTitConcesIsNotNull() {
            addCriterion("de_tit_conces is not null");
            return (Criteria) this;
        }

        public Criteria andStrTitConcesGreaterThan(String value) {
            addCriterion("de_tit_conces >", value, "de_tit_conces");
            return (Criteria) this;
        }

        public Criteria andStrTitConcesGreaterThanOrEqualTo(String value) {
            addCriterion("de_tit_conces >=", value, "de_tit_conces");
            return (Criteria) this;
        }

        public Criteria andStrTitConcesLessThan(String value) {
            addCriterion("de_tit_conces <", value, "de_tit_conces");
            return (Criteria) this;
        }

        public Criteria andStrTitConcesLessThanOrEqualTo(String value) {
            addCriterion("de_tit_conces <=", value, "de_tit_conces");
            return (Criteria) this;
        }

        public Criteria andStrTitConcesIn(List<String> values) {
            addCriterion("de_tit_conces in", values, "de_tit_conces");
            return (Criteria) this;
        }

        public Criteria andStrTitConcesNotIn(List<String> values) {
            addCriterion("de_tit_conces not in", values, "de_tit_conces");
            return (Criteria) this;
        }

        public Criteria andStrTitConcesBetween(String value1, String value2) {
            addCriterion("de_tit_conces between", value1, value2, "de_tit_conces");
            return (Criteria) this;
        }

        public Criteria andStrTitConcesNotBetween(String value1, String value2) {
            addCriterion("de_tit_conces not between", value1, value2, "de_tit_conces");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNaturalezaLike(String value) {
            addCriterion("upper(de_naturaleza) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_naturaleza");
            return (Criteria) this;
        }

        public Criteria andStrNaturalezaNotLike(String value) {
            addCriterion("de_naturaleza not like", "%" + CadenaUtil.getStr(value) + "%", "de_naturaleza");
            return (Criteria) this;
        }
			
        public Criteria andStrNaturalezaEqualTo(String value) {
            addCriterion("de_naturaleza =", CadenaUtil.getStr(value), "de_naturaleza");
            return (Criteria) this;
        }

        public Criteria andStrNaturalezaNotEqualTo(String value) {
            addCriterion("de_naturaleza <>", CadenaUtil.getStr(value), "de_naturaleza");
            return (Criteria) this;
        }

        
        public Criteria andStrNaturalezaIsNull() {
            addCriterion("de_naturaleza is null");
            return (Criteria) this;
        }

        public Criteria andStrNaturalezaIsNotNull() {
            addCriterion("de_naturaleza is not null");
            return (Criteria) this;
        }

        public Criteria andStrNaturalezaGreaterThan(String value) {
            addCriterion("de_naturaleza >", value, "de_naturaleza");
            return (Criteria) this;
        }

        public Criteria andStrNaturalezaGreaterThanOrEqualTo(String value) {
            addCriterion("de_naturaleza >=", value, "de_naturaleza");
            return (Criteria) this;
        }

        public Criteria andStrNaturalezaLessThan(String value) {
            addCriterion("de_naturaleza <", value, "de_naturaleza");
            return (Criteria) this;
        }

        public Criteria andStrNaturalezaLessThanOrEqualTo(String value) {
            addCriterion("de_naturaleza <=", value, "de_naturaleza");
            return (Criteria) this;
        }

        public Criteria andStrNaturalezaIn(List<String> values) {
            addCriterion("de_naturaleza in", values, "de_naturaleza");
            return (Criteria) this;
        }

        public Criteria andStrNaturalezaNotIn(List<String> values) {
            addCriterion("de_naturaleza not in", values, "de_naturaleza");
            return (Criteria) this;
        }

        public Criteria andStrNaturalezaBetween(String value1, String value2) {
            addCriterion("de_naturaleza between", value1, value2, "de_naturaleza");
            return (Criteria) this;
        }

        public Criteria andStrNaturalezaNotBetween(String value1, String value2) {
            addCriterion("de_naturaleza not between", value1, value2, "de_naturaleza");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFecDenuLike(String value) {
            addCriterion("upper(de_fec_denu) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_fec_denu");
            return (Criteria) this;
        }

        public Criteria andStrFecDenuNotLike(String value) {
            addCriterion("de_fec_denu not like", "%" + CadenaUtil.getStr(value) + "%", "de_fec_denu");
            return (Criteria) this;
        }
			
        public Criteria andStrFecDenuEqualTo(String value) {
            addCriterion("de_fec_denu =", CadenaUtil.getStr(value), "de_fec_denu");
            return (Criteria) this;
        }

        public Criteria andStrFecDenuNotEqualTo(String value) {
            addCriterion("de_fec_denu <>", CadenaUtil.getStr(value), "de_fec_denu");
            return (Criteria) this;
        }

        
        public Criteria andStrFecDenuIsNull() {
            addCriterion("de_fec_denu is null");
            return (Criteria) this;
        }

        public Criteria andStrFecDenuIsNotNull() {
            addCriterion("de_fec_denu is not null");
            return (Criteria) this;
        }

        public Criteria andStrFecDenuGreaterThan(String value) {
            addCriterion("de_fec_denu >", value, "de_fec_denu");
            return (Criteria) this;
        }

        public Criteria andStrFecDenuGreaterThanOrEqualTo(String value) {
            addCriterion("de_fec_denu >=", value, "de_fec_denu");
            return (Criteria) this;
        }

        public Criteria andStrFecDenuLessThan(String value) {
            addCriterion("de_fec_denu <", value, "de_fec_denu");
            return (Criteria) this;
        }

        public Criteria andStrFecDenuLessThanOrEqualTo(String value) {
            addCriterion("de_fec_denu <=", value, "de_fec_denu");
            return (Criteria) this;
        }

        public Criteria andStrFecDenuIn(List<String> values) {
            addCriterion("de_fec_denu in", values, "de_fec_denu");
            return (Criteria) this;
        }

        public Criteria andStrFecDenuNotIn(List<String> values) {
            addCriterion("de_fec_denu not in", values, "de_fec_denu");
            return (Criteria) this;
        }

        public Criteria andStrFecDenuBetween(String value1, String value2) {
            addCriterion("de_fec_denu between", value1, value2, "de_fec_denu");
            return (Criteria) this;
        }

        public Criteria andStrFecDenuNotBetween(String value1, String value2) {
            addCriterion("de_fec_denu not between", value1, value2, "de_fec_denu");
            return (Criteria) this;
        }
        
        
        public Criteria andDblHectareaEqualTo(Double value) {
            addCriterion("ha_hectarea =", value, "ha_hectarea");
            return (Criteria) this;
        }

        public Criteria andDblHectareaNotEqualTo(Double value) {
            addCriterion("ha_hectarea <>", value, "ha_hectarea");
            return (Criteria) this;
        }
        
        
        public Criteria andDblHectareaIsNull() {
            addCriterion("ha_hectarea is null");
            return (Criteria) this;
        }

        public Criteria andDblHectareaIsNotNull() {
            addCriterion("ha_hectarea is not null");
            return (Criteria) this;
        }

        public Criteria andDblHectareaGreaterThan(Double value) {
            addCriterion("ha_hectarea >", value, "ha_hectarea");
            return (Criteria) this;
        }

        public Criteria andDblHectareaGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_hectarea >=", value, "ha_hectarea");
            return (Criteria) this;
        }

        public Criteria andDblHectareaLessThan(Double value) {
            addCriterion("ha_hectarea <", value, "ha_hectarea");
            return (Criteria) this;
        }

        public Criteria andDblHectareaLessThanOrEqualTo(Double value) {
            addCriterion("ha_hectarea <=", value, "ha_hectarea");
            return (Criteria) this;
        }

        public Criteria andDblHectareaIn(List<Double> values) {
            addCriterion("ha_hectarea in", values, "ha_hectarea");
            return (Criteria) this;
        }

        public Criteria andDblHectareaNotIn(List<Double> values) {
            addCriterion("ha_hectarea not in", values, "ha_hectarea");
            return (Criteria) this;
        }

        public Criteria andDblHectareaBetween(Double value1, Double value2) {
            addCriterion("ha_hectarea between", value1, value2, "ha_hectarea");
            return (Criteria) this;
        }

        public Criteria andDblHectareaNotBetween(Double value1, Double value2) {
            addCriterion("ha_hectarea not between", value1, value2, "ha_hectarea");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCartaLike(String value) {
            addCriterion("upper(de_carta) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_carta");
            return (Criteria) this;
        }

        public Criteria andStrCartaNotLike(String value) {
            addCriterion("de_carta not like", "%" + CadenaUtil.getStr(value) + "%", "de_carta");
            return (Criteria) this;
        }
			
        public Criteria andStrCartaEqualTo(String value) {
            addCriterion("de_carta =", CadenaUtil.getStr(value), "de_carta");
            return (Criteria) this;
        }

        public Criteria andStrCartaNotEqualTo(String value) {
            addCriterion("de_carta <>", CadenaUtil.getStr(value), "de_carta");
            return (Criteria) this;
        }

        
        public Criteria andStrCartaIsNull() {
            addCriterion("de_carta is null");
            return (Criteria) this;
        }

        public Criteria andStrCartaIsNotNull() {
            addCriterion("de_carta is not null");
            return (Criteria) this;
        }

        public Criteria andStrCartaGreaterThan(String value) {
            addCriterion("de_carta >", value, "de_carta");
            return (Criteria) this;
        }

        public Criteria andStrCartaGreaterThanOrEqualTo(String value) {
            addCriterion("de_carta >=", value, "de_carta");
            return (Criteria) this;
        }

        public Criteria andStrCartaLessThan(String value) {
            addCriterion("de_carta <", value, "de_carta");
            return (Criteria) this;
        }

        public Criteria andStrCartaLessThanOrEqualTo(String value) {
            addCriterion("de_carta <=", value, "de_carta");
            return (Criteria) this;
        }

        public Criteria andStrCartaIn(List<String> values) {
            addCriterion("de_carta in", values, "de_carta");
            return (Criteria) this;
        }

        public Criteria andStrCartaNotIn(List<String> values) {
            addCriterion("de_carta not in", values, "de_carta");
            return (Criteria) this;
        }

        public Criteria andStrCartaBetween(String value1, String value2) {
            addCriterion("de_carta between", value1, value2, "de_carta");
            return (Criteria) this;
        }

        public Criteria andStrCartaNotBetween(String value1, String value2) {
            addCriterion("de_carta not between", value1, value2, "de_carta");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNmDistLike(String value) {
            addCriterion("upper(de_nm_dist) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_nm_dist");
            return (Criteria) this;
        }

        public Criteria andStrNmDistNotLike(String value) {
            addCriterion("de_nm_dist not like", "%" + CadenaUtil.getStr(value) + "%", "de_nm_dist");
            return (Criteria) this;
        }
			
        public Criteria andStrNmDistEqualTo(String value) {
            addCriterion("de_nm_dist =", CadenaUtil.getStr(value), "de_nm_dist");
            return (Criteria) this;
        }

        public Criteria andStrNmDistNotEqualTo(String value) {
            addCriterion("de_nm_dist <>", CadenaUtil.getStr(value), "de_nm_dist");
            return (Criteria) this;
        }

        
        public Criteria andStrNmDistIsNull() {
            addCriterion("de_nm_dist is null");
            return (Criteria) this;
        }

        public Criteria andStrNmDistIsNotNull() {
            addCriterion("de_nm_dist is not null");
            return (Criteria) this;
        }

        public Criteria andStrNmDistGreaterThan(String value) {
            addCriterion("de_nm_dist >", value, "de_nm_dist");
            return (Criteria) this;
        }

        public Criteria andStrNmDistGreaterThanOrEqualTo(String value) {
            addCriterion("de_nm_dist >=", value, "de_nm_dist");
            return (Criteria) this;
        }

        public Criteria andStrNmDistLessThan(String value) {
            addCriterion("de_nm_dist <", value, "de_nm_dist");
            return (Criteria) this;
        }

        public Criteria andStrNmDistLessThanOrEqualTo(String value) {
            addCriterion("de_nm_dist <=", value, "de_nm_dist");
            return (Criteria) this;
        }

        public Criteria andStrNmDistIn(List<String> values) {
            addCriterion("de_nm_dist in", values, "de_nm_dist");
            return (Criteria) this;
        }

        public Criteria andStrNmDistNotIn(List<String> values) {
            addCriterion("de_nm_dist not in", values, "de_nm_dist");
            return (Criteria) this;
        }

        public Criteria andStrNmDistBetween(String value1, String value2) {
            addCriterion("de_nm_dist between", value1, value2, "de_nm_dist");
            return (Criteria) this;
        }

        public Criteria andStrNmDistNotBetween(String value1, String value2) {
            addCriterion("de_nm_dist not between", value1, value2, "de_nm_dist");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNmProvLike(String value) {
            addCriterion("upper(de_nm_prov) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_nm_prov");
            return (Criteria) this;
        }

        public Criteria andStrNmProvNotLike(String value) {
            addCriterion("de_nm_prov not like", "%" + CadenaUtil.getStr(value) + "%", "de_nm_prov");
            return (Criteria) this;
        }
			
        public Criteria andStrNmProvEqualTo(String value) {
            addCriterion("de_nm_prov =", CadenaUtil.getStr(value), "de_nm_prov");
            return (Criteria) this;
        }

        public Criteria andStrNmProvNotEqualTo(String value) {
            addCriterion("de_nm_prov <>", CadenaUtil.getStr(value), "de_nm_prov");
            return (Criteria) this;
        }

        
        public Criteria andStrNmProvIsNull() {
            addCriterion("de_nm_prov is null");
            return (Criteria) this;
        }

        public Criteria andStrNmProvIsNotNull() {
            addCriterion("de_nm_prov is not null");
            return (Criteria) this;
        }

        public Criteria andStrNmProvGreaterThan(String value) {
            addCriterion("de_nm_prov >", value, "de_nm_prov");
            return (Criteria) this;
        }

        public Criteria andStrNmProvGreaterThanOrEqualTo(String value) {
            addCriterion("de_nm_prov >=", value, "de_nm_prov");
            return (Criteria) this;
        }

        public Criteria andStrNmProvLessThan(String value) {
            addCriterion("de_nm_prov <", value, "de_nm_prov");
            return (Criteria) this;
        }

        public Criteria andStrNmProvLessThanOrEqualTo(String value) {
            addCriterion("de_nm_prov <=", value, "de_nm_prov");
            return (Criteria) this;
        }

        public Criteria andStrNmProvIn(List<String> values) {
            addCriterion("de_nm_prov in", values, "de_nm_prov");
            return (Criteria) this;
        }

        public Criteria andStrNmProvNotIn(List<String> values) {
            addCriterion("de_nm_prov not in", values, "de_nm_prov");
            return (Criteria) this;
        }

        public Criteria andStrNmProvBetween(String value1, String value2) {
            addCriterion("de_nm_prov between", value1, value2, "de_nm_prov");
            return (Criteria) this;
        }

        public Criteria andStrNmProvNotBetween(String value1, String value2) {
            addCriterion("de_nm_prov not between", value1, value2, "de_nm_prov");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNmDepaLike(String value) {
            addCriterion("upper(de_nm_depa) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_nm_depa");
            return (Criteria) this;
        }

        public Criteria andStrNmDepaNotLike(String value) {
            addCriterion("de_nm_depa not like", "%" + CadenaUtil.getStr(value) + "%", "de_nm_depa");
            return (Criteria) this;
        }
			
        public Criteria andStrNmDepaEqualTo(String value) {
            addCriterion("de_nm_depa =", CadenaUtil.getStr(value), "de_nm_depa");
            return (Criteria) this;
        }

        public Criteria andStrNmDepaNotEqualTo(String value) {
            addCriterion("de_nm_depa <>", CadenaUtil.getStr(value), "de_nm_depa");
            return (Criteria) this;
        }

        
        public Criteria andStrNmDepaIsNull() {
            addCriterion("de_nm_depa is null");
            return (Criteria) this;
        }

        public Criteria andStrNmDepaIsNotNull() {
            addCriterion("de_nm_depa is not null");
            return (Criteria) this;
        }

        public Criteria andStrNmDepaGreaterThan(String value) {
            addCriterion("de_nm_depa >", value, "de_nm_depa");
            return (Criteria) this;
        }

        public Criteria andStrNmDepaGreaterThanOrEqualTo(String value) {
            addCriterion("de_nm_depa >=", value, "de_nm_depa");
            return (Criteria) this;
        }

        public Criteria andStrNmDepaLessThan(String value) {
            addCriterion("de_nm_depa <", value, "de_nm_depa");
            return (Criteria) this;
        }

        public Criteria andStrNmDepaLessThanOrEqualTo(String value) {
            addCriterion("de_nm_depa <=", value, "de_nm_depa");
            return (Criteria) this;
        }

        public Criteria andStrNmDepaIn(List<String> values) {
            addCriterion("de_nm_depa in", values, "de_nm_depa");
            return (Criteria) this;
        }

        public Criteria andStrNmDepaNotIn(List<String> values) {
            addCriterion("de_nm_depa not in", values, "de_nm_depa");
            return (Criteria) this;
        }

        public Criteria andStrNmDepaBetween(String value1, String value2) {
            addCriterion("de_nm_depa between", value1, value2, "de_nm_depa");
            return (Criteria) this;
        }

        public Criteria andStrNmDepaNotBetween(String value1, String value2) {
            addCriterion("de_nm_depa not between", value1, value2, "de_nm_depa");
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
