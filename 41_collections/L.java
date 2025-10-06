import java.util.TreeSet;

class L {
    public static void main(String[] args) {
        TreeSet<Company> emps = new TreeSet<Company>();
        
        emps.add(new Company("infosys", 45));
        emps.add(new Company("tcs", 37));
        emps.add(new Company("ibm", 22));
        emps.add(new Company("wipro", 10));
        emps.add(new Company("cisco", 15));

        System.out.println(emps);
    }
}
