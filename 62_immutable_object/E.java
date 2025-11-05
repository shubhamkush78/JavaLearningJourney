class E {
    public static void main(String[] args) {
        Employee emp = new Employee("Rajesh", 42, new Address("Jbp", "MP"));

        // System.out.println(emp.name);
        // System.out.println(emp.age);
        // System.out.println(emp.addr);
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        System.out.println(emp.getAddr().city);
        System.out.println(emp.getAddr().state);
    }    
}
