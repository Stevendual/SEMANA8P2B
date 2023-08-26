package Alumnos;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class alumno {
    private String carnet;
    private String nombre;
    private String telefono;
    private String direccion;


    private ArrayList<cursoAsignado> cursoAsignado = new ArrayList<cursoAsignado>();

    public alumno(String carnet, String nombre, String telefono, String direccion) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Alumnos.cursoAsignado> getCursoAsignado() {
        return cursoAsignado;
    }

    public void setCursoAsignado(ArrayList<Alumnos.cursoAsignado> cursoAsignado) {
        this.cursoAsignado = cursoAsignado;
    }

    public void agregarCursoAsignado(cursoAsignado curso) {
        cursoAsignado.add(curso);
    }

    @Override
    public String toString() {
        return "Alumno{" + "carnet=" + carnet + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.printf("Cursos Asginados: ");
        for (cursoAsignado curso : cursoAsignado) {
            System.out.println("Curso: "+curso.getNombreCurso());
            System.out.println("Costo: " + curso.getCostoCurso());
            System.out.println("--------------------");

        }
    }

    public double sumarCostoCurso(){
        double suma = 0;

        for (cursoAsignado curso : cursoAsignado) {
            suma += curso.getCostoCurso();
        }
        return suma;

    }

}
