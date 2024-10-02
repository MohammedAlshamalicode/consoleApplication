package animals;

import java.util.List;
import java.util.Objects;

public abstract class GewerveldDier {

    public enum Huidbedekking {
        GLAD, VEREN, SCHUBBEN, HAREN
    }
    public enum Milieu {
        LAND , WATER , LUCHT
    }

    protected String naam ;
    protected Huidbedekking huidbedekking ;
    protected List <Milieu> milieus ;

    public GewerveldDier(String naam, Huidbedekking huidbedekking, List<Milieu> milieus) {
        this.naam = naam;
        this.huidbedekking = huidbedekking;
        this.milieus = milieus;
    }

    @Override
    public String toString() {
        return String.format("Naam: %-13s, Huidbedekking: %-9s, Milieus: %-16s, Verzorging: %-45s",
                naam, huidbedekking, milieus, verzorging());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof GewerveldDier that)) return false;
        return Objects.equals(naam, that.naam) && huidbedekking == that.huidbedekking && Objects.equals(milieus, that.milieus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, huidbedekking, milieus);
    }

    public String verzorging(){
        return switch (huidbedekking){
            case SCHUBBEN -> "geen speciale verzorging nodig";
            case GLAD -> "regelmatig laten afkoelen";
            case HAREN -> "regelmatig wassen";
            case VEREN -> "regelmatig wassen, gladstrijken en invetten";
        };
    }

    public List<Milieu> getMilieus() {
        return milieus;
    }

    public String getNaam() {
        return naam;
    }
}
