package com.mycompany.trabum.model;

public class Cliente {
    
    //ATRIBUTOS
    private String nmCliente;
    private String cliCpf;
    private int idade;
    private Endereco Endereco;
    
    //CONSTRUTORES
    public Cliente(){
        
    }
    
    public Cliente(String nmCliente, String cliCpf, int idade){
        this.nmCliente = nmCliente;
        this.cliCpf = cliCpf;
        this.idade = idade;
    }

    //GET E SETTERS
    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public String getCliCpf() {
        return cliCpf;
    }

    public void setCliCpf(String cliCpf) {
        this.cliCpf = cliCpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nmCliente=" + nmCliente + ", cliCpf=" + cliCpf + ", idade=" + idade + '}';
    }
    
    
    
    
}
