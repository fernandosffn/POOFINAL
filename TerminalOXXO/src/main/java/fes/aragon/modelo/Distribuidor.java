package fes.aragon.modelo;

import java.io.Serializable;

public class Distribuidor implements Serializable {
    public String nombreDistribuidor;
    public String correo;
    public String telefono;
    public String direccion;
    private SerializableImage imagen;

    public Distribuidor() {
    }

    public Distribuidor(String nombre, String correo, String telefono, String direccion) {
        this.nombreDistribuidor = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombreDistribuidor;
    }

    public void setNombre(String nombre) {
        this.nombreDistribuidor = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public SerializableImage getImagen() {
        return imagen;
    }

    public void setImagen(SerializableImage imagen) {
        this.imagen = imagen;
    }
}