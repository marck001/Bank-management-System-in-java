CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listar_clientes`()
BEGIN
   select * from cliente;
END