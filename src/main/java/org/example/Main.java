import org.example.*;

import static java.lang.IO.println;

void main() {
    Impiegato i = new Impiegato("Giacomo", 1800.00);
    Manager m = new Manager("Nicolò", 1800.00, 5000);
    Stagista s = new Stagista("Giovanni", 1800.00);
    Venditore v = new Venditore("Tommaso", 1800.00, 400, 40);
    Azienda a = new Azienda();
    a.aggiungi(i);
    a.aggiungi(m);
    a.aggiungi(s);
    a.aggiungi(v);
    for(Dipendente d : a.getDipendenteList()) {
        println("Stipendio: " + d.calcolaStipendio());
        println("Descrizione: " + d.descrizione());
        println("toString: " + d);
        println();
    }
    println();
    println("Totale degli stipendi: " + a.costoTotale());
    println("Dipendente più pagato: " + a.piuPagato().toString() + "\n");
    a.stampaTutti();

}