import java.util.Locale;

class N {
    public static void main(String[] args) {
        // Locale a = new Locale("de");
        // Locale a = new Locale("de", "DE");
        // Locale a = new Locale("fr", "FR");
        // Locale a = new Locale("zh", "CN");
        Locale a = new Locale("hi", "IN");
        
        System.out.println(a.getDisplayCountry() + " ---");
        System.out.println(a.getDisplayLanguage() + " ~~~");
    }
}
