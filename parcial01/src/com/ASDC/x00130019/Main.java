package com.ASDC.x00130019;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre, puesto;
        int meses, extension;
        double salario;
        char op;
        PlazaFija pf = null;
        ServicioProfesional sp = null;
        DecimalFormat decimales = new DecimalFormat("0.00");
        Empleado aux = null;


        ArrayList<ServicioProfesional> empleado1 = new ArrayList<>();
        ArrayList<PlazaFija> empleado2 = new ArrayList<>();

        do { Menu(); op = scan.next().charAt(0);
            switch (op){
                case '1':
                    System.out.println("Servicio Profesional");
                    nombre = JOptionPane.showInputDialog(null, "Nombre: ");
                    puesto = JOptionPane.showInputDialog(null, "Puesto: ");
                    try {
                        salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Salario: "));
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null, "Ingrese unicamente numeros");
                        break;
                    }
                    if (salario < 250) {
                        JOptionPane.showMessageDialog(null, "El salario no puede ser menor al minimo");
                        break;
                    }
                    meses = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de meses a trabajar: "));
                    empleado1.add(new ServicioProfesional(nombre,puesto,salario,meses));
                            System.out.println(CalculadoraImpuestos.calcularPago(aux));


                case '2':
                    System.out.println("Plaza Fija");
                    nombre = JOptionPane.showInputDialog(null, "Nombre: ");
                    puesto = JOptionPane.showInputDialog(null, "Puesto: ");
                    try {
                        salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Salario: "));
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null, "Ingrese unicamente numeros");
                        break;
                    }
                    if (salario < 250) {
                        JOptionPane.showMessageDialog(null, "El salario no puede ser menor al minimo");
                        break;
                    }
                    extension = Integer.parseInt(JOptionPane.showInputDialog(null,"Extension: "));
                    empleado2.add(new PlazaFija(nombre,puesto,salario,extension));
                    System.out.println(CalculadoraImpuestos.calcularPago(aux));
            }
        }while (op != 3);


    }

    static void Menu(){
        System.out.println("Bienvenido!!");
        System.out.println("Seleccione el tipo de trabajo que posee");
        System.out.println("1. Servicio Profesional");
        System.out.println("2. Plaza fija");
    }
}
