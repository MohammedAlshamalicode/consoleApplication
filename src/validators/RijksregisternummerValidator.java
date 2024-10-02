package validators;

public class RijksregisternummerValidator {

    public static void validate(Long rijksregisternummer, String geboortedatum) {
        if (rijksregisternummer == null || geboortedatum == null || geboortedatum.length() != 10) {
            throw new IllegalArgumentException("Geboortedatum or Rijksregisternummer is null or incorrect format.");
        }
        String yymmdd = geboortedatum.substring(2, 4) + geboortedatum.substring(5, 7) + geboortedatum.substring(8, 10);

        String eersteGroep = rijksregisternummer.toString().substring(0, 6);
        if (!eersteGroep.equals(yymmdd)) {
            throw new IllegalArgumentException("De eerste zes cijfers komen niet overeen met de geboortedatum.");
        }
        String eersteNegenCijfers = rijksregisternummer.toString().substring(0, 9);
        int controlegetal = Integer.parseInt(rijksregisternummer.toString().substring(9, 11));
        if (Integer.parseInt(geboortedatum.substring(0, 4)) >= 2000) {
            eersteNegenCijfers = "2" + eersteNegenCijfers;
        }

        int berekendeControlegetal = 97 - (Integer.parseInt(eersteNegenCijfers) % 97);

        if (controlegetal != berekendeControlegetal) {
            throw new IllegalArgumentException("Controlegetal komt niet overeen. Verwacht: " + berekendeControlegetal + ", Gegeven: " + controlegetal);
        }
    }
}
