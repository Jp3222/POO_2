package poo2;

import java.util.ArrayList;

public class Funciones {

    public static String BuscarXNombre(ArrayList<Materia> L, String nom) {
        for (Materia materia : L) {
            if (materia.getNombre().equalsIgnoreCase(nom)) {
                return materia.toString();
            }
        }
        return "La Materia no existe";
    }

    public static void BuscarXDia(ArrayList<Materia> L, String dia) {
        for (Materia materia : L) {
            if (materia.getDia().equalsIgnoreCase(dia)) {
                System.out.println(materia.toString());
            }
        }
    }

    public static void ImprimirTareas(ArrayList<Materia> L, String nom) {
        for (Materia materia : L) {
            if (materia.getNombre().equalsIgnoreCase(nom)) {
                System.out.println(materia.getTareas());
                break;
            }
        }
    }

    public static void ImprimirHorario(ArrayList<Materia> L) {
        String Dia[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        for (int i = 0; i < Dia.length; i++) {
            BuscarXDia(L, Dia[i]);
        }
    }
    
}
