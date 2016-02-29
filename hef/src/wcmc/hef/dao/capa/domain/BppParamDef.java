package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class BppParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BppParamDef() {
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
        
        
        public Criteria andLngIdEqualTo(Long value) {
            addCriterion("cd_id =", value, "cd_id");
            return (Criteria) this;
        }

        public Criteria andLngIdNotEqualTo(Long value) {
            addCriterion("cd_id <>", value, "cd_id");
            return (Criteria) this;
        }
        
        
        public Criteria andLngIdIsNull() {
            addCriterion("cd_id is null");
            return (Criteria) this;
        }

        public Criteria andLngIdIsNotNull() {
            addCriterion("cd_id is not null");
            return (Criteria) this;
        }

        public Criteria andLngIdGreaterThan(Long value) {
            addCriterion("cd_id >", value, "cd_id");
            return (Criteria) this;
        }

        public Criteria andLngIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cd_id >=", value, "cd_id");
            return (Criteria) this;
        }

        public Criteria andLngIdLessThan(Long value) {
            addCriterion("cd_id <", value, "cd_id");
            return (Criteria) this;
        }

        public Criteria andLngIdLessThanOrEqualTo(Long value) {
            addCriterion("cd_id <=", value, "cd_id");
            return (Criteria) this;
        }

        public Criteria andLngIdIn(List<Long> values) {
            addCriterion("cd_id in", values, "cd_id");
            return (Criteria) this;
        }

        public Criteria andLngIdNotIn(List<Long> values) {
            addCriterion("cd_id not in", values, "cd_id");
            return (Criteria) this;
        }

        public Criteria andLngIdBetween(Long value1, Long value2) {
            addCriterion("cd_id between", value1, value2, "cd_id");
            return (Criteria) this;
        }

        public Criteria andLngIdNotBetween(Long value1, Long value2) {
            addCriterion("cd_id not between", value1, value2, "cd_id");
            return (Criteria) this;
        }
        
        
        public Criteria andStrZonaLike(String value) {
            addCriterion("upper(de_zona) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaNotLike(String value) {
            addCriterion("de_zona not like", "%" + CadenaUtil.getStr(value) + "%", "de_zona");
            return (Criteria) this;
        }
			
        public Criteria andStrZonaEqualTo(String value) {
            addCriterion("de_zona =", CadenaUtil.getStr(value), "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaNotEqualTo(String value) {
            addCriterion("de_zona <>", CadenaUtil.getStr(value), "de_zona");
            return (Criteria) this;
        }

        
        public Criteria andStrZonaIsNull() {
            addCriterion("de_zona is null");
            return (Criteria) this;
        }

        public Criteria andStrZonaIsNotNull() {
            addCriterion("de_zona is not null");
            return (Criteria) this;
        }

        public Criteria andStrZonaGreaterThan(String value) {
            addCriterion("de_zona >", value, "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaGreaterThanOrEqualTo(String value) {
            addCriterion("de_zona >=", value, "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaLessThan(String value) {
            addCriterion("de_zona <", value, "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaLessThanOrEqualTo(String value) {
            addCriterion("de_zona <=", value, "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaIn(List<String> values) {
            addCriterion("de_zona in", values, "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaNotIn(List<String> values) {
            addCriterion("de_zona not in", values, "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaBetween(String value1, String value2) {
            addCriterion("de_zona between", value1, value2, "de_zona");
            return (Criteria) this;
        }

        public Criteria andStrZonaNotBetween(String value1, String value2) {
            addCriterion("de_zona not between", value1, value2, "de_zona");
            return (Criteria) this;
        }
        
        
        public Criteria andStrTipoLike(String value) {
            addCriterion("upper(de_tipo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_tipo");
            return (Criteria) this;
        }

        public Criteria andStrTipoNotLike(String value) {
            addCriterion("de_tipo not like", "%" + CadenaUtil.getStr(value) + "%", "de_tipo");
            return (Criteria) this;
        }
			
        public Criteria andStrTipoEqualTo(String value) {
            addCriterion("de_tipo =", CadenaUtil.getStr(value), "de_tipo");
            return (Criteria) this;
        }

        public Criteria andStrTipoNotEqualTo(String value) {
            addCriterion("de_tipo <>", CadenaUtil.getStr(value), "de_tipo");
            return (Criteria) this;
        }

        
        public Criteria andStrTipoIsNull() {
            addCriterion("de_tipo is null");
            return (Criteria) this;
        }

        public Criteria andStrTipoIsNotNull() {
            addCriterion("de_tipo is not null");
            return (Criteria) this;
        }

        public Criteria andStrTipoGreaterThan(String value) {
            addCriterion("de_tipo >", value, "de_tipo");
            return (Criteria) this;
        }

        public Criteria andStrTipoGreaterThanOrEqualTo(String value) {
            addCriterion("de_tipo >=", value, "de_tipo");
            return (Criteria) this;
        }

        public Criteria andStrTipoLessThan(String value) {
            addCriterion("de_tipo <", value, "de_tipo");
            return (Criteria) this;
        }

        public Criteria andStrTipoLessThanOrEqualTo(String value) {
            addCriterion("de_tipo <=", value, "de_tipo");
            return (Criteria) this;
        }

        public Criteria andStrTipoIn(List<String> values) {
            addCriterion("de_tipo in", values, "de_tipo");
            return (Criteria) this;
        }

        public Criteria andStrTipoNotIn(List<String> values) {
            addCriterion("de_tipo not in", values, "de_tipo");
            return (Criteria) this;
        }

        public Criteria andStrTipoBetween(String value1, String value2) {
            addCriterion("de_tipo between", value1, value2, "de_tipo");
            return (Criteria) this;
        }

        public Criteria andStrTipoNotBetween(String value1, String value2) {
            addCriterion("de_tipo not between", value1, value2, "de_tipo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDenominLike(String value) {
            addCriterion("upper(de_denomin) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_denomin");
            return (Criteria) this;
        }

        public Criteria andStrDenominNotLike(String value) {
            addCriterion("de_denomin not like", "%" + CadenaUtil.getStr(value) + "%", "de_denomin");
            return (Criteria) this;
        }
			
        public Criteria andStrDenominEqualTo(String value) {
            addCriterion("de_denomin =", CadenaUtil.getStr(value), "de_denomin");
            return (Criteria) this;
        }

        public Criteria andStrDenominNotEqualTo(String value) {
            addCriterion("de_denomin <>", CadenaUtil.getStr(value), "de_denomin");
            return (Criteria) this;
        }

        
        public Criteria andStrDenominIsNull() {
            addCriterion("de_denomin is null");
            return (Criteria) this;
        }

        public Criteria andStrDenominIsNotNull() {
            addCriterion("de_denomin is not null");
            return (Criteria) this;
        }

        public Criteria andStrDenominGreaterThan(String value) {
            addCriterion("de_denomin >", value, "de_denomin");
            return (Criteria) this;
        }

        public Criteria andStrDenominGreaterThanOrEqualTo(String value) {
            addCriterion("de_denomin >=", value, "de_denomin");
            return (Criteria) this;
        }

        public Criteria andStrDenominLessThan(String value) {
            addCriterion("de_denomin <", value, "de_denomin");
            return (Criteria) this;
        }

        public Criteria andStrDenominLessThanOrEqualTo(String value) {
            addCriterion("de_denomin <=", value, "de_denomin");
            return (Criteria) this;
        }

        public Criteria andStrDenominIn(List<String> values) {
            addCriterion("de_denomin in", values, "de_denomin");
            return (Criteria) this;
        }

        public Criteria andStrDenominNotIn(List<String> values) {
            addCriterion("de_denomin not in", values, "de_denomin");
            return (Criteria) this;
        }

        public Criteria andStrDenominBetween(String value1, String value2) {
            addCriterion("de_denomin between", value1, value2, "de_denomin");
            return (Criteria) this;
        }

        public Criteria andStrDenominNotBetween(String value1, String value2) {
            addCriterion("de_denomin not between", value1, value2, "de_denomin");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaSigEqualTo(Double value) {
            addCriterion("ha_area_sig =", value, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigNotEqualTo(Double value) {
            addCriterion("ha_area_sig <>", value, "ha_area_sig");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaSigIsNull() {
            addCriterion("ha_area_sig is null");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigIsNotNull() {
            addCriterion("ha_area_sig is not null");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigGreaterThan(Double value) {
            addCriterion("ha_area_sig >", value, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_area_sig >=", value, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigLessThan(Double value) {
            addCriterion("ha_area_sig <", value, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigLessThanOrEqualTo(Double value) {
            addCriterion("ha_area_sig <=", value, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigIn(List<Double> values) {
            addCriterion("ha_area_sig in", values, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigNotIn(List<Double> values) {
            addCriterion("ha_area_sig not in", values, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigBetween(Double value1, Double value2) {
            addCriterion("ha_area_sig between", value1, value2, "ha_area_sig");
            return (Criteria) this;
        }

        public Criteria andDblAreaSigNotBetween(Double value1, Double value2) {
            addCriterion("ha_area_sig not between", value1, value2, "ha_area_sig");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaAprobEqualTo(Double value) {
            addCriterion("ha_area_aprob =", value, "ha_area_aprob");
            return (Criteria) this;
        }

        public Criteria andDblAreaAprobNotEqualTo(Double value) {
            addCriterion("ha_area_aprob <>", value, "ha_area_aprob");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaAprobIsNull() {
            addCriterion("ha_area_aprob is null");
            return (Criteria) this;
        }

        public Criteria andDblAreaAprobIsNotNull() {
            addCriterion("ha_area_aprob is not null");
            return (Criteria) this;
        }

        public Criteria andDblAreaAprobGreaterThan(Double value) {
            addCriterion("ha_area_aprob >", value, "ha_area_aprob");
            return (Criteria) this;
        }

        public Criteria andDblAreaAprobGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_area_aprob >=", value, "ha_area_aprob");
            return (Criteria) this;
        }

        public Criteria andDblAreaAprobLessThan(Double value) {
            addCriterion("ha_area_aprob <", value, "ha_area_aprob");
            return (Criteria) this;
        }

        public Criteria andDblAreaAprobLessThanOrEqualTo(Double value) {
            addCriterion("ha_area_aprob <=", value, "ha_area_aprob");
            return (Criteria) this;
        }

        public Criteria andDblAreaAprobIn(List<Double> values) {
            addCriterion("ha_area_aprob in", values, "ha_area_aprob");
            return (Criteria) this;
        }

        public Criteria andDblAreaAprobNotIn(List<Double> values) {
            addCriterion("ha_area_aprob not in", values, "ha_area_aprob");
            return (Criteria) this;
        }

        public Criteria andDblAreaAprobBetween(Double value1, Double value2) {
            addCriterion("ha_area_aprob between", value1, value2, "ha_area_aprob");
            return (Criteria) this;
        }

        public Criteria andDblAreaAprobNotBetween(Double value1, Double value2) {
            addCriterion("ha_area_aprob not between", value1, value2, "ha_area_aprob");
            return (Criteria) this;
        }
        
        
        public Criteria andStrRegionLike(String value) {
            addCriterion("upper(de_region) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionNotLike(String value) {
            addCriterion("de_region not like", "%" + CadenaUtil.getStr(value) + "%", "de_region");
            return (Criteria) this;
        }
			
        public Criteria andStrRegionEqualTo(String value) {
            addCriterion("de_region =", CadenaUtil.getStr(value), "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionNotEqualTo(String value) {
            addCriterion("de_region <>", CadenaUtil.getStr(value), "de_region");
            return (Criteria) this;
        }

        
        public Criteria andStrRegionIsNull() {
            addCriterion("de_region is null");
            return (Criteria) this;
        }

        public Criteria andStrRegionIsNotNull() {
            addCriterion("de_region is not null");
            return (Criteria) this;
        }

        public Criteria andStrRegionGreaterThan(String value) {
            addCriterion("de_region >", value, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionGreaterThanOrEqualTo(String value) {
            addCriterion("de_region >=", value, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionLessThan(String value) {
            addCriterion("de_region <", value, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionLessThanOrEqualTo(String value) {
            addCriterion("de_region <=", value, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionIn(List<String> values) {
            addCriterion("de_region in", values, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionNotIn(List<String> values) {
            addCriterion("de_region not in", values, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionBetween(String value1, String value2) {
            addCriterion("de_region between", value1, value2, "de_region");
            return (Criteria) this;
        }

        public Criteria andStrRegionNotBetween(String value1, String value2) {
            addCriterion("de_region not between", value1, value2, "de_region");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFuenteLike(String value) {
            addCriterion("upper(de_fuente) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteNotLike(String value) {
            addCriterion("de_fuente not like", "%" + CadenaUtil.getStr(value) + "%", "de_fuente");
            return (Criteria) this;
        }
			
        public Criteria andStrFuenteEqualTo(String value) {
            addCriterion("de_fuente =", CadenaUtil.getStr(value), "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteNotEqualTo(String value) {
            addCriterion("de_fuente <>", CadenaUtil.getStr(value), "de_fuente");
            return (Criteria) this;
        }

        
        public Criteria andStrFuenteIsNull() {
            addCriterion("de_fuente is null");
            return (Criteria) this;
        }

        public Criteria andStrFuenteIsNotNull() {
            addCriterion("de_fuente is not null");
            return (Criteria) this;
        }

        public Criteria andStrFuenteGreaterThan(String value) {
            addCriterion("de_fuente >", value, "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteGreaterThanOrEqualTo(String value) {
            addCriterion("de_fuente >=", value, "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteLessThan(String value) {
            addCriterion("de_fuente <", value, "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteLessThanOrEqualTo(String value) {
            addCriterion("de_fuente <=", value, "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteIn(List<String> values) {
            addCriterion("de_fuente in", values, "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteNotIn(List<String> values) {
            addCriterion("de_fuente not in", values, "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteBetween(String value1, String value2) {
            addCriterion("de_fuente between", value1, value2, "de_fuente");
            return (Criteria) this;
        }

        public Criteria andStrFuenteNotBetween(String value1, String value2) {
            addCriterion("de_fuente not between", value1, value2, "de_fuente");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDocLegalLike(String value) {
            addCriterion("upper(de_doc_legal) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_doc_legal");
            return (Criteria) this;
        }

        public Criteria andStrDocLegalNotLike(String value) {
            addCriterion("de_doc_legal not like", "%" + CadenaUtil.getStr(value) + "%", "de_doc_legal");
            return (Criteria) this;
        }
			
        public Criteria andStrDocLegalEqualTo(String value) {
            addCriterion("de_doc_legal =", CadenaUtil.getStr(value), "de_doc_legal");
            return (Criteria) this;
        }

        public Criteria andStrDocLegalNotEqualTo(String value) {
            addCriterion("de_doc_legal <>", CadenaUtil.getStr(value), "de_doc_legal");
            return (Criteria) this;
        }

        
        public Criteria andStrDocLegalIsNull() {
            addCriterion("de_doc_legal is null");
            return (Criteria) this;
        }

        public Criteria andStrDocLegalIsNotNull() {
            addCriterion("de_doc_legal is not null");
            return (Criteria) this;
        }

        public Criteria andStrDocLegalGreaterThan(String value) {
            addCriterion("de_doc_legal >", value, "de_doc_legal");
            return (Criteria) this;
        }

        public Criteria andStrDocLegalGreaterThanOrEqualTo(String value) {
            addCriterion("de_doc_legal >=", value, "de_doc_legal");
            return (Criteria) this;
        }

        public Criteria andStrDocLegalLessThan(String value) {
            addCriterion("de_doc_legal <", value, "de_doc_legal");
            return (Criteria) this;
        }

        public Criteria andStrDocLegalLessThanOrEqualTo(String value) {
            addCriterion("de_doc_legal <=", value, "de_doc_legal");
            return (Criteria) this;
        }

        public Criteria andStrDocLegalIn(List<String> values) {
            addCriterion("de_doc_legal in", values, "de_doc_legal");
            return (Criteria) this;
        }

        public Criteria andStrDocLegalNotIn(List<String> values) {
            addCriterion("de_doc_legal not in", values, "de_doc_legal");
            return (Criteria) this;
        }

        public Criteria andStrDocLegalBetween(String value1, String value2) {
            addCriterion("de_doc_legal between", value1, value2, "de_doc_legal");
            return (Criteria) this;
        }

        public Criteria andStrDocLegalNotBetween(String value1, String value2) {
            addCriterion("de_doc_legal not between", value1, value2, "de_doc_legal");
            return (Criteria) this;
        }
        
        
        public Criteria andIntTheidEqualTo(Integer value) {
            addCriterion("cd_theid =", value, "cd_theid");
            return (Criteria) this;
        }

        public Criteria andIntTheidNotEqualTo(Integer value) {
            addCriterion("cd_theid <>", value, "cd_theid");
            return (Criteria) this;
        }
        
        
        public Criteria andIntTheidIsNull() {
            addCriterion("cd_theid is null");
            return (Criteria) this;
        }

        public Criteria andIntTheidIsNotNull() {
            addCriterion("cd_theid is not null");
            return (Criteria) this;
        }

        public Criteria andIntTheidGreaterThan(Integer value) {
            addCriterion("cd_theid >", value, "cd_theid");
            return (Criteria) this;
        }

        public Criteria andIntTheidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_theid >=", value, "cd_theid");
            return (Criteria) this;
        }

        public Criteria andIntTheidLessThan(Integer value) {
            addCriterion("cd_theid <", value, "cd_theid");
            return (Criteria) this;
        }

        public Criteria andIntTheidLessThanOrEqualTo(Integer value) {
            addCriterion("cd_theid <=", value, "cd_theid");
            return (Criteria) this;
        }

        public Criteria andIntTheidIn(List<Integer> values) {
            addCriterion("cd_theid in", values, "cd_theid");
            return (Criteria) this;
        }

        public Criteria andIntTheidNotIn(List<Integer> values) {
            addCriterion("cd_theid not in", values, "cd_theid");
            return (Criteria) this;
        }

        public Criteria andIntTheidBetween(Integer value1, Integer value2) {
            addCriterion("cd_theid between", value1, value2, "cd_theid");
            return (Criteria) this;
        }

        public Criteria andIntTheidNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_theid not between", value1, value2, "cd_theid");
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
        
        
        public Criteria andDblHectaresEqualTo(Double value) {
            addCriterion("ha_hectares =", value, "ha_hectares");
            return (Criteria) this;
        }

        public Criteria andDblHectaresNotEqualTo(Double value) {
            addCriterion("ha_hectares <>", value, "ha_hectares");
            return (Criteria) this;
        }
        
        
        public Criteria andDblHectaresIsNull() {
            addCriterion("ha_hectares is null");
            return (Criteria) this;
        }

        public Criteria andDblHectaresIsNotNull() {
            addCriterion("ha_hectares is not null");
            return (Criteria) this;
        }

        public Criteria andDblHectaresGreaterThan(Double value) {
            addCriterion("ha_hectares >", value, "ha_hectares");
            return (Criteria) this;
        }

        public Criteria andDblHectaresGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_hectares >=", value, "ha_hectares");
            return (Criteria) this;
        }

        public Criteria andDblHectaresLessThan(Double value) {
            addCriterion("ha_hectares <", value, "ha_hectares");
            return (Criteria) this;
        }

        public Criteria andDblHectaresLessThanOrEqualTo(Double value) {
            addCriterion("ha_hectares <=", value, "ha_hectares");
            return (Criteria) this;
        }

        public Criteria andDblHectaresIn(List<Double> values) {
            addCriterion("ha_hectares in", values, "ha_hectares");
            return (Criteria) this;
        }

        public Criteria andDblHectaresNotIn(List<Double> values) {
            addCriterion("ha_hectares not in", values, "ha_hectares");
            return (Criteria) this;
        }

        public Criteria andDblHectaresBetween(Double value1, Double value2) {
            addCriterion("ha_hectares between", value1, value2, "ha_hectares");
            return (Criteria) this;
        }

        public Criteria andDblHectaresNotBetween(Double value1, Double value2) {
            addCriterion("ha_hectares not between", value1, value2, "ha_hectares");
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
