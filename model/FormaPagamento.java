package com.mycompany.trabum.model;

public class FormaPagto {

    private String ctDebito;
    private String ctCredito;
    private String avista;
    private String pix;

    public FormaPagto() {
    }

    public FormaPagto(String ctDebito, String ctCredito, String avista,
                      String pix) {
        this.ctDebito = ctDebito;
        this.ctCredito = ctCredito;
        this.avista = avista;
        this.pix = pix;
    }


    public String getCtDebito() {
        return ctDebito;
    }

    public void setCtDebito(String ctDebito) {
        this.ctDebito = ctDebito;
    }

    public String getCtCredito() {
        return ctCredito;
    }

    public void setCtCredito(String ctCredito) {
        this.ctCredito = ctCredito;
    }

    public String getAvista() {
        return avista;
    }

    public void setAvista(String avista) {
        this.avista = avista;
    }

    public String getPix() {
        return pix;
    }


    public void setPix(String pix) {
        this.pix = pix;
    }

    @Override
    public String toString() {
        return "FormaPagto{" + "ctDebito=" + ctDebito + ", ctCredito=" + ctCredito +
                ", avista=" + avista + ", pix=" + pix + '}';
    }

}
