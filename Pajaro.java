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
public class Pajaro {
    public String nombre;
    public String color;
    public String tipo;
    public Pajaro(String nombre, String color, String tipo){
        setNombre(nombre);
        setColor(color);
        setTipo(tipo);
    }
    public Pajaro(){
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }
    public void Lanzar(){
        Random random = new Random();
        Boolean ord;
        ord=random.nextBoolean();
        if(ord==true)//Ciclo para comprobar si es verdadera
        {
           System.out.println("El lanzamiento fue exitoso, derrotamos a los puerquitos");
        }
        else
        {
            System.out.println("Vaya tendremos que seguir afinando la punteria.");
        }
    }
}
