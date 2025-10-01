class K {
    public static void main(String[] args) {
        Employee[] x = {
            new Employee("a", 12, new Address(new City("Jab"), new State("MP"))),
            new Employee("b", 10, new Address(new City("Jai"), new State("RJ"))),
            new Employee("c", 9, new Address(new City("Pune"), new State("MH"))),
        };

        // int y[] = {12,13,14,};

        // System.out.println(x.length);
        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[0].address);
        System.out.println(x[0].address.city);
        System.out.println(x[0].address.city.cityName);
        System.out.println(x[0].address.state.stateName);
    }    
}
