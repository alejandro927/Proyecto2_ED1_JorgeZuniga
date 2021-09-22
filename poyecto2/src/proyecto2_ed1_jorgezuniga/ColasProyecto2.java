/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_ed1_jorgezuniga;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class ColasProyecto2 extends ListaProyecto2{
    
    TransaccionProyecto2 trans = new TransaccionProyecto2();
    
    static Scanner entrada = new Scanner(System.in);

    public void imprimirColas() {
        for (int i = 0; i < listaColas.size(); i++) {
            System.out.print(listaColas.get(i));
        }
        System.out.println("");
    }
    
    public void agregarColas(int cant) {
        for (int i = 0; i < cant; i++) {
            CajeroProyecto2 c = new CajeroProyecto2();
            listaColas.add(c);
        }
    }
    
    public ArrayList agregarColas2(int cant) {
        for (int i = 0; i < cant; i++) {
            CajeroProyecto2 c = new CajeroProyecto2();
            listaColas.add(c);
        }
        return listaColas;
    }
    
    public void anularColas(){
        listaColas.removeAll(listaColas);
    }
    
    public void quitarColas(int pos){
        listaColas.remove(pos);
        System.out.println("Eliminado exitoso!!");
    }
}
