package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class TemBioloHumedalesRamsarParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TemBioloHumedalesRamsarParamDef() {
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
        
        
        public Criteria andStrCategoríasLike(String value) {
            addCriterion("upper(de_categorías) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_categorías");
            return (Criteria) this;
        }

        public Criteria andStrCategoríasNotLike(String value) {
            addCriterion("de_categorías not like", "%" + CadenaUtil.getStr(value) + "%", "de_categorías");
            return (Criteria) this;
        }
			
        public Criteria andStrCategoríasEqualTo(String value) {
            addCriterion("de_categorías =", CadenaUtil.getStr(value), "de_categorías");
            return (Criteria) this;
        }

        public Criteria andStrCategoríasNotEqualTo(String value) {
            addCriterion("de_categorías <>", CadenaUtil.getStr(value), "de_categorías");
            return (Criteria) this;
        }

        
        public Criteria andStrCategoríasIsNull() {
            addCriterion("de_categorías is null");
            return (Criteria) this;
        }

        public Criteria andStrCategoríasIsNotNull() {
            addCriterion("de_categorías is not null");
            return (Criteria) this;
        }

        public Criteria andStrCategoríasGreaterThan(String value) {
            addCriterion("de_categorías >", value, "de_categorías");
            return (Criteria) this;
        }

        public Criteria andStrCategoríasGreaterThanOrEqualTo(String value) {
            addCriterion("de_categorías >=", value, "de_categorías");
            return (Criteria) this;
        }

        public Criteria andStrCategoríasLessThan(String value) {
            addCriterion("de_categorías <", value, "de_categorías");
            return (Criteria) this;
        }

        public Criteria andStrCategoríasLessThanOrEqualTo(String value) {
            addCriterion("de_categorías <=", value, "de_categorías");
            return (Criteria) this;
        }

        public Criteria andStrCategoríasIn(List<String> values) {
            addCriterion("de_categorías in", values, "de_categorías");
            return (Criteria) this;
        }

        public Criteria andStrCategoríasNotIn(List<String> values) {
            addCriterion("de_categorías not in", values, "de_categorías");
            return (Criteria) this;
        }

        public Criteria andStrCategoríasBetween(String value1, String value2) {
            addCriterion("de_categorías between", value1, value2, "de_categorías");
            return (Criteria) this;
        }

        public Criteria andStrCategoríasNotBetween(String value1, String value2) {
            addCriterion("de_categorías not between", value1, value2, "de_categorías");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombreLike(String value) {
            addCriterion("upper(de_nombre) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotLike(String value) {
            addCriterion("de_nombre not like", "%" + CadenaUtil.getStr(value) + "%", "de_nombre");
            return (Criteria) this;
        }
			
        public Criteria andStrNombreEqualTo(String value) {
            addCriterion("de_nombre =", CadenaUtil.getStr(value), "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotEqualTo(String value) {
            addCriterion("de_nombre <>", CadenaUtil.getStr(value), "de_nombre");
            return (Criteria) this;
        }

        
        public Criteria andStrNombreIsNull() {
            addCriterion("de_nombre is null");
            return (Criteria) this;
        }

        public Criteria andStrNombreIsNotNull() {
            addCriterion("de_nombre is not null");
            return (Criteria) this;
        }

        public Criteria andStrNombreGreaterThan(String value) {
            addCriterion("de_nombre >", value, "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreGreaterThanOrEqualTo(String value) {
            addCriterion("de_nombre >=", value, "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreLessThan(String value) {
            addCriterion("de_nombre <", value, "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreLessThanOrEqualTo(String value) {
            addCriterion("de_nombre <=", value, "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreIn(List<String> values) {
            addCriterion("de_nombre in", values, "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotIn(List<String> values) {
            addCriterion("de_nombre not in", values, "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreBetween(String value1, String value2) {
            addCriterion("de_nombre between", value1, value2, "de_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombreNotBetween(String value1, String value2) {
            addCriterion("de_nombre not between", value1, value2, "de_nombre");
            return (Criteria) this;
        }
        
        
        public Criteria andStrBaseLegalLike(String value) {
            addCriterion("upper(de_base_legal) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_base_legal");
            return (Criteria) this;
        }

        public Criteria andStrBaseLegalNotLike(String value) {
            addCriterion("de_base_legal not like", "%" + CadenaUtil.getStr(value) + "%", "de_base_legal");
            return (Criteria) this;
        }
			
        public Criteria andStrBaseLegalEqualTo(String value) {
            addCriterion("de_base_legal =", CadenaUtil.getStr(value), "de_base_legal");
            return (Criteria) this;
        }

        public Criteria andStrBaseLegalNotEqualTo(String value) {
            addCriterion("de_base_legal <>", CadenaUtil.getStr(value), "de_base_legal");
            return (Criteria) this;
        }

        
        public Criteria andStrBaseLegalIsNull() {
            addCriterion("de_base_legal is null");
            return (Criteria) this;
        }

        public Criteria andStrBaseLegalIsNotNull() {
            addCriterion("de_base_legal is not null");
            return (Criteria) this;
        }

        public Criteria andStrBaseLegalGreaterThan(String value) {
            addCriterion("de_base_legal >", value, "de_base_legal");
            return (Criteria) this;
        }

        public Criteria andStrBaseLegalGreaterThanOrEqualTo(String value) {
            addCriterion("de_base_legal >=", value, "de_base_legal");
            return (Criteria) this;
        }

        public Criteria andStrBaseLegalLessThan(String value) {
            addCriterion("de_base_legal <", value, "de_base_legal");
            return (Criteria) this;
        }

        public Criteria andStrBaseLegalLessThanOrEqualTo(String value) {
            addCriterion("de_base_legal <=", value, "de_base_legal");
            return (Criteria) this;
        }

        public Criteria andStrBaseLegalIn(List<String> values) {
            addCriterion("de_base_legal in", values, "de_base_legal");
            return (Criteria) this;
        }

        public Criteria andStrBaseLegalNotIn(List<String> values) {
            addCriterion("de_base_legal not in", values, "de_base_legal");
            return (Criteria) this;
        }

        public Criteria andStrBaseLegalBetween(String value1, String value2) {
            addCriterion("de_base_legal between", value1, value2, "de_base_legal");
            return (Criteria) this;
        }

        public Criteria andStrBaseLegalNotBetween(String value1, String value2) {
            addCriterion("de_base_legal not between", value1, value2, "de_base_legal");
            return (Criteria) this;
        }
        
        
        public Criteria andStrUbicaPoliLike(String value) {
            addCriterion("upper(de_ubica_poli) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_ubica_poli");
            return (Criteria) this;
        }

        public Criteria andStrUbicaPoliNotLike(String value) {
            addCriterion("de_ubica_poli not like", "%" + CadenaUtil.getStr(value) + "%", "de_ubica_poli");
            return (Criteria) this;
        }
			
        public Criteria andStrUbicaPoliEqualTo(String value) {
            addCriterion("de_ubica_poli =", CadenaUtil.getStr(value), "de_ubica_poli");
            return (Criteria) this;
        }

        public Criteria andStrUbicaPoliNotEqualTo(String value) {
            addCriterion("de_ubica_poli <>", CadenaUtil.getStr(value), "de_ubica_poli");
            return (Criteria) this;
        }

        
        public Criteria andStrUbicaPoliIsNull() {
            addCriterion("de_ubica_poli is null");
            return (Criteria) this;
        }

        public Criteria andStrUbicaPoliIsNotNull() {
            addCriterion("de_ubica_poli is not null");
            return (Criteria) this;
        }

        public Criteria andStrUbicaPoliGreaterThan(String value) {
            addCriterion("de_ubica_poli >", value, "de_ubica_poli");
            return (Criteria) this;
        }

        public Criteria andStrUbicaPoliGreaterThanOrEqualTo(String value) {
            addCriterion("de_ubica_poli >=", value, "de_ubica_poli");
            return (Criteria) this;
        }

        public Criteria andStrUbicaPoliLessThan(String value) {
            addCriterion("de_ubica_poli <", value, "de_ubica_poli");
            return (Criteria) this;
        }

        public Criteria andStrUbicaPoliLessThanOrEqualTo(String value) {
            addCriterion("de_ubica_poli <=", value, "de_ubica_poli");
            return (Criteria) this;
        }

        public Criteria andStrUbicaPoliIn(List<String> values) {
            addCriterion("de_ubica_poli in", values, "de_ubica_poli");
            return (Criteria) this;
        }

        public Criteria andStrUbicaPoliNotIn(List<String> values) {
            addCriterion("de_ubica_poli not in", values, "de_ubica_poli");
            return (Criteria) this;
        }

        public Criteria andStrUbicaPoliBetween(String value1, String value2) {
            addCriterion("de_ubica_poli between", value1, value2, "de_ubica_poli");
            return (Criteria) this;
        }

        public Criteria andStrUbicaPoliNotBetween(String value1, String value2) {
            addCriterion("de_ubica_poli not between", value1, value2, "de_ubica_poli");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaLegalEqualTo(Double value) {
            addCriterion("ha_area_legal =", value, "ha_area_legal");
            return (Criteria) this;
        }

        public Criteria andDblAreaLegalNotEqualTo(Double value) {
            addCriterion("ha_area_legal <>", value, "ha_area_legal");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaLegalIsNull() {
            addCriterion("ha_area_legal is null");
            return (Criteria) this;
        }

        public Criteria andDblAreaLegalIsNotNull() {
            addCriterion("ha_area_legal is not null");
            return (Criteria) this;
        }

        public Criteria andDblAreaLegalGreaterThan(Double value) {
            addCriterion("ha_area_legal >", value, "ha_area_legal");
            return (Criteria) this;
        }

        public Criteria andDblAreaLegalGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_area_legal >=", value, "ha_area_legal");
            return (Criteria) this;
        }

        public Criteria andDblAreaLegalLessThan(Double value) {
            addCriterion("ha_area_legal <", value, "ha_area_legal");
            return (Criteria) this;
        }

        public Criteria andDblAreaLegalLessThanOrEqualTo(Double value) {
            addCriterion("ha_area_legal <=", value, "ha_area_legal");
            return (Criteria) this;
        }

        public Criteria andDblAreaLegalIn(List<Double> values) {
            addCriterion("ha_area_legal in", values, "ha_area_legal");
            return (Criteria) this;
        }

        public Criteria andDblAreaLegalNotIn(List<Double> values) {
            addCriterion("ha_area_legal not in", values, "ha_area_legal");
            return (Criteria) this;
        }

        public Criteria andDblAreaLegalBetween(Double value1, Double value2) {
            addCriterion("ha_area_legal between", value1, value2, "ha_area_legal");
            return (Criteria) this;
        }

        public Criteria andDblAreaLegalNotBetween(Double value1, Double value2) {
            addCriterion("ha_area_legal not between", value1, value2, "ha_area_legal");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdEqualTo(Integer value) {
            addCriterion("cd_id__ =", value, "cd_id__");
            return (Criteria) this;
        }

        public Criteria andIntIdNotEqualTo(Integer value) {
            addCriterion("cd_id__ <>", value, "cd_id__");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdIsNull() {
            addCriterion("cd_id__ is null");
            return (Criteria) this;
        }

        public Criteria andIntIdIsNotNull() {
            addCriterion("cd_id__ is not null");
            return (Criteria) this;
        }

        public Criteria andIntIdGreaterThan(Integer value) {
            addCriterion("cd_id__ >", value, "cd_id__");
            return (Criteria) this;
        }

        public Criteria andIntIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_id__ >=", value, "cd_id__");
            return (Criteria) this;
        }

        public Criteria andIntIdLessThan(Integer value) {
            addCriterion("cd_id__ <", value, "cd_id__");
            return (Criteria) this;
        }

        public Criteria andIntIdLessThanOrEqualTo(Integer value) {
            addCriterion("cd_id__ <=", value, "cd_id__");
            return (Criteria) this;
        }

        public Criteria andIntIdIn(List<Integer> values) {
            addCriterion("cd_id__ in", values, "cd_id__");
            return (Criteria) this;
        }

        public Criteria andIntIdNotIn(List<Integer> values) {
            addCriterion("cd_id__ not in", values, "cd_id__");
            return (Criteria) this;
        }

        public Criteria andIntIdBetween(Integer value1, Integer value2) {
            addCriterion("cd_id__ between", value1, value2, "cd_id__");
            return (Criteria) this;
        }

        public Criteria andIntIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_id__ not between", value1, value2, "cd_id__");
            return (Criteria) this;
        }
        
        
        public Criteria andStrObservaLike(String value) {
            addCriterion("upper(de_observa) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_observa");
            return (Criteria) this;
        }

        public Criteria andStrObservaNotLike(String value) {
            addCriterion("de_observa not like", "%" + CadenaUtil.getStr(value) + "%", "de_observa");
            return (Criteria) this;
        }
			
        public Criteria andStrObservaEqualTo(String value) {
            addCriterion("de_observa =", CadenaUtil.getStr(value), "de_observa");
            return (Criteria) this;
        }

        public Criteria andStrObservaNotEqualTo(String value) {
            addCriterion("de_observa <>", CadenaUtil.getStr(value), "de_observa");
            return (Criteria) this;
        }

        
        public Criteria andStrObservaIsNull() {
            addCriterion("de_observa is null");
            return (Criteria) this;
        }

        public Criteria andStrObservaIsNotNull() {
            addCriterion("de_observa is not null");
            return (Criteria) this;
        }

        public Criteria andStrObservaGreaterThan(String value) {
            addCriterion("de_observa >", value, "de_observa");
            return (Criteria) this;
        }

        public Criteria andStrObservaGreaterThanOrEqualTo(String value) {
            addCriterion("de_observa >=", value, "de_observa");
            return (Criteria) this;
        }

        public Criteria andStrObservaLessThan(String value) {
            addCriterion("de_observa <", value, "de_observa");
            return (Criteria) this;
        }

        public Criteria andStrObservaLessThanOrEqualTo(String value) {
            addCriterion("de_observa <=", value, "de_observa");
            return (Criteria) this;
        }

        public Criteria andStrObservaIn(List<String> values) {
            addCriterion("de_observa in", values, "de_observa");
            return (Criteria) this;
        }

        public Criteria andStrObservaNotIn(List<String> values) {
            addCriterion("de_observa not in", values, "de_observa");
            return (Criteria) this;
        }

        public Criteria andStrObservaBetween(String value1, String value2) {
            addCriterion("de_observa between", value1, value2, "de_observa");
            return (Criteria) this;
        }

        public Criteria andStrObservaNotBetween(String value1, String value2) {
            addCriterion("de_observa not between", value1, value2, "de_observa");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeAreaEqualTo(Double value) {
            addCriterion("ha_shape_area =", value, "ha_shape_area");
            return (Criteria) this;
        }

        public Criteria andDblShapeAreaNotEqualTo(Double value) {
            addCriterion("ha_shape_area <>", value, "ha_shape_area");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeAreaIsNull() {
            addCriterion("ha_shape_area is null");
            return (Criteria) this;
        }

        public Criteria andDblShapeAreaIsNotNull() {
            addCriterion("ha_shape_area is not null");
            return (Criteria) this;
        }

        public Criteria andDblShapeAreaGreaterThan(Double value) {
            addCriterion("ha_shape_area >", value, "ha_shape_area");
            return (Criteria) this;
        }

        public Criteria andDblShapeAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_shape_area >=", value, "ha_shape_area");
            return (Criteria) this;
        }

        public Criteria andDblShapeAreaLessThan(Double value) {
            addCriterion("ha_shape_area <", value, "ha_shape_area");
            return (Criteria) this;
        }

        public Criteria andDblShapeAreaLessThanOrEqualTo(Double value) {
            addCriterion("ha_shape_area <=", value, "ha_shape_area");
            return (Criteria) this;
        }

        public Criteria andDblShapeAreaIn(List<Double> values) {
            addCriterion("ha_shape_area in", values, "ha_shape_area");
            return (Criteria) this;
        }

        public Criteria andDblShapeAreaNotIn(List<Double> values) {
            addCriterion("ha_shape_area not in", values, "ha_shape_area");
            return (Criteria) this;
        }

        public Criteria andDblShapeAreaBetween(Double value1, Double value2) {
            addCriterion("ha_shape_area between", value1, value2, "ha_shape_area");
            return (Criteria) this;
        }

        public Criteria andDblShapeAreaNotBetween(Double value1, Double value2) {
            addCriterion("ha_shape_area not between", value1, value2, "ha_shape_area");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeLenEqualTo(Double value) {
            addCriterion("ha_shape_len =", value, "ha_shape_len");
            return (Criteria) this;
        }

        public Criteria andDblShapeLenNotEqualTo(Double value) {
            addCriterion("ha_shape_len <>", value, "ha_shape_len");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeLenIsNull() {
            addCriterion("ha_shape_len is null");
            return (Criteria) this;
        }

        public Criteria andDblShapeLenIsNotNull() {
            addCriterion("ha_shape_len is not null");
            return (Criteria) this;
        }

        public Criteria andDblShapeLenGreaterThan(Double value) {
            addCriterion("ha_shape_len >", value, "ha_shape_len");
            return (Criteria) this;
        }

        public Criteria andDblShapeLenGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_shape_len >=", value, "ha_shape_len");
            return (Criteria) this;
        }

        public Criteria andDblShapeLenLessThan(Double value) {
            addCriterion("ha_shape_len <", value, "ha_shape_len");
            return (Criteria) this;
        }

        public Criteria andDblShapeLenLessThanOrEqualTo(Double value) {
            addCriterion("ha_shape_len <=", value, "ha_shape_len");
            return (Criteria) this;
        }

        public Criteria andDblShapeLenIn(List<Double> values) {
            addCriterion("ha_shape_len in", values, "ha_shape_len");
            return (Criteria) this;
        }

        public Criteria andDblShapeLenNotIn(List<Double> values) {
            addCriterion("ha_shape_len not in", values, "ha_shape_len");
            return (Criteria) this;
        }

        public Criteria andDblShapeLenBetween(Double value1, Double value2) {
            addCriterion("ha_shape_len between", value1, value2, "ha_shape_len");
            return (Criteria) this;
        }

        public Criteria andDblShapeLenNotBetween(Double value1, Double value2) {
            addCriterion("ha_shape_len not between", value1, value2, "ha_shape_len");
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
