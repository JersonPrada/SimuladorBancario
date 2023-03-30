/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.algoritmia.simulador;

/**
 *
 * @author jerso
 */
class Corriente {
    //atributos
    
    private double saldo;

    public Corriente() {
    }

    public Corriente(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // Mostrar contenido

    @Override
    public String toString() {
        return "Corriente{" + "saldo=" + saldo + '}';
    }
    
    
}
