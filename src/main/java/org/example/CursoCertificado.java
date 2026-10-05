package org.example;

public class CursoCertificado extends Curso implements ConDiploma {
    private String entidadCertificadora;
    private boolean evaluacionF;
    private boolean diploma;
    private int costo = 85000;

    public CursoCertificado(String codigo, int duracion, int cupo, String entidadCertificadora, boolean evaluacionF) {
        super(codigo, duracion, cupo);
        this.entidadCertificadora = entidadCertificadora;
        this.evaluacionF = evaluacionF;
        this.diploma = ConDiploma.tieneDiploma(codigo);
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

    @Override
    public double CalCosto() {
        double total = costo;
        if (evaluacionF) {
            return total;
        }else{
            total = total * 1.2;
            return total;
        }
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
        respuesta = respuesta + "$" +(int)CalCosto() + "\n";

        return respuesta;
    }
}
