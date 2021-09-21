/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Main {
    public static  void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pajaro> pajaros=new ArrayList<>();
        Red pajaro=new Red("Red","Rojo","Cardenal Rojo");
        pajaros.add(pajaro);
        Chuck pajaro1 =new Chuck("Chuck","Amarillo","Canario");
        pajaros.add(pajaro1);
        Bomb pajaro2=new Bomb("Bomb","Negro","Cuervo");
        pajaros.add(pajaro2);
        int opcion=0;
        do{
        System.out.println("-------Bienvenido a Angry Birds-------\n"+
                "Seleccione un personaje.\n"+
                    "1. Red.\n" +
                    "2. Chuck.\n" +
                    "3. Bomb.\n" +       //Impresion de las opciones del menu
                    "4. Salir.\n");
            System.out.println("ingrese una opcion:");
            opcion= scanner.nextInt();//Ingreso de la opcion del usuario
            switch(opcion){
                case 1:{
                    System.out.println("Mi nombre es:"+pajaros.get(0).getNombre());
                    System.out.println("Color:"+pajaros.get(0).getColor());
                    System.out.println("En el mundo real soy un tipo de pajaro:"+pajaros.get(0).getTipo());
                    pajaros.get(0).Lanzar();
                    pajaro.Grito();
                    break;
                }
                case 2:{
                    System.out.println("Mi nombre es:"+pajaros.get(1).getNombre());
                    System.out.println("Color:"+pajaros.get(1).getColor());
                    System.out.println("En el mundo real soy un tipo de pajaro:"+pajaros.get(1).getTipo());
                    pajaros.get(1).Lanzar();
                    pajaro1.Acelera();
                    break;
                }
                case 3:{
                    System.out.println("Mi nombre es:"+pajaros.get(2).getNombre());
                    System.out.println("Color:"+pajaros.get(2).getColor());
                    System.out.println("En el mundo real soy un tipo de pajaro:"+pajaros.get(2).getTipo());
                    pajaros.get(2).Lanzar();
                    pajaro2.Explotar();
                    break;
                }
                case 4:{
                    System.out.println("Fin del juego.");
                    break;
                }
                default:{
                    System.out.println("Ingresaste una opcion incorrecta.");
                    break;
                }
                
            }
    }while(opcion>=1 && opcion<=3);
    }
}
