package com.example.objects;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Napis");
        System.out.println("Kolejny napis");
    }

    public static void print(){

    }

    public void printArray(ArrayList<Double> array){
        for(Double element : array)
            System.out.println("Element: "+element);
    }
}
