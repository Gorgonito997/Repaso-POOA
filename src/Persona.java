import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persona {
    private String nombre;
    private int edad;
    static List<Persona> personas = new ArrayList<>();

    public Persona(String nombre, int edad){
        setEdad(edad);
        setNombre(nombre);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        Objects.requireNonNull(nombre,"El nombre no puede ser nulo.");
        this.nombre = nombre;
    }

    public void saludar(){
        System.out.printf("Hola, me llamo %s y tengo %s %n", nombre, edad);
    }

    public void anadirPersonas(Persona persona){
        if (persona instanceof Estudiante estudiante){
            personas.add(estudiante);
        }
        if (persona instanceof Profesor profesor){
            personas.add(profesor);
        }
    }

    public void mostrarPersonas(List<Persona> lista){
        for (Persona persona : lista){
            System.out.println(persona);
        }
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", nombre, edad);
    }
}
