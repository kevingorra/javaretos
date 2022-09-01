package org.example;

import clases.Calculadora;
import clases.Personaje;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Personaje personaje1=new Personaje("Raton",90,50,7,18,100);

        //Personaje personaje2=new Personaje("pikachu",95,32,4,18,100);

        //generar un numero Aleatorio entre 0 y 1

        Calculadora calculadora = new Calculadora();


        int observador = 100;


        Scanner lea=new Scanner(System.in);
        System.out.println("*** Menu ***");
        System.out.println("1. Sumar ");
        System.out.println("2. Restar  ");
        System.out.println("3. Dividir ");
        System.out.println("4. Multiplicar ");
        System.out.println("5. Salir");

        while (observador != 5){

            System.out.println("digite un opcion : ");
            observador= lea.nextInt();


            if (observador==1){
                System.out.println("Digite el numero 1");
                calculadora.setNumero1(lea.nextInt());
                System.out.println("Digite el numero 2");
                calculadora.setNumero2(lea.nextInt());


                System.out.println(calculadora.sumar());

            } else if (observador==2) {

                System.out.println("Digite el numero 1");
                calculadora.setNumero1(lea.nextInt());
                System.out.println("Digite el numero 2");
                calculadora.setNumero2(lea.nextInt());


                System.out.println(calculadora.restar());

            } else if (observador==3) {
                System.out.println("Digite el numero 1");
                calculadora.setNumero1(lea.nextInt());
                System.out.println("Digite el numero 2");
                calculadora.setNumero2(lea.nextInt());


                System.out.println(calculadora.multiplicar());

            } else if (observador==4) {
                System.out.println("Digite el numero 1");
                calculadora.setNumero1(lea.nextInt());
                System.out.println("Digite el numero 2");
                calculadora.setNumero2(lea.nextInt());


                System.out.println(calculadora.dividir());

            } else if (observador==5) {
                System.out.println("eligio la opcion 5");
                break;

            } else {
                            System.out.println("Digita una opcion Valida");
                            }

        }






    }
}