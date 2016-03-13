<%@page import="wcmc.hef.general.util.ConfiguracionProperties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
			
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Filtrar Umbral</h4>
			</div>
			
			<div class="modal-body">
				<div class="row">
					<div class="col-lg-12">
						<div class="row">
							<div class="col-lg-2">
								<strong>Capa</strong>
							</div>
							<div class="col-lg-2">
								Nombre capa
							</div>
							<div class="col-lg-2">
								<strong>M&iacute;nimo</strong>
							</div>
							<div class="col-lg-2" id="idDivRangoUmbranlMinimo">
								0
							</div>
							<div class="col-lg-2">
								<strong>M&aacute;ximo</strong>
							</div>
							<div class="col-lg-2" id="idDivRangoUmbranlMaximo">
								1000
							</div>
						</div>
						<div class="row">
							<div class="col-lg-2">
								<strong>Criterio</strong>
							</div>
							<div class="col-lg-4">
								<select name="criterioFiltroUmbral" id="idCriterioFiltroUmbral">
									<option value="preestablecido">Umbrales preestablecidos</option><!-- COMBO -->
									<option value="mayor">Mayor a</option><!-- VALOR -->
									<option value="menor">Menor a</option><!-- VALOR -->
									<option value="igual">Igual a</option><!-- VALOR -->
									<option value="rango">Por rango</option><!-- VALORES -->
								</select>
							</div>
							<div class="col-lg-8">
								<div class="row clsDivCriterioUmbralInputs" id="idDivPreestablecidos">
									<div class="col-lg-2">
										<strong>Umbrales</strong>
									</div>
									<div class="col-lg-4" id="idDivComboUmbrales">
										<!-- COMBO -->
										<select name="valorFiltroUmbralPre" id="idValorFiltroUmbralPre"></select>
									</div>
								</div>
								<div class="row clsDivCriterioUmbralInputs" id="idDivValor">
									<div class="col-lg-2">
										<strong>Valor</strong>
									</div>
									<div class="col-lg-4">
										<input name="valorFiltroUmbral" id="idValorFiltroUmbral" size="10"/>
									</div>
								</div>
								<div class="row clsDivCriterioUmbralInputs" id="idDivRango">
									<div class="col-lg-2">
										<strong>Desde</strong>
									</div>
									<div class="col-lg-4">
										<input name="valorFiltroUmbralDesde" id="idValorFiltroUmbralDesde" size="10"/>
									</div>
									<div class="col-lg-2">
										<strong>Hasta</strong>
									</div>
									<div class="col-lg-4">
										<input name="valorFiltroUmbralHasta" id="idValorFiltroUmbralHasta" size="10"/>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
<!-- 				<div id="idDivACLUmbral" class="clsDivACLUmbral"> -->
<!-- 				</div> -->
			</div>
			
			<div class="modal-footer">
				<button type="button" class="btn btn-default btnAplicarACLUmbral" data-dismiss="modal">Aplicar</button>
				<button type="button" class="btn btn-default btnCerrarACLUmbral" data-dismiss="modal">Cerrar</button>
			</div>
			