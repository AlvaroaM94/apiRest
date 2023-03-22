package com.apiRest.model;

public class Persona {
    public long id;

    public Persona(long id, String nombre, String apellidos, String rfc, String curp, int edad, String sexo, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.rfc = rfc;
        this.curp = curp;
        this.edad = edad;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String nombre;
    public String apellidos;
    public String rfc;
    public String curp;
    public int edad;
    public String sexo;
    public String nacionalidad;
}
