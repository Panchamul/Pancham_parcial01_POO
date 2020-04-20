package com.ASDC.x00130019;

public class PlazaFija extends Empleado {
    private int extension;

    PlazaFija(String nombre, String puesto, double salario, int extension){
        super(nombre, puesto, salario);
        this.extension = extension;
    }
    //--------empleando getters-----------------------//
    public int getExtension() {
        return extension;
    }
    //--------empleando setters-----------------------//
    public void setExtension(int extension) {
        this.extension = extension;
    }
}
