/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;
import java.util.Random;
/**
 *
 * @author xand
 */
public class AulasTeoricas {
    
    public static void main(String[] args) {
       
        //Sala asd = new Sala(110, 30, true);
        
        Sala[] lista_salas = new Sala[10];
        
        lista_salas[0] = new Sala(110, 50, true);
        lista_salas[1] = new Sala(111, 30, true);
        lista_salas[2] = new Sala(112, 35, true);
        lista_salas[3] = new Sala(113, 40, true);
        lista_salas[4] = new Sala(114, 50, false);
        lista_salas[5] = new Sala(115, 30, false);
        lista_salas[6] = new Sala(116, 10, false);
        lista_salas[7] = new Sala(117, 20, false);
        lista_salas[8] = new Sala(118, 50, false);
        lista_salas[9] = new Sala(119, 30, true);
        
        
        ReservaThread t1 = new ReservaThread("Diretoria", lista_salas, 10, false, 4);
        ReservaThread t2 = new ReservaThread("Departamento de Matematica", lista_salas, 35, true, 3);
        ReservaThread t3 = new ReservaThread("Hogwarts", lista_salas, 50, true, 2);
        t1.start();
        t2.start();
        t3.start();
        
    }
    
}
