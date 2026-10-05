package org.example;

public abstract class Curso {
    protected String codigo;
    protected int duracion;
    protected int cupo;

    public Curso(String codigo, int duracion, int cupo) {
        if (codigo == null || codigo.length() == 0 || codigo == "") {
            throw new IllegalArgumentException("El codigo no puede estar vacio");
        }else{
            this.codigo = codigo;
        }if (duracion < 5 || duracion > 200) {
            throw new IllegalArgumentException("La duracion no puede ser menor que 5 horas ni mayor a 200 horas");
        }else {
            this.duracion = duracion;
        }if(cupo <= 0){
            throw new IllegalArgumentException("La cupo no puede ser mayor que 0");
        }else{
            this.cupo = cupo;
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    // metodos extra de los setters y getters

    // correccion 1
    public abstract double calcularSalario();

    public String Detalles() {
        return toString();
    }

    public String toString(){
        String respuesta = "Código: " + getCodigo() + "\n";
        respuesta = respuesta + "Duracion: " + getDuracion() + " Horas \n";
        return respuesta;
    }
}

//el to.String debe incluir unicamente el codigo del curso y la duracion de este en Horas.
