CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_obtener_saldo`(p_codigo char(8))
BEGIN
   select cuensaldo from cuenta where cuencodigo = p_codigo;
END