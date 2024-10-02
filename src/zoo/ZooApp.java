package zoo;

import animals.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ZooApp {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(new ArrayList<>());
        // Dieren toevogen
        zoo.voegDierToe(new Beer("Beer", List.of("Bos", "Arctisch gebied")));
        zoo.voegDierToe(new Kikker("Kikker"));
        zoo.voegDierToe(new Krokodil("Krokodil", 5, 500));
        zoo.voegDierToe(new Struisvogel("Struisvogel"));
        zoo.voegDierToe(new Zalm("Zalm", "Roze"));
        zoo.voegDierToe(new Krokodil("Krokodil2", 7, 490));
        zoo.voegDierToe(new Mens("John Doe", 88073051396L, LocalDate.of(1988, 07, 30)));

        //methods testen
        System.out.println("Alle landdieren:");
        zoo.printLijst(zoo.lijstVanAleeDieren());
        System.out.print("**************************");
        System.out.println("\nDieren namen gesorteerd op alfabet:");
        zoo.lijstVanAlleDierenNamenGesorteerdOpAlfabet().forEach(System.out::println);
        System.out.print("**************************");
        System.out.println("\nPercentage mensen:");
        System.out.printf("%s%%%n",String.format("%.2f",zoo.percentageMensen()));
        System.out.print("**************************");
        System.out.println("\nKrokodillen gesorteerd op gewicht:");
        zoo.printLijst(zoo.lijstVanAlleKrokodillenGesorteerdOpGewicht());
        System.out.print("**************************");

    }
}
