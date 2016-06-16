package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class TemCarbonoEcozonasParamDef {
		
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected String strHashConsulta;
	
    public TemCarbonoEcozonasParamDef() {
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
        
        
        public Criteria andStrEcozonaLike(String value) {
            addCriterion("upper(de_ecozona) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_ecozona");
            return (Criteria) this;
        }
        
        public Criteria andStrEcozonaNotLike(String value) {
            addCriterion("de_ecozona not like", "%" + CadenaUtil.getStr(value) + "%", "de_ecozona");
            return (Criteria) this;
        }
        
        public Criteria andStrEcozonaEqualTo(String value) {
            addCriterion("de_ecozona =", CadenaUtil.getStr(value), "de_ecozona");
            return (Criteria) this;
        }
        
        public Criteria andStrEcozonaNotEqualTo(String value) {
            addCriterion("de_ecozona <>", CadenaUtil.getStr(value), "de_ecozona");
            return (Criteria) this;
        }
        
        
        public Criteria andStrEcozonaIsNull() {
            addCriterion("de_ecozona is null");
            return (Criteria) this;
        }
        
        public Criteria andStrEcozonaIsNotNull() {
            addCriterion("de_ecozona is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrEcozonaGreaterThan(String value) {
            addCriterion("de_ecozona >", value, "de_ecozona");
            return (Criteria) this;
        }
        
        public Criteria andStrEcozonaGreaterThanOrEqualTo(String value) {
            addCriterion("de_ecozona >=", value, "de_ecozona");
            return (Criteria) this;
        }
        
        public Criteria andStrEcozonaLessThan(String value) {
            addCriterion("de_ecozona <", value, "de_ecozona");
            return (Criteria) this;
        }
        
        public Criteria andStrEcozonaLessThanOrEqualTo(String value) {
            addCriterion("de_ecozona <=", value, "de_ecozona");
            return (Criteria) this;
        }
        
        public Criteria andStrEcozonaIn(List<String> values) {
            addCriterion("de_ecozona in", values, "de_ecozona");
            return (Criteria) this;
        }
        
        public Criteria andStrEcozonaNotIn(List<String> values) {
            addCriterion("de_ecozona not in", values, "de_ecozona");
            return (Criteria) this;
        }
        
        public Criteria andStrEcozonaBetween(String value1, String value2) {
            addCriterion("de_ecozona between", value1, value2, "de_ecozona");
            return (Criteria) this;
        }
        
        public Criteria andStrEcozonaNotBetween(String value1, String value2) {
            addCriterion("de_ecozona not between", value1, value2, "de_ecozona");
            return (Criteria) this;
        }
        
        
        public Criteria andStrTcHaLike(String value) {
            addCriterion("upper(de_tc_ha) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andStrTcHaNotLike(String value) {
            addCriterion("de_tc_ha not like", "%" + CadenaUtil.getStr(value) + "%", "de_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andStrTcHaEqualTo(String value) {
            addCriterion("de_tc_ha =", CadenaUtil.getStr(value), "de_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andStrTcHaNotEqualTo(String value) {
            addCriterion("de_tc_ha <>", CadenaUtil.getStr(value), "de_tc_ha");
            return (Criteria) this;
        }
        
        
        public Criteria andStrTcHaIsNull() {
            addCriterion("de_tc_ha is null");
            return (Criteria) this;
        }
        
        public Criteria andStrTcHaIsNotNull() {
            addCriterion("de_tc_ha is not null");
            return (Criteria) this;
        }
        
        public Criteria andStrTcHaGreaterThan(String value) {
            addCriterion("de_tc_ha >", value, "de_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andStrTcHaGreaterThanOrEqualTo(String value) {
            addCriterion("de_tc_ha >=", value, "de_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andStrTcHaLessThan(String value) {
            addCriterion("de_tc_ha <", value, "de_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andStrTcHaLessThanOrEqualTo(String value) {
            addCriterion("de_tc_ha <=", value, "de_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andStrTcHaIn(List<String> values) {
            addCriterion("de_tc_ha in", values, "de_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andStrTcHaNotIn(List<String> values) {
            addCriterion("de_tc_ha not in", values, "de_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andStrTcHaBetween(String value1, String value2) {
            addCriterion("de_tc_ha between", value1, value2, "de_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andStrTcHaNotBetween(String value1, String value2) {
            addCriterion("de_tc_ha not between", value1, value2, "de_tc_ha");
            return (Criteria) this;
        }
        
        
        public Criteria andDblLinfTcHaEqualTo(Double value) {
            addCriterion("ha_linf_tc_ha =", value, "ha_linf_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblLinfTcHaNotEqualTo(Double value) {
            addCriterion("ha_linf_tc_ha <>", value, "ha_linf_tc_ha");
            return (Criteria) this;
        }
        
        
        public Criteria andDblLinfTcHaIsNull() {
            addCriterion("ha_linf_tc_ha is null");
            return (Criteria) this;
        }
        
        public Criteria andDblLinfTcHaIsNotNull() {
            addCriterion("ha_linf_tc_ha is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblLinfTcHaGreaterThan(Double value) {
            addCriterion("ha_linf_tc_ha >", value, "ha_linf_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblLinfTcHaGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_linf_tc_ha >=", value, "ha_linf_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblLinfTcHaLessThan(Double value) {
            addCriterion("ha_linf_tc_ha <", value, "ha_linf_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblLinfTcHaLessThanOrEqualTo(Double value) {
            addCriterion("ha_linf_tc_ha <=", value, "ha_linf_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblLinfTcHaIn(List<Double> values) {
            addCriterion("ha_linf_tc_ha in", values, "ha_linf_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblLinfTcHaNotIn(List<Double> values) {
            addCriterion("ha_linf_tc_ha not in", values, "ha_linf_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblLinfTcHaBetween(Double value1, Double value2) {
            addCriterion("ha_linf_tc_ha between", value1, value2, "ha_linf_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblLinfTcHaNotBetween(Double value1, Double value2) {
            addCriterion("ha_linf_tc_ha not between", value1, value2, "ha_linf_tc_ha");
            return (Criteria) this;
        }
        
        
        public Criteria andDblLsupTcHaEqualTo(Double value) {
            addCriterion("ha_lsup_tc_ha =", value, "ha_lsup_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblLsupTcHaNotEqualTo(Double value) {
            addCriterion("ha_lsup_tc_ha <>", value, "ha_lsup_tc_ha");
            return (Criteria) this;
        }
        
        
        public Criteria andDblLsupTcHaIsNull() {
            addCriterion("ha_lsup_tc_ha is null");
            return (Criteria) this;
        }
        
        public Criteria andDblLsupTcHaIsNotNull() {
            addCriterion("ha_lsup_tc_ha is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblLsupTcHaGreaterThan(Double value) {
            addCriterion("ha_lsup_tc_ha >", value, "ha_lsup_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblLsupTcHaGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_lsup_tc_ha >=", value, "ha_lsup_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblLsupTcHaLessThan(Double value) {
            addCriterion("ha_lsup_tc_ha <", value, "ha_lsup_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblLsupTcHaLessThanOrEqualTo(Double value) {
            addCriterion("ha_lsup_tc_ha <=", value, "ha_lsup_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblLsupTcHaIn(List<Double> values) {
            addCriterion("ha_lsup_tc_ha in", values, "ha_lsup_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblLsupTcHaNotIn(List<Double> values) {
            addCriterion("ha_lsup_tc_ha not in", values, "ha_lsup_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblLsupTcHaBetween(Double value1, Double value2) {
            addCriterion("ha_lsup_tc_ha between", value1, value2, "ha_lsup_tc_ha");
            return (Criteria) this;
        }
        
        public Criteria andDblLsupTcHaNotBetween(Double value1, Double value2) {
            addCriterion("ha_lsup_tc_ha not between", value1, value2, "ha_lsup_tc_ha");
            return (Criteria) this;
        }
        
        
        public Criteria andDblPorcIncerEqualTo(Double value) {
            addCriterion("ha_porc_incer =", value, "ha_porc_incer");
            return (Criteria) this;
        }
        
        public Criteria andDblPorcIncerNotEqualTo(Double value) {
            addCriterion("ha_porc_incer <>", value, "ha_porc_incer");
            return (Criteria) this;
        }
        
        
        public Criteria andDblPorcIncerIsNull() {
            addCriterion("ha_porc_incer is null");
            return (Criteria) this;
        }
        
        public Criteria andDblPorcIncerIsNotNull() {
            addCriterion("ha_porc_incer is not null");
            return (Criteria) this;
        }
        
        public Criteria andDblPorcIncerGreaterThan(Double value) {
            addCriterion("ha_porc_incer >", value, "ha_porc_incer");
            return (Criteria) this;
        }
        
        public Criteria andDblPorcIncerGreaterThanOrEqualTo(Double value) {
            addCriterion("ha_porc_incer >=", value, "ha_porc_incer");
            return (Criteria) this;
        }
        
        public Criteria andDblPorcIncerLessThan(Double value) {
            addCriterion("ha_porc_incer <", value, "ha_porc_incer");
            return (Criteria) this;
        }
        
        public Criteria andDblPorcIncerLessThanOrEqualTo(Double value) {
            addCriterion("ha_porc_incer <=", value, "ha_porc_incer");
            return (Criteria) this;
        }
        
        public Criteria andDblPorcIncerIn(List<Double> values) {
            addCriterion("ha_porc_incer in", values, "ha_porc_incer");
            return (Criteria) this;
        }
        
        public Criteria andDblPorcIncerNotIn(List<Double> values) {
            addCriterion("ha_porc_incer not in", values, "ha_porc_incer");
            return (Criteria) this;
        }
        
        public Criteria andDblPorcIncerBetween(Double value1, Double value2) {
            addCriterion("ha_porc_incer between", value1, value2, "ha_porc_incer");
            return (Criteria) this;
        }
        
        public Criteria andDblPorcIncerNotBetween(Double value1, Double value2) {
            addCriterion("ha_porc_incer not between", value1, value2, "ha_porc_incer");
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
