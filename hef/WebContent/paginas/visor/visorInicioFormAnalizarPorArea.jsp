<%@page import="wcmc.hef.general.util.ConfiguracionProperties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

		
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Analizar por &aacute;rea</h4>
			</div>
			<div class="modal-body">
				<div style="height: 350px;overflow-y: auto;">
				
				
					<div class="panel-group" id="accordion_apa" role="tablist" aria-multiselectable="false">
					<s:iterator value="#session.listGrupoCapas" var="grupoCapasBase">
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingOneAPA${grupoCapasBase.srlIdGrupoCapas}">
					      <h4 class="panel-title">
					        <a role="button" class="collapsed" data-toggle="collapse" data-parent="#accordion_apa" href="#collapseOneAPA${grupoCapasBase.srlIdGrupoCapas}" aria-expanded="false" aria-controls="collapseOneAPA${grupoCapasBase.srlIdGrupoCapas}">
					          ${grupoCapasBase.strNombre}
					        </a>
					      </h4>
					    </div>
					    <div id="collapseOneAPA${grupoCapasBase.srlIdGrupoCapas}" class="panel-collapse collapse" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneAPA${grupoCapasBase.srlIdGrupoCapas}">
					      <div class="panel-body">
					      
					      	
							<div class="panel-group" id="accordionSubAPA${grupoCapasBase.srlIdGrupoCapas}" role="tablist" aria-multiselectable="true">
							  
							  <s:iterator value="#grupoCapasBase.listGrupoCapas" var="grupoCapas">
							  <div class="panel panel-default">
							    <div class="panel-heading" role="tab" id="headingOneSubAPA${grupoCapas.srlIdGrupoCapas}">
							      <h4 class="panel-title">
							        <a role="button" class="collapsed" data-toggle="collapse" data-parent="#accordionSubAPA${grupoCapasBase.srlIdGrupoCapas}" href="#collapseOneSubAPA${grupoCapas.srlIdGrupoCapas}" aria-expanded="false" aria-controls="collapseOneSubAPA${grupoCapas.srlIdGrupoCapas}">
							          ${grupoCapas.strNombre}
							        </a>
							      </h4>
							    </div>
							    <div id="collapseOneSubAPA${grupoCapas.srlIdGrupoCapas}" class="panel-collapse collapse" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneSubAPA${grupoCapas.srlIdGrupoCapas}">
							      <div class="panel-body">
							        
							      	<div class="row text-center" style="font-weight: bold;">
								      	<div class="col-xs-8 text-left">
								      		Nombre de capa
								      	</div>
								      	<div class="col-xs-2">
								      		&Aacute;rea selecc.
								      	</div>
								      	<div class="col-xs-2">
								      		Umbral
								      	</div>
							      	</div>
							      	
							      	<s:iterator value="#session.listCapasBase" var="capasBase">
							      	<s:if test="%{#capasBase.intGrupoCapas.toString()==#grupoCapas.srlIdGrupoCapas.toString()}">
							      	<div class="row">
								      	<div class="col-xs-8">
								      		<input type="checkbox" id="idCapaAnalisPorArea${capasBase.srlIdCapa}" name="capaAnalisPorArea" value="${capasBase.srlIdCapa}" class="capasBaseAPA">
											${capasBase.strNombre}
								      	</div>
								      	<div class="col-xs-2 text-center">
								      		
								      	</div>
								      	<div class="col-xs-2 text-center">
								      		
								      	</div>
							      	</div>
							      	</s:if>
							      	</s:iterator>
							        
							      </div>
							    </div>
							  </div>
							  </s:iterator>
							  
							</div>
					      	
					      	
					      </div>
					    </div>
					  </div>
					</s:iterator>
					</div>
					
					
				</div>
			</div>
			
			<div class="modal-footer">
				<div class="row">
					<div class="col-lg-4">
						<div class="pull-left">
							<div class="dropdown">
								<button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
								Seleccionar &aacute;rea
								<span class="caret"></span>
								</button>
								<ul class="dropdown-menu" aria-labelledby="dropdownMenu4">
									<li><a href="#" onclick="dibujarRectangulo()"><i class="fa fa-edit"></i> Dibujar un rectangulo</a></li>
									<li><a href="#" onclick="dibujarPoligono()"><i class="fa fa-lastfm"></i> Dibujar un poligono</a></li>
									<li><a href="#" onclick="seleccionarAreaDesdeShapefile()"><i class="fa fa-upload"></i> Cargar poligono Shp</a></li>
									<li><a href="#" onclick="seleccionarAreaDesdeMapa()"><i class="fa fa-bars"></i> Seleccionar en el mapa</a></li>
								</ul>
							</div>
						</div>
					</div>
					<div class="col-lg-8">
						<div class="pull-right">
							<button type="button" class="btn btn-default btnSeleccionarTodasCapasAPA">Seleccionar todas las capas</button>
							<button type="button" class="btn btn-default btnProcesarAnalizarPorArea">Procesar</button>
						</div>
					</div>
				</div>
			</div>
			
			