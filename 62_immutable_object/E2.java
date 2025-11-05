class E2 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1("Rajesh", 42, new Address("Mumbai", "MH"));
       
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        System.out.println(emp.getAddr().city);
        System.out.println(emp.getAddr().state);
       
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // emp.name = "golu";
        // emp.setName("golu");
        emp.getAddr().city = "Kolkata";
        emp.getAddr().state = "West Bangal";
       
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        System.out.println(emp.getAddr().city);
        System.out.println(emp.getAddr().state);
    }    
}
