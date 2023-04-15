package com.mycompany.trabum.model;

public class Livro {
    
    //ATRIBUTOS
    private String nmLivro;
    private String nmEditora;
    private String autores;
    private String gnrLivro;
    private int anoLanc; 
    private int vlrLivro;
    private int nmrPag;
    private Estoque Estoque;
    
    //CONSTRUTORES
    public Livro(){
        
    }
    
    public Livro(String nmLivro, String nmEditora, String autores, String gnrLivro,
    int anoLanc, int vlrLivro, int nmrPag, Estoque Estoque){
        this.nmLivro = nmLivro;
        this.nmEditora = nmEditora;
        this.autores = autores;
        this.gnrLivro = gnrLivro;
        this.anoLanc = anoLanc;
        this.vlrLivro = vlrLivro;
        this.nmrPag = nmrPag;
        this.Estoque = Estoque;
    }

    //GET E SETTERS
    public String getNmLivro() {
        return nmLivro;
    }

    public void setNmLivro(String nmLivro) {
        this.nmLivro = nmLivro;
    }

    public String getNmEditora() {
        return nmEditora;
    }

    public void setNmEditora(String nmEditora) {
        this.nmEditora = nmEditora;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getGnrLivro() {
        return gnrLivro;
    }

    public void setGnrLivro(String gnrLivro) {
        this.gnrLivro = gnrLivro;
    }

    public int getAnoLanc() {
        return anoLanc;
    }

    public void setAnoLanc(int anoLanc) {
        this.anoLanc = anoLanc;
    }

    public int getVlrLivro() {
        return vlrLivro;
    }

    public void setVlrLivro(int vlrLivro) {
        this.vlrLivro = vlrLivro;
    }

    public int getNmrPag() {
        return nmrPag;
    }

    public void setNmrPag(int nmrPag) {
        this.nmrPag = nmrPag;
    }

    public Estoque getEstoque() {
        return Estoque;
    }

    public void setEstoque(Estoque Estoque) {
        this.Estoque = Estoque;
    }

    @Override
    public String toString() {
        return "Livro{" + "nmLivro=" + nmLivro + ", nmEditora=" + nmEditora + ", autores=" + autores + ", gnrLivro=" + gnrLivro + ", anoLanc=" + anoLanc + ", vlrLivro=" + vlrLivro + ", nmrPag=" + nmrPag + ", Estoque=" + Estoque + '}';
    }
    
    
}
