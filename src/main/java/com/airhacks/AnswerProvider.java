package com.airhacks;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Supplier;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.enterprise.concurrent.ManagedExecutorService;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import static  java.util.concurrent.TimeUnit.SECONDS;

@Stateless
public class AnswerProvider 
{
	@Resource
	ManagedExecutorService mes;
	
	@Inject
	Thinker thinker;
	
	public void onNewQuestion(@Observes Consumer<Object> consumer)
	{
		Supplier<String> answerSupplier = thinker::theAnswer; 
		try 
		{
			CompletableFuture.supplyAsync(answerSupplier, this.mes).thenAccept(consumer).get(1, SECONDS);
		} 
		catch (InterruptedException | ExecutionException | TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
