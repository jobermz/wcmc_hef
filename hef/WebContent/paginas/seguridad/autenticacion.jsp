<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
	<div class="row marco-autenticacion center-block" style="vertical-align:middle;display:block;margin-top:180px;">
		<div class="col-sm-4">&nbsp;</div>
		<div class="col-sm-4">
			<form class="" method="POST" id="idFormAutenticacion" name="formAutenticacion" novalidate="novalidate">
				<div class="row ">
					<div class="col-sm-12 autenticacion-cuerpo">
						<div class="row"><div class="col-sm-12">&nbsp;</div></div>
						<div class="row">
							<div class="col-xs-12">
								<div class="compomente-control">
									<div class="row">
										<div class="col-xs-2">
											<i class="fa fa-lg fa-user"></i>
										</div>
										<div class="col-xs-10">
				                			<s:textfield name="autentica_strUsuario" cssClass="input-control" tabindex="2" size="40" maxlength="100" value="jobermz"/>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="row"><div class="col-sm-12">&nbsp;</div></div>
						<div class="row">
							<div class="col-sm-12">
								<div class="compomente-control">
									<div class="row">
										<div class="col-xs-2">
											<i class="fa fa-lg fa-lock"></i>
										</div>
										<div class="col-xs-10">
	                						<s:password name="autentica_strPassword" cssClass="input-control" tabindex="2" size="40" maxlength="100" value="123456"/>
										</div>
									</div>
	                			</div>
							</div>
						</div>
						<div class="row"><div class="col-sm-12">&nbsp;</div></div>
						<div class="row">
							<div class="col-sm-12 ">
								<span id="idMspErrorBuscar" class="error_en_campo"><s:actionerror/></span>
								<span id="idMspInfoBuscar" class="info_en_campo"><s:actionmessage/></span>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12 autenticacion-base">
						<div class="row"><div class="col-sm-12">&nbsp;</div></div>
						<div class="row">
							<div class="col-sm-12">
								<button class="btn compomente-boton" type="submit" id="idBtnIngresar" tabindex="10"> Ingresar </button>
							</div>
						</div>
						<div class="row"><div class="col-sm-12">&nbsp;</div></div>
						<div class="row">
							<div class="col-sm-12 text-center">
								<label class="imgHand">Forgot your password?</label>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>
		<div class="col-sm-4">&nbsp;</div>
	</div>
</div>
