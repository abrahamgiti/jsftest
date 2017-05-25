package com.airhacks.event;

import java.util.Date;

public class EventoPrueba 
{
	private String nombre;
	private Date fechaMovimiento;
	private int tipo;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaMovimiento() {
		return fechaMovimiento;
	}
	public void setFechaMovimiento(Date fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "EventoPrueba [nombre=" + nombre + ", fechaMovimiento=" + fechaMovimiento + ", tipo=" + tipo + "]";
	}
	
	
	
	

}
