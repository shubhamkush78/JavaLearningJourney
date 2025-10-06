import java.util.ArrayList;

class F {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee("mohan", 12));
        employees.add(new Employee("sohan", 16));
        employees.add(new Employee("rohan", 10));
        employees.add(new Employee("tohan", 9));
        employees.add(new Employee("gohan", 15));

        // Employee s = new Employee("iohan", 9);
        Employee s = new Employee("rohan", 9);
        System.out.println(employees);

        // boolean huaKya = employees.remove(s);
        boolean huaKya = employees.contains(s);
        System.out.println(huaKya);
        
        System.out.println(employees);
    }    
}
