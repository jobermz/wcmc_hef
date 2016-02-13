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
            addCriterion("cd_usuario =", value, "cd_usuario");
            return (Criteria) this;
        }

        public Criteria andSrlIdNotEqualTo(Integer value) {
            addCriterion("cd_usuario <>", value, "cd_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andSrlIdIsNull() {
            addCriterion("cd_usuario is null");
            return (Criteria) this;
        }

        public Criteria andSrlIdIsNotNull() {
            addCriterion("cd_usuario is not null");
            return (Criteria) this;
        }

        public Criteria andSrlIdGreaterThan(Integer value) {
            addCriterion("cd_usuario >", value, "cd_usuario");
            return (Criteria) this;
        }

        public Criteria andSrlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_usuario >=", value, "cd_usuario");
            return (Criteria) this;
        }

        public Criteria andSrlIdLessThan(Integer value) {
            addCriterion("cd_usuario <", value, "cd_usuario");
            return (Criteria) this;
        }

        public Criteria andSrlIdLessThanOrEqualTo(Integer value) {
            addCriterion("cd_usuario <=", value, "cd_usuario");
            return (Criteria) this;
        }

        public Criteria andSrlIdIn(List<Integer> values) {
            addCriterion("cd_usuario in", values, "cd_usuario");
            return (Criteria) this;
        }

        public Criteria andSrlIdNotIn(List<Integer> values) {
            addCriterion("cd_usuario not in", values, "cd_usuario");
            return (Criteria) this;
        }

        public Criteria andSrlIdBetween(Integer value1, Integer value2) {
            addCriterion("cd_usuario between", value1, value2, "cd_usuario");
            return (Criteria) this;
        }

        public Criteria andSrlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_usuario not between", value1, value2, "cd_usuario");
            return (Criteria) this;
        }
        
        
        public Criteria andIntPerfilEqualTo(Integer value) {
            addCriterion("cd_perfil =", value, "cd_perfil");
            return (Criteria) this;
        }

        public Criteria andIntPerfilNotEqualTo(Integer value) {
            addCriterion("cd_perfil <>", value, "cd_perfil");
            return (Criteria) this;
        }
        
        
        public Criteria andIntPerfilIsNull() {
            addCriterion("cd_perfil is null");
            return (Criteria) this;
        }

        public Criteria andIntPerfilIsNotNull() {
            addCriterion("cd_perfil is not null");
            return (Criteria) this;
        }

        public Criteria andIntPerfilGreaterThan(Integer value) {
            addCriterion("cd_perfil >", value, "cd_perfil");
            return (Criteria) this;
        }

        public Criteria andIntPerfilGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_perfil >=", value, "cd_perfil");
            return (Criteria) this;
        }

        public Criteria andIntPerfilLessThan(Integer value) {
            addCriterion("cd_perfil <", value, "cd_perfil");
            return (Criteria) this;
        }

        public Criteria andIntPerfilLessThanOrEqualTo(Integer value) {
            addCriterion("cd_perfil <=", value, "cd_perfil");
            return (Criteria) this;
        }

        public Criteria andIntPerfilIn(List<Integer> values) {
            addCriterion("cd_perfil in", values, "cd_perfil");
            return (Criteria) this;
        }

        public Criteria andIntPerfilNotIn(List<Integer> values) {
            addCriterion("cd_perfil not in", values, "cd_perfil");
            return (Criteria) this;
        }

        public Criteria andIntPerfilBetween(Integer value1, Integer value2) {
            addCriterion("cd_perfil between", value1, value2, "cd_perfil");
            return (Criteria) this;
        }

        public Criteria andIntPerfilNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_perfil not between", value1, value2, "cd_perfil");
            return (Criteria) this;
        }
        
        
        public Criteria andStrNombresLike(String value) {
            addCriterion("upper(nm_nombre) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nm_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombresNotLike(String value) {
            addCriterion("nm_nombre not like", "%" + CadenaUtil.getStr(value) + "%", "nm_nombre");
            return (Criteria) this;
        }
			
        public Criteria andStrNombresEqualTo(String value) {
            addCriterion("nm_nombre =", CadenaUtil.getStr(value), "nm_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombresNotEqualTo(String value) {
            addCriterion("nm_nombre <>", CadenaUtil.getStr(value), "nm_nombre");
            return (Criteria) this;
        }

        
        public Criteria andStrNombresIsNull() {
            addCriterion("nm_nombre is null");
            return (Criteria) this;
        }

        public Criteria andStrNombresIsNotNull() {
            addCriterion("nm_nombre is not null");
            return (Criteria) this;
        }

        public Criteria andStrNombresGreaterThan(String value) {
            addCriterion("nm_nombre >", value, "nm_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombresGreaterThanOrEqualTo(String value) {
            addCriterion("nm_nombre >=", value, "nm_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombresLessThan(String value) {
            addCriterion("nm_nombre <", value, "nm_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombresLessThanOrEqualTo(String value) {
            addCriterion("nm_nombre <=", value, "nm_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombresIn(List<String> values) {
            addCriterion("nm_nombre in", values, "nm_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombresNotIn(List<String> values) {
            addCriterion("nm_nombre not in", values, "nm_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombresBetween(String value1, String value2) {
            addCriterion("nm_nombre between", value1, value2, "nm_nombre");
            return (Criteria) this;
        }

        public Criteria andStrNombresNotBetween(String value1, String value2) {
            addCriterion("nm_nombre not between", value1, value2, "nm_nombre");
            return (Criteria) this;
        }
        
        
        public Criteria andStrApellidosLike(String value) {
            addCriterion("upper(nm_apellid) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nm_apellid");
            return (Criteria) this;
        }

        public Criteria andStrApellidosNotLike(String value) {
            addCriterion("nm_apellid not like", "%" + CadenaUtil.getStr(value) + "%", "nm_apellid");
            return (Criteria) this;
        }
			
        public Criteria andStrApellidosEqualTo(String value) {
            addCriterion("nm_apellid =", CadenaUtil.getStr(value), "nm_apellid");
            return (Criteria) this;
        }

        public Criteria andStrApellidosNotEqualTo(String value) {
            addCriterion("nm_apellid <>", CadenaUtil.getStr(value), "nm_apellid");
            return (Criteria) this;
        }

        
        public Criteria andStrApellidosIsNull() {
            addCriterion("nm_apellid is null");
            return (Criteria) this;
        }

        public Criteria andStrApellidosIsNotNull() {
            addCriterion("nm_apellid is not null");
            return (Criteria) this;
        }

        public Criteria andStrApellidosGreaterThan(String value) {
            addCriterion("nm_apellid >", value, "nm_apellid");
            return (Criteria) this;
        }

        public Criteria andStrApellidosGreaterThanOrEqualTo(String value) {
            addCriterion("nm_apellid >=", value, "nm_apellid");
            return (Criteria) this;
        }

        public Criteria andStrApellidosLessThan(String value) {
            addCriterion("nm_apellid <", value, "nm_apellid");
            return (Criteria) this;
        }

        public Criteria andStrApellidosLessThanOrEqualTo(String value) {
            addCriterion("nm_apellid <=", value, "nm_apellid");
            return (Criteria) this;
        }

        public Criteria andStrApellidosIn(List<String> values) {
            addCriterion("nm_apellid in", values, "nm_apellid");
            return (Criteria) this;
        }

        public Criteria andStrApellidosNotIn(List<String> values) {
            addCriterion("nm_apellid not in", values, "nm_apellid");
            return (Criteria) this;
        }

        public Criteria andStrApellidosBetween(String value1, String value2) {
            addCriterion("nm_apellid between", value1, value2, "nm_apellid");
            return (Criteria) this;
        }

        public Criteria andStrApellidosNotBetween(String value1, String value2) {
            addCriterion("nm_apellid not between", value1, value2, "nm_apellid");
            return (Criteria) this;
        }
        
        
        public Criteria andStrUsuarioLike(String value) {
            addCriterion("upper(nm_logueo) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nm_logueo");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioNotLike(String value) {
            addCriterion("nm_logueo not like", "%" + CadenaUtil.getStr(value) + "%", "nm_logueo");
            return (Criteria) this;
        }
			
        public Criteria andStrUsuarioEqualTo(String value) {
            addCriterion("nm_logueo =", CadenaUtil.getStr(value), "nm_logueo");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioNotEqualTo(String value) {
            addCriterion("nm_logueo <>", CadenaUtil.getStr(value), "nm_logueo");
            return (Criteria) this;
        }

        
        public Criteria andStrUsuarioIsNull() {
            addCriterion("nm_logueo is null");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioIsNotNull() {
            addCriterion("nm_logueo is not null");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioGreaterThan(String value) {
            addCriterion("nm_logueo >", value, "nm_logueo");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioGreaterThanOrEqualTo(String value) {
            addCriterion("nm_logueo >=", value, "nm_logueo");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioLessThan(String value) {
            addCriterion("nm_logueo <", value, "nm_logueo");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioLessThanOrEqualTo(String value) {
            addCriterion("nm_logueo <=", value, "nm_logueo");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioIn(List<String> values) {
            addCriterion("nm_logueo in", values, "nm_logueo");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioNotIn(List<String> values) {
            addCriterion("nm_logueo not in", values, "nm_logueo");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioBetween(String value1, String value2) {
            addCriterion("nm_logueo between", value1, value2, "nm_logueo");
            return (Criteria) this;
        }

        public Criteria andStrUsuarioNotBetween(String value1, String value2) {
            addCriterion("nm_logueo not between", value1, value2, "nm_logueo");
            return (Criteria) this;
        }
        
        
        public Criteria andStrClaveLike(String value) {
            addCriterion("upper(nm_clave) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nm_clave");
            return (Criteria) this;
        }

        public Criteria andStrClaveNotLike(String value) {
            addCriterion("nm_clave not like", "%" + CadenaUtil.getStr(value) + "%", "nm_clave");
            return (Criteria) this;
        }
			
        public Criteria andStrClaveEqualTo(String value) {
            addCriterion("nm_clave =", CadenaUtil.getStr(value), "nm_clave");
            return (Criteria) this;
        }

        public Criteria andStrClaveNotEqualTo(String value) {
            addCriterion("nm_clave <>", CadenaUtil.getStr(value), "nm_clave");
            return (Criteria) this;
        }

        
        public Criteria andStrClaveIsNull() {
            addCriterion("nm_clave is null");
            return (Criteria) this;
        }

        public Criteria andStrClaveIsNotNull() {
            addCriterion("nm_clave is not null");
            return (Criteria) this;
        }

        public Criteria andStrClaveGreaterThan(String value) {
            addCriterion("nm_clave >", value, "nm_clave");
            return (Criteria) this;
        }

        public Criteria andStrClaveGreaterThanOrEqualTo(String value) {
            addCriterion("nm_clave >=", value, "nm_clave");
            return (Criteria) this;
        }

        public Criteria andStrClaveLessThan(String value) {
            addCriterion("nm_clave <", value, "nm_clave");
            return (Criteria) this;
        }

        public Criteria andStrClaveLessThanOrEqualTo(String value) {
            addCriterion("nm_clave <=", value, "nm_clave");
            return (Criteria) this;
        }

        public Criteria andStrClaveIn(List<String> values) {
            addCriterion("nm_clave in", values, "nm_clave");
            return (Criteria) this;
        }

        public Criteria andStrClaveNotIn(List<String> values) {
            addCriterion("nm_clave not in", values, "nm_clave");
            return (Criteria) this;
        }

        public Criteria andStrClaveBetween(String value1, String value2) {
            addCriterion("nm_clave between", value1, value2, "nm_clave");
            return (Criteria) this;
        }

        public Criteria andStrClaveNotBetween(String value1, String value2) {
            addCriterion("nm_clave not between", value1, value2, "nm_clave");
            return (Criteria) this;
        }
        
        
        public Criteria andStrEsActivoLike(String value) {
            addCriterion("upper(nm_estado) like", "%" + CadenaUtil.getStr(value).toUpperCase() + "%", "nm_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoNotLike(String value) {
            addCriterion("nm_estado not like", "%" + CadenaUtil.getStr(value) + "%", "nm_estado");
            return (Criteria) this;
        }
			
        public Criteria andStrEsActivoEqualTo(String value) {
            addCriterion("nm_estado =", CadenaUtil.getStr(value), "nm_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoNotEqualTo(String value) {
            addCriterion("nm_estado <>", CadenaUtil.getStr(value), "nm_estado");
            return (Criteria) this;
        }

        
        public Criteria andStrEsActivoIsNull() {
            addCriterion("nm_estado is null");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoIsNotNull() {
            addCriterion("nm_estado is not null");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoGreaterThan(String value) {
            addCriterion("nm_estado >", value, "nm_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoGreaterThanOrEqualTo(String value) {
            addCriterion("nm_estado >=", value, "nm_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoLessThan(String value) {
            addCriterion("nm_estado <", value, "nm_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoLessThanOrEqualTo(String value) {
            addCriterion("nm_estado <=", value, "nm_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoIn(List<String> values) {
            addCriterion("nm_estado in", values, "nm_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoNotIn(List<String> values) {
            addCriterion("nm_estado not in", values, "nm_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoBetween(String value1, String value2) {
            addCriterion("nm_estado between", value1, value2, "nm_estado");
            return (Criteria) this;
        }

        public Criteria andStrEsActivoNotBetween(String value1, String value2) {
            addCriterion("nm_estado not between", value1, value2, "nm_estado");
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
