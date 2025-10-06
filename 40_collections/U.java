import java.util.HashSet;

class U {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<Employee>();

        employees.add(new Employee("om", 21));
        employees.add(new Employee("ram", 34));
        employees.add(new Employee("shyam", 28));
        employees.add(new Employee("ghanshyam", 45));
        employees.add(new Employee("khatushyam", 38));

        Employee s = new Employee("shyam",28);
        
        boolean flag = employees.contains(s);
        
        System.out.println(flag);
    }
}
