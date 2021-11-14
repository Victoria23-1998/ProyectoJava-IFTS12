
package Venta;


public class FormaPago {
   private int idFormPago;
   private String descripcion;
   private String numTarjeta;
   private String fechVenci;

    public FormaPago(int idFormPago, String descripcion, String numTarjeta, String fechVenci) {
        this.idFormPago = idFormPago;
        this.descripcion = descripcion;
        this.numTarjeta = numTarjeta;
        this.fechVenci = fechVenci;
    }
   
    public FormaPago(int idFormPago, String descripcion) {
        this.idFormPago = idFormPago;
        this.descripcion = descripcion;
    }
    
     public FormaPago(int idFormPago, String descripcion, String numTarjeta) {
        this.idFormPago = idFormPago;
        this.descripcion = descripcion;
        this.numTarjeta = numTarjeta;
    }
     
     
    public int getIdFormPago() {
        return idFormPago;
    }

    public void setIdFormPago(int idFormPago) {
        this.idFormPago = idFormPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getFechVenci() {
        return fechVenci;
    }

    public void setFechVenci(String fechVenci) {
        this.fechVenci = fechVenci;
    }
   
   
  
}
