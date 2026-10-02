package com.cipa.nomina.service;
import com.cipa.nomina.model.Empleado;
public class DeduccionService {
    public double calcularDeducciones(Empleado e){return e.calcularSalarioBruto()*.04;}
}