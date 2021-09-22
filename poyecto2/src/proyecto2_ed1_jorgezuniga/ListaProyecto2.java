/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_ed1_jorgezuniga;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author alejandro
 */
public class ListaProyecto2 {
            
    static Random ran = new Random();
    static Scanner entrada = new Scanner(System.in);
    static ArrayList listaColas = new ArrayList();
    static ArrayList listaPilas = new ArrayList();
    
    public void imprimirC() {
        for (int i = 0; i < listaColas.size(); i++) {
            System.out.print("[" + listaColas.get(i) + "]");
        }
        System.out.println("");
    }
    
    public void imprimirP() {
        for (int i = 0; i < listaPilas.size(); i++) {
            System.out.print("[" + listaPilas.get(i) + "]");
        }
        System.out.println("");
    }
 
    public void anularP(){
        listaPilas.removeAll(listaPilas);
    }
    
    public void anularC(){
        listaColas.removeAll(listaColas);
    }

}
