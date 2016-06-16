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
							<div class="col-lg-10" id="idDivCapaUmbralNombreCapa">
								Nombre capa
							</div>
						</div>
						<div class="row">
							<br>
						</div>
						<%--
						<div class="row form-row">
							<div class="col-lg-2">
								<strong>M&iacute;nimo</strong>
							</div>
							<div class="col-lg-10" id="idDivRangoUmbranlMinimo">
								0
							</div>
						</div>
						<div class="row form-row">
							<div class="col-lg-2">
								<strong>M&aacute;ximo</strong>
							</div>
							<div class="col-lg-10" id="idDivRangoUmbranlMaximo">
								1000
							</div>
						</div>
						--%>
						<%--
						<div class="row form-row">
							<div class="col-lg-2">
								<strong>Criterio</strong>
							</div>
							<div class="col-lg-10">
								<select name="criterioFiltroUmbral" id="idCriterioFiltroUmbral" class="form-control ">
									<option value="preestablecido" selected="selected">Umbrales preestablecidos</option><!-- COMBO -->
<!-- 									<option value="mayor">Mayor a</option> -->
<!-- 									<option value="menor">Menor a</option> -->
<!-- 									<option value="rango">Por rango</option> -->
								</select>
							</div>
						</div>
						--%>
						<div class="row form-row">
							<div class="clsDivCriterioUmbralInputs" id="idDivPreestablecidos">
								<div class="col-lg-2">
									<strong>Clases</strong>
								</div>
								<div class="col-lg-8" id="idDivComboUmbrales">
									<!-- COMBO -->
								</div>
							</div>
						</div>
						<%--
						<div class="row form-row">
							<div class="col-lg-10">
								
								<div class="row form-row clsDivCriterioUmbralInputs" id="idDivValor">
									<div class="col-sm-2">
										<strong>Valor</strong>
									</div>
									<div class="col-sm-4">
										<input name="valorFiltroUmbral" id="idValorFiltroUmbral" size="10" class="form-control "/>
									</div>
								</div>
								
								<div class="row form-row clsDivCriterioUmbralInputs" id="idDivRango">
									<div class="col-sm-2">
										<strong>Desde</strong>
									</div>
									<div class="col-sm-4">
										<input name="valorFiltroUmbralDesde" id="idValorFiltroUmbralDesde" size="10" class="form-control "/>
									</div>
									<div class="col-sm-2">
										<strong>Hasta</strong>
									</div>
									<div class="col-sm-4">
										<input name="valorFiltroUmbralHasta" id="idValorFiltroUmbralHasta" size="10" class="form-control "/>
									</div>
								</div>
							</div>
						</div>
						--%>
					</div>
				</div>
			</div>
			
			<div class="modal-footer">
				<button type="button" class="btn btn-primary btnAplicarACLUmbral" data-dismiss="modal">Aplicar</button>
<!-- 				<button type="button" class="btn btn-default btnCerrarACLUmbral" data-dismiss="modal">Cerrar</button> -->
			</div>
			