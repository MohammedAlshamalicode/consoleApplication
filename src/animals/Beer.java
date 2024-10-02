package animals;

import java.util.List;

public class Beer extends Zoogdier {
    private List<String> leefgebieden;

    public Beer(String naam, List<String> leefgebieden) {
        super(naam);
        if (naam == null || naam.isEmpty()) {
            throw new IllegalArgumentException("Naam mag niet null of leeg zijn.");
        }
        if (leefgebieden == null || leefgebieden.isEmpty()) {
            throw new IllegalArgumentException("Leefgebieden mag niet null of leeg zijn.");
        }
        this.leefgebieden = leefgebieden;
    }

    public void voegLeefgebiedToe(String leefgebied) {
        if (leefgebied == null || leefgebied.isEmpty()) {
            throw new IllegalArgumentException("Leefgebied mag niet null of leeg zijn.");
        }

        if (leefgebieden.contains(leefgebied)) {
            throw new IllegalArgumentException("Leefgebied bestaat al.");
        }

        leefgebieden.add(leefgebied);
    }

    @Override
    public String toString() {
        return super.toString() + ", Leefgebieden: " + (leefgebieden != null ? String.join(", ", leefgebieden) : "Geen leefgebieden beschikbaar");
    }
}
