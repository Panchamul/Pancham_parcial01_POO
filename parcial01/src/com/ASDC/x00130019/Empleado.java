package com.ASDC.x00130019;

public abstract class Empleado {
    protected String nombre;
    protected String puesto;
    protected double salario;

    Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
//--------empleando getters-----------------------//
    public String getNombre() {
        return nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public double getSalario() {
        return salario;
    }
    //--------empleando setters-----------------------//
    public void setSalario(double salario) {
        this.salario = salario;
    }
}

