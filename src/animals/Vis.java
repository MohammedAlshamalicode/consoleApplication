package animals;

import java.util.List;

public abstract class Vis extends GewerveldDier{

    private boolean isZoetWaterVis ;

    public Vis(String naam, boolean isZoetWaterVis) {
        super(naam, Huidbedekking.GLAD,List.of(Milieu.WATER));
        this.isZoetWaterVis = isZoetWaterVis;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("ZoetwaterVis : %s  , " ,(isZoetWaterVis ? "Ja" : "Nee"));
    }
}
