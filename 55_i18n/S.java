import java.util.Locale;

class S {
    public static void main(String[] args) {
        Locale a = new Locale("de", "DE");
        Locale b = new Locale("fr", "FR");
        Locale c = new Locale("da", "DK");

        System.out.println(a.getDisplayCountry());
        System.out.println(a.getDisplayLanguage());
        System.out.println(a.getDisplayCountry(a));
        System.out.println(a.getDisplayLanguage(a));
        System.out.println(a.getDisplayCountry(c));
        System.out.println(a.getDisplayLanguage(c));
        System.out.println(a.getDisplayCountry(b));
        System.out.println(a.getDisplayLanguage(b));
    }    
}
