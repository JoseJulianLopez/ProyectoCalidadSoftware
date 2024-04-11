package proyectoprogra;

public class Factura {

    private String fecha;
    private int numeroFactura;
    private String nicknameCliente;
    private String nicknameEmpleado;
    private String nombreEquipo;
    private String detalleReparacion;
    private double montoAPagar;
    private boolean estado;

    public String getValores() {
        String s = "";
        s += fecha + "\t";
        s += numeroFactura + "\t";
        s += nicknameCliente + "\t";
        s += nicknameEmpleado + "\t";
        s += nombreEquipo + "\t";
        s += detalleReparacion + "\t";
        s += montoAPagar + "\t";
        s += estado + "\t";
        return s;
    }

    public String getTitulos() {
        String s = "";
        s += "fecha" + "\t";
        s += "numeroFactura" + "\t";
        s += "nicknameCliente" + "\t";
        s += "nicknameEmpleado" + "\t";
        s += "nombreEquipo" + "\t";
        s += "detalleReparacion" + "\t";
        s += "montoAPagar" + "\t";
        s += "estado" + "\t";
        return s;
    }

    public String getDetalleReparacion() {
        return detalleReparacion;
    }

    public void setDetalleReparacion(String detalleReparacion) {
        this.detalleReparacion = detalleReparacion;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getNicknameCliente() {
        return nicknameCliente;
    }

    public void setNicknameCliente(String nicknameCliente) {
        this.nicknameCliente = nicknameCliente;
    }

    public String getNicknameEmpleado() {
        return nicknameEmpleado;
    }

    public void setNicknameEmpleado(String nicknameEmpleado) {
        this.nicknameEmpleado = nicknameEmpleado;
    }

    public double getMontoAPagar() {
        return montoAPagar;
    }

    public void setMontoAPagar(double montoAPagar) {
        this.montoAPagar = montoAPagar;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
