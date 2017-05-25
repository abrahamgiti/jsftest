package com.airhacks;

import java.util.function.Consumer;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;

@Stateless
@Path("answers")
public class AnswerReources 
{
	@Inject
	Event<Consumer<Object>> events;
	
	@GET
	public void answer(@Suspended AsyncResponse response)
	{
		Consumer<Object> consumer = response::resume;
		events.fire(consumer);
		
	}
	
	@GET
	@Path("/asww")
	public String answer()
	{
		return "aswer";
		
	}
	
}
