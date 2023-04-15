package com.mycompany.trabum.model;

public class Venda {
    
    //ATRIBUTOS
    private Livro Livro;
    private Cliente Cliente;
    private FormaPagto FormaPagto;
    
    //CONSTRUTORES
    public Venda(){
        
    }
    
    public Venda(Livro Livro, Cliente Cliente, FormaPagto FormaPagto){
        this.Livro = Livro;
        this.Cliente = Cliente;
        this.FormaPagto = FormaPagto;
    }
    
    //GET E SETTERS
    public Livro getLivro(){
        return Livro;
    }
    
    public void setLivro(Livro Livro){
        this.Livro = Livro;
    }
    
    public Cliente getCliente(){
        return Cliente;
    }
    
    public void setCliente(Cliente Cliente){
        this.Cliente = Cliente;
    }
    
    public FormaPagto getFormaPagto(){
        return FormaPagto;
    }
    
    public void setFormaPagto(FormaPagto FormaPagto){
        this.FormaPagto = FormaPagto;
    }

    @Override
    public String toString() {
        return "Venda{" + "Livro=" + Livro + ", Cliente=" + Cliente + ", FormaPagto=" + FormaPagto + '}';
    }
    
}
