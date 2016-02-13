<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="page-content">
	<div class="row">
		<div class="page-title" id="idDivEditarTituloGrupoCapas">
			<h3>
				Gestionar <span class="semi-bold">Grupo de capas base</span> 
			</h3>
		</div>
		<ol class="breadcrumb">
			<li><a href="home.action"><i class="glyphicon glyphicon-globe"></i> Mapa </a></li>
			<li><a href="grupoCapas.action"><i class="glyphicon glyphicon-th-list"></i> Listar grupo de capas base</a></li>
			<li class="active"><i class="glyphicon glyphicon-edit"></i> Edici&oacute;n de Grupo de capas base</li>
		</ol>
	</div>
	
		<div class="row">
			<div class="grid simple">
				<div class="grid-body no-border">
				
				
					<form class="" method="POST" id="idFormEditarGrupoCapas" name="formEditarGrupoCapas" novalidate="novalidate">
						<div class="row">
							<div class="col-sm-12">
								<s:hidden name="edicion_grupoCapasDto.srlIdGrupoCapas"></s:hidden>
								
								<div class="row form-row">
									<div class="col-sm-12 " id="idCampGrupoCapas_intIdGrupoCapasPadre">
			                			<label for="edicion_grupoCapasDto.intIdGrupoCapasPadre" class="form-label">Padre</label>
		                				<s:select name="edicion_grupoCapasDto.intIdGrupoCapasPadre" cssClass="form-control " tabindex="1" 
		                					list="#session.listGrupoCapasBase" listKey="srlIdGrupoCapas" listValue="strNombre" headerKey="" headerValue="-Seleccionar-">
		                				</s:select>
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-12 " id="idCampGrupoCapas_Nombre">
			                			<label for="edicion_grupoCapasDto.strNombre" class="form-label">Nombre</label>
		                				<s:textfield name="edicion_grupoCapasDto.strNombre" cssClass="form-control " tabindex="1" size="40" maxlength="100" />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampGrupoCapas_Orden">
			                			<label for="edicion_grupoCapasDto.intOrden" class="form-label">Orden</label>
		                				<s:textfield name="edicion_grupoCapasDto.intOrden" cssClass="form-control " tabindex="2" size="40" maxlength="5" />
									</div>
									</div>
							
							</div>
						</div>
						
						<div class="form-actions">
							<div class="row pull-right">
								<button class="btn btn-primary" type="button" id="idBtnGuardarGrupoCapas" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
								<button class="btn btn-primary" type="button" id="idBtnVolverGrupoCapas" tabindex="10"><i class="fa fa fa-power-off"></i> Regresar </button>
							</div>
						</div>
						<br><br>
					</form>

					
				</div>
				
			</div>
		</div>
</div>

