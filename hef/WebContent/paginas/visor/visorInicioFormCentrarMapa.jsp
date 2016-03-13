<%@page import="wcmc.hef.general.util.ConfiguracionProperties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Centrar mapa</h4>
			</div>
			
			<div class="modal-body">
				<div id="idDivCentrarDepartamento" style="display: none;">
					<s:select list="#session.listBasLimDepartamento" name="centrar_departamento" headerKey="" headerValue="-Seleccionar-" listKey="strIddpto" listValue="strNombdep" onchange="centrar_depa_upd_dpto();"></s:select>
				</div>
				<div id="idDivCentrarProvincia" style="display: none;">
					<div class="row">
						<div class="col-lg-5">Departamento:</div>
						<div class="col-lg-7"><s:select list="#session.listBasLimDepartamento" name="centrar_prov_departamento" headerKey="" headerValue="-Seleccionar-" listKey="strIddpto" listValue="strNombdep" onchange="centrar_prov_upd_dpto();"></s:select></div>
					</div>
					<div class="row">
						<div class="col-lg-5">Provincia:</div>
						<div class="col-lg-7" id="idDivComboProvinciaEnProvincia"><s:select list="{}" name="centrar_prov_provincia" headerKey="" headerValue="-Seleccionar-" listKey="strIdProvincia" listValue="strNombreProvincia" onchange="centrar_prov_upd_prov();"></s:select></div>
					</div>
				</div>
				<div id="idDivCentrarDistrito" style="display: none;">
					<div class="row">
						<div class="col-lg-5">Departamento:</div>
						<div class="col-lg-7"><s:select list="#session.listBasLimDepartamento" name="centrar_dist_departamento" headerKey="" headerValue="-Seleccionar-" listKey="strIddpto" listValue="strNombdep" onchange="centrar_dist_upd_dpto();"></s:select></div>
					</div>
					<div class="row">
						<div class="col-lg-5">Provincia:</div>
						<div class="col-lg-7" id="idDivComboDistritoEnProvincia"><s:select list="{}" name="centrar_dist_provincia" listKey="strIdprov" headerKey="" headerValue="-Seleccionar-" listValue="strNombprov" onchange="centrar_dist_upd_prov();"></s:select></div>
					</div>
					<div class="row">
						<div class="col-lg-5">Distrito:</div>
						<div class="col-lg-7" id="idDivComboDistritoEnDistrito"><s:select list="{}" name="centrar_dist_distrito" listKey="strIddist" headerKey="" headerValue="-Seleccionar-" listValue="strNombdist" onchange="centrar_dist_upd_dist();"></s:select></div>
					</div>
				</div>
			</div>
			
			<div class="modal-footer">
				<button type="button" class="btn btn-default btnVideosInteractivos" data-dismiss="modal">Cerrar</button>
			</div>
