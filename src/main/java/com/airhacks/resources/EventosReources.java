package com.airhacks.resources;

import java.util.Date;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.airhacks.event.EventoPrueba;

@Path("eventos")
public class EventosReources 
{
	
	@Inject
	
	Event<EventoPrueba> eventoEvento;
	
	@GET
	public String message()
	{
		EventoPrueba evento = new EventoPrueba();
		evento.setNombre("super envento");
		evento.setFechaMovimiento(new Date());
		evento.setTipo(1);
		this.eventoEvento.fire(evento);
		
		return "SE lanzo el evento " + evento.getNombre() ;
	}
	
}
