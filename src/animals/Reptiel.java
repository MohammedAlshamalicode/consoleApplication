package animals;

import java.util.List;

public abstract class Reptiel extends GewerveldDier{

    public Reptiel(String naam) {
        super(naam,Huidbedekking.SCHUBBEN, List.of(Milieu.LAND,Milieu.WATER));
    }
}
