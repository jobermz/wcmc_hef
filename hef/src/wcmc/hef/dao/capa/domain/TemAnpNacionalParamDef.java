package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class TemAnpNacionalParamDef {
		
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected String strHashConsulta;
	
    public TemAnpNacionalParamDef() {
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
        
        
        public Criteria andLngObjectidEqualTo(Long value) {
            addCriterion("cd_objectid =", value, "cd_objectid");
            return (Criteria) this;
        }
        
        public Criteria andLngObjectidNotEqualTo(Long value) {
            addCriterion("cd_objectid <>", value, "cd_objectid");
            return (Criteria) this;
        }
        
        
        public Criteria andLngObjectidIsNull() {
            addCriterion("cd_objectid is null");
            return (Criteria) this;
        }
        
        public Criteria andLngObjectidIsNotNull() {
            addCriterion("cd_objectid is not null");
            return (Criteria) this;
        }
        
        public Criteria andLngObjectidGreaterThan(Long value) {
            addCriterion("cd_objectid >", value, "cd_objectid");
            return (Criteria) this;
        }
        
        public Criteria andLngObjectidGreaterThanOrEqualTo(Long value) {
            addCriterion("cd_objectid >=", value, "cd_objectid");
            return (Criteria) this;
        }
        
        public Criteria andLngObjectidLessThan(Long value) {
            addCriterion("cd_objectid <", value, "cd_objectid");
            return (Criteria) this;
        }
        
        public Criteria andLngObjectidLessThanOrEqualTo(Long value) {
            addCriterion("cd_objectid <=", value, "cd_objectid");
            return (Criteria) this;
        }
        
        public Criteria andLngObjectidIn(List<Long> values) {
            addCriterion("cd_objectid in", values, "cd_objectid");
            return (Criteria) this;
        }
        
        public Criteria andLngObjectidNotIn(List<Long> values) {
            addCriterion("cd_objectid not in", values, "cd_objectid");
            return (Criteria) this;
        }
        
        public Criteria andLngObjectidBetween(Long value1, Long value2) {
            addCriterion("cd_objectid between", value1, value2, "cd_objectid");
            return (Criteria) this;
        }
        
        public Criteria andLngObjectidNotBetween(Long value1, Long value2) {
            addCriterion("cd_objectid not between", value1, value2, "cd_objectid");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpCateLike(String value) {
            addCriterion("upper(de_anp_cate) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anp_cate");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCateNotLike(String value) {
            addCriterion("de_anp_cate not like", "%" + CadenaUtil.getStr(value) + "%", "de_anp_cate");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCateEqualTo(String value) {
            addCriterion("de_anp_cate =", CadenaUtil.getStr(value), "de_anp_cate");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCateNotEqualTo(String value) {
            addCriterion("de_anp_cate <>", CadenaUtil.getStr(value), "de_anp_cate");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpCateIsNull() {
            addCriterion("de_anp_cate is null");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCateIsNotNull() {
            addCriterion("de_anp_cate is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCateGreaterThan(String value) {
            addCriterion("de_anp_cate >", value, "de_anp_cate");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCateGreaterThanOrEqualTo(String value) {
            addCriterion("de_anp_cate >=", value, "de_anp_cate");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCateLessThan(String value) {
            addCriterion("de_anp_cate <", value, "de_anp_cate");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCateLessThanOrEqualTo(String value) {
            addCriterion("de_anp_cate <=", value, "de_anp_cate");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCateIn(List<String> values) {
            addCriterion("de_anp_cate in", values, "de_anp_cate");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCateNotIn(List<String> values) {
            addCriterion("de_anp_cate not in", values, "de_anp_cate");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCateBetween(String value1, String value2) {
            addCriterion("de_anp_cate between", value1, value2, "de_anp_cate");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCateNotBetween(String value1, String value2) {
            addCriterion("de_anp_cate not between", value1, value2, "de_anp_cate");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpNombLike(String value) {
            addCriterion("upper(de_anp_nomb) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anp_nomb");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpNombNotLike(String value) {
            addCriterion("de_anp_nomb not like", "%" + CadenaUtil.getStr(value) + "%", "de_anp_nomb");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpNombEqualTo(String value) {
            addCriterion("de_anp_nomb =", CadenaUtil.getStr(value), "de_anp_nomb");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpNombNotEqualTo(String value) {
            addCriterion("de_anp_nomb <>", CadenaUtil.getStr(value), "de_anp_nomb");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpNombIsNull() {
            addCriterion("de_anp_nomb is null");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpNombIsNotNull() {
            addCriterion("de_anp_nomb is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpNombGreaterThan(String value) {
            addCriterion("de_anp_nomb >", value, "de_anp_nomb");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpNombGreaterThanOrEqualTo(String value) {
            addCriterion("de_anp_nomb >=", value, "de_anp_nomb");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpNombLessThan(String value) {
            addCriterion("de_anp_nomb <", value, "de_anp_nomb");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpNombLessThanOrEqualTo(String value) {
            addCriterion("de_anp_nomb <=", value, "de_anp_nomb");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpNombIn(List<String> values) {
            addCriterion("de_anp_nomb in", values, "de_anp_nomb");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpNombNotIn(List<String> values) {
            addCriterion("de_anp_nomb not in", values, "de_anp_nomb");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpNombBetween(String value1, String value2) {
            addCriterion("de_anp_nomb between", value1, value2, "de_anp_nomb");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpNombNotBetween(String value1, String value2) {
            addCriterion("de_anp_nomb not between", value1, value2, "de_anp_nomb");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpCodiLike(String value) {
            addCriterion("upper(de_anp_codi) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anp_codi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCodiNotLike(String value) {
            addCriterion("de_anp_codi not like", "%" + CadenaUtil.getStr(value) + "%", "de_anp_codi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCodiEqualTo(String value) {
            addCriterion("de_anp_codi =", CadenaUtil.getStr(value), "de_anp_codi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCodiNotEqualTo(String value) {
            addCriterion("de_anp_codi <>", CadenaUtil.getStr(value), "de_anp_codi");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpCodiIsNull() {
            addCriterion("de_anp_codi is null");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCodiIsNotNull() {
            addCriterion("de_anp_codi is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCodiGreaterThan(String value) {
            addCriterion("de_anp_codi >", value, "de_anp_codi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCodiGreaterThanOrEqualTo(String value) {
            addCriterion("de_anp_codi >=", value, "de_anp_codi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCodiLessThan(String value) {
            addCriterion("de_anp_codi <", value, "de_anp_codi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCodiLessThanOrEqualTo(String value) {
            addCriterion("de_anp_codi <=", value, "de_anp_codi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCodiIn(List<String> values) {
            addCriterion("de_anp_codi in", values, "de_anp_codi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCodiNotIn(List<String> values) {
            addCriterion("de_anp_codi not in", values, "de_anp_codi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCodiBetween(String value1, String value2) {
            addCriterion("de_anp_codi between", value1, value2, "de_anp_codi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpCodiNotBetween(String value1, String value2) {
            addCriterion("de_anp_codi not between", value1, value2, "de_anp_codi");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpUbpoLike(String value) {
            addCriterion("upper(de_anp_ubpo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anp_ubpo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpUbpoNotLike(String value) {
            addCriterion("de_anp_ubpo not like", "%" + CadenaUtil.getStr(value) + "%", "de_anp_ubpo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpUbpoEqualTo(String value) {
            addCriterion("de_anp_ubpo =", CadenaUtil.getStr(value), "de_anp_ubpo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpUbpoNotEqualTo(String value) {
            addCriterion("de_anp_ubpo <>", CadenaUtil.getStr(value), "de_anp_ubpo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpUbpoIsNull() {
            addCriterion("de_anp_ubpo is null");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpUbpoIsNotNull() {
            addCriterion("de_anp_ubpo is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpUbpoGreaterThan(String value) {
            addCriterion("de_anp_ubpo >", value, "de_anp_ubpo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpUbpoGreaterThanOrEqualTo(String value) {
            addCriterion("de_anp_ubpo >=", value, "de_anp_ubpo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpUbpoLessThan(String value) {
            addCriterion("de_anp_ubpo <", value, "de_anp_ubpo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpUbpoLessThanOrEqualTo(String value) {
            addCriterion("de_anp_ubpo <=", value, "de_anp_ubpo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpUbpoIn(List<String> values) {
            addCriterion("de_anp_ubpo in", values, "de_anp_ubpo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpUbpoNotIn(List<String> values) {
            addCriterion("de_anp_ubpo not in", values, "de_anp_ubpo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpUbpoBetween(String value1, String value2) {
            addCriterion("de_anp_ubpo between", value1, value2, "de_anp_ubpo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpUbpoNotBetween(String value1, String value2) {
            addCriterion("de_anp_ubpo not between", value1, value2, "de_anp_ubpo");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAnpArleEqualTo(Double value) {
            addCriterion("ha_anp_arle =", value, "ha_anp_arle");
            return (Criteria) this;
        }
        
        public Criteria andDblAnpArleNotEqualTo(Double value) {
            addCriterion("ha_anp_arle <>", value, "ha_anp_arle");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAnpArleIsNull() {
            addCriterion("ha_anp_arle is null");
            return (Criteria) this;
        }
        
        public Criteria andDblAnpArleIsNotNull() {
            addCriterion("ha_anp_arle is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblAnpArleGreaterThan(Double value) {
            addCriterion("ha_anp_arle >", value, "ha_anp_arle");
            return (Criteria) this;
        }
        
        public Criteria andDblAnpArleGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_anp_arle >=", value, "ha_anp_arle");
            return (Criteria) this;
        }
        
        public Criteria andDblAnpArleLessThan(Double value) {
            addCriterion("ha_anp_arle <", value, "ha_anp_arle");
            return (Criteria) this;
        }
        
        public Criteria andDblAnpArleLessThanOrEqualTo(Double value) {
            addCriterion("ha_anp_arle <=", value, "ha_anp_arle");
            return (Criteria) this;
        }
        
        public Criteria andDblAnpArleIn(List<Double> values) {
            addCriterion("ha_anp_arle in", values, "ha_anp_arle");
            return (Criteria) this;
        }
        
        public Criteria andDblAnpArleNotIn(List<Double> values) {
            addCriterion("ha_anp_arle not in", values, "ha_anp_arle");
            return (Criteria) this;
        }
        
        public Criteria andDblAnpArleBetween(Double value1, Double value2) {
            addCriterion("ha_anp_arle between", value1, value2, "ha_anp_arle");
            return (Criteria) this;
        }
        
        public Criteria andDblAnpArleNotBetween(Double value1, Double value2) {
            addCriterion("ha_anp_arle not between", value1, value2, "ha_anp_arle");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpBalecrLike(String value) {
            addCriterion("upper(de_anp_balecr) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anp_balecr");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalecrNotLike(String value) {
            addCriterion("de_anp_balecr not like", "%" + CadenaUtil.getStr(value) + "%", "de_anp_balecr");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalecrEqualTo(String value) {
            addCriterion("de_anp_balecr =", CadenaUtil.getStr(value), "de_anp_balecr");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalecrNotEqualTo(String value) {
            addCriterion("de_anp_balecr <>", CadenaUtil.getStr(value), "de_anp_balecr");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpBalecrIsNull() {
            addCriterion("de_anp_balecr is null");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalecrIsNotNull() {
            addCriterion("de_anp_balecr is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalecrGreaterThan(String value) {
            addCriterion("de_anp_balecr >", value, "de_anp_balecr");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalecrGreaterThanOrEqualTo(String value) {
            addCriterion("de_anp_balecr >=", value, "de_anp_balecr");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalecrLessThan(String value) {
            addCriterion("de_anp_balecr <", value, "de_anp_balecr");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalecrLessThanOrEqualTo(String value) {
            addCriterion("de_anp_balecr <=", value, "de_anp_balecr");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalecrIn(List<String> values) {
            addCriterion("de_anp_balecr in", values, "de_anp_balecr");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalecrNotIn(List<String> values) {
            addCriterion("de_anp_balecr not in", values, "de_anp_balecr");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalecrBetween(String value1, String value2) {
            addCriterion("de_anp_balecr between", value1, value2, "de_anp_balecr");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalecrNotBetween(String value1, String value2) {
            addCriterion("de_anp_balecr not between", value1, value2, "de_anp_balecr");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpFecreaLike(String value) {
            addCriterion("upper(de_anp_fecrea) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anp_fecrea");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFecreaNotLike(String value) {
            addCriterion("de_anp_fecrea not like", "%" + CadenaUtil.getStr(value) + "%", "de_anp_fecrea");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFecreaEqualTo(String value) {
            addCriterion("de_anp_fecrea =", CadenaUtil.getStr(value), "de_anp_fecrea");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFecreaNotEqualTo(String value) {
            addCriterion("de_anp_fecrea <>", CadenaUtil.getStr(value), "de_anp_fecrea");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpFecreaIsNull() {
            addCriterion("de_anp_fecrea is null");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFecreaIsNotNull() {
            addCriterion("de_anp_fecrea is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFecreaGreaterThan(String value) {
            addCriterion("de_anp_fecrea >", value, "de_anp_fecrea");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFecreaGreaterThanOrEqualTo(String value) {
            addCriterion("de_anp_fecrea >=", value, "de_anp_fecrea");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFecreaLessThan(String value) {
            addCriterion("de_anp_fecrea <", value, "de_anp_fecrea");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFecreaLessThanOrEqualTo(String value) {
            addCriterion("de_anp_fecrea <=", value, "de_anp_fecrea");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFecreaIn(List<String> values) {
            addCriterion("de_anp_fecrea in", values, "de_anp_fecrea");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFecreaNotIn(List<String> values) {
            addCriterion("de_anp_fecrea not in", values, "de_anp_fecrea");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFecreaBetween(String value1, String value2) {
            addCriterion("de_anp_fecrea between", value1, value2, "de_anp_fecrea");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFecreaNotBetween(String value1, String value2) {
            addCriterion("de_anp_fecrea not between", value1, value2, "de_anp_fecrea");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpBalemoLike(String value) {
            addCriterion("upper(de_anp_balemo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anp_balemo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalemoNotLike(String value) {
            addCriterion("de_anp_balemo not like", "%" + CadenaUtil.getStr(value) + "%", "de_anp_balemo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalemoEqualTo(String value) {
            addCriterion("de_anp_balemo =", CadenaUtil.getStr(value), "de_anp_balemo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalemoNotEqualTo(String value) {
            addCriterion("de_anp_balemo <>", CadenaUtil.getStr(value), "de_anp_balemo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpBalemoIsNull() {
            addCriterion("de_anp_balemo is null");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalemoIsNotNull() {
            addCriterion("de_anp_balemo is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalemoGreaterThan(String value) {
            addCriterion("de_anp_balemo >", value, "de_anp_balemo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalemoGreaterThanOrEqualTo(String value) {
            addCriterion("de_anp_balemo >=", value, "de_anp_balemo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalemoLessThan(String value) {
            addCriterion("de_anp_balemo <", value, "de_anp_balemo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalemoLessThanOrEqualTo(String value) {
            addCriterion("de_anp_balemo <=", value, "de_anp_balemo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalemoIn(List<String> values) {
            addCriterion("de_anp_balemo in", values, "de_anp_balemo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalemoNotIn(List<String> values) {
            addCriterion("de_anp_balemo not in", values, "de_anp_balemo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalemoBetween(String value1, String value2) {
            addCriterion("de_anp_balemo between", value1, value2, "de_anp_balemo");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpBalemoNotBetween(String value1, String value2) {
            addCriterion("de_anp_balemo not between", value1, value2, "de_anp_balemo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpFemodiLike(String value) {
            addCriterion("upper(de_anp_femodi) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_anp_femodi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFemodiNotLike(String value) {
            addCriterion("de_anp_femodi not like", "%" + CadenaUtil.getStr(value) + "%", "de_anp_femodi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFemodiEqualTo(String value) {
            addCriterion("de_anp_femodi =", CadenaUtil.getStr(value), "de_anp_femodi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFemodiNotEqualTo(String value) {
            addCriterion("de_anp_femodi <>", CadenaUtil.getStr(value), "de_anp_femodi");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAnpFemodiIsNull() {
            addCriterion("de_anp_femodi is null");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFemodiIsNotNull() {
            addCriterion("de_anp_femodi is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFemodiGreaterThan(String value) {
            addCriterion("de_anp_femodi >", value, "de_anp_femodi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFemodiGreaterThanOrEqualTo(String value) {
            addCriterion("de_anp_femodi >=", value, "de_anp_femodi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFemodiLessThan(String value) {
            addCriterion("de_anp_femodi <", value, "de_anp_femodi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFemodiLessThanOrEqualTo(String value) {
            addCriterion("de_anp_femodi <=", value, "de_anp_femodi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFemodiIn(List<String> values) {
            addCriterion("de_anp_femodi in", values, "de_anp_femodi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFemodiNotIn(List<String> values) {
            addCriterion("de_anp_femodi not in", values, "de_anp_femodi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFemodiBetween(String value1, String value2) {
            addCriterion("de_anp_femodi between", value1, value2, "de_anp_femodi");
            return (Criteria) this;
        }
        
        public Criteria andStrAnpFemodiNotBetween(String value1, String value2) {
            addCriterion("de_anp_femodi not between", value1, value2, "de_anp_femodi");
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
