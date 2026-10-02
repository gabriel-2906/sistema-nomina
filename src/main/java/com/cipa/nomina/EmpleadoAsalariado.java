package com.cipa.nomina.model;
public class EmpleadoAsalariado extends Empleado {
    private final double salarioMensual;
    public EmpleadoAsalariado(String id,String nombre,int aniosEmpresa,double salarioMensual){
        super(id,nombre,aniosEmpresa); if(salarioMensual<0) throw new IllegalArgumentException("Salario negativo.");
        this.salarioMensual=salarioMensual;
    }
    public double calcularSalarioBruto(){return salarioMensual+(getAniosEmpresa()>5?salarioMensual*.10:0);}
    public boolean esPermanente(){return true;}
}