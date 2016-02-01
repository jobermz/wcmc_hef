package wcmc.hef.dao.visor.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class CapaDistritoParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CapaDistritoParamDef() {
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
        
        
        public Criteria andStrIdDistritoLike(String value) {
            addCriterion("upper(id_distrito) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "id_distrito");
            return (Criteria) this;
        }

        public Criteria andStrIdDistritoNotLike(String value) {
            addCriterion("id_distrito not like", "%" + CadenaUtil.getStr(value) + "%", "id_distrito");
            return (Criteria) this;
        }
			
        public Criteria andStrIdDistritoEqualTo(String value) {
            addCriterion("id_distrito =", CadenaUtil.getStr(value), "id_distrito");
            return (Criteria) this;
        }

        public Criteria andStrIdDistritoNotEqualTo(String value) {
            addCriterion("id_distrito <>", CadenaUtil.getStr(value), "id_distrito");
            return (Criteria) this;
        }

        
        public Criteria andStrIdDistritoIsNull() {
            addCriterion("id_distrito is null");
            return (Criteria) this;
        }

        public Criteria andStrIdDistritoIsNotNull() {
            addCriterion("id_distrito is not null");
            return (Criteria) this;
        }

        public Criteria andStrIdDistritoGreaterThan(String value) {
            addCriterion("id_distrito >", value, "id_distrito");
            return (Criteria) this;
        }

        public Criteria andStrIdDistritoGreaterThanOrEqualTo(String value) {
            addCriterion("id_distrito >=", value, "id_distrito");
            return (Criteria) this;
        }

        public Criteria andStrIdDistritoLessThan(String value) {
            addCriterion("id_distrito <", value, "id_distrito");
            return (Criteria) this;
        }

        public Criteria andStrIdDistritoLessThanOrEqualTo(String value) {
            addCriterion("id_distrito <=", value, "id_distrito");
            return (Criteria) this;
        }

        public Criteria andStrIdDistritoIn(List<String> values) {
            addCriterion("id_distrito in", values, "id_distrito");
            return (Criteria) this;
        }

        public Criteria andStrIdDistritoNotIn(List<String> values) {
            addCriterion("id_distrito not in", values, "id_distrito");
            return (Criteria) this;
        }

        public Criteria andStrIdDistritoBetween(String value1, String value2) {
            addCriterion("id_distrito between", value1, value2, "id_distrito");
            return (Criteria) this;
        }

        public Criteria andStrIdDistritoNotBetween(String value1, String value2) {
            addCriterion("id_distrito not between", value1, value2, "id_distrito");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIdProvinciaLike(String value) {
            addCriterion("upper(id_provincia) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "id_provincia");
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
        
        
        public Criteria andStrIdDepartamentoLike(String value) {
            addCriterion("upper(id_departamento) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoNotLike(String value) {
            addCriterion("id_departamento not like", "%" + CadenaUtil.getStr(value) + "%", "id_departamento");
            return (Criteria) this;
        }
			
        public Criteria andStrIdDepartamentoEqualTo(String value) {
            addCriterion("id_departamento =", CadenaUtil.getStr(value), "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoNotEqualTo(String value) {
            addCriterion("id_departamento <>", CadenaUtil.getStr(value), "id_departamento");
            return (Criteria) this;
        }

        
        public Criteria andStrIdDepartamentoIsNull() {
            addCriterion("id_departamento is null");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoIsNotNull() {
            addCriterion("id_departamento is not null");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoGreaterThan(String value) {
            addCriterion("id_departamento >", value, "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoGreaterThanOrEqualTo(String value) {
            addCriterion("id_departamento >=", value, "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoLessThan(String value) {
            addCriterion("id_departamento <", value, "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoLessThanOrEqualTo(String value) {
            addCriterion("id_departamento <=", value, "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoIn(List<String> values) {
            addCriterion("id_departamento in", values, "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoNotIn(List<String> values) {
            addCriterion("id_departamento not in", values, "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoBetween(String value1, String value2) {
            addCriterion("id_departamento between", value1, value2, "id_departamento");
            return (Criteria) this;
        }

        public Criteria andStrIdDepartamentoNotBetween(String value1, String value2) {
            addCriterion("id_departamento not between", value1, value2, "id_departamento");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombreDistritoLike(String value) {
            addCriterion("upper(nom_distrito) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_distrito");
            return (Criteria) this;
        }

        public Criteria andStrNombreDistritoNotLike(String value) {
            addCriterion("nom_distrito not like", "%" + CadenaUtil.getStr(value) + "%", "nom_distrito");
            return (Criteria) this;
        }
			
        public Criteria andStrNombreDistritoEqualTo(String value) {
            addCriterion("nom_distrito =", CadenaUtil.getStr(value), "nom_distrito");
            return (Criteria) this;
        }

        public Criteria andStrNombreDistritoNotEqualTo(String value) {
            addCriterion("nom_distrito <>", CadenaUtil.getStr(value), "nom_distrito");
            return (Criteria) this;
        }

        
        public Criteria andStrNombreDistritoIsNull() {
            addCriterion("nom_distrito is null");
            return (Criteria) this;
        }

        public Criteria andStrNombreDistritoIsNotNull() {
            addCriterion("nom_distrito is not null");
            return (Criteria) this;
        }

        public Criteria andStrNombreDistritoGreaterThan(String value) {
            addCriterion("nom_distrito >", value, "nom_distrito");
            return (Criteria) this;
        }

        public Criteria andStrNombreDistritoGreaterThanOrEqualTo(String value) {
            addCriterion("nom_distrito >=", value, "nom_distrito");
            return (Criteria) this;
        }

        public Criteria andStrNombreDistritoLessThan(String value) {
            addCriterion("nom_distrito <", value, "nom_distrito");
            return (Criteria) this;
        }

        public Criteria andStrNombreDistritoLessThanOrEqualTo(String value) {
            addCriterion("nom_distrito <=", value, "nom_distrito");
            return (Criteria) this;
        }

        public Criteria andStrNombreDistritoIn(List<String> values) {
            addCriterion("nom_distrito in", values, "nom_distrito");
            return (Criteria) this;
        }

        public Criteria andStrNombreDistritoNotIn(List<String> values) {
            addCriterion("nom_distrito not in", values, "nom_distrito");
            return (Criteria) this;
        }

        public Criteria andStrNombreDistritoBetween(String value1, String value2) {
            addCriterion("nom_distrito between", value1, value2, "nom_distrito");
            return (Criteria) this;
        }

        public Criteria andStrNombreDistritoNotBetween(String value1, String value2) {
            addCriterion("nom_distrito not between", value1, value2, "nom_distrito");
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
        
        
        public Criteria andStrFechaLike(String value) {
            addCriterion("upper(des_fecha) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "des_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaNotLike(String value) {
            addCriterion("des_fecha not like", "%" + CadenaUtil.getStr(value) + "%", "des_fecha");
            return (Criteria) this;
        }
			
        public Criteria andStrFechaEqualTo(String value) {
            addCriterion("des_fecha =", CadenaUtil.getStr(value), "des_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaNotEqualTo(String value) {
            addCriterion("des_fecha <>", CadenaUtil.getStr(value), "des_fecha");
            return (Criteria) this;
        }

        
        public Criteria andStrFechaIsNull() {
            addCriterion("des_fecha is null");
            return (Criteria) this;
        }

        public Criteria andStrFechaIsNotNull() {
            addCriterion("des_fecha is not null");
            return (Criteria) this;
        }

        public Criteria andStrFechaGreaterThan(String value) {
            addCriterion("des_fecha >", value, "des_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaGreaterThanOrEqualTo(String value) {
            addCriterion("des_fecha >=", value, "des_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaLessThan(String value) {
            addCriterion("des_fecha <", value, "des_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaLessThanOrEqualTo(String value) {
            addCriterion("des_fecha <=", value, "des_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaIn(List<String> values) {
            addCriterion("des_fecha in", values, "des_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaNotIn(List<String> values) {
            addCriterion("des_fecha not in", values, "des_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaBetween(String value1, String value2) {
            addCriterion("des_fecha between", value1, value2, "des_fecha");
            return (Criteria) this;
        }

        public Criteria andStrFechaNotBetween(String value1, String value2) {
            addCriterion("des_fecha not between", value1, value2, "des_fecha");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCapaLike(String value) {
            addCriterion("upper(nom_capa) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_capa");
            return (Criteria) this;
        }

        public Criteria andStrCapaNotLike(String value) {
            addCriterion("nom_capa not like", "%" + CadenaUtil.getStr(value) + "%", "nom_capa");
            return (Criteria) this;
        }
			
        public Criteria andStrCapaEqualTo(String value) {
            addCriterion("nom_capa =", CadenaUtil.getStr(value), "nom_capa");
            return (Criteria) this;
        }

        public Criteria andStrCapaNotEqualTo(String value) {
            addCriterion("nom_capa <>", CadenaUtil.getStr(value), "nom_capa");
            return (Criteria) this;
        }

        
        public Criteria andStrCapaIsNull() {
            addCriterion("nom_capa is null");
            return (Criteria) this;
        }

        public Criteria andStrCapaIsNotNull() {
            addCriterion("nom_capa is not null");
            return (Criteria) this;
        }

        public Criteria andStrCapaGreaterThan(String value) {
            addCriterion("nom_capa >", value, "nom_capa");
            return (Criteria) this;
        }

        public Criteria andStrCapaGreaterThanOrEqualTo(String value) {
            addCriterion("nom_capa >=", value, "nom_capa");
            return (Criteria) this;
        }

        public Criteria andStrCapaLessThan(String value) {
            addCriterion("nom_capa <", value, "nom_capa");
            return (Criteria) this;
        }

        public Criteria andStrCapaLessThanOrEqualTo(String value) {
            addCriterion("nom_capa <=", value, "nom_capa");
            return (Criteria) this;
        }

        public Criteria andStrCapaIn(List<String> values) {
            addCriterion("nom_capa in", values, "nom_capa");
            return (Criteria) this;
        }

        public Criteria andStrCapaNotIn(List<String> values) {
            addCriterion("nom_capa not in", values, "nom_capa");
            return (Criteria) this;
        }

        public Criteria andStrCapaBetween(String value1, String value2) {
            addCriterion("nom_capa between", value1, value2, "nom_capa");
            return (Criteria) this;
        }

        public Criteria andStrCapaNotBetween(String value1, String value2) {
            addCriterion("nom_capa not between", value1, value2, "nom_capa");
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
