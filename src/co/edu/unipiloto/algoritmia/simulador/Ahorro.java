/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.algoritmia.simulador;

/**
 *
 * @author jerso
 */
class Ahorro {
    
    //constante
    
    public final static double PORCENTAJE_INTERES=0.6;
    // atributos
    
    private double saldo;
    private double intereses; 

    public Ahorro() {
    }

    public Ahorro(double saldo, double intereses) {
        this.saldo = saldo;
        this.intereses = intereses;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    @Override
    public String toString() {
        return "Ahorro{" + "saldo=" + saldo + ", intereses=" + intereses + '}';
    }
    
    //Metodo de negocio
    public void consignar(double valor){
        this.saldo=this.saldo+valor;
        
    }
    //Calcular el interes de un mes
    public double calcularIntereses(){
        this.intereses=this.saldo*Ahorro.PORCENTAJE_INTERES;
        return this.intereses;
        
        
    }
    //Metodo para retirar de la cuenta de ahorros
    
    public double retirar(double valor){
        this.saldo -=  valor;
        return this.saldo;
        
    }
    
    
    
 }
    

    

