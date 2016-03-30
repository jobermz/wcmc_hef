package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class TemCentrosPobladosParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected String strHashConsulta;
	
    public TemCentrosPobladosParamDef() {
        oredCriteria = new ArrayList<Criteria>();
    }
	
    public void setStrHashConsulta(String strHashConsulta) {
    	if(CadenaUtil.getStrNull(strHashConsulta) != null) {
        	this.strHashConsulta = " inner join wcmc_hef.tem_query_acl qry on de_hash_consulta = '"+CadenaUtil.getStr(strHashConsulta)+"' and ST_Intersects(ST_Transform(si_the_geom, 32718), cd_rast) ";
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
        	addCriterion("ST_Intersects(si_the_geom, ST_GeomFromText('"+CadenaUtil.getStr(value)+"',4326)) ");
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
        
        
        public Criteria andStrIdccpp10Like(String value) {
            addCriterion("upper(de_idccpp10) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_idccpp10");
            return (Criteria) this;
        }
        
        public Criteria andStrIdccpp10NotLike(String value) {
            addCriterion("de_idccpp10 not like", "%" + CadenaUtil.getStr(value) + "%", "de_idccpp10");
            return (Criteria) this;
        }
        
        public Criteria andStrIdccpp10EqualTo(String value) {
            addCriterion("de_idccpp10 =", CadenaUtil.getStr(value), "de_idccpp10");
            return (Criteria) this;
        }
        
        public Criteria andStrIdccpp10NotEqualTo(String value) {
            addCriterion("de_idccpp10 <>", CadenaUtil.getStr(value), "de_idccpp10");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIdccpp10IsNull() {
            addCriterion("de_idccpp10 is null");
            return (Criteria) this;
        }
        
        public Criteria andStrIdccpp10IsNotNull() {
            addCriterion("de_idccpp10 is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrIdccpp10GreaterThan(String value) {
            addCriterion("de_idccpp10 >", value, "de_idccpp10");
            return (Criteria) this;
        }
        
        public Criteria andStrIdccpp10GreaterThanOrEqualTo(String value) {
            addCriterion("de_idccpp10 >=", value, "de_idccpp10");
            return (Criteria) this;
        }
        
        public Criteria andStrIdccpp10LessThan(String value) {
            addCriterion("de_idccpp10 <", value, "de_idccpp10");
            return (Criteria) this;
        }
        
        public Criteria andStrIdccpp10LessThanOrEqualTo(String value) {
            addCriterion("de_idccpp10 <=", value, "de_idccpp10");
            return (Criteria) this;
        }
        
        public Criteria andStrIdccpp10In(List<String> values) {
            addCriterion("de_idccpp10 in", values, "de_idccpp10");
            return (Criteria) this;
        }
        
        public Criteria andStrIdccpp10NotIn(List<String> values) {
            addCriterion("de_idccpp10 not in", values, "de_idccpp10");
            return (Criteria) this;
        }
        
        public Criteria andStrIdccpp10Between(String value1, String value2) {
            addCriterion("de_idccpp10 between", value1, value2, "de_idccpp10");
            return (Criteria) this;
        }
        
        public Criteria andStrIdccpp10NotBetween(String value1, String value2) {
            addCriterion("de_idccpp10 not between", value1, value2, "de_idccpp10");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAreaLike(String value) {
            addCriterion("upper(de_area) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_area");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaNotLike(String value) {
            addCriterion("de_area not like", "%" + CadenaUtil.getStr(value) + "%", "de_area");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaEqualTo(String value) {
            addCriterion("de_area =", CadenaUtil.getStr(value), "de_area");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaNotEqualTo(String value) {
            addCriterion("de_area <>", CadenaUtil.getStr(value), "de_area");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAreaIsNull() {
            addCriterion("de_area is null");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaIsNotNull() {
            addCriterion("de_area is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaGreaterThan(String value) {
            addCriterion("de_area >", value, "de_area");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaGreaterThanOrEqualTo(String value) {
            addCriterion("de_area >=", value, "de_area");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaLessThan(String value) {
            addCriterion("de_area <", value, "de_area");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaLessThanOrEqualTo(String value) {
            addCriterion("de_area <=", value, "de_area");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaIn(List<String> values) {
            addCriterion("de_area in", values, "de_area");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaNotIn(List<String> values) {
            addCriterion("de_area not in", values, "de_area");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaBetween(String value1, String value2) {
            addCriterion("de_area between", value1, value2, "de_area");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaNotBetween(String value1, String value2) {
            addCriterion("de_area not between", value1, value2, "de_area");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCodccppLike(String value) {
            addCriterion("upper(de_codccpp) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_codccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCodccppNotLike(String value) {
            addCriterion("de_codccpp not like", "%" + CadenaUtil.getStr(value) + "%", "de_codccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCodccppEqualTo(String value) {
            addCriterion("de_codccpp =", CadenaUtil.getStr(value), "de_codccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCodccppNotEqualTo(String value) {
            addCriterion("de_codccpp <>", CadenaUtil.getStr(value), "de_codccpp");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCodccppIsNull() {
            addCriterion("de_codccpp is null");
            return (Criteria) this;
        }
        
        public Criteria andStrCodccppIsNotNull() {
            addCriterion("de_codccpp is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrCodccppGreaterThan(String value) {
            addCriterion("de_codccpp >", value, "de_codccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCodccppGreaterThanOrEqualTo(String value) {
            addCriterion("de_codccpp >=", value, "de_codccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCodccppLessThan(String value) {
            addCriterion("de_codccpp <", value, "de_codccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCodccppLessThanOrEqualTo(String value) {
            addCriterion("de_codccpp <=", value, "de_codccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCodccppIn(List<String> values) {
            addCriterion("de_codccpp in", values, "de_codccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCodccppNotIn(List<String> values) {
            addCriterion("de_codccpp not in", values, "de_codccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCodccppBetween(String value1, String value2) {
            addCriterion("de_codccpp between", value1, value2, "de_codccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCodccppNotBetween(String value1, String value2) {
            addCriterion("de_codccpp not between", value1, value2, "de_codccpp");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomccppLike(String value) {
            addCriterion("upper(de_nomccpp) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_nomccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrNomccppNotLike(String value) {
            addCriterion("de_nomccpp not like", "%" + CadenaUtil.getStr(value) + "%", "de_nomccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrNomccppEqualTo(String value) {
            addCriterion("de_nomccpp =", CadenaUtil.getStr(value), "de_nomccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrNomccppNotEqualTo(String value) {
            addCriterion("de_nomccpp <>", CadenaUtil.getStr(value), "de_nomccpp");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomccppIsNull() {
            addCriterion("de_nomccpp is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomccppIsNotNull() {
            addCriterion("de_nomccpp is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomccppGreaterThan(String value) {
            addCriterion("de_nomccpp >", value, "de_nomccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrNomccppGreaterThanOrEqualTo(String value) {
            addCriterion("de_nomccpp >=", value, "de_nomccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrNomccppLessThan(String value) {
            addCriterion("de_nomccpp <", value, "de_nomccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrNomccppLessThanOrEqualTo(String value) {
            addCriterion("de_nomccpp <=", value, "de_nomccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrNomccppIn(List<String> values) {
            addCriterion("de_nomccpp in", values, "de_nomccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrNomccppNotIn(List<String> values) {
            addCriterion("de_nomccpp not in", values, "de_nomccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrNomccppBetween(String value1, String value2) {
            addCriterion("de_nomccpp between", value1, value2, "de_nomccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrNomccppNotBetween(String value1, String value2) {
            addCriterion("de_nomccpp not between", value1, value2, "de_nomccpp");
            return (Criteria) this;
        }
        
        
        public Criteria andStrUbigeoLike(String value) {
            addCriterion("upper(de_ubigeo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrUbigeoNotLike(String value) {
            addCriterion("de_ubigeo not like", "%" + CadenaUtil.getStr(value) + "%", "de_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrUbigeoEqualTo(String value) {
            addCriterion("de_ubigeo =", CadenaUtil.getStr(value), "de_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrUbigeoNotEqualTo(String value) {
            addCriterion("de_ubigeo <>", CadenaUtil.getStr(value), "de_ubigeo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrUbigeoIsNull() {
            addCriterion("de_ubigeo is null");
            return (Criteria) this;
        }
        
        public Criteria andStrUbigeoIsNotNull() {
            addCriterion("de_ubigeo is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrUbigeoGreaterThan(String value) {
            addCriterion("de_ubigeo >", value, "de_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrUbigeoGreaterThanOrEqualTo(String value) {
            addCriterion("de_ubigeo >=", value, "de_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrUbigeoLessThan(String value) {
            addCriterion("de_ubigeo <", value, "de_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrUbigeoLessThanOrEqualTo(String value) {
            addCriterion("de_ubigeo <=", value, "de_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrUbigeoIn(List<String> values) {
            addCriterion("de_ubigeo in", values, "de_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrUbigeoNotIn(List<String> values) {
            addCriterion("de_ubigeo not in", values, "de_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrUbigeoBetween(String value1, String value2) {
            addCriterion("de_ubigeo between", value1, value2, "de_ubigeo");
            return (Criteria) this;
        }
        
        public Criteria andStrUbigeoNotBetween(String value1, String value2) {
            addCriterion("de_ubigeo not between", value1, value2, "de_ubigeo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCcdiLike(String value) {
            addCriterion("upper(de_ccdi) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_ccdi");
            return (Criteria) this;
        }
        
        public Criteria andStrCcdiNotLike(String value) {
            addCriterion("de_ccdi not like", "%" + CadenaUtil.getStr(value) + "%", "de_ccdi");
            return (Criteria) this;
        }
        
        public Criteria andStrCcdiEqualTo(String value) {
            addCriterion("de_ccdi =", CadenaUtil.getStr(value), "de_ccdi");
            return (Criteria) this;
        }
        
        public Criteria andStrCcdiNotEqualTo(String value) {
            addCriterion("de_ccdi <>", CadenaUtil.getStr(value), "de_ccdi");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCcdiIsNull() {
            addCriterion("de_ccdi is null");
            return (Criteria) this;
        }
        
        public Criteria andStrCcdiIsNotNull() {
            addCriterion("de_ccdi is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrCcdiGreaterThan(String value) {
            addCriterion("de_ccdi >", value, "de_ccdi");
            return (Criteria) this;
        }
        
        public Criteria andStrCcdiGreaterThanOrEqualTo(String value) {
            addCriterion("de_ccdi >=", value, "de_ccdi");
            return (Criteria) this;
        }
        
        public Criteria andStrCcdiLessThan(String value) {
            addCriterion("de_ccdi <", value, "de_ccdi");
            return (Criteria) this;
        }
        
        public Criteria andStrCcdiLessThanOrEqualTo(String value) {
            addCriterion("de_ccdi <=", value, "de_ccdi");
            return (Criteria) this;
        }
        
        public Criteria andStrCcdiIn(List<String> values) {
            addCriterion("de_ccdi in", values, "de_ccdi");
            return (Criteria) this;
        }
        
        public Criteria andStrCcdiNotIn(List<String> values) {
            addCriterion("de_ccdi not in", values, "de_ccdi");
            return (Criteria) this;
        }
        
        public Criteria andStrCcdiBetween(String value1, String value2) {
            addCriterion("de_ccdi between", value1, value2, "de_ccdi");
            return (Criteria) this;
        }
        
        public Criteria andStrCcdiNotBetween(String value1, String value2) {
            addCriterion("de_ccdi not between", value1, value2, "de_ccdi");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCcppLike(String value) {
            addCriterion("upper(de_ccpp) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_ccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCcppNotLike(String value) {
            addCriterion("de_ccpp not like", "%" + CadenaUtil.getStr(value) + "%", "de_ccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCcppEqualTo(String value) {
            addCriterion("de_ccpp =", CadenaUtil.getStr(value), "de_ccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCcppNotEqualTo(String value) {
            addCriterion("de_ccpp <>", CadenaUtil.getStr(value), "de_ccpp");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCcppIsNull() {
            addCriterion("de_ccpp is null");
            return (Criteria) this;
        }
        
        public Criteria andStrCcppIsNotNull() {
            addCriterion("de_ccpp is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrCcppGreaterThan(String value) {
            addCriterion("de_ccpp >", value, "de_ccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCcppGreaterThanOrEqualTo(String value) {
            addCriterion("de_ccpp >=", value, "de_ccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCcppLessThan(String value) {
            addCriterion("de_ccpp <", value, "de_ccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCcppLessThanOrEqualTo(String value) {
            addCriterion("de_ccpp <=", value, "de_ccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCcppIn(List<String> values) {
            addCriterion("de_ccpp in", values, "de_ccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCcppNotIn(List<String> values) {
            addCriterion("de_ccpp not in", values, "de_ccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCcppBetween(String value1, String value2) {
            addCriterion("de_ccpp between", value1, value2, "de_ccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCcppNotBetween(String value1, String value2) {
            addCriterion("de_ccpp not between", value1, value2, "de_ccpp");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCcddLike(String value) {
            addCriterion("upper(de_ccdd) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_ccdd");
            return (Criteria) this;
        }
        
        public Criteria andStrCcddNotLike(String value) {
            addCriterion("de_ccdd not like", "%" + CadenaUtil.getStr(value) + "%", "de_ccdd");
            return (Criteria) this;
        }
        
        public Criteria andStrCcddEqualTo(String value) {
            addCriterion("de_ccdd =", CadenaUtil.getStr(value), "de_ccdd");
            return (Criteria) this;
        }
        
        public Criteria andStrCcddNotEqualTo(String value) {
            addCriterion("de_ccdd <>", CadenaUtil.getStr(value), "de_ccdd");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCcddIsNull() {
            addCriterion("de_ccdd is null");
            return (Criteria) this;
        }
        
        public Criteria andStrCcddIsNotNull() {
            addCriterion("de_ccdd is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrCcddGreaterThan(String value) {
            addCriterion("de_ccdd >", value, "de_ccdd");
            return (Criteria) this;
        }
        
        public Criteria andStrCcddGreaterThanOrEqualTo(String value) {
            addCriterion("de_ccdd >=", value, "de_ccdd");
            return (Criteria) this;
        }
        
        public Criteria andStrCcddLessThan(String value) {
            addCriterion("de_ccdd <", value, "de_ccdd");
            return (Criteria) this;
        }
        
        public Criteria andStrCcddLessThanOrEqualTo(String value) {
            addCriterion("de_ccdd <=", value, "de_ccdd");
            return (Criteria) this;
        }
        
        public Criteria andStrCcddIn(List<String> values) {
            addCriterion("de_ccdd in", values, "de_ccdd");
            return (Criteria) this;
        }
        
        public Criteria andStrCcddNotIn(List<String> values) {
            addCriterion("de_ccdd not in", values, "de_ccdd");
            return (Criteria) this;
        }
        
        public Criteria andStrCcddBetween(String value1, String value2) {
            addCriterion("de_ccdd between", value1, value2, "de_ccdd");
            return (Criteria) this;
        }
        
        public Criteria andStrCcddNotBetween(String value1, String value2) {
            addCriterion("de_ccdd not between", value1, value2, "de_ccdd");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCatccppLike(String value) {
            addCriterion("upper(de_catccpp) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_catccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCatccppNotLike(String value) {
            addCriterion("de_catccpp not like", "%" + CadenaUtil.getStr(value) + "%", "de_catccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCatccppEqualTo(String value) {
            addCriterion("de_catccpp =", CadenaUtil.getStr(value), "de_catccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCatccppNotEqualTo(String value) {
            addCriterion("de_catccpp <>", CadenaUtil.getStr(value), "de_catccpp");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCatccppIsNull() {
            addCriterion("de_catccpp is null");
            return (Criteria) this;
        }
        
        public Criteria andStrCatccppIsNotNull() {
            addCriterion("de_catccpp is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrCatccppGreaterThan(String value) {
            addCriterion("de_catccpp >", value, "de_catccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCatccppGreaterThanOrEqualTo(String value) {
            addCriterion("de_catccpp >=", value, "de_catccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCatccppLessThan(String value) {
            addCriterion("de_catccpp <", value, "de_catccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCatccppLessThanOrEqualTo(String value) {
            addCriterion("de_catccpp <=", value, "de_catccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCatccppIn(List<String> values) {
            addCriterion("de_catccpp in", values, "de_catccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCatccppNotIn(List<String> values) {
            addCriterion("de_catccpp not in", values, "de_catccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCatccppBetween(String value1, String value2) {
            addCriterion("de_catccpp between", value1, value2, "de_catccpp");
            return (Criteria) this;
        }
        
        public Criteria andStrCatccppNotBetween(String value1, String value2) {
            addCriterion("de_catccpp not between", value1, value2, "de_catccpp");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomcatLike(String value) {
            addCriterion("upper(de_nomcat) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_nomcat");
            return (Criteria) this;
        }
        
        public Criteria andStrNomcatNotLike(String value) {
            addCriterion("de_nomcat not like", "%" + CadenaUtil.getStr(value) + "%", "de_nomcat");
            return (Criteria) this;
        }
        
        public Criteria andStrNomcatEqualTo(String value) {
            addCriterion("de_nomcat =", CadenaUtil.getStr(value), "de_nomcat");
            return (Criteria) this;
        }
        
        public Criteria andStrNomcatNotEqualTo(String value) {
            addCriterion("de_nomcat <>", CadenaUtil.getStr(value), "de_nomcat");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomcatIsNull() {
            addCriterion("de_nomcat is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomcatIsNotNull() {
            addCriterion("de_nomcat is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomcatGreaterThan(String value) {
            addCriterion("de_nomcat >", value, "de_nomcat");
            return (Criteria) this;
        }
        
        public Criteria andStrNomcatGreaterThanOrEqualTo(String value) {
            addCriterion("de_nomcat >=", value, "de_nomcat");
            return (Criteria) this;
        }
        
        public Criteria andStrNomcatLessThan(String value) {
            addCriterion("de_nomcat <", value, "de_nomcat");
            return (Criteria) this;
        }
        
        public Criteria andStrNomcatLessThanOrEqualTo(String value) {
            addCriterion("de_nomcat <=", value, "de_nomcat");
            return (Criteria) this;
        }
        
        public Criteria andStrNomcatIn(List<String> values) {
            addCriterion("de_nomcat in", values, "de_nomcat");
            return (Criteria) this;
        }
        
        public Criteria andStrNomcatNotIn(List<String> values) {
            addCriterion("de_nomcat not in", values, "de_nomcat");
            return (Criteria) this;
        }
        
        public Criteria andStrNomcatBetween(String value1, String value2) {
            addCriterion("de_nomcat between", value1, value2, "de_nomcat");
            return (Criteria) this;
        }
        
        public Criteria andStrNomcatNotBetween(String value1, String value2) {
            addCriterion("de_nomcat not between", value1, value2, "de_nomcat");
            return (Criteria) this;
        }
        
        
        public Criteria andIntAltitudEqualTo(Integer value) {
            addCriterion("cd_altitud =", value, "cd_altitud");
            return (Criteria) this;
        }
        
        public Criteria andIntAltitudNotEqualTo(Integer value) {
            addCriterion("cd_altitud <>", value, "cd_altitud");
            return (Criteria) this;
        }
        
        
        public Criteria andIntAltitudIsNull() {
            addCriterion("cd_altitud is null");
            return (Criteria) this;
        }
        
        public Criteria andIntAltitudIsNotNull() {
            addCriterion("cd_altitud is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntAltitudGreaterThan(Integer value) {
            addCriterion("cd_altitud >", value, "cd_altitud");
            return (Criteria) this;
        }
        
        public Criteria andIntAltitudGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_altitud >=", value, "cd_altitud");
            return (Criteria) this;
        }
        
        public Criteria andIntAltitudLessThan(Integer value) {
            addCriterion("cd_altitud <", value, "cd_altitud");
            return (Criteria) this;
        }
        
        public Criteria andIntAltitudLessThanOrEqualTo(Integer value) {
            addCriterion("cd_altitud <=", value, "cd_altitud");
            return (Criteria) this;
        }
        
        public Criteria andIntAltitudIn(List<Integer> values) {
            addCriterion("cd_altitud in", values, "cd_altitud");
            return (Criteria) this;
        }
        
        public Criteria andIntAltitudNotIn(List<Integer> values) {
            addCriterion("cd_altitud not in", values, "cd_altitud");
            return (Criteria) this;
        }
        
        public Criteria andIntAltitudBetween(Integer value1, Integer value2) {
            addCriterion("cd_altitud between", value1, value2, "cd_altitud");
            return (Criteria) this;
        }
        
        public Criteria andIntAltitudNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_altitud not between", value1, value2, "cd_altitud");
            return (Criteria) this;
        }
        
        
        public Criteria andStrLongitudxLike(String value) {
            addCriterion("upper(de_longitudx) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_longitudx");
            return (Criteria) this;
        }
        
        public Criteria andStrLongitudxNotLike(String value) {
            addCriterion("de_longitudx not like", "%" + CadenaUtil.getStr(value) + "%", "de_longitudx");
            return (Criteria) this;
        }
        
        public Criteria andStrLongitudxEqualTo(String value) {
            addCriterion("de_longitudx =", CadenaUtil.getStr(value), "de_longitudx");
            return (Criteria) this;
        }
        
        public Criteria andStrLongitudxNotEqualTo(String value) {
            addCriterion("de_longitudx <>", CadenaUtil.getStr(value), "de_longitudx");
            return (Criteria) this;
        }
        
        
        public Criteria andStrLongitudxIsNull() {
            addCriterion("de_longitudx is null");
            return (Criteria) this;
        }
        
        public Criteria andStrLongitudxIsNotNull() {
            addCriterion("de_longitudx is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrLongitudxGreaterThan(String value) {
            addCriterion("de_longitudx >", value, "de_longitudx");
            return (Criteria) this;
        }
        
        public Criteria andStrLongitudxGreaterThanOrEqualTo(String value) {
            addCriterion("de_longitudx >=", value, "de_longitudx");
            return (Criteria) this;
        }
        
        public Criteria andStrLongitudxLessThan(String value) {
            addCriterion("de_longitudx <", value, "de_longitudx");
            return (Criteria) this;
        }
        
        public Criteria andStrLongitudxLessThanOrEqualTo(String value) {
            addCriterion("de_longitudx <=", value, "de_longitudx");
            return (Criteria) this;
        }
        
        public Criteria andStrLongitudxIn(List<String> values) {
            addCriterion("de_longitudx in", values, "de_longitudx");
            return (Criteria) this;
        }
        
        public Criteria andStrLongitudxNotIn(List<String> values) {
            addCriterion("de_longitudx not in", values, "de_longitudx");
            return (Criteria) this;
        }
        
        public Criteria andStrLongitudxBetween(String value1, String value2) {
            addCriterion("de_longitudx between", value1, value2, "de_longitudx");
            return (Criteria) this;
        }
        
        public Criteria andStrLongitudxNotBetween(String value1, String value2) {
            addCriterion("de_longitudx not between", value1, value2, "de_longitudx");
            return (Criteria) this;
        }
        
        
        public Criteria andStrLatitudyLike(String value) {
            addCriterion("upper(de_latitudy) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_latitudy");
            return (Criteria) this;
        }
        
        public Criteria andStrLatitudyNotLike(String value) {
            addCriterion("de_latitudy not like", "%" + CadenaUtil.getStr(value) + "%", "de_latitudy");
            return (Criteria) this;
        }
        
        public Criteria andStrLatitudyEqualTo(String value) {
            addCriterion("de_latitudy =", CadenaUtil.getStr(value), "de_latitudy");
            return (Criteria) this;
        }
        
        public Criteria andStrLatitudyNotEqualTo(String value) {
            addCriterion("de_latitudy <>", CadenaUtil.getStr(value), "de_latitudy");
            return (Criteria) this;
        }
        
        
        public Criteria andStrLatitudyIsNull() {
            addCriterion("de_latitudy is null");
            return (Criteria) this;
        }
        
        public Criteria andStrLatitudyIsNotNull() {
            addCriterion("de_latitudy is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrLatitudyGreaterThan(String value) {
            addCriterion("de_latitudy >", value, "de_latitudy");
            return (Criteria) this;
        }
        
        public Criteria andStrLatitudyGreaterThanOrEqualTo(String value) {
            addCriterion("de_latitudy >=", value, "de_latitudy");
            return (Criteria) this;
        }
        
        public Criteria andStrLatitudyLessThan(String value) {
            addCriterion("de_latitudy <", value, "de_latitudy");
            return (Criteria) this;
        }
        
        public Criteria andStrLatitudyLessThanOrEqualTo(String value) {
            addCriterion("de_latitudy <=", value, "de_latitudy");
            return (Criteria) this;
        }
        
        public Criteria andStrLatitudyIn(List<String> values) {
            addCriterion("de_latitudy in", values, "de_latitudy");
            return (Criteria) this;
        }
        
        public Criteria andStrLatitudyNotIn(List<String> values) {
            addCriterion("de_latitudy not in", values, "de_latitudy");
            return (Criteria) this;
        }
        
        public Criteria andStrLatitudyBetween(String value1, String value2) {
            addCriterion("de_latitudy between", value1, value2, "de_latitudy");
            return (Criteria) this;
        }
        
        public Criteria andStrLatitudyNotBetween(String value1, String value2) {
            addCriterion("de_latitudy not between", value1, value2, "de_latitudy");
            return (Criteria) this;
        }
        
        
        public Criteria andIntViv07EqualTo(Integer value) {
            addCriterion("cd_viv07 =", value, "cd_viv07");
            return (Criteria) this;
        }
        
        public Criteria andIntViv07NotEqualTo(Integer value) {
            addCriterion("cd_viv07 <>", value, "cd_viv07");
            return (Criteria) this;
        }
        
        
        public Criteria andIntViv07IsNull() {
            addCriterion("cd_viv07 is null");
            return (Criteria) this;
        }
        
        public Criteria andIntViv07IsNotNull() {
            addCriterion("cd_viv07 is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntViv07GreaterThan(Integer value) {
            addCriterion("cd_viv07 >", value, "cd_viv07");
            return (Criteria) this;
        }
        
        public Criteria andIntViv07GreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_viv07 >=", value, "cd_viv07");
            return (Criteria) this;
        }
        
        public Criteria andIntViv07LessThan(Integer value) {
            addCriterion("cd_viv07 <", value, "cd_viv07");
            return (Criteria) this;
        }
        
        public Criteria andIntViv07LessThanOrEqualTo(Integer value) {
            addCriterion("cd_viv07 <=", value, "cd_viv07");
            return (Criteria) this;
        }
        
        public Criteria andIntViv07In(List<Integer> values) {
            addCriterion("cd_viv07 in", values, "cd_viv07");
            return (Criteria) this;
        }
        
        public Criteria andIntViv07NotIn(List<Integer> values) {
            addCriterion("cd_viv07 not in", values, "cd_viv07");
            return (Criteria) this;
        }
        
        public Criteria andIntViv07Between(Integer value1, Integer value2) {
            addCriterion("cd_viv07 between", value1, value2, "cd_viv07");
            return (Criteria) this;
        }
        
        public Criteria andIntViv07NotBetween(Integer value1, Integer value2) {
            addCriterion("cd_viv07 not between", value1, value2, "cd_viv07");
            return (Criteria) this;
        }
        
        
        public Criteria andIntPob07EqualTo(Integer value) {
            addCriterion("cd_pob07 =", value, "cd_pob07");
            return (Criteria) this;
        }
        
        public Criteria andIntPob07NotEqualTo(Integer value) {
            addCriterion("cd_pob07 <>", value, "cd_pob07");
            return (Criteria) this;
        }
        
        
        public Criteria andIntPob07IsNull() {
            addCriterion("cd_pob07 is null");
            return (Criteria) this;
        }
        
        public Criteria andIntPob07IsNotNull() {
            addCriterion("cd_pob07 is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntPob07GreaterThan(Integer value) {
            addCriterion("cd_pob07 >", value, "cd_pob07");
            return (Criteria) this;
        }
        
        public Criteria andIntPob07GreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_pob07 >=", value, "cd_pob07");
            return (Criteria) this;
        }
        
        public Criteria andIntPob07LessThan(Integer value) {
            addCriterion("cd_pob07 <", value, "cd_pob07");
            return (Criteria) this;
        }
        
        public Criteria andIntPob07LessThanOrEqualTo(Integer value) {
            addCriterion("cd_pob07 <=", value, "cd_pob07");
            return (Criteria) this;
        }
        
        public Criteria andIntPob07In(List<Integer> values) {
            addCriterion("cd_pob07 in", values, "cd_pob07");
            return (Criteria) this;
        }
        
        public Criteria andIntPob07NotIn(List<Integer> values) {
            addCriterion("cd_pob07 not in", values, "cd_pob07");
            return (Criteria) this;
        }
        
        public Criteria andIntPob07Between(Integer value1, Integer value2) {
            addCriterion("cd_pob07 between", value1, value2, "cd_pob07");
            return (Criteria) this;
        }
        
        public Criteria andIntPob07NotBetween(Integer value1, Integer value2) {
            addCriterion("cd_pob07 not between", value1, value2, "cd_pob07");
            return (Criteria) this;
        }
        
        
        public Criteria andIntRegionEqualTo(Integer value) {
            addCriterion("cd_region =", value, "cd_region");
            return (Criteria) this;
        }
        
        public Criteria andIntRegionNotEqualTo(Integer value) {
            addCriterion("cd_region <>", value, "cd_region");
            return (Criteria) this;
        }
        
        
        public Criteria andIntRegionIsNull() {
            addCriterion("cd_region is null");
            return (Criteria) this;
        }
        
        public Criteria andIntRegionIsNotNull() {
            addCriterion("cd_region is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntRegionGreaterThan(Integer value) {
            addCriterion("cd_region >", value, "cd_region");
            return (Criteria) this;
        }
        
        public Criteria andIntRegionGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_region >=", value, "cd_region");
            return (Criteria) this;
        }
        
        public Criteria andIntRegionLessThan(Integer value) {
            addCriterion("cd_region <", value, "cd_region");
            return (Criteria) this;
        }
        
        public Criteria andIntRegionLessThanOrEqualTo(Integer value) {
            addCriterion("cd_region <=", value, "cd_region");
            return (Criteria) this;
        }
        
        public Criteria andIntRegionIn(List<Integer> values) {
            addCriterion("cd_region in", values, "cd_region");
            return (Criteria) this;
        }
        
        public Criteria andIntRegionNotIn(List<Integer> values) {
            addCriterion("cd_region not in", values, "cd_region");
            return (Criteria) this;
        }
        
        public Criteria andIntRegionBetween(Integer value1, Integer value2) {
            addCriterion("cd_region between", value1, value2, "cd_region");
            return (Criteria) this;
        }
        
        public Criteria andIntRegionNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_region not between", value1, value2, "cd_region");
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
