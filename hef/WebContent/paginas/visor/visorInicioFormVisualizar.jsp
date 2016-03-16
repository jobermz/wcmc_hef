<%@page import="wcmc.hef.general.util.ConfiguracionProperties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Seleccionar capas a visualizar</h4>
			</div>
			<div class="modal-body">
				<div style="height: 350px;overflow-y: auto;">
				
				
					<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="false">
					<s:iterator value="#session.listGrupoCapas" var="grupoCapasBase">
					  <div class="panel panel-default clsPanelGrupoCapasMainCB">
					    <div class="panel-heading" role="tab" id="headingOne${grupoCapasBase.srlIdGrupoCapas}">
					      <h4 class="panel-title">
					        <a role="button" class="collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapseOne${grupoCapasBase.srlIdGrupoCapas}" aria-expanded="false" aria-controls="collapseOne${grupoCapasBase.srlIdGrupoCapas}">
					          ${grupoCapasBase.strNombre} <span class="badge badgeCustomPanelGrupoCapaMainCB"></span>
					        </a>
					      </h4>
					    </div>
					    <div id="collapseOne${grupoCapasBase.srlIdGrupoCapas}" class="panel-collapse collapse" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOne${grupoCapasBase.srlIdGrupoCapas}">
					      <div class="panel-body">
					      
					      	
							<div class="panel-group" id="accordionSub${grupoCapasBase.srlIdGrupoCapas}" role="tablist" aria-multiselectable="false">
							  
							  <s:iterator value="#grupoCapasBase.listGrupoCapas" var="grupoCapas">
							  <div class="panel panel-default clsPanelGrupoCapasCB">
							    <div class="panel-heading" role="tab" id="headingOneSub${grupoCapas.srlIdGrupoCapas}">
							      <h4 class="panel-title">
							        <a role="button" class="collapsed" data-toggle="collapse" data-parent="#accordionSub${grupoCapasBase.srlIdGrupoCapas}" href="#collapseOneSub${grupoCapas.srlIdGrupoCapas}" aria-expanded="false" aria-controls="collapseOneSub${grupoCapas.srlIdGrupoCapas}">
							          ${grupoCapas.strNombre} <span class="badge badgeCustomPanelGrupoCapaCB"></span>
							        </a>
							      </h4>
							    </div>
							    <div id="collapseOneSub${grupoCapas.srlIdGrupoCapas}" class="panel-collapse collapse" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneSub${grupoCapas.srlIdGrupoCapas}">
							      <div class="panel-body">
							        
							      	<div class="row text-center" style="font-weight: bold;">
								      	<div class="col-xs-5 text-left">
								      		Nombre de capa
								      	</div>
								      	<s:if test="%{#grupoCapas.srlIdGrupoCapas.toString()==#CAPA_GRUPO_USUARIO}">
								      	<div class="col-xs-2">
								      		Acci&oacute;n
								      	</div>
								      	<div class="col-xs-2">
								      		Transparencia
								      	</div>
								      	</s:if>
								      	<s:else>
								      	<div class="col-xs-2">
								      		Transparencia
								      	</div>
								      	<div class="col-xs-2">
								      		Umbral
								      	</div>
								      	</s:else>
								      	<div class="col-xs-1">
								      		Cent.
								      	</div>
								      	<div class="col-xs-1">
								      		Dow.
								      	</div>
								      	<div class="col-xs-1">
								      		Info
								      	</div>
							      	</div>
							      	<s:iterator value="#session.listCapasBase" var="capasBase">
							      	<s:if test="%{#capasBase.intGrupoCapas.toString()==#grupoCapas.srlIdGrupoCapas.toString()}">
							      	<div class="row">
								      	<div class="col-xs-5 seleccionarParaCapaActiva" id-capa="${capasBase.srlIdCapa}" nombre-capa="${capasBase.strNombre}">
								      		<input type="checkbox" id="idCapaBaseVisualizacion${capasBase.srlIdCapa}" name="capasBase" value="${capasBase.srlIdCapa}" id-capa="${capasBase.srlIdCapa}" class="capasBase" onblur="guardarCapasSeleccionadasCapasBase();" onclick="marcarCapasVisualizacion();guardarCapasSeleccionadasCapasBase();">
											${capasBase.strNombre}
											<s:if test="%{#grupoCapas.srlIdGrupoCapas.toString()!=#CAPA_GRUPO_USUARIO}">
											<s:if test="%{#capasBase.intGrupoCapas.toString()==#grupoCapas.srlIdGrupoCapas.toString()&&(#capasBase.strWmsUrl==null||#capasBase.strWmsUrl=='')}">
												<i class="fa fa-warning"  title="La visualizacion no se encuentra disponible por el momento"></i>
											</s:if>
											</s:if>
								      	</div>
								      	<s:if test="%{#grupoCapas.srlIdGrupoCapas.toString()==#CAPA_GRUPO_USUARIO}">
								      	<div class="col-xs-2 text-center">
								      		<i class="fa fa-trash" onclick="eliminar_capa_usuario('${capasBase.srlIdCapa}');" style="color: red;cursor: pointer;"></i>
								      	</div>
								      	<div class="col-xs-2">
								      		<div idcapa="${capasBase.srlIdCapa}" class="clsSlider"></div>
								      	</div>
								      	</s:if>
								      	<s:else>
								      	<div class="col-xs-2">
								      		<div idcapa="${capasBase.srlIdCapa}" class="clsSlider"></div>
								      	</div>
								      	<div class="col-xs-2 text-center">
								      		<s:if test="%{#capasBase.listCapaUmbral!=null}">
								      		<s:select list="#capasBase.listCapaUmbral" id-capa="${capasBase.srlIdCapa}" name="filtrar_umbral"  listKey="strValoresMinimoMaximo" listValue="strNombre" onchange="filtrar_umbral(this);"></s:select>
								      		</s:if>
								      	</div>
								      	</s:else>
								      	<div class="col-xs-1 text-center">
								      		<s:if test="%{#capasBase.strEsCentrarMapaBoolean}">
								      			<i class="fa fa-lg fa-bullseye cursorPointer" onclick="centrarMapa(${capasBase.srlIdCapa});"></i>
								      		</s:if>
								      	</div>
								      	<div class="col-xs-1 text-center">
								      		<s:if test="%{#capasBase.strWfsUrl!=null&&#capasBase.strWfsUrl!=''}">
								      			<i class="fa fa-lg fa-download cursorPointer" onclick="descargarMapa(${capasBase.srlIdCapa});"></i>
								      		</s:if>
								      	</div>
								      	<div class="col-xs-1 text-center">
								      		<i class="fa fa-lg fa-info-circle cursorPointer" onclick="mostrarInfo(${capasBase.srlIdCapa});"></i>
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
				<button type="button" class="btn btn-default btnVideosInteractivos" data-dismiss="modal">Cerrar</button>
			</div>
			