--PARA ACTIVAR LA BASE DE DATOS PARA QUE SOPORTE COLUMNAS DE MAPAS 
-- Enable PostGIS (includes raster)
CREATE EXTENSION postgis;
-- Enable Topology
CREATE EXTENSION postgis_topology;
-- fuzzy matching needed for Tiger
CREATE EXTENSION fuzzystrmatch;
-- Enable US Tiger Geocoder
CREATE EXTENSION postgis_tiger_geocoder;
 

ALTER FUNCTION _raster_constraint_pixel_types(raster) SET search_path=pg_catalog,public,postgis;
ALTER FUNCTION _raster_constraint_info_regular_blocking(rastschema name, rasttable name, rastcolumn name) SET search_path=pg_catalog,public,postgis;
ALTER FUNCTION _raster_constraint_nodata_values(raster) SET search_path=pg_catalog,public,postgis;
ALTER FUNCTION _raster_constraint_out_db(raster) SET search_path=pg_catalog,public,postgis;
