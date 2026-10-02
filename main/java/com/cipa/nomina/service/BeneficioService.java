package com.cipa.nomina.service;
import com.cipa.nomina.model.Empleado;
public class BeneficioService {
    public double calcularBeneficios(Empleado e){return e.esPermanente()?1000000:0;}
}