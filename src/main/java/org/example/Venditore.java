package org.example;

public class Venditore extends Dipendente{
    protected int vendite;
    protected double percentualeCommissione;
    public Venditore(String nome, double stipendioBase, int vendite, double percentualeCommissione) {
        super(nome, stipendioBase);
        this.vendite = vendite;
        this.percentualeCommissione = percentualeCommissione;
    }

    @Override
    public double calcolaStipendio() {
        return stipendioBase + vendite * percentualeCommissione / 100;
    }
}
