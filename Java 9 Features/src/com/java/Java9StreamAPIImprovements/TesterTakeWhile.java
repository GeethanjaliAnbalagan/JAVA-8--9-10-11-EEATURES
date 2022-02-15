package com.java.Java9StreamAPIImprovements;



	import java.util.stream.Stream;

	public class TesterTakeWhile {
	   public static void main(String[] args) {
	      Stream.of("a","b","c","","e","f").takeWhile(s->!s.isEmpty())
	         .forEach(System.out::print);		 
	   } 
	}