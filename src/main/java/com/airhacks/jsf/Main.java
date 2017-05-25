package com.airhacks.jsf;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args)
	{
		 final Function<String, Predicate<String>> startsWithLetter = 
				 (String letter) -> (String name) -> name.startsWith(letter); 
	
		Function<String, Integer> func = s->0;
		
		Predicate<String> pre = s->true;
		
		Function<String, Predicate<String>> func3 = s->pre;
		
				 
				 startsWithLetter.apply("R");
	}
}
