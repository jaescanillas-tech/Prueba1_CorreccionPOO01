package org.example;

import java.awt.image.AreaAveragingScaleFilter;
import java.awt.image.CropImageFilter;
import java.util.ArrayList;
import java.util.List;

public class GestorCapacitacion {
    private List<Curso> cursos = new ArrayList<>();

    public GestorCapacitacion() {
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Curso> busqueda(String nombre) {
        List <Curso> lista = new ArrayList<>();

        for (Curso curso : cursos) {
            if (curso.getCodigo() == nombre) {
                lista.add(curso);
            }
        }
        return lista;
    }

    public String Lista() {
        String respuesta = "";

        for  (Curso curso : cursos) {
            respuesta = respuesta + curso.toString() + "\n";
        }

        return respuesta;
    }
}
