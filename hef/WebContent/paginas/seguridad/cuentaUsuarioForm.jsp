<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="page-content">
	<div class="row">
		<div class="page-title" id="idDivEditarTituloCuentaUsuario">
			<h3>
				Gestionar <span class="semi-bold">Cuenta de usuario</span> 
			</h3>
		</div>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-male"></i> Hef </a></li>
			<li><a href="home.action"><i class="fa fa-star"></i> Principal </a></li>
			<li class="active"><i class="fa fa-edit"></i> Cuenta de usuario</li>
		</ol>
	</div>
	
		<div class="row">
			<div class="grid simple">
				<div class="grid-body no-border">
				
				
					<form class="" method="POST" id="idFormEditarCuentaUsuario" name="formEditarCuentaUsuario" novalidate="novalidate">
						<div class="row">
							<div class="col-sm-12">
							
							
							
								<s:hidden name="edicion_cuentaUsuarioDto.srlId"></s:hidden>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampCuentaUsuario_Perfil">
										<label for="edicion_cuentaUsuarioDto.intPerfil" class="form-label">Perfil:</label>
										<div>
											<s:select name="edicion_cuentaUsuarioDto.intPerfil" cssClass="form-control " tabindex="1" list="#session.listPerfil" headerKey="" headerValue="-Seleccionar-" listValue="desc" listKey="id"></s:select>
										</div>
									</div>
									<div class="col-sm-4 " id="idCampCuentaUsuario_Nombres">
			                			<label for="edicion_cuentaUsuarioDto.strNombres" class="form-label">Nombres</label>
		                				<s:textfield name="edicion_cuentaUsuarioDto.strNombres" cssClass="form-control " tabindex="2" size="40" maxlength="200" />
									</div>
									<div class="col-sm-4 " id="idCampCuentaUsuario_Apellidos">
			                			<label for="edicion_cuentaUsuarioDto.strApellidos" class="form-label">Apellidos</label>
		                				<s:textfield name="edicion_cuentaUsuarioDto.strApellidos" cssClass="form-control " tabindex="3" size="40" maxlength="300" />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-4 " id="idCampCuentaUsuario_Usuario">
			                			<label for="edicion_cuentaUsuarioDto.strUsuario" class="form-label">Usuario</label>
		                				<s:textfield name="edicion_cuentaUsuarioDto.strUsuario" cssClass="form-control " tabindex="4" size="40" maxlength="100" />
									</div>
									<div class="col-sm-4 " id="idCampCuentaUsuario_Clave">
			                			<label for="edicion_cuentaUsuarioDto.strClave" class="form-label">Clave</label>
		                				<s:textfield name="edicion_cuentaUsuarioDto.strClave" cssClass="form-control " tabindex="5" size="40" maxlength="500" />
									</div>
									<div class="col-sm-4 " id="idCampCuentaUsuario_EsActivo">
										<label for="edicion_cuentaUsuarioDto.strEsActivo" class="form-label">Esta activo:</label>
										<div><s:checkbox  name="edicion_cuentaUsuarioDto.strEsActivoBoolean" tabindex="6" theme="simple" /></div>
									</div>
								</div>
							
							</div>
						</div>
						
						<div class="form-actions">
							<div class="row pull-right">
								<button class="btn btn-primary" type="button" id="idBtnGuardarCuentaUsuario" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
								<button class="btn btn-primary" type="button" id="idBtnVolverCuentaUsuario" tabindex="10"><i class="fa fa fa-power-off"></i> Salir </button>
							</div>
						</div>
						<br><br>
					</form>

					
				</div>
				
			</div>
		</div>
</div>

