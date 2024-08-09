CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_returnMAX`(p_codigo char(8))
BEGIN

  select MAX(movinumero)  as max from movimiento where cuencodigo =p_codigo;

END