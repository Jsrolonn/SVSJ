package modelos;

/**
 * Clase que representa un empleado en el sistema.
 * Contiene información personal y el rol del empleado.
 */
public class Empleado {

    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String direccion;
    private String contacto;
    private String rol;

    /**
     * Constructor vacío. Inicializa un objeto Empleado sin valores.
     */
    public Empleado() {}

    /**
     * Constructor con parámetros. Inicializa un objeto Empleado con valores específicos.
     * 
     * @param idEmpleado El ID del empleado.
     * @param nombre El nombre del empleado.
     * @param apellido El apellido del empleado.
     * @param direccion La dirección del empleado.
     * @param contacto El número de contacto del empleado.
     * @param rol El rol del empleado en la empresa.
     */
    public Empleado(int idEmpleado, String nombre, String apellido, String direccion, String contacto, String rol) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.contacto = contacto;
        this.rol = rol;
    }

    /**
     * Obtiene el ID del empleado.
     * @return ID del empleado.
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Establece el ID del empleado.
     * @param idEmpleado El nuevo ID del empleado.
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * Obtiene el nombre del empleado.
     * @return Nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * @param nombre El nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del empleado.
     * @return Apellido del empleado.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del empleado.
     * @param apellido El nuevo apellido del empleado.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene la dirección del empleado.
     * @return Dirección del empleado.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del empleado.
     * @param direccion La nueva dirección del empleado.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el contacto del empleado.
     * @return Contacto del empleado.
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * Establece el contacto del empleado.
     * @param contacto El nuevo contacto del empleado.
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * Obtiene el rol del empleado.
     * @return Rol del empleado.
     */
    public String getRol() {
        return rol;
    }

    /**
     * Establece el rol del empleado.
     * @param rol El nuevo rol del empleado.
     */
    public void setRol(String rol) {
        this.rol = rol;
    }
}
