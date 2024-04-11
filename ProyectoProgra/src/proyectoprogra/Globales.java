package proyectoprogra;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author josea
 */
public class Globales {

    public static ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
    public static ArrayList<Empleado> Empleados = new ArrayList<Empleado>();
    public static LinkedList<Sucursal> Sucursales = new LinkedList<Sucursal>();
    public static LinkedList<Categoria> Categorias = new LinkedList<Categoria>();
    public static LinkedList<Equipo> Equipos = new LinkedList<Equipo>();
    public static LinkedList<Factura> Facturas = new LinkedList<Factura>();

    public static void guardarCliente() {
        try {
            DataOutputStream archivo = new DataOutputStream(new FileOutputStream("clientes.txt", false));
            for (int i = 0; i < Clientes.size(); i++) {
                archivo.writeUTF(Clientes.get(i).getFechaCreacion());
                archivo.writeUTF(Clientes.get(i).getNombre());
                archivo.writeUTF(Clientes.get(i).getApellido1());
                archivo.writeUTF(Clientes.get(i).getApellido2());
                archivo.writeUTF(Clientes.get(i).getNickname());
                archivo.writeUTF(Clientes.get(i).getContra());
                if (Clientes.get(i).isEstado() == true) { // como no se puede escribrir el boleen lo vamos a escribir como un string, por eso esta entre " "
                    archivo.writeUTF("true");
                } else {
                    archivo.writeUTF("false");
                }
            }
            archivo.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void cargarClientes() {
        try {
            Clientes = new ArrayList<Cliente>();

            DataInputStream archivoLectura = new DataInputStream(new FileInputStream("clientes.txt"));
            try {
                while (true) {
                    Cliente c = new Cliente();
                    c.setFechaCreacion(archivoLectura.readUTF());
                    c.setNombre(archivoLectura.readUTF());
                    c.setApellido1(archivoLectura.readUTF());
                    c.setApellido2(archivoLectura.readUTF());
                    c.setNickname(archivoLectura.readUTF());
                    c.setContra(archivoLectura.readUTF());
                    if (archivoLectura.readUTF().equalsIgnoreCase("true")) {
                        c.setEstado(true);
                    } else {
                        c.setEstado(false);
                    }
                    Clientes.add(c);

                }
            } catch (Exception e) {
                archivoLectura.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void guardarEmpleados() {
        try {
            DataOutputStream archivo = new DataOutputStream(new FileOutputStream("empleados.txt", false));
            for (int i = 0; i < Empleados.size(); i++) {
                archivo.writeUTF(Empleados.get(i).getNombre());
                archivo.writeUTF(Empleados.get(i).getApellido1());
                archivo.writeUTF(Empleados.get(i).getApellido2());
                archivo.writeUTF(Empleados.get(i).getNickname());
                archivo.writeUTF(Empleados.get(i).getContra());
                if (Empleados.get(i).isEstado() == true) { // como no se puede escribrir el boleen lo vamos a escribir como un string, por eso esta entre " "
                    archivo.writeUTF("true");
                } else {
                    archivo.writeUTF("false");
                }
            }
            archivo.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void cargarEmpleados() {
        try {
            Empleados = new ArrayList<Empleado>();

            DataInputStream archivoLectura = new DataInputStream(new FileInputStream("empleados.txt"));
            try {
                while (true) {
                    Empleado e = new Empleado();
                    e.setNombre(archivoLectura.readUTF());
                    e.setApellido1(archivoLectura.readUTF());
                    e.setApellido2(archivoLectura.readUTF());
                    e.setNickname(archivoLectura.readUTF());
                    e.setContra(archivoLectura.readUTF());
                    if (archivoLectura.readUTF().equalsIgnoreCase("true")) {
                        e.setEstado(true);
                    } else {
                        e.setEstado(false);
                    }
                    Empleados.add(e);

                }
            } catch (Exception e) {
                archivoLectura.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void guardarSucursales() {
        try {
            DataOutputStream archivo = new DataOutputStream(new FileOutputStream("sucursales.txt", false));
            for (int i = 0; i < Sucursales.size(); i++) {
                archivo.writeUTF(Sucursales.get(i).getNombre());
                archivo.writeUTF(Sucursales.get(i).getCiudad());
                archivo.writeUTF(Sucursales.get(i).getDireccion());
                archivo.writeUTF(Sucursales.get(i).getTelefono());
                archivo.writeUTF(Sucursales.get(i).getCorreo());
                if (Sucursales.get(i).isEstado() == true) { // como no se puede escribrir el boleen lo vamos a escribir como un string, por eso esta entre " "
                    archivo.writeUTF("true");
                } else {
                    archivo.writeUTF("false");
                }
            }
            archivo.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void cargarSucursales() {
        try {
            Sucursales = new LinkedList<Sucursal>();

            DataInputStream archivoLectura = new DataInputStream(new FileInputStream("sucursales.txt"));
            try {
                while (true) {
                    Sucursal s = new Sucursal();
                    s.setNombre(archivoLectura.readUTF());
                    s.setCiudad(archivoLectura.readUTF());
                    s.setDireccion(archivoLectura.readUTF());
                    s.setTelefono(archivoLectura.readUTF());
                    s.setCorreo(archivoLectura.readUTF());
                    if (archivoLectura.readUTF().equalsIgnoreCase("true")) {
                        s.setEstado(true);
                    } else {
                        s.setEstado(false);
                    }
                    Sucursales.add(s);

                }
            } catch (Exception e) {
                archivoLectura.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void guardarCategorias() {
        try {
            DataOutputStream archivo = new DataOutputStream(new FileOutputStream("categorias.txt", false));
            for (int i = 0; i < Categorias.size(); i++) {
                archivo.writeUTF(Categorias.get(i).getNombreCategoria());
                archivo.writeUTF(Categorias.get(i).getCaracteristicas());
                if (Categorias.get(i).isEstado() == true) { // como no se puede escribrir el boleen lo vamos a escribir como un string, por eso esta entre " "
                    archivo.writeUTF("true");
                } else {
                    archivo.writeUTF("false");
                }
            }
            archivo.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void cargarCategorias() {
        try {
            Categorias = new LinkedList<Categoria>();

            DataInputStream archivoLectura = new DataInputStream(new FileInputStream("categorias.txt"));
            try {
                while (true) {
                    Categoria c = new Categoria();
                    c.setNombreCategoria(archivoLectura.readUTF());
                    c.setCaracteristicas(archivoLectura.readUTF());
                    if (archivoLectura.readUTF().equalsIgnoreCase("true")) {
                        c.setEstado(true);
                    } else {
                        c.setEstado(false);
                    }
                    Categorias.add(c);

                }
            } catch (Exception e) {
                archivoLectura.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void guardarEquipos() {
        try {
            DataOutputStream archivo = new DataOutputStream(new FileOutputStream("equipos.txt", false));
            for (int i = 0; i < Equipos.size(); i++) {
                archivo.writeUTF(Equipos.get(i).getFechaCreacion());
                archivo.writeUTF(Equipos.get(i).getNombreEquipo());
                archivo.writeUTF(Equipos.get(i).getDescripcion());
                archivo.writeUTF(Equipos.get(i).getNombreCategoria());
                archivo.writeUTF(Equipos.get(i).getNickEmpleado());
                archivo.writeUTF(Equipos.get(i).getNicknameCliente());
                archivo.writeUTF(Equipos.get(i).getNombreSucursal());
                if (Equipos.get(i).isEstado() == true) { // como no se puede escribrir el boleen lo vamos a escribir como un string, por eso esta entre " "
                    archivo.writeUTF("true");
                } else {
                    archivo.writeUTF("false");
                }
            }
            archivo.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void cargarEquipos() {
        try {
            Equipos = new LinkedList<Equipo>();

            DataInputStream archivoLectura = new DataInputStream(new FileInputStream("equipos.txt"));
            try {
                while (true) {
                    Equipo e = new Equipo();
                    e.setFechaCreacion(archivoLectura.readUTF());
                    e.setNombreEquipo(archivoLectura.readUTF());
                    e.setDescripcion(archivoLectura.readUTF());
                    e.setNombreCategoria(archivoLectura.readUTF());
                    e.setNickEmpleado(archivoLectura.readUTF());
                    e.setNicknameCliente(archivoLectura.readUTF());
                    e.setNombreSucursal(archivoLectura.readUTF());

                    if (archivoLectura.readUTF().equalsIgnoreCase("true")) {
                        e.setEstado(true);
                    } else {
                        e.setEstado(false);
                    }
                    Equipos.add(e);

                }
            } catch (Exception e) {
                archivoLectura.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void guardarFacturas() {
        try {
            DataOutputStream archivo = new DataOutputStream(new FileOutputStream("facturas.txt", false));
            for (int i = 0; i < Facturas.size(); i++) {
                archivo.writeUTF(String.valueOf(Facturas.get(i).getNumeroFactura()));
                archivo.writeUTF(Facturas.get(i).getFecha());
                archivo.writeUTF(Facturas.get(i).getNicknameCliente());
                archivo.writeUTF(Facturas.get(i).getNombreEquipo());

                archivo.writeUTF(Facturas.get(i).getNicknameEmpleado());
                archivo.writeUTF(Facturas.get(i).getDetalleReparacion());
                archivo.writeUTF(String.valueOf(Facturas.get(i).getMontoAPagar()));
                if (Facturas.get(i).isEstado() == true) { // como no se puede escribrir el boleen lo vamos a escribir como un string, por eso esta entre " "
                    archivo.writeUTF("true");
                } else {
                    archivo.writeUTF("false");
                }
            }
            archivo.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void cargarFacturas() {
        try {
            Facturas = new LinkedList<Factura>();

            DataInputStream archivoLectura = new DataInputStream(new FileInputStream("facturas.txt"));
            try {
                while (true) {
                    Factura f = new Factura();
                    f.setNumeroFactura(Integer.parseInt(archivoLectura.readUTF()));
                    f.setFecha(archivoLectura.readUTF());
                    f.setNicknameCliente(archivoLectura.readUTF());
                    f.setNombreEquipo(archivoLectura.readUTF());

                    f.setNicknameEmpleado(archivoLectura.readUTF());
                    f.setDetalleReparacion(archivoLectura.readUTF());
                    f.setMontoAPagar(Double.parseDouble(archivoLectura.readUTF()));
                    if (archivoLectura.readUTF().equalsIgnoreCase("true")) {
                        f.setEstado(true);
                    } else {
                        f.setEstado(false);
                    }
                    Facturas.add(f);

                }
            } catch (Exception e) {
                archivoLectura.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
