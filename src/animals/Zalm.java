package animals;

public class Zalm extends Vis{

    private String kleur ;

    public Zalm(String naam, String kleur) {
        super(naam, true);
        this.kleur = kleur;
    }

    public String getKleur() {
        return kleur;
    }

    @Override
    public String toString() {
        return super.toString() + "Kleur : " + getKleur();
    }
}
