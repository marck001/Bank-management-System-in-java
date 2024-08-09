CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_actualizar_cliente`(p_codigo char(5), p_paterno varchar(25),  p_materno varchar(25),  p_nombre varchar(30), p_dni char(8),  p_ciudad varchar(30),  p_direccion varchar(50),  p_telefono varchar(20),  p_email varchar(50))
BEGIN

    update cliente set cliepaterno = p_paterno , cliematerno = p_materno, clienombre = p_nombre, cliedni = p_dni, clieciudad = p_ciudad, cliedireccion = p_direccion, clietelefono = p_telefono, clieemail = p_email
    where cliecodigo = p_codigo;
END