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
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andIntIdGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andIntIdGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andIntIdGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIdProvinciaLike(String value) {
            addCriterion("upper(id_provincia) like", "" + CadenaUtil.getStr(value).toUpperCase() + "%", "id_provincia");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaNotLike(String value) {
            addCriterion("id_provincia not like", "%" + CadenaUtil.getStr(value) + "%", "id_provincia");
            return (Criteria) this;
        }
			
        public Criteria andStrIdProvinciaEqualTo(String value) {
            addCriterion("id_provincia =", CadenaUtil.getStr(value), "id_provincia");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaNotEqualTo(String value) {
            addCriterion("id_provincia <>", CadenaUtil.getStr(value), "id_provincia");
            return (Criteria) this;
        }

        
        public Criteria andStrIdProvinciaIsNull() {
            addCriterion("id_provincia is null");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaIsNotNull() {
            addCriterion("id_provincia is not null");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaGreaterThan(String value) {
            addCriterion("id_provincia >", value, "id_provincia");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaGreaterThanOrEqualTo(String value) {
            addCriterion("id_provincia >=", value, "id_provincia");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaLessThan(String value) {
            addCriterion("id_provincia <", value, "id_provincia");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaLessThanOrEqualTo(String value) {
            addCriterion("id_provincia <=", value, "id_provincia");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaIn(List<String> values) {
            addCriterion("id_provincia in", values, "id_provincia");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaNotIn(List<String> values) {
            addCriterion("id_provincia not in", values, "id_provincia");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaBetween(String value1, String value2) {
            addCriterion("id_provincia between", value1, value2, "id_provincia");
            return (Criteria) this;
        }

        public Criteria andStrIdProvinciaNotBetween(String value1, String value2) {
            addCriterion("id_provincia not between", value1, value2, "id_provincia");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombreProvinciaLike(String value) {
            addCriterion("upper(nom_provincia) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_provincia");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaNotLike(String value) {
            addCriterion("nom_provincia not like", "%" + CadenaUtil.getStr(value) + "%", "nom_provincia");
            return (Criteria) this;
        }
			
        public Criteria andStrNombreProvinciaEqualTo(String value) {
            addCriterion("nom_provincia =", CadenaUtil.getStr(value), "nom_provincia");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaNotEqualTo(String value) {
            addCriterion("nom_provincia <>", CadenaUtil.getStr(value), "nom_provincia");
            return (Criteria) this;
        }

        
        public Criteria andStrNombreProvinciaIsNull() {
            addCriterion("nom_provincia is null");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaIsNotNull() {
            addCriterion("nom_provincia is not null");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaGreaterThan(String value) {
            addCriterion("nom_provincia >", value, "nom_provincia");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaGreaterThanOrEqualTo(String value) {
            addCriterion("nom_provincia >=", value, "nom_provincia");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaLessThan(String value) {
            addCriterion("nom_provincia <", value, "nom_provincia");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaLessThanOrEqualTo(String value) {
            addCriterion("nom_provincia <=", value, "nom_provincia");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaIn(List<String> values) {
            addCriterion("nom_provincia in", values, "nom_provincia");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaNotIn(List<String> values) {
            addCriterion("nom_provincia not in", values, "nom_provincia");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaBetween(String value1, String value2) {
            addCriterion("nom_provincia between", value1, value2, "nom_provincia");
            return (Criteria) this;
        }

        public Criteria andStrNombreProvinciaNotBetween(String value1, String value2) {
            addCriterion("nom_provincia not between", value1, value2, "nom_provincia");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombreDepartamentoLike(String value) {
            addCriterion("upper(nom_departamento) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoNotLike(String value) {
            addCriterion("nom_departamento not like", "%" + CadenaUtil.getStr(value) + "%", "nom_departamento");
            return (Criteria) this;
        }
			
        public Criteria andStrNombreDepartamentoEqualTo(String value) {
            addCriterion("nom_departamento =", CadenaUtil.getStr(value), "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoNotEqualTo(String value) {
            addCriterion("nom_departamento <>", CadenaUtil.getStr(value), "nom_departamento");
            return (Criteria) this;
        }

        
        public Criteria andStrNombreDepartamentoIsNull() {
            addCriterion("nom_departamento is null");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoIsNotNull() {
            addCriterion("nom_departamento is not null");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoGreaterThan(String value) {
            addCriterion("nom_departamento >", value, "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoGreaterThanOrEqualTo(String value) {
            addCriterion("nom_departamento >=", value, "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoLessThan(String value) {
            addCriterion("nom_departamento <", value, "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoLessThanOrEqualTo(String value) {
            addCriterion("nom_departamento <=", value, "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoIn(List<String> values) {
            addCriterion("nom_departamento in", values, "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoNotIn(List<String> values) {
            addCriterion("nom_departamento not in", values, "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoBetween(String value1, String value2) {
            addCriterion("nom_departamento between", value1, value2, "nom_departamento");
            return (Criteria) this;
        }

        public Criteria andStrNombreDepartamentoNotBetween(String value1, String value2) {
            addCriterion("nom_departamento not between", value1, value2, "nom_departamento");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFechaInicioLike(String value) {
            addCriterion("upper(des_fecinicio) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_fecinicio");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioNotLike(String value) {
            addCriterion("des_fecinicio not like", "%" + CadenaUtil.getStr(value) + "%", "des_fecinicio");
            return (Criteria) this;
        }
			
        public Criteria andStrFechaInicioEqualTo(String value) {
            addCriterion("des_fecinicio =", CadenaUtil.getStr(value), "des_fecinicio");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioNotEqualTo(String value) {
            addCriterion("des_fecinicio <>", CadenaUtil.getStr(value), "des_fecinicio");
            return (Criteria) this;
        }

        
        public Criteria andStrFechaInicioIsNull() {
            addCriterion("des_fecinicio is null");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioIsNotNull() {
            addCriterion("des_fecinicio is not null");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioGreaterThan(String value) {
            addCriterion("des_fecinicio >", value, "des_fecinicio");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioGreaterThanOrEqualTo(String value) {
            addCriterion("des_fecinicio >=", value, "des_fecinicio");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioLessThan(String value) {
            addCriterion("des_fecinicio <", value, "des_fecinicio");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioLessThanOrEqualTo(String value) {
            addCriterion("des_fecinicio <=", value, "des_fecinicio");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioIn(List<String> values) {
            addCriterion("des_fecinicio in", values, "des_fecinicio");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioNotIn(List<String> values) {
            addCriterion("des_fecinicio not in", values, "des_fecinicio");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioBetween(String value1, String value2) {
            addCriterion("des_fecinicio between", value1, value2, "des_fecinicio");
            return (Criteria) this;
        }

        public Criteria andStrFechaInicioNotBetween(String value1, String value2) {
            addCriterion("des_fecinicio not between", value1, value2, "des_fecinicio");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFechaFinLike(String value) {
            addCriterion("upper(des_fecfin) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinNotLike(String value) {
            addCriterion("des_fecfin not like", "%" + CadenaUtil.getStr(value) + "%", "des_fecfin");
            return (Criteria) this;
        }
			
        public Criteria andStrFechaFinEqualTo(String value) {
            addCriterion("des_fecfin =", CadenaUtil.getStr(value), "des_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinNotEqualTo(String value) {
            addCriterion("des_fecfin <>", CadenaUtil.getStr(value), "des_fecfin");
            return (Criteria) this;
        }

        
        public Criteria andStrFechaFinIsNull() {
            addCriterion("des_fecfin is null");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinIsNotNull() {
            addCriterion("des_fecfin is not null");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinGreaterThan(String value) {
            addCriterion("des_fecfin >", value, "des_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinGreaterThanOrEqualTo(String value) {
            addCriterion("des_fecfin >=", value, "des_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinLessThan(String value) {
            addCriterion("des_fecfin <", value, "des_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinLessThanOrEqualTo(String value) {
            addCriterion("des_fecfin <=", value, "des_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinIn(List<String> values) {
            addCriterion("des_fecfin in", values, "des_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinNotIn(List<String> values) {
            addCriterion("des_fecfin not in", values, "des_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinBetween(String value1, String value2) {
            addCriterion("des_fecfin between", value1, value2, "des_fecfin");
            return (Criteria) this;
        }

        public Criteria andStrFechaFinNotBetween(String value1, String value2) {
            addCriterion("des_fecfin not between", value1, value2, "des_fecfin");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDctoLike(String value) {
            addCriterion("upper(des_dcto) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_dcto");
            return (Criteria) this;
        }

        public Criteria andStrDctoNotLike(String value) {
            addCriterion("des_dcto not like", "%" + CadenaUtil.getStr(value) + "%", "des_dcto");
            return (Criteria) this;
        }
			
        public Criteria andStrDctoEqualTo(String value) {
            addCriterion("des_dcto =", CadenaUtil.getStr(value), "des_dcto");
            return (Criteria) this;
        }

        public Criteria andStrDctoNotEqualTo(String value) {
            addCriterion("des_dcto <>", CadenaUtil.getStr(value), "des_dcto");
            return (Criteria) this;
        }

        
        public Criteria andStrDctoIsNull() {
            addCriterion("des_dcto is null");
            return (Criteria) this;
        }

        public Criteria andStrDctoIsNotNull() {
            addCriterion("des_dcto is not null");
            return (Criteria) this;
        }

        public Criteria andStrDctoGreaterThan(String value) {
            addCriterion("des_dcto >", value, "des_dcto");
            return (Criteria) this;
        }

        public Criteria andStrDctoGreaterThanOrEqualTo(String value) {
            addCriterion("des_dcto >=", value, "des_dcto");
            return (Criteria) this;
        }

        public Criteria andStrDctoLessThan(String value) {
            addCriterion("des_dcto <", value, "des_dcto");
            return (Criteria) this;
        }

        public Criteria andStrDctoLessThanOrEqualTo(String value) {
            addCriterion("des_dcto <=", value, "des_dcto");
            return (Criteria) this;
        }

        public Criteria andStrDctoIn(List<String> values) {
            addCriterion("des_dcto in", values, "des_dcto");
            return (Criteria) this;
        }

        public Criteria andStrDctoNotIn(List<String> values) {
            addCriterion("des_dcto not in", values, "des_dcto");
            return (Criteria) this;
        }

        public Criteria andStrDctoBetween(String value1, String value2) {
            addCriterion("des_dcto between", value1, value2, "des_dcto");
            return (Criteria) this;
        }

        public Criteria andStrDctoNotBetween(String value1, String value2) {
            addCriterion("des_dcto not between", value1, value2, "des_dcto");
            return (Criteria) this;
        }
        
        
        public Criteria andStrLeyLike(String value) {
            addCriterion("upper(des_ley) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_ley");
            return (Criteria) this;
        }

        public Criteria andStrLeyNotLike(String value) {
            addCriterion("des_ley not like", "%" + CadenaUtil.getStr(value) + "%", "des_ley");
            return (Criteria) this;
        }
			
        public Criteria andStrLeyEqualTo(String value) {
            addCriterion("des_ley =", CadenaUtil.getStr(value), "des_ley");
            return (Criteria) this;
        }

        public Criteria andStrLeyNotEqualTo(String value) {
            addCriterion("des_ley <>", CadenaUtil.getStr(value), "des_ley");
            return (Criteria) this;
        }

        
        public Criteria andStrLeyIsNull() {
            addCriterion("des_ley is null");
            return (Criteria) this;
        }

        public Criteria andStrLeyIsNotNull() {
            addCriterion("des_ley is not null");
            return (Criteria) this;
        }

        public Criteria andStrLeyGreaterThan(String value) {
            addCriterion("des_ley >", value, "des_ley");
            return (Criteria) this;
        }

        public Criteria andStrLeyGreaterThanOrEqualTo(String value) {
            addCriterion("des_ley >=", value, "des_ley");
            return (Criteria) this;
        }

        public Criteria andStrLeyLessThan(String value) {
            addCriterion("des_ley <", value, "des_ley");
            return (Criteria) this;
        }

        public Criteria andStrLeyLessThanOrEqualTo(String value) {
            addCriterion("des_ley <=", value, "des_ley");
            return (Criteria) this;
        }

        public Criteria andStrLeyIn(List<String> values) {
            addCriterion("des_ley in", values, "des_ley");
            return (Criteria) this;
        }

        public Criteria andStrLeyNotIn(List<String> values) {
            addCriterion("des_ley not in", values, "des_ley");
            return (Criteria) this;
        }

        public Criteria andStrLeyBetween(String value1, String value2) {
            addCriterion("des_ley between", value1, value2, "des_ley");
            return (Criteria) this;
        }

        public Criteria andStrLeyNotBetween(String value1, String value2) {
            addCriterion("des_ley not between", value1, value2, "des_ley");
            return (Criteria) this;
        }
        
        
        public Criteria andDblLongitudEqualTo(Double value) {
            addCriterion("num_longitud =", value, "num_longitud");
            return (Criteria) this;
        }

        public Criteria andDblLongitudNotEqualTo(Double value) {
            addCriterion("num_longitud <>", value, "num_longitud");
            return (Criteria) this;
        }
        
        
        public Criteria andDblLongitudIsNull() {
            addCriterion("num_longitud is null");
            return (Criteria) this;
        }

        public Criteria andDblLongitudIsNotNull() {
            addCriterion("num_longitud is not null");
            return (Criteria) this;
        }

        public Criteria andDblLongitudGreaterThan(Double value) {
            addCriterion("num_longitud >", value, "num_longitud");
            return (Criteria) this;
        }

        public Criteria andDblLongitudGreaterThanOrEqualTo(Double value) {
            addCriterion("num_longitud >=", value, "num_longitud");
            return (Criteria) this;
        }

        public Criteria andDblLongitudLessThan(Double value) {
            addCriterion("num_longitud <", value, "num_longitud");
            return (Criteria) this;
        }

        public Criteria andDblLongitudLessThanOrEqualTo(Double value) {
            addCriterion("num_longitud <=", value, "num_longitud");
            return (Criteria) this;
        }

        public Criteria andDblLongitudIn(List<Double> values) {
            addCriterion("num_longitud in", values, "num_longitud");
            return (Criteria) this;
        }

        public Criteria andDblLongitudNotIn(List<Double> values) {
            addCriterion("num_longitud not in", values, "num_longitud");
            return (Criteria) this;
        }

        public Criteria andDblLongitudBetween(Double value1, Double value2) {
            addCriterion("num_longitud between", value1, value2, "num_longitud");
            return (Criteria) this;
        }

        public Criteria andDblLongitudNotBetween(Double value1, Double value2) {
            addCriterion("num_longitud not between", value1, value2, "num_longitud");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaEqualTo(Double value) {
            addCriterion("num_area =", value, "num_area");
            return (Criteria) this;
        }

        public Criteria andDblAreaNotEqualTo(Double value) {
            addCriterion("num_area <>", value, "num_area");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaIsNull() {
            addCriterion("num_area is null");
            return (Criteria) this;
        }

        public Criteria andDblAreaIsNotNull() {
            addCriterion("num_area is not null");
            return (Criteria) this;
        }

        public Criteria andDblAreaGreaterThan(Double value) {
            addCriterion("num_area >", value, "num_area");
            return (Criteria) this;
        }

        public Criteria andDblAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("num_area >=", value, "num_area");
            return (Criteria) this;
        }

        public Criteria andDblAreaLessThan(Double value) {
            addCriterion("num_area <", value, "num_area");
            return (Criteria) this;
        }

        public Criteria andDblAreaLessThanOrEqualTo(Double value) {
            addCriterion("num_area <=", value, "num_area");
            return (Criteria) this;
        }

        public Criteria andDblAreaIn(List<Double> values) {
            addCriterion("num_area in", values, "num_area");
            return (Criteria) this;
        }

        public Criteria andDblAreaNotIn(List<Double> values) {
            addCriterion("num_area not in", values, "num_area");
            return (Criteria) this;
        }

        public Criteria andDblAreaBetween(Double value1, Double value2) {
            addCriterion("num_area between", value1, value2, "num_area");
            return (Criteria) this;
        }

        public Criteria andDblAreaNotBetween(Double value1, Double value2) {
            addCriterion("num_area not between", value1, value2, "num_area");
            return (Criteria) this;
        }
        
        
        public Criteria andTimFechaRegistroEqualTo(Date value) {
            addCriterion("fec_registro =", value, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroNotEqualTo(Date value) {
            addCriterion("fec_registro <>", value, "fec_registro");
            return (Criteria) this;
        }
        
        
        public Criteria andTimFechaRegistroIsNull() {
            addCriterion("fec_registro is null");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroIsNotNull() {
            addCriterion("fec_registro is not null");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroGreaterThan(Date value) {
            addCriterion("fec_registro >", value, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroGreaterThanOrEqualTo(Date value) {
            addCriterion("fec_registro >=", value, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroLessThan(Date value) {
            addCriterion("fec_registro <", value, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroLessThanOrEqualTo(Date value) {
            addCriterion("fec_registro <=", value, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroIn(List<Date> values) {
            addCriterion("fec_registro in", values, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroNotIn(List<Date> values) {
            addCriterion("fec_registro not in", values, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroBetween(Date value1, Date value2) {
            addCriterion("fec_registro between", value1, value2, "fec_registro");
            return (Criteria) this;
        }

        public Criteria andTimFechaRegistroNotBetween(Date value1, Date value2) {
            addCriterion("fec_registro not between", value1, value2, "fec_registro");
            return (Criteria) this;
        }
        
        
        public Criteria andStrGeometriaLike(String value) {
            addCriterion("upper(shp_geometria) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaNotLike(String value) {
            addCriterion("shp_geometria not like", "%" + CadenaUtil.getStr(value) + "%", "shp_geometria");
            return (Criteria) this;
        }
			
        public Criteria andStrGeometriaEqualTo(String value) {
            addCriterion("shp_geometria =", CadenaUtil.getStr(value), "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaNotEqualTo(String value) {
            addCriterion("shp_geometria <>", CadenaUtil.getStr(value), "shp_geometria");
            return (Criteria) this;
        }

        
        public Criteria andStrGeometriaIsNull() {
            addCriterion("shp_geometria is null");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaIsNotNull() {
            addCriterion("shp_geometria is not null");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaGreaterThan(String value) {
            addCriterion("shp_geometria >", value, "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaGreaterThanOrEqualTo(String value) {
            addCriterion("shp_geometria >=", value, "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaLessThan(String value) {
            addCriterion("shp_geometria <", value, "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaLessThanOrEqualTo(String value) {
            addCriterion("shp_geometria <=", value, "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaIn(List<String> values) {
            addCriterion("shp_geometria in", values, "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaNotIn(List<String> values) {
            addCriterion("shp_geometria not in", values, "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaBetween(String value1, String value2) {
            addCriterion("shp_geometria between", value1, value2, "shp_geometria");
            return (Criteria) this;
        }

        public Criteria andStrGeometriaNotBetween(String value1, String value2) {
            addCriterion("shp_geometria not between", value1, value2, "shp_geometria");
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
