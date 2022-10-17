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
        
        var retorno = "El empleado se llama: " + this.nombre+ " ha trabajado "
                + this.horasTrabajadas + " horas, "+ "cobrando " +
                this.costoHora+ " por hora " + "generando al año un ingreso de "
                + this.yearIngreso + " dolares";
        
        return retorno;
    }
    
    public double calcularIngresos(int yearActual){
        
      var antiguedad=0.0d;
        var retorno=0.0d;
        var porcentaje=0.0d;
        var horaExtra=0;
        if (this.horasTrabajadas<=160){
            porcentaje=(((yearActual)-this.yearIngreso)*2)/100;
            antiguedad=(this.costoHora*this.horasTrabajadas*porcentaje);
            retorno=(this.costoHora*this.horasTrabajadas)+antiguedad;
            return retorno;
        }else{
            porcentaje=(((yearActual)-this.yearIngreso)*2)/100;
            horaExtra=this.horasTrabajadas-160;
            antiguedad=(this.costoHora*(this.horasTrabajadas-horaExtra)*porcentaje);
            retorno=(this.costoHora*(this.horasTrabajadas-horaExtra))+antiguedad;
            return retorno;
        }
    }
     
    
    public double calcularBonosHorasExtra(){
        
     var retorno=0.0d;
        if(this.horasTrabajadas>160){
            var horaExtra=0;
            horaExtra=(this.horasTrabajadas-160)*2;
            retorno=this.costoHora*horaExtra;
            return retorno;
        }else{
            retorno=0;
            return retorno;
        }
       
    }
    
    public double calcularImpuestos(int limite1, int limite2, int limite3){
        
        var retorno=0.0d;
        var basico = this.costoHora*this.horasTrabajadas;
        if (basico>limite1 && basico< limite2) {
            retorno = basico*0.05;
        }
        else{
            if (basico> limite2 && basico < limite3){
                retorno= basico*0.12;
            }
        else {
                if (basico>limite3){
                retorno=basico*0.25;
               
                }
             }
                
        }
        
        return retorno;
    }
    
     public double calcularTotal(int yearActual,int limite1,int limite2,int limite3 ){
        var retorno= 0.0d;
        retorno=this.calcularIngresos(yearActual)+this.calcularBonosHorasExtra()
                -this.calcularImpuestos(limite1, limite2, limite3);
        
        return retorno;         
    }
    
   
}
