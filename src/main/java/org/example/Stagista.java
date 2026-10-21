package org.example;

public class Stagista extends Impiegato{
    public Stagista(String nome, double stipendioBase) {
        super(nome, stipendioBase);
    }

    @Override
    public double calcolaStipendio() {
        return super.calcolaStipendio() / 2;
    }
}
