package org.example;

public abstract class Curso {
    protected String codigo;
    protected int duracion;
    protected int cupo;

    public Curso(String codigo, int duracion, int cupo) {
        setCodigo(codigo);
        setDuracion(duracion);
        setCupo(cupo);
    }

    public String getCodigo() {
        return codigo;
    }

    // correccion en constructor con validaciones en los setters
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El codigo no puede estar vacio");
        } else {
            this.codigo = codigo;
        }
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if  (duracion < 4 || duracion > 200) {
            throw new IllegalArgumentException("La duracion del curso debe ser mayor de 4 horas y no puede superar las 200 horas");
        } else {
            this.duracion = duracion;
        }
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        if (cupo <= 0){
            throw new IllegalArgumentException("La cupo del curso debe ser mayor de 0");
        }else {
            this.cupo = cupo;
        }
    }

    // metodos extra de los setters y getters

    // correccion 1
    public abstract double calCobro();

    public String detalles() {
        return toString();
    }

    public String toString(){
        String respuesta = "Código: " + getCodigo() + "\n";
        respuesta = respuesta + "Duracion: " + getDuracion() + " Horas \n";
        return respuesta;
    }
}

//el to.String debe incluir unicamente el codigo del curso y la duracion de este en Horas.
