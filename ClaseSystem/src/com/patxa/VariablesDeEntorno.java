package com.patxa;

import java.util.Map;

public class VariablesDeEntorno {

    public static void main(String[] args) {


        System.out.println(System.getenv("PATH"));

        Map<String, String> todas = System.getenv();

        System.out.println(todas);


    }
}
