/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;
import java.util.Random;

public class ReservaThread extends Thread{
    
    private String nome;
    private Sala[] array;
    private int tamanho;
    private boolean projetor;
    private int vezes;
    
    public ReservaThread(String nome, Sala[] array, int tamanho, boolean projetor, int vezes){
        this.nome = nome;
        this.array = array;
        this.tamanho = tamanho;
        this.projetor = projetor; 
        this.vezes = vezes;
        
    }
   
      
        public synchronized void reservar(Sala[] array, String ponto_acesso, int tamanho, boolean projetor){
        
            
        int numero = 99;
        boolean achou = false;
        while(achou == false){
            
            for(int i = 0; i < array.length; i++){
                if(achou == false){
                    if (tamanho <= array[i].getTamanho()){
                        if(projetor == false || (projetor == array[i].isProjetor())){
                            if(array[i].isEsta_livre() == true){
                                array[i].setEsta_livre(false);
                                array[i].setPonto_acesso(ponto_acesso);
                                System.out.println("A sala: " + array[i].getId() + " foi reservada por: " + ponto_acesso);
                                achou = true;
                                numero = i;
                                //notifyAll();
                            }
                        }
                    }
                }
            }
            
            /*if(achou == false){
                try {
                    wait();
                } catch (InterruptedException e) { 
                e.printStackTrace(); 
                }
            }*/
            
        
        }
        
        liberar(array[numero], ponto_acesso);
       
    }
    
    
    public synchronized void liberar(Sala var, String quem){
        
        
        Random rand = new Random();
        int time = rand.nextInt(8000) + 2000;
        
        
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        }
        
        if(var.isEsta_livre() == false){
        var.setEsta_livre(true);
        System.out.println("A sala: " + var.getId() + " foi LIBERADA por: " + quem);
        var.setPonto_acesso(null);
        }
        //notifyAll();
    }
    
    
    
    
    
    
            
    @Override
    public void run() {
        
        for(int i = 0; i < vezes; i++){
            Random rand = new Random();
        int time = rand.nextInt(8000) + 2000;
        
        
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        }
        
        
        
            reservar(array, nome, tamanho, projetor);
            
            Random rand2 = new Random();
        int time2 = rand2.nextInt(8000) + 2000;
        
        
        try {
            Thread.sleep(time2);
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        }
            

        }
    }
    
}
