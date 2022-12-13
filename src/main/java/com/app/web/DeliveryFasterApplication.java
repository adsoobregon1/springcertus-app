package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Pedido;
import com.app.web.repositorio.PedidoRepositorio;

@SpringBootApplication
public class DeliveryFasterApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DeliveryFasterApplication.class, args);
	}
	
	@Autowired
	private PedidoRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		Pedido pedido1 = new Pedido("Adso", "Pachacutecc", "adso@google.com");
		repositorio.save(pedido1);
		
		Pedido pedido2 = new Pedido("Martin", "CerroColorado", "martin@google.com");
		repositorio.save(pedido2);
		*/
	}

}