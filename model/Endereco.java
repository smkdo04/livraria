package com.mycompany.trabum.model;

public class Endereco {
    
    //ATRIBUTOS
    private String nmRua;
    private String nmBairro;
    private int nmrCasa;
    private String nmCidade;
    private String nmEstado;
    private String uf;
    
    public Endereco(){
        
    }
    
    public Endereco(String nmRua, String nmBairro, int nmrCasa, 
        String nmCidade, String nmEstado, String uf){
        this.nmRua = nmRua;
        this.nmBairro = nmBairro;
        this.nmrCasa = nmrCasa;
        this.nmCidade = nmCidade;
        this.nmEstado = nmEstado;
        this.uf = uf;
    }
    
    public String getNmRua(){
        return nmRua;
    }
    
    public void setNmrua(String nmRua){
        this.nmRua = nmRua;
    }
    
    public String getNmBairro(){
        return nmBairro;
    }
    
    public void setNmBairro(String nmBairro){
        this.nmBairro = nmBairro;
    }
    
    public int getNmrCasa(){
        return nmrCasa;
    }
    
    public void setNmrCasa(int nmrCasa){
        this.nmrCasa = nmrCasa;
    }
    
    public String getNmCidade(){
        return nmCidade;
    }
    
    public void setNmCidade(String nmCidade){
        this.nmCidade = nmCidade;
    }
    
    public String getNmEstado(){
        return nmEstado;
    }
    
    public void setNmEstado(String nmEstado){
        this.nmEstado = nmEstado;
    }
    
    public String getUf(){
        return uf;
    }
    
    public void setUf(String uf){
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereco{" + "nmRua=" + nmRua + ", nmBairro=" + nmBairro + ", nmrCasa=" + nmrCasa + ", nmCidade=" + nmCidade + ", nmEstado=" + nmEstado + ", uf=" + uf + '}';
    }
    
    
}
