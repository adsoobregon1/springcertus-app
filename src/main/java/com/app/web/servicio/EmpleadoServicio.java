package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Empleado;


public interface EmpleadoServicio {
	
	public List<Empleado> listarTodosLosClientes();
	
	public Empleado guardarEmpleado(Empleado empleado);

	public Empleado obtenerEmpleadoPorId(Long id);
	
	public Empleado actualizarEmpleado(Empleado Empleado);
	
	public void eliminarEmpleado(Long id);
}
