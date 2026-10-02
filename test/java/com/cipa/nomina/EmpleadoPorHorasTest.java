package com.cipa.nomina;
import com.cipa.nomina.model.EmpleadoPorHoras; import org.junit.jupiter.api.Test; import static org.junit.jupiter.api.Assertions.*;
class EmpleadoPorHorasTest {
 @Test void calculaHorasExtras(){assertEquals(2375000,new EmpleadoPorHoras("1","Ana",2,50000,45,false).calcularSalarioBruto(),.01);}
 @Test void rechazaHorasNegativas(){assertThrows(IllegalArgumentException.class,()->new EmpleadoPorHoras("1","Ana",2,50000,-1,false));}
}