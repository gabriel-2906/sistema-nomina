package com.cipa.nomina.model;
public class EmpleadoPorHoras extends Empleado {
    private final double tarifaHora, horasTrabajadas; private final boolean aceptaFondoAhorro;
    public EmpleadoPorHoras(String id,String nombre,int aniosEmpresa,double tarifaHora,double horasTrabajadas,boolean aceptaFondoAhorro){
        super(id,nombre,aniosEmpresa);
        if(tarifaHora<0||horasTrabajadas<0) throw new IllegalArgumentException("Tarifa u horas negativas.");
        this.tarifaHora=tarifaHora; this.horasTrabajadas=horasTrabajadas; this.aceptaFondoAhorro=aceptaFondoAhorro;
    }
    public double calcularSalarioBruto(){double normales=Math.min(horasTrabajadas,40), extras=Math.max(horasTrabajadas-40,0); return normales*tarifaHora+extras*tarifaHora*1.5;}
    public boolean esPermanente(){return false;}
    public double calcularFondoAhorro(){return getAniosEmpresa()>1&&aceptaFondoAhorro?calcularSalarioBruto()*.02:0;}
}