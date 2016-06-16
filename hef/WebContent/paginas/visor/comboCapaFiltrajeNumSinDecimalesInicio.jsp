<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:select list="listCapaUmbral" id="idValorFiltroRangoNum" name="filtrar_rango_numerico" listKey="strValoresMinimoMaximoSinDecimales" listValue="strNombreComboSinDecimales" cssClass="form-control " multiple="true"  data-done-button="true"></s:select>
