CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_buscar_cuenta`(p_codigo char(8))
BEGIN
    select * from cuenta where cuencodigo = p_codigo;
END