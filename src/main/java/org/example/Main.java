package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // variables y otros
        GestorCapacitacion gestor = new GestorCapacitacion();
        List<Curso> cursos = gestor.getCursos();

        gestor.setCursos(cursos);

        // registro cursos
        cursos.add(new CursoCertificado("CUR-C01", 40, 25, "SENCE", false));
        cursos.add(new CursoCertificado("CUR-C02", 60, 20, "CHILE VALORA", true));
        cursos.add(new CursoLibre("CUR-L01", 20, 30, 25));
        cursos.add(new CursoLibre("CUR-L02", 16, 15, 10));

        for (Curso curso : cursos) {
            System.out.println(curso.codigo + " (" + curso.getClass().getSimpleName() + ") registrado correctamente.");
        }

        // busqueda por codigo

        Busqueda(gestor, "CUR-C01");


        // Lista
        System.out.println("\n=== Lista ===");
        System.out.println(gestor.Lista());

    }

    // metodos auxiliares
    public static void Busqueda(GestorCapacitacion gestor, String nombre) {
        List<Curso> busqueda = gestor.busqueda(nombre);

        System.out.println(" \n=== Busqueda por codigo: " + nombre + " ===");
        for (Curso curso : busqueda) {
            if(curso.getClass().getSimpleName().equals("CursoLibre")) {
                System.out.println("Tipo: Curso Libre");
            }else if(curso.getClass().getSimpleName().equals("CursoCertificado")) {
                System.out.println("Tipo: Curso Certificado");
            }
            System.out.println(curso.Detalles());
        }



    }
}