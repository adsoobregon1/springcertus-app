package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Pago;


public interface PagoServicio {
	
	public List<Pago> listarTodosLosPago();
	
	public Pago guardarCliente(Pago pago);

	public Pago obtenerPagoPorId(Long id);
	
	public Pago actualizarPago(Pago Pago);
	
	public void eliminarPago(Long id);
}
