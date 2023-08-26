package Alumnos;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<cursoAsignado> catCursos = new ArrayList<>();
        catCursos.add(new cursoAsignado(101, "Programacion", 500.1));
        catCursos.add(new cursoAsignado(105, "Derecho", 1));
        catCursos.add(new cursoAsignado(110, "Estadistica", 450));
        catCursos.add(new cursoAsignado(115, "Electronica", 600));



        /*cursoAsignado curso1 = new cursoAsignado(101, "Programacion", 500.1);
        cursoAsignado curso2 = new cursoAsignado(105, "Derecho", 1);
        cursoAsignado curso3 = new cursoAsignado(110, "Estadistica", 450);
        cursoAsignado curso4 = new cursoAsignado(115, "Electronica", 600);*/

       /* List<alumno> catAlumnos = new ArrayList<>();
        catAlumnos.add(new alumno("2023015", "Juan", "456214587", "5 calle 5-55 zona 5"+catCursos.get(1)));

*/
        alumno alumno1 = new alumno("2023015", "Juan", "456214587", "5 calle 5-55 zona 5");
        alumno1.agregarCursoAsignado(catCursos.get(0));
        alumno1.agregarCursoAsignado(catCursos.get(3));
        //alumno1.mostrarInformacion();

        alumno alumno2= new alumno("2023016", "Pedro", "456214588", "6 calle 6-66 zona 6");
        alumno2.agregarCursoAsignado(catCursos.get(1));
        alumno2.agregarCursoAsignado(catCursos.get(2)
        alumno2.agregarCursoAsignado(catCursos.get(3));
       // alumno2.mostrarInformacion();

        alumno alumno3 = new alumno("2023017", "Maria", "456214589", "7 calle 7-77 zona 7");
        alumno3.agregarCursoAsignado(catCursos.get(0));
        alumno3.agregarCursoAsignado(catCursos.get(4));
        alumno3.agregarCursoAsignado(catCursos.get(3));

        alumno alumno4 = new alumno("2023018", "Jose", "456214580", "8 calle 8-88 zona 8");
        alumno4.agregarCursoAsignado(catCursos.get(1));
        alumno4.agregarCursoAsignado(catCursos.get(4));



        for(cursoAsignado curso : alumno1.getCursoAsignado()){
            System.out.println("Nombre del curso: " + curso.getNombreCurso() + " Precio: " + curso.getCostoCurso());
        }

        alumno1.sumarCostoCurso();
        alumno2.sumarCostoCurso();
        alumno3.sumarCostoCurso();
        alumno4.sumarCostoCurso();

        System.out.println("El total del alumno 1:"+alumno1.getNombre()+" es: "+alumno1.sumarCostoCurso());
        System.out.println("El total del alumno 2:"+alumno2.getNombre()+" es: "+alumno2.sumarCostoCurso());
        System.out.println("El total del alumno 3:"+alumno3.getNombre()+" es: "+alumno3.sumarCostoCurso());
        System.out.println("El total del alumno 4:"+alumno4.getNombre()+" es: "+alumno4.sumarCostoCurso());

        System.out.printf("El total de todos los alumnos es: "+(alumno1.sumarCostoCurso()+alumno2.sumarCostoCurso()+alumno3.sumarCostoCurso()+alumno4.sumarCostoCurso())+"\n");

    }

}