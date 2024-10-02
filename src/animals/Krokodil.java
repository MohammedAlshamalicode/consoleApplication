package animals;

public class Krokodil extends Reptiel {
    private double lengteInMeter;
    private double gewichtInKilo;

    public Krokodil(String naam, double lengteInMeter, double gewichtInKilo) {
        super(naam);
        try {
            if (naam == null || naam.isEmpty()) {
                throw new IllegalArgumentException("Naam mag niet null of leeg zijn.");
            }
            if (lengteInMeter <= 0) {
                throw new IllegalArgumentException("Lengte moet positief zijn en groter dan 0.");
            }
            if (gewichtInKilo <= 0) {
                throw new IllegalArgumentException("Gewicht moet positief zijn en groter dan 0.");
            }
            this.lengteInMeter = lengteInMeter;
            this.gewichtInKilo = gewichtInKilo;

        } catch (IllegalArgumentException e) {
            System.err.println("Fout bij het maken van een Krokodil: " + e.getMessage());
            this.lengteInMeter = 0;
            this.gewichtInKilo = 0;
        }
    }

    public static java.util.Comparator<Krokodil> sorteerOpGewicht() {
        return java.util.Comparator.comparingDouble(Krokodil::getGewichtInKilo);
    }

    public double getGewichtInKilo() {
        return gewichtInKilo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lengte: " + lengteInMeter + " meter, Gewicht: " + gewichtInKilo + " kilo";
    }
}
