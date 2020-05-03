package com.uca.tarea4.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	@Pattern(regexp="\\d{12}",message="El campo codigo debe tener 12 digitos")
    String codigo;
	@Size(min=1, max=100, message = "El campo nombre del producto debe tener una longitud entre 1 y 100 caracteres.")
    String nombreProducto;
	@Size(min=1, max=100, message = "El campo marca debe tener una longitud entre 1 y 100 caracteres.")
    String marca;
	@Size(min=1, max=500, message = "El campo descripcion debe tener una longitud entre 1 y 500 caracteres.")
    String descripcion;
	@Pattern(regexp="\\d{6}", message="El campo existencia debe estar compuesto de digitos ")
    String existencias;
	@Pattern(regexp="^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$",message="El campo fecha debe ser fomato dd/mm/yyyy")
    String fechaIngreso;

    
    
    
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getExistencias() {
		return existencias;
	}

	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	

}
