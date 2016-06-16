package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class BasLimAmazoniaParamDef {
		
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected String strHashConsulta;
	
    public BasLimAmazoniaParamDef() {
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
        
        
        public Criteria andStrSimbCobveLike(String value) {
            addCriterion("upper(de_simb_cobve) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_simb_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbCobveNotLike(String value) {
            addCriterion("de_simb_cobve not like", "%" + CadenaUtil.getStr(value) + "%", "de_simb_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbCobveEqualTo(String value) {
            addCriterion("de_simb_cobve =", CadenaUtil.getStr(value), "de_simb_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbCobveNotEqualTo(String value) {
            addCriterion("de_simb_cobve <>", CadenaUtil.getStr(value), "de_simb_cobve");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSimbCobveIsNull() {
            addCriterion("de_simb_cobve is null");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbCobveIsNotNull() {
            addCriterion("de_simb_cobve is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbCobveGreaterThan(String value) {
            addCriterion("de_simb_cobve >", value, "de_simb_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbCobveGreaterThanOrEqualTo(String value) {
            addCriterion("de_simb_cobve >=", value, "de_simb_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbCobveLessThan(String value) {
            addCriterion("de_simb_cobve <", value, "de_simb_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbCobveLessThanOrEqualTo(String value) {
            addCriterion("de_simb_cobve <=", value, "de_simb_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbCobveIn(List<String> values) {
            addCriterion("de_simb_cobve in", values, "de_simb_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbCobveNotIn(List<String> values) {
            addCriterion("de_simb_cobve not in", values, "de_simb_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbCobveBetween(String value1, String value2) {
            addCriterion("de_simb_cobve between", value1, value2, "de_simb_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbCobveNotBetween(String value1, String value2) {
            addCriterion("de_simb_cobve not between", value1, value2, "de_simb_cobve");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDescCobveLike(String value) {
            addCriterion("upper(de_desc_cobve) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_desc_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrDescCobveNotLike(String value) {
            addCriterion("de_desc_cobve not like", "%" + CadenaUtil.getStr(value) + "%", "de_desc_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrDescCobveEqualTo(String value) {
            addCriterion("de_desc_cobve =", CadenaUtil.getStr(value), "de_desc_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrDescCobveNotEqualTo(String value) {
            addCriterion("de_desc_cobve <>", CadenaUtil.getStr(value), "de_desc_cobve");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDescCobveIsNull() {
            addCriterion("de_desc_cobve is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDescCobveIsNotNull() {
            addCriterion("de_desc_cobve is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDescCobveGreaterThan(String value) {
            addCriterion("de_desc_cobve >", value, "de_desc_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrDescCobveGreaterThanOrEqualTo(String value) {
            addCriterion("de_desc_cobve >=", value, "de_desc_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrDescCobveLessThan(String value) {
            addCriterion("de_desc_cobve <", value, "de_desc_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrDescCobveLessThanOrEqualTo(String value) {
            addCriterion("de_desc_cobve <=", value, "de_desc_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrDescCobveIn(List<String> values) {
            addCriterion("de_desc_cobve in", values, "de_desc_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrDescCobveNotIn(List<String> values) {
            addCriterion("de_desc_cobve not in", values, "de_desc_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrDescCobveBetween(String value1, String value2) {
            addCriterion("de_desc_cobve between", value1, value2, "de_desc_cobve");
            return (Criteria) this;
        }
        
        public Criteria andStrDescCobveNotBetween(String value1, String value2) {
            addCriterion("de_desc_cobve not between", value1, value2, "de_desc_cobve");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSimbDeforLike(String value) {
            addCriterion("upper(de_simb_defor) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_simb_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbDeforNotLike(String value) {
            addCriterion("de_simb_defor not like", "%" + CadenaUtil.getStr(value) + "%", "de_simb_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbDeforEqualTo(String value) {
            addCriterion("de_simb_defor =", CadenaUtil.getStr(value), "de_simb_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbDeforNotEqualTo(String value) {
            addCriterion("de_simb_defor <>", CadenaUtil.getStr(value), "de_simb_defor");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSimbDeforIsNull() {
            addCriterion("de_simb_defor is null");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbDeforIsNotNull() {
            addCriterion("de_simb_defor is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbDeforGreaterThan(String value) {
            addCriterion("de_simb_defor >", value, "de_simb_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbDeforGreaterThanOrEqualTo(String value) {
            addCriterion("de_simb_defor >=", value, "de_simb_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbDeforLessThan(String value) {
            addCriterion("de_simb_defor <", value, "de_simb_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbDeforLessThanOrEqualTo(String value) {
            addCriterion("de_simb_defor <=", value, "de_simb_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbDeforIn(List<String> values) {
            addCriterion("de_simb_defor in", values, "de_simb_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbDeforNotIn(List<String> values) {
            addCriterion("de_simb_defor not in", values, "de_simb_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbDeforBetween(String value1, String value2) {
            addCriterion("de_simb_defor between", value1, value2, "de_simb_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrSimbDeforNotBetween(String value1, String value2) {
            addCriterion("de_simb_defor not between", value1, value2, "de_simb_defor");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDescDeforLike(String value) {
            addCriterion("upper(de_desc_defor) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_desc_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrDescDeforNotLike(String value) {
            addCriterion("de_desc_defor not like", "%" + CadenaUtil.getStr(value) + "%", "de_desc_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrDescDeforEqualTo(String value) {
            addCriterion("de_desc_defor =", CadenaUtil.getStr(value), "de_desc_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrDescDeforNotEqualTo(String value) {
            addCriterion("de_desc_defor <>", CadenaUtil.getStr(value), "de_desc_defor");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDescDeforIsNull() {
            addCriterion("de_desc_defor is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDescDeforIsNotNull() {
            addCriterion("de_desc_defor is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDescDeforGreaterThan(String value) {
            addCriterion("de_desc_defor >", value, "de_desc_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrDescDeforGreaterThanOrEqualTo(String value) {
            addCriterion("de_desc_defor >=", value, "de_desc_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrDescDeforLessThan(String value) {
            addCriterion("de_desc_defor <", value, "de_desc_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrDescDeforLessThanOrEqualTo(String value) {
            addCriterion("de_desc_defor <=", value, "de_desc_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrDescDeforIn(List<String> values) {
            addCriterion("de_desc_defor in", values, "de_desc_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrDescDeforNotIn(List<String> values) {
            addCriterion("de_desc_defor not in", values, "de_desc_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrDescDeforBetween(String value1, String value2) {
            addCriterion("de_desc_defor between", value1, value2, "de_desc_defor");
            return (Criteria) this;
        }
        
        public Criteria andStrDescDeforNotBetween(String value1, String value2) {
            addCriterion("de_desc_defor not between", value1, value2, "de_desc_defor");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSuperfM2EqualTo(Double value) {
            addCriterion("ha_superf_m2 =", value, "ha_superf_m2");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfM2NotEqualTo(Double value) {
            addCriterion("ha_superf_m2 <>", value, "ha_superf_m2");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSuperfM2IsNull() {
            addCriterion("ha_superf_m2 is null");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfM2IsNotNull() {
            addCriterion("ha_superf_m2 is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfM2GreaterThan(Double value) {
            addCriterion("ha_superf_m2 >", value, "ha_superf_m2");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfM2GreaterThanOrEqualTo(Double value) {
            addCriterion("ha_superf_m2 >=", value, "ha_superf_m2");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfM2LessThan(Double value) {
            addCriterion("ha_superf_m2 <", value, "ha_superf_m2");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfM2LessThanOrEqualTo(Double value) {
            addCriterion("ha_superf_m2 <=", value, "ha_superf_m2");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfM2In(List<Double> values) {
            addCriterion("ha_superf_m2 in", values, "ha_superf_m2");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfM2NotIn(List<Double> values) {
            addCriterion("ha_superf_m2 not in", values, "ha_superf_m2");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfM2Between(Double value1, Double value2) {
            addCriterion("ha_superf_m2 between", value1, value2, "ha_superf_m2");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfM2NotBetween(Double value1, Double value2) {
            addCriterion("ha_superf_m2 not between", value1, value2, "ha_superf_m2");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSuperfHaEqualTo(Double value) {
            addCriterion("ha_superf_ha =", value, "ha_superf_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfHaNotEqualTo(Double value) {
            addCriterion("ha_superf_ha <>", value, "ha_superf_ha");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSuperfHaIsNull() {
            addCriterion("ha_superf_ha is null");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfHaIsNotNull() {
            addCriterion("ha_superf_ha is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfHaGreaterThan(Double value) {
            addCriterion("ha_superf_ha >", value, "ha_superf_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfHaGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_superf_ha >=", value, "ha_superf_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfHaLessThan(Double value) {
            addCriterion("ha_superf_ha <", value, "ha_superf_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfHaLessThanOrEqualTo(Double value) {
            addCriterion("ha_superf_ha <=", value, "ha_superf_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfHaIn(List<Double> values) {
            addCriterion("ha_superf_ha in", values, "ha_superf_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfHaNotIn(List<Double> values) {
            addCriterion("ha_superf_ha not in", values, "ha_superf_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfHaBetween(Double value1, Double value2) {
            addCriterion("ha_superf_ha between", value1, value2, "ha_superf_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfHaNotBetween(Double value1, Double value2) {
            addCriterion("ha_superf_ha not between", value1, value2, "ha_superf_ha");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSimCvDefLike(String value) {
            addCriterion("upper(de_sim_cv_def) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_sim_cv_def");
            return (Criteria) this;
        }
        
        public Criteria andStrSimCvDefNotLike(String value) {
            addCriterion("de_sim_cv_def not like", "%" + CadenaUtil.getStr(value) + "%", "de_sim_cv_def");
            return (Criteria) this;
        }
        
        public Criteria andStrSimCvDefEqualTo(String value) {
            addCriterion("de_sim_cv_def =", CadenaUtil.getStr(value), "de_sim_cv_def");
            return (Criteria) this;
        }
        
        public Criteria andStrSimCvDefNotEqualTo(String value) {
            addCriterion("de_sim_cv_def <>", CadenaUtil.getStr(value), "de_sim_cv_def");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSimCvDefIsNull() {
            addCriterion("de_sim_cv_def is null");
            return (Criteria) this;
        }
        
        public Criteria andStrSimCvDefIsNotNull() {
            addCriterion("de_sim_cv_def is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrSimCvDefGreaterThan(String value) {
            addCriterion("de_sim_cv_def >", value, "de_sim_cv_def");
            return (Criteria) this;
        }
        
        public Criteria andStrSimCvDefGreaterThanOrEqualTo(String value) {
            addCriterion("de_sim_cv_def >=", value, "de_sim_cv_def");
            return (Criteria) this;
        }
        
        public Criteria andStrSimCvDefLessThan(String value) {
            addCriterion("de_sim_cv_def <", value, "de_sim_cv_def");
            return (Criteria) this;
        }
        
        public Criteria andStrSimCvDefLessThanOrEqualTo(String value) {
            addCriterion("de_sim_cv_def <=", value, "de_sim_cv_def");
            return (Criteria) this;
        }
        
        public Criteria andStrSimCvDefIn(List<String> values) {
            addCriterion("de_sim_cv_def in", values, "de_sim_cv_def");
            return (Criteria) this;
        }
        
        public Criteria andStrSimCvDefNotIn(List<String> values) {
            addCriterion("de_sim_cv_def not in", values, "de_sim_cv_def");
            return (Criteria) this;
        }
        
        public Criteria andStrSimCvDefBetween(String value1, String value2) {
            addCriterion("de_sim_cv_def between", value1, value2, "de_sim_cv_def");
            return (Criteria) this;
        }
        
        public Criteria andStrSimCvDefNotBetween(String value1, String value2) {
            addCriterion("de_sim_cv_def not between", value1, value2, "de_sim_cv_def");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSuperfKm2EqualTo(Double value) {
            addCriterion("ha_superf_km2 =", value, "ha_superf_km2");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfKm2NotEqualTo(Double value) {
            addCriterion("ha_superf_km2 <>", value, "ha_superf_km2");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSuperfKm2IsNull() {
            addCriterion("ha_superf_km2 is null");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfKm2IsNotNull() {
            addCriterion("ha_superf_km2 is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfKm2GreaterThan(Double value) {
            addCriterion("ha_superf_km2 >", value, "ha_superf_km2");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfKm2GreaterThanOrEqualTo(Double value) {
            addCriterion("ha_superf_km2 >=", value, "ha_superf_km2");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfKm2LessThan(Double value) {
            addCriterion("ha_superf_km2 <", value, "ha_superf_km2");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfKm2LessThanOrEqualTo(Double value) {
            addCriterion("ha_superf_km2 <=", value, "ha_superf_km2");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfKm2In(List<Double> values) {
            addCriterion("ha_superf_km2 in", values, "ha_superf_km2");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfKm2NotIn(List<Double> values) {
            addCriterion("ha_superf_km2 not in", values, "ha_superf_km2");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfKm2Between(Double value1, Double value2) {
            addCriterion("ha_superf_km2 between", value1, value2, "ha_superf_km2");
            return (Criteria) this;
        }
        
        public Criteria andDblSuperfKm2NotBetween(Double value1, Double value2) {
            addCriterion("ha_superf_km2 not between", value1, value2, "ha_superf_km2");
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
