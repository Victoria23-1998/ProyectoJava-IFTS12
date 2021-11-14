
package Venta;

import modelo.cliente.Cliente;


public class Envio {
    private Cliente cliente;
    private String FechaEnvio;
    private String direccionEnvio;

    public Envio(Cliente cliente, String FechaEnvio, String direccionEnvio) {
        this.cliente = cliente;
        this.FechaEnvio = FechaEnvio;
        this.direccionEnvio = direccionEnvio;
    }
    
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFechaEnvio() {
        return FechaEnvio;
    }

    public void setFechaEnvio(String FechaEnvio) {
        this.FechaEnvio = FechaEnvio;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }
    
    
    
    
}
