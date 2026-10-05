package org.example;

public class CursoLibre extends Curso{
    private int inscritos;
    private int costo = 45000;

    public CursoLibre(String codigo, int duracion, int cupo, int inscritos) {
        super(codigo, duracion, cupo);
        this.inscritos = inscritos;
    }

    public int getInscritos() {
        return inscritos;
    }

    public void setInscritos(int inscritos) {
        this.inscritos = inscritos;
    }

    @Override
    public double CalCosto() {
        double total = costo;
        if (inscritos < 20) {
            return total;
        }else{
            total = total * 1.1;
            return total;
        }
    }

    @Override
    public String Detalles() {
        String respuesta = super.toString();
        respuesta = respuesta + "Cupos: " + getCupo() + "\n";
        respuesta = respuesta + "Inscritos: " + getInscritos() + "\n";
        respuesta = respuesta + "Costo: " + (int)CalCosto() + "\n";

        return respuesta;
    }
}
