class E3 {
    public static void main(String[] args) {
        Address a = new Address("ahmedabad", "GJ");
        
        Employee1 emp = new Employee1("Rajesh", 42, a);
       
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        System.out.println(emp.getAddr().city);
        System.out.println(emp.getAddr().state);
       
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // emp.name = "golu";
        // emp.setName("golu");
        // emp.getAddr().city = "Kolkata";
        // emp.getAddr().state = "West Bangal";
        a.city = "golu";
        a.state = "bablu";

       
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        System.out.println(emp.getAddr().city);
        System.out.println(emp.getAddr().state);
    }    
}
