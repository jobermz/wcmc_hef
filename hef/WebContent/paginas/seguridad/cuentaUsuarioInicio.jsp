<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="page-content" id="idDivPrincipalCuentaUsuario">
	<div class="row">
		<div class="page-title">
			<h3>
				Gestionar <span class="semi-bold">Cuenta de usuario</span> 
			</h3>
		</div>
		<ol class="breadcrumb">
			<li><a href="home.action"><i class="glyphicon glyphicon-globe"></i> Mapa </a></li>
			<li class="active"><i class="glyphicon glyphicon-th-list"></i> Listar cuenta de usuario </li>
		</ol>
	</div>
	<div class="row">
		<div class="grid simple">
			
			<div class="grid-title">
				<div class="row form-row">
					<div class="col-sm-12">
						<div class="botonera pull-right">
							<button class="btn btn-primary" type="button" id="idBtnNuevoCuentaUsuario" tabindex="10"><i class="fa fa-file-o"></i> Nuevo </button>
							<button class="btn btn-primary" type="button" id="idBtnSalirCuentaUsuario" tabindex="10"><i class="fa fa-power-off"></i> Regresar al mapa </button>
						</div>
					</div>
				</div>
			</div>
			
			<div class="grid-body no-border">
				<form class="" method="POST" id="idFormBuscarCuentaUsuario" name="formBuscarCuentaUsuario" novalidate="novalidate">
					
					<div class="row ">
						<div class="col-sm-12">
							<h4 class="semi-bold"><span class="light">Listado de</span> <span class="semi-bold">Cuenta de usuario</span><br>
							</h4>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strNombres" class="form-label">Nombres</label>
		                			<s:textfield name="buscar_strNombres" cssClass="form-control" tabindex="1" size="40" maxlength="200"/>
								</div>
							</div>
							<div class="row form-row">
								<div class="col-sm-6">
		                			<label for="buscar_strUsuario" class="form-label">Usuario</label>
		                			<s:textfield name="buscar_strUsuario" cssClass="form-control" tabindex="2" size="40" maxlength="100"/>
								</div>
							</div>
						</div>
					</div>
					
					<div class="row form-row">
						<div class="col-sm-12">
							<div class="botonera pull-right">
								<button class="btn btn-primary" type="button" id="idBtnConsultarCuentaUsuario" tabindex="10"><i class="fa fa-filter"></i> Buscar </button>
							</div>
						</div>
					</div>
					
				</form>
			</div>
			
			<div class="grid-body no-border">      
				<table cellpadding="0" cellspacing="0" border="0" class="table table-bordered table-hover" id="tableDefaultCuentaUsuario" >
					<thead>     
						<tr>
							<th width="null">Perfil</th>
							<th width="30%">Nombres</th>
							<th width="30%">Apellidos</th>
							<th width="30%">Usuario</th>
							<th style="width: 6%;">Detalle</th>
						</tr>
					</thead>
				</table>
				<br>
			</div>
			
		</div>
	</div>
</div>
<div id="idDivEditarCuentaUsuario"></div>
<div id="dialog-info-eliminar" hidden="true">
    <br>  <p> <strong>&iquest;EST&Aacute; SEGURO QUE DESEA ELIMINAR EL REGISTRO&#63;</strong></p>
</div>

<s:form action="" name="form" id="form" namespace="/">
	<s:hidden name="buscar_seleccion_id" id="buscar_seleccion_id" />
</s:form>
