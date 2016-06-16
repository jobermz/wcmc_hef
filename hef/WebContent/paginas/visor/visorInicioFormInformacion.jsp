<%@page import="wcmc.hef.general.util.ConfiguracionProperties"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				<h4 class="modal-title">Informaci&oacute;n de la capa</h4>
			</div>
			
			<div class="modal-body">
				<div class="row">
					<div class="col-lg-2">
						Nombre
					</div>
					<div class="col-lg-10" id="idDivInfoNombre">
					</div>
				</div>
				<div class="row">
					<div class="col-lg-2">
						Descripci&oacute;n
					</div>
					<div class="col-lg-10" id="idDivInfoComentario">
					</div>
				</div>
				<div class="row">
					<div class="col-lg-2">
						Fuentes/Autores
					</div>
					<div class="col-lg-10" id="idDivInfoAutores">
					</div>
				</div>
				<div class="row">
					<div class="col-lg-2">
						Fecha de creaci&oacute;n
					</div>
					<div class="col-lg-10" id="idDivInfoFecha">
					</div>
				</div>
				<div class="row">
					<div class="col-lg-2">
						URL
					</div>
					<div class="col-lg-10" id="idDivInfoUrl">
					</div>
				</div>
			</div>
			
			<div class="modal-footer">
				<button type="button" class="btn btn-primary btnVideosInteractivos" data-dismiss="modal">Cerrar</button>
			</div>
