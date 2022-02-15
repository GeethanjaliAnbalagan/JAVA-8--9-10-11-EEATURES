package com.java.Java9StreamAPIImprovements;

	import java.util.stream.Stream;

	public class TesterDropWhile {
	   public static void main(String[] args) {
	      Stream.of("a","b","c","","e","f").dropWhile(s-> !s.isEmpty())
	         .forEach(System.out::print);
	      
	      System.out.println();
	      Stream.of("a","b","c","","e","","f","g").dropWhile(s-> !s.isEmpty())
	         .forEach(System.out::print);
	   } 
	}