class Y {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(128);
        Integer j = Integer.valueOf(128);

        System.out.println(i == j);
        System.out.println(i.equals(j));

        System.out.println(i.hashCode());
        System.out.println(j.hashCode());
    }    
}
