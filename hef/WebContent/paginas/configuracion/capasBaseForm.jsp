<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="page-content">
	<div class="row">
		<div class="page-title" id="idDivEditarTituloCapasBase">
			<h3>
				Gestionar <span class="semi-bold">Capas base</span> 
			</h3>
		</div>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-male"></i> Hef </a></li>
			<li><a href="home.action"><i class="fa fa-star"></i> Principal </a></li>
			<li class="active"><i class="fa fa-edit"></i> Capas base</li>
		</ol>
	</div>
	
		<div class="row">
			<div class="grid simple">
				<div class="grid-body no-border">
				
				
					<form class="" method="POST" id="idFormEditarCapasBase" name="formEditarCapasBase" novalidate="novalidate">
						<div class="row">
							<div class="col-sm-12">
							
							
							
								<s:hidden name="edicion_capasBaseDto.srlIdCapasBase"></s:hidden>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampCapasBase_Nombre">
			                			<label for="edicion_capasBaseDto.strNombre" class="form-label">Nombre</label>
		                				<s:textfield name="edicion_capasBaseDto.strNombre" cssClass="form-control " tabindex="1" size="40" maxlength="null" />
									</div>
									<div class="col-sm-4 " id="idCampCapasBase_Comentarios">
			                			<label for="edicion_capasBaseDto.strComentarios" class="form-label">Comentarios</label>
		                				<s:textfield name="edicion_capasBaseDto.strComentarios" cssClass="form-control " tabindex="2" size="40" maxlength="500" />
									</div>
									<div class="col-sm-4 " id="idCampCapasBase_Url">
			                			<label for="edicion_capasBaseDto.strUrl" class="form-label">Url</label>
		                				<s:textfield name="edicion_capasBaseDto.strUrl" cssClass="form-control " tabindex="3" size="40" maxlength="100" />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampCapasBase_FechaRegistro">
										<label for="edicion_capasBaseDto.timFechaRegistro" class="form-label">Fecha registro:</label>
										<div>
											<s:textfield name="edicion_capasBaseDto.timFechaRegistroFecha" cssClass="form-control datepicker" tabindex="4" size="10" maxlength="10"/>&nbsp;&nbsp;<s:textfield name="edicion_capasBaseDto.timFechaRegistroHora" cssClass="form-control timepickerhere" tabindex="5" size="5" maxlength="5"/>
										</div>
									</div>
									<div class="col-sm-4 " id="idCampCapasBase_WmsUrl">
			                			<label for="edicion_capasBaseDto.strWmsUrl" class="form-label">Wms url</label>
		                				<s:textfield name="edicion_capasBaseDto.strWmsUrl" cssClass="form-control " tabindex="5" size="40" maxlength="500" />
									</div>
									<div class="col-sm-4 " id="idCampCapasBase_WmsCapas">
			                			<label for="edicion_capasBaseDto.strWmsCapas" class="form-label">Wms capas</label>
		                				<s:textfield name="edicion_capasBaseDto.strWmsCapas" cssClass="form-control " tabindex="6" size="40" maxlength="100" />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampCapasBase_WfsUrl">
			                			<label for="edicion_capasBaseDto.strWfsUrl" class="form-label">Wfs url</label>
		                				<s:textfield name="edicion_capasBaseDto.strWfsUrl" cssClass="form-control " tabindex="7" size="40" maxlength="500" />
									</div>
									<div class="col-sm-4 " id="idCampCapasBase_GrupoCapas">
										<label for="edicion_capasBaseDto.intGrupoCapas" class="form-label">Grupo:</label>
										<div>
											
											<s:select name="edicion_capasBaseDto.intGrupoCapas" cssClass="form-control " tabindex="8" list="#session.listGrupoCapas" headerKey="" headerValue="-Seleccionar-" listValue="strNombre" listKey="srlIdGrupoCapas"></s:select>
										</div>
									</div>
									</div>
							
							</div>
						</div>
						
						<div class="form-actions">
							<div class="row pull-right">
								<button class="btn btn-primary" type="button" id="idBtnGuardarCapasBase" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
								<button class="btn btn-primary" type="button" id="idBtnVolverCapasBase" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
							</div>
						</div>
						<br><br>
					</form>

					
				</div>
				
			</div>
		</div>
</div>

