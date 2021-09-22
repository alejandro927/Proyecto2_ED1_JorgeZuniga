/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_ed1_jorgezuniga;

import java.util.ArrayList;
import java.util.Scanner;
import javafx.scene.control.ProgressBar;
import javax.swing.JProgressBar;

/**
 *
 * @author alejandro
 */
public class Proyecto2_ED1_JorgeZuniga {

    static Scanner entrada = new Scanner(System.in);
    static JProgressBar bar = new JProgressBar();
    static HiloProyecto2 h = new HiloProyecto2(bar, true);

    /**
     * @param args the command line arguments
     */
    public static int menu() {
        int opcion = 0;
        System.out.println("-----MENU----");
        System.out.println("1) 1 cola para todo el banco");
        System.out.println("2) 1 cola para cada cajero");
        System.out.println("Elija su opcion:");
        opcion = entrada.nextInt();
        while (opcion <= 0 || opcion > 2) {
            System.out.println("La opcion ingresada no es valida ingrese una nueva:");
            opcion = entrada.nextInt();
        }
        return opcion;

    }

    public static void main(String[] args) {
        int cajeros, opcion;
        System.out.println("Cuantos cajeros desea tener en el banco?:");
        cajeros = entrada.nextInt();
        while (cajeros <= 0) {
            System.out.println("La opcion ingresada no es valida ingrese una nueva:");
            cajeros = entrada.nextInt();
        }

        opcion = menu();
        switch (opcion) {
            case 1: {
                try {
                    PilaProyecto2 pila1 = new PilaProyecto2();
                    ColasProyecto2 cola1 = new ColasProyecto2();
                    h.run(cajeros);
                    System.out.println("Termino el tiempo!!!");
                    System.out.println("La pila de personas es: ");

                    pila1.MeterPila();
                    pila1.imprimirPila();
                    pila1.AnulaPila();
                    cola1.anularColas();
                } catch (Exception e) {

                }
            }
            break;
            case 2: {
                try {
                    ArrayList lista = new ArrayList();
                    PilaProyecto2 pila1 = new PilaProyecto2();
                    ColasProyecto2 cola1 = new ColasProyecto2();
                    for (int i = 0; i < cajeros; i++) {
                        lista = h.run2(cajeros);
                    }
                    System.out.println("Termino el tiempo!!!");
                    System.out.println("La pila de personas es: ");

                    pila1.MeterPila();
                    pila1.imprimirPila();
                    pila1.AnulaPila();
                    cola1.anularColas();
                    lista.removeAll(lista);
                } catch (Exception e) {

                }
            }
            break;
        }

    }
}
