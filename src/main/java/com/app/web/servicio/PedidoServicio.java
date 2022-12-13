package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Pedido;

public interface PedidoServicio {
	
	public List<Pedido> listarTodosLosPedidos();
	
	public Pedido guardarPedido(Pedido pedido);

	public Pedido obtenerPedidoPorId(Long id);
	
	public Pedido actualizarPedido(Pedido pedido);
	
	public void eliminarPedido(Long id);
}
