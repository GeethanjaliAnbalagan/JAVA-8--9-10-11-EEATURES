package com.java.JEP286.LocalVariableTypeInference;

import java.util.List;

public class Tester {
    public static void main(String[] args) {
        var names = List.of("Julie", "Robert", "Chris", "Joseph");
        for (var name : names) {
            System.out.println(name);
        }
        System.out.println("");
        for (var i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}