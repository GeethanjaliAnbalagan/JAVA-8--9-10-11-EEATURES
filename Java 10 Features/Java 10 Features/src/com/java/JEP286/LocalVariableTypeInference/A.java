package com.java.JEP286.LocalVariableTypeInference;

// Declaration of variables in static/init
// block using LVTI in Java 10
class A {
    static
    {
        var x = "Hi there";
        System.out.println(x);
    }
    public static void main(String[] ax)
    {
    }
}

