package com.ASDC.x00130019;

public class ServicioProfesional extends Empleado{
    private int mesesContrato;

    ServicioProfesional(String nombre, String puesto, double salario, int meses){
    super(nombre, puesto, salario);
    this.mesesContrato = meses;
    }
    //--------empleando getters-----------------------//
    public int getMesesContrato() {
        return mesesContrato;
    }
    //--------empleando setters-----------------------//
    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }
}
