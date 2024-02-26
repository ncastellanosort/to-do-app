/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Procedimientos {

    Scanner in = new Scanner(System.in);
    ListaTareas listaDeTareas = new ListaTareas();

    boolean cond = true;

    public void Menu() {

        do {

            System.out.println("\n---------To-do---------\n");

            System.out.println("\n-----------------------\n");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Mostrar Tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tareas completadas");

            System.out.println("5. Salir");

            System.out.println("\n-----------------------\n");

            System.out.println("Seleccione la opcion: ");
            int opc = in.nextInt();

            switch (opc) {

                case 1:
                    listaDeTareas.agregarTarea();
                    break;

                case 2:
                    listaDeTareas.mostrarTareas();
                    break;

                case 3:
                    listaDeTareas.mostrarTitulosTareas();
                    listaDeTareas.obtenerTarea();
                    break;
                    
                case 4:
                    listaDeTareas.eliminarTareas();
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    cond = false;
                    break;

                default:
                    System.out.println("\nIngrese una opcion correcta\n");
                    break;

            }
        } while (cond);

    }

}
