/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_ed1_jorgezuniga;

import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class PilaProyecto2 extends ListaProyecto2{
    
    public void imprimirPila() {      
        for (int i = 0; i < listaPilas.size(); i++) {
            System.out.println("[" + listaPilas.get(i)+"]");
        }
        System.out.println("");
        
    }
    
    
    public ArrayList AnulaPila() {
        listaPilas.removeAll(listaPilas);
        return listaPilas;
    }
    
    public char TopePila(){
        System.out.println(listaPilas);
        int tam = listaPilas.size();
        char cad;
        cad = (char) listaPilas.get(tam);
        return cad;
    }
    
    public void MeterPila() {
        TransaccionProyecto2 transaccion = new TransaccionProyecto2();
        ArrayList listaaux = new ArrayList();
        listaaux = transaccion.getListaT();
        listaPilas = listaaux;
        /*for (int i = 0; i < listaaux.size(); i++) {
            listaPilas.add(listaaux.get(i));
        }*/
    }
    
    public boolean VacioPila(ArrayList lista){
        boolean bandera;
        if (lista.isEmpty()) {
            bandera = true;
        }else{
            bandera = false;
        }
        return bandera;
    }
    
}
