CREATE FUNCTION concatenar_coma(text, text) RETURNS text
AS 'select case
WHEN $2 is null or $2 = '''' THEN $1
WHEN $1 is null or $1 = '''' THEN $2
ELSE $1 || '', '' || $2
END'
LANGUAGE sql;

CREATE AGGREGATE list (
	BASETYPE = text,
	SFUNC = concatenar_coma,
	STYPE = text,
	INITCOND = ''
);
