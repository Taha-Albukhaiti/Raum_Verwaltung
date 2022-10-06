package raum.verwaltung;

public class Uhrzeit {

	private int stunde;

	private int minute;

	private Reservierung reservierung;

	private Reservierung reservierung1;

	public Uhrzeit(int stunde, int minute) {
		this.stunde = stunde;
		this.minute = minute;
	}

	@Override
	public String toString() {
		return  stunde + ":" + + minute + " Uhr";
	}
}
