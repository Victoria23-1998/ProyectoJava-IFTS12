/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.producto;

public class Bicicleta {
    private String marca;
    private String modelo;
    private String rodado;
    private String tipoBici;
    private Especialidad especialidad;
    private double PrecioVenta; 

    public Bicicleta(String marca, String modelo, String rodado, String tipoBici, Especialidad especialidad, double precioVenta) {
        this.marca = marca;
        this.modelo = modelo;
        this.rodado = rodado;
        this.tipoBici = tipoBici;
        this.especialidad = especialidad;
        this.PrecioVenta= precioVenta;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRodado() {
        return rodado;
    }

    public void setRodado(String rodado) {
        this.rodado = rodado;
    }

    public String getTipoBici() {
        return tipoBici;
    }

    public void setTipoBici(String tipoBici) {
        this.tipoBici = tipoBici;
    }
    
    public double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
}
