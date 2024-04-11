package proyectoprogra;

public class Cliente extends Persona {

    public String getValores() {
        String s = "";
        s += nombre + "\t";
        s += apellido1 + "\t";
        s += apellido2 + "\t";
        s += nickname + "\t";
        s += contra + "\t";
        s += estado + "\t";
        s += fechaCreacion + "\t";
        return s;
    }

    public String getTitulos() {
        String s = "";
        s += "nombre" + "\t";
        s += "apellido1" + "\t";
        s += "apellido2" + "\t";
        s += "nickname" + "\t";
        s += "contra" + "\t";
        s += "estado" + "\t";
        s += "fechaCreacion" + "\t";
        return s;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
