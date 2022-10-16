/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    
    String nombre;
    int horasTrabajadas; 
    double costoHora;
    int yearIngreso;
    
    public String mostrarInfo(){
        
        var retorno = "El empleado se llama: " + this.nombre+ "ha trabajado "
                + this.horasTrabajadas + "cobrando por hora " + 
                "generando al año un ingrso de: " + this.yearIngreso;
        
        return retorno;
    }
    
    public double calcularIngresos(int yearActual){
        
        var retorno=0.0d;
      
       
        return retorno;
    }
    
    public double calcularBonosHorasExtra(){
        
        var retorno=0.0;
        
        return retorno;
        
    }
    
    public double calcularImpuestos(int limite1, int limite2, int limite3){
        
        var retorno=0.0;
        
        return retorno;
    }
    
    public double calcularTotal(){
        
        var retorno=0.0;
        
        return retorno;
    }
   
}
