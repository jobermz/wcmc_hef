package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class RiosPrincipalesParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RiosPrincipalesParamDef() {
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
        
        
        public Criteria andStrJerHidroLike(String value) {
            addCriterion("upper(de_jer_hidro) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_jer_hidro");
            return (Criteria) this;
        }

        public Criteria andStrJerHidroNotLike(String value) {
            addCriterion("de_jer_hidro not like", "%" + CadenaUtil.getStr(value) + "%", "de_jer_hidro");
            return (Criteria) this;
        }
			
        public Criteria andStrJerHidroEqualTo(String value) {
            addCriterion("de_jer_hidro =", CadenaUtil.getStr(value), "de_jer_hidro");
            return (Criteria) this;
        }

        public Criteria andStrJerHidroNotEqualTo(String value) {
            addCriterion("de_jer_hidro <>", CadenaUtil.getStr(value), "de_jer_hidro");
            return (Criteria) this;
        }

        
        public Criteria andStrJerHidroIsNull() {
            addCriterion("de_jer_hidro is null");
            return (Criteria) this;
        }

        public Criteria andStrJerHidroIsNotNull() {
            addCriterion("de_jer_hidro is not null");
            return (Criteria) this;
        }

        public Criteria andStrJerHidroGreaterThan(String value) {
            addCriterion("de_jer_hidro >", value, "de_jer_hidro");
            return (Criteria) this;
        }

        public Criteria andStrJerHidroGreaterThanOrEqualTo(String value) {
            addCriterion("de_jer_hidro >=", value, "de_jer_hidro");
            return (Criteria) this;
        }

        public Criteria andStrJerHidroLessThan(String value) {
            addCriterion("de_jer_hidro <", value, "de_jer_hidro");
            return (Criteria) this;
        }

        public Criteria andStrJerHidroLessThanOrEqualTo(String value) {
            addCriterion("de_jer_hidro <=", value, "de_jer_hidro");
            return (Criteria) this;
        }

        public Criteria andStrJerHidroIn(List<String> values) {
            addCriterion("de_jer_hidro in", values, "de_jer_hidro");
            return (Criteria) this;
        }

        public Criteria andStrJerHidroNotIn(List<String> values) {
            addCriterion("de_jer_hidro not in", values, "de_jer_hidro");
            return (Criteria) this;
        }

        public Criteria andStrJerHidroBetween(String value1, String value2) {
            addCriterion("de_jer_hidro between", value1, value2, "de_jer_hidro");
            return (Criteria) this;
        }

        public Criteria andStrJerHidroNotBetween(String value1, String value2) {
            addCriterion("de_jer_hidro not between", value1, value2, "de_jer_hidro");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDpd99Like(String value) {
            addCriterion("upper(de_dpd99) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_dpd99");
            return (Criteria) this;
        }

        public Criteria andStrDpd99NotLike(String value) {
            addCriterion("de_dpd99 not like", "%" + CadenaUtil.getStr(value) + "%", "de_dpd99");
            return (Criteria) this;
        }
			
        public Criteria andStrDpd99EqualTo(String value) {
            addCriterion("de_dpd99 =", CadenaUtil.getStr(value), "de_dpd99");
            return (Criteria) this;
        }

        public Criteria andStrDpd99NotEqualTo(String value) {
            addCriterion("de_dpd99 <>", CadenaUtil.getStr(value), "de_dpd99");
            return (Criteria) this;
        }

        
        public Criteria andStrDpd99IsNull() {
            addCriterion("de_dpd99 is null");
            return (Criteria) this;
        }

        public Criteria andStrDpd99IsNotNull() {
            addCriterion("de_dpd99 is not null");
            return (Criteria) this;
        }

        public Criteria andStrDpd99GreaterThan(String value) {
            addCriterion("de_dpd99 >", value, "de_dpd99");
            return (Criteria) this;
        }

        public Criteria andStrDpd99GreaterThanOrEqualTo(String value) {
            addCriterion("de_dpd99 >=", value, "de_dpd99");
            return (Criteria) this;
        }

        public Criteria andStrDpd99LessThan(String value) {
            addCriterion("de_dpd99 <", value, "de_dpd99");
            return (Criteria) this;
        }

        public Criteria andStrDpd99LessThanOrEqualTo(String value) {
            addCriterion("de_dpd99 <=", value, "de_dpd99");
            return (Criteria) this;
        }

        public Criteria andStrDpd99In(List<String> values) {
            addCriterion("de_dpd99 in", values, "de_dpd99");
            return (Criteria) this;
        }

        public Criteria andStrDpd99NotIn(List<String> values) {
            addCriterion("de_dpd99 not in", values, "de_dpd99");
            return (Criteria) this;
        }

        public Criteria andStrDpd99Between(String value1, String value2) {
            addCriterion("de_dpd99 between", value1, value2, "de_dpd99");
            return (Criteria) this;
        }

        public Criteria andStrDpd99NotBetween(String value1, String value2) {
            addCriterion("de_dpd99 not between", value1, value2, "de_dpd99");
            return (Criteria) this;
        }
        
        
        public Criteria andStrPp99Like(String value) {
            addCriterion("upper(de_pp99) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_pp99");
            return (Criteria) this;
        }

        public Criteria andStrPp99NotLike(String value) {
            addCriterion("de_pp99 not like", "%" + CadenaUtil.getStr(value) + "%", "de_pp99");
            return (Criteria) this;
        }
			
        public Criteria andStrPp99EqualTo(String value) {
            addCriterion("de_pp99 =", CadenaUtil.getStr(value), "de_pp99");
            return (Criteria) this;
        }

        public Criteria andStrPp99NotEqualTo(String value) {
            addCriterion("de_pp99 <>", CadenaUtil.getStr(value), "de_pp99");
            return (Criteria) this;
        }

        
        public Criteria andStrPp99IsNull() {
            addCriterion("de_pp99 is null");
            return (Criteria) this;
        }

        public Criteria andStrPp99IsNotNull() {
            addCriterion("de_pp99 is not null");
            return (Criteria) this;
        }

        public Criteria andStrPp99GreaterThan(String value) {
            addCriterion("de_pp99 >", value, "de_pp99");
            return (Criteria) this;
        }

        public Criteria andStrPp99GreaterThanOrEqualTo(String value) {
            addCriterion("de_pp99 >=", value, "de_pp99");
            return (Criteria) this;
        }

        public Criteria andStrPp99LessThan(String value) {
            addCriterion("de_pp99 <", value, "de_pp99");
            return (Criteria) this;
        }

        public Criteria andStrPp99LessThanOrEqualTo(String value) {
            addCriterion("de_pp99 <=", value, "de_pp99");
            return (Criteria) this;
        }

        public Criteria andStrPp99In(List<String> values) {
            addCriterion("de_pp99 in", values, "de_pp99");
            return (Criteria) this;
        }

        public Criteria andStrPp99NotIn(List<String> values) {
            addCriterion("de_pp99 not in", values, "de_pp99");
            return (Criteria) this;
        }

        public Criteria andStrPp99Between(String value1, String value2) {
            addCriterion("de_pp99 between", value1, value2, "de_pp99");
            return (Criteria) this;
        }

        public Criteria andStrPp99NotBetween(String value1, String value2) {
            addCriterion("de_pp99 not between", value1, value2, "de_pp99");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDdLike(String value) {
            addCriterion("upper(de_dd) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_dd");
            return (Criteria) this;
        }

        public Criteria andStrDdNotLike(String value) {
            addCriterion("de_dd not like", "%" + CadenaUtil.getStr(value) + "%", "de_dd");
            return (Criteria) this;
        }
			
        public Criteria andStrDdEqualTo(String value) {
            addCriterion("de_dd =", CadenaUtil.getStr(value), "de_dd");
            return (Criteria) this;
        }

        public Criteria andStrDdNotEqualTo(String value) {
            addCriterion("de_dd <>", CadenaUtil.getStr(value), "de_dd");
            return (Criteria) this;
        }

        
        public Criteria andStrDdIsNull() {
            addCriterion("de_dd is null");
            return (Criteria) this;
        }

        public Criteria andStrDdIsNotNull() {
            addCriterion("de_dd is not null");
            return (Criteria) this;
        }

        public Criteria andStrDdGreaterThan(String value) {
            addCriterion("de_dd >", value, "de_dd");
            return (Criteria) this;
        }

        public Criteria andStrDdGreaterThanOrEqualTo(String value) {
            addCriterion("de_dd >=", value, "de_dd");
            return (Criteria) this;
        }

        public Criteria andStrDdLessThan(String value) {
            addCriterion("de_dd <", value, "de_dd");
            return (Criteria) this;
        }

        public Criteria andStrDdLessThanOrEqualTo(String value) {
            addCriterion("de_dd <=", value, "de_dd");
            return (Criteria) this;
        }

        public Criteria andStrDdIn(List<String> values) {
            addCriterion("de_dd in", values, "de_dd");
            return (Criteria) this;
        }

        public Criteria andStrDdNotIn(List<String> values) {
            addCriterion("de_dd not in", values, "de_dd");
            return (Criteria) this;
        }

        public Criteria andStrDdBetween(String value1, String value2) {
            addCriterion("de_dd between", value1, value2, "de_dd");
            return (Criteria) this;
        }

        public Criteria andStrDdNotBetween(String value1, String value2) {
            addCriterion("de_dd not between", value1, value2, "de_dd");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDin99Like(String value) {
            addCriterion("upper(de_din99) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_din99");
            return (Criteria) this;
        }

        public Criteria andStrDin99NotLike(String value) {
            addCriterion("de_din99 not like", "%" + CadenaUtil.getStr(value) + "%", "de_din99");
            return (Criteria) this;
        }
			
        public Criteria andStrDin99EqualTo(String value) {
            addCriterion("de_din99 =", CadenaUtil.getStr(value), "de_din99");
            return (Criteria) this;
        }

        public Criteria andStrDin99NotEqualTo(String value) {
            addCriterion("de_din99 <>", CadenaUtil.getStr(value), "de_din99");
            return (Criteria) this;
        }

        
        public Criteria andStrDin99IsNull() {
            addCriterion("de_din99 is null");
            return (Criteria) this;
        }

        public Criteria andStrDin99IsNotNull() {
            addCriterion("de_din99 is not null");
            return (Criteria) this;
        }

        public Criteria andStrDin99GreaterThan(String value) {
            addCriterion("de_din99 >", value, "de_din99");
            return (Criteria) this;
        }

        public Criteria andStrDin99GreaterThanOrEqualTo(String value) {
            addCriterion("de_din99 >=", value, "de_din99");
            return (Criteria) this;
        }

        public Criteria andStrDin99LessThan(String value) {
            addCriterion("de_din99 <", value, "de_din99");
            return (Criteria) this;
        }

        public Criteria andStrDin99LessThanOrEqualTo(String value) {
            addCriterion("de_din99 <=", value, "de_din99");
            return (Criteria) this;
        }

        public Criteria andStrDin99In(List<String> values) {
            addCriterion("de_din99 in", values, "de_din99");
            return (Criteria) this;
        }

        public Criteria andStrDin99NotIn(List<String> values) {
            addCriterion("de_din99 not in", values, "de_din99");
            return (Criteria) this;
        }

        public Criteria andStrDin99Between(String value1, String value2) {
            addCriterion("de_din99 between", value1, value2, "de_din99");
            return (Criteria) this;
        }

        public Criteria andStrDin99NotBetween(String value1, String value2) {
            addCriterion("de_din99 not between", value1, value2, "de_din99");
            return (Criteria) this;
        }
        
        
        public Criteria andStrPn99Like(String value) {
            addCriterion("upper(de_pn99) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_pn99");
            return (Criteria) this;
        }

        public Criteria andStrPn99NotLike(String value) {
            addCriterion("de_pn99 not like", "%" + CadenaUtil.getStr(value) + "%", "de_pn99");
            return (Criteria) this;
        }
			
        public Criteria andStrPn99EqualTo(String value) {
            addCriterion("de_pn99 =", CadenaUtil.getStr(value), "de_pn99");
            return (Criteria) this;
        }

        public Criteria andStrPn99NotEqualTo(String value) {
            addCriterion("de_pn99 <>", CadenaUtil.getStr(value), "de_pn99");
            return (Criteria) this;
        }

        
        public Criteria andStrPn99IsNull() {
            addCriterion("de_pn99 is null");
            return (Criteria) this;
        }

        public Criteria andStrPn99IsNotNull() {
            addCriterion("de_pn99 is not null");
            return (Criteria) this;
        }

        public Criteria andStrPn99GreaterThan(String value) {
            addCriterion("de_pn99 >", value, "de_pn99");
            return (Criteria) this;
        }

        public Criteria andStrPn99GreaterThanOrEqualTo(String value) {
            addCriterion("de_pn99 >=", value, "de_pn99");
            return (Criteria) this;
        }

        public Criteria andStrPn99LessThan(String value) {
            addCriterion("de_pn99 <", value, "de_pn99");
            return (Criteria) this;
        }

        public Criteria andStrPn99LessThanOrEqualTo(String value) {
            addCriterion("de_pn99 <=", value, "de_pn99");
            return (Criteria) this;
        }

        public Criteria andStrPn99In(List<String> values) {
            addCriterion("de_pn99 in", values, "de_pn99");
            return (Criteria) this;
        }

        public Criteria andStrPn99NotIn(List<String> values) {
            addCriterion("de_pn99 not in", values, "de_pn99");
            return (Criteria) this;
        }

        public Criteria andStrPn99Between(String value1, String value2) {
            addCriterion("de_pn99 between", value1, value2, "de_pn99");
            return (Criteria) this;
        }

        public Criteria andStrPn99NotBetween(String value1, String value2) {
            addCriterion("de_pn99 not between", value1, value2, "de_pn99");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDn99Like(String value) {
            addCriterion("upper(de_dn99) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_dn99");
            return (Criteria) this;
        }

        public Criteria andStrDn99NotLike(String value) {
            addCriterion("de_dn99 not like", "%" + CadenaUtil.getStr(value) + "%", "de_dn99");
            return (Criteria) this;
        }
			
        public Criteria andStrDn99EqualTo(String value) {
            addCriterion("de_dn99 =", CadenaUtil.getStr(value), "de_dn99");
            return (Criteria) this;
        }

        public Criteria andStrDn99NotEqualTo(String value) {
            addCriterion("de_dn99 <>", CadenaUtil.getStr(value), "de_dn99");
            return (Criteria) this;
        }

        
        public Criteria andStrDn99IsNull() {
            addCriterion("de_dn99 is null");
            return (Criteria) this;
        }

        public Criteria andStrDn99IsNotNull() {
            addCriterion("de_dn99 is not null");
            return (Criteria) this;
        }

        public Criteria andStrDn99GreaterThan(String value) {
            addCriterion("de_dn99 >", value, "de_dn99");
            return (Criteria) this;
        }

        public Criteria andStrDn99GreaterThanOrEqualTo(String value) {
            addCriterion("de_dn99 >=", value, "de_dn99");
            return (Criteria) this;
        }

        public Criteria andStrDn99LessThan(String value) {
            addCriterion("de_dn99 <", value, "de_dn99");
            return (Criteria) this;
        }

        public Criteria andStrDn99LessThanOrEqualTo(String value) {
            addCriterion("de_dn99 <=", value, "de_dn99");
            return (Criteria) this;
        }

        public Criteria andStrDn99In(List<String> values) {
            addCriterion("de_dn99 in", values, "de_dn99");
            return (Criteria) this;
        }

        public Criteria andStrDn99NotIn(List<String> values) {
            addCriterion("de_dn99 not in", values, "de_dn99");
            return (Criteria) this;
        }

        public Criteria andStrDn99Between(String value1, String value2) {
            addCriterion("de_dn99 between", value1, value2, "de_dn99");
            return (Criteria) this;
        }

        public Criteria andStrDn99NotBetween(String value1, String value2) {
            addCriterion("de_dn99 not between", value1, value2, "de_dn99");
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
