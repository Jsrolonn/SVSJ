package controladores;

import modelos.Empleado;
import modelos.EmpleadoDAO;

/**
 * Clase EmpleadoController que gestiona las operaciones relacionadas con los empleados.
 * Utiliza EmpleadoDAO para realizar operaciones CRUD.
 */
public class EmpleadoController {
    private EmpleadoDAO empleadoDAO;

    public EmpleadoController() {
        empleadoDAO = new EmpleadoDAO();
    }

    /**
     * Agregar un nuevo empleado.
     * 
     * @param id el ID del nuevo empleado.
     * @param nombre el nombre del empleado.
     * @param apellido el apellido del empleado.
     * @param direccion la dirección del empleado.
     * @param contacto el contacto del empleado.
     * @param rol el rol del empleado.
     */
    public void agregarEmpleado(int id, String nombre, String apellido, String direccion, String contacto, String rol) {
        Empleado empleado = new Empleado(id, nombre, apellido, direccion, contacto, rol);
        empleadoDAO.insertar(empleado);
    }

    /**
     * Actualizar un empleado existente.
     * 
     * @param id el ID del empleado a actualizar.
     * @param nombre el nuevo nombre del empleado.
     * @param apellido el nuevo apellido del empleado.
     * @param direccion la nueva dirección del empleado.
     * @param contacto el nuevo contacto del empleado.
     * @param rol el nuevo rol del empleado.
     */
    public void actualizarEmpleado(int id, String nombre, String apellido, String direccion, String contacto, String rol) {
        Empleado empleado = new Empleado(id, nombre, apellido, direccion, contacto, rol);
        empleadoDAO.actualizar(empleado);
    }

    /**
     * Eliminar un empleado.
     * 
     * @param id el ID del empleado a eliminar.
     */
    public void eliminarEmpleado(int id) {
        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(id);
        empleadoDAO.eliminar(empleado);
    }

    /**
     * Listar todos los empleados.
     * Este método imprime el nombre y apellido de todos los empleados.
     */
    public void listarEmpleados() {
        empleadoDAO.listar().forEach(e -> {
            System.out.println(e.getNombre() + " " + e.getApellido());
        });
    }
}
