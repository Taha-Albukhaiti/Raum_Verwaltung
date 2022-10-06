package raum.verwaltung;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Raum {

	private int geb;

	private int etage;

	private int raum;

	protected Collection<Reservierung> reservierungen = new ArrayList<>();

	public Raum(int geb, int etage, int raum) {
		this.geb = geb;
		this.etage = etage;
		this.raum = raum;

	}

	public void addReservierung(Reservierung reservierung) {
		reservierungen.add(reservierung);
	}

	public List<Mitarbeiter> getMitarbeiter() {
		return reservierungen.stream().map(Reservierung::getMitarbeiter).toList();
	}

	@Override
	public String toString() {
		return  geb + "-" + etage + ".0" + raum;
	}
}
