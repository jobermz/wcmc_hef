<%@page import="wcmc.hef.general.util.ConfiguracionProperties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
			
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Filtrar</h4>
			</div>
			
			<div class="modal-body">
				<div id="idDivACL" class="clsDivACL">
				</div>
			</div>
			
			<div class="modal-footer">
				<button type="button" class="btn btn-default btnAplicarACLFiltrar" data-dismiss="modal">Aplicar</button>
				<button type="button" class="btn btn-default btnCerrarACLFiltrar" data-dismiss="modal">Cerrar</button>
			</div>
			