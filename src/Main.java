import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
       Persona persona1 = new Estudiante("Carlos", 22,"2ºDam");
       Persona persona2 = new Profesor("Marcos",40,"Entornos");
       Persona persona3 = new Estudiante("Alvaro",18, "1º DAM" );
       Persona persona4 = new Estudiante("Sebastian",19, "2º DAM");
        Persona.personas.add(persona1);
        Persona.personas.add(persona2);
        Persona.personas.add(persona3);
        Persona.personas.add(persona4);

       for (Persona persona : Persona.personas){
           if (persona instanceof Estudiante estudiante){
               estudiante.saludar();
               estudiante.mostrarCurso();
           } else if (persona instanceof Profesor profesor){
               profesor.saludar();
               profesor.mostrarMateria();
           }
       }


    }






}