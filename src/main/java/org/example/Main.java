package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // variables y otros
        GestorCapacitacion gestor = new GestorCapacitacion();

        CursoCertificado cursoC01 =
                new CursoCertificado("CUR-C01", 40, 25, "SENCE", false);
        CursoCertificado cursoC02 =
                new CursoCertificado("CUR-C02", 60, 20, "CHILE VALORA", true);
        CursoLibre cursoL01 =
                new CursoLibre("CUR-L01", 20, 30, 25);
        CursoLibre cursoL02 =
                new CursoLibre("CUR-L02", 16, 15, 10);

        cursoC01.DiplomaCurso();

        gestor.registrarCurso(cursoC01);
        gestor.registrarCurso(cursoC02);
        gestor.registrarCurso(cursoL01);
        gestor.registrarCurso(cursoL02);

        // busqueda por codigo
        busqueda(gestor, "CUR-C01");

        // Lista
        System.out.println("\n=== Lista ===");
        System.out.println(gestor.lista());

    }

    // metodos auxiliares
    public static void busqueda(GestorCapacitacion gestor, String codigo) {
        List<Curso> busqueda = gestor.busqueda(codigo);

        System.out.println(" \n=== Busqueda por codigo: " + codigo + " ===");
        for (Curso curso : busqueda) {
            System.out.println(curso.detalles());
            System.out.println("Costo: $" + (int) curso.calCobro());
        }
    }
}