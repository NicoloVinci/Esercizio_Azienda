package org.example;

import java.util.ArrayList;

import static java.lang.IO.println;

public class Azienda {
    private ArrayList<Dipendente> dipendenti;

    public ArrayList<Dipendente> getDipendenteList() {
        return dipendenti;
    }

    public Azienda() {
        dipendenti = new ArrayList<>();
    }

    public void aggiungi(Dipendente d) {
        dipendenti.add(d);
    }

    public double costoTotale() {
        double costo = 0;
        for (Dipendente d : dipendenti) {
            costo += d.calcolaStipendio();
        }
        return costo;
    }

    public void stampaTutti() {
        for (Dipendente d : dipendenti) {
            println(d);
        }
    }

    public Dipendente piuPagato() {
        if(dipendenti.isEmpty()){
            return null;
        }
        Dipendente d = dipendenti.get(0);
        for (Dipendente dp : dipendenti) {
            if(d.calcolaStipendio() <= dp.calcolaStipendio()) {
                d = dp;
            }
        }
        return d;
    }
}
