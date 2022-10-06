package raum.verwaltung;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Mitarbeiter extends Person {

    private String email;

    protected Collection<Reservierung> buchung = new ArrayList<>();
    private Reservierung r ;

    public Mitarbeiter(String vorname, String nachname, String email) {
        super(vorname, nachname);
        this.email = email;
    }

    public Reservierung reserviere(Raum raum, Uhrzeit beginnZeit, Uhrzeit endeZeit, String bemerkung) {
        r = new Reservierung(beginnZeit, endeZeit);
        r.setRaum(raum);
        r.setBemerkung(bemerkung);
        r.setMitarbeiter(this);
        buchung.add(r);
        raum.addReservierung(r);
        return r;
    }

    public List<Raum> getRaeume() {
        return buchung.stream().map(Reservierung::getRaum).toList();
    }

    @Override
    public String toString() {
        return super.toString() + " (" + email + ")";
    }
}
