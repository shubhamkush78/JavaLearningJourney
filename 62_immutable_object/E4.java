class E4 {
    public static void main(String[] args) {
        Address a = new Address("bengaluru", "KN");
        
        Employee2 emp = new Employee2("Rajesh", 42, a);
       
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        System.out.println(emp.getAddr().city);
        System.out.println(emp.getAddr().state);
       
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // emp.name = "golu";
        // emp.setName("golu");
        // emp.getAddr().city = "Kolkata";
        // emp.getAddr().state = "West Bangal";
        a.city = "chotabheem";
        a.state = "raju";

       
        System.out.println(emp.getName());
        System.out.println(emp.getAge());
        System.out.println(emp.getAddr().city);
        System.out.println(emp.getAddr().state);
    }    
}
