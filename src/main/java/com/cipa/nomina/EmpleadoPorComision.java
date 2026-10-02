package com.cipa.nomina.model;
public class EmpleadoPorComision extends Empleado {
    private final double salarioBase, porcentajeComision, ventas;
    public EmpleadoPorComision(String id,String nombre,int aniosEmpresa,double salarioBase,double porcentajeComision,double ventas){
        super(id,nombre,aniosEmpresa);
        if(salarioBase<0||porcentajeComision<0||ventas<0) throw new IllegalArgumentException("Valores negativos.");
        this.salarioBase=salarioBase; this.porcentajeComision=porcentajeComision; this.ventas=ventas;
    }
    public double calcularSalarioBruto(){return salarioBase+ventas*porcentajeComision+(ventas>20000000?ventas*.03:0);}
    public boolean esPermanente(){return true;}
}