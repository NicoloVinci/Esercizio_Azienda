package org.example;

public class Impiegato extends Dipendente {
    public Impiegato(String nome, double stipendioBase) {
        super(nome, stipendioBase);
    }

    @Override
    public double calcolaStipendio() {
        return stipendioBase;
    }
}
