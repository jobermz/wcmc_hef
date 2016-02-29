package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class AnpRegionalParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnpRegionalParamDef() {
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
        
        
        public Criteria andStrAnpcCatLike(String value) {
            addCriterion("upper(de_anpc_cat) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anpc_cat");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCatNotLike(String value) {
            addCriterion("de_anpc_cat not like", "%" + CadenaUtil.getStr(value) + "%", "de_anpc_cat");
            return (Criteria) this;
        }
			
        public Criteria andStrAnpcCatEqualTo(String value) {
            addCriterion("de_anpc_cat =", CadenaUtil.getStr(value), "de_anpc_cat");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCatNotEqualTo(String value) {
            addCriterion("de_anpc_cat <>", CadenaUtil.getStr(value), "de_anpc_cat");
            return (Criteria) this;
        }

        
        public Criteria andStrAnpcCatIsNull() {
            addCriterion("de_anpc_cat is null");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCatIsNotNull() {
            addCriterion("de_anpc_cat is not null");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCatGreaterThan(String value) {
            addCriterion("de_anpc_cat >", value, "de_anpc_cat");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCatGreaterThanOrEqualTo(String value) {
            addCriterion("de_anpc_cat >=", value, "de_anpc_cat");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCatLessThan(String value) {
            addCriterion("de_anpc_cat <", value, "de_anpc_cat");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCatLessThanOrEqualTo(String value) {
            addCriterion("de_anpc_cat <=", value, "de_anpc_cat");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCatIn(List<String> values) {
            addCriterion("de_anpc_cat in", values, "de_anpc_cat");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCatNotIn(List<String> values) {
            addCriterion("de_anpc_cat not in", values, "de_anpc_cat");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCatBetween(String value1, String value2) {
            addCriterion("de_anpc_cat between", value1, value2, "de_anpc_cat");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCatNotBetween(String value1, String value2) {
            addCriterion("de_anpc_cat not between", value1, value2, "de_anpc_cat");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpcCodiLike(String value) {
            addCriterion("upper(de_anpc_codi) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anpc_codi");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCodiNotLike(String value) {
            addCriterion("de_anpc_codi not like", "%" + CadenaUtil.getStr(value) + "%", "de_anpc_codi");
            return (Criteria) this;
        }
			
        public Criteria andStrAnpcCodiEqualTo(String value) {
            addCriterion("de_anpc_codi =", CadenaUtil.getStr(value), "de_anpc_codi");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCodiNotEqualTo(String value) {
            addCriterion("de_anpc_codi <>", CadenaUtil.getStr(value), "de_anpc_codi");
            return (Criteria) this;
        }

        
        public Criteria andStrAnpcCodiIsNull() {
            addCriterion("de_anpc_codi is null");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCodiIsNotNull() {
            addCriterion("de_anpc_codi is not null");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCodiGreaterThan(String value) {
            addCriterion("de_anpc_codi >", value, "de_anpc_codi");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCodiGreaterThanOrEqualTo(String value) {
            addCriterion("de_anpc_codi >=", value, "de_anpc_codi");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCodiLessThan(String value) {
            addCriterion("de_anpc_codi <", value, "de_anpc_codi");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCodiLessThanOrEqualTo(String value) {
            addCriterion("de_anpc_codi <=", value, "de_anpc_codi");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCodiIn(List<String> values) {
            addCriterion("de_anpc_codi in", values, "de_anpc_codi");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCodiNotIn(List<String> values) {
            addCriterion("de_anpc_codi not in", values, "de_anpc_codi");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCodiBetween(String value1, String value2) {
            addCriterion("de_anpc_codi between", value1, value2, "de_anpc_codi");
            return (Criteria) this;
        }

        public Criteria andStrAnpcCodiNotBetween(String value1, String value2) {
            addCriterion("de_anpc_codi not between", value1, value2, "de_anpc_codi");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpcNombLike(String value) {
            addCriterion("upper(de_anpc_nomb) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anpc_nomb");
            return (Criteria) this;
        }

        public Criteria andStrAnpcNombNotLike(String value) {
            addCriterion("de_anpc_nomb not like", "%" + CadenaUtil.getStr(value) + "%", "de_anpc_nomb");
            return (Criteria) this;
        }
			
        public Criteria andStrAnpcNombEqualTo(String value) {
            addCriterion("de_anpc_nomb =", CadenaUtil.getStr(value), "de_anpc_nomb");
            return (Criteria) this;
        }

        public Criteria andStrAnpcNombNotEqualTo(String value) {
            addCriterion("de_anpc_nomb <>", CadenaUtil.getStr(value), "de_anpc_nomb");
            return (Criteria) this;
        }

        
        public Criteria andStrAnpcNombIsNull() {
            addCriterion("de_anpc_nomb is null");
            return (Criteria) this;
        }

        public Criteria andStrAnpcNombIsNotNull() {
            addCriterion("de_anpc_nomb is not null");
            return (Criteria) this;
        }

        public Criteria andStrAnpcNombGreaterThan(String value) {
            addCriterion("de_anpc_nomb >", value, "de_anpc_nomb");
            return (Criteria) this;
        }

        public Criteria andStrAnpcNombGreaterThanOrEqualTo(String value) {
            addCriterion("de_anpc_nomb >=", value, "de_anpc_nomb");
            return (Criteria) this;
        }

        public Criteria andStrAnpcNombLessThan(String value) {
            addCriterion("de_anpc_nomb <", value, "de_anpc_nomb");
            return (Criteria) this;
        }

        public Criteria andStrAnpcNombLessThanOrEqualTo(String value) {
            addCriterion("de_anpc_nomb <=", value, "de_anpc_nomb");
            return (Criteria) this;
        }

        public Criteria andStrAnpcNombIn(List<String> values) {
            addCriterion("de_anpc_nomb in", values, "de_anpc_nomb");
            return (Criteria) this;
        }

        public Criteria andStrAnpcNombNotIn(List<String> values) {
            addCriterion("de_anpc_nomb not in", values, "de_anpc_nomb");
            return (Criteria) this;
        }

        public Criteria andStrAnpcNombBetween(String value1, String value2) {
            addCriterion("de_anpc_nomb between", value1, value2, "de_anpc_nomb");
            return (Criteria) this;
        }

        public Criteria andStrAnpcNombNotBetween(String value1, String value2) {
            addCriterion("de_anpc_nomb not between", value1, value2, "de_anpc_nomb");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAnpcAreaEqualTo(Double value) {
            addCriterion("ha_anpc_area =", value, "ha_anpc_area");
            return (Criteria) this;
        }

        public Criteria andDblAnpcAreaNotEqualTo(Double value) {
            addCriterion("ha_anpc_area <>", value, "ha_anpc_area");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAnpcAreaIsNull() {
            addCriterion("ha_anpc_area is null");
            return (Criteria) this;
        }

        public Criteria andDblAnpcAreaIsNotNull() {
            addCriterion("ha_anpc_area is not null");
            return (Criteria) this;
        }

        public Criteria andDblAnpcAreaGreaterThan(Double value) {
            addCriterion("ha_anpc_area >", value, "ha_anpc_area");
            return (Criteria) this;
        }

        public Criteria andDblAnpcAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_anpc_area >=", value, "ha_anpc_area");
            return (Criteria) this;
        }

        public Criteria andDblAnpcAreaLessThan(Double value) {
            addCriterion("ha_anpc_area <", value, "ha_anpc_area");
            return (Criteria) this;
        }

        public Criteria andDblAnpcAreaLessThanOrEqualTo(Double value) {
            addCriterion("ha_anpc_area <=", value, "ha_anpc_area");
            return (Criteria) this;
        }

        public Criteria andDblAnpcAreaIn(List<Double> values) {
            addCriterion("ha_anpc_area in", values, "ha_anpc_area");
            return (Criteria) this;
        }

        public Criteria andDblAnpcAreaNotIn(List<Double> values) {
            addCriterion("ha_anpc_area not in", values, "ha_anpc_area");
            return (Criteria) this;
        }

        public Criteria andDblAnpcAreaBetween(Double value1, Double value2) {
            addCriterion("ha_anpc_area between", value1, value2, "ha_anpc_area");
            return (Criteria) this;
        }

        public Criteria andDblAnpcAreaNotBetween(Double value1, Double value2) {
            addCriterion("ha_anpc_area not between", value1, value2, "ha_anpc_area");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpcBalecLike(String value) {
            addCriterion("upper(de_anpc_balec) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anpc_balec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalecNotLike(String value) {
            addCriterion("de_anpc_balec not like", "%" + CadenaUtil.getStr(value) + "%", "de_anpc_balec");
            return (Criteria) this;
        }
			
        public Criteria andStrAnpcBalecEqualTo(String value) {
            addCriterion("de_anpc_balec =", CadenaUtil.getStr(value), "de_anpc_balec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalecNotEqualTo(String value) {
            addCriterion("de_anpc_balec <>", CadenaUtil.getStr(value), "de_anpc_balec");
            return (Criteria) this;
        }

        
        public Criteria andStrAnpcBalecIsNull() {
            addCriterion("de_anpc_balec is null");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalecIsNotNull() {
            addCriterion("de_anpc_balec is not null");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalecGreaterThan(String value) {
            addCriterion("de_anpc_balec >", value, "de_anpc_balec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalecGreaterThanOrEqualTo(String value) {
            addCriterion("de_anpc_balec >=", value, "de_anpc_balec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalecLessThan(String value) {
            addCriterion("de_anpc_balec <", value, "de_anpc_balec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalecLessThanOrEqualTo(String value) {
            addCriterion("de_anpc_balec <=", value, "de_anpc_balec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalecIn(List<String> values) {
            addCriterion("de_anpc_balec in", values, "de_anpc_balec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalecNotIn(List<String> values) {
            addCriterion("de_anpc_balec not in", values, "de_anpc_balec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalecBetween(String value1, String value2) {
            addCriterion("de_anpc_balec between", value1, value2, "de_anpc_balec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalecNotBetween(String value1, String value2) {
            addCriterion("de_anpc_balec not between", value1, value2, "de_anpc_balec");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpcFelecLike(String value) {
            addCriterion("upper(de_anpc_felec) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anpc_felec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelecNotLike(String value) {
            addCriterion("de_anpc_felec not like", "%" + CadenaUtil.getStr(value) + "%", "de_anpc_felec");
            return (Criteria) this;
        }
			
        public Criteria andStrAnpcFelecEqualTo(String value) {
            addCriterion("de_anpc_felec =", CadenaUtil.getStr(value), "de_anpc_felec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelecNotEqualTo(String value) {
            addCriterion("de_anpc_felec <>", CadenaUtil.getStr(value), "de_anpc_felec");
            return (Criteria) this;
        }

        
        public Criteria andStrAnpcFelecIsNull() {
            addCriterion("de_anpc_felec is null");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelecIsNotNull() {
            addCriterion("de_anpc_felec is not null");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelecGreaterThan(String value) {
            addCriterion("de_anpc_felec >", value, "de_anpc_felec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelecGreaterThanOrEqualTo(String value) {
            addCriterion("de_anpc_felec >=", value, "de_anpc_felec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelecLessThan(String value) {
            addCriterion("de_anpc_felec <", value, "de_anpc_felec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelecLessThanOrEqualTo(String value) {
            addCriterion("de_anpc_felec <=", value, "de_anpc_felec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelecIn(List<String> values) {
            addCriterion("de_anpc_felec in", values, "de_anpc_felec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelecNotIn(List<String> values) {
            addCriterion("de_anpc_felec not in", values, "de_anpc_felec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelecBetween(String value1, String value2) {
            addCriterion("de_anpc_felec between", value1, value2, "de_anpc_felec");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelecNotBetween(String value1, String value2) {
            addCriterion("de_anpc_felec not between", value1, value2, "de_anpc_felec");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpcBalemLike(String value) {
            addCriterion("upper(de_anpc_balem) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anpc_balem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalemNotLike(String value) {
            addCriterion("de_anpc_balem not like", "%" + CadenaUtil.getStr(value) + "%", "de_anpc_balem");
            return (Criteria) this;
        }
			
        public Criteria andStrAnpcBalemEqualTo(String value) {
            addCriterion("de_anpc_balem =", CadenaUtil.getStr(value), "de_anpc_balem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalemNotEqualTo(String value) {
            addCriterion("de_anpc_balem <>", CadenaUtil.getStr(value), "de_anpc_balem");
            return (Criteria) this;
        }

        
        public Criteria andStrAnpcBalemIsNull() {
            addCriterion("de_anpc_balem is null");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalemIsNotNull() {
            addCriterion("de_anpc_balem is not null");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalemGreaterThan(String value) {
            addCriterion("de_anpc_balem >", value, "de_anpc_balem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalemGreaterThanOrEqualTo(String value) {
            addCriterion("de_anpc_balem >=", value, "de_anpc_balem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalemLessThan(String value) {
            addCriterion("de_anpc_balem <", value, "de_anpc_balem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalemLessThanOrEqualTo(String value) {
            addCriterion("de_anpc_balem <=", value, "de_anpc_balem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalemIn(List<String> values) {
            addCriterion("de_anpc_balem in", values, "de_anpc_balem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalemNotIn(List<String> values) {
            addCriterion("de_anpc_balem not in", values, "de_anpc_balem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalemBetween(String value1, String value2) {
            addCriterion("de_anpc_balem between", value1, value2, "de_anpc_balem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcBalemNotBetween(String value1, String value2) {
            addCriterion("de_anpc_balem not between", value1, value2, "de_anpc_balem");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpcFelemLike(String value) {
            addCriterion("upper(de_anpc_felem) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anpc_felem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelemNotLike(String value) {
            addCriterion("de_anpc_felem not like", "%" + CadenaUtil.getStr(value) + "%", "de_anpc_felem");
            return (Criteria) this;
        }
			
        public Criteria andStrAnpcFelemEqualTo(String value) {
            addCriterion("de_anpc_felem =", CadenaUtil.getStr(value), "de_anpc_felem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelemNotEqualTo(String value) {
            addCriterion("de_anpc_felem <>", CadenaUtil.getStr(value), "de_anpc_felem");
            return (Criteria) this;
        }

        
        public Criteria andStrAnpcFelemIsNull() {
            addCriterion("de_anpc_felem is null");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelemIsNotNull() {
            addCriterion("de_anpc_felem is not null");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelemGreaterThan(String value) {
            addCriterion("de_anpc_felem >", value, "de_anpc_felem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelemGreaterThanOrEqualTo(String value) {
            addCriterion("de_anpc_felem >=", value, "de_anpc_felem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelemLessThan(String value) {
            addCriterion("de_anpc_felem <", value, "de_anpc_felem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelemLessThanOrEqualTo(String value) {
            addCriterion("de_anpc_felem <=", value, "de_anpc_felem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelemIn(List<String> values) {
            addCriterion("de_anpc_felem in", values, "de_anpc_felem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelemNotIn(List<String> values) {
            addCriterion("de_anpc_felem not in", values, "de_anpc_felem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelemBetween(String value1, String value2) {
            addCriterion("de_anpc_felem between", value1, value2, "de_anpc_felem");
            return (Criteria) this;
        }

        public Criteria andStrAnpcFelemNotBetween(String value1, String value2) {
            addCriterion("de_anpc_felem not between", value1, value2, "de_anpc_felem");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpcDepaLike(String value) {
            addCriterion("upper(de_anpc_depa) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anpc_depa");
            return (Criteria) this;
        }

        public Criteria andStrAnpcDepaNotLike(String value) {
            addCriterion("de_anpc_depa not like", "%" + CadenaUtil.getStr(value) + "%", "de_anpc_depa");
            return (Criteria) this;
        }
			
        public Criteria andStrAnpcDepaEqualTo(String value) {
            addCriterion("de_anpc_depa =", CadenaUtil.getStr(value), "de_anpc_depa");
            return (Criteria) this;
        }

        public Criteria andStrAnpcDepaNotEqualTo(String value) {
            addCriterion("de_anpc_depa <>", CadenaUtil.getStr(value), "de_anpc_depa");
            return (Criteria) this;
        }

        
        public Criteria andStrAnpcDepaIsNull() {
            addCriterion("de_anpc_depa is null");
            return (Criteria) this;
        }

        public Criteria andStrAnpcDepaIsNotNull() {
            addCriterion("de_anpc_depa is not null");
            return (Criteria) this;
        }

        public Criteria andStrAnpcDepaGreaterThan(String value) {
            addCriterion("de_anpc_depa >", value, "de_anpc_depa");
            return (Criteria) this;
        }

        public Criteria andStrAnpcDepaGreaterThanOrEqualTo(String value) {
            addCriterion("de_anpc_depa >=", value, "de_anpc_depa");
            return (Criteria) this;
        }

        public Criteria andStrAnpcDepaLessThan(String value) {
            addCriterion("de_anpc_depa <", value, "de_anpc_depa");
            return (Criteria) this;
        }

        public Criteria andStrAnpcDepaLessThanOrEqualTo(String value) {
            addCriterion("de_anpc_depa <=", value, "de_anpc_depa");
            return (Criteria) this;
        }

        public Criteria andStrAnpcDepaIn(List<String> values) {
            addCriterion("de_anpc_depa in", values, "de_anpc_depa");
            return (Criteria) this;
        }

        public Criteria andStrAnpcDepaNotIn(List<String> values) {
            addCriterion("de_anpc_depa not in", values, "de_anpc_depa");
            return (Criteria) this;
        }

        public Criteria andStrAnpcDepaBetween(String value1, String value2) {
            addCriterion("de_anpc_depa between", value1, value2, "de_anpc_depa");
            return (Criteria) this;
        }

        public Criteria andStrAnpcDepaNotBetween(String value1, String value2) {
            addCriterion("de_anpc_depa not between", value1, value2, "de_anpc_depa");
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
