
package Venta;

import modelo.producto.Especialidad;

public class Descuento {
   private int idTipoDesc;
   private String desripcion;
   private Especialidad especialidadBici;
   private FormaPago formaPago;
   private double PorcentajeDesc;

    public Descuento(int idTipoDesc, String desripcion, Especialidad especialidadBici, FormaPago formaPago, double PorcentajeDesc) {
        this.idTipoDesc = idTipoDesc;
        this.desripcion = desripcion;
        this.especialidadBici = especialidadBici;
        this.formaPago = formaPago;
        this.PorcentajeDesc = PorcentajeDesc;
    }
   
    public Descuento(int idTipoDesc, String desripcion, Especialidad especialidadBici, double PorcentajeDesc) {
        this.idTipoDesc = idTipoDesc;
        this.desripcion = desripcion;
        this.especialidadBici = especialidadBici;
        this.PorcentajeDesc = PorcentajeDesc;
    }
   

    public int getIdTipoDesc() {
        return idTipoDesc;
    }

    public void setIdTipoDesc(int idTipoDesc) {
        this.idTipoDesc = idTipoDesc;
    }

    public String getDesripcion() {
        return desripcion;
    }

    public void setDesripcion(String desripcion) {
        this.desripcion = desripcion;
    }

    public Especialidad getEspecialidadBici() {
        return especialidadBici;
    }

    public void setEspecialidadBici(Especialidad especialidadBici) {
        this.especialidadBici = especialidadBici;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public double getPorcentajeDesc() {
        return PorcentajeDesc;
    }

    public void setPorcentajeDesc(int PorcentajeDesc) {
        this.PorcentajeDesc = PorcentajeDesc;
    }
   
   
   
}
