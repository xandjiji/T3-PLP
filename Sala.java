/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;

/**
 *
 * @author xand
 */
public class Sala {
    private int id;
    private int tamanho;
    private boolean projetor;
    private String ponto_acesso;
    private boolean esta_livre;

    public Sala(int id, int tamanho, boolean projetor) {
        this.id = id;
        this.tamanho = tamanho;
        this.projetor = projetor;
        this.esta_livre = true;
        this.ponto_acesso = null;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isProjetor() {
        return projetor;
    }

    public void setProjetor(boolean projetor) {
        this.projetor = projetor;
    }

    public String getPonto_acesso() {
        return ponto_acesso;
    }

    public void setPonto_acesso(String ponto_acesso) {
        this.ponto_acesso = ponto_acesso;
    }

    public boolean isEsta_livre() {
        return esta_livre;
    }

    public void setEsta_livre(boolean esta_livre) {
        this.esta_livre = esta_livre;
    }
    
    
    
}
