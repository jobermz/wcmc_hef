package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class TemSoeconComunidadesCampesinasParamDef {
		
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected String strHashConsulta;
	
    public TemSoeconComunidadesCampesinasParamDef() {
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
        
        
        public Criteria andStrEstadoLike(String value) {
            addCriterion("upper(de_estado) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_estado");
            return (Criteria) this;
        }
        
        public Criteria andStrEstadoNotLike(String value) {
            addCriterion("de_estado not like", "%" + CadenaUtil.getStr(value) + "%", "de_estado");
            return (Criteria) this;
        }
        
        public Criteria andStrEstadoEqualTo(String value) {
            addCriterion("de_estado =", CadenaUtil.getStr(value), "de_estado");
            return (Criteria) this;
        }
        
        public Criteria andStrEstadoNotEqualTo(String value) {
            addCriterion("de_estado <>", CadenaUtil.getStr(value), "de_estado");
            return (Criteria) this;
        }
        
        
        public Criteria andStrEstadoIsNull() {
            addCriterion("de_estado is null");
            return (Criteria) this;
        }
        
        public Criteria andStrEstadoIsNotNull() {
            addCriterion("de_estado is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrEstadoGreaterThan(String value) {
            addCriterion("de_estado >", value, "de_estado");
            return (Criteria) this;
        }
        
        public Criteria andStrEstadoGreaterThanOrEqualTo(String value) {
            addCriterion("de_estado >=", value, "de_estado");
            return (Criteria) this;
        }
        
        public Criteria andStrEstadoLessThan(String value) {
            addCriterion("de_estado <", value, "de_estado");
            return (Criteria) this;
        }
        
        public Criteria andStrEstadoLessThanOrEqualTo(String value) {
            addCriterion("de_estado <=", value, "de_estado");
            return (Criteria) this;
        }
        
        public Criteria andStrEstadoIn(List<String> values) {
            addCriterion("de_estado in", values, "de_estado");
            return (Criteria) this;
        }
        
        public Criteria andStrEstadoNotIn(List<String> values) {
            addCriterion("de_estado not in", values, "de_estado");
            return (Criteria) this;
        }
        
        public Criteria andStrEstadoBetween(String value1, String value2) {
            addCriterion("de_estado between", value1, value2, "de_estado");
            return (Criteria) this;
        }
        
        public Criteria andStrEstadoNotBetween(String value1, String value2) {
            addCriterion("de_estado not between", value1, value2, "de_estado");
            return (Criteria) this;
        }
        
        
        public Criteria andStrResolucionLike(String value) {
            addCriterion("upper(de_resolucion) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_resolucion");
            return (Criteria) this;
        }
        
        public Criteria andStrResolucionNotLike(String value) {
            addCriterion("de_resolucion not like", "%" + CadenaUtil.getStr(value) + "%", "de_resolucion");
            return (Criteria) this;
        }
        
        public Criteria andStrResolucionEqualTo(String value) {
            addCriterion("de_resolucion =", CadenaUtil.getStr(value), "de_resolucion");
            return (Criteria) this;
        }
        
        public Criteria andStrResolucionNotEqualTo(String value) {
            addCriterion("de_resolucion <>", CadenaUtil.getStr(value), "de_resolucion");
            return (Criteria) this;
        }
        
        
        public Criteria andStrResolucionIsNull() {
            addCriterion("de_resolucion is null");
            return (Criteria) this;
        }
        
        public Criteria andStrResolucionIsNotNull() {
            addCriterion("de_resolucion is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrResolucionGreaterThan(String value) {
            addCriterion("de_resolucion >", value, "de_resolucion");
            return (Criteria) this;
        }
        
        public Criteria andStrResolucionGreaterThanOrEqualTo(String value) {
            addCriterion("de_resolucion >=", value, "de_resolucion");
            return (Criteria) this;
        }
        
        public Criteria andStrResolucionLessThan(String value) {
            addCriterion("de_resolucion <", value, "de_resolucion");
            return (Criteria) this;
        }
        
        public Criteria andStrResolucionLessThanOrEqualTo(String value) {
            addCriterion("de_resolucion <=", value, "de_resolucion");
            return (Criteria) this;
        }
        
        public Criteria andStrResolucionIn(List<String> values) {
            addCriterion("de_resolucion in", values, "de_resolucion");
            return (Criteria) this;
        }
        
        public Criteria andStrResolucionNotIn(List<String> values) {
            addCriterion("de_resolucion not in", values, "de_resolucion");
            return (Criteria) this;
        }
        
        public Criteria andStrResolucionBetween(String value1, String value2) {
            addCriterion("de_resolucion between", value1, value2, "de_resolucion");
            return (Criteria) this;
        }
        
        public Criteria andStrResolucionNotBetween(String value1, String value2) {
            addCriterion("de_resolucion not between", value1, value2, "de_resolucion");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaHaEqualTo(Double value) {
            addCriterion("ha_area_ha =", value, "ha_area_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaHaNotEqualTo(Double value) {
            addCriterion("ha_area_ha <>", value, "ha_area_ha");
            return (Criteria) this;
        }
        
        
        public Criteria andDblAreaHaIsNull() {
            addCriterion("ha_area_ha is null");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaHaIsNotNull() {
            addCriterion("ha_area_ha is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaHaGreaterThan(Double value) {
            addCriterion("ha_area_ha >", value, "ha_area_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaHaGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_area_ha >=", value, "ha_area_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaHaLessThan(Double value) {
            addCriterion("ha_area_ha <", value, "ha_area_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaHaLessThanOrEqualTo(Double value) {
            addCriterion("ha_area_ha <=", value, "ha_area_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaHaIn(List<Double> values) {
            addCriterion("ha_area_ha in", values, "ha_area_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaHaNotIn(List<Double> values) {
            addCriterion("ha_area_ha not in", values, "ha_area_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaHaBetween(Double value1, Double value2) {
            addCriterion("ha_area_ha between", value1, value2, "ha_area_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblAreaHaNotBetween(Double value1, Double value2) {
            addCriterion("ha_area_ha not between", value1, value2, "ha_area_ha");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomdptoLike(String value) {
            addCriterion("upper(de_nomdpto) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_nomdpto");
            return (Criteria) this;
        }
        
        public Criteria andStrNomdptoNotLike(String value) {
            addCriterion("de_nomdpto not like", "%" + CadenaUtil.getStr(value) + "%", "de_nomdpto");
            return (Criteria) this;
        }
        
        public Criteria andStrNomdptoEqualTo(String value) {
            addCriterion("de_nomdpto =", CadenaUtil.getStr(value), "de_nomdpto");
            return (Criteria) this;
        }
        
        public Criteria andStrNomdptoNotEqualTo(String value) {
            addCriterion("de_nomdpto <>", CadenaUtil.getStr(value), "de_nomdpto");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomdptoIsNull() {
            addCriterion("de_nomdpto is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomdptoIsNotNull() {
            addCriterion("de_nomdpto is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomdptoGreaterThan(String value) {
            addCriterion("de_nomdpto >", value, "de_nomdpto");
            return (Criteria) this;
        }
        
        public Criteria andStrNomdptoGreaterThanOrEqualTo(String value) {
            addCriterion("de_nomdpto >=", value, "de_nomdpto");
            return (Criteria) this;
        }
        
        public Criteria andStrNomdptoLessThan(String value) {
            addCriterion("de_nomdpto <", value, "de_nomdpto");
            return (Criteria) this;
        }
        
        public Criteria andStrNomdptoLessThanOrEqualTo(String value) {
            addCriterion("de_nomdpto <=", value, "de_nomdpto");
            return (Criteria) this;
        }
        
        public Criteria andStrNomdptoIn(List<String> values) {
            addCriterion("de_nomdpto in", values, "de_nomdpto");
            return (Criteria) this;
        }
        
        public Criteria andStrNomdptoNotIn(List<String> values) {
            addCriterion("de_nomdpto not in", values, "de_nomdpto");
            return (Criteria) this;
        }
        
        public Criteria andStrNomdptoBetween(String value1, String value2) {
            addCriterion("de_nomdpto between", value1, value2, "de_nomdpto");
            return (Criteria) this;
        }
        
        public Criteria andStrNomdptoNotBetween(String value1, String value2) {
            addCriterion("de_nomdpto not between", value1, value2, "de_nomdpto");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomprovLike(String value) {
            addCriterion("upper(de_nomprov) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_nomprov");
            return (Criteria) this;
        }
        
        public Criteria andStrNomprovNotLike(String value) {
            addCriterion("de_nomprov not like", "%" + CadenaUtil.getStr(value) + "%", "de_nomprov");
            return (Criteria) this;
        }
        
        public Criteria andStrNomprovEqualTo(String value) {
            addCriterion("de_nomprov =", CadenaUtil.getStr(value), "de_nomprov");
            return (Criteria) this;
        }
        
        public Criteria andStrNomprovNotEqualTo(String value) {
            addCriterion("de_nomprov <>", CadenaUtil.getStr(value), "de_nomprov");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNomprovIsNull() {
            addCriterion("de_nomprov is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomprovIsNotNull() {
            addCriterion("de_nomprov is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNomprovGreaterThan(String value) {
            addCriterion("de_nomprov >", value, "de_nomprov");
            return (Criteria) this;
        }
        
        public Criteria andStrNomprovGreaterThanOrEqualTo(String value) {
            addCriterion("de_nomprov >=", value, "de_nomprov");
            return (Criteria) this;
        }
        
        public Criteria andStrNomprovLessThan(String value) {
            addCriterion("de_nomprov <", value, "de_nomprov");
            return (Criteria) this;
        }
        
        public Criteria andStrNomprovLessThanOrEqualTo(String value) {
            addCriterion("de_nomprov <=", value, "de_nomprov");
            return (Criteria) this;
        }
        
        public Criteria andStrNomprovIn(List<String> values) {
            addCriterion("de_nomprov in", values, "de_nomprov");
            return (Criteria) this;
        }
        
        public Criteria andStrNomprovNotIn(List<String> values) {
            addCriterion("de_nomprov not in", values, "de_nomprov");
            return (Criteria) this;
        }
        
        public Criteria andStrNomprovBetween(String value1, String value2) {
            addCriterion("de_nomprov between", value1, value2, "de_nomprov");
            return (Criteria) this;
        }
        
        public Criteria andStrNomprovNotBetween(String value1, String value2) {
            addCriterion("de_nomprov not between", value1, value2, "de_nomprov");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDistritoLike(String value) {
            addCriterion("upper(de_distrito) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_distrito");
            return (Criteria) this;
        }
        
        public Criteria andStrDistritoNotLike(String value) {
            addCriterion("de_distrito not like", "%" + CadenaUtil.getStr(value) + "%", "de_distrito");
            return (Criteria) this;
        }
        
        public Criteria andStrDistritoEqualTo(String value) {
            addCriterion("de_distrito =", CadenaUtil.getStr(value), "de_distrito");
            return (Criteria) this;
        }
        
        public Criteria andStrDistritoNotEqualTo(String value) {
            addCriterion("de_distrito <>", CadenaUtil.getStr(value), "de_distrito");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDistritoIsNull() {
            addCriterion("de_distrito is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDistritoIsNotNull() {
            addCriterion("de_distrito is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDistritoGreaterThan(String value) {
            addCriterion("de_distrito >", value, "de_distrito");
            return (Criteria) this;
        }
        
        public Criteria andStrDistritoGreaterThanOrEqualTo(String value) {
            addCriterion("de_distrito >=", value, "de_distrito");
            return (Criteria) this;
        }
        
        public Criteria andStrDistritoLessThan(String value) {
            addCriterion("de_distrito <", value, "de_distrito");
            return (Criteria) this;
        }
        
        public Criteria andStrDistritoLessThanOrEqualTo(String value) {
            addCriterion("de_distrito <=", value, "de_distrito");
            return (Criteria) this;
        }
        
        public Criteria andStrDistritoIn(List<String> values) {
            addCriterion("de_distrito in", values, "de_distrito");
            return (Criteria) this;
        }
        
        public Criteria andStrDistritoNotIn(List<String> values) {
            addCriterion("de_distrito not in", values, "de_distrito");
            return (Criteria) this;
        }
        
        public Criteria andStrDistritoBetween(String value1, String value2) {
            addCriterion("de_distrito between", value1, value2, "de_distrito");
            return (Criteria) this;
        }
        
        public Criteria andStrDistritoNotBetween(String value1, String value2) {
            addCriterion("de_distrito not between", value1, value2, "de_distrito");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFechaResoLike(String value) {
            addCriterion("upper(de_fecha_reso) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaResoNotLike(String value) {
            addCriterion("de_fecha_reso not like", "%" + CadenaUtil.getStr(value) + "%", "de_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaResoEqualTo(String value) {
            addCriterion("de_fecha_reso =", CadenaUtil.getStr(value), "de_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaResoNotEqualTo(String value) {
            addCriterion("de_fecha_reso <>", CadenaUtil.getStr(value), "de_fecha_reso");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFechaResoIsNull() {
            addCriterion("de_fecha_reso is null");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaResoIsNotNull() {
            addCriterion("de_fecha_reso is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaResoGreaterThan(String value) {
            addCriterion("de_fecha_reso >", value, "de_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaResoGreaterThanOrEqualTo(String value) {
            addCriterion("de_fecha_reso >=", value, "de_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaResoLessThan(String value) {
            addCriterion("de_fecha_reso <", value, "de_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaResoLessThanOrEqualTo(String value) {
            addCriterion("de_fecha_reso <=", value, "de_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaResoIn(List<String> values) {
            addCriterion("de_fecha_reso in", values, "de_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaResoNotIn(List<String> values) {
            addCriterion("de_fecha_reso not in", values, "de_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaResoBetween(String value1, String value2) {
            addCriterion("de_fecha_reso between", value1, value2, "de_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaResoNotBetween(String value1, String value2) {
            addCriterion("de_fecha_reso not between", value1, value2, "de_fecha_reso");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNTituloLike(String value) {
            addCriterion("upper(de_n_titulo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_n_titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrNTituloNotLike(String value) {
            addCriterion("de_n_titulo not like", "%" + CadenaUtil.getStr(value) + "%", "de_n_titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrNTituloEqualTo(String value) {
            addCriterion("de_n_titulo =", CadenaUtil.getStr(value), "de_n_titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrNTituloNotEqualTo(String value) {
            addCriterion("de_n_titulo <>", CadenaUtil.getStr(value), "de_n_titulo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNTituloIsNull() {
            addCriterion("de_n_titulo is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNTituloIsNotNull() {
            addCriterion("de_n_titulo is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNTituloGreaterThan(String value) {
            addCriterion("de_n_titulo >", value, "de_n_titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrNTituloGreaterThanOrEqualTo(String value) {
            addCriterion("de_n_titulo >=", value, "de_n_titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrNTituloLessThan(String value) {
            addCriterion("de_n_titulo <", value, "de_n_titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrNTituloLessThanOrEqualTo(String value) {
            addCriterion("de_n_titulo <=", value, "de_n_titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrNTituloIn(List<String> values) {
            addCriterion("de_n_titulo in", values, "de_n_titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrNTituloNotIn(List<String> values) {
            addCriterion("de_n_titulo not in", values, "de_n_titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrNTituloBetween(String value1, String value2) {
            addCriterion("de_n_titulo between", value1, value2, "de_n_titulo");
            return (Criteria) this;
        }
        
        public Criteria andStrNTituloNotBetween(String value1, String value2) {
            addCriterion("de_n_titulo not between", value1, value2, "de_n_titulo");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeLengEqualTo(Double value) {
            addCriterion("ha_shape_leng =", value, "ha_shape_leng");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengNotEqualTo(Double value) {
            addCriterion("ha_shape_leng <>", value, "ha_shape_leng");
            return (Criteria) this;
        }
        
        
        public Criteria andDblShapeLengIsNull() {
            addCriterion("ha_shape_leng is null");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengIsNotNull() {
            addCriterion("ha_shape_leng is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengGreaterThan(Double value) {
            addCriterion("ha_shape_leng >", value, "ha_shape_leng");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_shape_leng >=", value, "ha_shape_leng");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengLessThan(Double value) {
            addCriterion("ha_shape_leng <", value, "ha_shape_leng");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengLessThanOrEqualTo(Double value) {
            addCriterion("ha_shape_leng <=", value, "ha_shape_leng");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengIn(List<Double> values) {
            addCriterion("ha_shape_leng in", values, "ha_shape_leng");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengNotIn(List<Double> values) {
            addCriterion("ha_shape_leng not in", values, "ha_shape_leng");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengBetween(Double value1, Double value2) {
            addCriterion("ha_shape_leng between", value1, value2, "ha_shape_leng");
            return (Criteria) this;
        }
        
        public Criteria andDblShapeLengNotBetween(Double value1, Double value2) {
            addCriterion("ha_shape_leng not between", value1, value2, "ha_shape_leng");
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
