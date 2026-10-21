package org.example;

public class Manager extends Dipendente {
    protected double bonus;
    public Manager(String nome, double stipendioBase, double bonus) {
        super(nome, stipendioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcolaStipendio() {
        return stipendioBase + bonus;
    }

    @Override
    public String descrizione() {
        return super.descrizione() + " (manager)";
    }
}
