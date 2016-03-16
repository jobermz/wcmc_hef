<%@page import="wcmc.hef.business.core.configuracion.dto.CapaDto"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
CapaDto	capa=(CapaDto)request.getAttribute("edicion_capaDto");
session.setAttribute("edicion_capaDto_intGrupoCapas", capa.getIntGrupoCapas());
%>
<div class="page-content">
	<div class="row">
		<div class="page-title" id="idDivEditarTituloCapa">
			<h3>
				Gestionar <span class="semi-bold">Capas base</span> 
			</h3>
		</div>
		<ol class="breadcrumb">
			<li><a href="home.action"><i class="glyphicon glyphicon-globe"></i> Mapa </a></li>
			<li><a href="capa.action"><i class="glyphicon glyphicon-th-list"></i> Listar capas base </a></li>
			<li class="active"><i class="glyphicon glyphicon-edit"></i> Edici&oacute;n de capas base</li>
		</ol>
	</div>
	
		<div class="row">
			<div class="grid simple">
				<div class="grid-body no-border">
				
					<form class="" method="POST" id="idFormEditarCapa" name="formEditarCapa" novalidate="novalidate">
						<div class="row">
							<div class="col-sm-12">
								<s:hidden name="edicion_capaDto.srlIdCapa"></s:hidden>
								<div class="row form-row">
									<div class="col-sm-6 " id="idCampCapa_GrupoCapas">
										<label for="edicion_capaDto.intGrupoCapas" class="form-label">Grupo:</label>
										<div>
<%-- 											<s:select name="edicion_capaDto.intGrupoCapas" cssClass="form-control " tabindex="1" list="#session.listGrupoCapas" headerKey="" headerValue="-Seleccionar-" listValue="strNombreNiveles" listKey="srlIdGrupoCapas"></s:select> --%>
											
											<select name="edicion_capaDto.intGrupoCapas" tabindex="1" id="buscar_intGrupoCapas" class="form-control ">
											    <option value="">-Seleccionar-</option>
												<s:iterator value="#session.listGrupoCapasBase" var="grupoCapaBase">
													<optgroup label="${grupoCapaBase.strNombre}"></optgroup>
													<s:iterator value="#session.listGrupoCapasTodos" var="grupoCapaBaseTodos">
														<s:if test="%{#grupoCapaBase.srlIdGrupoCapas==#grupoCapaBaseTodos.intIdGrupoCapasPadre}">
															<s:if test="%{#grupoCapaBaseTodos.srlIdGrupoCapas==edicion_capaDto.intGrupoCapas}">
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
									<div class="col-sm-6 " id="idCampCapa_TipoCapa">
										<label for="edicion_capaDto.intTipoCapa" class="form-label">Tipo de capa:</label>
										<div>
											<s:select name="edicion_capaDto.intTipoCapa" cssClass="form-control " tabindex="2" list="#session.listTipoCapa" headerKey="" headerValue="-Seleccionar-" listValue="strNombre" listKey="srlIdTipoCapa"></s:select>
										</div>
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-8 " id="idCampCapa_Nombre">
			                			<label for="edicion_capaDto.strNombre" class="form-label">Nombre</label>
		                				<s:textfield name="edicion_capaDto.strNombre" cssClass="form-control " tabindex="3" size="40" maxlength="500" />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampCapa_Nombre">
			                			<label for="edicion_capaDto.intOrden" class="form-label">Orden</label>
		                				<s:textfield name="edicion_capaDto.intOrden" cssClass="form-control " tabindex="4" size="40" maxlength="10" />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-12 " id="idCampCapa_Comentarios">
										<label for="edicion_capaDto.strComentarios" class="form-label">Comentarios:</label>
										<div><s:textarea name="edicion_capaDto.strComentarios" cssClass="form-control " tabindex="5" cols="4" rows="3"  /></div>
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-12 " id="idCampCapa_strAutor">
										<label for="edicion_capaDto.strAutor" class="form-label">Autores:</label>
		                				<s:textfield name="edicion_capaDto.strAutor" cssClass="form-control " tabindex="4" size="40" maxlength="500" />
									</div>
								</div>
								
								<div class="row form-row">
									<div class="col-sm-12 " id="idCampCapa_Url">
			                			<label for="edicion_capaDto.strUrl" class="form-label">Url</label>
		                				<s:textfield name="edicion_capaDto.strUrl" cssClass="form-control " tabindex="6" size="40" maxlength="500" />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-8 " id="idCampCapa_WmsUrl">
			                			<label for="edicion_capaDto.strWmsUrl" class="form-label">Wms url</label>
		                				<s:textfield name="edicion_capaDto.strWmsUrl" cssClass="form-control " tabindex="7" size="40" maxlength="500" />
									</div>
									<div class="col-sm-4 " id="idCampCapa_WmsCapas">
			                			<label for="edicion_capaDto.strWmsCapas" class="form-label">Wms capas</label>
		                				<s:textfield name="edicion_capaDto.strWmsCapas" cssClass="form-control " tabindex="8" size="40" maxlength="100" />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-12 " id="idCampCapa_WfsUrl">
			                			<label for="edicion_capaDto.strWfsUrl" class="form-label">Wfs url</label>
		                				<s:textfield name="edicion_capaDto.strWfsUrl" cssClass="form-control " tabindex="9" size="40" maxlength="500" />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampCapa_strEsSelecApaBoolean">
			                			<label for="edicion_capaDto.strEsSelecApaBoolean" class="form-label">Seleccionar en Mapa?</label>
		                				<s:checkbox name="edicion_capaDto.strEsSelecApaBoolean" cssClass="form-control " tabindex="10" />
									</div>
									<div class="col-sm-4 " id="idCampCapa_strEsFiltroAclBoolean">
			                			<label for="edicion_capaDto.strEsFiltroAclBoolean" class="form-label">Filtrar desde combo en Ident. por Criterio?</label>
		                				<s:checkbox name="edicion_capaDto.strEsFiltroAclBoolean" cssClass="form-control " tabindex="10" />
									</div>
									<div class="col-sm-4 " id="idCampCapa_strEsCentrarMapaBoolean">
			                			<label for="edicion_capaDto.strEsCentrarMapaBoolean" class="form-label">Centrar desde combo en mapa?</label>
		                				<s:checkbox name="edicion_capaDto.strEsCentrarMapaBoolean" cssClass="form-control " tabindex="10" />
									</div>
								</div>
								<div class="row form-row"><div class="col-sm-12">&nbsp;</div></div>
								<div class="row form-row">
									<div class="col-sm-12 " id="idCampCapaUmbral_Umbrales">
										<div class="row form-row">
											<div class="col-sm-12 ">
												<label class="form-label">Umbrales:</label>
												<button class="btn btn-primary" type="button" id="idBtnNuevoCapaUmbral" tabindex="10"><i class="fa fa-file-o"></i> Nuevo </button>
											</div>
										</div>
										<div class="row form-row">
											<div class="col-sm-12 ">
												<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered table-hover" id="tableDefaultCapaUmbral" >
													<thead>     
														<tr>
															<th width="40%">Nombre</th>
															<th width="20%">Valor minimo</th>
															<th width="20%">Valor maximo</th>
															<th style="width: 6%;">Detalle</th>
														</tr>
													</thead>
												</table>
											</div>
										</div>
									</div>
								</div>
							
							</div>
						</div>
						
						<div class="form-actions">
							<div class="row pull-right">
								<button class="btn btn-primary" type="button" id="idBtnGuardarCapa" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
								<button class="btn btn-primary" type="button" id="idBtnVolverCapa" tabindex="10"><i class="fa fa fa-power-off"></i> Regresar </button>
							</div>
						</div>
						<br><br>
					</form>

<!-- 					<div id="idDivEditarCapaUmbral"></div> -->
					
					
				</div>
				
			</div>
		</div>
</div>

<div class="modal fade editar-umbral-modal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">
			
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Umbral</h4>
			</div>
			
			<div class="modal-body" id="idDivEditarCapaUmbral">
				
			</div>
			
<!-- 			<div class="modal-footer"> -->
<!-- 				<button type="button" class="btn btn-default btnVideosInteractivos" data-dismiss="modal">Cancelar</button> -->
<!-- 				<button type="button" class="btn btn-danger btnVideosInteractivos" id="idBtnEliminar">Aceptar</button> -->
<!-- 			</div> -->
			
		</div>
	</div>
</div>
<div id="dialog-info-eliminar" hidden="true">
    <br>  <p> <strong>&iquest;Est&aacute; seguro de que desea eliminar el umbra&#63;</strong></p>
</div>
<form name="form" id="form">
	<input type="hidden" id="buscar_seleccion_id" name="buscar_seleccion_id"/>
</form>
<form name="formBuscarCapaUmbral" id="idFormBuscarCapaUmbral">
	<input type="hidden" name="buscar_intIdCapa" value="${edicion_capaDto.srlIdCapa}"/>
</form>
