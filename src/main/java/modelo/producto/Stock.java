/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.producto;

public class Stock {
    private Bicicleta bicicleta;
    private int cantidad;

    public Stock(Bicicleta bicicleta,int cantidad) {
        this.cantidad = cantidad;
        this.bicicleta= bicicleta;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void restaStock(int cantidad) {
        this.cantidad -= cantidad;
    }
    
}

