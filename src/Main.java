import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos", 40);
        persona.saludar();
        Estudiante estudiante = new Estudiante("Laura", 21, "2º DAM");
        estudiante.saludar();
        estudiante.mostrarCurso();
        Persona p = new Estudiante("Andrés", 22, "1º DAM");
        p.saludar();
        Persona p1 = new Estudiante("Carlos", 22, "1º DAM");
        Profesor profesor = new Profesor("Luis", 45,"Programación");
        Persona.personas.add(p);
        Persona.personas.add(persona);
        Persona.personas.add(estudiante);
        System.out.println(Persona.personas);
        profesor.reganar(profesor,p);


    }






}