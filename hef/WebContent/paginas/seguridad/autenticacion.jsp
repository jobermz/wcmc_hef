<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<nav class="navbar navbar-fixed-top" role="navigation" style="height: 20px; background-color: #FFFFFF">
	<div class="navbar-top">
		<div id="container">
			<div class="row">
				<div class="col-lg-3 ">
					<div class="row">
						<div class="col-sm-12 text-left">
							<img alt="" src="image/logo.png" style="height: 44px;display: inline-table;margin-left: 5px;"/>
						</div>
					</div>
				</div>
				<div class="col-sm-9">
						<img alt="" src="image/Logo_Programa_Bosques.png" style="height: 44px;display: inline-table;margin-left: 770px;"/>
						<img alt="" src="image/Logo_MINAM.png" style="height: 44px;display: inline-table;margin-left: 0px;"/>
				</div>
			</div>
		</div>
	</div>
</nav>

<div class="container-fluid">
	<div class="row marco-autenticacion center-block" style="vertical-align:middle;display:block;margin-top:120px;">
		<div class="col-sm-4">&nbsp;</div>
		<div class="col-sm-4" >
			<form class="" method="POST" id="idFormAutenticacion" name="formAutenticacion" novalidate="novalidate">
			
			
<!-- 			<div class="modal" tabindex="-1" role="dialog"> -->
				<div class="modal-dialog modal-sm ">
					<div class="modal-content" id="idDivCentrarCapas">
						
						<div class="modal-header">
							<button type="button" id="idBtnSalirCapa" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
							<h4 class="modal-title">Login de usuario</h4>
						</div>
						
						<div class="modal-body" id="idDivCombosCentrar">
						
						
							<div class="row ">
								<div class="col-sm-12 autenticacion-cuerpo" >
									<div class="row"><div class="col-sm-12">&nbsp;</div></div>
									<div class="row">
										<div class="col-xs-12">
											<div class="compomente-control">
												<div class="row">
													<div class="col-xs-2">
														<i class="fa fa-2x fa-user"></i>
													</div>
													<div class="col-xs-10">
							                			<s:textfield name="autentica_strUsuario" cssClass="form-control" tabindex="1" maxlength="100" value=""/>
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
														<i class="fa fa-2x fa-lock"></i>
													</div>
													<div class="col-xs-10">
				                						<s:password name="autentica_strPassword" cssClass="form-control" tabindex="2" maxlength="100" value="123456"/>
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
								<div class="col-sm-12 autenticacion-base" >
<!-- 									<div class="row"><div class="col-sm-12">&nbsp;</div></div> -->
<!-- 									<div class="row"> -->
<!-- 										<div class="col-sm-12"> -->
<!-- 											<button class="btn compomente-boton" type="submit" id="idBtnIngresar" tabindex="10"> Ingresar </button> -->
<!-- 										</div> -->
<!-- 									</div> -->
									<div class="row"><div class="col-sm-12">&nbsp;</div></div>
									<%-- 
									<div class="row">
										<div class="col-sm-12 text-center">
											<label class="imgHand">¿Olvido su Clave?</label>
										</div>
									</div>
									--%>
								</div>
							</div>
						
						
						</div>
						
						<div class="modal-footer">
							<button class="btn compomente-boton" type="submit" id="idBtnIngresar" tabindex="10"> Ingresar </button>
						</div>
						
					</div>
				</div>
<!-- 			</div> -->

				
				
				
				
				
				
				
				
				
			</form>
		</div>
		<div class="col-sm-4">&nbsp;</div>
	</div>
</div>
