package wcmc.hef.dao.seguridad.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import wcmc.hef.general.util.CadenaUtil;

public class CuentaUsuarioParamDef {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CuentaUsuarioParamDef() {
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
        
                
        
        public Criteria andSrlIdEqualTo(Integer value) {
            addCriterion("id_usuario =", value, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andSrlIdNotEqualTo(Integer value) {
            addCriterion("id_usuario <>", value, "id_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdIsNull() {
            addCriterion("id_usuario is null");
            return (Criteria) this;
        }

        public Criteria andSrlIdIsNotNull() {
            addCriterion("id_usuario is not null");
            return (Criteria) this;
        }

        public Criteria andSrlIdGreaterThan(Integer value) {
            addCriterion("id_usuario >", value, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andSrlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_usuario >=", value, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andSrlIdLessThan(Integer value) {
            addCriterion("id_usuario <", value, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andSrlIdLessThanOrEqualTo(Integer value) {
            addCriterion("id_usuario <=", value, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andSrlIdIn(List<Integer> values) {
            addCriterion("id_usuario in", values, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andSrlIdNotIn(List<Integer> values) {
            addCriterion("id_usuario not in", values, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andSrlIdBetween(Integer value1, Integer value2) {
            addCriterion("id_usuario between", value1, value2, "id_usuario");
            return (Criteria) this;
        }

        public Criteria andSrlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id_usuario not between", value1, value2, "id_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andIntPerfilEqualTo(Integer value) {
            addCriterion("id_perfil =", value, "id_perfil");
            return (Criteria) this;
        }

        public Criteria andIntPerfilNotEqualTo(Integer value) {
            addCriterion("id_perfil <>", value, "id_perfil");
            return (Criteria) this;
        }
        
        
        public Criteria andIntPerfilIsNull() {
            addCriterion("id_perfil is null");
            return (Criteria) this;
        }

        public Criteria andIntPerfilIsNotNull() {
            addCriterion("id_perfil is not null");
            return (Criteria) this;
        }

        public Criteria andIntPerfilGreaterThan(Integer value) {
            addCriterion("id_perfil >", value, "id_perfil");
            return (Criteria) this;
        }

        public Criteria andIntPerfilGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_perfil >=", value, "id_perfil");
            return (Criteria) this;
        }

        public Criteria andIntPerfilLessThan(Integer value) {
            addCriterion("id_perfil <", value, "id_perfil");
            return (Criteria) this;
        }

        public Criteria andIntPerfilLessThanOrEqualTo(Integer value) {
            addCriterion("id_perfil <=", value, "id_perfil");
            return (Criteria) this;
        }

        public Criteria andIntPerfilIn(List<Integer> values) {
            addCriterion("id_perfil in", values, "id_perfil");
            return (Criteria) this;
        }

        public Criteria andIntPerfilNotIn(List<Integer> values) {
            addCriterion("id_perfil not in", values, "id_perfil");
            return (Criteria) this;
        }

        public Criteria andIntPerfilBetween(Integer value1, Integer value2) {
            addCriterion("id_perfil between", value1, value2, "id_perfil");
            return (Criteria) this;
        }

        public Criteria andIntPerfilNotBetween(Integer value1, Integer value2) {
            addCriterion("id_perfil not between", value1, value2, "id_perfil");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombresLike(String value) {
            addCriterion("upper(nom_usuario) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nom_usuario");
            return (Criteria) this;
        }

        public Criteria andStrNombresNotLike(String value) {
            addCriterion("nom_usuario not like", "%" + CadenaUtil.getStr(value) + "%", "nom_usuario");
            return (Criteria) this;
        }
			
        public Criteria andStrNombresEqualTo(String value) {
            addCriterion("nom_usuario =", CadenaUtil.getStr(value), "nom_usuario");
            return (Criteria) this;
        }

        public Criteria andStrNombresNotEqualTo(String value) {
            addCriterion("nom_usuario <>", CadenaUtil.getStr(value), "nom_usuario");
            return (Criteria) this;
        }

        
        public Criteria andStrNombresIsNull() {
            addCriterion("nom_usuario is null");
            return (Criteria) this;
        }

        public Criteria andStrNombresIsNotNull() {
            addCriterion("nom_usuario is not null");
            return (Criteria) this;
        }

        public Criteria andStrNombresGreaterThan(String value) {
            addCriterion("nom_usuario >", value, "nom_usuario");
            return (Criteria) this;
        }

        public Criteria andStrNombresGreaterThanOrEqualTo(String value) {
            addCriterion("nom_usuario >=", value, "nom_usuario");
            return (Criteria) this;
        }

        public Criteria andStrNombresLessThan(String value) {
            addCriterion("nom_usuario <", value, "nom_usuario");
            return (Criteria) this;
        }

        public Criteria andStrNombresLessThanOrEqualTo(String value) {
            addCriterion("nom_usuario <=", value, "nom_usuario");
            return (Criteria) this;
        }

        public Criteria andStrNombresIn(List<String> values) {
            addCriterion("nom_usuario in", values, "nom_usuario");
            return (Criteria) this;
        }

        public Criteria andStrNombresNotIn(List<String> values) {
            addCriterion("nom_usuario not in", values, "nom_usuario");
            return (Criteria) this;
        }

        public Criteria andStrNombresBetween(String value1, String value2) {
            addCriterion("nom_usuario between", value1, value2, "nom_usuario");
            return (Criteria) this;
        }

        public Criteria andStrNombresNotBetween(String value1, String value2) {
            addCriterion("nom_usuario not between", value1, value2, "nom_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andStrApellidosLike(String value) {
            addCriterion("upper(ape_usuario) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "ape_usuario");
            return (Criteria) this;
        }

        public Criteria andStrApellidosNotLike(String value) {
            addCriterion("ape_usuario not like", "%" + CadenaUtil.getStr(value) + "%", "ape_usuario");
            return (Criteria) this;
        }
			
        public Criteria andStrApellidosEqualTo(String value) {
            addCriterion("ape_usuario =", CadenaUtil.getStr(value), "ape_usuario");
            return (Criteria) this;
        }

        public Criteria andStrApellidosNotEqualTo(String value) {
            addCriterion("ape_usuario <>", CadenaUtil.getStr(value), "ape_usuario");
            return (Criteria) this;
        }

        
        public Criteria andStrApellidosIsNull() {
            addCriterion("ape_usuario is null");
            return (Criteria) this;
        }

        public Criteria andStrApellidosIsNotNull() {
            addCriterion("ape_usuario is not null");
            return (Criteria) this;
        }

        public Criteria andStrApellidosGreaterThan(String value) {
            addCriterion("ape_usuario >", value, "ape_usuario");
            return (Criteria) this;
        }

        public Criteria andStrApellidosGreaterThanOrEqualTo(String value) {
            addCriterion("ape_usuario >=", value, "ape_usuario");
            return (Criteria) this;
        }

        public Criteria andStrApellidosLessThan(String value) {
            addCriterion("ape_usuario <", value, "ape_usuario");
            return (Criteria) this;
        }

        public Criteria andStrApellidosLessThanOrEqualTo(String value) {
            addCriterion("ape_usuario <=", value, "ape_usuario");
            return (Criteria) this;
        }

        public Criteria andStrApellidosIn(List<String> values) {
            addCriterion("ape_usuario in", values, "ape_usuario");
            return (Criteria) this;
        }

        public Criteria andStrApellidosNotIn(List<String> values) {
            addCriterion("ape_usuario not in", values, "ape_usuario");
            return (Criteria) this;
        }

        public Criteria andStrApellidosBetween(String value1, String value2) {
            addCriterion("ape_usuario between", value1, value2, "ape_usuario");
            return (Criteria) this;
        }

        public Criteria andStrApellidosNotBetween(String value1, String value2) {
            addCriterion("ape_usuario not between", value1, value2, "ape_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andStrUsuarioLike(String value) {
            addCriterion("upper(cod_usuario) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "cod_usuario");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioNotLike(String value) {
            addCriterion("cod_usuario not like", "%" + CadenaUtil.getStr(value) + "%", "cod_usuario");
            return (Criteria) this;
        }
			
        public Criteria andStrUsuarioEqualTo(String value) {
            addCriterion("cod_usuario =", CadenaUtil.getStr(value), "cod_usuario");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioNotEqualTo(String value) {
            addCriterion("cod_usuario <>", CadenaUtil.getStr(value), "cod_usuario");
            return (Criteria) this;
        }

        
        public Criteria andStrUsuarioIsNull() {
            addCriterion("cod_usuario is null");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioIsNotNull() {
            addCriterion("cod_usuario is not null");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioGreaterThan(String value) {
            addCriterion("cod_usuario >", value, "cod_usuario");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioGreaterThanOrEqualTo(String value) {
            addCriterion("cod_usuario >=", value, "cod_usuario");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioLessThan(String value) {
            addCriterion("cod_usuario <", value, "cod_usuario");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioLessThanOrEqualTo(String value) {
            addCriterion("cod_usuario <=", value, "cod_usuario");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioIn(List<String> values) {
            addCriterion("cod_usuario in", values, "cod_usuario");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioNotIn(List<String> values) {
            addCriterion("cod_usuario not in", values, "cod_usuario");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioBetween(String value1, String value2) {
            addCriterion("cod_usuario between", value1, value2, "cod_usuario");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioNotBetween(String value1, String value2) {
            addCriterion("cod_usuario not between", value1, value2, "cod_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andStrClaveLike(String value) {
            addCriterion("upper(clv_usuario) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "clv_usuario");
            return (Criteria) this;
        }

        public Criteria andStrClaveNotLike(String value) {
            addCriterion("clv_usuario not like", "%" + CadenaUtil.getStr(value) + "%", "clv_usuario");
            return (Criteria) this;
        }
			
        public Criteria andStrClaveEqualTo(String value) {
            addCriterion("clv_usuario =", CadenaUtil.getStr(value), "clv_usuario");
            return (Criteria) this;
        }

        public Criteria andStrClaveNotEqualTo(String value) {
            addCriterion("clv_usuario <>", CadenaUtil.getStr(value), "clv_usuario");
            return (Criteria) this;
        }

        
        public Criteria andStrClaveIsNull() {
            addCriterion("clv_usuario is null");
            return (Criteria) this;
        }

        public Criteria andStrClaveIsNotNull() {
            addCriterion("clv_usuario is not null");
            return (Criteria) this;
        }

        public Criteria andStrClaveGreaterThan(String value) {
            addCriterion("clv_usuario >", value, "clv_usuario");
            return (Criteria) this;
        }

        public Criteria andStrClaveGreaterThanOrEqualTo(String value) {
            addCriterion("clv_usuario >=", value, "clv_usuario");
            return (Criteria) this;
        }

        public Criteria andStrClaveLessThan(String value) {
            addCriterion("clv_usuario <", value, "clv_usuario");
            return (Criteria) this;
        }

        public Criteria andStrClaveLessThanOrEqualTo(String value) {
            addCriterion("clv_usuario <=", value, "clv_usuario");
            return (Criteria) this;
        }

        public Criteria andStrClaveIn(List<String> values) {
            addCriterion("clv_usuario in", values, "clv_usuario");
            return (Criteria) this;
        }

        public Criteria andStrClaveNotIn(List<String> values) {
            addCriterion("clv_usuario not in", values, "clv_usuario");
            return (Criteria) this;
        }

        public Criteria andStrClaveBetween(String value1, String value2) {
            addCriterion("clv_usuario between", value1, value2, "clv_usuario");
            return (Criteria) this;
        }

        public Criteria andStrClaveNotBetween(String value1, String value2) {
            addCriterion("clv_usuario not between", value1, value2, "clv_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andStrEsActivoLike(String value) {
            addCriterion("upper(ind_estado) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "ind_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoNotLike(String value) {
            addCriterion("ind_estado not like", "%" + CadenaUtil.getStr(value) + "%", "ind_estado");
            return (Criteria) this;
        }
			
        public Criteria andStrEsActivoEqualTo(String value) {
            addCriterion("ind_estado =", CadenaUtil.getStr(value), "ind_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoNotEqualTo(String value) {
            addCriterion("ind_estado <>", CadenaUtil.getStr(value), "ind_estado");
            return (Criteria) this;
        }

        
        public Criteria andStrEsActivoIsNull() {
            addCriterion("ind_estado is null");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoIsNotNull() {
            addCriterion("ind_estado is not null");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoGreaterThan(String value) {
            addCriterion("ind_estado >", value, "ind_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoGreaterThanOrEqualTo(String value) {
            addCriterion("ind_estado >=", value, "ind_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoLessThan(String value) {
            addCriterion("ind_estado <", value, "ind_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoLessThanOrEqualTo(String value) {
            addCriterion("ind_estado <=", value, "ind_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoIn(List<String> values) {
            addCriterion("ind_estado in", values, "ind_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoNotIn(List<String> values) {
            addCriterion("ind_estado not in", values, "ind_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoBetween(String value1, String value2) {
            addCriterion("ind_estado between", value1, value2, "ind_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoNotBetween(String value1, String value2) {
            addCriterion("ind_estado not between", value1, value2, "ind_estado");
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
