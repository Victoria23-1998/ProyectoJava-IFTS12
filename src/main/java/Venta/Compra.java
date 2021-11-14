
package Venta;

import modelo.cliente.Cliente;
import modelo.producto.Bicicleta;
import modelo.producto.Stock;

public class Compra {
    private Bicicleta bicileta;
    private int cantidadCompra;
    private double monto;
    private Cliente cliente;
    private FormaPago formaPago;
    private Descuento tipoDescuento;
    private double montoDescuento;
    private Envio envios;

    public Compra() {
        
    }
    
    

    public Bicicleta getBicileta() {
        return bicileta;
    }

    public void setBicileta(Bicicleta bicileta) {
        this.bicileta = bicileta;
    }

    public int getCantidadCompra() {
        return cantidadCompra;
    }

    public void setCantidadCompra(int cantidadCompra) {
        this.cantidadCompra = cantidadCompra;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public Descuento getTipoDescuento() {
        return tipoDescuento;
    }

    public void setTipoDescuento(Descuento tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }

    public double getMontoDescuento() {
        return montoDescuento;
    }

    public void setMontoDescuento(double montoDescuento) {
        this.montoDescuento = montoDescuento;
    }

    public Envio getEnvios() {
        return envios;
    }

    public void setEnvios(Envio envios) {
        this.envios = envios;
    }
    
    public String Comprar(Cliente comprador, Bicicleta producto, FormaPago formaPago, int cantCompra, Stock stockActual){
        double montoCompra=0;
        int restarStock =0;
        
        
        if(stockActual.getCantidad()>0){
             //Cliente Federado//
        if(comprador.getTipoCliente().getIdTipoCliente()==1) {
            
            if(producto.getEspecialidad().getIdEspecialidad()==1 && formaPago.getIdFormPago()==1){
           
            montoCompra= CalcularMontoCompra(producto.getPrecioVenta(), cantCompra, 0.25);
            restarStock = stockActual.getCantidad() - cantCompra;
            stockActual.setCantidad(restarStock);
            
            }
            else if(producto.getEspecialidad().getIdEspecialidad()==2 && formaPago.getIdFormPago()==0){
            
               montoCompra= CalcularMontoCompra(producto.getPrecioVenta(), cantCompra, 0.1);
               restarStock = stockActual.getCantidad() - cantCompra;
               stockActual.setCantidad(restarStock);
            }
            
            else{
            
                montoCompra= CalcularMontoCompra(producto.getPrecioVenta(), cantCompra, 0);
                 restarStock = stockActual.getCantidad() - cantCompra;
                 stockActual.setCantidad(restarStock);
            }
                                     
        }else { //Cliente común//
           
            montoCompra= CalcularMontoCompra(producto.getPrecioVenta(), cantCompra, 0);
             restarStock = stockActual.getCantidad() - cantCompra;
             stockActual.setCantidad(restarStock);
            
        }
        
        
          return "La compra se realizó con éxito \n Monto: "+ montoCompra +"\n de la Bici " + producto.getMarca() + " queda un stock de " + restarStock;
            
          
        }else{
            return "No hay stock no se puede realizar la compra";
        }
        
   
    }
    
    private double CalcularMontoCompra(double precioVenta, int cantCompra, double descuento){
        double totalCompra=0;
        double montoDescuento=0;
        
        if(descuento>0) {
            montoDescuento= (precioVenta* cantCompra)*descuento;
               totalCompra= (precioVenta* cantCompra)-montoDescuento;
        }else {
            
            totalCompra= (precioVenta* cantCompra);
        }
        
       
            
    return totalCompra;
    }
    
   /* public String restarStock (int cantCompra, Stock stockActual){
        int restarStock =0;
        if(stockActual.getCantidad()>0){
            
           restarStock = stockActual.getCantidad() - cantCompra;
           return "La cantidad de stock restante de la bici" + stockActual.getBicicleta().getMarca() + "es" + restarStock;
        }else{
            return "No hay stock no se puede realizar la compra";
        }
        
        
}     */  
}