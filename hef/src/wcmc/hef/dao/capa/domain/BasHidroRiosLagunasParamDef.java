package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class BasHidroRiosLagunasParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasHidroRiosLagunasParamDef() {
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
        
        
        public Criteria andStrTheGeomIntersectsTo(String value) {
        	addCriterion("ST_Intersects(si_the_geom, ST_GeomFromText('"+CadenaUtil.getStr(value)+"',4326)) ");
            return (Criteria) this;
        }
        
        
        public Criteria andLngCountEqualTo(Long value) {
            addCriterion("cd_count =", value, "cd_count");
            return (Criteria) this;
        }
        
        public Criteria andLngCountNotEqualTo(Long value) {
            addCriterion("cd_count <>", value, "cd_count");
            return (Criteria) this;
        }
        
        
        public Criteria andLngCountIsNull() {
            addCriterion("cd_count is null");
            return (Criteria) this;
        }
        
        public Criteria andLngCountIsNotNull() {
            addCriterion("cd_count is not null");
            return (Criteria) this;
        }
        
        public Criteria andLngCountGreaterThan(Long value) {
            addCriterion("cd_count >", value, "cd_count");
            return (Criteria) this;
        }
        
        public Criteria andLngCountGreaterThanOrEqualTo(Long value) {
            addCriterion("cd_count >=", value, "cd_count");
            return (Criteria) this;
        }
        
        public Criteria andLngCountLessThan(Long value) {
            addCriterion("cd_count <", value, "cd_count");
            return (Criteria) this;
        }
        
        public Criteria andLngCountLessThanOrEqualTo(Long value) {
            addCriterion("cd_count <=", value, "cd_count");
            return (Criteria) this;
        }
        
        public Criteria andLngCountIn(List<Long> values) {
            addCriterion("cd_count in", values, "cd_count");
            return (Criteria) this;
        }
        
        public Criteria andLngCountNotIn(List<Long> values) {
            addCriterion("cd_count not in", values, "cd_count");
            return (Criteria) this;
        }
        
        public Criteria andLngCountBetween(Long value1, Long value2) {
            addCriterion("cd_count between", value1, value2, "cd_count");
            return (Criteria) this;
        }
        
        public Criteria andLngCountNotBetween(Long value1, Long value2) {
            addCriterion("cd_count not between", value1, value2, "cd_count");
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
        
        
        public Criteria andDblAreaEqualTo(Double value) {
            addCriterion("ha_area =", value, "ha_area");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaNotEqualTo(Double value) {
            addCriterion("ha_area <>", value, "ha_area");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaIsNull() {
            addCriterion("ha_area is null");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaIsNotNull() {
            addCriterion("ha_area is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaGreaterThan(Double value) {
            addCriterion("ha_area >", value, "ha_area");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_area >=", value, "ha_area");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaLessThan(Double value) {
            addCriterion("ha_area <", value, "ha_area");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaLessThanOrEqualTo(Double value) {
            addCriterion("ha_area <=", value, "ha_area");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaIn(List<Double> values) {
            addCriterion("ha_area in", values, "ha_area");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaNotIn(List<Double> values) {
            addCriterion("ha_area not in", values, "ha_area");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaBetween(Double value1, Double value2) {
            addCriterion("ha_area between", value1, value2, "ha_area");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaNotBetween(Double value1, Double value2) {
            addCriterion("ha_area not between", value1, value2, "ha_area");
            return (Criteria) this;
        }
        
        
        public Criteria andDblPerimeterEqualTo(Double value) {
            addCriterion("ha_perimeter =", value, "ha_perimeter");
            return (Criteria) this;
        }
        
        public Criteria andDblPerimeterNotEqualTo(Double value) {
            addCriterion("ha_perimeter <>", value, "ha_perimeter");
            return (Criteria) this;
        }
        
        
        public Criteria andDblPerimeterIsNull() {
            addCriterion("ha_perimeter is null");
            return (Criteria) this;
        }
        
        public Criteria andDblPerimeterIsNotNull() {
            addCriterion("ha_perimeter is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblPerimeterGreaterThan(Double value) {
            addCriterion("ha_perimeter >", value, "ha_perimeter");
            return (Criteria) this;
        }
        
        public Criteria andDblPerimeterGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_perimeter >=", value, "ha_perimeter");
            return (Criteria) this;
        }
        
        public Criteria andDblPerimeterLessThan(Double value) {
            addCriterion("ha_perimeter <", value, "ha_perimeter");
            return (Criteria) this;
        }
        
        public Criteria andDblPerimeterLessThanOrEqualTo(Double value) {
            addCriterion("ha_perimeter <=", value, "ha_perimeter");
            return (Criteria) this;
        }
        
        public Criteria andDblPerimeterIn(List<Double> values) {
            addCriterion("ha_perimeter in", values, "ha_perimeter");
            return (Criteria) this;
        }
        
        public Criteria andDblPerimeterNotIn(List<Double> values) {
            addCriterion("ha_perimeter not in", values, "ha_perimeter");
            return (Criteria) this;
        }
        
        public Criteria andDblPerimeterBetween(Double value1, Double value2) {
            addCriterion("ha_perimeter between", value1, value2, "ha_perimeter");
            return (Criteria) this;
        }
        
        public Criteria andDblPerimeterNotBetween(Double value1, Double value2) {
            addCriterion("ha_perimeter not between", value1, value2, "ha_perimeter");
            return (Criteria) this;
        }
        
        
        public Criteria andLngTiticacgEqualTo(Long value) {
            addCriterion("cd_titicacg_ =", value, "cd_titicacg_");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgNotEqualTo(Long value) {
            addCriterion("cd_titicacg_ <>", value, "cd_titicacg_");
            return (Criteria) this;
        }
        
        
        public Criteria andLngTiticacgIsNull() {
            addCriterion("cd_titicacg_ is null");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgIsNotNull() {
            addCriterion("cd_titicacg_ is not null");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgGreaterThan(Long value) {
            addCriterion("cd_titicacg_ >", value, "cd_titicacg_");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgGreaterThanOrEqualTo(Long value) {
            addCriterion("cd_titicacg_ >=", value, "cd_titicacg_");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgLessThan(Long value) {
            addCriterion("cd_titicacg_ <", value, "cd_titicacg_");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgLessThanOrEqualTo(Long value) {
            addCriterion("cd_titicacg_ <=", value, "cd_titicacg_");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgIn(List<Long> values) {
            addCriterion("cd_titicacg_ in", values, "cd_titicacg_");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgNotIn(List<Long> values) {
            addCriterion("cd_titicacg_ not in", values, "cd_titicacg_");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgBetween(Long value1, Long value2) {
            addCriterion("cd_titicacg_ between", value1, value2, "cd_titicacg_");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgNotBetween(Long value1, Long value2) {
            addCriterion("cd_titicacg_ not between", value1, value2, "cd_titicacg_");
            return (Criteria) this;
        }
        
        
        public Criteria andLngTiticacgIEqualTo(Long value) {
            addCriterion("cd_titicacg_i =", value, "cd_titicacg_i");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgINotEqualTo(Long value) {
            addCriterion("cd_titicacg_i <>", value, "cd_titicacg_i");
            return (Criteria) this;
        }
        
        
        public Criteria andLngTiticacgIIsNull() {
            addCriterion("cd_titicacg_i is null");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgIIsNotNull() {
            addCriterion("cd_titicacg_i is not null");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgIGreaterThan(Long value) {
            addCriterion("cd_titicacg_i >", value, "cd_titicacg_i");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgIGreaterThanOrEqualTo(Long value) {
            addCriterion("cd_titicacg_i >=", value, "cd_titicacg_i");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgILessThan(Long value) {
            addCriterion("cd_titicacg_i <", value, "cd_titicacg_i");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgILessThanOrEqualTo(Long value) {
            addCriterion("cd_titicacg_i <=", value, "cd_titicacg_i");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgIIn(List<Long> values) {
            addCriterion("cd_titicacg_i in", values, "cd_titicacg_i");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgINotIn(List<Long> values) {
            addCriterion("cd_titicacg_i not in", values, "cd_titicacg_i");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgIBetween(Long value1, Long value2) {
            addCriterion("cd_titicacg_i between", value1, value2, "cd_titicacg_i");
            return (Criteria) this;
        }
        
        public Criteria andLngTiticacgINotBetween(Long value1, Long value2) {
            addCriterion("cd_titicacg_i not between", value1, value2, "cd_titicacg_i");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDxfLayerLike(String value) {
            addCriterion("upper(de_dxf_layer) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_dxf_layer");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfLayerNotLike(String value) {
            addCriterion("de_dxf_layer not like", "%" + CadenaUtil.getStr(value) + "%", "de_dxf_layer");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfLayerEqualTo(String value) {
            addCriterion("de_dxf_layer =", CadenaUtil.getStr(value), "de_dxf_layer");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfLayerNotEqualTo(String value) {
            addCriterion("de_dxf_layer <>", CadenaUtil.getStr(value), "de_dxf_layer");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDxfLayerIsNull() {
            addCriterion("de_dxf_layer is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfLayerIsNotNull() {
            addCriterion("de_dxf_layer is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfLayerGreaterThan(String value) {
            addCriterion("de_dxf_layer >", value, "de_dxf_layer");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfLayerGreaterThanOrEqualTo(String value) {
            addCriterion("de_dxf_layer >=", value, "de_dxf_layer");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfLayerLessThan(String value) {
            addCriterion("de_dxf_layer <", value, "de_dxf_layer");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfLayerLessThanOrEqualTo(String value) {
            addCriterion("de_dxf_layer <=", value, "de_dxf_layer");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfLayerIn(List<String> values) {
            addCriterion("de_dxf_layer in", values, "de_dxf_layer");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfLayerNotIn(List<String> values) {
            addCriterion("de_dxf_layer not in", values, "de_dxf_layer");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfLayerBetween(String value1, String value2) {
            addCriterion("de_dxf_layer between", value1, value2, "de_dxf_layer");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfLayerNotBetween(String value1, String value2) {
            addCriterion("de_dxf_layer not between", value1, value2, "de_dxf_layer");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDxfTextLike(String value) {
            addCriterion("upper(de_dxf_text) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_dxf_text");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfTextNotLike(String value) {
            addCriterion("de_dxf_text not like", "%" + CadenaUtil.getStr(value) + "%", "de_dxf_text");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfTextEqualTo(String value) {
            addCriterion("de_dxf_text =", CadenaUtil.getStr(value), "de_dxf_text");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfTextNotEqualTo(String value) {
            addCriterion("de_dxf_text <>", CadenaUtil.getStr(value), "de_dxf_text");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDxfTextIsNull() {
            addCriterion("de_dxf_text is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfTextIsNotNull() {
            addCriterion("de_dxf_text is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfTextGreaterThan(String value) {
            addCriterion("de_dxf_text >", value, "de_dxf_text");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfTextGreaterThanOrEqualTo(String value) {
            addCriterion("de_dxf_text >=", value, "de_dxf_text");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfTextLessThan(String value) {
            addCriterion("de_dxf_text <", value, "de_dxf_text");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfTextLessThanOrEqualTo(String value) {
            addCriterion("de_dxf_text <=", value, "de_dxf_text");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfTextIn(List<String> values) {
            addCriterion("de_dxf_text in", values, "de_dxf_text");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfTextNotIn(List<String> values) {
            addCriterion("de_dxf_text not in", values, "de_dxf_text");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfTextBetween(String value1, String value2) {
            addCriterion("de_dxf_text between", value1, value2, "de_dxf_text");
            return (Criteria) this;
        }
        
        public Criteria andStrDxfTextNotBetween(String value1, String value2) {
            addCriterion("de_dxf_text not between", value1, value2, "de_dxf_text");
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
