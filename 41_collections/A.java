class A {
    public static void main(String[] args) {
        User u1 = new User("mohan", 12);
        User u2 = new User("hanmo", 12);

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
    }
}