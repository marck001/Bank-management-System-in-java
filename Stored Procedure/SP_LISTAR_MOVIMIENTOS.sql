CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listar_mov`()
BEGIN
   select * from movimiento;
END