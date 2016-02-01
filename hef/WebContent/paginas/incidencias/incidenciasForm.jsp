<%-- <%@page import="sernanp.pvirtual.tablasmaestras.vo.IncidenciasAnpVO"%> --%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div id="tabs">
	<ul>
		<li id="idDivTabMapas" class="active"><a href="#tabs-Mapas">Mapas</a></li>
		<li id="idDivTabGenerales"><a href="#tabs-Generales">Datos generales</a></li>
		<li id="idDivTabMensajes"><a href="#tabs-Mensajes">Mensajes</a></li>
	</ul>
	<div id="tabs-Mapas">
		<div class="row">
			<div class="col-sm-12">
				<s:if test="%{#session.USUARIO_ACTUAL.accesoRolUsuario}">
				<div class="row">
					<div class="col-sm-12">
						<label>Anp:</label>
						<div>${session.USUARIO_ACTUAL.strIncidenciasAnpDesc}<input type="hidden" name="edicion_incidenciasVO.intAnp" value="${session.USUARIO_ACTUAL.intIdIncidenciasAnp}"/></div>
					</div>
				</div>
				</s:if>
				<s:else>
				<div class="row">
					<div class="col-sm-12">
						<label>Anp:</label>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="pull-left">
							<div class="input-group input-group-sm">
<%-- 								<s:select  cssClass="form-control" name="edicion_incidenciasVO.intAnp" list="#session.listIncidenciasAnp" headerKey="" headerValue="-Seleccionar-" listValue="strNombre" listKey="intId"></s:select> --%>
							</div>
						</div>
						<div class="pull-left">
<!-- 							&nbsp;&nbsp;<input type="button" class="btn btn-info btn-sm" value="Aplicar en mapa" id="idButtonAplicarAnp"/> -->
							&nbsp;&nbsp;<input type="button" class="submit2" value="Aplicar en mapa" id="idButtonAplicarAnp"/>
						</div>
					</div>
				</div>
				</s:else>
				<div class="row">
					<div class="col-sm-12">
						<label>Url en google Maps:</label> <a id="idAEdicion_incidenciasVOStrUrlMapa" target="_blank" href="${edicion_incidenciasVO.strUrlMapa}" style="color:#0000FF;text-decoration:underline;">Link</a>
						<s:hidden name="edicion_incidenciasVO.strUrlMapa" />
					</div>
				</div>

				<div class="row">
					<div class="col-sm-12">
						<div class="pull-left">
							Anp:
							<div class="input-group input-group-sm">
								<select class="form-control" name="sistemaCoordenedasSelect" onchange="sistemaCoordenadas();">
									<option value="datum" selected="selected">Geogr&aacute;ficas</option>
									<option value="utm">UTM</option>
								</select>
							</div>
						</div>
						<div class="pull-left">
							Lon: 
							<div class="input-group input-group-sm">
								<s:textfield name="posicionMapaLongitud" size="16" maxlength="30" cssClass="form-control"/>
							</div>
						</div>
						<div class="pull-left">
							Lat:
							<div class="input-group input-group-sm">
								<s:textfield name="posicionMapaLatitud" size="16" maxlength="30" cssClass="form-control"/>
							</div>
						</div>
						<div class="pull-left">
							Zona:
							<div class="input-group input-group-sm">
								<select name="posicionMapaSelect" class="form-control"><!-- onchange="ubicacionSistemaCoordenadas();" -->
									<option value="">-Seleccionar-</option>
									<option value="utm_z17s">Zone 17S</option>
									<option value="utm_z18s">Zone 18S</option>
									<option value="utm_z19s">Zone 19S</option>
								</select>
							</div>
						</div>
						<div class="pull-left">
							<br/>
<!-- 							&nbsp;&nbsp;<input type="button" value="Clear" class="btn btn-info btn-sm" id="idButtonLimpiarCRS"/> -->
							&nbsp;&nbsp;<input type="button" value="Clear" class="submit2" id="idButtonLimpiarCRS"/>
						</div>
						<div class="pull-left">
							<br/>
<!-- 							&nbsp;&nbsp;<input type="button" value="Aplicar" class="btn btn-info btn-sm" id="idButtonAplicar"/> -->
							&nbsp;&nbsp;<input type="button" value="Aplicar" class="submit2" id="idButtonAplicar"/>
						</div>
					</div>
				</div>
				
				<div class="row"><div class="col-sm-12">&nbsp;</div></div>
				<div class="row">
					<div class="col-sm-12">
<!-- 						<div class="btn-group" role="group" aria-label="..."> -->
<!-- 							<input type="button" value="marcar ubicaci&oacute;n" class="btn btn-info btn-sm" id="idButtonPuntoUbicacion" onclick="marcarPuntoUbicacion();"/> -->
<!-- 						</div> -->
<!-- 						<div class="btn-group" role="group" aria-label="..."> -->
<!-- 							<input type="button" value="marcar &aacute;rea" class="btn btn-info btn-sm" id="idButtonAreaUbicacion" onclick="marcarAreaUbicacion();"/> -->
<!-- 						</div> -->
<!-- 						<div class="btn-group" role="group" aria-label="..."> -->
<!-- 							<input type="button" value="Ubicaci&oacute;n actual" class="btn btn-info btn-sm" id="idButtonMiPosicionActual"/> -->
<!-- 						</div> -->
<!-- 						<div class="btn-group" role="group" aria-label="..."> -->
<!-- 							<input type="button" value="Agregar mapa como adjunto" class="btn btn-info btn-sm" id="idButtonDescargar"/><div id="demoMiUbicacion"></div> -->
<!-- 						</div> -->
						
						<input type="button" value="marcar ubicaci&oacute;n" class="submit2" id="idButtonPuntoUbicacion" onclick="marcarPuntoUbicacion();"/>
						<input type="button" value="marcar &aacute;rea" class="submit2" id="idButtonAreaUbicacion" onclick="marcarAreaUbicacion();"/>
						<input type="button" value="Ubicaci&oacute;n actual" class="submit2" id="idButtonMiPosicionActual"/>
						<input type="button" value="Agregar mapa como adjunto" class="submit2" id="idButtonDescargar"/><div id="demoMiUbicacion"></div>
						
					</div>
				</div>
				
				<div class="row"  id="idDivMapaTotalRow">
					<div class="col-sm-12">
						<div class="wrapperCCC" style="height: 326px;">
							<div class="containerCCC">
						        <div class="smallmapBase containerIfrCCC" id="idDivMapaTotal" >
									<div id="mapSernanp" class="smallmap"></div>
									<div id="mapGoogle" class="smallmap"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
				
				<div class="row">
					<div class="col-sm-12">
						<ul id="controlTogglex_x" style="display: inline-block;">
							<li style="display: inline-block;">
								<input type="radio" name="googleMapView" value="ninguno" id="google_None" onclick="toggleGoogleControl(this);"/>
								<label for="google_None">Ninguno</label>
							</li>
							<li style="display: inline-block;">
								<input type="radio" name="googleMapView" value="google_Satellite" id="google_Satellite" onclick="toggleGoogleControl(this);" checked="checked" />
								<label for="google_Satellite">Satellite</label>
							</li>
							<li style="display: inline-block;">
								<input type="radio" name="googleMapView" value="google_Hybrid" id="google_Hybrid" onclick="toggleGoogleControl(this);" />
								<label for="google_Hybrid">Hybrid</label>
							</li>
							<li style="display: inline-block;">
								<input type="radio" name="googleMapView" value="google_Physical" id="google_Physical" onclick="toggleGoogleControl(this);"/>
								<label for="google_Physical">Earth</label>
							</li>
							<li style="display: inline-block;">
								<input type="radio" name="googleMapView" value="google_Streets" id="google_Streets" onclick="toggleGoogleControl(this);" />
								<label for="google_Streets">Streets</label>
							</li>
							<li style="display: inline-block;">
								<input type="checkbox" name="sernanpLayers" value="sernanpLayers" id="sernanp_Layers" onclick="toggleSernanpControl(this);"  checked="checked"  />
								<label for="sernanp_Layers">Capas SERNANP</label>
							</li>
						</ul>
					</div>
				</div>
					
				<div class="row">
					<div class="col-sm-12">
						<div class="pull-left">
							<label>Cargar Shape (geometrias):</label>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="pull-left">
							<div class="input-group input-group-sm">
								<input name="adjuntoShape" type="file" />
							</div>
						</div>
						<div class="pull-left">
<!-- 							&nbsp;&nbsp;<input type="button" value="Aplicar" class="btn btn-info btn-sm" id="idButtonAplicarShape"/> -->
							&nbsp;&nbsp;<input type="button" value="Aplicar" class="submit2" id="idButtonAplicarShape"/>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12" id="idDivSeleccionarShape" style="display: none;">
						<div class="row">
							<div class="col-sm-12">
								<label class="info_en_campo">Se ha detectado multiples poligonos, para continuar seleccione uno:</label>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-11">
								<div id="idDivSeleccionarShapeHtml" style="width: 100%;"></div>
							</div>
							<div class="col-xs-1">
								<div class="pull-right">
									<img src="img/eliminar.png" onclick="seleccionarShapeCerrar_fn();" style="cursor: pointer;"/>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div id="tabs-Generales">
		<div class="row">
			<div class="col-sm-12">
				<script type="text/javascript">
				var arrIncidenciasAnp = new Array;
				<%
// 					List<IncidenciasAnpVO> listInAnp = (List)session.getAttribute("listIncidenciasAnp");
// 				out.write("var tamArrIncidenciasAnp = 0;");
// 				for(IncidenciasAnpVO inAnp: listInAnp) {
// 					out.write("tamArrIncidenciasAnp = arrIncidenciasAnp.length;");
// 					out.write("arrIncidenciasAnp[tamArrIncidenciasAnp] = new Array;");
// 					out.write("arrIncidenciasAnp[tamArrIncidenciasAnp][0] = '" + inAnp.getIntId() + "';");
// 					out.write("arrIncidenciasAnp[tamArrIncidenciasAnp][1] = '" + inAnp.getStrGisUbicacion() + "';");
// 					out.write("arrIncidenciasAnp[tamArrIncidenciasAnp][2] = '" + inAnp.getIntGisZoom() + "';");
// 					out.write("arrIncidenciasAnp[tamArrIncidenciasAnp][3] = '" + inAnp.getStrGisUbicacionBounds() + "';");
// 				}
				%>
				</script>
				<s:hidden name="edicion_incidenciasVO.intIncidencias"/>
				<s:hidden name="edicion_incidenciasVO.intUsuario" value="%{#session.USUARIO_ACTUAL.srlIdUsuarios}"/>
				<s:hidden name="edicion_incidenciasVO.strGisPosicion"/>
				<s:hidden name="edicion_incidenciasVO.intGisZoom"/>
				<s:hidden name="edicion_incidenciasVO.strGisArea"/>
				<s:hidden name="edicion_incidenciasVO.strDataImageBase64"/>
				<div class="row" style="display: none;">
					<div class="col-sm-12">
						<label>Tipo de conflicto:</label>
						<div>
<%-- 						<s:radio name="edicion_incidenciasVO.intAlertaConflictoSocialTipo" list="#session.listAlertaConflictoSocialTipo" listValue="strDescripcion" listKey="srlIdAlertaConflictoSocialTipo" /> --%>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<label id="idLabel" style="display: none;">Id:</label>
						<div id="idDivEdicion_strId" style="display: none;"><s:property value="edicion_incidenciasVO.intId"></s:property></div>
						<s:hidden name="edicion_incidenciasVO.intId"/>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<label>Titulo (M&aacute;ximo 100 caracteres):</label>
						<div class="input-group input-group-sm">
							<s:textfield name="edicion_incidenciasVO.strTitulo" size="40" maxlength="100" cssClass="form-control"/>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<label>Mensaje (M&aacute;ximo 240 caracteres):</label>
						<s:textarea name="edicion_incidenciasVO.strMensaje" cols="80" rows="2" maxlength="240" cssClass="form-control"/>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<label>Ubicaci&oacute;n grilla:</label>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="pull-left">
							<div class="input-group input-group-sm">
								<s:textfield name="edicion_incidenciasVO.strUbicacionGrilla" size="40" maxlength="500" cssClass="form-control"/>
							</div>
						</div>
						<div class="pull-left">
							&nbsp;&nbsp;<input type="button" value="Aplicar en mapa" class="submit2" id="idButtonAplicarUbicacionGrilla"/>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<label>Gravedad:</label>
<%-- 						<div><s:select name="edicion_incidenciasVO.intGravedad" list="#session.listIncidenciasGravedad" headerKey="" headerValue="-Seleccionar-" listValue="strDescripcion" listKey="srlId"></s:select></div> --%>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<label>Fecha:</label>
						<div>
							<s:textfield name="edicion_incidenciasVO.timFechaFecha" size="10" maxlength="10" cssClass="datepicker"/>&nbsp;&nbsp;<s:textfield name="edicion_incidenciasVO.timFechaHora" size="5" maxlength="5" cssClass="timepickerhere"/>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<label>Adicionalmente notificar por correo a:</label>
						<div><s:textarea name="edicion_incidenciasVO.strNotificarCorreos" cols="80" rows="2" maxlength="500" cssClass="form-control"/></div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="pull-left">
							<label>Documentos (Se recomiendo archivos de 5Mb como m&aacute;ximo):</label>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="pull-left">
							<input name="adjunto" type="file"/>
						</div>
						<div class="pull-left">
<!-- 							&nbsp;&nbsp;<input type="button" value="Agregar" class="btn btn-info btn-sm" id="idBtnAgregarFoto"/> -->
							&nbsp;&nbsp;<input type="button" value="Agregar" class="submit2" id="idBtnAgregarFoto"/>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div id="idDivFotos">
							<div style="height:120px;overflow-y: scroll;">
							<center>
							<table>
								<tr style="font-weight: bold;">
									<th width="30%" style="background-color: #CFCFCF;font-weight: bold;">Foto</th>
									<th width="5%" style="background-color: #CFCFCF;font-weight: bold;">Acci&oacute;n</th>
								</tr>
								<s:iterator value="%{#session.listIncidenciasFoto}" var="incFot">
								<tr>
									<td><a href="download.action?id=${incFot.strDocumento}"><img height="50px" alt="${incFot.strDocumentoNombre}" src="download.action?id=${incFot.strDocumento}" /></a></td>
									<td><img src="img/eliminar.png" onclick="if(confirm('¿Esta seguro de eliminar la foto?')){eliminarFoto_fn('${incFot.strDocumento}');}" style="cursor: pointer;"></td>
								</tr>
								</s:iterator>
							</table>
							</center>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	
	
	<div id="tabs-Mensajes">
		<%
		request.setAttribute("incidenciasVO", request.getAttribute("edicion_incidenciasVO"));
		%>
		<div style="height: 400px;overflow-y: scroll;">
			<table id="idTableIncidenciasListarAnidar" border="0">
<%-- 				<jsp:include page="incidenciasListarAnidar.jsp"></jsp:include> --%>
			</table>
		</div>
	</div>
</div>
