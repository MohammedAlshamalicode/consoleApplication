package animals;

import java.util.List;

public abstract class Zoogdier extends GewerveldDier{

    public Zoogdier(String naam) {
        super(naam, Huidbedekking.HAREN, List.of(Milieu.WATER,Milieu.LAND));
    }
}
