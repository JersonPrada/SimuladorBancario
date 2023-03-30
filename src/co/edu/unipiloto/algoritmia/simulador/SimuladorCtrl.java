/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unipiloto.algoritmia.simulador;

/**
 *
 * @author jerso
 */
public class SimuladorCtrl {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        Banco miBanco=new Banco();
        miBanco.setNombre("Banco Aval");
        miBanco.setCorreo("BancoAval@gmail.com");
        miBanco.setNit("102290000");
        System.out.println(" DATOS DEL BANCO "+miBanco.toString());
        
        //crea cuentas ahorro, corriente y ctd
        
        Ahorro ahorro01=new Ahorro(1400000,0);
        Corriente corriente01=new Corriente(600000);
        CDT cdt01=new CDT();
        
        //Crear ceunta
       Cuenta miCuenta=new Cuenta("Jerson Prada", "Jersonprada@gmail.com", "1022937237", ahorro01, corriente01, cdt01, 0);
       
        //Asociar la cuenta
        miBanco.setPrimera(miCuenta);
        
        //Mostrar banco
        System.out.println("DATOS DEL BANCO "+miBanco.toString());
        
        //Relacionar cuentas ahorro, corriente y cdt a mi cuenta
        miCuenta.setAhorro(ahorro01);
        miCuenta.setCorriente(corriente01);
        miCuenta.setCdt(cdt01);
        
        // Consignar en ahorros
        System.out.println("Cuenta de ahorros "+ahorro01.toString());
        ahorro01.consignar(400000);
        System.out.println("cuenta ahorros consigna 400000 "+ahorro01.toString());
        
        //Calcular intereses
        System.out.println("Los intereses son "+ahorro01.calcularIntereses());
        
        //Retirar de ahorros
        System.out.println("Retiro de 80000 es "+ ahorro01.retirar(80000));
        System.out.println("Cuenta de ahorros "+ahorro01.toString());
        
        //Apertura de un CDT
        System.out.println("Activar el  CDT");
        cdt01.abrirCDT(new Fecha(21,03,23), 2400000,2);
        System.out.println("CDT"+cdt01.toString());
        
        
    
    
        
        
        
        
        
        
        
  
    }
    
}
