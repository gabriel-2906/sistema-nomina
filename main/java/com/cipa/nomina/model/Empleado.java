package com.cipa.nomina.model;
public abstract class Empleado {
    private final String id; private final String nombre; private final int aniosEmpresa;
    protected Empleado(String id,String nombre,int aniosEmpresa){
        if(id==null||id.isBlank()) throw new IllegalArgumentException("El ID es obligatorio.");
        if(nombre==null||nombre.isBlank()) throw new IllegalArgumentException("El nombre es obligatorio.");
        if(aniosEmpresa<0) throw new IllegalArgumentException("Los años no pueden ser negativos.");
        this.id=id; this.nombre=nombre; this.aniosEmpresa=aniosEmpresa;
    }
    public String getId(){return id;} public String getNombre(){return nombre;} public int getAniosEmpresa(){return aniosEmpresa;}
    public abstract double calcularSalarioBruto(); public abstract boolean esPermanente();
}