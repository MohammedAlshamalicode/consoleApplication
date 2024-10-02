package animals;

import java.util.List;

public abstract class Amfibie extends GewerveldDier{

    public Amfibie(String naam) {
        super(naam, Huidbedekking.GLAD, List.of(Milieu.LAND,Milieu.WATER));
    }
}
