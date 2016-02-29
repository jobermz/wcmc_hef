package wcmc.hef.dao.capa.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class TemSoeconPrediosRuralesParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TemSoeconPrediosRuralesParamDef() {
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
        
        
        public Criteria andStrDepartamenLike(String value) {
            addCriterion("upper(de_departamen) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_departamen");
            return (Criteria) this;
        }

        public Criteria andStrDepartamenNotLike(String value) {
            addCriterion("de_departamen not like", "%" + CadenaUtil.getStr(value) + "%", "de_departamen");
            return (Criteria) this;
        }
			
        public Criteria andStrDepartamenEqualTo(String value) {
            addCriterion("de_departamen =", CadenaUtil.getStr(value), "de_departamen");
            return (Criteria) this;
        }

        public Criteria andStrDepartamenNotEqualTo(String value) {
            addCriterion("de_departamen <>", CadenaUtil.getStr(value), "de_departamen");
            return (Criteria) this;
        }

        
        public Criteria andStrDepartamenIsNull() {
            addCriterion("de_departamen is null");
            return (Criteria) this;
        }

        public Criteria andStrDepartamenIsNotNull() {
            addCriterion("de_departamen is not null");
            return (Criteria) this;
        }

        public Criteria andStrDepartamenGreaterThan(String value) {
            addCriterion("de_departamen >", value, "de_departamen");
            return (Criteria) this;
        }

        public Criteria andStrDepartamenGreaterThanOrEqualTo(String value) {
            addCriterion("de_departamen >=", value, "de_departamen");
            return (Criteria) this;
        }

        public Criteria andStrDepartamenLessThan(String value) {
            addCriterion("de_departamen <", value, "de_departamen");
            return (Criteria) this;
        }

        public Criteria andStrDepartamenLessThanOrEqualTo(String value) {
            addCriterion("de_departamen <=", value, "de_departamen");
            return (Criteria) this;
        }

        public Criteria andStrDepartamenIn(List<String> values) {
            addCriterion("de_departamen in", values, "de_departamen");
            return (Criteria) this;
        }

        public Criteria andStrDepartamenNotIn(List<String> values) {
            addCriterion("de_departamen not in", values, "de_departamen");
            return (Criteria) this;
        }

        public Criteria andStrDepartamenBetween(String value1, String value2) {
            addCriterion("de_departamen between", value1, value2, "de_departamen");
            return (Criteria) this;
        }

        public Criteria andStrDepartamenNotBetween(String value1, String value2) {
            addCriterion("de_departamen not between", value1, value2, "de_departamen");
            return (Criteria) this;
        }
        
        
        public Criteria andStrDatumLike(String value) {
            addCriterion("upper(de_datum) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_datum");
            return (Criteria) this;
        }

        public Criteria andStrDatumNotLike(String value) {
            addCriterion("de_datum not like", "%" + CadenaUtil.getStr(value) + "%", "de_datum");
            return (Criteria) this;
        }
			
        public Criteria andStrDatumEqualTo(String value) {
            addCriterion("de_datum =", CadenaUtil.getStr(value), "de_datum");
            return (Criteria) this;
        }

        public Criteria andStrDatumNotEqualTo(String value) {
            addCriterion("de_datum <>", CadenaUtil.getStr(value), "de_datum");
            return (Criteria) this;
        }

        
        public Criteria andStrDatumIsNull() {
            addCriterion("de_datum is null");
            return (Criteria) this;
        }

        public Criteria andStrDatumIsNotNull() {
            addCriterion("de_datum is not null");
            return (Criteria) this;
        }

        public Criteria andStrDatumGreaterThan(String value) {
            addCriterion("de_datum >", value, "de_datum");
            return (Criteria) this;
        }

        public Criteria andStrDatumGreaterThanOrEqualTo(String value) {
            addCriterion("de_datum >=", value, "de_datum");
            return (Criteria) this;
        }

        public Criteria andStrDatumLessThan(String value) {
            addCriterion("de_datum <", value, "de_datum");
            return (Criteria) this;
        }

        public Criteria andStrDatumLessThanOrEqualTo(String value) {
            addCriterion("de_datum <=", value, "de_datum");
            return (Criteria) this;
        }

        public Criteria andStrDatumIn(List<String> values) {
            addCriterion("de_datum in", values, "de_datum");
            return (Criteria) this;
        }

        public Criteria andStrDatumNotIn(List<String> values) {
            addCriterion("de_datum not in", values, "de_datum");
            return (Criteria) this;
        }

        public Criteria andStrDatumBetween(String value1, String value2) {
            addCriterion("de_datum between", value1, value2, "de_datum");
            return (Criteria) this;
        }

        public Criteria andStrDatumNotBetween(String value1, String value2) {
            addCriterion("de_datum not between", value1, value2, "de_datum");
            return (Criteria) this;
        }
        
        
        public Criteria andStrCodproyLike(String value) {
            addCriterion("upper(de_codproy) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "de_codproy");
            return (Criteria) this;
        }

        public Criteria andStrCodproyNotLike(String value) {
            addCriterion("de_codproy not like", "%" + CadenaUtil.getStr(value) + "%", "de_codproy");
            return (Criteria) this;
        }
			
        public Criteria andStrCodproyEqualTo(String value) {
            addCriterion("de_codproy =", CadenaUtil.getStr(value), "de_codproy");
            return (Criteria) this;
        }

        public Criteria andStrCodproyNotEqualTo(String value) {
            addCriterion("de_codproy <>", CadenaUtil.getStr(value), "de_codproy");
            return (Criteria) this;
        }

        
        public Criteria andStrCodproyIsNull() {
            addCriterion("de_codproy is null");
            return (Criteria) this;
        }

        public Criteria andStrCodproyIsNotNull() {
            addCriterion("de_codproy is not null");
            return (Criteria) this;
        }

        public Criteria andStrCodproyGreaterThan(String value) {
            addCriterion("de_codproy >", value, "de_codproy");
            return (Criteria) this;
        }

        public Criteria andStrCodproyGreaterThanOrEqualTo(String value) {
            addCriterion("de_codproy >=", value, "de_codproy");
            return (Criteria) this;
        }

        public Criteria andStrCodproyLessThan(String value) {
            addCriterion("de_codproy <", value, "de_codproy");
            return (Criteria) this;
        }

        public Criteria andStrCodproyLessThanOrEqualTo(String value) {
            addCriterion("de_codproy <=", value, "de_codproy");
            return (Criteria) this;
        }

        public Criteria andStrCodproyIn(List<String> values) {
            addCriterion("de_codproy in", values, "de_codproy");
            return (Criteria) this;
        }

        public Criteria andStrCodproyNotIn(List<String> values) {
            addCriterion("de_codproy not in", values, "de_codproy");
            return (Criteria) this;
        }

        public Criteria andStrCodproyBetween(String value1, String value2) {
            addCriterion("de_codproy between", value1, value2, "de_codproy");
            return (Criteria) this;
        }

        public Criteria andStrCodproyNotBetween(String value1, String value2) {
            addCriterion("de_codproy not between", value1, value2, "de_codproy");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCntCodproEqualTo(Integer value) {
            addCriterion("cd_cnt_codpro =", value, "cd_cnt_codpro");
            return (Criteria) this;
        }

        public Criteria andIntCntCodproNotEqualTo(Integer value) {
            addCriterion("cd_cnt_codpro <>", value, "cd_cnt_codpro");
            return (Criteria) this;
        }
        
        
        public Criteria andIntCntCodproIsNull() {
            addCriterion("cd_cnt_codpro is null");
            return (Criteria) this;
        }

        public Criteria andIntCntCodproIsNotNull() {
            addCriterion("cd_cnt_codpro is not null");
            return (Criteria) this;
        }

        public Criteria andIntCntCodproGreaterThan(Integer value) {
            addCriterion("cd_cnt_codpro >", value, "cd_cnt_codpro");
            return (Criteria) this;
        }

        public Criteria andIntCntCodproGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_cnt_codpro >=", value, "cd_cnt_codpro");
            return (Criteria) this;
        }

        public Criteria andIntCntCodproLessThan(Integer value) {
            addCriterion("cd_cnt_codpro <", value, "cd_cnt_codpro");
            return (Criteria) this;
        }

        public Criteria andIntCntCodproLessThanOrEqualTo(Integer value) {
            addCriterion("cd_cnt_codpro <=", value, "cd_cnt_codpro");
            return (Criteria) this;
        }

        public Criteria andIntCntCodproIn(List<Integer> values) {
            addCriterion("cd_cnt_codpro in", values, "cd_cnt_codpro");
            return (Criteria) this;
        }

        public Criteria andIntCntCodproNotIn(List<Integer> values) {
            addCriterion("cd_cnt_codpro not in", values, "cd_cnt_codpro");
            return (Criteria) this;
        }

        public Criteria andIntCntCodproBetween(Integer value1, Integer value2) {
            addCriterion("cd_cnt_codpro between", value1, value2, "cd_cnt_codpro");
            return (Criteria) this;
        }

        public Criteria andIntCntCodproNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_cnt_codpro not between", value1, value2, "cd_cnt_codpro");
            return (Criteria) this;
        }
        
        
        public Criteria andIntOrigFidEqualTo(Integer value) {
            addCriterion("cd_orig_fid =", value, "cd_orig_fid");
            return (Criteria) this;
        }

        public Criteria andIntOrigFidNotEqualTo(Integer value) {
            addCriterion("cd_orig_fid <>", value, "cd_orig_fid");
            return (Criteria) this;
        }
        
        
        public Criteria andIntOrigFidIsNull() {
            addCriterion("cd_orig_fid is null");
            return (Criteria) this;
        }

        public Criteria andIntOrigFidIsNotNull() {
            addCriterion("cd_orig_fid is not null");
            return (Criteria) this;
        }

        public Criteria andIntOrigFidGreaterThan(Integer value) {
            addCriterion("cd_orig_fid >", value, "cd_orig_fid");
            return (Criteria) this;
        }

        public Criteria andIntOrigFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_orig_fid >=", value, "cd_orig_fid");
            return (Criteria) this;
        }

        public Criteria andIntOrigFidLessThan(Integer value) {
            addCriterion("cd_orig_fid <", value, "cd_orig_fid");
            return (Criteria) this;
        }

        public Criteria andIntOrigFidLessThanOrEqualTo(Integer value) {
            addCriterion("cd_orig_fid <=", value, "cd_orig_fid");
            return (Criteria) this;
        }

        public Criteria andIntOrigFidIn(List<Integer> values) {
            addCriterion("cd_orig_fid in", values, "cd_orig_fid");
            return (Criteria) this;
        }

        public Criteria andIntOrigFidNotIn(List<Integer> values) {
            addCriterion("cd_orig_fid not in", values, "cd_orig_fid");
            return (Criteria) this;
        }

        public Criteria andIntOrigFidBetween(Integer value1, Integer value2) {
            addCriterion("cd_orig_fid between", value1, value2, "cd_orig_fid");
            return (Criteria) this;
        }

        public Criteria andIntOrigFidNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_orig_fid not between", value1, value2, "cd_orig_fid");
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
