package zoo;

import animals.GewerveldDier;
import animals.Krokodil;
import animals.Mens;

import java.util.List;
import java.util.stream.Collectors;

public record Zoo(List<GewerveldDier> dieren) {

    public void voegDierToe (GewerveldDier dier){
        if (!dieren.contains(dier)){
            dieren.add(dier);
        }
    }

// Lijst van alle dieren
    public void printLijst(List<? extends GewerveldDier> dieren){
        dieren.forEach(System.out::println);
    }

// Lijst van alle landdieren
    public List<GewerveldDier> lijstVanAleeDieren(){
        return dieren.stream().filter(dier -> dier.getMilieus().contains(GewerveldDier.Milieu.LAND)).toList();
    }

// Lijst van ieren namen gesorteerd op alfabet
    public List<String> lijstVanAlleDierenNamenGesorteerdOpAlfabet(){
        return dieren.stream().map(GewerveldDier ::getNaam).sorted().toList();
    }

//Percentage mensen
    public double percentageMensen(){
        long aantalMensen = dieren.stream().filter(dier -> dier instanceof Mens).count();
        return (aantalMensen / (double) dieren.size()) * 100 ;
    }

//Lijst van krokodillen gesorteerd op gewicht
    public List<Krokodil> lijstVanAlleKrokodillenGesorteerdOpGewicht(){
        return dieren.stream().filter(dier -> dier instanceof Krokodil).map(dier -> (Krokodil)dier).sorted(Krokodil.sorteerOpGewicht()).toList();
    }

}
