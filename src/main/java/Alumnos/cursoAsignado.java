package Alumnos;

import java.util.ArrayList;

public class cursoAsignado {
    private int codigoCurso;
    private String nombreCurso;



    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCostoCurso() {
        return costoCurso;
    }

    public void setCostoCurso(double costoCurso) {
        this.costoCurso = costoCurso;
    }

    private double costoCurso;

    public cursoAsignado(int codigoCurso, String nombreCurso, double costoCurso) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.costoCurso = costoCurso;
    }

}
