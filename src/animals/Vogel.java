package animals;

import java.util.List;

public abstract class Vogel extends GewerveldDier {

    private boolean kanVliegen ;

    public Vogel(String naam, boolean kanVliegen) {
        super(naam, Huidbedekking.VEREN, List.of(Milieu.LAND,Milieu.LUCHT));
        this.kanVliegen = kanVliegen;
    }

    @Override
    public String toString() {
        return super.toString() + ", Kan vliegen : " + kanVliegen;
    }
}
