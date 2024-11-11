package modelos;

import java.sql.*;

/**
 * Clase para gestionar la conexión a la base de datos MySQL utilizando JDBC.
 * Proporciona métodos para obtener y cerrar conexiones, y para manejar 
 * operaciones relacionadas con ResultSet y PreparedStatement.
 */
public class Conexion {

    // Valores de conexion a MySQL
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String JDBC_URL = "jdbc:mysql://localhost/svsj?useSSL=false";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "";
    private static Driver driver = null;

    /**
     * Obtiene una conexión a la base de datos.
     * Este método es synchronized para evitar problemas de concurrencia.
     * 
     * @return Connection objeto que representa la conexión a la base de datos.
     * @throws SQLException si ocurre algún error durante la conexión.
     */
    public static synchronized Connection getConnection() throws SQLException {
        if (driver == null) {
            try {
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
            } catch (Exception e) {
                System.out.println("Fallo en cargar el driver JDBC");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }

    /**
     * Cierra el objeto ResultSet.
     * 
     * @param rs El ResultSet a cerrar.
     */
    public static void close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    /**
     * Cierra el objeto PreparedStatement.
     * 
     * @param stmt El PreparedStatement a cerrar.
     */
    public static void close(PreparedStatement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    /**
     * Cierra la conexión a la base de datos.
     * 
     * @param conn La conexión a cerrar.
     */
    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
