package org.example;

import java.util.ArrayList;
import java.util.List;

public class GestorCapacitacion {
    private List<Curso> cursos;

    public GestorCapacitacion() {
        this.cursos = new ArrayList<>();
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void registrarCurso(Curso curso) {
        if (curso == null) {
            throw new IllegalArgumentException("El curso no puede ser nulo");
        }

        cursos.add(curso);
        System.out.println(curso.getCodigo() + " registrado correctamente.");
    }

    public List<Curso> busqueda(String codigo) {
        List <Curso> lista = new ArrayList<>();

        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                lista.add(curso);
            }
        }
        return lista;
    }

    public String lista() {
        String respuesta = "";

        for  (Curso curso : cursos) {
            respuesta = respuesta + curso.toString() + "\n";
        }

        return respuesta;
    }
}
