package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class BasLimDistritosParamDef {
		
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected String strHashConsulta;
	
    public BasLimDistritosParamDef() {
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
        
        
        public Criteria andStrIddptoLike(String value) {
            addCriterion("upper(de_iddpto) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoNotLike(String value) {
            addCriterion("de_iddpto not like", "%" + CadenaUtil.getStr(value) + "%", "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoEqualTo(String value) {
            addCriterion("de_iddpto =", CadenaUtil.getStr(value), "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoNotEqualTo(String value) {
            addCriterion("de_iddpto <>", CadenaUtil.getStr(value), "de_iddpto");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIddptoIsNull() {
            addCriterion("de_iddpto is null");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoIsNotNull() {
            addCriterion("de_iddpto is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoGreaterThan(String value) {
            addCriterion("de_iddpto >", value, "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoGreaterThanOrEqualTo(String value) {
            addCriterion("de_iddpto >=", value, "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoLessThan(String value) {
            addCriterion("de_iddpto <", value, "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoLessThanOrEqualTo(String value) {
            addCriterion("de_iddpto <=", value, "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoIn(List<String> values) {
            addCriterion("de_iddpto in", values, "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoNotIn(List<String> values) {
            addCriterion("de_iddpto not in", values, "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoBetween(String value1, String value2) {
            addCriterion("de_iddpto between", value1, value2, "de_iddpto");
            return (Criteria) this;
        }
        
        public Criteria andStrIddptoNotBetween(String value1, String value2) {
            addCriterion("de_iddpto not between", value1, value2, "de_iddpto");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombdepLike(String value) {
            addCriterion("upper(de_nombdep) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepNotLike(String value) {
            addCriterion("de_nombdep not like", "%" + CadenaUtil.getStr(value) + "%", "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepEqualTo(String value) {
            addCriterion("de_nombdep =", CadenaUtil.getStr(value), "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepNotEqualTo(String value) {
            addCriterion("de_nombdep <>", CadenaUtil.getStr(value), "de_nombdep");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombdepIsNull() {
            addCriterion("de_nombdep is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepIsNotNull() {
            addCriterion("de_nombdep is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepGreaterThan(String value) {
            addCriterion("de_nombdep >", value, "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepGreaterThanOrEqualTo(String value) {
            addCriterion("de_nombdep >=", value, "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepLessThan(String value) {
            addCriterion("de_nombdep <", value, "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepLessThanOrEqualTo(String value) {
            addCriterion("de_nombdep <=", value, "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepIn(List<String> values) {
            addCriterion("de_nombdep in", values, "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepNotIn(List<String> values) {
            addCriterion("de_nombdep not in", values, "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepBetween(String value1, String value2) {
            addCriterion("de_nombdep between", value1, value2, "de_nombdep");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdepNotBetween(String value1, String value2) {
            addCriterion("de_nombdep not between", value1, value2, "de_nombdep");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIdprovLike(String value) {
            addCriterion("upper(de_idprov) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_idprov");
            return (Criteria) this;
        }
        
        public Criteria andStrIdprovNotLike(String value) {
            addCriterion("de_idprov not like", "%" + CadenaUtil.getStr(value) + "%", "de_idprov");
            return (Criteria) this;
        }
        
        public Criteria andStrIdprovEqualTo(String value) {
            addCriterion("de_idprov =", CadenaUtil.getStr(value), "de_idprov");
            return (Criteria) this;
        }
        
        public Criteria andStrIdprovNotEqualTo(String value) {
            addCriterion("de_idprov <>", CadenaUtil.getStr(value), "de_idprov");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIdprovIsNull() {
            addCriterion("de_idprov is null");
            return (Criteria) this;
        }
        
        public Criteria andStrIdprovIsNotNull() {
            addCriterion("de_idprov is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrIdprovGreaterThan(String value) {
            addCriterion("de_idprov >", value, "de_idprov");
            return (Criteria) this;
        }
        
        public Criteria andStrIdprovGreaterThanOrEqualTo(String value) {
            addCriterion("de_idprov >=", value, "de_idprov");
            return (Criteria) this;
        }
        
        public Criteria andStrIdprovLessThan(String value) {
            addCriterion("de_idprov <", value, "de_idprov");
            return (Criteria) this;
        }
        
        public Criteria andStrIdprovLessThanOrEqualTo(String value) {
            addCriterion("de_idprov <=", value, "de_idprov");
            return (Criteria) this;
        }
        
        public Criteria andStrIdprovIn(List<String> values) {
            addCriterion("de_idprov in", values, "de_idprov");
            return (Criteria) this;
        }
        
        public Criteria andStrIdprovNotIn(List<String> values) {
            addCriterion("de_idprov not in", values, "de_idprov");
            return (Criteria) this;
        }
        
        public Criteria andStrIdprovBetween(String value1, String value2) {
            addCriterion("de_idprov between", value1, value2, "de_idprov");
            return (Criteria) this;
        }
        
        public Criteria andStrIdprovNotBetween(String value1, String value2) {
            addCriterion("de_idprov not between", value1, value2, "de_idprov");
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
        
        
        public Criteria andStrIddistLike(String value) {
            addCriterion("upper(de_iddist) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_iddist");
            return (Criteria) this;
        }
        
        public Criteria andStrIddistNotLike(String value) {
            addCriterion("de_iddist not like", "%" + CadenaUtil.getStr(value) + "%", "de_iddist");
            return (Criteria) this;
        }
        
        public Criteria andStrIddistEqualTo(String value) {
            addCriterion("de_iddist =", CadenaUtil.getStr(value), "de_iddist");
            return (Criteria) this;
        }
        
        public Criteria andStrIddistNotEqualTo(String value) {
            addCriterion("de_iddist <>", CadenaUtil.getStr(value), "de_iddist");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIddistIsNull() {
            addCriterion("de_iddist is null");
            return (Criteria) this;
        }
        
        public Criteria andStrIddistIsNotNull() {
            addCriterion("de_iddist is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrIddistGreaterThan(String value) {
            addCriterion("de_iddist >", value, "de_iddist");
            return (Criteria) this;
        }
        
        public Criteria andStrIddistGreaterThanOrEqualTo(String value) {
            addCriterion("de_iddist >=", value, "de_iddist");
            return (Criteria) this;
        }
        
        public Criteria andStrIddistLessThan(String value) {
            addCriterion("de_iddist <", value, "de_iddist");
            return (Criteria) this;
        }
        
        public Criteria andStrIddistLessThanOrEqualTo(String value) {
            addCriterion("de_iddist <=", value, "de_iddist");
            return (Criteria) this;
        }
        
        public Criteria andStrIddistIn(List<String> values) {
            addCriterion("de_iddist in", values, "de_iddist");
            return (Criteria) this;
        }
        
        public Criteria andStrIddistNotIn(List<String> values) {
            addCriterion("de_iddist not in", values, "de_iddist");
            return (Criteria) this;
        }
        
        public Criteria andStrIddistBetween(String value1, String value2) {
            addCriterion("de_iddist between", value1, value2, "de_iddist");
            return (Criteria) this;
        }
        
        public Criteria andStrIddistNotBetween(String value1, String value2) {
            addCriterion("de_iddist not between", value1, value2, "de_iddist");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombdistLike(String value) {
            addCriterion("upper(de_nombdist) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_nombdist");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdistNotLike(String value) {
            addCriterion("de_nombdist not like", "%" + CadenaUtil.getStr(value) + "%", "de_nombdist");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdistEqualTo(String value) {
            addCriterion("de_nombdist =", CadenaUtil.getStr(value), "de_nombdist");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdistNotEqualTo(String value) {
            addCriterion("de_nombdist <>", CadenaUtil.getStr(value), "de_nombdist");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombdistIsNull() {
            addCriterion("de_nombdist is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdistIsNotNull() {
            addCriterion("de_nombdist is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdistGreaterThan(String value) {
            addCriterion("de_nombdist >", value, "de_nombdist");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdistGreaterThanOrEqualTo(String value) {
            addCriterion("de_nombdist >=", value, "de_nombdist");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdistLessThan(String value) {
            addCriterion("de_nombdist <", value, "de_nombdist");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdistLessThanOrEqualTo(String value) {
            addCriterion("de_nombdist <=", value, "de_nombdist");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdistIn(List<String> values) {
            addCriterion("de_nombdist in", values, "de_nombdist");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdistNotIn(List<String> values) {
            addCriterion("de_nombdist not in", values, "de_nombdist");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdistBetween(String value1, String value2) {
            addCriterion("de_nombdist between", value1, value2, "de_nombdist");
            return (Criteria) this;
        }
        
        public Criteria andStrNombdistNotBetween(String value1, String value2) {
            addCriterion("de_nombdist not between", value1, value2, "de_nombdist");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDctoLike(String value) {
            addCriterion("upper(de_dcto) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_dcto");
            return (Criteria) this;
        }
        
        public Criteria andStrDctoNotLike(String value) {
            addCriterion("de_dcto not like", "%" + CadenaUtil.getStr(value) + "%", "de_dcto");
            return (Criteria) this;
        }
        
        public Criteria andStrDctoEqualTo(String value) {
            addCriterion("de_dcto =", CadenaUtil.getStr(value), "de_dcto");
            return (Criteria) this;
        }
        
        public Criteria andStrDctoNotEqualTo(String value) {
            addCriterion("de_dcto <>", CadenaUtil.getStr(value), "de_dcto");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDctoIsNull() {
            addCriterion("de_dcto is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDctoIsNotNull() {
            addCriterion("de_dcto is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDctoGreaterThan(String value) {
            addCriterion("de_dcto >", value, "de_dcto");
            return (Criteria) this;
        }
        
        public Criteria andStrDctoGreaterThanOrEqualTo(String value) {
            addCriterion("de_dcto >=", value, "de_dcto");
            return (Criteria) this;
        }
        
        public Criteria andStrDctoLessThan(String value) {
            addCriterion("de_dcto <", value, "de_dcto");
            return (Criteria) this;
        }
        
        public Criteria andStrDctoLessThanOrEqualTo(String value) {
            addCriterion("de_dcto <=", value, "de_dcto");
            return (Criteria) this;
        }
        
        public Criteria andStrDctoIn(List<String> values) {
            addCriterion("de_dcto in", values, "de_dcto");
            return (Criteria) this;
        }
        
        public Criteria andStrDctoNotIn(List<String> values) {
            addCriterion("de_dcto not in", values, "de_dcto");
            return (Criteria) this;
        }
        
        public Criteria andStrDctoBetween(String value1, String value2) {
            addCriterion("de_dcto between", value1, value2, "de_dcto");
            return (Criteria) this;
        }
        
        public Criteria andStrDctoNotBetween(String value1, String value2) {
            addCriterion("de_dcto not between", value1, value2, "de_dcto");
            return (Criteria) this;
        }
        
        
        public Criteria andStrLeyLike(String value) {
            addCriterion("upper(de_ley) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_ley");
            return (Criteria) this;
        }
        
        public Criteria andStrLeyNotLike(String value) {
            addCriterion("de_ley not like", "%" + CadenaUtil.getStr(value) + "%", "de_ley");
            return (Criteria) this;
        }
        
        public Criteria andStrLeyEqualTo(String value) {
            addCriterion("de_ley =", CadenaUtil.getStr(value), "de_ley");
            return (Criteria) this;
        }
        
        public Criteria andStrLeyNotEqualTo(String value) {
            addCriterion("de_ley <>", CadenaUtil.getStr(value), "de_ley");
            return (Criteria) this;
        }
        
        
        public Criteria andStrLeyIsNull() {
            addCriterion("de_ley is null");
            return (Criteria) this;
        }
        
        public Criteria andStrLeyIsNotNull() {
            addCriterion("de_ley is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrLeyGreaterThan(String value) {
            addCriterion("de_ley >", value, "de_ley");
            return (Criteria) this;
        }
        
        public Criteria andStrLeyGreaterThanOrEqualTo(String value) {
            addCriterion("de_ley >=", value, "de_ley");
            return (Criteria) this;
        }
        
        public Criteria andStrLeyLessThan(String value) {
            addCriterion("de_ley <", value, "de_ley");
            return (Criteria) this;
        }
        
        public Criteria andStrLeyLessThanOrEqualTo(String value) {
            addCriterion("de_ley <=", value, "de_ley");
            return (Criteria) this;
        }
        
        public Criteria andStrLeyIn(List<String> values) {
            addCriterion("de_ley in", values, "de_ley");
            return (Criteria) this;
        }
        
        public Criteria andStrLeyNotIn(List<String> values) {
            addCriterion("de_ley not in", values, "de_ley");
            return (Criteria) this;
        }
        
        public Criteria andStrLeyBetween(String value1, String value2) {
            addCriterion("de_ley between", value1, value2, "de_ley");
            return (Criteria) this;
        }
        
        public Criteria andStrLeyNotBetween(String value1, String value2) {
            addCriterion("de_ley not between", value1, value2, "de_ley");
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
        
        
        public Criteria andStrNomCapLike(String value) {
            addCriterion("upper(de_nom_cap) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_nom_cap");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCapNotLike(String value) {
            addCriterion("de_nom_cap not like", "%" + CadenaUtil.getStr(value) + "%", "de_nom_cap");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCapEqualTo(String value) {
            addCriterion("de_nom_cap =", CadenaUtil.getStr(value), "de_nom_cap");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCapNotEqualTo(String value) {
            addCriterion("de_nom_cap <>", CadenaUtil.getStr(value), "de_nom_cap");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomCapIsNull() {
            addCriterion("de_nom_cap is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCapIsNotNull() {
            addCriterion("de_nom_cap is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCapGreaterThan(String value) {
            addCriterion("de_nom_cap >", value, "de_nom_cap");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCapGreaterThanOrEqualTo(String value) {
            addCriterion("de_nom_cap >=", value, "de_nom_cap");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCapLessThan(String value) {
            addCriterion("de_nom_cap <", value, "de_nom_cap");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCapLessThanOrEqualTo(String value) {
            addCriterion("de_nom_cap <=", value, "de_nom_cap");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCapIn(List<String> values) {
            addCriterion("de_nom_cap in", values, "de_nom_cap");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCapNotIn(List<String> values) {
            addCriterion("de_nom_cap not in", values, "de_nom_cap");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCapBetween(String value1, String value2) {
            addCriterion("de_nom_cap between", value1, value2, "de_nom_cap");
            return (Criteria) this;
        }
        
        public Criteria andStrNomCapNotBetween(String value1, String value2) {
            addCriterion("de_nom_cap not between", value1, value2, "de_nom_cap");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSupContinEqualTo(Double value) {
            addCriterion("ha_sup_contin =", value, "ha_sup_contin");
            return (Criteria) this;
        }
        
        public Criteria andDblSupContinNotEqualTo(Double value) {
            addCriterion("ha_sup_contin <>", value, "ha_sup_contin");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSupContinIsNull() {
            addCriterion("ha_sup_contin is null");
            return (Criteria) this;
        }
        
        public Criteria andDblSupContinIsNotNull() {
            addCriterion("ha_sup_contin is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblSupContinGreaterThan(Double value) {
            addCriterion("ha_sup_contin >", value, "ha_sup_contin");
            return (Criteria) this;
        }
        
        public Criteria andDblSupContinGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_sup_contin >=", value, "ha_sup_contin");
            return (Criteria) this;
        }
        
        public Criteria andDblSupContinLessThan(Double value) {
            addCriterion("ha_sup_contin <", value, "ha_sup_contin");
            return (Criteria) this;
        }
        
        public Criteria andDblSupContinLessThanOrEqualTo(Double value) {
            addCriterion("ha_sup_contin <=", value, "ha_sup_contin");
            return (Criteria) this;
        }
        
        public Criteria andDblSupContinIn(List<Double> values) {
            addCriterion("ha_sup_contin in", values, "ha_sup_contin");
            return (Criteria) this;
        }
        
        public Criteria andDblSupContinNotIn(List<Double> values) {
            addCriterion("ha_sup_contin not in", values, "ha_sup_contin");
            return (Criteria) this;
        }
        
        public Criteria andDblSupContinBetween(Double value1, Double value2) {
            addCriterion("ha_sup_contin between", value1, value2, "ha_sup_contin");
            return (Criteria) this;
        }
        
        public Criteria andDblSupContinNotBetween(Double value1, Double value2) {
            addCriterion("ha_sup_contin not between", value1, value2, "ha_sup_contin");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSupInsulaEqualTo(Double value) {
            addCriterion("ha_sup_insula =", value, "ha_sup_insula");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsulaNotEqualTo(Double value) {
            addCriterion("ha_sup_insula <>", value, "ha_sup_insula");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSupInsulaIsNull() {
            addCriterion("ha_sup_insula is null");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsulaIsNotNull() {
            addCriterion("ha_sup_insula is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsulaGreaterThan(Double value) {
            addCriterion("ha_sup_insula >", value, "ha_sup_insula");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsulaGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_sup_insula >=", value, "ha_sup_insula");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsulaLessThan(Double value) {
            addCriterion("ha_sup_insula <", value, "ha_sup_insula");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsulaLessThanOrEqualTo(Double value) {
            addCriterion("ha_sup_insula <=", value, "ha_sup_insula");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsulaIn(List<Double> values) {
            addCriterion("ha_sup_insula in", values, "ha_sup_insula");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsulaNotIn(List<Double> values) {
            addCriterion("ha_sup_insula not in", values, "ha_sup_insula");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsulaBetween(Double value1, Double value2) {
            addCriterion("ha_sup_insula between", value1, value2, "ha_sup_insula");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsulaNotBetween(Double value1, Double value2) {
            addCriterion("ha_sup_insula not between", value1, value2, "ha_sup_insula");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSupLacustEqualTo(Double value) {
            addCriterion("ha_sup_lacust =", value, "ha_sup_lacust");
            return (Criteria) this;
        }
        
        public Criteria andDblSupLacustNotEqualTo(Double value) {
            addCriterion("ha_sup_lacust <>", value, "ha_sup_lacust");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSupLacustIsNull() {
            addCriterion("ha_sup_lacust is null");
            return (Criteria) this;
        }
        
        public Criteria andDblSupLacustIsNotNull() {
            addCriterion("ha_sup_lacust is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblSupLacustGreaterThan(Double value) {
            addCriterion("ha_sup_lacust >", value, "ha_sup_lacust");
            return (Criteria) this;
        }
        
        public Criteria andDblSupLacustGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_sup_lacust >=", value, "ha_sup_lacust");
            return (Criteria) this;
        }
        
        public Criteria andDblSupLacustLessThan(Double value) {
            addCriterion("ha_sup_lacust <", value, "ha_sup_lacust");
            return (Criteria) this;
        }
        
        public Criteria andDblSupLacustLessThanOrEqualTo(Double value) {
            addCriterion("ha_sup_lacust <=", value, "ha_sup_lacust");
            return (Criteria) this;
        }
        
        public Criteria andDblSupLacustIn(List<Double> values) {
            addCriterion("ha_sup_lacust in", values, "ha_sup_lacust");
            return (Criteria) this;
        }
        
        public Criteria andDblSupLacustNotIn(List<Double> values) {
            addCriterion("ha_sup_lacust not in", values, "ha_sup_lacust");
            return (Criteria) this;
        }
        
        public Criteria andDblSupLacustBetween(Double value1, Double value2) {
            addCriterion("ha_sup_lacust between", value1, value2, "ha_sup_lacust");
            return (Criteria) this;
        }
        
        public Criteria andDblSupLacustNotBetween(Double value1, Double value2) {
            addCriterion("ha_sup_lacust not between", value1, value2, "ha_sup_lacust");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSupInsDEqualTo(Double value) {
            addCriterion("ha_sup_ins_d =", value, "ha_sup_ins_d");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsDNotEqualTo(Double value) {
            addCriterion("ha_sup_ins_d <>", value, "ha_sup_ins_d");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSupInsDIsNull() {
            addCriterion("ha_sup_ins_d is null");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsDIsNotNull() {
            addCriterion("ha_sup_ins_d is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsDGreaterThan(Double value) {
            addCriterion("ha_sup_ins_d >", value, "ha_sup_ins_d");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsDGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_sup_ins_d >=", value, "ha_sup_ins_d");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsDLessThan(Double value) {
            addCriterion("ha_sup_ins_d <", value, "ha_sup_ins_d");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsDLessThanOrEqualTo(Double value) {
            addCriterion("ha_sup_ins_d <=", value, "ha_sup_ins_d");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsDIn(List<Double> values) {
            addCriterion("ha_sup_ins_d in", values, "ha_sup_ins_d");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsDNotIn(List<Double> values) {
            addCriterion("ha_sup_ins_d not in", values, "ha_sup_ins_d");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsDBetween(Double value1, Double value2) {
            addCriterion("ha_sup_ins_d between", value1, value2, "ha_sup_ins_d");
            return (Criteria) this;
        }
        
        public Criteria andDblSupInsDNotBetween(Double value1, Double value2) {
            addCriterion("ha_sup_ins_d not between", value1, value2, "ha_sup_ins_d");
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
