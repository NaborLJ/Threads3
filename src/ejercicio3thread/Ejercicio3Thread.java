/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nabor
 */
public class Ejercicio3Thread extends Thread {

    public static int CONTADOR = 4;
    public static int aux_contador = 0;

    public static void main(String[] args) throws InterruptedException {
        new Ejercicio3Thread("Thread").start();

    }

    public Ejercicio3Thread(String str) {
        super(str);
    }
    public void run() {

        //Mediante esta condición While iremos durmiendo a los hilos dependiendo de su posición en el contador. 
        //Durmiendo las posiciones de 0 a 3 haremos que el primer hilo que comience sea el 4 y vaya en orden descendente a medida que se van "despertando" los demas.
        while (CONTADOR >0) {
            
            System.out.println(CONTADOR + " Comenzando");
            try{
                
                if (aux_contador==0) {
                    Ejercicio3Thread.sleep(4000);
                }
                if (aux_contador==1) {
                    Ejercicio3Thread.sleep(3500);
                }
                if (aux_contador==2) {
                    Ejercicio3Thread.sleep(3000);
                }
                if (aux_contador==3) {
                    Ejercicio3Thread.sleep(2500);
                }
                //Una vez de se inicie el hilo correspondiente a la posicion del contador se mostrará 10 veces el mensaje de "en proceso"
                 for (int i = 1; i <= 10; i++) {
            System.out.println(CONTADOR+ " en proceso");
            
            }
                 System.out.println("Ha terminado ");
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio3Thread.class.getName()).log(Level.SEVERE, null, ex);
            }
            //Al finalizar los 10 procesos se aumentará una vuelta al contador que guarda las posiciones de los hilos. Para poder así irse despertando.
            CONTADOR--;
            aux_contador++;
            
            
        }
    }

}
