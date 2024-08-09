CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insertar_mov`(p_cuencodigo char(8), p_movnums int(11),  p_movifecha date,  p_emplcodigo char(4), p_tipomov char(3), p_moviimporte decimal(12,2),  p_cuenrefencia char(8))
BEGIN
  insert into movimiento values(p_cuencodigo, p_movnums,  p_movifecha,  p_emplcodigo, p_tipomov , p_moviimporte,  p_cuenrefencia);
   
END