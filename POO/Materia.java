package poo2;

import java.util.ArrayList;
import java.util.Arrays;

public class Materia {

    private String Nombre;
    private String Salon;
    private String Profesor;
    private int Hora;
    private ArrayList<String> tareas;
    private double[] Calificacion;
    private String Dia;

    public Materia() {
        this.Nombre = "";
        this.Salon = "";
        this.Profesor = "";
        this.Hora = 0;
        this.tareas = new ArrayList<>();
        this.Dia = "";
        this.Calificacion = new double[3];
        Arrays.fill(Calificacion, -1);
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getDia() {
        return Dia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSalon() {
        return Salon;
    }

    public void setSalon(String Salon) {
        this.Salon = Salon;
    }

    public String getProfesor() {
        return Profesor;
    }

    public void setProfesor(String Profesor) {
        this.Profesor = Profesor;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }

    public String getTareas() {
        return tareas.toString();
    }

    public void setTareas(String tareas) {
        this.tareas.add(tareas);
    }

    public String getCalificacion() {
        return "Calificacion 1:" + Calificacion[0]
                + "\nCalificacion 2:" + Calificacion[1]
                + "\nCalificacion 3:" + Calificacion[2];
    }

    public void setCalificacion1(double Calificacion) {
        this.Calificacion[0] = Calificacion;
    }

    public void setCalificacion2(double Calificacion) {
        this.Calificacion[1] = Calificacion;
    }

    public void setCalificacion3(double Calificacion) {
        this.Calificacion[2] = Calificacion;
    }

    @Override
    public String toString() {
        return "Materia{"
                + "\nNombre=" + Nombre
                + "\nSalon=" + Salon
                + "\nProfesor=" + Profesor
                + "\nHora=" + Hora
                + "\nTareas=" + tareas
                + "\nCalificacion 1:" + Calificacion[0]
                + "\nCalificacion 2:" + Calificacion[1]
                + "\nCalificacion 3:" + Calificacion[2]
                + "\nDia=" + Dia + '}';
    }

}
