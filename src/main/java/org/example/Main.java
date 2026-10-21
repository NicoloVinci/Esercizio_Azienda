import org.example.*;

void main() {
    Impiegato i = new Impiegato("Giacomo", 1800.00);
    Manager m = new Manager("Nicolò", 1800.00);
    Stagista s = new Stagista("Giovanni", 1800.00);
    Venditore v = new Venditore("Tommaso", 1800.00, 400, 40);
    Azienda a = new Azienda();
    a.aggiungi(i);
    a.aggiungi(m);
    a.aggiungi(s);
    a.aggiungi(v);
    for(Dipendente d : a.dipendenti) {
        d.calcolaStipendio();
        d.descrizione();
        d.toString();
    }
}