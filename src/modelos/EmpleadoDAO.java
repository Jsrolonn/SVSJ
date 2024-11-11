package modelos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase EmpleadoDAO que gestiona las operaciones CRUD para la entidad Empleado.
 * Esta clase interactúa con la base de datos para realizar las operaciones necesarias.
 */
public class EmpleadoDAO {

    private static final String SQL_SELECT = "SELECT idEmpleado, nombre, apellido, direccion, contacto, rol FROM empleado";
    private static final String SQL_INSERT = "INSERT INTO empleado (idEmpleado, nombre, apellido, direccion, contacto, rol) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE empleado SET nombre = ?, apellido = ?, direccion = ?, contacto = ?, rol = ? WHERE idEmpleado = ?";
    private static final String SQL_DELETE = "DELETE FROM empleado WHERE idEmpleado = ?";

    /**
     * Listar todos los empleados (READ).
     * 
     * @return una lista de empleados.
     */
    public List<Empleado> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Empleado empleado = null;
        List<Empleado> empleados = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idEmpleado = rs.getInt("idEmpleado");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String direccion = rs.getString("direccion");
                String contacto = rs.getString("contacto");
                String rol = rs.getString("rol");

                empleado = new Empleado(idEmpleado, nombre, apellido, direccion, contacto, rol);
                empleados.add(empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return empleados;
    }

    /**
     * Insertar un nuevo empleado (CREATE).
     * 
     * @param empleado el empleado a insertar.
     * @return el número de registros afectados.
     */
    public int insertar(Empleado empleado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, empleado.getIdEmpleado());
            stmt.setString(2, empleado.getNombre());
            stmt.setString(3, empleado.getApellido());
            stmt.setString(4, empleado.getDireccion());
            stmt.setString(5, empleado.getContacto());
            stmt.setString(6, empleado.getRol());
            registros = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return registros;
    }

    /**
     * Actualizar un empleado existente (UPDATE).
     * 
     * @param empleado el empleado a actualizar.
     * @return el número de registros afectados.
     */
    public int actualizar(Empleado empleado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, empleado.getNombre());
            stmt.setString(2, empleado.getApellido());
            stmt.setString(3, empleado.getDireccion());
            stmt.setString(4, empleado.getContacto());
            stmt.setString(5, empleado.getRol());
            stmt.setInt(6, empleado.getIdEmpleado());
            registros = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return registros;
    }

    /**
     * Eliminar un empleado (DELETE).
     * 
     * @param empleado el empleado a eliminar.
     * @return el número de registros afectados.
     */
    public int eliminar(Empleado empleado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, empleado.getIdEmpleado());
            registros = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return registros;
    }
}
