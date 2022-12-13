package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Empleado", nullable = false, length = 50)
	private String empleados;
	
	@Column(name = "Puesto", nullable = false, length = 50)
	private String puesto;
	
	@Column(name = "Contrato", nullable = false, length = 50, unique = true)
	private String contrato;
	
	public Empleado() {
		
	}

	public Empleado(Long id, String empleados, String puesto, String contrato) {
		super();
		this.id = id;
		this.empleados = empleados;
		this.puesto = puesto;
		this.contrato = contrato;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpleados() {
		return empleados;
	}

	public void setEmpleados(String empleados) {
		this.empleados = empleados;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", empleados=" + empleados + ", puesto=" + puesto + ", contrato=" + contrato
				+ "]";
	}

	
	
	
	
	
}
