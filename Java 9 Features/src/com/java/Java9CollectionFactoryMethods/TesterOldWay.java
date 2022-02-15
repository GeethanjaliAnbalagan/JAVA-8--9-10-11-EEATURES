package com.java.Java9CollectionFactoryMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TesterOldWay {
   public static void main(String []args) {
      Set<String> set = new HashSet<>();
      set.add("A");
      set.add("B");
      set.add("C");
      set = Collections.unmodifiableSet(set);
      System.out.println(set);
      List<String> list = new ArrayList<>();

      list.add("A");
      list.add("B");
      list.add("C");
      list = Collections.unmodifiableList(list);
      System.out.println(list);
      Map<String, String> map = new HashMap<>();

      map.put("A","Apple");
      map.put("B","Boy");
      map.put("C","Cat");
      map = Collections.unmodifiableMap(map);
      System.out.println(map);
   }
}