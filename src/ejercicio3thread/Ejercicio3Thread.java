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
    System.out.println(getName() +" Comenzando ");
        while (aux_conta<=5){
        //El blucle For imprimirá por pantalla el mensaje en proceso mas el nombre del hilo en ejecución.
            System.out.println(aux_conta+ " Comenzando");
            try {
             if(aux_conta==5){
                
                    Thread.sleep(500);
                } 
              
              if(aux_conta==4){
                        Thread.sleep(1000);
              }
                        
              if(aux_conta==3){
                        Thread.sleep(1500);
              }
              if(aux_conta==2){
                        Thread.sleep(2000);
              }
              if(aux_conta==1){
                        Thread.sleep(2500);
              }
              if(aux_conta==0){
                        Thread.sleep(3000);
              }}
            catch (InterruptedException ex) {
                    Logger.getLogger(Ejercicio3Thread.class.getName()).log(Level.SEVERE, null, ex);
                }
            for(int i = 1;i<=10;i++){
                System.out.println(aux_conta + " en proceso");
              
                    
              }
            
             aux_conta++;
        }}
    
    
    public static void main(String[] args) throws InterruptedException {
        Ejercicio3Thread hiloprin = new Ejercicio3Thread("Padre");
        hiloprin.start();
        
    }}
