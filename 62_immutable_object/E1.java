class E1 {
    public static void main(String[] args) {
        Employee emp = new Employee("Rajesh", 42, new Address("Jbp", "MP"));
       
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        System.out.println(emp.getAddr().city);
        System.out.println(emp.getAddr().state);
       
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // emp.name = "golu";
        // emp.setName("golu");
        emp.getAddr().city = "Jaipur";
        emp.getAddr().state = "Rajasthan";
       
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        System.out.println(emp.getAddr().city);
        System.out.println(emp.getAddr().state);
    }    
}
