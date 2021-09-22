/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_ed1_jorgezuniga;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author alejandro
 */
public class TransaccionProyecto2 {
    
    static Random ran = new Random();
    static ArrayList p = new ArrayList<>();

    public String Transaccion() {
        String cadena="";
        int random = ran.nextInt(4);
        while(random < 1 || random > 3){
            random = ran.nextInt(4);
        }
        switch(random){
            case 1:{
                cadena = "Deposito";
            }break;
            case 2:{
                cadena = "Retiro";
            }break;
            case 3:{
                cadena = "Pago";
            }break;
        }
        p.add(cadena);
        return cadena;
    }
    
    public ArrayList getListaT(){
        return this.p;
    }
    
}
