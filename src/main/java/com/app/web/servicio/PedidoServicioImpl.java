package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Pedido;
import com.app.web.repositorio.PedidoRepositorio;

@Service
public class PedidoServicioImpl implements PedidoServicio {
	
	@Autowired
	private PedidoRepositorio repositorio;
	
	@Override
	public List<Pedido> listarTodosLosPedidos() {
		return repositorio.findAll();
	}

	@Override
	public Pedido guardarPedido(Pedido pedido) {
		return repositorio.save(pedido);
	}

	@Override
	public Pedido obtenerPedidoPorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Pedido actualizarPedido(Pedido pedido) {
		return repositorio.save(pedido);
	}

	@Override
	public void eliminarPedido(Long id) {
		repositorio.deleteById(id);
	}

}
