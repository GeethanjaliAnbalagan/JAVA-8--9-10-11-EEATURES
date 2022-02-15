package com.java.Java9StreamAPIImprovements;



	import java.util.stream.IntStream;

	public class TesterIterate {
	   public static void main(String[] args) {
	      IntStream.iterate(3, x -> x < 10, x -> x+ 3).forEach(System.out::println);
	   } 
	}