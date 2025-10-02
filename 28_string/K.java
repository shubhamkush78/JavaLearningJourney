class K {
    public static void main(String[] args) {

        String str = "om is a good boy";

        String z = str.substring(2, 13).trim().toUpperCase().replace(' ', '-').concat(" friend").toUpperCase().replace('-', ' ');

        System.out.println(z);
    }
}