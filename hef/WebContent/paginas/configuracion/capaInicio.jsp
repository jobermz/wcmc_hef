<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
Integer idGrupoCapas	= (Integer)session.getAttribute("edicion_capaDto_intGrupoCapas");
if(idGrupoCapas != null) {
	request.setAttribute("edicion_capaDto_intGrupoCapas", idGrupoCapas);
}
%>
<div class="page-content" id="idDivPrincipalCapa">
	<div class="row">
		<div class="page-title">
			<h3>
				Gestionar <span class="semi-bold">Capas base</span> 
			</h3>
		</div>
		<ol class="breadcrumb">
			<li><a href="home.action"><i class="glyphicon glyphicon-globe"></i> Mapa </a></li>
			<li class="active"><i class="glyphicon glyphicon-th-list"></i> Listar capas base </li>
		</ol>
	</div>
	<div class="row">
		<div class="grid simple">
			
			<div class="grid-title">
				<div class="row form-row">
					<div class="col-sm-12">
						<div class="botonera pull-right">
							<button class="btn btn-primary" type="button" id="idBtnNuevoCapa" tabindex="10"><i class="fa fa-file-o"></i> Nuevo </button>
							<button class="btn btn-primary" type="button" id="idBtnSalirCapa" tabindex="10"><i class="fa fa-power-off"></i> Regresar al mapa </button>
						</div>
					</div>
				</div>
			</div>
			
			<div class="grid-body no-border">
				<form class="" method="POST" id="idFormBuscarCapa" name="formBuscarCapa" novalidate="novalidate">
					
					<div class="row ">
						<div class="col-sm-12">
							<h4 class="semi-bold"><span class="light">Listado de Capas base</span><br>
							</h4>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strNombre" class="form-label">Grupo</label>
<%-- 									<s:select name="buscar_intGrupoCapas" cssClass="form-control " tabindex="1" list="#session.listGrupoCapas" headerKey="" headerValue="-Todos-" listValue="strNombreNiveles" listKey="srlIdGrupoCapas"></s:select> --%>
									<select name="buscar_intGrupoCapas" tabindex="1" id="buscar_intGrupoCapas" class="form-control ">
									    <option value="">-Todos-</option>
										<s:iterator value="#session.listGrupoCapasBase" var="grupoCapaBase">
											<optgroup label="${grupoCapaBase.strNombre}"></optgroup>
											<s:iterator value="#session.listGrupoCapasTodos" var="grupoCapaBaseTodos">
												<s:if test="%{#grupoCapaBase.srlIdGrupoCapas==#grupoCapaBaseTodos.intIdGrupoCapasPadre}">
													<s:if test="%{#grupoCapaBaseTodos.srlIdGrupoCapas==#attr.edicion_capaDto_intGrupoCapas}">
														<option value="${grupoCapaBaseTodos.srlIdGrupoCapas}" selected="selected">${grupoCapaBaseTodos.strNombre}</option>
													</s:if>
													<s:else>
														<option value="${grupoCapaBaseTodos.srlIdGrupoCapas}">${grupoCapaBaseTodos.strNombre}</option>
													</s:else>
												</s:if>
												
												
											</s:iterator>
										</s:iterator>
									</select>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strNombre" class="form-label">Nombre</label>
		                			<s:textfield name="buscar_strNombre" cssClass="form-control" tabindex="1" size="40" maxlength="null"/>
								</div>
							</div>
						</div>
					</div>
					
					<div class="row form-row">
						<div class="col-sm-12">
							<div class="botonera pull-right">
								<button class="btn btn-primary" type="button" id="idBtnConsultarCapa" tabindex="10"><i class="fa fa-filter"></i> Buscar </button>
							</div>
						</div>
					</div>
					
				</form>
			</div>
			
			<div class="grid-body no-border">      
				<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered table-hover" id="tableDefaultCapa" >
					<thead>     
						<tr>
							<th width="20%">Grupo</th>
							<th width="20%">Tipo de capa</th>
							<th width="50%">Nombre</th>
							<th style="width: 6%;">Detalle</th>
						</tr>
					</thead>
				</table>
				<br>
			</div>
			
		</div>
	</div>
</div>
<div id="idDivEditarCapa"></div>
<div id="dialog-info-eliminar" hidden="true">
    <br>  <p> <strong>&iquest;EST&Aacute; SEGURO QUE DESEA ELIMINAR EL REGISTRO&#63;</strong></p>
</div>

<s:form action="" name="form" id="form" namespace="/">
	<s:hidden name="buscar_seleccion_id" id="buscar_seleccion_id" />
</s:form>
