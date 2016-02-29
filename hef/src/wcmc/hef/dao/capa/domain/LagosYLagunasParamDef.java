package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class LagosYLagunasParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LagosYLagunasParamDef() {
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
        
        
        public Criteria andDblCountEqualTo(Double value) {
            addCriterion("ha_count_ =", value, "ha_count_");
            return (Criteria) this;
        }

        public Criteria andDblCountNotEqualTo(Double value) {
            addCriterion("ha_count_ <>", value, "ha_count_");
            return (Criteria) this;
        }
        
        
        public Criteria andDblCountIsNull() {
            addCriterion("ha_count_ is null");
            return (Criteria) this;
        }

        public Criteria andDblCountIsNotNull() {
            addCriterion("ha_count_ is not null");
            return (Criteria) this;
        }

        public Criteria andDblCountGreaterThan(Double value) {
            addCriterion("ha_count_ >", value, "ha_count_");
            return (Criteria) this;
        }

        public Criteria andDblCountGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_count_ >=", value, "ha_count_");
            return (Criteria) this;
        }

        public Criteria andDblCountLessThan(Double value) {
            addCriterion("ha_count_ <", value, "ha_count_");
            return (Criteria) this;
        }

        public Criteria andDblCountLessThanOrEqualTo(Double value) {
            addCriterion("ha_count_ <=", value, "ha_count_");
            return (Criteria) this;
        }

        public Criteria andDblCountIn(List<Double> values) {
            addCriterion("ha_count_ in", values, "ha_count_");
            return (Criteria) this;
        }

        public Criteria andDblCountNotIn(List<Double> values) {
            addCriterion("ha_count_ not in", values, "ha_count_");
            return (Criteria) this;
        }

        public Criteria andDblCountBetween(Double value1, Double value2) {
            addCriterion("ha_count_ between", value1, value2, "ha_count_");
            return (Criteria) this;
        }

        public Criteria andDblCountNotBetween(Double value1, Double value2) {
            addCriterion("ha_count_ not between", value1, value2, "ha_count_");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFirstIdprLike(String value) {
            addCriterion("upper(de_first_idpr) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_first_idpr");
            return (Criteria) this;
        }

        public Criteria andStrFirstIdprNotLike(String value) {
            addCriterion("de_first_idpr not like", "%" + CadenaUtil.getStr(value) + "%", "de_first_idpr");
            return (Criteria) this;
        }
			
        public Criteria andStrFirstIdprEqualTo(String value) {
            addCriterion("de_first_idpr =", CadenaUtil.getStr(value), "de_first_idpr");
            return (Criteria) this;
        }

        public Criteria andStrFirstIdprNotEqualTo(String value) {
            addCriterion("de_first_idpr <>", CadenaUtil.getStr(value), "de_first_idpr");
            return (Criteria) this;
        }

        
        public Criteria andStrFirstIdprIsNull() {
            addCriterion("de_first_idpr is null");
            return (Criteria) this;
        }

        public Criteria andStrFirstIdprIsNotNull() {
            addCriterion("de_first_idpr is not null");
            return (Criteria) this;
        }

        public Criteria andStrFirstIdprGreaterThan(String value) {
            addCriterion("de_first_idpr >", value, "de_first_idpr");
            return (Criteria) this;
        }

        public Criteria andStrFirstIdprGreaterThanOrEqualTo(String value) {
            addCriterion("de_first_idpr >=", value, "de_first_idpr");
            return (Criteria) this;
        }

        public Criteria andStrFirstIdprLessThan(String value) {
            addCriterion("de_first_idpr <", value, "de_first_idpr");
            return (Criteria) this;
        }

        public Criteria andStrFirstIdprLessThanOrEqualTo(String value) {
            addCriterion("de_first_idpr <=", value, "de_first_idpr");
            return (Criteria) this;
        }

        public Criteria andStrFirstIdprIn(List<String> values) {
            addCriterion("de_first_idpr in", values, "de_first_idpr");
            return (Criteria) this;
        }

        public Criteria andStrFirstIdprNotIn(List<String> values) {
            addCriterion("de_first_idpr not in", values, "de_first_idpr");
            return (Criteria) this;
        }

        public Criteria andStrFirstIdprBetween(String value1, String value2) {
            addCriterion("de_first_idpr between", value1, value2, "de_first_idpr");
            return (Criteria) this;
        }

        public Criteria andStrFirstIdprNotBetween(String value1, String value2) {
            addCriterion("de_first_idpr not between", value1, value2, "de_first_idpr");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombprovLike(String value) {
            addCriterion("upper(de_nombprov) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_nombprov");
            return (Criteria) this;
        }

        public Criteria andStrNombprovNotLike(String value) {
            addCriterion("de_nombprov not like", "%" + CadenaUtil.getStr(value) + "%", "de_nombprov");
            return (Criteria) this;
        }
			
        public Criteria andStrNombprovEqualTo(String value) {
            addCriterion("de_nombprov =", CadenaUtil.getStr(value), "de_nombprov");
            return (Criteria) this;
        }

        public Criteria andStrNombprovNotEqualTo(String value) {
            addCriterion("de_nombprov <>", CadenaUtil.getStr(value), "de_nombprov");
            return (Criteria) this;
        }

        
        public Criteria andStrNombprovIsNull() {
            addCriterion("de_nombprov is null");
            return (Criteria) this;
        }

        public Criteria andStrNombprovIsNotNull() {
            addCriterion("de_nombprov is not null");
            return (Criteria) this;
        }

        public Criteria andStrNombprovGreaterThan(String value) {
            addCriterion("de_nombprov >", value, "de_nombprov");
            return (Criteria) this;
        }

        public Criteria andStrNombprovGreaterThanOrEqualTo(String value) {
            addCriterion("de_nombprov >=", value, "de_nombprov");
            return (Criteria) this;
        }

        public Criteria andStrNombprovLessThan(String value) {
            addCriterion("de_nombprov <", value, "de_nombprov");
            return (Criteria) this;
        }

        public Criteria andStrNombprovLessThanOrEqualTo(String value) {
            addCriterion("de_nombprov <=", value, "de_nombprov");
            return (Criteria) this;
        }

        public Criteria andStrNombprovIn(List<String> values) {
            addCriterion("de_nombprov in", values, "de_nombprov");
            return (Criteria) this;
        }

        public Criteria andStrNombprovNotIn(List<String> values) {
            addCriterion("de_nombprov not in", values, "de_nombprov");
            return (Criteria) this;
        }

        public Criteria andStrNombprovBetween(String value1, String value2) {
            addCriterion("de_nombprov between", value1, value2, "de_nombprov");
            return (Criteria) this;
        }

        public Criteria andStrNombprovNotBetween(String value1, String value2) {
            addCriterion("de_nombprov not between", value1, value2, "de_nombprov");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFirstNombLike(String value) {
            addCriterion("upper(de_first_nomb) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_first_nomb");
            return (Criteria) this;
        }

        public Criteria andStrFirstNombNotLike(String value) {
            addCriterion("de_first_nomb not like", "%" + CadenaUtil.getStr(value) + "%", "de_first_nomb");
            return (Criteria) this;
        }
			
        public Criteria andStrFirstNombEqualTo(String value) {
            addCriterion("de_first_nomb =", CadenaUtil.getStr(value), "de_first_nomb");
            return (Criteria) this;
        }

        public Criteria andStrFirstNombNotEqualTo(String value) {
            addCriterion("de_first_nomb <>", CadenaUtil.getStr(value), "de_first_nomb");
            return (Criteria) this;
        }

        
        public Criteria andStrFirstNombIsNull() {
            addCriterion("de_first_nomb is null");
            return (Criteria) this;
        }

        public Criteria andStrFirstNombIsNotNull() {
            addCriterion("de_first_nomb is not null");
            return (Criteria) this;
        }

        public Criteria andStrFirstNombGreaterThan(String value) {
            addCriterion("de_first_nomb >", value, "de_first_nomb");
            return (Criteria) this;
        }

        public Criteria andStrFirstNombGreaterThanOrEqualTo(String value) {
            addCriterion("de_first_nomb >=", value, "de_first_nomb");
            return (Criteria) this;
        }

        public Criteria andStrFirstNombLessThan(String value) {
            addCriterion("de_first_nomb <", value, "de_first_nomb");
            return (Criteria) this;
        }

        public Criteria andStrFirstNombLessThanOrEqualTo(String value) {
            addCriterion("de_first_nomb <=", value, "de_first_nomb");
            return (Criteria) this;
        }

        public Criteria andStrFirstNombIn(List<String> values) {
            addCriterion("de_first_nomb in", values, "de_first_nomb");
            return (Criteria) this;
        }

        public Criteria andStrFirstNombNotIn(List<String> values) {
            addCriterion("de_first_nomb not in", values, "de_first_nomb");
            return (Criteria) this;
        }

        public Criteria andStrFirstNombBetween(String value1, String value2) {
            addCriterion("de_first_nomb between", value1, value2, "de_first_nomb");
            return (Criteria) this;
        }

        public Criteria andStrFirstNombNotBetween(String value1, String value2) {
            addCriterion("de_first_nomb not between", value1, value2, "de_first_nomb");
            return (Criteria) this;
        }
        
        
        public Criteria andStrLastDctoLike(String value) {
            addCriterion("upper(de_last_dcto) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_last_dcto");
            return (Criteria) this;
        }

        public Criteria andStrLastDctoNotLike(String value) {
            addCriterion("de_last_dcto not like", "%" + CadenaUtil.getStr(value) + "%", "de_last_dcto");
            return (Criteria) this;
        }
			
        public Criteria andStrLastDctoEqualTo(String value) {
            addCriterion("de_last_dcto =", CadenaUtil.getStr(value), "de_last_dcto");
            return (Criteria) this;
        }

        public Criteria andStrLastDctoNotEqualTo(String value) {
            addCriterion("de_last_dcto <>", CadenaUtil.getStr(value), "de_last_dcto");
            return (Criteria) this;
        }

        
        public Criteria andStrLastDctoIsNull() {
            addCriterion("de_last_dcto is null");
            return (Criteria) this;
        }

        public Criteria andStrLastDctoIsNotNull() {
            addCriterion("de_last_dcto is not null");
            return (Criteria) this;
        }

        public Criteria andStrLastDctoGreaterThan(String value) {
            addCriterion("de_last_dcto >", value, "de_last_dcto");
            return (Criteria) this;
        }

        public Criteria andStrLastDctoGreaterThanOrEqualTo(String value) {
            addCriterion("de_last_dcto >=", value, "de_last_dcto");
            return (Criteria) this;
        }

        public Criteria andStrLastDctoLessThan(String value) {
            addCriterion("de_last_dcto <", value, "de_last_dcto");
            return (Criteria) this;
        }

        public Criteria andStrLastDctoLessThanOrEqualTo(String value) {
            addCriterion("de_last_dcto <=", value, "de_last_dcto");
            return (Criteria) this;
        }

        public Criteria andStrLastDctoIn(List<String> values) {
            addCriterion("de_last_dcto in", values, "de_last_dcto");
            return (Criteria) this;
        }

        public Criteria andStrLastDctoNotIn(List<String> values) {
            addCriterion("de_last_dcto not in", values, "de_last_dcto");
            return (Criteria) this;
        }

        public Criteria andStrLastDctoBetween(String value1, String value2) {
            addCriterion("de_last_dcto between", value1, value2, "de_last_dcto");
            return (Criteria) this;
        }

        public Criteria andStrLastDctoNotBetween(String value1, String value2) {
            addCriterion("de_last_dcto not between", value1, value2, "de_last_dcto");
            return (Criteria) this;
        }
        
        
        public Criteria andStrLastLeyLike(String value) {
            addCriterion("upper(de_last_ley) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_last_ley");
            return (Criteria) this;
        }

        public Criteria andStrLastLeyNotLike(String value) {
            addCriterion("de_last_ley not like", "%" + CadenaUtil.getStr(value) + "%", "de_last_ley");
            return (Criteria) this;
        }
			
        public Criteria andStrLastLeyEqualTo(String value) {
            addCriterion("de_last_ley =", CadenaUtil.getStr(value), "de_last_ley");
            return (Criteria) this;
        }

        public Criteria andStrLastLeyNotEqualTo(String value) {
            addCriterion("de_last_ley <>", CadenaUtil.getStr(value), "de_last_ley");
            return (Criteria) this;
        }

        
        public Criteria andStrLastLeyIsNull() {
            addCriterion("de_last_ley is null");
            return (Criteria) this;
        }

        public Criteria andStrLastLeyIsNotNull() {
            addCriterion("de_last_ley is not null");
            return (Criteria) this;
        }

        public Criteria andStrLastLeyGreaterThan(String value) {
            addCriterion("de_last_ley >", value, "de_last_ley");
            return (Criteria) this;
        }

        public Criteria andStrLastLeyGreaterThanOrEqualTo(String value) {
            addCriterion("de_last_ley >=", value, "de_last_ley");
            return (Criteria) this;
        }

        public Criteria andStrLastLeyLessThan(String value) {
            addCriterion("de_last_ley <", value, "de_last_ley");
            return (Criteria) this;
        }

        public Criteria andStrLastLeyLessThanOrEqualTo(String value) {
            addCriterion("de_last_ley <=", value, "de_last_ley");
            return (Criteria) this;
        }

        public Criteria andStrLastLeyIn(List<String> values) {
            addCriterion("de_last_ley in", values, "de_last_ley");
            return (Criteria) this;
        }

        public Criteria andStrLastLeyNotIn(List<String> values) {
            addCriterion("de_last_ley not in", values, "de_last_ley");
            return (Criteria) this;
        }

        public Criteria andStrLastLeyBetween(String value1, String value2) {
            addCriterion("de_last_ley between", value1, value2, "de_last_ley");
            return (Criteria) this;
        }

        public Criteria andStrLastLeyNotBetween(String value1, String value2) {
            addCriterion("de_last_ley not between", value1, value2, "de_last_ley");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFirstFechLike(String value) {
            addCriterion("upper(de_first_fech) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_first_fech");
            return (Criteria) this;
        }

        public Criteria andStrFirstFechNotLike(String value) {
            addCriterion("de_first_fech not like", "%" + CadenaUtil.getStr(value) + "%", "de_first_fech");
            return (Criteria) this;
        }
			
        public Criteria andStrFirstFechEqualTo(String value) {
            addCriterion("de_first_fech =", CadenaUtil.getStr(value), "de_first_fech");
            return (Criteria) this;
        }

        public Criteria andStrFirstFechNotEqualTo(String value) {
            addCriterion("de_first_fech <>", CadenaUtil.getStr(value), "de_first_fech");
            return (Criteria) this;
        }

        
        public Criteria andStrFirstFechIsNull() {
            addCriterion("de_first_fech is null");
            return (Criteria) this;
        }

        public Criteria andStrFirstFechIsNotNull() {
            addCriterion("de_first_fech is not null");
            return (Criteria) this;
        }

        public Criteria andStrFirstFechGreaterThan(String value) {
            addCriterion("de_first_fech >", value, "de_first_fech");
            return (Criteria) this;
        }

        public Criteria andStrFirstFechGreaterThanOrEqualTo(String value) {
            addCriterion("de_first_fech >=", value, "de_first_fech");
            return (Criteria) this;
        }

        public Criteria andStrFirstFechLessThan(String value) {
            addCriterion("de_first_fech <", value, "de_first_fech");
            return (Criteria) this;
        }

        public Criteria andStrFirstFechLessThanOrEqualTo(String value) {
            addCriterion("de_first_fech <=", value, "de_first_fech");
            return (Criteria) this;
        }

        public Criteria andStrFirstFechIn(List<String> values) {
            addCriterion("de_first_fech in", values, "de_first_fech");
            return (Criteria) this;
        }

        public Criteria andStrFirstFechNotIn(List<String> values) {
            addCriterion("de_first_fech not in", values, "de_first_fech");
            return (Criteria) this;
        }

        public Criteria andStrFirstFechBetween(String value1, String value2) {
            addCriterion("de_first_fech between", value1, value2, "de_first_fech");
            return (Criteria) this;
        }

        public Criteria andStrFirstFechNotBetween(String value1, String value2) {
            addCriterion("de_first_fech not between", value1, value2, "de_first_fech");
            return (Criteria) this;
        }
        
        
        public Criteria andStrLastFechaLike(String value) {
            addCriterion("upper(de_last_fecha) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_last_fecha");
            return (Criteria) this;
        }

        public Criteria andStrLastFechaNotLike(String value) {
            addCriterion("de_last_fecha not like", "%" + CadenaUtil.getStr(value) + "%", "de_last_fecha");
            return (Criteria) this;
        }
			
        public Criteria andStrLastFechaEqualTo(String value) {
            addCriterion("de_last_fecha =", CadenaUtil.getStr(value), "de_last_fecha");
            return (Criteria) this;
        }

        public Criteria andStrLastFechaNotEqualTo(String value) {
            addCriterion("de_last_fecha <>", CadenaUtil.getStr(value), "de_last_fecha");
            return (Criteria) this;
        }

        
        public Criteria andStrLastFechaIsNull() {
            addCriterion("de_last_fecha is null");
            return (Criteria) this;
        }

        public Criteria andStrLastFechaIsNotNull() {
            addCriterion("de_last_fecha is not null");
            return (Criteria) this;
        }

        public Criteria andStrLastFechaGreaterThan(String value) {
            addCriterion("de_last_fecha >", value, "de_last_fecha");
            return (Criteria) this;
        }

        public Criteria andStrLastFechaGreaterThanOrEqualTo(String value) {
            addCriterion("de_last_fecha >=", value, "de_last_fecha");
            return (Criteria) this;
        }

        public Criteria andStrLastFechaLessThan(String value) {
            addCriterion("de_last_fecha <", value, "de_last_fecha");
            return (Criteria) this;
        }

        public Criteria andStrLastFechaLessThanOrEqualTo(String value) {
            addCriterion("de_last_fecha <=", value, "de_last_fecha");
            return (Criteria) this;
        }

        public Criteria andStrLastFechaIn(List<String> values) {
            addCriterion("de_last_fecha in", values, "de_last_fecha");
            return (Criteria) this;
        }

        public Criteria andStrLastFechaNotIn(List<String> values) {
            addCriterion("de_last_fecha not in", values, "de_last_fecha");
            return (Criteria) this;
        }

        public Criteria andStrLastFechaBetween(String value1, String value2) {
            addCriterion("de_last_fecha between", value1, value2, "de_last_fecha");
            return (Criteria) this;
        }

        public Criteria andStrLastFechaNotBetween(String value1, String value2) {
            addCriterion("de_last_fecha not between", value1, value2, "de_last_fecha");
            return (Criteria) this;
        }
        
        
        public Criteria andDblMinShapeEqualTo(Double value) {
            addCriterion("ha_min_shape_ =", value, "ha_min_shape_");
            return (Criteria) this;
        }

        public Criteria andDblMinShapeNotEqualTo(Double value) {
            addCriterion("ha_min_shape_ <>", value, "ha_min_shape_");
            return (Criteria) this;
        }
        
        
        public Criteria andDblMinShapeIsNull() {
            addCriterion("ha_min_shape_ is null");
            return (Criteria) this;
        }

        public Criteria andDblMinShapeIsNotNull() {
            addCriterion("ha_min_shape_ is not null");
            return (Criteria) this;
        }

        public Criteria andDblMinShapeGreaterThan(Double value) {
            addCriterion("ha_min_shape_ >", value, "ha_min_shape_");
            return (Criteria) this;
        }

        public Criteria andDblMinShapeGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_min_shape_ >=", value, "ha_min_shape_");
            return (Criteria) this;
        }

        public Criteria andDblMinShapeLessThan(Double value) {
            addCriterion("ha_min_shape_ <", value, "ha_min_shape_");
            return (Criteria) this;
        }

        public Criteria andDblMinShapeLessThanOrEqualTo(Double value) {
            addCriterion("ha_min_shape_ <=", value, "ha_min_shape_");
            return (Criteria) this;
        }

        public Criteria andDblMinShapeIn(List<Double> values) {
            addCriterion("ha_min_shape_ in", values, "ha_min_shape_");
            return (Criteria) this;
        }

        public Criteria andDblMinShapeNotIn(List<Double> values) {
            addCriterion("ha_min_shape_ not in", values, "ha_min_shape_");
            return (Criteria) this;
        }

        public Criteria andDblMinShapeBetween(Double value1, Double value2) {
            addCriterion("ha_min_shape_ between", value1, value2, "ha_min_shape_");
            return (Criteria) this;
        }

        public Criteria andDblMinShapeNotBetween(Double value1, Double value2) {
            addCriterion("ha_min_shape_ not between", value1, value2, "ha_min_shape_");
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
