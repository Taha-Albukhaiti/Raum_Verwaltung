package raum.verwaltung;

public class Main {
    public static void main(String[] args) {
        Uhrzeit t = new Uhrzeit(12, 7);
        System.out.println(t); // 12:07 Uhr
        Raum r = new Raum(2, 0, 1);
        System.out.println(r); // 2-0.01
        Person p = new Person("Max", "Musterfrau");
        System.out.println(p); // Max Musterfrau
        Mitarbeiter ma = new Mitarbeiter("Maren", "Mustermann", "ceo@xample.com");
        System.out.println(ma); // Maren Mustermann (ceo@xample.com)
        Reservierung res = ma.reserviere(r, new Uhrzeit(12, 0), new Uhrzeit(13, 15), "");
        System.out.println(res); // 2-0.01 gebucht von 12:00 Uhr bis 13:15 Uhr für Maren Mustermann (ceo@xample.com)
        System.out.println(r.getMitarbeiter()); // [Maren Mustermann (ceo@xample.com)]
        System.out.println(ma.getRaeume()); // [2-0.01]

        System.out.println();

        Uhrzeit tt = new Uhrzeit(10, 3);
        System.out.println(tt); // 12:07 Uhr
        Raum rr = new Raum(13, 1, 23);
        System.out.println(rr); // 2-0.01
        Person pp = new Person("Ali", "Ahmad");
        System.out.println(pp); // Max Musterfrau
        Mitarbeiter ml = new Mitarbeiter("Martin", "Mo", "fsda@gmail.com");
        System.out.println(ml); // Maren Mustermann (ceo@xample.com)
        Reservierung ress = ml.reserviere(rr, new Uhrzeit(23, 03), new Uhrzeit(13, 12), "");
        System.out.println(ress); // 2-0.01 gebucht von 12:00 Uhr bis 13:15 Uhr für Maren Mustermann (ceo@xample.com)
        System.out.println(rr.getMitarbeiter()); // [Maren Mustermann (ceo@xample.com)]
        System.out.println(ml.getRaeume()); // [2-0.01]
    }
}
