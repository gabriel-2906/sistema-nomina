package com.cipa.nomina.model;
public class EmpleadoTemporal extends Empleado {
    private final double salarioMensual; private final String contrato;
    public EmpleadoTemporal(String id,String nombre,int aniosEmpresa,double salarioMensual,String contrato){
        super(id,nombre,aniosEmpresa); if(salarioMensual<0||contrato==null||contrato.isBlank()) throw new IllegalArgumentException("Datos inválidos.");
        this.salarioMensual=salarioMensual; this.contrato=contrato;
    }
    public double calcularSalarioBruto(){return salarioMensual;} public boolean esPermanente(){return false;}
}