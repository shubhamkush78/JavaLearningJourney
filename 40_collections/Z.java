class Z {
    public static void main(String[] args) {
        String i = new String("128");
        String j = new String("128");

        System.out.println(i == j);
        System.out.println(i.equals(j));

        System.out.println(i.hashCode());
        System.out.println(j.hashCode());
    }    
}
