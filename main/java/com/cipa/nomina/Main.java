package com.cipa.nomina;
import com.cipa.nomina.model.*; import com.cipa.nomina.service.*;
public class Main {
 public static void main(String[] args){
  NominaService n=new NominaService(new DeduccionService(),new BeneficioService());
  Empleado[] empleados={
   new EmpleadoAsalariado("E001","Carlos",6,3000000),
   new EmpleadoPorHoras("E002","Laura",2,50000,45,true),
   new EmpleadoPorComision("E003","Andres",3,2000000,.05,25000000),
   new EmpleadoTemporal("E004","Maria",1,2500000,"Contrato 6 meses")};
  System.out.println("===== SISTEMA DE NOMINA =====");
  for(Empleado e:empleados) System.out.println(n.generarResumen(e));
 }
}