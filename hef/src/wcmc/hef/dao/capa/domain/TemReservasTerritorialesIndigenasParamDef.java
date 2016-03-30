package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class TemReservasTerritorialesIndigenasParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected String strHashConsulta;
	
    public TemReservasTerritorialesIndigenasParamDef() {
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
        
        
        public Criteria andStrGmlIdLike(String value) {
            addCriterion("upper(de_gml_id) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdNotLike(String value) {
            addCriterion("de_gml_id not like", "%" + CadenaUtil.getStr(value) + "%", "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdEqualTo(String value) {
            addCriterion("de_gml_id =", CadenaUtil.getStr(value), "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdNotEqualTo(String value) {
            addCriterion("de_gml_id <>", CadenaUtil.getStr(value), "de_gml_id");
            return (Criteria) this;
        }
        
        
        public Criteria andStrGmlIdIsNull() {
            addCriterion("de_gml_id is null");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdIsNotNull() {
            addCriterion("de_gml_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdGreaterThan(String value) {
            addCriterion("de_gml_id >", value, "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdGreaterThanOrEqualTo(String value) {
            addCriterion("de_gml_id >=", value, "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdLessThan(String value) {
            addCriterion("de_gml_id <", value, "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdLessThanOrEqualTo(String value) {
            addCriterion("de_gml_id <=", value, "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdIn(List<String> values) {
            addCriterion("de_gml_id in", values, "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdNotIn(List<String> values) {
            addCriterion("de_gml_id not in", values, "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdBetween(String value1, String value2) {
            addCriterion("de_gml_id between", value1, value2, "de_gml_id");
            return (Criteria) this;
        }
        
        public Criteria andStrGmlIdNotBetween(String value1, String value2) {
            addCriterion("de_gml_id not between", value1, value2, "de_gml_id");
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
        
        
        public Criteria andIntIdEqualTo(Integer value) {
            addCriterion("cd_id =", value, "cd_id");
            return (Criteria) this;
        }
        
        public Criteria andIntIdNotEqualTo(Integer value) {
            addCriterion("cd_id <>", value, "cd_id");
            return (Criteria) this;
        }
        
        
        public Criteria andIntIdIsNull() {
            addCriterion("cd_id is null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdIsNotNull() {
            addCriterion("cd_id is not null");
            return (Criteria) this;
        }
        
        public Criteria andIntIdGreaterThan(Integer value) {
            addCriterion("cd_id >", value, "cd_id");
            return (Criteria) this;
        }
        
        public Criteria andIntIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_id >=", value, "cd_id");
            return (Criteria) this;
        }
        
        public Criteria andIntIdLessThan(Integer value) {
            addCriterion("cd_id <", value, "cd_id");
            return (Criteria) this;
        }
        
        public Criteria andIntIdLessThanOrEqualTo(Integer value) {
            addCriterion("cd_id <=", value, "cd_id");
            return (Criteria) this;
        }
        
        public Criteria andIntIdIn(List<Integer> values) {
            addCriterion("cd_id in", values, "cd_id");
            return (Criteria) this;
        }
        
        public Criteria andIntIdNotIn(List<Integer> values) {
            addCriterion("cd_id not in", values, "cd_id");
            return (Criteria) this;
        }
        
        public Criteria andIntIdBetween(Integer value1, Integer value2) {
            addCriterion("cd_id between", value1, value2, "cd_id");
            return (Criteria) this;
        }
        
        public Criteria andIntIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_id not between", value1, value2, "cd_id");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSdeDboTeEqualTo(Double value) {
            addCriterion("ha_sde_dbo_te =", value, "ha_sde_dbo_te");
            return (Criteria) this;
        }
        
        public Criteria andDblSdeDboTeNotEqualTo(Double value) {
            addCriterion("ha_sde_dbo_te <>", value, "ha_sde_dbo_te");
            return (Criteria) this;
        }
        
        
        public Criteria andDblSdeDboTeIsNull() {
            addCriterion("ha_sde_dbo_te is null");
            return (Criteria) this;
        }
        
        public Criteria andDblSdeDboTeIsNotNull() {
            addCriterion("ha_sde_dbo_te is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblSdeDboTeGreaterThan(Double value) {
            addCriterion("ha_sde_dbo_te >", value, "ha_sde_dbo_te");
            return (Criteria) this;
        }
        
        public Criteria andDblSdeDboTeGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_sde_dbo_te >=", value, "ha_sde_dbo_te");
            return (Criteria) this;
        }
        
        public Criteria andDblSdeDboTeLessThan(Double value) {
            addCriterion("ha_sde_dbo_te <", value, "ha_sde_dbo_te");
            return (Criteria) this;
        }
        
        public Criteria andDblSdeDboTeLessThanOrEqualTo(Double value) {
            addCriterion("ha_sde_dbo_te <=", value, "ha_sde_dbo_te");
            return (Criteria) this;
        }
        
        public Criteria andDblSdeDboTeIn(List<Double> values) {
            addCriterion("ha_sde_dbo_te in", values, "ha_sde_dbo_te");
            return (Criteria) this;
        }
        
        public Criteria andDblSdeDboTeNotIn(List<Double> values) {
            addCriterion("ha_sde_dbo_te not in", values, "ha_sde_dbo_te");
            return (Criteria) this;
        }
        
        public Criteria andDblSdeDboTeBetween(Double value1, Double value2) {
            addCriterion("ha_sde_dbo_te between", value1, value2, "ha_sde_dbo_te");
            return (Criteria) this;
        }
        
        public Criteria andDblSdeDboTeNotBetween(Double value1, Double value2) {
            addCriterion("ha_sde_dbo_te not between", value1, value2, "ha_sde_dbo_te");
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
        
        
        public Criteria andDblNHaIbcEqualTo(Double value) {
            addCriterion("ha_n_ha_ibc =", value, "ha_n_ha_ibc");
            return (Criteria) this;
        }
        
        public Criteria andDblNHaIbcNotEqualTo(Double value) {
            addCriterion("ha_n_ha_ibc <>", value, "ha_n_ha_ibc");
            return (Criteria) this;
        }
        
        
        public Criteria andDblNHaIbcIsNull() {
            addCriterion("ha_n_ha_ibc is null");
            return (Criteria) this;
        }
        
        public Criteria andDblNHaIbcIsNotNull() {
            addCriterion("ha_n_ha_ibc is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblNHaIbcGreaterThan(Double value) {
            addCriterion("ha_n_ha_ibc >", value, "ha_n_ha_ibc");
            return (Criteria) this;
        }
        
        public Criteria andDblNHaIbcGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_n_ha_ibc >=", value, "ha_n_ha_ibc");
            return (Criteria) this;
        }
        
        public Criteria andDblNHaIbcLessThan(Double value) {
            addCriterion("ha_n_ha_ibc <", value, "ha_n_ha_ibc");
            return (Criteria) this;
        }
        
        public Criteria andDblNHaIbcLessThanOrEqualTo(Double value) {
            addCriterion("ha_n_ha_ibc <=", value, "ha_n_ha_ibc");
            return (Criteria) this;
        }
        
        public Criteria andDblNHaIbcIn(List<Double> values) {
            addCriterion("ha_n_ha_ibc in", values, "ha_n_ha_ibc");
            return (Criteria) this;
        }
        
        public Criteria andDblNHaIbcNotIn(List<Double> values) {
            addCriterion("ha_n_ha_ibc not in", values, "ha_n_ha_ibc");
            return (Criteria) this;
        }
        
        public Criteria andDblNHaIbcBetween(Double value1, Double value2) {
            addCriterion("ha_n_ha_ibc between", value1, value2, "ha_n_ha_ibc");
            return (Criteria) this;
        }
        
        public Criteria andDblNHaIbcNotBetween(Double value1, Double value2) {
            addCriterion("ha_n_ha_ibc not between", value1, value2, "ha_n_ha_ibc");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNUbicAnpLike(String value) {
            addCriterion("upper(de_n_ubic_anp) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_n_ubic_anp");
            return (Criteria) this;
        }
        
        public Criteria andStrNUbicAnpNotLike(String value) {
            addCriterion("de_n_ubic_anp not like", "%" + CadenaUtil.getStr(value) + "%", "de_n_ubic_anp");
            return (Criteria) this;
        }
        
        public Criteria andStrNUbicAnpEqualTo(String value) {
            addCriterion("de_n_ubic_anp =", CadenaUtil.getStr(value), "de_n_ubic_anp");
            return (Criteria) this;
        }
        
        public Criteria andStrNUbicAnpNotEqualTo(String value) {
            addCriterion("de_n_ubic_anp <>", CadenaUtil.getStr(value), "de_n_ubic_anp");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNUbicAnpIsNull() {
            addCriterion("de_n_ubic_anp is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNUbicAnpIsNotNull() {
            addCriterion("de_n_ubic_anp is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNUbicAnpGreaterThan(String value) {
            addCriterion("de_n_ubic_anp >", value, "de_n_ubic_anp");
            return (Criteria) this;
        }
        
        public Criteria andStrNUbicAnpGreaterThanOrEqualTo(String value) {
            addCriterion("de_n_ubic_anp >=", value, "de_n_ubic_anp");
            return (Criteria) this;
        }
        
        public Criteria andStrNUbicAnpLessThan(String value) {
            addCriterion("de_n_ubic_anp <", value, "de_n_ubic_anp");
            return (Criteria) this;
        }
        
        public Criteria andStrNUbicAnpLessThanOrEqualTo(String value) {
            addCriterion("de_n_ubic_anp <=", value, "de_n_ubic_anp");
            return (Criteria) this;
        }
        
        public Criteria andStrNUbicAnpIn(List<String> values) {
            addCriterion("de_n_ubic_anp in", values, "de_n_ubic_anp");
            return (Criteria) this;
        }
        
        public Criteria andStrNUbicAnpNotIn(List<String> values) {
            addCriterion("de_n_ubic_anp not in", values, "de_n_ubic_anp");
            return (Criteria) this;
        }
        
        public Criteria andStrNUbicAnpBetween(String value1, String value2) {
            addCriterion("de_n_ubic_anp between", value1, value2, "de_n_ubic_anp");
            return (Criteria) this;
        }
        
        public Criteria andStrNUbicAnpNotBetween(String value1, String value2) {
            addCriterion("de_n_ubic_anp not between", value1, value2, "de_n_ubic_anp");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNMapA0Like(String value) {
            addCriterion("upper(de_n_map_a0) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_n_map_a0");
            return (Criteria) this;
        }
        
        public Criteria andStrNMapA0NotLike(String value) {
            addCriterion("de_n_map_a0 not like", "%" + CadenaUtil.getStr(value) + "%", "de_n_map_a0");
            return (Criteria) this;
        }
        
        public Criteria andStrNMapA0EqualTo(String value) {
            addCriterion("de_n_map_a0 =", CadenaUtil.getStr(value), "de_n_map_a0");
            return (Criteria) this;
        }
        
        public Criteria andStrNMapA0NotEqualTo(String value) {
            addCriterion("de_n_map_a0 <>", CadenaUtil.getStr(value), "de_n_map_a0");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNMapA0IsNull() {
            addCriterion("de_n_map_a0 is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNMapA0IsNotNull() {
            addCriterion("de_n_map_a0 is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNMapA0GreaterThan(String value) {
            addCriterion("de_n_map_a0 >", value, "de_n_map_a0");
            return (Criteria) this;
        }
        
        public Criteria andStrNMapA0GreaterThanOrEqualTo(String value) {
            addCriterion("de_n_map_a0 >=", value, "de_n_map_a0");
            return (Criteria) this;
        }
        
        public Criteria andStrNMapA0LessThan(String value) {
            addCriterion("de_n_map_a0 <", value, "de_n_map_a0");
            return (Criteria) this;
        }
        
        public Criteria andStrNMapA0LessThanOrEqualTo(String value) {
            addCriterion("de_n_map_a0 <=", value, "de_n_map_a0");
            return (Criteria) this;
        }
        
        public Criteria andStrNMapA0In(List<String> values) {
            addCriterion("de_n_map_a0 in", values, "de_n_map_a0");
            return (Criteria) this;
        }
        
        public Criteria andStrNMapA0NotIn(List<String> values) {
            addCriterion("de_n_map_a0 not in", values, "de_n_map_a0");
            return (Criteria) this;
        }
        
        public Criteria andStrNMapA0Between(String value1, String value2) {
            addCriterion("de_n_map_a0 between", value1, value2, "de_n_map_a0");
            return (Criteria) this;
        }
        
        public Criteria andStrNMapA0NotBetween(String value1, String value2) {
            addCriterion("de_n_map_a0 not between", value1, value2, "de_n_map_a0");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCategoriaLike(String value) {
            addCriterion("upper(de_categoria) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_categoria");
            return (Criteria) this;
        }
        
        public Criteria andStrCategoriaNotLike(String value) {
            addCriterion("de_categoria not like", "%" + CadenaUtil.getStr(value) + "%", "de_categoria");
            return (Criteria) this;
        }
        
        public Criteria andStrCategoriaEqualTo(String value) {
            addCriterion("de_categoria =", CadenaUtil.getStr(value), "de_categoria");
            return (Criteria) this;
        }
        
        public Criteria andStrCategoriaNotEqualTo(String value) {
            addCriterion("de_categoria <>", CadenaUtil.getStr(value), "de_categoria");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCategoriaIsNull() {
            addCriterion("de_categoria is null");
            return (Criteria) this;
        }
        
        public Criteria andStrCategoriaIsNotNull() {
            addCriterion("de_categoria is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrCategoriaGreaterThan(String value) {
            addCriterion("de_categoria >", value, "de_categoria");
            return (Criteria) this;
        }
        
        public Criteria andStrCategoriaGreaterThanOrEqualTo(String value) {
            addCriterion("de_categoria >=", value, "de_categoria");
            return (Criteria) this;
        }
        
        public Criteria andStrCategoriaLessThan(String value) {
            addCriterion("de_categoria <", value, "de_categoria");
            return (Criteria) this;
        }
        
        public Criteria andStrCategoriaLessThanOrEqualTo(String value) {
            addCriterion("de_categoria <=", value, "de_categoria");
            return (Criteria) this;
        }
        
        public Criteria andStrCategoriaIn(List<String> values) {
            addCriterion("de_categoria in", values, "de_categoria");
            return (Criteria) this;
        }
        
        public Criteria andStrCategoriaNotIn(List<String> values) {
            addCriterion("de_categoria not in", values, "de_categoria");
            return (Criteria) this;
        }
        
        public Criteria andStrCategoriaBetween(String value1, String value2) {
            addCriterion("de_categoria between", value1, value2, "de_categoria");
            return (Criteria) this;
        }
        
        public Criteria andStrCategoriaNotBetween(String value1, String value2) {
            addCriterion("de_categoria not between", value1, value2, "de_categoria");
            return (Criteria) this;
        }
        
        
        public Criteria andStrEtniaLike(String value) {
            addCriterion("upper(de_etnia) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_etnia");
            return (Criteria) this;
        }
        
        public Criteria andStrEtniaNotLike(String value) {
            addCriterion("de_etnia not like", "%" + CadenaUtil.getStr(value) + "%", "de_etnia");
            return (Criteria) this;
        }
        
        public Criteria andStrEtniaEqualTo(String value) {
            addCriterion("de_etnia =", CadenaUtil.getStr(value), "de_etnia");
            return (Criteria) this;
        }
        
        public Criteria andStrEtniaNotEqualTo(String value) {
            addCriterion("de_etnia <>", CadenaUtil.getStr(value), "de_etnia");
            return (Criteria) this;
        }
        
        
        public Criteria andStrEtniaIsNull() {
            addCriterion("de_etnia is null");
            return (Criteria) this;
        }
        
        public Criteria andStrEtniaIsNotNull() {
            addCriterion("de_etnia is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrEtniaGreaterThan(String value) {
            addCriterion("de_etnia >", value, "de_etnia");
            return (Criteria) this;
        }
        
        public Criteria andStrEtniaGreaterThanOrEqualTo(String value) {
            addCriterion("de_etnia >=", value, "de_etnia");
            return (Criteria) this;
        }
        
        public Criteria andStrEtniaLessThan(String value) {
            addCriterion("de_etnia <", value, "de_etnia");
            return (Criteria) this;
        }
        
        public Criteria andStrEtniaLessThanOrEqualTo(String value) {
            addCriterion("de_etnia <=", value, "de_etnia");
            return (Criteria) this;
        }
        
        public Criteria andStrEtniaIn(List<String> values) {
            addCriterion("de_etnia in", values, "de_etnia");
            return (Criteria) this;
        }
        
        public Criteria andStrEtniaNotIn(List<String> values) {
            addCriterion("de_etnia not in", values, "de_etnia");
            return (Criteria) this;
        }
        
        public Criteria andStrEtniaBetween(String value1, String value2) {
            addCriterion("de_etnia between", value1, value2, "de_etnia");
            return (Criteria) this;
        }
        
        public Criteria andStrEtniaNotBetween(String value1, String value2) {
            addCriterion("de_etnia not between", value1, value2, "de_etnia");
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
        
        
        public Criteria andStrAreaLegalLike(String value) {
            addCriterion("upper(de_area_legal) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_area_legal");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaLegalNotLike(String value) {
            addCriterion("de_area_legal not like", "%" + CadenaUtil.getStr(value) + "%", "de_area_legal");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaLegalEqualTo(String value) {
            addCriterion("de_area_legal =", CadenaUtil.getStr(value), "de_area_legal");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaLegalNotEqualTo(String value) {
            addCriterion("de_area_legal <>", CadenaUtil.getStr(value), "de_area_legal");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAreaLegalIsNull() {
            addCriterion("de_area_legal is null");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaLegalIsNotNull() {
            addCriterion("de_area_legal is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaLegalGreaterThan(String value) {
            addCriterion("de_area_legal >", value, "de_area_legal");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaLegalGreaterThanOrEqualTo(String value) {
            addCriterion("de_area_legal >=", value, "de_area_legal");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaLegalLessThan(String value) {
            addCriterion("de_area_legal <", value, "de_area_legal");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaLegalLessThanOrEqualTo(String value) {
            addCriterion("de_area_legal <=", value, "de_area_legal");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaLegalIn(List<String> values) {
            addCriterion("de_area_legal in", values, "de_area_legal");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaLegalNotIn(List<String> values) {
            addCriterion("de_area_legal not in", values, "de_area_legal");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaLegalBetween(String value1, String value2) {
            addCriterion("de_area_legal between", value1, value2, "de_area_legal");
            return (Criteria) this;
        }
        
        public Criteria andStrAreaLegalNotBetween(String value1, String value2) {
            addCriterion("de_area_legal not between", value1, value2, "de_area_legal");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeStarEqualTo(Double value) {
            addCriterion("ha_shape_star =", value, "ha_shape_star");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStarNotEqualTo(Double value) {
            addCriterion("ha_shape_star <>", value, "ha_shape_star");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeStarIsNull() {
            addCriterion("ha_shape_star is null");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStarIsNotNull() {
            addCriterion("ha_shape_star is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStarGreaterThan(Double value) {
            addCriterion("ha_shape_star >", value, "ha_shape_star");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStarGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_shape_star >=", value, "ha_shape_star");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStarLessThan(Double value) {
            addCriterion("ha_shape_star <", value, "ha_shape_star");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStarLessThanOrEqualTo(Double value) {
            addCriterion("ha_shape_star <=", value, "ha_shape_star");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStarIn(List<Double> values) {
            addCriterion("ha_shape_star in", values, "ha_shape_star");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStarNotIn(List<Double> values) {
            addCriterion("ha_shape_star not in", values, "ha_shape_star");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStarBetween(Double value1, Double value2) {
            addCriterion("ha_shape_star between", value1, value2, "ha_shape_star");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStarNotBetween(Double value1, Double value2) {
            addCriterion("ha_shape_star not between", value1, value2, "ha_shape_star");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeStleEqualTo(Double value) {
            addCriterion("ha_shape_stle =", value, "ha_shape_stle");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStleNotEqualTo(Double value) {
            addCriterion("ha_shape_stle <>", value, "ha_shape_stle");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeStleIsNull() {
            addCriterion("ha_shape_stle is null");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStleIsNotNull() {
            addCriterion("ha_shape_stle is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStleGreaterThan(Double value) {
            addCriterion("ha_shape_stle >", value, "ha_shape_stle");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStleGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_shape_stle >=", value, "ha_shape_stle");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStleLessThan(Double value) {
            addCriterion("ha_shape_stle <", value, "ha_shape_stle");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStleLessThanOrEqualTo(Double value) {
            addCriterion("ha_shape_stle <=", value, "ha_shape_stle");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStleIn(List<Double> values) {
            addCriterion("ha_shape_stle in", values, "ha_shape_stle");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStleNotIn(List<Double> values) {
            addCriterion("ha_shape_stle not in", values, "ha_shape_stle");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStleBetween(Double value1, Double value2) {
            addCriterion("ha_shape_stle between", value1, value2, "ha_shape_stle");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeStleNotBetween(Double value1, Double value2) {
            addCriterion("ha_shape_stle not between", value1, value2, "ha_shape_stle");
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
