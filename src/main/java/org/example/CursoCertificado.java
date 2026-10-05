package org.example;

public class CursoCertificado extends Curso implements ConDiploma {
    private String entidadCertificadora;
    private boolean evaluacionF;
    private boolean diploma;
    private int costo = 85000;

    public CursoCertificado(String codigo, int duracion, int cupo, String entidadCertificadora, boolean evaluacionF,  boolean diploma) {
        super(codigo, duracion, cupo);
        this.entidadCertificadora = entidadCertificadora;
        this.evaluacionF = evaluacionF;
        this.diploma = diploma;
    }

    public String getEntidadCertificadora() {
        return entidadCertificadora;
    }

    public void setEntidadCertificadora(String entidadCertificadora) {
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

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    //correccion 1.2


    @Override
    public double calcularSalario() {
        return 0;
    }



    @Override
    public String Detalles() {
        String respuesta = super.toString();
        respuesta = respuesta + "Cupos: " + getCupo() + "\n";
        respuesta = respuesta + "Entidad certificadora : " + getEntidadCertificadora() + "\n";
        if (evaluacionF) {
            respuesta = respuesta + "Evaluacion al día: Si\n";
        }else{
            respuesta = respuesta + "Evaluacion al día: No\n";
        }

        if (diploma) {
            respuesta = respuesta + "Diploma emitido: Si\n";
        }else{
            respuesta = respuesta + "Diploma emitido: No\n";
        }
        respuesta = respuesta + "$" +(int)calcularSalario() + "\n";

        return respuesta;
    }
}
