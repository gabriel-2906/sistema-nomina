package com.cipa.nomina;
import com.cipa.nomina.model.EmpleadoAsalariado; import com.cipa.nomina.service.*; import org.junit.jupiter.api.Test; import static org.junit.jupiter.api.Assertions.*;
class NominaServiceTest {
 @Test void bonoPorAntiguedad(){assertEquals(3300000,new EmpleadoAsalariado("1","Carlos",6,3000000).calcularSalarioBruto(),.01);}
 @Test void calculaNeto(){EmpleadoAsalariado e=new EmpleadoAsalariado("1","Carlos",6,3000000); assertEquals(4168000,new NominaService(new DeduccionService(),new BeneficioService()).calcularSalarioNeto(e),.01);}
}