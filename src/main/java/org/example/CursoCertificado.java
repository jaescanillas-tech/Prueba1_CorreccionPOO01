package org.example;

public class CursoCertificado extends Curso implements ConDiploma {
    private String entidadCertificadora;
    private boolean evaluacionF;
    private boolean diploma;

    public CursoCertificado(String codigo, int duracion, int cupo, String entidadCertificadora, boolean evaluacionF) {
        super(codigo, duracion, cupo);
        setEntidadCertificadora(entidadCertificadora);
        setEvaluacionF(evaluacionF);
        this.diploma = false;
    }

    public String getEntidadCertificadora() {
        return entidadCertificadora;
    }

    public void setEntidadCertificadora(String entidadCertificadora) {
        if (entidadCertificadora == null || entidadCertificadora.isBlank()) {
            throw new IllegalArgumentException("La entidad certificadora no puede ser nula");
        }
        this.entidadCertificadora = entidadCertificadora;
    }

    public boolean isEvaluacionF() {
        return evaluacionF;
    }

    public void setEvaluacionF(boolean evaluacionF) {
        this.evaluacionF = evaluacionF;
    }

    public boolean isDiploma() {
        return diploma;
    }

    public void setDiploma(boolean diploma) {
        this.diploma = diploma;
    }

    //correccion 1.2

    @Override
    public double calCobro() {
        int costo = 85000;
        if  (evaluacionF) {
            return costo;
        }else{
            return costo * 1.2;
        }
    }

    @Override
    public boolean tieneDiploma(String codigo) {
        return this.codigo.equals(codigo) && this.diploma;
    }

    @Override
    public void DiplomaCurso() {
        this.diploma = true;
    }
}
