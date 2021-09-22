/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_ed1_jorgezuniga;

import java.util.Random;
import java.util.ArrayList;
import javax.swing.JProgressBar;

/**
 *
 * @author aleja
 */
public class HiloProyecto2 {

    private boolean vivo;
    private JProgressBar ProgressBar;
    static Random ran = new Random();
    static private int valor;
    static private int contador=0;
    static private ColasProyecto2 cola1 = new ColasProyecto2();
    static ArrayList lista = new ArrayList();
    static private ArrayList valores = new ArrayList();

    public HiloProyecto2(JProgressBar ProgressBar, boolean vivo) {
        this.ProgressBar = ProgressBar;
        this.vivo = vivo;
    }

    public void run(int cajeros) {
        do {
            while (ProgressBar.getValue() <= ProgressBar.getMaximum() - 1) {
                if (vivo) {
                    ProgressBar.setValue(ProgressBar.getValue() + 1);
                }
                try {
                    cola1.agregarColas(cajeros);
                    int random = 0;
                    random = ran.nextInt(3) + 1;
                    while (random < 1 || random > 3) {
                        random = ran.nextInt(3) + 1;
                    }
                    switch (random) {
                        case 1: {
                            valor = 10;
                            contador=contador + valor;
                            this.valores.add(valor);
                        }break;
                        case 2: {
                            valor = 20;
                            contador=contador + valor;
                            this.valores.add(valor);
                        }break;
                        case 3: {
                            valor = 30;
                            contador=contador + valor;
                            this.valores.add(valor);
                        }break;
                    }
                    Thread.sleep(1200);
                } catch (InterruptedException ex) {
                    System.out.println("Error en la clase " + HiloProyecto2.class.getName());
                }
            }
        } while (contador <= 1200);
    }
    
    public ArrayList run2(int cajeros) {
        do {
            while (ProgressBar.getValue() <= ProgressBar.getMaximum() - 1) {
                if (vivo) {
                    ProgressBar.setValue(ProgressBar.getValue() + 1);
                }
                try {
                    lista = cola1.agregarColas2(cajeros);
                    int random = 0;
                    random = ran.nextInt(3) + 1;
                    while (random < 1 || random > 3) {
                        random = ran.nextInt(3) + 1;
                    }
                    switch (random) {
                        case 1: {
                            valor = 10;
                            contador=contador + valor;
                            this.valores.add(valor);
                        }break;
                        case 2: {
                            valor = 20;
                            contador=contador + valor;
                            this.valores.add(valor);
                        }break;
                        case 3: {
                            valor = 30;
                            contador=contador + valor;
                            this.valores.add(valor);
                        }break;
                    }
                    Thread.sleep(1200);
                } catch (InterruptedException ex) {
                    System.out.println("Error en la clase " + HiloProyecto2.class.getName());
                }
            }
        } while (contador <= 1200);
        return lista;
    }

    public int getValor() {
        return this.valor;
    }

}
