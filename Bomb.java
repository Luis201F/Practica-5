/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica5;

import java.util.Random;

/**
 *
 * @author Luis
 */
public class Bomb extends Pajaro{
    public Bomb(String nombre, String color, String tipo){
        super(nombre, color, tipo);
    }
    public void Explotar(){
        Random random = new Random();
        Boolean ord;
        ord=random.nextBoolean();
        if(ord==true)//Ciclo para comprobar si es verdadera
        {
           System.out.println("PUM destruimos todo alrededor, derrotamos a los puerquitos");
        }
        else
        {
            System.out.println("Explotamos un poco antes.");
        }
    }
}
