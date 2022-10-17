/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author USUARIO
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        
        var empleado1 = new Empleado();
        
        empleado1.nombre="Sebastian Armijos";
        empleado1. horasTrabajadas= 150;
        empleado1.costoHora=5.50;
        empleado1.yearIngreso=2011;
        
        System.out.println(empleado1.mostrarInfo());
        System.out.println("El empleado gana un total de: "
                + ""+empleado1.calcularIngresos(2022)+" $");
        System.out.println("El empleado gana un total de horas extras de: "
                +empleado1.calcularBonosHorasExtra()+" $");
        System.out.println("El empleado paga de impusto: "
             +empleado1.calcularImpuestos(1000, 2000, 3000));
        System.out.println("El empleado gana un total de: "
                +empleado1.calcularTotal
        (2022, 1000, 2000, 3000)+" $");
        
        var empleado2 = new Empleado();
        
        empleado2.nombre="Alex Lopez";
        empleado2.horasTrabajadas=170;
        empleado2.costoHora=5.50;
        empleado2.yearIngreso=500;
        
        System.out.println(empleado2.mostrarInfo());
        System.out.println("El empleado gana un total de: "
                +empleado2.calcularIngresos(2022)+" $");
        System.out.println("El empleado gana un total de horas extras de: "
                +empleado2.calcularBonosHorasExtra()+" $");
        System.out.println("El empleado paga de impusto: "
             +empleado2.calcularImpuestos(1000, 2000, 3000));
        System.out.println("El empleado gana un total de: "
                +empleado2.calcularTotal
        (2022, 1000, 2000, 3000)+" $");
        
        var empleado3 = new Empleado();
        
        empleado3.nombre= "Mariana Torres";
        empleado3.horasTrabajadas= 160;
        empleado3.costoHora=5.50;
        empleado3.yearIngreso=400;
        
        System.out.println(empleado3.mostrarInfo());
         System.out.println("El empleado gana un total de: "
                 +empleado3.calcularIngresos(2022)+" $");
        System.out.println("El empleado gana un total de horas extras de: "
                +empleado3.calcularBonosHorasExtra()+" $");
        System.out.println("El empleado paga de impusto: "
             +empleado3.calcularImpuestos(1000, 2000, 3000));
        System.out.println("El empleado gana un total de: "
                +empleado3.calcularTotal
        (2022, 1000, 2000, 3000)+" $");
        
        
        
        
        
    }
    
    
    

    
    
    
}
