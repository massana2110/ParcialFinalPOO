package entidades;

public class Movimiento {
private double monto;
private String fecha;
private String descripcion;

public Movimiento(){
    
}

public Movimiento(double unMonto, String unaFecha, String unaDescripcion){
    this.monto = unMonto;
    this.fecha = unaFecha;
    this.descripcion = unaDescripcion;
}

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}

