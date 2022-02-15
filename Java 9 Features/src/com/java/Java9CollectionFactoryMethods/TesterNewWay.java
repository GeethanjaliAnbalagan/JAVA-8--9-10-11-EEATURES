package com.java.Java9CollectionFactoryMethods;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.List;
	import java.util.AbstractMap;
	import java.util.Map;
	import java.util.Set;


public class TesterNewWay {

	   public static void main(String []args) {
	      Set<String> set = Set.of("A", "B", "C");      
	      System.out.println(set);
	      List<String> list = List.of("A", "B", "C");
	      System.out.println(list);
	      Map<String, String> map = Map.of("A","Apple","B","Boy","C","Cat");
	      System.out.println(map);
	  
	      Map<String, String> map1 = Map.ofEntries (
	         new AbstractMap.SimpleEntry<>("A","Apple"),
	         new AbstractMap.SimpleEntry<>("B","Boy"),
	         new AbstractMap.SimpleEntry<>("C","Cat"));
	      System.out.println(map1);
	   }
	}