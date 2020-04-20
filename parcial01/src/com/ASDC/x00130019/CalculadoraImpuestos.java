package com.ASDC.x00130019;

public class CalculadoraImpuestos extends Empleado{
    private static double totalRenta;
    private static double totalISSS;
    private static double totalAFP;


    CalculadoraImpuestos(String nombre, String puesto, double salario){
        super(nombre, puesto, salario);
    }

    public static double calcularPago(Empleado empleado){
    double res = 0, x = 0, pago =0;
    if(empleado instanceof PlazaFija){
        totalAFP = empleado.salario * 0.0625;
        totalISSS = empleado.salario * 0.03;
        res = empleado.salario-totalAFP-totalISSS;
        x = res;

        if(x <= 472)
            empleado.salario = x;
        else if(x >= 472.01 && x <= 895.24)
            totalRenta = 0.1 * (x-472)+17.67;
        else if(x >= 895.25 && x <= 2038.10)
            totalRenta = 0.2 * (x-895.24)+60;
        else if(x >= 2038.11) {
            totalRenta = 0.3 * (x - 2038.10) + 288.57;
        }
        pago = res - totalRenta;
    }else if(empleado instanceof ServicioProfesional){
        totalRenta = 0.1 * empleado.salario;
        pago = res-totalRenta;
    }
       return pago;
   }

    public static String mostrarTotales(){
       return "Total Renta: "+ totalRenta + ", total de AFP: " + totalAFP + " y total del ISSS: " + totalISSS;
   }

    @Override
    public String toString() {
        return "CalculadoraImpuestos{" +
                "totalRenta=" + totalRenta +
                ", totalISSS=" + totalISSS +
                ", totalAFP=" + totalAFP +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}
