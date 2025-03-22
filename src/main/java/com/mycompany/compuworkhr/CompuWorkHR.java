/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compuworkhr;

import compuworkhr.controlador.EmpleadoControlador;
import compuworkhr.controlador.DepartamentoControlador;
import compuworkhr.controlador.EvaluacionControlador;
import compuworkhr.logica.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class CompuWorkHR {

    public static void main(String[] args) {
        EmpleadoControlador empleadoCtrl = new EmpleadoControlador();
        DepartamentoControlador deptCtrl = new DepartamentoControlador();
        EvaluacionControlador evalCtrl = new EvaluacionControlador();
        Random rnd = new Random();

        // Crear empleados (Se crean 10 empleados como ejemplo)
        Empleado[] empleados = {
            new EmpleadoIndefinido(1, "Ana Herrera", "Developer", 3000000),
            new EmpleadoIndefinido(2, "Carlos Ruiz", "Developer", 3200000),
            new EmpleadoIndefinido(3, "María López", "QA", 2800000),
            new EmpleadoIndefinido(4, "Pedro Sánchez", "QA", 2750000),
            new EmpleadoIndefinido(5, "Sofía Díaz", "Analista", 2900000),
            new EmpleadoIndefinido(6, "Jorge Vega", "Analista", 2950000),
            new EmpleadoTemporal(7, "Luis Gómez", "Soporte", 2000000, LocalDate.of(2025, 6, 30)),
            new EmpleadoTemporal(8, "Lucía Martín", "Soporte", 2100000, LocalDate.of(2025, 8, 15)),
            new EmpleadoTemporal(9, "David Torres", "Marketing", 2200000, LocalDate.of(2025, 5, 31)),
            new EmpleadoTemporal(10, "Elena Castro", "Marketing", 2250000, LocalDate.of(2025, 7, 20))
        };
        for (Empleado e : empleados) empleadoCtrl.agregarEmpleado(e);

        // Creación de departamentos (Se crean 3 inicialmente para mostrar el funcionamiento
        Departamento ti = new Departamento(1, "TI");
        Departamento finanzas = new Departamento(2, "Finanzas");
        Departamento talentoHumano = new Departamento(3, "TalentoHumano");
        deptCtrl.agregarDepartamento(ti);
        deptCtrl.agregarDepartamento(finanzas);
        deptCtrl.agregarDepartamento(talentoHumano);

        // Asignar empleados a los departamentos
        List<Departamento> departamentos = deptCtrl.getAllDepartamentos();
        for (int i = 0; i < empleados.length; i++) {
            Departamento dept = departamentos.get(i % departamentos.size());
            deptCtrl.asignarEmpleado(dept.getId(), empleados[i]);
        }

        //Crear evaluaciones aleatorias
        for (Empleado e : empleados) {
            int resultadoEvaluacion = rnd.nextInt(5) + 1;
            EvaluacionDesempeno eval = new EvaluacionDesempeno(e.getId(), e, resultadoEvaluacion, "Evaluación automática");
            evalCtrl.agregarEvaluacion(eval);
        }

        // Mostrar departamentos con empleados
        System.out.println("=== Departamentos y sus Empleados ===");
        deptCtrl.getAllDepartamentos().forEach(System.out::println);

        // Generar y mostrar reportes por departamento
        System.out.println("\n=== Reportes de Desempeño por Departamento ===");

    }
}
