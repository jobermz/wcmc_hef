<%@page import="wcmc.hef.general.util.ConfiguracionProperties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Seleccionar area desde un shapefile</h4>
			</div>
			
			<div class="modal-body">
				<s:form method="post" name="frmSelAreaShapefile" id="idFrmSelAreaShapefile" enctype="multipart/form-data">
				<div class="row">
					<div class="col-lg-2">Cargar:</div>
					<div class="col-lg-8"><s:file name="shapefile" ></s:file></div>
					<div class="col-lg-2">
						<button type="button" class="btn btn-default btnEnviarShapefile">Enviar</button>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-12" id="idDivSeleccionarShapeHtml"></div>
				</div>
				</s:form>
			</div>
			
			<div class="modal-footer">
				<button type="button" class="btn btn-default " data-dismiss="modal">Cerrar</button>
			</div>
