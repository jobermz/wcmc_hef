package wcmc.hef.dao.visor.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class CapaProvinciaParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CapaProvinciaParamDef() {
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
        
                
        
        public Criteria andIntIdGidEqualTo(Integer value) {
            addCriterion("cd_gid =", value, "cd_gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidNotEqualTo(Integer value) {
            addCriterion("cd_gid <>", value, "cd_gid");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdGidIsNull() {
            addCriterion("cd_gid is null");
            return (Criteria) this;
        }

        public Criteria andIntIdGidIsNotNull() {
            addCriterion("cd_gid is not null");
            return (Criteria) this;
        }

        public Criteria andIntIdGidGreaterThan(Integer value) {
            addCriterion("cd_gid >", value, "cd_gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_gid >=", value, "cd_gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidLessThan(Integer value) {
            addCriterion("cd_gid <", value, "cd_gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidLessThanOrEqualTo(Integer value) {
            addCriterion("cd_gid <=", value, "cd_gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidIn(List<Integer> values) {
            addCriterion("cd_gid in", values, "cd_gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidNotIn(List<Integer> values) {
            addCriterion("cd_gid not in", values, "cd_gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidBetween(Integer value1, Integer value2) {
            addCriterion("cd_gid between", value1, value2, "cd_gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_gid not between", value1, value2, "cd_gid");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIdProvinciaLike(String value) {
            addCriterion("upper(cd_provinc) like", "" + CadenaUtil.getStr(value).toUpperCase() + "%", "cd_provinc");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaNotLike(String value) {
            addCriterion("cd_provinc not like", "%" + CadenaUtil.getStr(value) + "%", "cd_provinc");
            return (Criteria) this;
        }
			
        public Criteria andStrIdProvinciaEqualTo(String value) {
            addCriterion("cd_provinc =", CadenaUtil.getStr(value), "cd_provinc");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaNotEqualTo(String value) {
            addCriterion("cd_provinc <>", CadenaUtil.getStr(value), "cd_provinc");
            return (Criteria) this;
        }

        
        public Criteria andStrIdProvinciaIsNull() {
            addCriterion("cd_provinc is null");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaIsNotNull() {
            addCriterion("cd_provinc is not null");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaGreaterThan(String value) {
            addCriterion("cd_provinc >", value, "cd_provinc");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaGreaterThanOrEqualTo(String value) {
            addCriterion("cd_provinc >=", value, "cd_provinc");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaLessThan(String value) {
            addCriterion("cd_provinc <", value, "cd_provinc");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaLessThanOrEqualTo(String value) {
            addCriterion("cd_provinc <=", value, "cd_provinc");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaIn(List<String> values) {
            addCriterion("cd_provinc in", values, "cd_provinc");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaNotIn(List<String> values) {
            addCriterion("cd_provinc not in", values, "cd_provinc");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaBetween(String value1, String value2) {
            addCriterion("cd_provinc between", value1, value2, "cd_provinc");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaNotBetween(String value1, String value2) {
            addCriterion("cd_provinc not between", value1, value2, "cd_provinc");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombreProvinciaLike(String value) {
            addCriterion("upper(nm_provinc) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nm_provinc");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaNotLike(String value) {
            addCriterion("nm_provinc not like", "%" + CadenaUtil.getStr(value) + "%", "nm_provinc");
            return (Criteria) this;
        }
			
        public Criteria andStrNombreProvinciaEqualTo(String value) {
            addCriterion("nm_provinc =", CadenaUtil.getStr(value), "nm_provinc");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaNotEqualTo(String value) {
            addCriterion("nm_provinc <>", CadenaUtil.getStr(value), "nm_provinc");
            return (Criteria) this;
        }

        
        public Criteria andStrNombreProvinciaIsNull() {
            addCriterion("nm_provinc is null");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaIsNotNull() {
            addCriterion("nm_provinc is not null");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaGreaterThan(String value) {
            addCriterion("nm_provinc >", value, "nm_provinc");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaGreaterThanOrEqualTo(String value) {
            addCriterion("nm_provinc >=", value, "nm_provinc");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaLessThan(String value) {
            addCriterion("nm_provinc <", value, "nm_provinc");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaLessThanOrEqualTo(String value) {
            addCriterion("nm_provinc <=", value, "nm_provinc");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaIn(List<String> values) {
            addCriterion("nm_provinc in", values, "nm_provinc");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaNotIn(List<String> values) {
            addCriterion("nm_provinc not in", values, "nm_provinc");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaBetween(String value1, String value2) {
            addCriterion("nm_provinc between", value1, value2, "nm_provinc");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaNotBetween(String value1, String value2) {
            addCriterion("nm_provinc not between", value1, value2, "nm_provinc");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombreDepartamentoLike(String value) {
            addCriterion("upper(nm_departa) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nm_departa");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoNotLike(String value) {
            addCriterion("nm_departa not like", "%" + CadenaUtil.getStr(value) + "%", "nm_departa");
            return (Criteria) this;
        }
			
        public Criteria andStrNombreDepartamentoEqualTo(String value) {
            addCriterion("nm_departa =", CadenaUtil.getStr(value), "nm_departa");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoNotEqualTo(String value) {
            addCriterion("nm_departa <>", CadenaUtil.getStr(value), "nm_departa");
            return (Criteria) this;
        }

        
        public Criteria andStrNombreDepartamentoIsNull() {
            addCriterion("nm_departa is null");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoIsNotNull() {
            addCriterion("nm_departa is not null");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoGreaterThan(String value) {
            addCriterion("nm_departa >", value, "nm_departa");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoGreaterThanOrEqualTo(String value) {
            addCriterion("nm_departa >=", value, "nm_departa");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoLessThan(String value) {
            addCriterion("nm_departa <", value, "nm_departa");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoLessThanOrEqualTo(String value) {
            addCriterion("nm_departa <=", value, "nm_departa");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoIn(List<String> values) {
            addCriterion("nm_departa in", values, "nm_departa");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoNotIn(List<String> values) {
            addCriterion("nm_departa not in", values, "nm_departa");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoBetween(String value1, String value2) {
            addCriterion("nm_departa between", value1, value2, "nm_departa");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoNotBetween(String value1, String value2) {
            addCriterion("nm_departa not between", value1, value2, "nm_departa");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFechaInicioLike(String value) {
            addCriterion("upper(de_fecini) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_fecini");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioNotLike(String value) {
            addCriterion("de_fecini not like", "%" + CadenaUtil.getStr(value) + "%", "de_fecini");
            return (Criteria) this;
        }
			
        public Criteria andStrFechaInicioEqualTo(String value) {
            addCriterion("de_fecini =", CadenaUtil.getStr(value), "de_fecini");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioNotEqualTo(String value) {
            addCriterion("de_fecini <>", CadenaUtil.getStr(value), "de_fecini");
            return (Criteria) this;
        }

        
        public Criteria andStrFechaInicioIsNull() {
            addCriterion("de_fecini is null");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioIsNotNull() {
            addCriterion("de_fecini is not null");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioGreaterThan(String value) {
            addCriterion("de_fecini >", value, "de_fecini");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioGreaterThanOrEqualTo(String value) {
            addCriterion("de_fecini >=", value, "de_fecini");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioLessThan(String value) {
            addCriterion("de_fecini <", value, "de_fecini");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioLessThanOrEqualTo(String value) {
            addCriterion("de_fecini <=", value, "de_fecini");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioIn(List<String> values) {
            addCriterion("de_fecini in", values, "de_fecini");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioNotIn(List<String> values) {
            addCriterion("de_fecini not in", values, "de_fecini");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioBetween(String value1, String value2) {
            addCriterion("de_fecini between", value1, value2, "de_fecini");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioNotBetween(String value1, String value2) {
            addCriterion("de_fecini not between", value1, value2, "de_fecini");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFechaFinLike(String value) {
            addCriterion("upper(de_fecfin) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinNotLike(String value) {
            addCriterion("de_fecfin not like", "%" + CadenaUtil.getStr(value) + "%", "de_fecfin");
            return (Criteria) this;
        }
			
        public Criteria andStrFechaFinEqualTo(String value) {
            addCriterion("de_fecfin =", CadenaUtil.getStr(value), "de_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinNotEqualTo(String value) {
            addCriterion("de_fecfin <>", CadenaUtil.getStr(value), "de_fecfin");
            return (Criteria) this;
        }

        
        public Criteria andStrFechaFinIsNull() {
            addCriterion("de_fecfin is null");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinIsNotNull() {
            addCriterion("de_fecfin is not null");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinGreaterThan(String value) {
            addCriterion("de_fecfin >", value, "de_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinGreaterThanOrEqualTo(String value) {
            addCriterion("de_fecfin >=", value, "de_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinLessThan(String value) {
            addCriterion("de_fecfin <", value, "de_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinLessThanOrEqualTo(String value) {
            addCriterion("de_fecfin <=", value, "de_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinIn(List<String> values) {
            addCriterion("de_fecfin in", values, "de_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinNotIn(List<String> values) {
            addCriterion("de_fecfin not in", values, "de_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinBetween(String value1, String value2) {
            addCriterion("de_fecfin between", value1, value2, "de_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinNotBetween(String value1, String value2) {
            addCriterion("de_fecfin not between", value1, value2, "de_fecfin");
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
        
        
        public Criteria andDblLongitudEqualTo(Double value) {
            addCriterion("ha_longitu =", value, "ha_longitu");
            return (Criteria) this;
        }

        public Criteria andDblLongitudNotEqualTo(Double value) {
            addCriterion("ha_longitu <>", value, "ha_longitu");
            return (Criteria) this;
        }
        
        
        public Criteria andDblLongitudIsNull() {
            addCriterion("ha_longitu is null");
            return (Criteria) this;
        }

        public Criteria andDblLongitudIsNotNull() {
            addCriterion("ha_longitu is not null");
            return (Criteria) this;
        }

        public Criteria andDblLongitudGreaterThan(Double value) {
            addCriterion("ha_longitu >", value, "ha_longitu");
            return (Criteria) this;
        }

        public Criteria andDblLongitudGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_longitu >=", value, "ha_longitu");
            return (Criteria) this;
        }

        public Criteria andDblLongitudLessThan(Double value) {
            addCriterion("ha_longitu <", value, "ha_longitu");
            return (Criteria) this;
        }

        public Criteria andDblLongitudLessThanOrEqualTo(Double value) {
            addCriterion("ha_longitu <=", value, "ha_longitu");
            return (Criteria) this;
        }

        public Criteria andDblLongitudIn(List<Double> values) {
            addCriterion("ha_longitu in", values, "ha_longitu");
            return (Criteria) this;
        }

        public Criteria andDblLongitudNotIn(List<Double> values) {
            addCriterion("ha_longitu not in", values, "ha_longitu");
            return (Criteria) this;
        }

        public Criteria andDblLongitudBetween(Double value1, Double value2) {
            addCriterion("ha_longitu between", value1, value2, "ha_longitu");
            return (Criteria) this;
        }

        public Criteria andDblLongitudNotBetween(Double value1, Double value2) {
            addCriterion("ha_longitu not between", value1, value2, "ha_longitu");
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
        
        
        public Criteria andStrGeometriaLike(String value) {
            addCriterion("upper(si_geometr) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "si_geometr");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaNotLike(String value) {
            addCriterion("si_geometr not like", "%" + CadenaUtil.getStr(value) + "%", "si_geometr");
            return (Criteria) this;
        }
			
        public Criteria andStrGeometriaEqualTo(String value) {
            addCriterion("si_geometr =", CadenaUtil.getStr(value), "si_geometr");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaNotEqualTo(String value) {
            addCriterion("si_geometr <>", CadenaUtil.getStr(value), "si_geometr");
            return (Criteria) this;
        }

        
        public Criteria andStrGeometriaIsNull() {
            addCriterion("si_geometr is null");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaIsNotNull() {
            addCriterion("si_geometr is not null");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaGreaterThan(String value) {
            addCriterion("si_geometr >", value, "si_geometr");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaGreaterThanOrEqualTo(String value) {
            addCriterion("si_geometr >=", value, "si_geometr");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaLessThan(String value) {
            addCriterion("si_geometr <", value, "si_geometr");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaLessThanOrEqualTo(String value) {
            addCriterion("si_geometr <=", value, "si_geometr");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaIn(List<String> values) {
            addCriterion("si_geometr in", values, "si_geometr");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaNotIn(List<String> values) {
            addCriterion("si_geometr not in", values, "si_geometr");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaBetween(String value1, String value2) {
            addCriterion("si_geometr between", value1, value2, "si_geometr");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaNotBetween(String value1, String value2) {
            addCriterion("si_geometr not between", value1, value2, "si_geometr");
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
