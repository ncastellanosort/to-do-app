/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class ListaTareas {

    Scanner in = new Scanner(System.in);

    private ArrayList<Tarea> tareas;

    public ListaTareas() {
        tareas = new ArrayList<>();

    }

    public void agregarTarea() {

        String nombre = JOptionPane.showInputDialog(null, "Nombre de la tarea: ");

        Tarea tarea = new Tarea(nombre, false);
        tareas.add(tarea);

        System.out.println();
    }

    public void mostrarTareas() {

        StringBuilder mensaje = new StringBuilder();

        System.out.println("\nTareas\n");

        for (Tarea tarea : tareas) {

            mensaje.append("Nombre de la tarea: ").append(tarea.getNombreTarea()).append("\nCompletada?  ").append(tarea.isCompletada()).append("\n\n");

//            System.out.printf("\nNombre de la tarea: %s\n", tarea.getNombreTarea());
//            System.out.printf("Completada?  %b\n", tarea.isCompletada());
        }

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Tareas", JOptionPane.INFORMATION_MESSAGE);

        System.out.println();

    }

    public void mostrarTitulosTareas() {

        System.out.println("\nTareas actuales: ");
        int inc = 0;

        for (Tarea tarea : tareas) {
            System.out.println((inc + 1) + ". " + tarea.getNombreTarea());
            inc++;
        }

        System.out.println();

    }

    public void obtenerTarea() {

        System.out.println("\nSeleccione el indice de la tarea ya realizada: ");

        int ind = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione el indice de la tarea ya realizada: "));

        Tarea tareaRealizada = tareas.get(ind);

        tareaRealizada.setCompletada(true);

        System.out.println();

    }

    public void eliminarTareas() {

        System.out.println();

        for (Tarea tarea : tareas) {
            if (tarea.isCompletada() == true) {
                tareas.remove(tarea);
            }

        }

        System.out.println("Tareas eliminadas");

        System.out.println();

    }

}
