package animals;
import validators.RijksregisternummerValidator;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Mens extends Zoogdier {

    private Long rijksregisternummer;
    private LocalDate geboortedatum;

    public Mens(String naam, Long rijksregisternummer, LocalDate geboortedatum) {
        super(naam);
        if (geboortedatum == null) {
            throw new IllegalArgumentException("Geboortedatum mag niet null zijn.");
        }
        try {
            RijksregisternummerValidator.validate(rijksregisternummer, geboortedatum.toString());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }
        this.rijksregisternummer = rijksregisternummer;
        this.geboortedatum = geboortedatum;
    }

    public int getLeeftijd() {
        if (geboortedatum == null) {
            System.err.println("Geboortedatum is null. Leeftijd kan niet berekend worden.");
            return -1;
        }

        return Period.between(geboortedatum, LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Mens)) return false;
        if (!super.equals(object)) return false;
        Mens mens = (Mens) object;
        return Objects.equals(rijksregisternummer, mens.rijksregisternummer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rijksregisternummer);
    }

    @Override
    public String toString() {
        return super.toString() + ", Rijksregisternummer: " + rijksregisternummer +
                ", Leeftijd: " + (geboortedatum != null ? getLeeftijd() + " jaar" : "Onbekend");
    }
}
