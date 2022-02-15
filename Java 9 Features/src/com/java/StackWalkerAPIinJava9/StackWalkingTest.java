package com.java.StackWalkerAPIinJava9;

import java.util.List;
import java.util.stream.Collectors;
public class StackWalkingTest {
	
   public static void main(String args[]) {
	   
      final List<StackWalker.StackFrame> stack = StackWalker.getInstance()
      .walk(s -> s.collect(Collectors.toList()));
      for(StackWalker.StackFrame sf : stack) {
         System.out.println(sf.getClassName() + "::" + sf.getMethodName() + ":" + sf.getLineNumber());
      }
   }
}