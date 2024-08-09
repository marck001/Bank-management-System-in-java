CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_buscar_cliente`(p_codigo char(5))
BEGIN
   select * from cliente where cliecodigo = p_codigo;
END