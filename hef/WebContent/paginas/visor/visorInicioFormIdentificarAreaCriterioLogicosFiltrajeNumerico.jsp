<%@page import="wcmc.hef.general.util.ConfiguracionProperties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
			
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Filtrar</h4>
			</div>
			
			<div class="modal-body">
				<div class="row">
					<div class="col-lg-12">
						<div class="row form-row">
							<div class="col-lg-2">
								<strong>Capa</strong>
							</div>
							<div class="col-lg-10" id="idDivCapaFiltrajeNombreCapa">
								Nombre capa
							</div>
						</div>
						<%-- 
						<div class="row form-row">
							<div class="col-lg-2">
								<strong>M&iacute;nimo</strong>
							</div>
							<div class="col-lg-10" id="idDivRangoFiltrajeMinimo">
								0
							</div>
						</div>
						<div class="row form-row">
							<div class="col-lg-2">
								<strong>M&aacute;ximo</strong>
							</div>
							<div class="col-lg-10" id="idDivRangoFiltrajeMaximo">
								1000
							</div>
						</div>
						--%>
						<div class="row form-row" id="idDivFiltrajeCriterio">
							<div class="col-lg-2">
								<strong>Criterio</strong>
							</div>
							<div class="col-lg-10">
								<select name="criterioFiltroNumerico" id="idCriterioFiltroNumerico" class="form-control ">
									<option value="mayor">Mayor a</option>
									<option value="menor">Menor a</option>
									<option value="rango">Por rango</option>
								</select>
							</div>
						</div>
						
						<div class="row form-row clsDivCriterioFiltrajeNumerico" id="idDivRowComboFiltrajeNumerico">
							<div class="col-lg-2">
								<strong>Clases</strong>
							</div>
							<div class="col-lg-10" id="idDivComboFiltrajeNumerico">
							</div>
						</div>
						
						<div class="row form-row clsDivCriterioFiltrajeEcozonas" id="idDivFiltrajeEcozonas">
							<div class="col-lg-2">
								<strong>Criterio</strong>
							</div>
							<div class="col-lg-10">
								<select name="criterioFiltroEcozonas" id="idCriterioFiltroEcozonas" class="form-control ">
									<option value="<s:property value="#request.TEMCARBONOECOZONAS_01"></s:property>"><s:property value="#request.TEMCARBONOECOZONAS_01"></s:property></option>
									<option value="<s:property value="#request.TEMCARBONOECOZONAS_02"></s:property>"><s:property value="#request.TEMCARBONOECOZONAS_02"></s:property></option>
									<option value="<s:property value="#request.TEMCARBONOECOZONAS_03"></s:property>"><s:property value="#request.TEMCARBONOECOZONAS_03"></s:property></option>
									<option value="<s:property value="#request.TEMCARBONOECOZONAS_04"></s:property>"><s:property value="#request.TEMCARBONOECOZONAS_04"></s:property></option>
									<option value="<s:property value="#request.TEMCARBONOECOZONAS_05"></s:property>"><s:property value="#request.TEMCARBONOECOZONAS_05"></s:property></option>
									<option value="<s:property value="#request.TEMCARBONOECOZONAS_06"></s:property>"><s:property value="#request.TEMCARBONOECOZONAS_06"></s:property></option>
								</select>
							</div>
						</div>
						
						<div class="row form-row" id="idDivFiltrajeRangos">
							<div class="col-lg-12">
								
								<div class="row form-row clsDivCriterioFiltrajeInputs" id="idDivFiltrajeNumericoValor">
									<div class="col-sm-2">
										<strong>Valor</strong>
									</div>
									<div class="col-sm-4">
										<input name="valorFiltraje" id="idValorFiltraje" size="10" class="form-control " onkeypress="return solonumeros(event);"/>
									</div>
								</div>
								<div class="row form-row clsDivCriterioFiltrajeInputs" id="idDivFiltrajeNumericoRango">
									<div class="col-sm-2">
										<strong>Desde</strong>
									</div>
									<div class="col-sm-4">
										<input name="valorFiltrajeDesde" id="idValorFiltrajeDesde" size="10" class="form-control " onkeypress="return solonumeros(event);"/>
									</div>
									<div class="col-sm-2">
										<strong>Hasta</strong>
									</div>
									<div class="col-sm-4">
										<input name="valorFiltrajeHasta" id="idValorFiltrajeHasta" size="10" class="form-control " onkeypress="return solonumeros(event);"/>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			
			<div class="modal-footer">
				<button type="button" class="btn btn-primary btnAplicarACLFiltraje" data-dismiss="modal">Aplicar</button>
			</div>
			