package logica;

import java.util.ArrayList;

import datos.DALEmpleado;
import entidades.Empleado;
import static javax.swing.JOptionPane.showMessageDialog;

public class BLEmpleado {
    private static Empleado obj;

    public static int insertarEmpleado(String codigo, String apellidoP, String apellidoM, String nombre, String ciudad, String direccion, String user, String clave) {
        String mensaje;
        if (codigo.trim().length() == 4 && apellidoP.trim().length() > 0 && apellidoM.trim().length() > 0 && nombre.trim().length() > 0 && ciudad.trim().length() > 0 && direccion.trim().length() > 0 && user.trim().length() > 0 && clave.trim().length() <= 20) {
            if (buscarEmpleado(codigo) == null) {
                obj = new Empleado(codigo, apellidoP, apellidoM, nombre, ciudad, direccion, user, clave);
                mensaje = DALEmpleado.insertaEmpleado(obj);
                if (mensaje == null) {
                    showMessageDialog(null, "Registro insertado", "Resultado", 1);
                    return 0;
                } else {
                    showMessageDialog(null, mensaje, "Error", 0);
                    return 1;
                }
            } else {
                showMessageDialog(null, "Codigo ya existe", "Error", 0);
                return 2;
            }
        } else {
            showMessageDialog(null, "Datos no validos", "Error", 0);
            return 3;
        }
    }

    public static String buscarEmpleado(String codigo) {
        if (codigo.trim().length() == 4) {
            return DALEmpleado.buscarEmpleado(codigo);
        } else {
            return null;
        }
    }
    
    public static String buscarEmpleadoLogin(String codigo, String clave) {
        if (codigo.trim().length() == 4 && clave == null) {
            return DALEmpleado.buscarEmpleadoLogin(codigo, clave);
        } else {
            return null;
        }
    }

    public static ArrayList<Empleado> listarEmpleados() {
        return DALEmpleado.listarEmpleados();
    }

    public static String actualizarEmpleado(String codigo, String apellidoP, String apellidoM, String nombre, String ciudad, String direccion, String user, String clave) {
        String mensaje;
        if (codigo.trim().length() == 4 && apellidoP.trim().length() > 0 && apellidoM.trim().length() > 0 && nombre.trim().length() > 0 && ciudad.trim().length() > 0 && direccion.trim().length() > 0 && user.trim().length() > 0 && clave.trim().length() <= 20) {
            obj = new Empleado(codigo, apellidoP, apellidoM, nombre, ciudad, direccion, user, clave);
            mensaje = DALEmpleado.actualizarEmpleado(obj);
            if (mensaje == null) {
                mensaje = "Registro actualizado";
            }
        } else {
            mensaje = "No válida";
        }
        return mensaje;
    }
    
     public static Empleado obtenerEmpleado(String codigo) {
        if(codigo.trim().length()==4) {
            obj = DALEmpleado.obtenerEmpleado(codigo);
            return obj;
        } else
            return null;
    }
}
