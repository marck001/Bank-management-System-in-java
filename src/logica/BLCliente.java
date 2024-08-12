/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import entidades.*;
import datos.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author marck
 */
public class BLCliente {
    
    
    private static Cliente obj;

    public static int insertarCliente(String codigo, String apePaterno, String apeMaterno, String nombre, String dni, String ciudad, String direccion, String email, String telefono) {
        String mensaje;
        if (codigo.trim().length() == 5 && apePaterno.trim().length() > 0 && apeMaterno.trim().length() > 0&& nombre.trim().length() > 0 && dni.trim().length()==8 && ciudad.trim().length() > 0 && direccion.trim().length() > 0 && email.trim().length() > 0 && telefono.trim().length() ==9) {
         
              if (buscarCliente(codigo) == null) {
            //String codigo, String apellidoPaterno, String apellidoMaterno, String nombre, String dni, String ciudad, String direccion, String email, String telefono
                obj = new Cliente(codigo, apePaterno,apeMaterno, nombre,dni, ciudad, direccion, email, telefono);
                mensaje = DALCliente.insertaCliente(obj);
                if (mensaje == null) {
                    showMessageDialog(null, "Registro insertado", "Resultado", 1);
                    BLContador.aumentarContador("Cliente");
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
    
    public static String buscarCliente(String codigo) {
        if (codigo.trim().length() == 5) {
            return DALCliente.buscarCliente(codigo);
        } else {
            return null;
        }
    }
    
    public static String obtenerCodCuentaPorCliente(String codigo) {
        if (codigo.trim().length() == 5) {
            return DALCliente.obtenerCodCuentaPorCliente(codigo);
        } else {
            return null;
        }
    }
     
    public static String buscarClienteLogin(String codigo, String dni) {
        if (codigo.trim().length() == 5 && dni.trim().length() == 8) {
            return DALCliente.buscarClienteLogin(codigo, dni);
        } else {
            return null;
        }
    }

    public static ArrayList<Cliente> listarClientes() {
        return DALCliente.listarClientes();
    }

    public static String actualizarCliente(String codigo, String apePaterno, String apeMaterno, String nombre, String dni, String ciudad, String direccion, String email, String telefono) {
        String mensaje;
        if (codigo.trim().length() == 5 && apePaterno.trim().length() > 0 && apeMaterno.trim().length() > 0&& nombre.trim().length() > 0 && ciudad.trim().length() > 0 && direccion.trim().length() > 0 && email.trim().length() > 0 && telefono.trim().length() <= 20) {
            obj = new Cliente(codigo, apePaterno,apeMaterno, nombre,dni, ciudad, direccion, email, telefono);
            mensaje = DALCliente.actualizarCliente(obj);
            if (mensaje == null) {
                mensaje = "Registro actualizado";
            }
        } else {
            mensaje = "No válida";
        }
        return mensaje;
    }
    
    public static Cliente obtenerCliente(String codigo) {
        if(codigo.trim().length()==5 && buscarCliente(codigo)!=null) {
            obj = DALCliente.obtenerCliente(codigo);
            return obj;
        } else
            return null;
    }
}
