package com.airhacks.event;

import javax.enterprise.event.Observes;

public class EventosPruebaListener 
{
	
	public void escuchoEventoPrueba(@Observes EventoPrueba evento)
	{
		System.out.println("Se lanza el vento " + evento);
	}
	

}
