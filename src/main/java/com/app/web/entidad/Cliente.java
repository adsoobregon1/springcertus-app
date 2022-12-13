package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Nombres", nullable = false, length = 50)
	private String cliente;
	
	@Column(name = "Apellidos", nullable = false, length = 50)
	private String Apellidos;
	
	@Column(name = "Genero", nullable = false, length = 50, unique = true)
	private String genero;
	
	public Cliente() {
		
	}

	public Cliente(Long id, String cliente, String apellidos, String genero) {
		super();
		this.id = id;
		this.cliente = cliente;
		Apellidos = apellidos;
		this.genero = genero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", cliente=" + cliente + ", Apellidos=" + Apellidos + ", genero=" + genero + "]";
	}

	
	
	
	
	
}
