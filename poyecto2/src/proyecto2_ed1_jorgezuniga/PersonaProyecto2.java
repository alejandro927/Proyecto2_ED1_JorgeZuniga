/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_ed1_jorgezuniga;

import java.util.ArrayList;

/**
 *
 * @author alejandro
 */
public class PersonaProyecto2 {
    static private ArrayList listaPersona = new ArrayList();
    static private String transaccion;
    TransaccionProyecto2 t = new TransaccionProyecto2();
    
    
    public PersonaProyecto2() {
        listaPersona.add(transaccion);
    }
    
    public ArrayList AgregarPersona(){
        TransaccionProyecto2 t = new TransaccionProyecto2();
        transaccion = t.Transaccion();
        listaPersona.add(transaccion);
        return listaPersona;    
    }

    @Override
    public String toString() {
        return PersonaProyecto2.transaccion;
    }
    
    
    
}
