<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="page-content" id="idDivPrincipalGrupoCapas">
	<div class="row">
		<div class="page-title">
			<h3>
				Gestionar <span class="semi-bold">Grupo de capas base</span> 
			</h3>
		</div>
		<ol class="breadcrumb">
			<li><a href="home.action"><i class="glyphicon glyphicon-globe"></i> Mapa </a></li>
			<li class="active"><i class="glyphicon glyphicon-th-list"></i> Listar grupo de capas base</li>
			
		</ol>
	</div>
	<div class="row">
		<div class="grid simple">
			
			<div class="grid-title">
				<div class="row form-row">
					<div class="col-sm-12">
						<div class="botonera pull-right" >
							<button class="btn btn-primary" type="button" id="idBtnNuevoGrupoCapas" tabindex="10"><i class="fa fa-file-o"></i> Nuevo </button>
							<button class="btn btn-primary" type="button" id="idBtnSalirGrupoCapas" tabindex="10"><i class="fa fa-power-off"></i> Regresar al mapa </button>
						</div>
					</div>
				</div>
			</div>
			
			<div class="grid-body no-border">
				<form class="" method="POST" id="idFormBuscarGrupoCapas" name="formBuscarGrupoCapas" novalidate="novalidate">
					
					<div class="row ">
						<div class="col-sm-12">
							<h4 class="semi-bold"><span class="light">Listado de Grupos de capas base</span><br>
							</h4>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_intIdGrupoCapasPadre" class="form-label">Grupo Padre</label>
		                			<s:select name="buscar_intIdGrupoCapasPadre" cssClass="form-control " tabindex="1" 
		                					list="#session.listGrupoCapasBase" listKey="srlIdGrupoCapas" listValue="strNombre" headerKey="" headerValue="-Solo grupos base-">
		                				</s:select>
								</div>
							</div>
							
						</div>
					</div>
				</form>
			</div>
			
			<div class="grid-body no-border">      
				<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered table-hover" id="tableDefaultGrupoCapas" >
					<thead>     
						<tr>
							<th width="null">Nombre</th>
							<th width="null">Orden</th>
							<th width="null">Grupo Capas Padre</th>
							<th style="width: 6%;">Detalle</th>
						</tr>
					</thead>
				</table>
				<br>
			</div>
			
		</div>
	</div>
</div>
<div id="idDivEditarGrupoCapas"></div>
<div id="dialog-info-eliminar" hidden="true">
    <br>  <p> <strong>&iquest;EST&Aacute; SEGURO QUE DESEA ELIMINAR EL REGISTRO&#63;</strong></p>
</div>

<s:form action="" name="form" id="form" namespace="/">
	<s:hidden name="buscar_seleccion_id" id="buscar_seleccion_id" />
</s:form>
