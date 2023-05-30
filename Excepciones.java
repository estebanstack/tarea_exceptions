package com.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excepciones {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 0;
            int result = a/b;
            System.out.println(result);
        }catch (ArithmeticException e) {
            System.out.println("No se puede hacer la operacion " + e.getClass());
        }
        try{
            int[] numeros = new int[6];
            numeros[0] = 1;
            numeros[1] = 1;
            numeros[2] = 1;
            numeros[3] = 1;
            numeros[4] = 1;
            numeros[5] = 1;
            numeros[6] = 1;
            numeros[7] = 1;
            numeros[8] = 1;
            numeros[9] = 2;

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR al recorrer array " +e.getClass());
        }

        try {
            FileInputStream in = new FileInputStream("Hola.txt");
        } catch (FileNotFoundException e){
            System.out.println("Fichero no encontrado "+ e.getMessage());
        }
    }




}
