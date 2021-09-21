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
public class Chuck extends Pajaro {
    public Chuck(String nombre, String color, String tipo){
        super(nombre, color, tipo);
    }
    public void Acelera(){
        Random random = new Random();
        Boolean ord;
        ord=random.nextBoolean();
        if(ord==true)//Ciclo para comprobar si es verdadera
        {
           System.out.println("Habilidad activada, derrotamos a los puerquitos");
        }
        else
        {
            System.out.println("Se activo la habilidad pero fallamos, tendremos que seguir practicando.");
        }
    }
}
