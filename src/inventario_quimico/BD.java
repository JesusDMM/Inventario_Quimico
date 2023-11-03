package inventario_quimico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;

public class BD {

    static Connection con;
    static PreparedStatement ps;
    static Statement st;
    static ResultSet rs;

    public BD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Inventario", "root", "JESUSdaniel444");
            st = con.createStatement();
            ps = con.prepareStatement("");
            rs = st.executeQuery("");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public boolean Inicio_Sesion(String Nombre, String Contraseña) {
        try {
            ps = con.prepareStatement("Select * from Personal where Nombre = ? and Contraseña = ?");
            ps.setString(1, Nombre);
            ps.setString(2, Contraseña);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return false;
    }

    public boolean Ingresar_Producto(String Nombre, String Tipo, String Marca, String Modelo, String Serie, int Cantidad,
            String Ubicacion, String Especificaciones) {
        try {
            ps = con.prepareStatement("Insert into Material values (?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, Nombre);
            ps.setString(3, Tipo);
            ps.setString(4, Marca);
            ps.setString(5, Modelo);
            ps.setString(6, Serie);
            ps.setInt(7, Cantidad);
            ps.setString(8, Ubicacion);
            ps.setString(9, Especificaciones);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.print(e);
        }
        return false;
    }

    public boolean Actualizar_Producto(String Nombre, String Tipo, String Marca, String Modelo, String Serie, int Cantidad,
            String Ubicacion, String Especificaciones, int id) {
        try {
            ps = con.prepareStatement("Update Material set Nombre = ?, Tipo = ?, Marca = ?, Modelo = ?, Serie = ?, Cantidad = ?, Ubicacion = ?, "
                    + "Especificaciones = ? where id = ?");
            ps.setString(1, Nombre);
            ps.setString(2, Tipo);
            ps.setString(3, Marca);
            ps.setString(4, Modelo);
            ps.setString(5, Serie);
            ps.setInt(6, Cantidad);
            ps.setString(7, Ubicacion);
            ps.setString(8, Especificaciones);
            ps.setInt(9, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.print(e);
        }
        return false;
    }

    public boolean Eliminar_Producto(int id) {
        try {
            ps = con.prepareStatement("Delete from Material where id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.print(e);
        }
        return false;
    }

    public boolean Mostra_un_Producto(String datos[], int id) {
        try {
            st = con.createStatement();
            rs = st.executeQuery("Select * from Material where id = " + id);
            while (rs.next()) {
                datos[0] = rs.getInt(1) + "";
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getInt(7) + "";
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
            }
            return true;
        } catch (Exception e) {
            System.err.print(e);
        }
        return false;
    }

    public boolean mostrar_materiales(DefaultTableModel modelo) {
        String datos[] = new String[9];
        try {
            st = con.createStatement();
            rs = st.executeQuery("Select * from Material");
            while (rs.next()) {
                datos[0] = rs.getInt(1) + "";
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getInt(7) + "";
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                modelo.addRow(datos);
            }
            return true;
        } catch (Exception e) {
            System.out.println("El error es " + e);
        }

        return false;
    }

    public boolean Ingresar_Prestamo(String Fecha_I, String Fecha_F, String Nombre, String Matricula, int id_Material,
            int Cantidad, int Devuelto) {
        try {
            ps = con.prepareStatement("Insert into Historial values (?,?,?,?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, Fecha_I);
            ps.setString(3, Fecha_F);
            ps.setString(4, Nombre);
            ps.setString(5, Matricula);
            ps.setInt(6, id_Material);
            ps.setInt(7, Cantidad);
            ps.setInt(8, Devuelto);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.print(e);
        }
        return false;
    }

    public boolean Actualizar_Prestamo(String Fecha_I, String Fecha_F, String Nombre, String Matricula, int id_Material,
            int Cantidad, int Devuelto, int id) {
        try {
            ps = con.prepareStatement("Update Historial set Fecha_I = ?, Fecha_F = ?, Nombre = ?, Matricula = ?, id_Material = ?,"
                    + " Cantidad = ?, Devuelto = ? where id = ?");
            ps.setString(1, Fecha_I);
            ps.setString(2, Fecha_F);
            ps.setString(3, Nombre);
            ps.setString(4, Matricula);
            ps.setInt(5, id_Material);
            ps.setInt(6, Cantidad);
            ps.setInt(7, Devuelto);
            ps.setInt(8, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.print(e);
        }
        return false;
    }

    public boolean Mostra_un_Registro(String datos[], int id) {
        try {
            st = con.createStatement();
            rs = st.executeQuery("Select * from Historial where id = " + id);
            while (rs.next()) {
                datos[0] = rs.getInt(1) + "";
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getInt(6) + "";
                datos[6] = rs.getInt(7) + "";
                datos[7] = rs.getInt(8) + "";
            }
            return true;
        } catch (Exception e) {
            System.err.print(e);
        }
        return false;
    }

    public boolean mostrar_Prestamos(DefaultTableModel modelo) {
        String datos[] = new String[8];
        try {
            st = con.createStatement();
            rs = st.executeQuery("Select * from Historial");
            while (rs.next()) {
                datos[0] = rs.getInt(1) + "";
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getInt(6) + "";
                datos[6] = rs.getInt(7) + "";
                datos[7] = rs.getInt(8) + "";
                modelo.addRow(datos);
            }
            return true;
        } catch (Exception e) {
            System.out.println("El error es " + e);
        }
        return false;
    }

}
