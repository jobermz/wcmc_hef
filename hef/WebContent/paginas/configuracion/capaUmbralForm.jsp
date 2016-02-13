<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container-fluid">
<!-- 	<div class="row"> -->
<!-- 		<div class="page-title" id="idDivEditarTituloCapaUmbral"> -->
<!-- 			<h3> -->
<%-- 				Gestionar <span class="semi-bold">Umbral</span>  --%>
<!-- 			</h3> -->
<!-- 		</div> -->
<!-- 		<ol class="breadcrumb"> -->
<!-- 			<li><a href="#"><i class="fa fa-male"></i> Hef </a></li> -->
<!-- 			<li><a href="home.action"><i class="fa fa-star"></i> Principal </a></li> -->
<!-- 			<li class="active"><i class="fa fa-edit"></i> Umbral</li> -->
<!-- 		</ol> -->
<!-- 	</div> -->
	
		<div class="row">
			<div class="grid simple">
				<div class="grid-body no-border">
				
				
					<form class="" method="POST" id="idFormEditarCapaUmbral" name="formEditarCapaUmbral" novalidate="novalidate">
						<div class="row">
							<div class="col-sm-12">
							
							
							
								<s:hidden name="edicion_capaUmbralDto.srlIdCapaUmbral"></s:hidden>
								<s:hidden name="edicion_capaUmbralDto.intIdCapa"></s:hidden>
								<div class="row form-row">
									<div class="col-sm-12 " id="idCampCapaUmbral_Nombre">
			                			<label for="edicion_capaUmbralDto.strNombre" class="form-label">Nombre</label>
		                				<s:textfield name="edicion_capaUmbralDto.strNombre" cssClass="form-control " tabindex="1" size="40" maxlength="100" />
									</div>
								</div>
								<div class="row form-row">
									<div class="col-sm-6 " id="idCampCapaUmbral_ValorMinimo">
			                			<label for="edicion_capaUmbralDto.intValorMinimo" class="form-label">Valor minimo</label>
		                				<s:textfield name="edicion_capaUmbralDto.intValorMinimo" cssClass="form-control " tabindex="2" size="40" maxlength="100" />
									</div>
									<div class="col-sm-6 " id="idCampCapaUmbral_ValorMaximo">
			                			<label for="edicion_capaUmbralDto.intValorMaximo" class="form-label">Valor maximo</label>
		                				<s:textfield name="edicion_capaUmbralDto.intValorMaximo" cssClass="form-control " tabindex="3" size="40" maxlength="100" />
									</div>
								</div>
							
							</div>
						</div>
						
						<div class="form-actions">
							<div class="row pull-right">
								<button class="btn btn-primary" type="button" id="idBtnGuardarCapaUmbral" tabindex="10"><i class="fa fa fa-save"></i> Guardar </button>
								<button class="btn btn-primary" type="button" id="idBtnVolverCapaUmbral" tabindex="10"><i class="fa fa fa-power-off"></i> Regresar </button>
							</div>
						</div>
						<br><br>
					</form>

					
				</div>
				
			</div>
		</div>
</div>

