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
public class Ejercicio3Thread extends Thread{
public Ejercicio3Thread(String str) {
        super(str);
}

    public void run() {
       
    //Mediante la condición While ceñimos el recorrido del programa en 5 vueltas. 
    int aux_conta = 0;
    System.out.println(getName() + " Comenzando.");
        while (aux_conta<5){
        //El blucle For imprimirá por pantalla el mensaje en proceso mas el nombre del hilo en ejecución.
            for(int i = 1;i<10;i++){
                System.out.println(getName() + " en proceso");
                try {
                    //El tiempo de espera es marcado por sleep entre 100 y 600 milisegundos 
                    Thread.sleep((long) Math.random()*(100-600));
                    aux_conta++;
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ejercicio3Thread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Ejercicio3Thread hiloprin = new Ejercicio3Thread("Padre");
        Ejercicio3Thread hijo1 = new Ejercicio3Thread("Hijo1");
        Ejercicio3Thread hijo2 = new Ejercicio3Thread("Hijo2");
        Ejercicio3Thread hijo3 = new Ejercicio3Thread("Hijo3");
        Ejercicio3Thread hijo4 = new Ejercicio3Thread("Hijo4");
        hiloprin.start();
        hiloprin.join();
        hijo1.start();
        hijo1.join();
        hijo2.start();
        hijo2.join();
        hijo3.start();
        hijo3.join();
        hijo4.start();
        hijo4.join();
    }

}
