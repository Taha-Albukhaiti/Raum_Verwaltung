package raum.verwaltung;

public class Reservierung {

	private String bemerkung;

	protected Mitarbeiter von;

	private Uhrzeit beginn;

	private Uhrzeit ende;

	protected Raum raum;

	public Reservierung(Uhrzeit beginn, Uhrzeit ende) {
		this.beginn = beginn;
		this.ende = ende;
	}

	public void setBemerkung(String bemerkung) {
		this.bemerkung = bemerkung;
	}

	public void setMitarbeiter(Mitarbeiter mitarbeiter) {
		this.von = mitarbeiter;
	}

	public Mitarbeiter getMitarbeiter() {
		return von;
	}

	public void setRaum(Raum raum) {
		this.raum = raum;
	}

	public Raum getRaum() {
		return raum;
	}

	@Override
	public String toString() {
		return von.getRaeume()+ " gebucht von " + beginn.toString() + " bis " + ende.toString() + " für " + getMitarbeiter() ;
	}
}
