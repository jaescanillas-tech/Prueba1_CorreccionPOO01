package org.example;

public class CursoLibre extends Curso{
    private int inscritos;

    public CursoLibre(String codigo, int duracion, int cupo, int inscritos) {
        super(codigo, duracion, cupo);
        setInscritos(inscritos);
    }

    public int getInscritos() {
        return inscritos;
    }

    public void setInscritos(int inscritos) {
        if  (inscritos < 0 ||  inscritos > getCupo()) {
            throw new IllegalArgumentException("El valor inscrito no puede ser 0 y no puede superar los cupos maximos");
        }else{
            this.inscritos = inscritos;
        }
    }

    @Override
    public double calCobro() {
        int costo = 45000;
        if (inscritos > 20) {
            return costo * 1.1;
        }else{
            return costo;
        }
    }
}
