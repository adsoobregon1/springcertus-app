package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Parrillas", nullable = false, length = 50)
	private String parrillas;
	
	@Column(name = "Chifas", nullable = false, length = 50)
	private String chifas;
	
	@Column(name = "Bebidas", nullable = false, length = 50)
	private String bebidas;
	
	public Producto() {
		
	}

	public Producto(Long id, String parrillas, String chifas, String bebidas) {
		super();
		this.id = id;
		this.parrillas = parrillas;
		this.chifas = chifas;
		this.bebidas = bebidas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getParrillas() {
		return parrillas;
	}

	public void setParrillas(String parrillas) {
		this.parrillas = parrillas;
	}

	public String getChifas() {
		return chifas;
	}

	public void setChifas(String chifas) {
		this.chifas = chifas;
	}

	public String getBebidas() {
		return bebidas;
	}

	public void setBebidas(String bebidas) {
		this.bebidas = bebidas;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", parrillas=" + parrillas + ", chifas=" + chifas + ", bebidas=" + bebidas + "]";
	}

	
	
	
	
	
}
