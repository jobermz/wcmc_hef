<%@page import="wcmc.hef.general.util.ConfiguracionProperties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

		
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Identificar &aacute;rea por criterios logicos</h4>
			</div>
			<div class="modal-body">
				<div style="height: 350px;overflow-y: auto;">
				
				
					<div class="panel-group" id="accordion_iac" role="tablist" aria-multiselectable="false">
					<s:iterator value="#session.listGrupoCapas" var="grupoCapasBase">
					  <div class="panel panel-default">
					    <div class="panel-heading" role="tab" id="headingOneIAC${grupoCapasBase.srlIdGrupoCapas}">
					      <h4 class="panel-title">
					        <a role="button" class="collapsed" data-toggle="collapse" data-parent="#accordion_iac" href="#collapseOneIAC${grupoCapasBase.srlIdGrupoCapas}" aria-expanded="false" aria-controls="collapseOneIAC${grupoCapasBase.srlIdGrupoCapas}">
					          ${grupoCapasBase.strNombre}
					        </a>
					      </h4>
					    </div>
					    <div id="collapseOneIAC${grupoCapasBase.srlIdGrupoCapas}" class="panel-collapse collapse" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneIAC${grupoCapasBase.srlIdGrupoCapas}">
					      <div class="panel-body">
					      
					      	
							<div class="panel-group" id="accordionSubIAC${grupoCapasBase.srlIdGrupoCapas}" role="tablist" aria-multiselectable="true">
							  
							  <s:iterator value="#grupoCapasBase.listGrupoCapas" var="grupoCapas">
							  <div class="panel panel-default">
							    <div class="panel-heading" role="tab" id="headingOneSubIAC${grupoCapas.srlIdGrupoCapas}">
							      <h4 class="panel-title">
							        <a role="button" class="collapsed" data-toggle="collapse" data-parent="#accordionSubIAC${grupoCapasBase.srlIdGrupoCapas}" href="#collapseOneSubIAC${grupoCapas.srlIdGrupoCapas}" aria-expanded="false" aria-controls="collapseOneSubIAC${grupoCapas.srlIdGrupoCapas}">
							          ${grupoCapas.strNombre}
							        </a>
							      </h4>
							    </div>
							    <div id="collapseOneSubIAC${grupoCapas.srlIdGrupoCapas}" class="panel-collapse collapse" aria-expanded="false" style="height: 0px;" role="tabpanel" aria-labelledby="headingOneSubIAC${grupoCapas.srlIdGrupoCapas}">
							      <div class="panel-body">
							        
							      	<div class="row text-center" style="font-weight: bold;">
								      	<div class="col-xs-8 text-left">
								      		Nombre de capa
								      	</div>
								      	<div class="col-xs-2">
								      		Det. filtro
								      	</div>
								      	<div class="col-xs-2">
								      		Filtro
								      	</div>
							      	</div>
							      	
							      	<s:iterator value="#session.listCapasBase" var="capasBase">
							      	<s:if test="%{#capasBase.intGrupoCapas.toString()==#grupoCapas.srlIdGrupoCapas.toString()}">
							      	<div class="row">
								      	<div class="col-xs-8">
								      		<input type="checkbox" id="idCapaSelCritLog" name="capasBase" value="${capasBase.srlIdCapa}"  class="capasBase">
											${capasBase.strNombre}
								      	</div>
								      	<div class="col-xs-2 text-center">
								      		
								      	</div>
								      	<div class="col-xs-2 text-center">
								      		<i class="fa fa-lg fa-filter cursorPointer" onclick="filtrar(${capasBase.srlIdCapa});"></i>
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
				<button type="button" class="btn btn-default btnProcesarIdentAreaCriteriosLogicos" >Procesar</button>
			</div>
			
			