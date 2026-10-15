package org.example;

public abstract class Dipendente {
    protected String nome;
    protected double stipendioBase;

    public Dipendente(String nome, double stipendioBase) {
        this.nome = nome;
        this.stipendioBase = stipendioBase;
    }

    public abstract double calcolaStipendio();

    public String descrizione() {
        return "dipendente: " + nome;
    }

    @Override
    public String toString() {
        return "Descrizione: " + descrizione() + " - Stipendio: " + calcolaStipendio();
    }
}
