package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class TemProyectosPuntosParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected String strHashConsulta;
	
    public TemProyectosPuntosParamDef() {
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
        
        
        public Criteria andStrIniciativaLike(String value) {
            addCriterion("upper(de_iniciativa) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_iniciativa");
            return (Criteria) this;
        }
        
        public Criteria andStrIniciativaNotLike(String value) {
            addCriterion("de_iniciativa not like", "%" + CadenaUtil.getStr(value) + "%", "de_iniciativa");
            return (Criteria) this;
        }
        
        public Criteria andStrIniciativaEqualTo(String value) {
            addCriterion("de_iniciativa =", CadenaUtil.getStr(value), "de_iniciativa");
            return (Criteria) this;
        }
        
        public Criteria andStrIniciativaNotEqualTo(String value) {
            addCriterion("de_iniciativa <>", CadenaUtil.getStr(value), "de_iniciativa");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIniciativaIsNull() {
            addCriterion("de_iniciativa is null");
            return (Criteria) this;
        }
        
        public Criteria andStrIniciativaIsNotNull() {
            addCriterion("de_iniciativa is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrIniciativaGreaterThan(String value) {
            addCriterion("de_iniciativa >", value, "de_iniciativa");
            return (Criteria) this;
        }
        
        public Criteria andStrIniciativaGreaterThanOrEqualTo(String value) {
            addCriterion("de_iniciativa >=", value, "de_iniciativa");
            return (Criteria) this;
        }
        
        public Criteria andStrIniciativaLessThan(String value) {
            addCriterion("de_iniciativa <", value, "de_iniciativa");
            return (Criteria) this;
        }
        
        public Criteria andStrIniciativaLessThanOrEqualTo(String value) {
            addCriterion("de_iniciativa <=", value, "de_iniciativa");
            return (Criteria) this;
        }
        
        public Criteria andStrIniciativaIn(List<String> values) {
            addCriterion("de_iniciativa in", values, "de_iniciativa");
            return (Criteria) this;
        }
        
        public Criteria andStrIniciativaNotIn(List<String> values) {
            addCriterion("de_iniciativa not in", values, "de_iniciativa");
            return (Criteria) this;
        }
        
        public Criteria andStrIniciativaBetween(String value1, String value2) {
            addCriterion("de_iniciativa between", value1, value2, "de_iniciativa");
            return (Criteria) this;
        }
        
        public Criteria andStrIniciativaNotBetween(String value1, String value2) {
            addCriterion("de_iniciativa not between", value1, value2, "de_iniciativa");
            return (Criteria) this;
        }
        
        
        public Criteria andStrReferenciaLike(String value) {
            addCriterion("upper(de_referencia) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_referencia");
            return (Criteria) this;
        }
        
        public Criteria andStrReferenciaNotLike(String value) {
            addCriterion("de_referencia not like", "%" + CadenaUtil.getStr(value) + "%", "de_referencia");
            return (Criteria) this;
        }
        
        public Criteria andStrReferenciaEqualTo(String value) {
            addCriterion("de_referencia =", CadenaUtil.getStr(value), "de_referencia");
            return (Criteria) this;
        }
        
        public Criteria andStrReferenciaNotEqualTo(String value) {
            addCriterion("de_referencia <>", CadenaUtil.getStr(value), "de_referencia");
            return (Criteria) this;
        }
        
        
        public Criteria andStrReferenciaIsNull() {
            addCriterion("de_referencia is null");
            return (Criteria) this;
        }
        
        public Criteria andStrReferenciaIsNotNull() {
            addCriterion("de_referencia is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrReferenciaGreaterThan(String value) {
            addCriterion("de_referencia >", value, "de_referencia");
            return (Criteria) this;
        }
        
        public Criteria andStrReferenciaGreaterThanOrEqualTo(String value) {
            addCriterion("de_referencia >=", value, "de_referencia");
            return (Criteria) this;
        }
        
        public Criteria andStrReferenciaLessThan(String value) {
            addCriterion("de_referencia <", value, "de_referencia");
            return (Criteria) this;
        }
        
        public Criteria andStrReferenciaLessThanOrEqualTo(String value) {
            addCriterion("de_referencia <=", value, "de_referencia");
            return (Criteria) this;
        }
        
        public Criteria andStrReferenciaIn(List<String> values) {
            addCriterion("de_referencia in", values, "de_referencia");
            return (Criteria) this;
        }
        
        public Criteria andStrReferenciaNotIn(List<String> values) {
            addCriterion("de_referencia not in", values, "de_referencia");
            return (Criteria) this;
        }
        
        public Criteria andStrReferenciaBetween(String value1, String value2) {
            addCriterion("de_referencia between", value1, value2, "de_referencia");
            return (Criteria) this;
        }
        
        public Criteria andStrReferenciaNotBetween(String value1, String value2) {
            addCriterion("de_referencia not between", value1, value2, "de_referencia");
            return (Criteria) this;
        }
        
        
        public Criteria andStrRegionGeoLike(String value) {
            addCriterion("upper(de_region_geo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_region_geo");
            return (Criteria) this;
        }
        
        public Criteria andStrRegionGeoNotLike(String value) {
            addCriterion("de_region_geo not like", "%" + CadenaUtil.getStr(value) + "%", "de_region_geo");
            return (Criteria) this;
        }
        
        public Criteria andStrRegionGeoEqualTo(String value) {
            addCriterion("de_region_geo =", CadenaUtil.getStr(value), "de_region_geo");
            return (Criteria) this;
        }
        
        public Criteria andStrRegionGeoNotEqualTo(String value) {
            addCriterion("de_region_geo <>", CadenaUtil.getStr(value), "de_region_geo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrRegionGeoIsNull() {
            addCriterion("de_region_geo is null");
            return (Criteria) this;
        }
        
        public Criteria andStrRegionGeoIsNotNull() {
            addCriterion("de_region_geo is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrRegionGeoGreaterThan(String value) {
            addCriterion("de_region_geo >", value, "de_region_geo");
            return (Criteria) this;
        }
        
        public Criteria andStrRegionGeoGreaterThanOrEqualTo(String value) {
            addCriterion("de_region_geo >=", value, "de_region_geo");
            return (Criteria) this;
        }
        
        public Criteria andStrRegionGeoLessThan(String value) {
            addCriterion("de_region_geo <", value, "de_region_geo");
            return (Criteria) this;
        }
        
        public Criteria andStrRegionGeoLessThanOrEqualTo(String value) {
            addCriterion("de_region_geo <=", value, "de_region_geo");
            return (Criteria) this;
        }
        
        public Criteria andStrRegionGeoIn(List<String> values) {
            addCriterion("de_region_geo in", values, "de_region_geo");
            return (Criteria) this;
        }
        
        public Criteria andStrRegionGeoNotIn(List<String> values) {
            addCriterion("de_region_geo not in", values, "de_region_geo");
            return (Criteria) this;
        }
        
        public Criteria andStrRegionGeoBetween(String value1, String value2) {
            addCriterion("de_region_geo between", value1, value2, "de_region_geo");
            return (Criteria) this;
        }
        
        public Criteria andStrRegionGeoNotBetween(String value1, String value2) {
            addCriterion("de_region_geo not between", value1, value2, "de_region_geo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDetalleDeLike(String value) {
            addCriterion("upper(de_detalle_de) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_detalle_de");
            return (Criteria) this;
        }
        
        public Criteria andStrDetalleDeNotLike(String value) {
            addCriterion("de_detalle_de not like", "%" + CadenaUtil.getStr(value) + "%", "de_detalle_de");
            return (Criteria) this;
        }
        
        public Criteria andStrDetalleDeEqualTo(String value) {
            addCriterion("de_detalle_de =", CadenaUtil.getStr(value), "de_detalle_de");
            return (Criteria) this;
        }
        
        public Criteria andStrDetalleDeNotEqualTo(String value) {
            addCriterion("de_detalle_de <>", CadenaUtil.getStr(value), "de_detalle_de");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDetalleDeIsNull() {
            addCriterion("de_detalle_de is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDetalleDeIsNotNull() {
            addCriterion("de_detalle_de is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDetalleDeGreaterThan(String value) {
            addCriterion("de_detalle_de >", value, "de_detalle_de");
            return (Criteria) this;
        }
        
        public Criteria andStrDetalleDeGreaterThanOrEqualTo(String value) {
            addCriterion("de_detalle_de >=", value, "de_detalle_de");
            return (Criteria) this;
        }
        
        public Criteria andStrDetalleDeLessThan(String value) {
            addCriterion("de_detalle_de <", value, "de_detalle_de");
            return (Criteria) this;
        }
        
        public Criteria andStrDetalleDeLessThanOrEqualTo(String value) {
            addCriterion("de_detalle_de <=", value, "de_detalle_de");
            return (Criteria) this;
        }
        
        public Criteria andStrDetalleDeIn(List<String> values) {
            addCriterion("de_detalle_de in", values, "de_detalle_de");
            return (Criteria) this;
        }
        
        public Criteria andStrDetalleDeNotIn(List<String> values) {
            addCriterion("de_detalle_de not in", values, "de_detalle_de");
            return (Criteria) this;
        }
        
        public Criteria andStrDetalleDeBetween(String value1, String value2) {
            addCriterion("de_detalle_de between", value1, value2, "de_detalle_de");
            return (Criteria) this;
        }
        
        public Criteria andStrDetalleDeNotBetween(String value1, String value2) {
            addCriterion("de_detalle_de not between", value1, value2, "de_detalle_de");
            return (Criteria) this;
        }
        
        
        public Criteria andStrOtrosLike(String value) {
            addCriterion("upper(de_otros) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_otros");
            return (Criteria) this;
        }
        
        public Criteria andStrOtrosNotLike(String value) {
            addCriterion("de_otros not like", "%" + CadenaUtil.getStr(value) + "%", "de_otros");
            return (Criteria) this;
        }
        
        public Criteria andStrOtrosEqualTo(String value) {
            addCriterion("de_otros =", CadenaUtil.getStr(value), "de_otros");
            return (Criteria) this;
        }
        
        public Criteria andStrOtrosNotEqualTo(String value) {
            addCriterion("de_otros <>", CadenaUtil.getStr(value), "de_otros");
            return (Criteria) this;
        }
        
        
        public Criteria andStrOtrosIsNull() {
            addCriterion("de_otros is null");
            return (Criteria) this;
        }
        
        public Criteria andStrOtrosIsNotNull() {
            addCriterion("de_otros is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrOtrosGreaterThan(String value) {
            addCriterion("de_otros >", value, "de_otros");
            return (Criteria) this;
        }
        
        public Criteria andStrOtrosGreaterThanOrEqualTo(String value) {
            addCriterion("de_otros >=", value, "de_otros");
            return (Criteria) this;
        }
        
        public Criteria andStrOtrosLessThan(String value) {
            addCriterion("de_otros <", value, "de_otros");
            return (Criteria) this;
        }
        
        public Criteria andStrOtrosLessThanOrEqualTo(String value) {
            addCriterion("de_otros <=", value, "de_otros");
            return (Criteria) this;
        }
        
        public Criteria andStrOtrosIn(List<String> values) {
            addCriterion("de_otros in", values, "de_otros");
            return (Criteria) this;
        }
        
        public Criteria andStrOtrosNotIn(List<String> values) {
            addCriterion("de_otros not in", values, "de_otros");
            return (Criteria) this;
        }
        
        public Criteria andStrOtrosBetween(String value1, String value2) {
            addCriterion("de_otros between", value1, value2, "de_otros");
            return (Criteria) this;
        }
        
        public Criteria andStrOtrosNotBetween(String value1, String value2) {
            addCriterion("de_otros not between", value1, value2, "de_otros");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFechaInicLike(String value) {
            addCriterion("upper(de_fecha_inic) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_fecha_inic");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaInicNotLike(String value) {
            addCriterion("de_fecha_inic not like", "%" + CadenaUtil.getStr(value) + "%", "de_fecha_inic");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaInicEqualTo(String value) {
            addCriterion("de_fecha_inic =", CadenaUtil.getStr(value), "de_fecha_inic");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaInicNotEqualTo(String value) {
            addCriterion("de_fecha_inic <>", CadenaUtil.getStr(value), "de_fecha_inic");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFechaInicIsNull() {
            addCriterion("de_fecha_inic is null");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaInicIsNotNull() {
            addCriterion("de_fecha_inic is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaInicGreaterThan(String value) {
            addCriterion("de_fecha_inic >", value, "de_fecha_inic");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaInicGreaterThanOrEqualTo(String value) {
            addCriterion("de_fecha_inic >=", value, "de_fecha_inic");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaInicLessThan(String value) {
            addCriterion("de_fecha_inic <", value, "de_fecha_inic");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaInicLessThanOrEqualTo(String value) {
            addCriterion("de_fecha_inic <=", value, "de_fecha_inic");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaInicIn(List<String> values) {
            addCriterion("de_fecha_inic in", values, "de_fecha_inic");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaInicNotIn(List<String> values) {
            addCriterion("de_fecha_inic not in", values, "de_fecha_inic");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaInicBetween(String value1, String value2) {
            addCriterion("de_fecha_inic between", value1, value2, "de_fecha_inic");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaInicNotBetween(String value1, String value2) {
            addCriterion("de_fecha_inic not between", value1, value2, "de_fecha_inic");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFechaTermLike(String value) {
            addCriterion("upper(de_fecha_term) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_fecha_term");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaTermNotLike(String value) {
            addCriterion("de_fecha_term not like", "%" + CadenaUtil.getStr(value) + "%", "de_fecha_term");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaTermEqualTo(String value) {
            addCriterion("de_fecha_term =", CadenaUtil.getStr(value), "de_fecha_term");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaTermNotEqualTo(String value) {
            addCriterion("de_fecha_term <>", CadenaUtil.getStr(value), "de_fecha_term");
            return (Criteria) this;
        }
        
        
        public Criteria andStrFechaTermIsNull() {
            addCriterion("de_fecha_term is null");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaTermIsNotNull() {
            addCriterion("de_fecha_term is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaTermGreaterThan(String value) {
            addCriterion("de_fecha_term >", value, "de_fecha_term");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaTermGreaterThanOrEqualTo(String value) {
            addCriterion("de_fecha_term >=", value, "de_fecha_term");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaTermLessThan(String value) {
            addCriterion("de_fecha_term <", value, "de_fecha_term");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaTermLessThanOrEqualTo(String value) {
            addCriterion("de_fecha_term <=", value, "de_fecha_term");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaTermIn(List<String> values) {
            addCriterion("de_fecha_term in", values, "de_fecha_term");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaTermNotIn(List<String> values) {
            addCriterion("de_fecha_term not in", values, "de_fecha_term");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaTermBetween(String value1, String value2) {
            addCriterion("de_fecha_term between", value1, value2, "de_fecha_term");
            return (Criteria) this;
        }
        
        public Criteria andStrFechaTermNotBetween(String value1, String value2) {
            addCriterion("de_fecha_term not between", value1, value2, "de_fecha_term");
            return (Criteria) this;
        }
        
        
        public Criteria andStrResultadosLike(String value) {
            addCriterion("upper(de_resultados) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_resultados");
            return (Criteria) this;
        }
        
        public Criteria andStrResultadosNotLike(String value) {
            addCriterion("de_resultados not like", "%" + CadenaUtil.getStr(value) + "%", "de_resultados");
            return (Criteria) this;
        }
        
        public Criteria andStrResultadosEqualTo(String value) {
            addCriterion("de_resultados =", CadenaUtil.getStr(value), "de_resultados");
            return (Criteria) this;
        }
        
        public Criteria andStrResultadosNotEqualTo(String value) {
            addCriterion("de_resultados <>", CadenaUtil.getStr(value), "de_resultados");
            return (Criteria) this;
        }
        
        
        public Criteria andStrResultadosIsNull() {
            addCriterion("de_resultados is null");
            return (Criteria) this;
        }
        
        public Criteria andStrResultadosIsNotNull() {
            addCriterion("de_resultados is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrResultadosGreaterThan(String value) {
            addCriterion("de_resultados >", value, "de_resultados");
            return (Criteria) this;
        }
        
        public Criteria andStrResultadosGreaterThanOrEqualTo(String value) {
            addCriterion("de_resultados >=", value, "de_resultados");
            return (Criteria) this;
        }
        
        public Criteria andStrResultadosLessThan(String value) {
            addCriterion("de_resultados <", value, "de_resultados");
            return (Criteria) this;
        }
        
        public Criteria andStrResultadosLessThanOrEqualTo(String value) {
            addCriterion("de_resultados <=", value, "de_resultados");
            return (Criteria) this;
        }
        
        public Criteria andStrResultadosIn(List<String> values) {
            addCriterion("de_resultados in", values, "de_resultados");
            return (Criteria) this;
        }
        
        public Criteria andStrResultadosNotIn(List<String> values) {
            addCriterion("de_resultados not in", values, "de_resultados");
            return (Criteria) this;
        }
        
        public Criteria andStrResultadosBetween(String value1, String value2) {
            addCriterion("de_resultados between", value1, value2, "de_resultados");
            return (Criteria) this;
        }
        
        public Criteria andStrResultadosNotBetween(String value1, String value2) {
            addCriterion("de_resultados not between", value1, value2, "de_resultados");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCooperanteLike(String value) {
            addCriterion("upper(de_cooperante) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_cooperante");
            return (Criteria) this;
        }
        
        public Criteria andStrCooperanteNotLike(String value) {
            addCriterion("de_cooperante not like", "%" + CadenaUtil.getStr(value) + "%", "de_cooperante");
            return (Criteria) this;
        }
        
        public Criteria andStrCooperanteEqualTo(String value) {
            addCriterion("de_cooperante =", CadenaUtil.getStr(value), "de_cooperante");
            return (Criteria) this;
        }
        
        public Criteria andStrCooperanteNotEqualTo(String value) {
            addCriterion("de_cooperante <>", CadenaUtil.getStr(value), "de_cooperante");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCooperanteIsNull() {
            addCriterion("de_cooperante is null");
            return (Criteria) this;
        }
        
        public Criteria andStrCooperanteIsNotNull() {
            addCriterion("de_cooperante is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrCooperanteGreaterThan(String value) {
            addCriterion("de_cooperante >", value, "de_cooperante");
            return (Criteria) this;
        }
        
        public Criteria andStrCooperanteGreaterThanOrEqualTo(String value) {
            addCriterion("de_cooperante >=", value, "de_cooperante");
            return (Criteria) this;
        }
        
        public Criteria andStrCooperanteLessThan(String value) {
            addCriterion("de_cooperante <", value, "de_cooperante");
            return (Criteria) this;
        }
        
        public Criteria andStrCooperanteLessThanOrEqualTo(String value) {
            addCriterion("de_cooperante <=", value, "de_cooperante");
            return (Criteria) this;
        }
        
        public Criteria andStrCooperanteIn(List<String> values) {
            addCriterion("de_cooperante in", values, "de_cooperante");
            return (Criteria) this;
        }
        
        public Criteria andStrCooperanteNotIn(List<String> values) {
            addCriterion("de_cooperante not in", values, "de_cooperante");
            return (Criteria) this;
        }
        
        public Criteria andStrCooperanteBetween(String value1, String value2) {
            addCriterion("de_cooperante between", value1, value2, "de_cooperante");
            return (Criteria) this;
        }
        
        public Criteria andStrCooperanteNotBetween(String value1, String value2) {
            addCriterion("de_cooperante not between", value1, value2, "de_cooperante");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAdministraLike(String value) {
            addCriterion("upper(de_administra) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_administra");
            return (Criteria) this;
        }
        
        public Criteria andStrAdministraNotLike(String value) {
            addCriterion("de_administra not like", "%" + CadenaUtil.getStr(value) + "%", "de_administra");
            return (Criteria) this;
        }
        
        public Criteria andStrAdministraEqualTo(String value) {
            addCriterion("de_administra =", CadenaUtil.getStr(value), "de_administra");
            return (Criteria) this;
        }
        
        public Criteria andStrAdministraNotEqualTo(String value) {
            addCriterion("de_administra <>", CadenaUtil.getStr(value), "de_administra");
            return (Criteria) this;
        }
        
        
        public Criteria andStrAdministraIsNull() {
            addCriterion("de_administra is null");
            return (Criteria) this;
        }
        
        public Criteria andStrAdministraIsNotNull() {
            addCriterion("de_administra is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrAdministraGreaterThan(String value) {
            addCriterion("de_administra >", value, "de_administra");
            return (Criteria) this;
        }
        
        public Criteria andStrAdministraGreaterThanOrEqualTo(String value) {
            addCriterion("de_administra >=", value, "de_administra");
            return (Criteria) this;
        }
        
        public Criteria andStrAdministraLessThan(String value) {
            addCriterion("de_administra <", value, "de_administra");
            return (Criteria) this;
        }
        
        public Criteria andStrAdministraLessThanOrEqualTo(String value) {
            addCriterion("de_administra <=", value, "de_administra");
            return (Criteria) this;
        }
        
        public Criteria andStrAdministraIn(List<String> values) {
            addCriterion("de_administra in", values, "de_administra");
            return (Criteria) this;
        }
        
        public Criteria andStrAdministraNotIn(List<String> values) {
            addCriterion("de_administra not in", values, "de_administra");
            return (Criteria) this;
        }
        
        public Criteria andStrAdministraBetween(String value1, String value2) {
            addCriterion("de_administra between", value1, value2, "de_administra");
            return (Criteria) this;
        }
        
        public Criteria andStrAdministraNotBetween(String value1, String value2) {
            addCriterion("de_administra not between", value1, value2, "de_administra");
            return (Criteria) this;
        }
        
        
        public Criteria andDblUsdEqualTo(Double value) {
            addCriterion("ha_usd =", value, "ha_usd");
            return (Criteria) this;
        }
        
        public Criteria andDblUsdNotEqualTo(Double value) {
            addCriterion("ha_usd <>", value, "ha_usd");
            return (Criteria) this;
        }
        
        
        public Criteria andDblUsdIsNull() {
            addCriterion("ha_usd is null");
            return (Criteria) this;
        }
        
        public Criteria andDblUsdIsNotNull() {
            addCriterion("ha_usd is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblUsdGreaterThan(Double value) {
            addCriterion("ha_usd >", value, "ha_usd");
            return (Criteria) this;
        }
        
        public Criteria andDblUsdGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_usd >=", value, "ha_usd");
            return (Criteria) this;
        }
        
        public Criteria andDblUsdLessThan(Double value) {
            addCriterion("ha_usd <", value, "ha_usd");
            return (Criteria) this;
        }
        
        public Criteria andDblUsdLessThanOrEqualTo(Double value) {
            addCriterion("ha_usd <=", value, "ha_usd");
            return (Criteria) this;
        }
        
        public Criteria andDblUsdIn(List<Double> values) {
            addCriterion("ha_usd in", values, "ha_usd");
            return (Criteria) this;
        }
        
        public Criteria andDblUsdNotIn(List<Double> values) {
            addCriterion("ha_usd not in", values, "ha_usd");
            return (Criteria) this;
        }
        
        public Criteria andDblUsdBetween(Double value1, Double value2) {
            addCriterion("ha_usd between", value1, value2, "ha_usd");
            return (Criteria) this;
        }
        
        public Criteria andDblUsdNotBetween(Double value1, Double value2) {
            addCriterion("ha_usd not between", value1, value2, "ha_usd");
            return (Criteria) this;
        }
        
        
        public Criteria andStrInstitucioLike(String value) {
            addCriterion("upper(de_institucio) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_institucio");
            return (Criteria) this;
        }
        
        public Criteria andStrInstitucioNotLike(String value) {
            addCriterion("de_institucio not like", "%" + CadenaUtil.getStr(value) + "%", "de_institucio");
            return (Criteria) this;
        }
        
        public Criteria andStrInstitucioEqualTo(String value) {
            addCriterion("de_institucio =", CadenaUtil.getStr(value), "de_institucio");
            return (Criteria) this;
        }
        
        public Criteria andStrInstitucioNotEqualTo(String value) {
            addCriterion("de_institucio <>", CadenaUtil.getStr(value), "de_institucio");
            return (Criteria) this;
        }
        
        
        public Criteria andStrInstitucioIsNull() {
            addCriterion("de_institucio is null");
            return (Criteria) this;
        }
        
        public Criteria andStrInstitucioIsNotNull() {
            addCriterion("de_institucio is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrInstitucioGreaterThan(String value) {
            addCriterion("de_institucio >", value, "de_institucio");
            return (Criteria) this;
        }
        
        public Criteria andStrInstitucioGreaterThanOrEqualTo(String value) {
            addCriterion("de_institucio >=", value, "de_institucio");
            return (Criteria) this;
        }
        
        public Criteria andStrInstitucioLessThan(String value) {
            addCriterion("de_institucio <", value, "de_institucio");
            return (Criteria) this;
        }
        
        public Criteria andStrInstitucioLessThanOrEqualTo(String value) {
            addCriterion("de_institucio <=", value, "de_institucio");
            return (Criteria) this;
        }
        
        public Criteria andStrInstitucioIn(List<String> values) {
            addCriterion("de_institucio in", values, "de_institucio");
            return (Criteria) this;
        }
        
        public Criteria andStrInstitucioNotIn(List<String> values) {
            addCriterion("de_institucio not in", values, "de_institucio");
            return (Criteria) this;
        }
        
        public Criteria andStrInstitucioBetween(String value1, String value2) {
            addCriterion("de_institucio between", value1, value2, "de_institucio");
            return (Criteria) this;
        }
        
        public Criteria andStrInstitucioNotBetween(String value1, String value2) {
            addCriterion("de_institucio not between", value1, value2, "de_institucio");
            return (Criteria) this;
        }
        
        
        public Criteria andStrPersonaCoLike(String value) {
            addCriterion("upper(de_persona_co) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_persona_co");
            return (Criteria) this;
        }
        
        public Criteria andStrPersonaCoNotLike(String value) {
            addCriterion("de_persona_co not like", "%" + CadenaUtil.getStr(value) + "%", "de_persona_co");
            return (Criteria) this;
        }
        
        public Criteria andStrPersonaCoEqualTo(String value) {
            addCriterion("de_persona_co =", CadenaUtil.getStr(value), "de_persona_co");
            return (Criteria) this;
        }
        
        public Criteria andStrPersonaCoNotEqualTo(String value) {
            addCriterion("de_persona_co <>", CadenaUtil.getStr(value), "de_persona_co");
            return (Criteria) this;
        }
        
        
        public Criteria andStrPersonaCoIsNull() {
            addCriterion("de_persona_co is null");
            return (Criteria) this;
        }
        
        public Criteria andStrPersonaCoIsNotNull() {
            addCriterion("de_persona_co is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrPersonaCoGreaterThan(String value) {
            addCriterion("de_persona_co >", value, "de_persona_co");
            return (Criteria) this;
        }
        
        public Criteria andStrPersonaCoGreaterThanOrEqualTo(String value) {
            addCriterion("de_persona_co >=", value, "de_persona_co");
            return (Criteria) this;
        }
        
        public Criteria andStrPersonaCoLessThan(String value) {
            addCriterion("de_persona_co <", value, "de_persona_co");
            return (Criteria) this;
        }
        
        public Criteria andStrPersonaCoLessThanOrEqualTo(String value) {
            addCriterion("de_persona_co <=", value, "de_persona_co");
            return (Criteria) this;
        }
        
        public Criteria andStrPersonaCoIn(List<String> values) {
            addCriterion("de_persona_co in", values, "de_persona_co");
            return (Criteria) this;
        }
        
        public Criteria andStrPersonaCoNotIn(List<String> values) {
            addCriterion("de_persona_co not in", values, "de_persona_co");
            return (Criteria) this;
        }
        
        public Criteria andStrPersonaCoBetween(String value1, String value2) {
            addCriterion("de_persona_co between", value1, value2, "de_persona_co");
            return (Criteria) this;
        }
        
        public Criteria andStrPersonaCoNotBetween(String value1, String value2) {
            addCriterion("de_persona_co not between", value1, value2, "de_persona_co");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCargoLike(String value) {
            addCriterion("upper(de_cargo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_cargo");
            return (Criteria) this;
        }
        
        public Criteria andStrCargoNotLike(String value) {
            addCriterion("de_cargo not like", "%" + CadenaUtil.getStr(value) + "%", "de_cargo");
            return (Criteria) this;
        }
        
        public Criteria andStrCargoEqualTo(String value) {
            addCriterion("de_cargo =", CadenaUtil.getStr(value), "de_cargo");
            return (Criteria) this;
        }
        
        public Criteria andStrCargoNotEqualTo(String value) {
            addCriterion("de_cargo <>", CadenaUtil.getStr(value), "de_cargo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCargoIsNull() {
            addCriterion("de_cargo is null");
            return (Criteria) this;
        }
        
        public Criteria andStrCargoIsNotNull() {
            addCriterion("de_cargo is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrCargoGreaterThan(String value) {
            addCriterion("de_cargo >", value, "de_cargo");
            return (Criteria) this;
        }
        
        public Criteria andStrCargoGreaterThanOrEqualTo(String value) {
            addCriterion("de_cargo >=", value, "de_cargo");
            return (Criteria) this;
        }
        
        public Criteria andStrCargoLessThan(String value) {
            addCriterion("de_cargo <", value, "de_cargo");
            return (Criteria) this;
        }
        
        public Criteria andStrCargoLessThanOrEqualTo(String value) {
            addCriterion("de_cargo <=", value, "de_cargo");
            return (Criteria) this;
        }
        
        public Criteria andStrCargoIn(List<String> values) {
            addCriterion("de_cargo in", values, "de_cargo");
            return (Criteria) this;
        }
        
        public Criteria andStrCargoNotIn(List<String> values) {
            addCriterion("de_cargo not in", values, "de_cargo");
            return (Criteria) this;
        }
        
        public Criteria andStrCargoBetween(String value1, String value2) {
            addCriterion("de_cargo between", value1, value2, "de_cargo");
            return (Criteria) this;
        }
        
        public Criteria andStrCargoNotBetween(String value1, String value2) {
            addCriterion("de_cargo not between", value1, value2, "de_cargo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrContactoLike(String value) {
            addCriterion("upper(de_contacto) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_contacto");
            return (Criteria) this;
        }
        
        public Criteria andStrContactoNotLike(String value) {
            addCriterion("de_contacto not like", "%" + CadenaUtil.getStr(value) + "%", "de_contacto");
            return (Criteria) this;
        }
        
        public Criteria andStrContactoEqualTo(String value) {
            addCriterion("de_contacto =", CadenaUtil.getStr(value), "de_contacto");
            return (Criteria) this;
        }
        
        public Criteria andStrContactoNotEqualTo(String value) {
            addCriterion("de_contacto <>", CadenaUtil.getStr(value), "de_contacto");
            return (Criteria) this;
        }
        
        
        public Criteria andStrContactoIsNull() {
            addCriterion("de_contacto is null");
            return (Criteria) this;
        }
        
        public Criteria andStrContactoIsNotNull() {
            addCriterion("de_contacto is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrContactoGreaterThan(String value) {
            addCriterion("de_contacto >", value, "de_contacto");
            return (Criteria) this;
        }
        
        public Criteria andStrContactoGreaterThanOrEqualTo(String value) {
            addCriterion("de_contacto >=", value, "de_contacto");
            return (Criteria) this;
        }
        
        public Criteria andStrContactoLessThan(String value) {
            addCriterion("de_contacto <", value, "de_contacto");
            return (Criteria) this;
        }
        
        public Criteria andStrContactoLessThanOrEqualTo(String value) {
            addCriterion("de_contacto <=", value, "de_contacto");
            return (Criteria) this;
        }
        
        public Criteria andStrContactoIn(List<String> values) {
            addCriterion("de_contacto in", values, "de_contacto");
            return (Criteria) this;
        }
        
        public Criteria andStrContactoNotIn(List<String> values) {
            addCriterion("de_contacto not in", values, "de_contacto");
            return (Criteria) this;
        }
        
        public Criteria andStrContactoBetween(String value1, String value2) {
            addCriterion("de_contacto between", value1, value2, "de_contacto");
            return (Criteria) this;
        }
        
        public Criteria andStrContactoNotBetween(String value1, String value2) {
            addCriterion("de_contacto not between", value1, value2, "de_contacto");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDireccionLike(String value) {
            addCriterion("upper(de_direccion_) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_direccion_");
            return (Criteria) this;
        }
        
        public Criteria andStrDireccionNotLike(String value) {
            addCriterion("de_direccion_ not like", "%" + CadenaUtil.getStr(value) + "%", "de_direccion_");
            return (Criteria) this;
        }
        
        public Criteria andStrDireccionEqualTo(String value) {
            addCriterion("de_direccion_ =", CadenaUtil.getStr(value), "de_direccion_");
            return (Criteria) this;
        }
        
        public Criteria andStrDireccionNotEqualTo(String value) {
            addCriterion("de_direccion_ <>", CadenaUtil.getStr(value), "de_direccion_");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDireccionIsNull() {
            addCriterion("de_direccion_ is null");
            return (Criteria) this;
        }
        
        public Criteria andStrDireccionIsNotNull() {
            addCriterion("de_direccion_ is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrDireccionGreaterThan(String value) {
            addCriterion("de_direccion_ >", value, "de_direccion_");
            return (Criteria) this;
        }
        
        public Criteria andStrDireccionGreaterThanOrEqualTo(String value) {
            addCriterion("de_direccion_ >=", value, "de_direccion_");
            return (Criteria) this;
        }
        
        public Criteria andStrDireccionLessThan(String value) {
            addCriterion("de_direccion_ <", value, "de_direccion_");
            return (Criteria) this;
        }
        
        public Criteria andStrDireccionLessThanOrEqualTo(String value) {
            addCriterion("de_direccion_ <=", value, "de_direccion_");
            return (Criteria) this;
        }
        
        public Criteria andStrDireccionIn(List<String> values) {
            addCriterion("de_direccion_ in", values, "de_direccion_");
            return (Criteria) this;
        }
        
        public Criteria andStrDireccionNotIn(List<String> values) {
            addCriterion("de_direccion_ not in", values, "de_direccion_");
            return (Criteria) this;
        }
        
        public Criteria andStrDireccionBetween(String value1, String value2) {
            addCriterion("de_direccion_ between", value1, value2, "de_direccion_");
            return (Criteria) this;
        }
        
        public Criteria andStrDireccionNotBetween(String value1, String value2) {
            addCriterion("de_direccion_ not between", value1, value2, "de_direccion_");
            return (Criteria) this;
        }
        
        
        public Criteria andStrInstituc1Like(String value) {
            addCriterion("upper(de_instituc_1) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_instituc_1");
            return (Criteria) this;
        }
        
        public Criteria andStrInstituc1NotLike(String value) {
            addCriterion("de_instituc_1 not like", "%" + CadenaUtil.getStr(value) + "%", "de_instituc_1");
            return (Criteria) this;
        }
        
        public Criteria andStrInstituc1EqualTo(String value) {
            addCriterion("de_instituc_1 =", CadenaUtil.getStr(value), "de_instituc_1");
            return (Criteria) this;
        }
        
        public Criteria andStrInstituc1NotEqualTo(String value) {
            addCriterion("de_instituc_1 <>", CadenaUtil.getStr(value), "de_instituc_1");
            return (Criteria) this;
        }
        
        
        public Criteria andStrInstituc1IsNull() {
            addCriterion("de_instituc_1 is null");
            return (Criteria) this;
        }
        
        public Criteria andStrInstituc1IsNotNull() {
            addCriterion("de_instituc_1 is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrInstituc1GreaterThan(String value) {
            addCriterion("de_instituc_1 >", value, "de_instituc_1");
            return (Criteria) this;
        }
        
        public Criteria andStrInstituc1GreaterThanOrEqualTo(String value) {
            addCriterion("de_instituc_1 >=", value, "de_instituc_1");
            return (Criteria) this;
        }
        
        public Criteria andStrInstituc1LessThan(String value) {
            addCriterion("de_instituc_1 <", value, "de_instituc_1");
            return (Criteria) this;
        }
        
        public Criteria andStrInstituc1LessThanOrEqualTo(String value) {
            addCriterion("de_instituc_1 <=", value, "de_instituc_1");
            return (Criteria) this;
        }
        
        public Criteria andStrInstituc1In(List<String> values) {
            addCriterion("de_instituc_1 in", values, "de_instituc_1");
            return (Criteria) this;
        }
        
        public Criteria andStrInstituc1NotIn(List<String> values) {
            addCriterion("de_instituc_1 not in", values, "de_instituc_1");
            return (Criteria) this;
        }
        
        public Criteria andStrInstituc1Between(String value1, String value2) {
            addCriterion("de_instituc_1 between", value1, value2, "de_instituc_1");
            return (Criteria) this;
        }
        
        public Criteria andStrInstituc1NotBetween(String value1, String value2) {
            addCriterion("de_instituc_1 not between", value1, value2, "de_instituc_1");
            return (Criteria) this;
        }
        
        
        public Criteria andStrLinkLike(String value) {
            addCriterion("upper(de_link) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_link");
            return (Criteria) this;
        }
        
        public Criteria andStrLinkNotLike(String value) {
            addCriterion("de_link not like", "%" + CadenaUtil.getStr(value) + "%", "de_link");
            return (Criteria) this;
        }
        
        public Criteria andStrLinkEqualTo(String value) {
            addCriterion("de_link =", CadenaUtil.getStr(value), "de_link");
            return (Criteria) this;
        }
        
        public Criteria andStrLinkNotEqualTo(String value) {
            addCriterion("de_link <>", CadenaUtil.getStr(value), "de_link");
            return (Criteria) this;
        }
        
        
        public Criteria andStrLinkIsNull() {
            addCriterion("de_link is null");
            return (Criteria) this;
        }
        
        public Criteria andStrLinkIsNotNull() {
            addCriterion("de_link is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrLinkGreaterThan(String value) {
            addCriterion("de_link >", value, "de_link");
            return (Criteria) this;
        }
        
        public Criteria andStrLinkGreaterThanOrEqualTo(String value) {
            addCriterion("de_link >=", value, "de_link");
            return (Criteria) this;
        }
        
        public Criteria andStrLinkLessThan(String value) {
            addCriterion("de_link <", value, "de_link");
            return (Criteria) this;
        }
        
        public Criteria andStrLinkLessThanOrEqualTo(String value) {
            addCriterion("de_link <=", value, "de_link");
            return (Criteria) this;
        }
        
        public Criteria andStrLinkIn(List<String> values) {
            addCriterion("de_link in", values, "de_link");
            return (Criteria) this;
        }
        
        public Criteria andStrLinkNotIn(List<String> values) {
            addCriterion("de_link not in", values, "de_link");
            return (Criteria) this;
        }
        
        public Criteria andStrLinkBetween(String value1, String value2) {
            addCriterion("de_link between", value1, value2, "de_link");
            return (Criteria) this;
        }
        
        public Criteria andStrLinkNotBetween(String value1, String value2) {
            addCriterion("de_link not between", value1, value2, "de_link");
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
