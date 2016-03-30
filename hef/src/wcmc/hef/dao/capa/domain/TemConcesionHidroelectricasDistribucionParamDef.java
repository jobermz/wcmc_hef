package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class TemConcesionHidroelectricasDistribucionParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected String strHashConsulta;
	
    public TemConcesionHidroelectricasDistribucionParamDef() {
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
        
        
        public Criteria andStrIdGraficoLike(String value) {
            addCriterion("upper(de_id_grafico) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_id_grafico");
            return (Criteria) this;
        }
        
        public Criteria andStrIdGraficoNotLike(String value) {
            addCriterion("de_id_grafico not like", "%" + CadenaUtil.getStr(value) + "%", "de_id_grafico");
            return (Criteria) this;
        }
        
        public Criteria andStrIdGraficoEqualTo(String value) {
            addCriterion("de_id_grafico =", CadenaUtil.getStr(value), "de_id_grafico");
            return (Criteria) this;
        }
        
        public Criteria andStrIdGraficoNotEqualTo(String value) {
            addCriterion("de_id_grafico <>", CadenaUtil.getStr(value), "de_id_grafico");
            return (Criteria) this;
        }
        
        
        public Criteria andStrIdGraficoIsNull() {
            addCriterion("de_id_grafico is null");
            return (Criteria) this;
        }
        
        public Criteria andStrIdGraficoIsNotNull() {
            addCriterion("de_id_grafico is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrIdGraficoGreaterThan(String value) {
            addCriterion("de_id_grafico >", value, "de_id_grafico");
            return (Criteria) this;
        }
        
        public Criteria andStrIdGraficoGreaterThanOrEqualTo(String value) {
            addCriterion("de_id_grafico >=", value, "de_id_grafico");
            return (Criteria) this;
        }
        
        public Criteria andStrIdGraficoLessThan(String value) {
            addCriterion("de_id_grafico <", value, "de_id_grafico");
            return (Criteria) this;
        }
        
        public Criteria andStrIdGraficoLessThanOrEqualTo(String value) {
            addCriterion("de_id_grafico <=", value, "de_id_grafico");
            return (Criteria) this;
        }
        
        public Criteria andStrIdGraficoIn(List<String> values) {
            addCriterion("de_id_grafico in", values, "de_id_grafico");
            return (Criteria) this;
        }
        
        public Criteria andStrIdGraficoNotIn(List<String> values) {
            addCriterion("de_id_grafico not in", values, "de_id_grafico");
            return (Criteria) this;
        }
        
        public Criteria andStrIdGraficoBetween(String value1, String value2) {
            addCriterion("de_id_grafico between", value1, value2, "de_id_grafico");
            return (Criteria) this;
        }
        
        public Criteria andStrIdGraficoNotBetween(String value1, String value2) {
            addCriterion("de_id_grafico not between", value1, value2, "de_id_grafico");
            return (Criteria) this;
        }
        
        
        public Criteria andStrExpedienteLike(String value) {
            addCriterion("upper(de_expediente) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_expediente");
            return (Criteria) this;
        }
        
        public Criteria andStrExpedienteNotLike(String value) {
            addCriterion("de_expediente not like", "%" + CadenaUtil.getStr(value) + "%", "de_expediente");
            return (Criteria) this;
        }
        
        public Criteria andStrExpedienteEqualTo(String value) {
            addCriterion("de_expediente =", CadenaUtil.getStr(value), "de_expediente");
            return (Criteria) this;
        }
        
        public Criteria andStrExpedienteNotEqualTo(String value) {
            addCriterion("de_expediente <>", CadenaUtil.getStr(value), "de_expediente");
            return (Criteria) this;
        }
        
        
        public Criteria andStrExpedienteIsNull() {
            addCriterion("de_expediente is null");
            return (Criteria) this;
        }
        
        public Criteria andStrExpedienteIsNotNull() {
            addCriterion("de_expediente is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrExpedienteGreaterThan(String value) {
            addCriterion("de_expediente >", value, "de_expediente");
            return (Criteria) this;
        }
        
        public Criteria andStrExpedienteGreaterThanOrEqualTo(String value) {
            addCriterion("de_expediente >=", value, "de_expediente");
            return (Criteria) this;
        }
        
        public Criteria andStrExpedienteLessThan(String value) {
            addCriterion("de_expediente <", value, "de_expediente");
            return (Criteria) this;
        }
        
        public Criteria andStrExpedienteLessThanOrEqualTo(String value) {
            addCriterion("de_expediente <=", value, "de_expediente");
            return (Criteria) this;
        }
        
        public Criteria andStrExpedienteIn(List<String> values) {
            addCriterion("de_expediente in", values, "de_expediente");
            return (Criteria) this;
        }
        
        public Criteria andStrExpedienteNotIn(List<String> values) {
            addCriterion("de_expediente not in", values, "de_expediente");
            return (Criteria) this;
        }
        
        public Criteria andStrExpedienteBetween(String value1, String value2) {
            addCriterion("de_expediente between", value1, value2, "de_expediente");
            return (Criteria) this;
        }
        
        public Criteria andStrExpedienteNotBetween(String value1, String value2) {
            addCriterion("de_expediente not between", value1, value2, "de_expediente");
            return (Criteria) this;
        }
        
        
        public Criteria andStrConcesionLike(String value) {
            addCriterion("upper(de_concesion) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_concesion");
            return (Criteria) this;
        }
        
        public Criteria andStrConcesionNotLike(String value) {
            addCriterion("de_concesion not like", "%" + CadenaUtil.getStr(value) + "%", "de_concesion");
            return (Criteria) this;
        }
        
        public Criteria andStrConcesionEqualTo(String value) {
            addCriterion("de_concesion =", CadenaUtil.getStr(value), "de_concesion");
            return (Criteria) this;
        }
        
        public Criteria andStrConcesionNotEqualTo(String value) {
            addCriterion("de_concesion <>", CadenaUtil.getStr(value), "de_concesion");
            return (Criteria) this;
        }
        
        
        public Criteria andStrConcesionIsNull() {
            addCriterion("de_concesion is null");
            return (Criteria) this;
        }
        
        public Criteria andStrConcesionIsNotNull() {
            addCriterion("de_concesion is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrConcesionGreaterThan(String value) {
            addCriterion("de_concesion >", value, "de_concesion");
            return (Criteria) this;
        }
        
        public Criteria andStrConcesionGreaterThanOrEqualTo(String value) {
            addCriterion("de_concesion >=", value, "de_concesion");
            return (Criteria) this;
        }
        
        public Criteria andStrConcesionLessThan(String value) {
            addCriterion("de_concesion <", value, "de_concesion");
            return (Criteria) this;
        }
        
        public Criteria andStrConcesionLessThanOrEqualTo(String value) {
            addCriterion("de_concesion <=", value, "de_concesion");
            return (Criteria) this;
        }
        
        public Criteria andStrConcesionIn(List<String> values) {
            addCriterion("de_concesion in", values, "de_concesion");
            return (Criteria) this;
        }
        
        public Criteria andStrConcesionNotIn(List<String> values) {
            addCriterion("de_concesion not in", values, "de_concesion");
            return (Criteria) this;
        }
        
        public Criteria andStrConcesionBetween(String value1, String value2) {
            addCriterion("de_concesion between", value1, value2, "de_concesion");
            return (Criteria) this;
        }
        
        public Criteria andStrConcesionNotBetween(String value1, String value2) {
            addCriterion("de_concesion not between", value1, value2, "de_concesion");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombreZonLike(String value) {
            addCriterion("upper(de_nombre_zon) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_nombre_zon");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreZonNotLike(String value) {
            addCriterion("de_nombre_zon not like", "%" + CadenaUtil.getStr(value) + "%", "de_nombre_zon");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreZonEqualTo(String value) {
            addCriterion("de_nombre_zon =", CadenaUtil.getStr(value), "de_nombre_zon");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreZonNotEqualTo(String value) {
            addCriterion("de_nombre_zon <>", CadenaUtil.getStr(value), "de_nombre_zon");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombreZonIsNull() {
            addCriterion("de_nombre_zon is null");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreZonIsNotNull() {
            addCriterion("de_nombre_zon is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreZonGreaterThan(String value) {
            addCriterion("de_nombre_zon >", value, "de_nombre_zon");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreZonGreaterThanOrEqualTo(String value) {
            addCriterion("de_nombre_zon >=", value, "de_nombre_zon");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreZonLessThan(String value) {
            addCriterion("de_nombre_zon <", value, "de_nombre_zon");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreZonLessThanOrEqualTo(String value) {
            addCriterion("de_nombre_zon <=", value, "de_nombre_zon");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreZonIn(List<String> values) {
            addCriterion("de_nombre_zon in", values, "de_nombre_zon");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreZonNotIn(List<String> values) {
            addCriterion("de_nombre_zon not in", values, "de_nombre_zon");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreZonBetween(String value1, String value2) {
            addCriterion("de_nombre_zon between", value1, value2, "de_nombre_zon");
            return (Criteria) this;
        }
        
        public Criteria andStrNombreZonNotBetween(String value1, String value2) {
            addCriterion("de_nombre_zon not between", value1, value2, "de_nombre_zon");
            return (Criteria) this;
        }
        
        
        public Criteria andStrTipoConceLike(String value) {
            addCriterion("upper(de_tipo_conce) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_tipo_conce");
            return (Criteria) this;
        }
        
        public Criteria andStrTipoConceNotLike(String value) {
            addCriterion("de_tipo_conce not like", "%" + CadenaUtil.getStr(value) + "%", "de_tipo_conce");
            return (Criteria) this;
        }
        
        public Criteria andStrTipoConceEqualTo(String value) {
            addCriterion("de_tipo_conce =", CadenaUtil.getStr(value), "de_tipo_conce");
            return (Criteria) this;
        }
        
        public Criteria andStrTipoConceNotEqualTo(String value) {
            addCriterion("de_tipo_conce <>", CadenaUtil.getStr(value), "de_tipo_conce");
            return (Criteria) this;
        }
        
        
        public Criteria andStrTipoConceIsNull() {
            addCriterion("de_tipo_conce is null");
            return (Criteria) this;
        }
        
        public Criteria andStrTipoConceIsNotNull() {
            addCriterion("de_tipo_conce is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrTipoConceGreaterThan(String value) {
            addCriterion("de_tipo_conce >", value, "de_tipo_conce");
            return (Criteria) this;
        }
        
        public Criteria andStrTipoConceGreaterThanOrEqualTo(String value) {
            addCriterion("de_tipo_conce >=", value, "de_tipo_conce");
            return (Criteria) this;
        }
        
        public Criteria andStrTipoConceLessThan(String value) {
            addCriterion("de_tipo_conce <", value, "de_tipo_conce");
            return (Criteria) this;
        }
        
        public Criteria andStrTipoConceLessThanOrEqualTo(String value) {
            addCriterion("de_tipo_conce <=", value, "de_tipo_conce");
            return (Criteria) this;
        }
        
        public Criteria andStrTipoConceIn(List<String> values) {
            addCriterion("de_tipo_conce in", values, "de_tipo_conce");
            return (Criteria) this;
        }
        
        public Criteria andStrTipoConceNotIn(List<String> values) {
            addCriterion("de_tipo_conce not in", values, "de_tipo_conce");
            return (Criteria) this;
        }
        
        public Criteria andStrTipoConceBetween(String value1, String value2) {
            addCriterion("de_tipo_conce between", value1, value2, "de_tipo_conce");
            return (Criteria) this;
        }
        
        public Criteria andStrTipoConceNotBetween(String value1, String value2) {
            addCriterion("de_tipo_conce not between", value1, value2, "de_tipo_conce");
            return (Criteria) this;
        }
        
        
        public Criteria andStrEmpresaLike(String value) {
            addCriterion("upper(de_empresa) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_empresa");
            return (Criteria) this;
        }
        
        public Criteria andStrEmpresaNotLike(String value) {
            addCriterion("de_empresa not like", "%" + CadenaUtil.getStr(value) + "%", "de_empresa");
            return (Criteria) this;
        }
        
        public Criteria andStrEmpresaEqualTo(String value) {
            addCriterion("de_empresa =", CadenaUtil.getStr(value), "de_empresa");
            return (Criteria) this;
        }
        
        public Criteria andStrEmpresaNotEqualTo(String value) {
            addCriterion("de_empresa <>", CadenaUtil.getStr(value), "de_empresa");
            return (Criteria) this;
        }
        
        
        public Criteria andStrEmpresaIsNull() {
            addCriterion("de_empresa is null");
            return (Criteria) this;
        }
        
        public Criteria andStrEmpresaIsNotNull() {
            addCriterion("de_empresa is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrEmpresaGreaterThan(String value) {
            addCriterion("de_empresa >", value, "de_empresa");
            return (Criteria) this;
        }
        
        public Criteria andStrEmpresaGreaterThanOrEqualTo(String value) {
            addCriterion("de_empresa >=", value, "de_empresa");
            return (Criteria) this;
        }
        
        public Criteria andStrEmpresaLessThan(String value) {
            addCriterion("de_empresa <", value, "de_empresa");
            return (Criteria) this;
        }
        
        public Criteria andStrEmpresaLessThanOrEqualTo(String value) {
            addCriterion("de_empresa <=", value, "de_empresa");
            return (Criteria) this;
        }
        
        public Criteria andStrEmpresaIn(List<String> values) {
            addCriterion("de_empresa in", values, "de_empresa");
            return (Criteria) this;
        }
        
        public Criteria andStrEmpresaNotIn(List<String> values) {
            addCriterion("de_empresa not in", values, "de_empresa");
            return (Criteria) this;
        }
        
        public Criteria andStrEmpresaBetween(String value1, String value2) {
            addCriterion("de_empresa between", value1, value2, "de_empresa");
            return (Criteria) this;
        }
        
        public Criteria andStrEmpresaNotBetween(String value1, String value2) {
            addCriterion("de_empresa not between", value1, value2, "de_empresa");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSistemaElLike(String value) {
            addCriterion("upper(de_sistema_el) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_sistema_el");
            return (Criteria) this;
        }
        
        public Criteria andStrSistemaElNotLike(String value) {
            addCriterion("de_sistema_el not like", "%" + CadenaUtil.getStr(value) + "%", "de_sistema_el");
            return (Criteria) this;
        }
        
        public Criteria andStrSistemaElEqualTo(String value) {
            addCriterion("de_sistema_el =", CadenaUtil.getStr(value), "de_sistema_el");
            return (Criteria) this;
        }
        
        public Criteria andStrSistemaElNotEqualTo(String value) {
            addCriterion("de_sistema_el <>", CadenaUtil.getStr(value), "de_sistema_el");
            return (Criteria) this;
        }
        
        
        public Criteria andStrSistemaElIsNull() {
            addCriterion("de_sistema_el is null");
            return (Criteria) this;
        }
        
        public Criteria andStrSistemaElIsNotNull() {
            addCriterion("de_sistema_el is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrSistemaElGreaterThan(String value) {
            addCriterion("de_sistema_el >", value, "de_sistema_el");
            return (Criteria) this;
        }
        
        public Criteria andStrSistemaElGreaterThanOrEqualTo(String value) {
            addCriterion("de_sistema_el >=", value, "de_sistema_el");
            return (Criteria) this;
        }
        
        public Criteria andStrSistemaElLessThan(String value) {
            addCriterion("de_sistema_el <", value, "de_sistema_el");
            return (Criteria) this;
        }
        
        public Criteria andStrSistemaElLessThanOrEqualTo(String value) {
            addCriterion("de_sistema_el <=", value, "de_sistema_el");
            return (Criteria) this;
        }
        
        public Criteria andStrSistemaElIn(List<String> values) {
            addCriterion("de_sistema_el in", values, "de_sistema_el");
            return (Criteria) this;
        }
        
        public Criteria andStrSistemaElNotIn(List<String> values) {
            addCriterion("de_sistema_el not in", values, "de_sistema_el");
            return (Criteria) this;
        }
        
        public Criteria andStrSistemaElBetween(String value1, String value2) {
            addCriterion("de_sistema_el between", value1, value2, "de_sistema_el");
            return (Criteria) this;
        }
        
        public Criteria andStrSistemaElNotBetween(String value1, String value2) {
            addCriterion("de_sistema_el not between", value1, value2, "de_sistema_el");
            return (Criteria) this;
        }
        
        
        public Criteria andLngAreaInfluEqualTo(Long value) {
            addCriterion("cd_area_influ =", value, "cd_area_influ");
            return (Criteria) this;
        }
        
        public Criteria andLngAreaInfluNotEqualTo(Long value) {
            addCriterion("cd_area_influ <>", value, "cd_area_influ");
            return (Criteria) this;
        }
        
        
        public Criteria andLngAreaInfluIsNull() {
            addCriterion("cd_area_influ is null");
            return (Criteria) this;
        }
        
        public Criteria andLngAreaInfluIsNotNull() {
            addCriterion("cd_area_influ is not null");
            return (Criteria) this;
        }
        
        public Criteria andLngAreaInfluGreaterThan(Long value) {
            addCriterion("cd_area_influ >", value, "cd_area_influ");
            return (Criteria) this;
        }
        
        public Criteria andLngAreaInfluGreaterThanOrEqualTo(Long value) {
            addCriterion("cd_area_influ >=", value, "cd_area_influ");
            return (Criteria) this;
        }
        
        public Criteria andLngAreaInfluLessThan(Long value) {
            addCriterion("cd_area_influ <", value, "cd_area_influ");
            return (Criteria) this;
        }
        
        public Criteria andLngAreaInfluLessThanOrEqualTo(Long value) {
            addCriterion("cd_area_influ <=", value, "cd_area_influ");
            return (Criteria) this;
        }
        
        public Criteria andLngAreaInfluIn(List<Long> values) {
            addCriterion("cd_area_influ in", values, "cd_area_influ");
            return (Criteria) this;
        }
        
        public Criteria andLngAreaInfluNotIn(List<Long> values) {
            addCriterion("cd_area_influ not in", values, "cd_area_influ");
            return (Criteria) this;
        }
        
        public Criteria andLngAreaInfluBetween(Long value1, Long value2) {
            addCriterion("cd_area_influ between", value1, value2, "cd_area_influ");
            return (Criteria) this;
        }
        
        public Criteria andLngAreaInfluNotBetween(Long value1, Long value2) {
            addCriterion("cd_area_influ not between", value1, value2, "cd_area_influ");
            return (Criteria) this;
        }
        
        
        public Criteria andDblMaximaDemEqualTo(Double value) {
            addCriterion("ha_maxima_dem =", value, "ha_maxima_dem");
            return (Criteria) this;
        }
        
        public Criteria andDblMaximaDemNotEqualTo(Double value) {
            addCriterion("ha_maxima_dem <>", value, "ha_maxima_dem");
            return (Criteria) this;
        }
        
        
        public Criteria andDblMaximaDemIsNull() {
            addCriterion("ha_maxima_dem is null");
            return (Criteria) this;
        }
        
        public Criteria andDblMaximaDemIsNotNull() {
            addCriterion("ha_maxima_dem is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblMaximaDemGreaterThan(Double value) {
            addCriterion("ha_maxima_dem >", value, "ha_maxima_dem");
            return (Criteria) this;
        }
        
        public Criteria andDblMaximaDemGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_maxima_dem >=", value, "ha_maxima_dem");
            return (Criteria) this;
        }
        
        public Criteria andDblMaximaDemLessThan(Double value) {
            addCriterion("ha_maxima_dem <", value, "ha_maxima_dem");
            return (Criteria) this;
        }
        
        public Criteria andDblMaximaDemLessThanOrEqualTo(Double value) {
            addCriterion("ha_maxima_dem <=", value, "ha_maxima_dem");
            return (Criteria) this;
        }
        
        public Criteria andDblMaximaDemIn(List<Double> values) {
            addCriterion("ha_maxima_dem in", values, "ha_maxima_dem");
            return (Criteria) this;
        }
        
        public Criteria andDblMaximaDemNotIn(List<Double> values) {
            addCriterion("ha_maxima_dem not in", values, "ha_maxima_dem");
            return (Criteria) this;
        }
        
        public Criteria andDblMaximaDemBetween(Double value1, Double value2) {
            addCriterion("ha_maxima_dem between", value1, value2, "ha_maxima_dem");
            return (Criteria) this;
        }
        
        public Criteria andDblMaximaDemNotBetween(Double value1, Double value2) {
            addCriterion("ha_maxima_dem not between", value1, value2, "ha_maxima_dem");
            return (Criteria) this;
        }
        
        
        public Criteria andDblHorasServEqualTo(Double value) {
            addCriterion("ha_horas_serv =", value, "ha_horas_serv");
            return (Criteria) this;
        }
        
        public Criteria andDblHorasServNotEqualTo(Double value) {
            addCriterion("ha_horas_serv <>", value, "ha_horas_serv");
            return (Criteria) this;
        }
        
        
        public Criteria andDblHorasServIsNull() {
            addCriterion("ha_horas_serv is null");
            return (Criteria) this;
        }
        
        public Criteria andDblHorasServIsNotNull() {
            addCriterion("ha_horas_serv is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblHorasServGreaterThan(Double value) {
            addCriterion("ha_horas_serv >", value, "ha_horas_serv");
            return (Criteria) this;
        }
        
        public Criteria andDblHorasServGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_horas_serv >=", value, "ha_horas_serv");
            return (Criteria) this;
        }
        
        public Criteria andDblHorasServLessThan(Double value) {
            addCriterion("ha_horas_serv <", value, "ha_horas_serv");
            return (Criteria) this;
        }
        
        public Criteria andDblHorasServLessThanOrEqualTo(Double value) {
            addCriterion("ha_horas_serv <=", value, "ha_horas_serv");
            return (Criteria) this;
        }
        
        public Criteria andDblHorasServIn(List<Double> values) {
            addCriterion("ha_horas_serv in", values, "ha_horas_serv");
            return (Criteria) this;
        }
        
        public Criteria andDblHorasServNotIn(List<Double> values) {
            addCriterion("ha_horas_serv not in", values, "ha_horas_serv");
            return (Criteria) this;
        }
        
        public Criteria andDblHorasServBetween(Double value1, Double value2) {
            addCriterion("ha_horas_serv between", value1, value2, "ha_horas_serv");
            return (Criteria) this;
        }
        
        public Criteria andDblHorasServNotBetween(Double value1, Double value2) {
            addCriterion("ha_horas_serv not between", value1, value2, "ha_horas_serv");
            return (Criteria) this;
        }
        
        
        public Criteria andLngNumeroUsuEqualTo(Long value) {
            addCriterion("cd_numero_usu =", value, "cd_numero_usu");
            return (Criteria) this;
        }
        
        public Criteria andLngNumeroUsuNotEqualTo(Long value) {
            addCriterion("cd_numero_usu <>", value, "cd_numero_usu");
            return (Criteria) this;
        }
        
        
        public Criteria andLngNumeroUsuIsNull() {
            addCriterion("cd_numero_usu is null");
            return (Criteria) this;
        }
        
        public Criteria andLngNumeroUsuIsNotNull() {
            addCriterion("cd_numero_usu is not null");
            return (Criteria) this;
        }
        
        public Criteria andLngNumeroUsuGreaterThan(Long value) {
            addCriterion("cd_numero_usu >", value, "cd_numero_usu");
            return (Criteria) this;
        }
        
        public Criteria andLngNumeroUsuGreaterThanOrEqualTo(Long value) {
            addCriterion("cd_numero_usu >=", value, "cd_numero_usu");
            return (Criteria) this;
        }
        
        public Criteria andLngNumeroUsuLessThan(Long value) {
            addCriterion("cd_numero_usu <", value, "cd_numero_usu");
            return (Criteria) this;
        }
        
        public Criteria andLngNumeroUsuLessThanOrEqualTo(Long value) {
            addCriterion("cd_numero_usu <=", value, "cd_numero_usu");
            return (Criteria) this;
        }
        
        public Criteria andLngNumeroUsuIn(List<Long> values) {
            addCriterion("cd_numero_usu in", values, "cd_numero_usu");
            return (Criteria) this;
        }
        
        public Criteria andLngNumeroUsuNotIn(List<Long> values) {
            addCriterion("cd_numero_usu not in", values, "cd_numero_usu");
            return (Criteria) this;
        }
        
        public Criteria andLngNumeroUsuBetween(Long value1, Long value2) {
            addCriterion("cd_numero_usu between", value1, value2, "cd_numero_usu");
            return (Criteria) this;
        }
        
        public Criteria andLngNumeroUsuNotBetween(Long value1, Long value2) {
            addCriterion("cd_numero_usu not between", value1, value2, "cd_numero_usu");
            return (Criteria) this;
        }
        
        
        public Criteria andDteFechaPresEqualTo(Date value) {
            addCriterion("fc_fecha_pres =", value, "fc_fecha_pres");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaPresNotEqualTo(Date value) {
            addCriterion("fc_fecha_pres <>", value, "fc_fecha_pres");
            return (Criteria) this;
        }
        
        
        public Criteria andDteFechaPresIsNull() {
            addCriterion("fc_fecha_pres is null");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaPresIsNotNull() {
            addCriterion("fc_fecha_pres is not null");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaPresGreaterThan(Date value) {
            addCriterion("fc_fecha_pres >", value, "fc_fecha_pres");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaPresGreaterThanOrEqualTo(Date value) {
            addCriterion("fc_fecha_pres >=", value, "fc_fecha_pres");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaPresLessThan(Date value) {
            addCriterion("fc_fecha_pres <", value, "fc_fecha_pres");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaPresLessThanOrEqualTo(Date value) {
            addCriterion("fc_fecha_pres <=", value, "fc_fecha_pres");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaPresIn(List<Date> values) {
            addCriterion("fc_fecha_pres in", values, "fc_fecha_pres");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaPresNotIn(List<Date> values) {
            addCriterion("fc_fecha_pres not in", values, "fc_fecha_pres");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaPresBetween(Date value1, Date value2) {
            addCriterion("fc_fecha_pres between", value1, value2, "fc_fecha_pres");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaPresNotBetween(Date value1, Date value2) {
            addCriterion("fc_fecha_pres not between", value1, value2, "fc_fecha_pres");
            return (Criteria) this;
        }
        
        
        public Criteria andDteFechaResoEqualTo(Date value) {
            addCriterion("fc_fecha_reso =", value, "fc_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaResoNotEqualTo(Date value) {
            addCriterion("fc_fecha_reso <>", value, "fc_fecha_reso");
            return (Criteria) this;
        }
        
        
        public Criteria andDteFechaResoIsNull() {
            addCriterion("fc_fecha_reso is null");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaResoIsNotNull() {
            addCriterion("fc_fecha_reso is not null");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaResoGreaterThan(Date value) {
            addCriterion("fc_fecha_reso >", value, "fc_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaResoGreaterThanOrEqualTo(Date value) {
            addCriterion("fc_fecha_reso >=", value, "fc_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaResoLessThan(Date value) {
            addCriterion("fc_fecha_reso <", value, "fc_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaResoLessThanOrEqualTo(Date value) {
            addCriterion("fc_fecha_reso <=", value, "fc_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaResoIn(List<Date> values) {
            addCriterion("fc_fecha_reso in", values, "fc_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaResoNotIn(List<Date> values) {
            addCriterion("fc_fecha_reso not in", values, "fc_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaResoBetween(Date value1, Date value2) {
            addCriterion("fc_fecha_reso between", value1, value2, "fc_fecha_reso");
            return (Criteria) this;
        }
        
        public Criteria andDteFechaResoNotBetween(Date value1, Date value2) {
            addCriterion("fc_fecha_reso not between", value1, value2, "fc_fecha_reso");
            return (Criteria) this;
        }
        
        
        public Criteria andStrActivoLike(String value) {
            addCriterion("upper(de_activo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_activo");
            return (Criteria) this;
        }
        
        public Criteria andStrActivoNotLike(String value) {
            addCriterion("de_activo not like", "%" + CadenaUtil.getStr(value) + "%", "de_activo");
            return (Criteria) this;
        }
        
        public Criteria andStrActivoEqualTo(String value) {
            addCriterion("de_activo =", CadenaUtil.getStr(value), "de_activo");
            return (Criteria) this;
        }
        
        public Criteria andStrActivoNotEqualTo(String value) {
            addCriterion("de_activo <>", CadenaUtil.getStr(value), "de_activo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrActivoIsNull() {
            addCriterion("de_activo is null");
            return (Criteria) this;
        }
        
        public Criteria andStrActivoIsNotNull() {
            addCriterion("de_activo is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrActivoGreaterThan(String value) {
            addCriterion("de_activo >", value, "de_activo");
            return (Criteria) this;
        }
        
        public Criteria andStrActivoGreaterThanOrEqualTo(String value) {
            addCriterion("de_activo >=", value, "de_activo");
            return (Criteria) this;
        }
        
        public Criteria andStrActivoLessThan(String value) {
            addCriterion("de_activo <", value, "de_activo");
            return (Criteria) this;
        }
        
        public Criteria andStrActivoLessThanOrEqualTo(String value) {
            addCriterion("de_activo <=", value, "de_activo");
            return (Criteria) this;
        }
        
        public Criteria andStrActivoIn(List<String> values) {
            addCriterion("de_activo in", values, "de_activo");
            return (Criteria) this;
        }
        
        public Criteria andStrActivoNotIn(List<String> values) {
            addCriterion("de_activo not in", values, "de_activo");
            return (Criteria) this;
        }
        
        public Criteria andStrActivoBetween(String value1, String value2) {
            addCriterion("de_activo between", value1, value2, "de_activo");
            return (Criteria) this;
        }
        
        public Criteria andStrActivoNotBetween(String value1, String value2) {
            addCriterion("de_activo not between", value1, value2, "de_activo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCodigoConLike(String value) {
            addCriterion("upper(de_codigo_con) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_codigo_con");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoConNotLike(String value) {
            addCriterion("de_codigo_con not like", "%" + CadenaUtil.getStr(value) + "%", "de_codigo_con");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoConEqualTo(String value) {
            addCriterion("de_codigo_con =", CadenaUtil.getStr(value), "de_codigo_con");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoConNotEqualTo(String value) {
            addCriterion("de_codigo_con <>", CadenaUtil.getStr(value), "de_codigo_con");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCodigoConIsNull() {
            addCriterion("de_codigo_con is null");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoConIsNotNull() {
            addCriterion("de_codigo_con is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoConGreaterThan(String value) {
            addCriterion("de_codigo_con >", value, "de_codigo_con");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoConGreaterThanOrEqualTo(String value) {
            addCriterion("de_codigo_con >=", value, "de_codigo_con");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoConLessThan(String value) {
            addCriterion("de_codigo_con <", value, "de_codigo_con");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoConLessThanOrEqualTo(String value) {
            addCriterion("de_codigo_con <=", value, "de_codigo_con");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoConIn(List<String> values) {
            addCriterion("de_codigo_con in", values, "de_codigo_con");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoConNotIn(List<String> values) {
            addCriterion("de_codigo_con not in", values, "de_codigo_con");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoConBetween(String value1, String value2) {
            addCriterion("de_codigo_con between", value1, value2, "de_codigo_con");
            return (Criteria) this;
        }
        
        public Criteria andStrCodigoConNotBetween(String value1, String value2) {
            addCriterion("de_codigo_con not between", value1, value2, "de_codigo_con");
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
