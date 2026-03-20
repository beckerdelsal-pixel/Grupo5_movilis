package com.cmc.repaso.entidades;

public class Dueno {

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String cedula;

 
    public Dueno(String nombre, String apellido, String telefono, String email, String cedula) {
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setEmail(email);
        setCedula(cedula);
    }

   

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            this.nombre = "Desconocido";
        } else {
            this.nombre = nombre;
        }
    }

    public void setApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty()) {
            this.apellido = "Desconocido";
        } else {
            this.apellido = apellido;
        }
    }

    public void setTelefono(String telefono) {
        boolean valido = telefono != null && telefono.matches("\\d{10}");
        this.telefono = valido ? telefono : "0000000000";
    }

    public void setEmail(String email) {
        boolean valido = false;

        if (email != null) {
            int arroba = email.indexOf("@");
            int punto = email.lastIndexOf(".");

            if (arroba > 0 && punto > arroba) {
                valido = true;
            }
        }

        this.email = valido ? email : "sin@email.com";
    }

    public void setCedula(String cedula) {
        if (cedula == null || cedula.trim().isEmpty()) {
            this.cedula = "0000000000";
        } else {
            this.cedula = cedula;
        }
    }



    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getCedula() {
        return cedula;
    }

    // ✅ MÉTODOS ADICIONALES

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public boolean tieneEmailValido() {
        int arroba = email.indexOf("@");
        int punto = email.lastIndexOf(".");

        return arroba > 0 && punto > arroba;
    }

    @Override
    public String toString() {
        return "Dueno: " + getNombreCompleto() +
               "\nTelefono: " + telefono +
               "\nEmail: " + email +
               "\nCedula: " + cedula;
    }
}