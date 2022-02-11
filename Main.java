package com.company;


public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i != 11){
            for (int l = 1; l <= 10; l++){
                System.out.println(i + " * " + l + " = " + (i * l));
            }
            System.out.println(" ");
            i++;
        }
    }
}
