CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insertar_cuenta`(p_codigo char(8), p_monecodigo char(2),  p_sucucodigo char(3),  p_emplcodigo char(4),  p_cliecodigo char(5), p_cuensaldo decimal(12,2),  p_f_creacion DATE,  p_estado varchar(15),  p_contmov int(11),  p_clave char(6))
BEGIN
    insert into cuenta values(p_codigo, p_monecodigo,  p_sucucodigo ,  p_emplcodigo ,  p_cliecodigo , p_cuensaldo ,   p_f_creacion ,  p_estado ,  p_contmov ,  p_clave);
END