<%@page import="wcmc.hef.general.util.ConfiguracionProperties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div class="row">
		<div class="col-sm-12">
			<div class="clsTituloCapaActiva">&nbsp;</div>
		</div>
	</div>
	<div class="row">
		<div class="col-lg-12 clsDivPanelLateralIzqPad" >
			<div class="clsDivPanelLateralIzq" style="height: 400px; overflow-y: scroll;">
				<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="false">
				<s:iterator value="#session.listGrupoCapas" var="grupoCapasBase">
				  <div class="panel panel-default clsPanelGrupoCapasMainCB">
				    <div class="panel-heading cursorPointer" role="tab" id="headingOne${grupoCapasBase.srlIdGrupoCapas}" onclick="mostrarAcordion('${grupoCapasBase.srlIdGrupoCapas}');">
				      <h4 class="panel-title clsNombreGrupoCapaSelector clsNombreGrupoCapa">
				      	${grupoCapasBase.strNombre} <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
				      	<%--
				        <a role="button" class="collapsed clsNombreGrupoCapa" data-toggle="collapse" data-parent="#accordion" href="#collapseOne${grupoCapasBase.srlIdGrupoCapas}" aria-expanded="false" aria-controls="collapseOne${grupoCapasBase.srlIdGrupoCapas}">
				          ${grupoCapasBase.strNombre} <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
				        </a>
				        --%>
				        <div class="pull-right clsDivNombreGrupoCapaIcono"><i class="glyphicon glyphicon-plus-sign"></i></div>
				      </h4>
				    </div>
				    <div id="collapseOne${grupoCapasBase.srlIdGrupoCapas}" class="panel-collapse collapse clsCollapseOne" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOne${grupoCapasBase.srlIdGrupoCapas}">
				      <div class="panel-body">					      	
						<div class="panel-group clsAccordionSub${grupoCapasBase.srlIdGrupoCapas}" id="accordionSub${grupoCapasBase.srlIdGrupoCapas}" role="tablist" aria-multiselectable="false">
							<div class="container-fluid">
						      	<div class="row text-center" style="font-weight: bold;">
							      	<div class="col-xs-8 text-left">
							      	</div>
							      	<div class="col-xs-2">
							      		Transparencia
							      	</div>
							      	<div class="col-xs-2">
							      		
							      	</div>
						      	</div>
						      	
						      	
						      	<s:iterator value="#session.listCapasBase" var="capasBase">
						      	<s:if test="%{#capasBase.intGrupoCapas.toString()==#grupoCapasBase.srlIdGrupoCapas.toString()}">
						      	<div class="row clsSeleccionCapasEspaciales">
							      	<div class="col-xs-8 seleccionarParaCapaActiva" id-capa="${capasBase.srlIdCapa}" nombre-capa="${capasBase.strNombre}">
							      		
							      		<input type="checkbox" id="idCapaBaseVisualizacion${capasBase.srlIdCapa}" class="capasBase" name="capasBase" value="${capasBase.srlIdCapa}" id-capa="${capasBase.srlIdCapa}" es-selec-mapa-acl="${capasBase.strEsSelecApaBoolean}" onclick="refrescarCapaActiva();marcarCapasVisualizacion();guardarCapasSeleccionadasCapasBase();"/>
										${capasBase.strNombre}
										
										<s:if test="%{#grupoCapasBase.srlIdGrupoCapas.toString()!=#CAPA_GRUPO_USUARIO}">
										<s:if test="%{#capasBase.intGrupoCapas.toString()==#grupoCapasBase.srlIdGrupoCapas.toString()&&(#capasBase.strWmsUrl==null||#capasBase.strWmsUrl=='')}">
											<i class="fa fa-warning"  title="La visualizacion no se encuentra disponible por el momento"></i>
										</s:if>
										</s:if>
							      	</div>
							      	<div class="col-xs-2 clsSliderColXs2">
						      			<div idcapa="${capasBase.srlIdCapa}" class="clsSlider"></div>
							      		
							      	</div>
			 				      	<div class="col-xs-2 clsOpcionesColXs3" style="vertical-align: middle;">
			 				      			<i class="fa fa-lg fa-filter cursorPointer clsDivDetFiltroACLTitle" id="idDivDetFiltroACLTitle${capasBase.srlIdCapa}" style="position: absolute;left:-3px; display: none;"></i>
			 				      			<button class="btn btn-link btn-xs clsPopoverMenuOpcion" style="position: absolute;" 
			 				      				type="button" id="idPopoverMenuOpcion${capasBase.srlIdCapa}" 
			 				      				onclick="mostrarPopover(${capasBase.srlIdCapa});" 
												data-toggle="popover" 
												data-container="body" 
												data-html="true" 
												data-placement="top"
												data-trigger="manual" 
												data-delay="{show:0,hide:0}"
												data-content='
												<div class="row">
												<div class="col-xs-6">
													<div class="pull-left">Opciones</div>
												</div>
												<div class="col-xs-6">
													<div class="pull-right">
														<button type="button" class="close" onclick="cerrarPopover(${capasBase.srlIdCapa})"><span aria-hidden="true">&times;</span></button>
													</div>
												</div>
												</div>
												<div class="row">
												<div class="col-xs-12">
												<div class="btn-group-vertical" role="group" >
													<s:if test="%{#capasBase.strEsFiltroAclBoolean}">
											      		<s:if test="%{#capasBase.intTipoCapa.toString()==#TIPO_CAPA_VECTORIAL}">
															<button type="button" class="btn btn-linkpopover" onclick="filtrarACL(${capasBase.srlIdCapa});"><i class="fa fa-lg fa-filter cursorPointer clsDivDetFiltroACL" id="idDivDetFiltroACL${capasBase.srlIdCapa}" srlIdCapa="${capasBase.srlIdCapa}"></i> Filtrar</button>
														</s:if>
											      		<s:if test="%{#capasBase.intTipoCapa.toString()==#TIPO_CAPA_UMBRAL}">		
															<button type="button" class="btn btn-linkpopover" onclick="filtrarUmbralACL(${capasBase.srlIdCapa});"><i class="fa fa-lg fa-filter cursorPointer clsDivDetFiltroACL" id="idDivDetFiltroACL${capasBase.srlIdCapa}" srlIdCapa="${capasBase.srlIdCapa}"></i> Filtrar</button>
														</s:if>
														<s:if test="%{#capasBase.intTipoCapa.toString()==#TIPO_CAPA_VECTORIAL_NUMERICA}">		
															<button type="button" class="btn btn-linkpopover" onclick="filtrajeNumericoACL(${capasBase.srlIdCapa});"><i class="fa fa-lg fa-filter cursorPointer clsDivDetFiltroACL" id="idDivDetFiltroACL${capasBase.srlIdCapa}" srlIdCapa="${capasBase.srlIdCapa}"></i> Filtrar</button>
														</s:if>
													</s:if>
											      	<s:if test="%{#capasBase.strEsCentrarMapaBoolean}">
														<button type="button" class="btn btn-linkpopover" onclick="centrarMapa(${capasBase.srlIdCapa});"><i title="Centrar en el mapa" class="fa fa-lg fa-bullseye cursorPointer"></i> Centrar Mapa </button>
													</s:if>
													<s:if test="%{#grupoCapasBase.srlIdGrupoCapas.toString()==#CAPA_GRUPO_USUARIO}">
								      					<button type="button" class="btn btn-linkpopover" onclick="descargarMapaUsuario(${capasBase.srlIdCapa});"><i title="Descargar la capa" class="fa fa-lg fa-download cursorPointer" ></i> Descargar </button>
								      				</s:if>
								      				<s:else>
								      				<s:if test="%{#capasBase.strWfsUrl!=null&&#capasBase.strWfsUrl!=null}">
								      					<button type="button" class="btn btn-linkpopover" onclick="descargarMapa(${capasBase.srlIdCapa});"><i title="Descargar la capa" class="fa fa-lg fa-download cursorPointer"></i> Descargar </button>
								      				</s:if>
								      				</s:else>
														<button type="button" class="btn btn-linkpopover" onclick="mostrarInfo(${capasBase.srlIdCapa});"><i title="Informaci&oacute;n de la capa" class="fa fa-lg fa-info-circle cursorPointer"></i> Información</button>
												</div>
												</div>
												</div>
												' >
			 								Opciones
			 								</button>
			 								<%--
			 								<button class="btn btn-link btn-xs dropdown-toggle" type="button" id="dropdownMenuOpcion" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
			 								Opciones
			 								</button>
											<ul class="dropdown-menu pull-right" aria-labelledby="dropdownMenuOpcion">
												<s:if test="%{#capasBase.strEsFiltroAclBoolean}">
										      		<s:if test="%{#capasBase.intTipoCapa.toString()==#TIPO_CAPA_VECTORIAL}">
														<li><a href="#" onclick="filtrarACL('${capasBase.srlIdCapa}');"><i class="fa fa-lg fa-filter cursorPointer clsDivDetFiltroACL" id="idDivDetFiltroACL${capasBase.srlIdCapa}" srlIdCapa="${capasBase.srlIdCapa}"></i> Filtrar</a></li>
													</s:if>
										      		<s:if test="%{#capasBase.intTipoCapa.toString()==#TIPO_CAPA_UMBRAL}">		
														<li><a href="#" onclick="filtrarUmbralACL('${capasBase.srlIdCapa}');"><i class="fa fa-lg fa-filter cursorPointer clsDivDetFiltroACL" id="idDivDetFiltroACL${capasBase.srlIdCapa}" srlIdCapa="${capasBase.srlIdCapa}"></i> Filtrar</a></li>
													</s:if>
												</s:if>
										      	<s:if test="%{#capasBase.strEsCentrarMapaBoolean}">
													<li><a href="#" onclick="centrarMapa('${capasBase.srlIdCapa}');"><i title="Centrar en el mapa" class="fa fa-lg fa-bullseye cursorPointer"></i> Centrar Mapa </a></li>
												</s:if>
												<s:if test="%{#grupoCapasBase.srlIdGrupoCapas.toString()==#CAPA_GRUPO_USUARIO}">
							      					<li><a href="#"  onclick="descargarMapaUsuario('${capasBase.srlIdCapa}');"><i title="Descargar la capa" class="fa fa-lg fa-download cursorPointer" ></i> Descargar </a></li>
							      				</s:if>
							      				<s:else>
							      				<s:if test="%{#capasBase.strWfsUrl!=null&&#capasBase.strWfsUrl!=''}">
							      					<li><a href="#" onclick="descargarMapa('${capasBase.srlIdCapa}');"><i title="Descargar la capa" class="fa fa-lg fa-download cursorPointer"></i> Descargar </a></li>
							      				</s:if>
							      				</s:else>
													<li><a href="#" onclick="mostrarInfo('${capasBase.srlIdCapa}');"><i title="Informaci&oacute;n de la capa" class="fa fa-lg fa-info-circle cursorPointer"></i> Información</a></li>
											</ul>
											--%>
									</div>
						      	</div>
						      	</s:if>
						      	</s:iterator>
							</div>
						</div>
				      	
				      </div>
				    </div>
				  </div>
				</s:iterator>
				</div>
			</div>
		</div>
	</div>
	<div class="row" >
		<div class="col-lg-12">
			<div class="pull-right">
<!-- 				<button type="button" class="btn btn-default" onclick="actualizarTamanioGrafica();">ActualizarGraf</button> -->
				<button type="button" class="btn btn-default clsLimpiarACL"><span class="glyphicon glyphicon-repeat"></span>
				Reiniciar Consulta</button>
				<s:if test="%{#session.USUARIO_ACTUAL != null && #session.USUARIO_ACTUAL.intPerfil.toString()!='1'}">
						<button type="button" class="btn btn-default cursorPointer upload-capas"><span class="glyphicon glyphicon-save"></span>
						Cargar Capa</button>
				</s:if>
				<button type="button" class="btn btn-default btnProcesarIdentAreaCriteriosLogicos" style="display: none;"><span class="glyphicon glyphicon-refresh"></span>
				Procesar</button>
<!-- 				<button type="button" class="btn btn-default " id="idButtonLastRep" onclick="return mostrarReporte();" style="display: none;">Last rep.</button> -->
<!-- 			</div> -->
<!-- 			<div class="pull-right"> -->
<!-- 				<div class="dropup" style="display: inline-block;"> -->
<!-- 					<button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true"> -->
<%-- 					<span class="glyphicon glyphicon-wrench"></span> --%>
<!-- 					Analizar Área -->
<!-- 					</button> -->
<!-- 					<ul class="dropdown-menu pull-right" aria-labelledby="dropdownMenu1"> -->
<!-- 						<li><a href="#" onclick="dibujarRectangulo()"><i class="fa fa-edit"></i> Trazar rectángulo</a></li> -->
<!-- 						<li><a href="#" onclick="dibujarPoligono()"><i class="fa fa-lastfm"></i> Trazar polígono</a></li> -->
<!-- 						<li><a href="#" onclick="seleccionarAreaDesdeShapefile()"><i class="fa fa-upload"></i> Cargar polígono Shp</a></li> -->
<!-- 						<li><a href="#" onclick="seleccionarAreaDesdeMapa()"><i class="fa fa-bars"></i> Seleccionar en el mapa</a></li> -->
<!-- 					</ul> -->
<!-- 				</div> -->
				
				<div class=" pull-right">
					<button class="btn btn-default clsPopoverMenuAnalizarArea" type="button" id="idPopoverMenuAnalizarArea" 
				  		onclick="mostrarPopoverAnalizarArea();" 
						data-toggle="popover" 
						data-html="true" 
						data-container=".seleccionar-capas-modal"
						data-placement="auto"
						data-trigger="manual" 
						data-delay="{show:0,hide:0}"
						data-content='
						<div class="row">
						<div class="col-xs-8">
							<div class="pull-left">Analizar Área</div>
						</div>
						<div class="col-xs-4">
							<div class="pull-right">
								<button type="button" class="close" onclick="cerrarPopoverAnalizarArea()"><span aria-hidden="true">&times;</span></button>
							</div>
						</div>
						</div>
						<div class="row">
						<div class="col-xs-12">
						<div class="btn-group-vertical" role="group" >
							<button type="button" class="btn btn-linkpopover" onclick="dibujarRectangulo()"><i class="fa fa-edit"></i> Trazar rectángulo</button>
							<button type="button" class="btn btn-linkpopover" onclick="dibujarPoligono()"><i class="fa fa-lastfm"></i> Trazar polígono</button>
							<button type="button" class="btn btn-linkpopover" onclick="seleccionarAreaDesdeShapefile()"><i class="fa fa-upload"></i> Cargar Polígono Shp</button>
							<button type="button" class="btn btn-linkpopover" onclick="seleccionarAreaDesdeMapa()"><i class="fa fa-bars"></i> Seleccionar en el mapa</button>
						</div>
						</div>
						</div>
						' >
						<span class="glyphicon glyphicon-wrench"></span> Analizar Área
					</button>
					</div>				
			</div>
		</div>
	</div>
<!-- 	<div class="row"><div class="col-lg-12">&nbsp;</div></div> -->
<!-- 	<div class="row"><div class="col-lg-12">&nbsp;</div></div> -->
<!-- 	<div class="row"><div class="col-lg-12">&nbsp;</div></div> -->
<!-- 	<div class="row"><div class="col-lg-12">&nbsp;</div></div> -->
	
