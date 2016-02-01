<%-- <%@page import="sernanp.pvirtual.califica.vo.CalificaVO"%> --%>
<%-- <%@page import="sernanp.pvirtual.incidencias.vo.IncidenciasVO"%> --%>
<%@page import="java.util.List"
%><%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"
%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
%><%@ taglib prefix="s" uri="/struts-tags"
%>

<div class="row center-block" id="idDivPortadaNavegacion" style="max-width: 730px;">
	<div class="col-sm-12">
		<div class="row">
			<div class="col-sm-12">
				<h1>Incidencias</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12">
				<a href="home.action"><strong>Inicio</strong></a>
					<s:if test="%{#session.USUARIO_ACTUAL.accesoRolAdministrador}">
						&nbsp;-&nbsp;<a
								href="gestionarIncidencias.action">Gestionar</a>
					</s:if>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12">&nbsp;</div>
		</div>
	</div>
</div>

<div class="row center-block" id="idDivPortada" style="max-width: 730px;">
	<div class="col-sm-12">
		<div class="row">
			<div class="col-sm-12">
				<s:form id="idFormIncidencias" name="formIncidencias" method="post">
					
					<span id="idMspErrorBuscar" class="error_en_campo"><s:actionerror/></span>
					<span id="idMspInfoBuscar" class="info_en_campo"><s:actionmessage/></span>
					
					<SPAN>
						<span id="idSpanTotalRegistros"></span> registros
						[ <span onclick="buscar_basico_anterior_fn();" style="text-decoration:underline;cursor:pointer;color:blue">Anterior</span> ]
						[ <span onclick="buscar_basico_siguiente_fn();" style="text-decoration:underline;cursor:pointer;color:blue">Siguiente</span> ]
						<span id="idSpanPaginaActual"></span> p&aacute;ginas
					</SPAN>
						<div id="idDivLista"></div>
					
					<br/>
					
					<div class="divbtn" align="center">
						<input type="button" name="3" id="idBtnNuevo" value="Nuevo" class="submit2"/>&nbsp;&nbsp;
						<input type="button" name="1" id="idBtnBuscar" value="Buscar" class="submit2"/>&nbsp;&nbsp;
						<input type="button" name="2" id="idBtnMostrarTodos" value="Mostrar todos" class="submit2"/>&nbsp;&nbsp;
					</div>
				</s:form>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12">&nbsp;</div>
		</div>
	</div>
</div>
<!--
<center>
	<table style="width: 730px;" id="idDivPortadaNavegacion">
		<tr>
			<td>
				<h1>Incidencias</h1>
			</td>
		</tr>
		<tr>
			<td>
				<a href="home.action"><strong>Inicio</strong></a>
					<s:if test="%{#session.USUARIO_ACTUAL.accesoRolAdministrador}">
						&nbsp;-&nbsp;<a
								href="gestionarIncidencias.action">Gestionar</a>
					</s:if>
			</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
	</table>
	
	<table style="width: 730px;" id="idDivPortada">
		<tr>
			<td>
				<s:form id="idFormIncidencias" name="formIncidencias" method="post">
					
					<span id="idMspErrorBuscar" class="error_en_campo"><s:actionerror/></span>
					<span id="idMspInfoBuscar" class="info_en_campo"><s:actionmessage/></span>
					
					<SPAN>
						<span id="idSpanTotalRegistros"></span> registros
						[ <span onclick="buscar_basico_anterior_fn();" style="text-decoration:underline;cursor:pointer;color:blue">Anterior</span> ]
						[ <span onclick="buscar_basico_siguiente_fn();" style="text-decoration:underline;cursor:pointer;color:blue">Siguiente</span> ]
						<span id="idSpanPaginaActual"></span> p&aacute;ginas
					</SPAN>
						<div id="idDivLista"></div>
					
					<br/>
					
					<div class="divbtn" align="center">
						<input type="button" name="3" id="idBtnNuevo" value="Nuevo" class="submit2"/>&nbsp;&nbsp;
						<input type="button" name="1" id="idBtnBuscar" value="Buscar" class="submit2"/>&nbsp;&nbsp;
						<input type="button" name="2" id="idBtnMostrarTodos" value="Mostrar todos" class="submit2"/>&nbsp;&nbsp;
					</div>
				</s:form>
			</td>
		</tr>
	</table>
</center>
-->

	<!-- MODAL -->
	<div id="idFormCriteriosBusqueda">
		<fieldset>
		<legend><strong>Criterios de busqueda</strong></legend>
		<s:form id="idFormBuscarIncidencias" name="formBuscarIncidencias" method="post">
			<input type="hidden" id="idPaginaActual" name="d-189301-p" value="1"></input>
			<div style="display: none;">
				<label>Tipo de conflicto:</label>
				<div><s:radio name="buscar_intAlertaConflictoSocialTipo" list="#session.listAlertaConflictoSocialTipo" listValue="strDescripcion" listKey="srlIdAlertaConflictoSocialTipo" /></div>
			</div>
			<div>
				<label>Titulo o Mensaje:</label>
				<div><s:textfield name="buscar_strTitulo" size="40" maxlength="240"/></div>
			</div>
			<div>
				<label>Anp:</label>
				<div><s:select name="buscar_intAnp" list="#session.listIncidenciasAnp" headerKey="" headerValue="-Todos-" listValue="strNombre" listKey="intId"></s:select></div>
			</div>
			<div>
				<label>Fecha:</label>
				<div><s:textfield name="buscar_timFecha" size="10" maxlength="10" cssClass="datepicker"/></div>
			</div>
			<br/>
			<center>
				<input type="button" value="Consultar" class="submit2" id="idBtnConsultar"/>
			</center>
		</s:form>
		</fieldset>
		<br/>
	</div>









<div id="idDivFormComentario">
	<s:form method="post" name="formEditarIncidenciasComentario" id="idFormEditarIncidencias">
		<s:hidden name="edicion_incidenciasVO.intIncidencias"/>
			<s:hidden name="edicion_incidenciasVO.intUsuario" value="%{#session.USUARIO_ACTUAL.srlIdUsuarios}"/>
			<s:hidden name="edicion_incidenciasVO.intId"/>
			<s:hidden name="edicion_incidenciasVO.intAnp"/>
			<s:hidden name="edicion_incidenciasVO.timFechaFecha"/>
			<s:hidden name="edicion_incidenciasVO.timFechaHora"/>
			<s:hidden name="edicion_incidenciasVO.intGravedad"/>
		<div>
			<fieldset>
				<div>
					<label>Mensaje:</label>
					<div><s:textarea name="edicion_incidenciasVO.strMensaje" cols="70" rows="3" /></div>
				</div>
			</fieldset>
			<br/>
<%-- 			<span id="idMspErrorEditar" class="error_en_campo"><s:actionerror/></span> --%>
<%-- 			<span id="idMspInfoEditar" class="info_en_campo"><s:actionmessage/></span> --%>
			<center>
				<input type="button" value="Enviar" class="submit2" id="idBtnEnviar"/>&nbsp;&nbsp;
				<input type="button" value="Cerrar" class="submit2" id="idBtnVolver"/>
			</center>
		</div>
	</s:form>
</div>

<table style="display:none;" id="idDivEditarIncidenciaNavegacion" class="center-block">
	<tr>
		<td>
			<h1 id="idTituloEditarIncidencia">Nuevo de registro de Incidencias</h1>
		</td>
	</tr>
	<tr>
		<td>
			<a href="home.action"><strong>Inicio</strong></a>
			&nbsp;-&nbsp;<a href="listarIncidencias.action"><strong>Incidencias</strong></a>
				<s:if test="%{#session.USUARIO_ACTUAL.accesoRolAdministrador}">
					&nbsp;-&nbsp;Registro
				</s:if>
		</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
	</tr>
</table>

<div id="idDivEditarIncidencia" style="display:none;" class="center-block">
	<div class="row">
		<div class="col-sm-12">
			<s:form method="post" name="formEditarIncidencias" id="idFormEditarIncidenciasNuevo">
				<div class="row">
					<div class="col-sm-12">
						<div id="idDivEditarForm"><s:include value="incidenciasForm.jsp" ></s:include></div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<span id="idMspErrorEditar" class="error_en_campo"><s:actionerror/></span>
						<span id="idMspInfoEditar" class="info_en_campo"><s:actionmessage/></span>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<center>
							<input type="button" value="Guardar" class="submit2" id="idBtnGuardarNuevo"/>&nbsp;&nbsp;
							<input type="button" value="Cerrar" class="submit2" id="idBtnVolverNuevo"/>&nbsp;&nbsp;
						</center>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">&nbsp;</div>
				</div>
			</s:form>
		</div>
	</div>
</div>




<div id="idFormChecks" style="display:none;">
	<s:form method="post" name="formEditarChecks" id="idFormEditarChecks">
		<input type="hidden" name="buscar_intIdCalificaRecurso" value="5"/>
		<input type="hidden" name="buscar_intIdRecurso"/>
		
		<input type="hidden" name="strOperacion"/>
		<input type="hidden" name="edicion_calificaVO.intIdRecurso"/>
		<input type="hidden" name="edicion_calificaVO.intIdCalificaRecurso" value="5"/>
		<input type="hidden" name="edicion_calificaVO.intUsuario" value="${sessionScope.USUARIO_ACTUAL.srlIdUsuarios}"/>
	</s:form>
</div>
