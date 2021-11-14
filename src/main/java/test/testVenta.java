/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import modelo.producto.Bicicleta;
import modelo.producto.Especialidad;
import modelo.producto.Stock;
import modelo.cliente.*;
import Venta.*;
import java.util.Scanner;

public class testVenta {
    public static void main(String[] args) {
        
        //Creación de objetos de tipo Especialidad//
        
        Especialidad objEspCompeticion= new Especialidad(1, "COMPETICION");
        Especialidad objEspSport= new Especialidad(2, "SPORT");
        Especialidad objEspComun= new Especialidad(3, "COMUN");
        
        //Creación de objetos de tipo Bicicleta//
             
        Bicicleta bici1= new Bicicleta("TOP MEGA", "SUNSHIN", "29", "RUTA", objEspCompeticion, 60000);
        Bicicleta bici2= new Bicicleta("FIERCE", "FM18F6SM210D", "26", "MOUNTAIN", objEspSport, 45000);
        Bicicleta bici3= new Bicicleta("TEKNIAL", "TARPAN 100", "29", "MTB", objEspComun, 80000);
        
        //Creación de objetos de tipo Stock//
        
        Stock stockBici1= new Stock(bici1,40);
        Stock stockBici2= new Stock(bici2,20);
        Stock stockBici3= new Stock(bici3,50);
        
        //Creación de objetos tipo cliente//
        
        TipoCliente objFederado= new TipoCliente(1, "Federado");
        TipoCliente objComun= new TipoCliente(2, "Común");
        
        //Creación del objeto cliente//
        
        Cliente objClienteFederado= new Cliente("Victoria", "Cordero", "11/01/98", 95678497, objFederado);
        Cliente objClienteComun= new Cliente("Yazmin", "De Dona", "29/05/96", 39656723, objComun);
        
        //Creacion de los objetos formas de pago//
        
        FormaPago objFpTodos= new FormaPago(0, "Todas las formas de pago");
        FormaPago objFpEfectivo= new FormaPago(1, "Efectivo");
        FormaPago objFpTD= new FormaPago(2, "Tarjeta de débito", "7895856247896325");
        FormaPago objFpTC= new FormaPago(3, "Tarjeta de crédito", "7895874569851258", "05/23");
        
        //Creacion de los objetos descuento//
        
        Descuento objDesc25 =new Descuento(1, "25% de descuento", objEspCompeticion, objFpEfectivo, 0.25);
        Descuento objDesc10 =new Descuento(2, "10% de descuento", objEspSport, 0.1);
        
        // Creacion del objeto envio
        
        Envio objEnvio= new Envio(objClienteComun, "18/11/2021","Juncal 1675");
       //Menú de opciones//
       
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
        
       while(!salir){
            
           System.out.println("1. Caso cliente común con envío");
           System.out.println("2. Caso cliente federado con 25% de desc");
           System.out.println("3. Caso cliente federado con 10% de desc");
           System.out.println("4. Salir");
            
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
           
           switch (opcion){
           
               case 1:
                   Compra compra1= new Compra();
                   System.out.println(compra1.Comprar(objClienteComun, bici1, objFpTC, 2,stockBici1));
                  
                   System.out.println("Presione X para continuar");
                    String tecla = sn.next();
                    
                    //ESTO BORRA EL OUTPUT
                   for(int clear = 0; clear < 1000; clear++)
                    {
                       System.out.println("\b") ;
                    }
                   
                   break;
               case 2: 
                   Compra compra2= new Compra();
                   System.out.println(compra2.Comprar(objClienteFederado, bici1, objFpEfectivo, 1,stockBici1));
                   //ESTO BORRA EL OUTPUT
                   for(int clear = 0; clear < 1000; clear++)
                    {
                       System.out.println("\b") ;
                    }
                   
                   break;
               case 3:
                   Compra compra3= new Compra();
                   System.out.println(compra3.Comprar(objClienteFederado, bici2, objFpTodos, 3,stockBici2));
                   //ESTO BORRA EL OUTPUT
                   for(int clear = 0; clear < 1000; clear++)
                    {
                       System.out.println("\b") ;
                    }
                  
                   break;
               case 4: 
                   salir = true;
                   break;
           }
            
       }        
        
    }
}
    