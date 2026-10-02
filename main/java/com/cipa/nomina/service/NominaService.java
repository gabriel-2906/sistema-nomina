package com.cipa.nomina.service;
import com.cipa.nomina.model.Empleado;
public class NominaService {
    private final DeduccionService deducciones; private final BeneficioService beneficios;
    public NominaService(DeduccionService d,BeneficioService b){this.deducciones=d;this.beneficios=b;}
    public double calcularSalarioNeto(Empleado e){
        double neto=e.calcularSalarioBruto()-deducciones.calcularDeducciones(e)+beneficios.calcularBeneficios(e);
        if(neto<0) throw new IllegalStateException("El salario neto no puede ser negativo."); return neto;
    }
    public String generarResumen(Empleado e){return String.format("Empleado: %s%nSalario bruto: $%,.2f%nSalario neto: $%,.2f%n",e.getNombre(),e.calcularSalarioBruto(),calcularSalarioNeto(e));}
}