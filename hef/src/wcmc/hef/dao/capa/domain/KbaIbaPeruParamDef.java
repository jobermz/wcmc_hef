package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class KbaIbaPeruParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KbaIbaPeruParamDef() {
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
        
        
        public Criteria andIntSitrecidEqualTo(Integer value) {
            addCriterion("cd_sitrecid =", value, "cd_sitrecid");
            return (Criteria) this;
        }

        public Criteria andIntSitrecidNotEqualTo(Integer value) {
            addCriterion("cd_sitrecid <>", value, "cd_sitrecid");
            return (Criteria) this;
        }
        
        
        public Criteria andIntSitrecidIsNull() {
            addCriterion("cd_sitrecid is null");
            return (Criteria) this;
        }

        public Criteria andIntSitrecidIsNotNull() {
            addCriterion("cd_sitrecid is not null");
            return (Criteria) this;
        }

        public Criteria andIntSitrecidGreaterThan(Integer value) {
            addCriterion("cd_sitrecid >", value, "cd_sitrecid");
            return (Criteria) this;
        }

        public Criteria andIntSitrecidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_sitrecid >=", value, "cd_sitrecid");
            return (Criteria) this;
        }

        public Criteria andIntSitrecidLessThan(Integer value) {
            addCriterion("cd_sitrecid <", value, "cd_sitrecid");
            return (Criteria) this;
        }

        public Criteria andIntSitrecidLessThanOrEqualTo(Integer value) {
            addCriterion("cd_sitrecid <=", value, "cd_sitrecid");
            return (Criteria) this;
        }

        public Criteria andIntSitrecidIn(List<Integer> values) {
            addCriterion("cd_sitrecid in", values, "cd_sitrecid");
            return (Criteria) this;
        }

        public Criteria andIntSitrecidNotIn(List<Integer> values) {
            addCriterion("cd_sitrecid not in", values, "cd_sitrecid");
            return (Criteria) this;
        }

        public Criteria andIntSitrecidBetween(Integer value1, Integer value2) {
            addCriterion("cd_sitrecid between", value1, value2, "cd_sitrecid");
            return (Criteria) this;
        }

        public Criteria andIntSitrecidNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_sitrecid not between", value1, value2, "cd_sitrecid");
            return (Criteria) this;
        }
        
        
        public Criteria andStrRegionLike(String value) {
            addCriterion("upper(de_region) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionNotLike(String value) {
            addCriterion("de_region not like", "%" + CadenaUtil.getStr(value) + "%", "de_region");
            return (Criteria) this;
        }
			
        public Criteria andStrRegionEqualTo(String value) {
            addCriterion("de_region =", CadenaUtil.getStr(value), "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionNotEqualTo(String value) {
            addCriterion("de_region <>", CadenaUtil.getStr(value), "de_region");
            return (Criteria) this;
        }

        
        public Criteria andStrRegionIsNull() {
            addCriterion("de_region is null");
            return (Criteria) this;
        }

        public Criteria andStrRegionIsNotNull() {
            addCriterion("de_region is not null");
            return (Criteria) this;
        }

        public Criteria andStrRegionGreaterThan(String value) {
            addCriterion("de_region >", value, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionGreaterThanOrEqualTo(String value) {
            addCriterion("de_region >=", value, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionLessThan(String value) {
            addCriterion("de_region <", value, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionLessThanOrEqualTo(String value) {
            addCriterion("de_region <=", value, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionIn(List<String> values) {
            addCriterion("de_region in", values, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionNotIn(List<String> values) {
            addCriterion("de_region not in", values, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionBetween(String value1, String value2) {
            addCriterion("de_region between", value1, value2, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionNotBetween(String value1, String value2) {
            addCriterion("de_region not between", value1, value2, "de_region");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCountryLike(String value) {
            addCriterion("upper(de_country) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_country");
            return (Criteria) this;
        }

        public Criteria andStrCountryNotLike(String value) {
            addCriterion("de_country not like", "%" + CadenaUtil.getStr(value) + "%", "de_country");
            return (Criteria) this;
        }
			
        public Criteria andStrCountryEqualTo(String value) {
            addCriterion("de_country =", CadenaUtil.getStr(value), "de_country");
            return (Criteria) this;
        }

        public Criteria andStrCountryNotEqualTo(String value) {
            addCriterion("de_country <>", CadenaUtil.getStr(value), "de_country");
            return (Criteria) this;
        }

        
        public Criteria andStrCountryIsNull() {
            addCriterion("de_country is null");
            return (Criteria) this;
        }

        public Criteria andStrCountryIsNotNull() {
            addCriterion("de_country is not null");
            return (Criteria) this;
        }

        public Criteria andStrCountryGreaterThan(String value) {
            addCriterion("de_country >", value, "de_country");
            return (Criteria) this;
        }

        public Criteria andStrCountryGreaterThanOrEqualTo(String value) {
            addCriterion("de_country >=", value, "de_country");
            return (Criteria) this;
        }

        public Criteria andStrCountryLessThan(String value) {
            addCriterion("de_country <", value, "de_country");
            return (Criteria) this;
        }

        public Criteria andStrCountryLessThanOrEqualTo(String value) {
            addCriterion("de_country <=", value, "de_country");
            return (Criteria) this;
        }

        public Criteria andStrCountryIn(List<String> values) {
            addCriterion("de_country in", values, "de_country");
            return (Criteria) this;
        }

        public Criteria andStrCountryNotIn(List<String> values) {
            addCriterion("de_country not in", values, "de_country");
            return (Criteria) this;
        }

        public Criteria andStrCountryBetween(String value1, String value2) {
            addCriterion("de_country between", value1, value2, "de_country");
            return (Criteria) this;
        }

        public Criteria andStrCountryNotBetween(String value1, String value2) {
            addCriterion("de_country not between", value1, value2, "de_country");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIso3Like(String value) {
            addCriterion("upper(de_iso3) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_iso3");
            return (Criteria) this;
        }

        public Criteria andStrIso3NotLike(String value) {
            addCriterion("de_iso3 not like", "%" + CadenaUtil.getStr(value) + "%", "de_iso3");
            return (Criteria) this;
        }
			
        public Criteria andStrIso3EqualTo(String value) {
            addCriterion("de_iso3 =", CadenaUtil.getStr(value), "de_iso3");
            return (Criteria) this;
        }

        public Criteria andStrIso3NotEqualTo(String value) {
            addCriterion("de_iso3 <>", CadenaUtil.getStr(value), "de_iso3");
            return (Criteria) this;
        }

        
        public Criteria andStrIso3IsNull() {
            addCriterion("de_iso3 is null");
            return (Criteria) this;
        }

        public Criteria andStrIso3IsNotNull() {
            addCriterion("de_iso3 is not null");
            return (Criteria) this;
        }

        public Criteria andStrIso3GreaterThan(String value) {
            addCriterion("de_iso3 >", value, "de_iso3");
            return (Criteria) this;
        }

        public Criteria andStrIso3GreaterThanOrEqualTo(String value) {
            addCriterion("de_iso3 >=", value, "de_iso3");
            return (Criteria) this;
        }

        public Criteria andStrIso3LessThan(String value) {
            addCriterion("de_iso3 <", value, "de_iso3");
            return (Criteria) this;
        }

        public Criteria andStrIso3LessThanOrEqualTo(String value) {
            addCriterion("de_iso3 <=", value, "de_iso3");
            return (Criteria) this;
        }

        public Criteria andStrIso3In(List<String> values) {
            addCriterion("de_iso3 in", values, "de_iso3");
            return (Criteria) this;
        }

        public Criteria andStrIso3NotIn(List<String> values) {
            addCriterion("de_iso3 not in", values, "de_iso3");
            return (Criteria) this;
        }

        public Criteria andStrIso3Between(String value1, String value2) {
            addCriterion("de_iso3 between", value1, value2, "de_iso3");
            return (Criteria) this;
        }

        public Criteria andStrIso3NotBetween(String value1, String value2) {
            addCriterion("de_iso3 not between", value1, value2, "de_iso3");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNatnameLike(String value) {
            addCriterion("upper(de_natname) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_natname");
            return (Criteria) this;
        }

        public Criteria andStrNatnameNotLike(String value) {
            addCriterion("de_natname not like", "%" + CadenaUtil.getStr(value) + "%", "de_natname");
            return (Criteria) this;
        }
			
        public Criteria andStrNatnameEqualTo(String value) {
            addCriterion("de_natname =", CadenaUtil.getStr(value), "de_natname");
            return (Criteria) this;
        }

        public Criteria andStrNatnameNotEqualTo(String value) {
            addCriterion("de_natname <>", CadenaUtil.getStr(value), "de_natname");
            return (Criteria) this;
        }

        
        public Criteria andStrNatnameIsNull() {
            addCriterion("de_natname is null");
            return (Criteria) this;
        }

        public Criteria andStrNatnameIsNotNull() {
            addCriterion("de_natname is not null");
            return (Criteria) this;
        }

        public Criteria andStrNatnameGreaterThan(String value) {
            addCriterion("de_natname >", value, "de_natname");
            return (Criteria) this;
        }

        public Criteria andStrNatnameGreaterThanOrEqualTo(String value) {
            addCriterion("de_natname >=", value, "de_natname");
            return (Criteria) this;
        }

        public Criteria andStrNatnameLessThan(String value) {
            addCriterion("de_natname <", value, "de_natname");
            return (Criteria) this;
        }

        public Criteria andStrNatnameLessThanOrEqualTo(String value) {
            addCriterion("de_natname <=", value, "de_natname");
            return (Criteria) this;
        }

        public Criteria andStrNatnameIn(List<String> values) {
            addCriterion("de_natname in", values, "de_natname");
            return (Criteria) this;
        }

        public Criteria andStrNatnameNotIn(List<String> values) {
            addCriterion("de_natname not in", values, "de_natname");
            return (Criteria) this;
        }

        public Criteria andStrNatnameBetween(String value1, String value2) {
            addCriterion("de_natname between", value1, value2, "de_natname");
            return (Criteria) this;
        }

        public Criteria andStrNatnameNotBetween(String value1, String value2) {
            addCriterion("de_natname not between", value1, value2, "de_natname");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIntnameLike(String value) {
            addCriterion("upper(de_intname) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_intname");
            return (Criteria) this;
        }

        public Criteria andStrIntnameNotLike(String value) {
            addCriterion("de_intname not like", "%" + CadenaUtil.getStr(value) + "%", "de_intname");
            return (Criteria) this;
        }
			
        public Criteria andStrIntnameEqualTo(String value) {
            addCriterion("de_intname =", CadenaUtil.getStr(value), "de_intname");
            return (Criteria) this;
        }

        public Criteria andStrIntnameNotEqualTo(String value) {
            addCriterion("de_intname <>", CadenaUtil.getStr(value), "de_intname");
            return (Criteria) this;
        }

        
        public Criteria andStrIntnameIsNull() {
            addCriterion("de_intname is null");
            return (Criteria) this;
        }

        public Criteria andStrIntnameIsNotNull() {
            addCriterion("de_intname is not null");
            return (Criteria) this;
        }

        public Criteria andStrIntnameGreaterThan(String value) {
            addCriterion("de_intname >", value, "de_intname");
            return (Criteria) this;
        }

        public Criteria andStrIntnameGreaterThanOrEqualTo(String value) {
            addCriterion("de_intname >=", value, "de_intname");
            return (Criteria) this;
        }

        public Criteria andStrIntnameLessThan(String value) {
            addCriterion("de_intname <", value, "de_intname");
            return (Criteria) this;
        }

        public Criteria andStrIntnameLessThanOrEqualTo(String value) {
            addCriterion("de_intname <=", value, "de_intname");
            return (Criteria) this;
        }

        public Criteria andStrIntnameIn(List<String> values) {
            addCriterion("de_intname in", values, "de_intname");
            return (Criteria) this;
        }

        public Criteria andStrIntnameNotIn(List<String> values) {
            addCriterion("de_intname not in", values, "de_intname");
            return (Criteria) this;
        }

        public Criteria andStrIntnameBetween(String value1, String value2) {
            addCriterion("de_intname between", value1, value2, "de_intname");
            return (Criteria) this;
        }

        public Criteria andStrIntnameNotBetween(String value1, String value2) {
            addCriterion("de_intname not between", value1, value2, "de_intname");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFincodeLike(String value) {
            addCriterion("upper(de_fincode) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_fincode");
            return (Criteria) this;
        }

        public Criteria andStrFincodeNotLike(String value) {
            addCriterion("de_fincode not like", "%" + CadenaUtil.getStr(value) + "%", "de_fincode");
            return (Criteria) this;
        }
			
        public Criteria andStrFincodeEqualTo(String value) {
            addCriterion("de_fincode =", CadenaUtil.getStr(value), "de_fincode");
            return (Criteria) this;
        }

        public Criteria andStrFincodeNotEqualTo(String value) {
            addCriterion("de_fincode <>", CadenaUtil.getStr(value), "de_fincode");
            return (Criteria) this;
        }

        
        public Criteria andStrFincodeIsNull() {
            addCriterion("de_fincode is null");
            return (Criteria) this;
        }

        public Criteria andStrFincodeIsNotNull() {
            addCriterion("de_fincode is not null");
            return (Criteria) this;
        }

        public Criteria andStrFincodeGreaterThan(String value) {
            addCriterion("de_fincode >", value, "de_fincode");
            return (Criteria) this;
        }

        public Criteria andStrFincodeGreaterThanOrEqualTo(String value) {
            addCriterion("de_fincode >=", value, "de_fincode");
            return (Criteria) this;
        }

        public Criteria andStrFincodeLessThan(String value) {
            addCriterion("de_fincode <", value, "de_fincode");
            return (Criteria) this;
        }

        public Criteria andStrFincodeLessThanOrEqualTo(String value) {
            addCriterion("de_fincode <=", value, "de_fincode");
            return (Criteria) this;
        }

        public Criteria andStrFincodeIn(List<String> values) {
            addCriterion("de_fincode in", values, "de_fincode");
            return (Criteria) this;
        }

        public Criteria andStrFincodeNotIn(List<String> values) {
            addCriterion("de_fincode not in", values, "de_fincode");
            return (Criteria) this;
        }

        public Criteria andStrFincodeBetween(String value1, String value2) {
            addCriterion("de_fincode between", value1, value2, "de_fincode");
            return (Criteria) this;
        }

        public Criteria andStrFincodeNotBetween(String value1, String value2) {
            addCriterion("de_fincode not between", value1, value2, "de_fincode");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSitlatEqualTo(Double value) {
            addCriterion("ha_sitlat =", value, "ha_sitlat");
            return (Criteria) this;
        }

        public Criteria andDblSitlatNotEqualTo(Double value) {
            addCriterion("ha_sitlat <>", value, "ha_sitlat");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSitlatIsNull() {
            addCriterion("ha_sitlat is null");
            return (Criteria) this;
        }

        public Criteria andDblSitlatIsNotNull() {
            addCriterion("ha_sitlat is not null");
            return (Criteria) this;
        }

        public Criteria andDblSitlatGreaterThan(Double value) {
            addCriterion("ha_sitlat >", value, "ha_sitlat");
            return (Criteria) this;
        }

        public Criteria andDblSitlatGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_sitlat >=", value, "ha_sitlat");
            return (Criteria) this;
        }

        public Criteria andDblSitlatLessThan(Double value) {
            addCriterion("ha_sitlat <", value, "ha_sitlat");
            return (Criteria) this;
        }

        public Criteria andDblSitlatLessThanOrEqualTo(Double value) {
            addCriterion("ha_sitlat <=", value, "ha_sitlat");
            return (Criteria) this;
        }

        public Criteria andDblSitlatIn(List<Double> values) {
            addCriterion("ha_sitlat in", values, "ha_sitlat");
            return (Criteria) this;
        }

        public Criteria andDblSitlatNotIn(List<Double> values) {
            addCriterion("ha_sitlat not in", values, "ha_sitlat");
            return (Criteria) this;
        }

        public Criteria andDblSitlatBetween(Double value1, Double value2) {
            addCriterion("ha_sitlat between", value1, value2, "ha_sitlat");
            return (Criteria) this;
        }

        public Criteria andDblSitlatNotBetween(Double value1, Double value2) {
            addCriterion("ha_sitlat not between", value1, value2, "ha_sitlat");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSitlongEqualTo(Double value) {
            addCriterion("ha_sitlong =", value, "ha_sitlong");
            return (Criteria) this;
        }

        public Criteria andDblSitlongNotEqualTo(Double value) {
            addCriterion("ha_sitlong <>", value, "ha_sitlong");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSitlongIsNull() {
            addCriterion("ha_sitlong is null");
            return (Criteria) this;
        }

        public Criteria andDblSitlongIsNotNull() {
            addCriterion("ha_sitlong is not null");
            return (Criteria) this;
        }

        public Criteria andDblSitlongGreaterThan(Double value) {
            addCriterion("ha_sitlong >", value, "ha_sitlong");
            return (Criteria) this;
        }

        public Criteria andDblSitlongGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_sitlong >=", value, "ha_sitlong");
            return (Criteria) this;
        }

        public Criteria andDblSitlongLessThan(Double value) {
            addCriterion("ha_sitlong <", value, "ha_sitlong");
            return (Criteria) this;
        }

        public Criteria andDblSitlongLessThanOrEqualTo(Double value) {
            addCriterion("ha_sitlong <=", value, "ha_sitlong");
            return (Criteria) this;
        }

        public Criteria andDblSitlongIn(List<Double> values) {
            addCriterion("ha_sitlong in", values, "ha_sitlong");
            return (Criteria) this;
        }

        public Criteria andDblSitlongNotIn(List<Double> values) {
            addCriterion("ha_sitlong not in", values, "ha_sitlong");
            return (Criteria) this;
        }

        public Criteria andDblSitlongBetween(Double value1, Double value2) {
            addCriterion("ha_sitlong between", value1, value2, "ha_sitlong");
            return (Criteria) this;
        }

        public Criteria andDblSitlongNotBetween(Double value1, Double value2) {
            addCriterion("ha_sitlong not between", value1, value2, "ha_sitlong");
            return (Criteria) this;
        }
        
        
        public Criteria andIntSitareaEqualTo(Integer value) {
            addCriterion("cd_sitarea =", value, "cd_sitarea");
            return (Criteria) this;
        }

        public Criteria andIntSitareaNotEqualTo(Integer value) {
            addCriterion("cd_sitarea <>", value, "cd_sitarea");
            return (Criteria) this;
        }
        
        
        public Criteria andIntSitareaIsNull() {
            addCriterion("cd_sitarea is null");
            return (Criteria) this;
        }

        public Criteria andIntSitareaIsNotNull() {
            addCriterion("cd_sitarea is not null");
            return (Criteria) this;
        }

        public Criteria andIntSitareaGreaterThan(Integer value) {
            addCriterion("cd_sitarea >", value, "cd_sitarea");
            return (Criteria) this;
        }

        public Criteria andIntSitareaGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_sitarea >=", value, "cd_sitarea");
            return (Criteria) this;
        }

        public Criteria andIntSitareaLessThan(Integer value) {
            addCriterion("cd_sitarea <", value, "cd_sitarea");
            return (Criteria) this;
        }

        public Criteria andIntSitareaLessThanOrEqualTo(Integer value) {
            addCriterion("cd_sitarea <=", value, "cd_sitarea");
            return (Criteria) this;
        }

        public Criteria andIntSitareaIn(List<Integer> values) {
            addCriterion("cd_sitarea in", values, "cd_sitarea");
            return (Criteria) this;
        }

        public Criteria andIntSitareaNotIn(List<Integer> values) {
            addCriterion("cd_sitarea not in", values, "cd_sitarea");
            return (Criteria) this;
        }

        public Criteria andIntSitareaBetween(Integer value1, Integer value2) {
            addCriterion("cd_sitarea between", value1, value2, "cd_sitarea");
            return (Criteria) this;
        }

        public Criteria andIntSitareaNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_sitarea not between", value1, value2, "cd_sitarea");
            return (Criteria) this;
        }
        
        
        public Criteria andStrProtectLike(String value) {
            addCriterion("upper(de_protect) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_protect");
            return (Criteria) this;
        }

        public Criteria andStrProtectNotLike(String value) {
            addCriterion("de_protect not like", "%" + CadenaUtil.getStr(value) + "%", "de_protect");
            return (Criteria) this;
        }
			
        public Criteria andStrProtectEqualTo(String value) {
            addCriterion("de_protect =", CadenaUtil.getStr(value), "de_protect");
            return (Criteria) this;
        }

        public Criteria andStrProtectNotEqualTo(String value) {
            addCriterion("de_protect <>", CadenaUtil.getStr(value), "de_protect");
            return (Criteria) this;
        }

        
        public Criteria andStrProtectIsNull() {
            addCriterion("de_protect is null");
            return (Criteria) this;
        }

        public Criteria andStrProtectIsNotNull() {
            addCriterion("de_protect is not null");
            return (Criteria) this;
        }

        public Criteria andStrProtectGreaterThan(String value) {
            addCriterion("de_protect >", value, "de_protect");
            return (Criteria) this;
        }

        public Criteria andStrProtectGreaterThanOrEqualTo(String value) {
            addCriterion("de_protect >=", value, "de_protect");
            return (Criteria) this;
        }

        public Criteria andStrProtectLessThan(String value) {
            addCriterion("de_protect <", value, "de_protect");
            return (Criteria) this;
        }

        public Criteria andStrProtectLessThanOrEqualTo(String value) {
            addCriterion("de_protect <=", value, "de_protect");
            return (Criteria) this;
        }

        public Criteria andStrProtectIn(List<String> values) {
            addCriterion("de_protect in", values, "de_protect");
            return (Criteria) this;
        }

        public Criteria andStrProtectNotIn(List<String> values) {
            addCriterion("de_protect not in", values, "de_protect");
            return (Criteria) this;
        }

        public Criteria andStrProtectBetween(String value1, String value2) {
            addCriterion("de_protect between", value1, value2, "de_protect");
            return (Criteria) this;
        }

        public Criteria andStrProtectNotBetween(String value1, String value2) {
            addCriterion("de_protect not between", value1, value2, "de_protect");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumPasEqualTo(Integer value) {
            addCriterion("cd_num_pas =", value, "cd_num_pas");
            return (Criteria) this;
        }

        public Criteria andIntNumPasNotEqualTo(Integer value) {
            addCriterion("cd_num_pas <>", value, "cd_num_pas");
            return (Criteria) this;
        }
        
        
        public Criteria andIntNumPasIsNull() {
            addCriterion("cd_num_pas is null");
            return (Criteria) this;
        }

        public Criteria andIntNumPasIsNotNull() {
            addCriterion("cd_num_pas is not null");
            return (Criteria) this;
        }

        public Criteria andIntNumPasGreaterThan(Integer value) {
            addCriterion("cd_num_pas >", value, "cd_num_pas");
            return (Criteria) this;
        }

        public Criteria andIntNumPasGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_num_pas >=", value, "cd_num_pas");
            return (Criteria) this;
        }

        public Criteria andIntNumPasLessThan(Integer value) {
            addCriterion("cd_num_pas <", value, "cd_num_pas");
            return (Criteria) this;
        }

        public Criteria andIntNumPasLessThanOrEqualTo(Integer value) {
            addCriterion("cd_num_pas <=", value, "cd_num_pas");
            return (Criteria) this;
        }

        public Criteria andIntNumPasIn(List<Integer> values) {
            addCriterion("cd_num_pas in", values, "cd_num_pas");
            return (Criteria) this;
        }

        public Criteria andIntNumPasNotIn(List<Integer> values) {
            addCriterion("cd_num_pas not in", values, "cd_num_pas");
            return (Criteria) this;
        }

        public Criteria andIntNumPasBetween(Integer value1, Integer value2) {
            addCriterion("cd_num_pas between", value1, value2, "cd_num_pas");
            return (Criteria) this;
        }

        public Criteria andIntNumPasNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_num_pas not between", value1, value2, "cd_num_pas");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIbastatusLike(String value) {
            addCriterion("upper(de_ibastatus) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_ibastatus");
            return (Criteria) this;
        }

        public Criteria andStrIbastatusNotLike(String value) {
            addCriterion("de_ibastatus not like", "%" + CadenaUtil.getStr(value) + "%", "de_ibastatus");
            return (Criteria) this;
        }
			
        public Criteria andStrIbastatusEqualTo(String value) {
            addCriterion("de_ibastatus =", CadenaUtil.getStr(value), "de_ibastatus");
            return (Criteria) this;
        }

        public Criteria andStrIbastatusNotEqualTo(String value) {
            addCriterion("de_ibastatus <>", CadenaUtil.getStr(value), "de_ibastatus");
            return (Criteria) this;
        }

        
        public Criteria andStrIbastatusIsNull() {
            addCriterion("de_ibastatus is null");
            return (Criteria) this;
        }

        public Criteria andStrIbastatusIsNotNull() {
            addCriterion("de_ibastatus is not null");
            return (Criteria) this;
        }

        public Criteria andStrIbastatusGreaterThan(String value) {
            addCriterion("de_ibastatus >", value, "de_ibastatus");
            return (Criteria) this;
        }

        public Criteria andStrIbastatusGreaterThanOrEqualTo(String value) {
            addCriterion("de_ibastatus >=", value, "de_ibastatus");
            return (Criteria) this;
        }

        public Criteria andStrIbastatusLessThan(String value) {
            addCriterion("de_ibastatus <", value, "de_ibastatus");
            return (Criteria) this;
        }

        public Criteria andStrIbastatusLessThanOrEqualTo(String value) {
            addCriterion("de_ibastatus <=", value, "de_ibastatus");
            return (Criteria) this;
        }

        public Criteria andStrIbastatusIn(List<String> values) {
            addCriterion("de_ibastatus in", values, "de_ibastatus");
            return (Criteria) this;
        }

        public Criteria andStrIbastatusNotIn(List<String> values) {
            addCriterion("de_ibastatus not in", values, "de_ibastatus");
            return (Criteria) this;
        }

        public Criteria andStrIbastatusBetween(String value1, String value2) {
            addCriterion("de_ibastatus between", value1, value2, "de_ibastatus");
            return (Criteria) this;
        }

        public Criteria andStrIbastatusNotBetween(String value1, String value2) {
            addCriterion("de_ibastatus not between", value1, value2, "de_ibastatus");
            return (Criteria) this;
        }
        
        
        public Criteria andStrKbastatusLike(String value) {
            addCriterion("upper(de_kbastatus) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_kbastatus");
            return (Criteria) this;
        }

        public Criteria andStrKbastatusNotLike(String value) {
            addCriterion("de_kbastatus not like", "%" + CadenaUtil.getStr(value) + "%", "de_kbastatus");
            return (Criteria) this;
        }
			
        public Criteria andStrKbastatusEqualTo(String value) {
            addCriterion("de_kbastatus =", CadenaUtil.getStr(value), "de_kbastatus");
            return (Criteria) this;
        }

        public Criteria andStrKbastatusNotEqualTo(String value) {
            addCriterion("de_kbastatus <>", CadenaUtil.getStr(value), "de_kbastatus");
            return (Criteria) this;
        }

        
        public Criteria andStrKbastatusIsNull() {
            addCriterion("de_kbastatus is null");
            return (Criteria) this;
        }

        public Criteria andStrKbastatusIsNotNull() {
            addCriterion("de_kbastatus is not null");
            return (Criteria) this;
        }

        public Criteria andStrKbastatusGreaterThan(String value) {
            addCriterion("de_kbastatus >", value, "de_kbastatus");
            return (Criteria) this;
        }

        public Criteria andStrKbastatusGreaterThanOrEqualTo(String value) {
            addCriterion("de_kbastatus >=", value, "de_kbastatus");
            return (Criteria) this;
        }

        public Criteria andStrKbastatusLessThan(String value) {
            addCriterion("de_kbastatus <", value, "de_kbastatus");
            return (Criteria) this;
        }

        public Criteria andStrKbastatusLessThanOrEqualTo(String value) {
            addCriterion("de_kbastatus <=", value, "de_kbastatus");
            return (Criteria) this;
        }

        public Criteria andStrKbastatusIn(List<String> values) {
            addCriterion("de_kbastatus in", values, "de_kbastatus");
            return (Criteria) this;
        }

        public Criteria andStrKbastatusNotIn(List<String> values) {
            addCriterion("de_kbastatus not in", values, "de_kbastatus");
            return (Criteria) this;
        }

        public Criteria andStrKbastatusBetween(String value1, String value2) {
            addCriterion("de_kbastatus between", value1, value2, "de_kbastatus");
            return (Criteria) this;
        }

        public Criteria andStrKbastatusNotBetween(String value1, String value2) {
            addCriterion("de_kbastatus not between", value1, value2, "de_kbastatus");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAzestatusLike(String value) {
            addCriterion("upper(de_azestatus) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_azestatus");
            return (Criteria) this;
        }

        public Criteria andStrAzestatusNotLike(String value) {
            addCriterion("de_azestatus not like", "%" + CadenaUtil.getStr(value) + "%", "de_azestatus");
            return (Criteria) this;
        }
			
        public Criteria andStrAzestatusEqualTo(String value) {
            addCriterion("de_azestatus =", CadenaUtil.getStr(value), "de_azestatus");
            return (Criteria) this;
        }

        public Criteria andStrAzestatusNotEqualTo(String value) {
            addCriterion("de_azestatus <>", CadenaUtil.getStr(value), "de_azestatus");
            return (Criteria) this;
        }

        
        public Criteria andStrAzestatusIsNull() {
            addCriterion("de_azestatus is null");
            return (Criteria) this;
        }

        public Criteria andStrAzestatusIsNotNull() {
            addCriterion("de_azestatus is not null");
            return (Criteria) this;
        }

        public Criteria andStrAzestatusGreaterThan(String value) {
            addCriterion("de_azestatus >", value, "de_azestatus");
            return (Criteria) this;
        }

        public Criteria andStrAzestatusGreaterThanOrEqualTo(String value) {
            addCriterion("de_azestatus >=", value, "de_azestatus");
            return (Criteria) this;
        }

        public Criteria andStrAzestatusLessThan(String value) {
            addCriterion("de_azestatus <", value, "de_azestatus");
            return (Criteria) this;
        }

        public Criteria andStrAzestatusLessThanOrEqualTo(String value) {
            addCriterion("de_azestatus <=", value, "de_azestatus");
            return (Criteria) this;
        }

        public Criteria andStrAzestatusIn(List<String> values) {
            addCriterion("de_azestatus in", values, "de_azestatus");
            return (Criteria) this;
        }

        public Criteria andStrAzestatusNotIn(List<String> values) {
            addCriterion("de_azestatus not in", values, "de_azestatus");
            return (Criteria) this;
        }

        public Criteria andStrAzestatusBetween(String value1, String value2) {
            addCriterion("de_azestatus between", value1, value2, "de_azestatus");
            return (Criteria) this;
        }

        public Criteria andStrAzestatusNotBetween(String value1, String value2) {
            addCriterion("de_azestatus not between", value1, value2, "de_azestatus");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCreatedbyLike(String value) {
            addCriterion("upper(de_createdby) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_createdby");
            return (Criteria) this;
        }

        public Criteria andStrCreatedbyNotLike(String value) {
            addCriterion("de_createdby not like", "%" + CadenaUtil.getStr(value) + "%", "de_createdby");
            return (Criteria) this;
        }
			
        public Criteria andStrCreatedbyEqualTo(String value) {
            addCriterion("de_createdby =", CadenaUtil.getStr(value), "de_createdby");
            return (Criteria) this;
        }

        public Criteria andStrCreatedbyNotEqualTo(String value) {
            addCriterion("de_createdby <>", CadenaUtil.getStr(value), "de_createdby");
            return (Criteria) this;
        }

        
        public Criteria andStrCreatedbyIsNull() {
            addCriterion("de_createdby is null");
            return (Criteria) this;
        }

        public Criteria andStrCreatedbyIsNotNull() {
            addCriterion("de_createdby is not null");
            return (Criteria) this;
        }

        public Criteria andStrCreatedbyGreaterThan(String value) {
            addCriterion("de_createdby >", value, "de_createdby");
            return (Criteria) this;
        }

        public Criteria andStrCreatedbyGreaterThanOrEqualTo(String value) {
            addCriterion("de_createdby >=", value, "de_createdby");
            return (Criteria) this;
        }

        public Criteria andStrCreatedbyLessThan(String value) {
            addCriterion("de_createdby <", value, "de_createdby");
            return (Criteria) this;
        }

        public Criteria andStrCreatedbyLessThanOrEqualTo(String value) {
            addCriterion("de_createdby <=", value, "de_createdby");
            return (Criteria) this;
        }

        public Criteria andStrCreatedbyIn(List<String> values) {
            addCriterion("de_createdby in", values, "de_createdby");
            return (Criteria) this;
        }

        public Criteria andStrCreatedbyNotIn(List<String> values) {
            addCriterion("de_createdby not in", values, "de_createdby");
            return (Criteria) this;
        }

        public Criteria andStrCreatedbyBetween(String value1, String value2) {
            addCriterion("de_createdby between", value1, value2, "de_createdby");
            return (Criteria) this;
        }

        public Criteria andStrCreatedbyNotBetween(String value1, String value2) {
            addCriterion("de_createdby not between", value1, value2, "de_createdby");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAddedbyLike(String value) {
            addCriterion("upper(de_addedby) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_addedby");
            return (Criteria) this;
        }

        public Criteria andStrAddedbyNotLike(String value) {
            addCriterion("de_addedby not like", "%" + CadenaUtil.getStr(value) + "%", "de_addedby");
            return (Criteria) this;
        }
			
        public Criteria andStrAddedbyEqualTo(String value) {
            addCriterion("de_addedby =", CadenaUtil.getStr(value), "de_addedby");
            return (Criteria) this;
        }

        public Criteria andStrAddedbyNotEqualTo(String value) {
            addCriterion("de_addedby <>", CadenaUtil.getStr(value), "de_addedby");
            return (Criteria) this;
        }

        
        public Criteria andStrAddedbyIsNull() {
            addCriterion("de_addedby is null");
            return (Criteria) this;
        }

        public Criteria andStrAddedbyIsNotNull() {
            addCriterion("de_addedby is not null");
            return (Criteria) this;
        }

        public Criteria andStrAddedbyGreaterThan(String value) {
            addCriterion("de_addedby >", value, "de_addedby");
            return (Criteria) this;
        }

        public Criteria andStrAddedbyGreaterThanOrEqualTo(String value) {
            addCriterion("de_addedby >=", value, "de_addedby");
            return (Criteria) this;
        }

        public Criteria andStrAddedbyLessThan(String value) {
            addCriterion("de_addedby <", value, "de_addedby");
            return (Criteria) this;
        }

        public Criteria andStrAddedbyLessThanOrEqualTo(String value) {
            addCriterion("de_addedby <=", value, "de_addedby");
            return (Criteria) this;
        }

        public Criteria andStrAddedbyIn(List<String> values) {
            addCriterion("de_addedby in", values, "de_addedby");
            return (Criteria) this;
        }

        public Criteria andStrAddedbyNotIn(List<String> values) {
            addCriterion("de_addedby not in", values, "de_addedby");
            return (Criteria) this;
        }

        public Criteria andStrAddedbyBetween(String value1, String value2) {
            addCriterion("de_addedby between", value1, value2, "de_addedby");
            return (Criteria) this;
        }

        public Criteria andStrAddedbyNotBetween(String value1, String value2) {
            addCriterion("de_addedby not between", value1, value2, "de_addedby");
            return (Criteria) this;
        }
        
        
        public Criteria andDteAddeddateEqualTo(Date value) {
            addCriterion("fc_addeddate =", value, "fc_addeddate");
            return (Criteria) this;
        }

        public Criteria andDteAddeddateNotEqualTo(Date value) {
            addCriterion("fc_addeddate <>", value, "fc_addeddate");
            return (Criteria) this;
        }
        
        
        public Criteria andDteAddeddateIsNull() {
            addCriterion("fc_addeddate is null");
            return (Criteria) this;
        }

        public Criteria andDteAddeddateIsNotNull() {
            addCriterion("fc_addeddate is not null");
            return (Criteria) this;
        }

        public Criteria andDteAddeddateGreaterThan(Date value) {
            addCriterion("fc_addeddate >", value, "fc_addeddate");
            return (Criteria) this;
        }

        public Criteria andDteAddeddateGreaterThanOrEqualTo(Date value) {
            addCriterion("fc_addeddate >=", value, "fc_addeddate");
            return (Criteria) this;
        }

        public Criteria andDteAddeddateLessThan(Date value) {
            addCriterion("fc_addeddate <", value, "fc_addeddate");
            return (Criteria) this;
        }

        public Criteria andDteAddeddateLessThanOrEqualTo(Date value) {
            addCriterion("fc_addeddate <=", value, "fc_addeddate");
            return (Criteria) this;
        }

        public Criteria andDteAddeddateIn(List<Date> values) {
            addCriterion("fc_addeddate in", values, "fc_addeddate");
            return (Criteria) this;
        }

        public Criteria andDteAddeddateNotIn(List<Date> values) {
            addCriterion("fc_addeddate not in", values, "fc_addeddate");
            return (Criteria) this;
        }

        public Criteria andDteAddeddateBetween(Date value1, Date value2) {
            addCriterion("fc_addeddate between", value1, value2, "fc_addeddate");
            return (Criteria) this;
        }

        public Criteria andDteAddeddateNotBetween(Date value1, Date value2) {
            addCriterion("fc_addeddate not between", value1, value2, "fc_addeddate");
            return (Criteria) this;
        }
        
        
        public Criteria andStrChangebyLike(String value) {
            addCriterion("upper(de_changeby) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_changeby");
            return (Criteria) this;
        }

        public Criteria andStrChangebyNotLike(String value) {
            addCriterion("de_changeby not like", "%" + CadenaUtil.getStr(value) + "%", "de_changeby");
            return (Criteria) this;
        }
			
        public Criteria andStrChangebyEqualTo(String value) {
            addCriterion("de_changeby =", CadenaUtil.getStr(value), "de_changeby");
            return (Criteria) this;
        }

        public Criteria andStrChangebyNotEqualTo(String value) {
            addCriterion("de_changeby <>", CadenaUtil.getStr(value), "de_changeby");
            return (Criteria) this;
        }

        
        public Criteria andStrChangebyIsNull() {
            addCriterion("de_changeby is null");
            return (Criteria) this;
        }

        public Criteria andStrChangebyIsNotNull() {
            addCriterion("de_changeby is not null");
            return (Criteria) this;
        }

        public Criteria andStrChangebyGreaterThan(String value) {
            addCriterion("de_changeby >", value, "de_changeby");
            return (Criteria) this;
        }

        public Criteria andStrChangebyGreaterThanOrEqualTo(String value) {
            addCriterion("de_changeby >=", value, "de_changeby");
            return (Criteria) this;
        }

        public Criteria andStrChangebyLessThan(String value) {
            addCriterion("de_changeby <", value, "de_changeby");
            return (Criteria) this;
        }

        public Criteria andStrChangebyLessThanOrEqualTo(String value) {
            addCriterion("de_changeby <=", value, "de_changeby");
            return (Criteria) this;
        }

        public Criteria andStrChangebyIn(List<String> values) {
            addCriterion("de_changeby in", values, "de_changeby");
            return (Criteria) this;
        }

        public Criteria andStrChangebyNotIn(List<String> values) {
            addCriterion("de_changeby not in", values, "de_changeby");
            return (Criteria) this;
        }

        public Criteria andStrChangebyBetween(String value1, String value2) {
            addCriterion("de_changeby between", value1, value2, "de_changeby");
            return (Criteria) this;
        }

        public Criteria andStrChangebyNotBetween(String value1, String value2) {
            addCriterion("de_changeby not between", value1, value2, "de_changeby");
            return (Criteria) this;
        }
        
        
        public Criteria andDteChangedateEqualTo(Date value) {
            addCriterion("fc_changedate =", value, "fc_changedate");
            return (Criteria) this;
        }

        public Criteria andDteChangedateNotEqualTo(Date value) {
            addCriterion("fc_changedate <>", value, "fc_changedate");
            return (Criteria) this;
        }
        
        
        public Criteria andDteChangedateIsNull() {
            addCriterion("fc_changedate is null");
            return (Criteria) this;
        }

        public Criteria andDteChangedateIsNotNull() {
            addCriterion("fc_changedate is not null");
            return (Criteria) this;
        }

        public Criteria andDteChangedateGreaterThan(Date value) {
            addCriterion("fc_changedate >", value, "fc_changedate");
            return (Criteria) this;
        }

        public Criteria andDteChangedateGreaterThanOrEqualTo(Date value) {
            addCriterion("fc_changedate >=", value, "fc_changedate");
            return (Criteria) this;
        }

        public Criteria andDteChangedateLessThan(Date value) {
            addCriterion("fc_changedate <", value, "fc_changedate");
            return (Criteria) this;
        }

        public Criteria andDteChangedateLessThanOrEqualTo(Date value) {
            addCriterion("fc_changedate <=", value, "fc_changedate");
            return (Criteria) this;
        }

        public Criteria andDteChangedateIn(List<Date> values) {
            addCriterion("fc_changedate in", values, "fc_changedate");
            return (Criteria) this;
        }

        public Criteria andDteChangedateNotIn(List<Date> values) {
            addCriterion("fc_changedate not in", values, "fc_changedate");
            return (Criteria) this;
        }

        public Criteria andDteChangedateBetween(Date value1, Date value2) {
            addCriterion("fc_changedate between", value1, value2, "fc_changedate");
            return (Criteria) this;
        }

        public Criteria andDteChangedateNotBetween(Date value1, Date value2) {
            addCriterion("fc_changedate not between", value1, value2, "fc_changedate");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSourceLike(String value) {
            addCriterion("upper(de_source) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_source");
            return (Criteria) this;
        }

        public Criteria andStrSourceNotLike(String value) {
            addCriterion("de_source not like", "%" + CadenaUtil.getStr(value) + "%", "de_source");
            return (Criteria) this;
        }
			
        public Criteria andStrSourceEqualTo(String value) {
            addCriterion("de_source =", CadenaUtil.getStr(value), "de_source");
            return (Criteria) this;
        }

        public Criteria andStrSourceNotEqualTo(String value) {
            addCriterion("de_source <>", CadenaUtil.getStr(value), "de_source");
            return (Criteria) this;
        }

        
        public Criteria andStrSourceIsNull() {
            addCriterion("de_source is null");
            return (Criteria) this;
        }

        public Criteria andStrSourceIsNotNull() {
            addCriterion("de_source is not null");
            return (Criteria) this;
        }

        public Criteria andStrSourceGreaterThan(String value) {
            addCriterion("de_source >", value, "de_source");
            return (Criteria) this;
        }

        public Criteria andStrSourceGreaterThanOrEqualTo(String value) {
            addCriterion("de_source >=", value, "de_source");
            return (Criteria) this;
        }

        public Criteria andStrSourceLessThan(String value) {
            addCriterion("de_source <", value, "de_source");
            return (Criteria) this;
        }

        public Criteria andStrSourceLessThanOrEqualTo(String value) {
            addCriterion("de_source <=", value, "de_source");
            return (Criteria) this;
        }

        public Criteria andStrSourceIn(List<String> values) {
            addCriterion("de_source in", values, "de_source");
            return (Criteria) this;
        }

        public Criteria andStrSourceNotIn(List<String> values) {
            addCriterion("de_source not in", values, "de_source");
            return (Criteria) this;
        }

        public Criteria andStrSourceBetween(String value1, String value2) {
            addCriterion("de_source between", value1, value2, "de_source");
            return (Criteria) this;
        }

        public Criteria andStrSourceNotBetween(String value1, String value2) {
            addCriterion("de_source not between", value1, value2, "de_source");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDeltxtLike(String value) {
            addCriterion("upper(de_deltxt) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_deltxt");
            return (Criteria) this;
        }

        public Criteria andStrDeltxtNotLike(String value) {
            addCriterion("de_deltxt not like", "%" + CadenaUtil.getStr(value) + "%", "de_deltxt");
            return (Criteria) this;
        }
			
        public Criteria andStrDeltxtEqualTo(String value) {
            addCriterion("de_deltxt =", CadenaUtil.getStr(value), "de_deltxt");
            return (Criteria) this;
        }

        public Criteria andStrDeltxtNotEqualTo(String value) {
            addCriterion("de_deltxt <>", CadenaUtil.getStr(value), "de_deltxt");
            return (Criteria) this;
        }

        
        public Criteria andStrDeltxtIsNull() {
            addCriterion("de_deltxt is null");
            return (Criteria) this;
        }

        public Criteria andStrDeltxtIsNotNull() {
            addCriterion("de_deltxt is not null");
            return (Criteria) this;
        }

        public Criteria andStrDeltxtGreaterThan(String value) {
            addCriterion("de_deltxt >", value, "de_deltxt");
            return (Criteria) this;
        }

        public Criteria andStrDeltxtGreaterThanOrEqualTo(String value) {
            addCriterion("de_deltxt >=", value, "de_deltxt");
            return (Criteria) this;
        }

        public Criteria andStrDeltxtLessThan(String value) {
            addCriterion("de_deltxt <", value, "de_deltxt");
            return (Criteria) this;
        }

        public Criteria andStrDeltxtLessThanOrEqualTo(String value) {
            addCriterion("de_deltxt <=", value, "de_deltxt");
            return (Criteria) this;
        }

        public Criteria andStrDeltxtIn(List<String> values) {
            addCriterion("de_deltxt in", values, "de_deltxt");
            return (Criteria) this;
        }

        public Criteria andStrDeltxtNotIn(List<String> values) {
            addCriterion("de_deltxt not in", values, "de_deltxt");
            return (Criteria) this;
        }

        public Criteria andStrDeltxtBetween(String value1, String value2) {
            addCriterion("de_deltxt between", value1, value2, "de_deltxt");
            return (Criteria) this;
        }

        public Criteria andStrDeltxtNotBetween(String value1, String value2) {
            addCriterion("de_deltxt not between", value1, value2, "de_deltxt");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDelgeomLike(String value) {
            addCriterion("upper(de_delgeom) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_delgeom");
            return (Criteria) this;
        }

        public Criteria andStrDelgeomNotLike(String value) {
            addCriterion("de_delgeom not like", "%" + CadenaUtil.getStr(value) + "%", "de_delgeom");
            return (Criteria) this;
        }
			
        public Criteria andStrDelgeomEqualTo(String value) {
            addCriterion("de_delgeom =", CadenaUtil.getStr(value), "de_delgeom");
            return (Criteria) this;
        }

        public Criteria andStrDelgeomNotEqualTo(String value) {
            addCriterion("de_delgeom <>", CadenaUtil.getStr(value), "de_delgeom");
            return (Criteria) this;
        }

        
        public Criteria andStrDelgeomIsNull() {
            addCriterion("de_delgeom is null");
            return (Criteria) this;
        }

        public Criteria andStrDelgeomIsNotNull() {
            addCriterion("de_delgeom is not null");
            return (Criteria) this;
        }

        public Criteria andStrDelgeomGreaterThan(String value) {
            addCriterion("de_delgeom >", value, "de_delgeom");
            return (Criteria) this;
        }

        public Criteria andStrDelgeomGreaterThanOrEqualTo(String value) {
            addCriterion("de_delgeom >=", value, "de_delgeom");
            return (Criteria) this;
        }

        public Criteria andStrDelgeomLessThan(String value) {
            addCriterion("de_delgeom <", value, "de_delgeom");
            return (Criteria) this;
        }

        public Criteria andStrDelgeomLessThanOrEqualTo(String value) {
            addCriterion("de_delgeom <=", value, "de_delgeom");
            return (Criteria) this;
        }

        public Criteria andStrDelgeomIn(List<String> values) {
            addCriterion("de_delgeom in", values, "de_delgeom");
            return (Criteria) this;
        }

        public Criteria andStrDelgeomNotIn(List<String> values) {
            addCriterion("de_delgeom not in", values, "de_delgeom");
            return (Criteria) this;
        }

        public Criteria andStrDelgeomBetween(String value1, String value2) {
            addCriterion("de_delgeom between", value1, value2, "de_delgeom");
            return (Criteria) this;
        }

        public Criteria andStrDelgeomNotBetween(String value1, String value2) {
            addCriterion("de_delgeom not between", value1, value2, "de_delgeom");
            return (Criteria) this;
        }
        
        
        public Criteria andStrMarineibaLike(String value) {
            addCriterion("upper(de_marineiba) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_marineiba");
            return (Criteria) this;
        }

        public Criteria andStrMarineibaNotLike(String value) {
            addCriterion("de_marineiba not like", "%" + CadenaUtil.getStr(value) + "%", "de_marineiba");
            return (Criteria) this;
        }
			
        public Criteria andStrMarineibaEqualTo(String value) {
            addCriterion("de_marineiba =", CadenaUtil.getStr(value), "de_marineiba");
            return (Criteria) this;
        }

        public Criteria andStrMarineibaNotEqualTo(String value) {
            addCriterion("de_marineiba <>", CadenaUtil.getStr(value), "de_marineiba");
            return (Criteria) this;
        }

        
        public Criteria andStrMarineibaIsNull() {
            addCriterion("de_marineiba is null");
            return (Criteria) this;
        }

        public Criteria andStrMarineibaIsNotNull() {
            addCriterion("de_marineiba is not null");
            return (Criteria) this;
        }

        public Criteria andStrMarineibaGreaterThan(String value) {
            addCriterion("de_marineiba >", value, "de_marineiba");
            return (Criteria) this;
        }

        public Criteria andStrMarineibaGreaterThanOrEqualTo(String value) {
            addCriterion("de_marineiba >=", value, "de_marineiba");
            return (Criteria) this;
        }

        public Criteria andStrMarineibaLessThan(String value) {
            addCriterion("de_marineiba <", value, "de_marineiba");
            return (Criteria) this;
        }

        public Criteria andStrMarineibaLessThanOrEqualTo(String value) {
            addCriterion("de_marineiba <=", value, "de_marineiba");
            return (Criteria) this;
        }

        public Criteria andStrMarineibaIn(List<String> values) {
            addCriterion("de_marineiba in", values, "de_marineiba");
            return (Criteria) this;
        }

        public Criteria andStrMarineibaNotIn(List<String> values) {
            addCriterion("de_marineiba not in", values, "de_marineiba");
            return (Criteria) this;
        }

        public Criteria andStrMarineibaBetween(String value1, String value2) {
            addCriterion("de_marineiba between", value1, value2, "de_marineiba");
            return (Criteria) this;
        }

        public Criteria andStrMarineibaNotBetween(String value1, String value2) {
            addCriterion("de_marineiba not between", value1, value2, "de_marineiba");
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
        
        
        public Criteria andDblShapeLe1EqualTo(Double value) {
            addCriterion("ha_shape_le_1 =", value, "ha_shape_le_1");
            return (Criteria) this;
        }

        public Criteria andDblShapeLe1NotEqualTo(Double value) {
            addCriterion("ha_shape_le_1 <>", value, "ha_shape_le_1");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeLe1IsNull() {
            addCriterion("ha_shape_le_1 is null");
            return (Criteria) this;
        }

        public Criteria andDblShapeLe1IsNotNull() {
            addCriterion("ha_shape_le_1 is not null");
            return (Criteria) this;
        }

        public Criteria andDblShapeLe1GreaterThan(Double value) {
            addCriterion("ha_shape_le_1 >", value, "ha_shape_le_1");
            return (Criteria) this;
        }

        public Criteria andDblShapeLe1GreaterThanOrEqualTo(Double value) {
            addCriterion("ha_shape_le_1 >=", value, "ha_shape_le_1");
            return (Criteria) this;
        }

        public Criteria andDblShapeLe1LessThan(Double value) {
            addCriterion("ha_shape_le_1 <", value, "ha_shape_le_1");
            return (Criteria) this;
        }

        public Criteria andDblShapeLe1LessThanOrEqualTo(Double value) {
            addCriterion("ha_shape_le_1 <=", value, "ha_shape_le_1");
            return (Criteria) this;
        }

        public Criteria andDblShapeLe1In(List<Double> values) {
            addCriterion("ha_shape_le_1 in", values, "ha_shape_le_1");
            return (Criteria) this;
        }

        public Criteria andDblShapeLe1NotIn(List<Double> values) {
            addCriterion("ha_shape_le_1 not in", values, "ha_shape_le_1");
            return (Criteria) this;
        }

        public Criteria andDblShapeLe1Between(Double value1, Double value2) {
            addCriterion("ha_shape_le_1 between", value1, value2, "ha_shape_le_1");
            return (Criteria) this;
        }

        public Criteria andDblShapeLe1NotBetween(Double value1, Double value2) {
            addCriterion("ha_shape_le_1 not between", value1, value2, "ha_shape_le_1");
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
