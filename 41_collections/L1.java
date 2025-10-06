import java.util.TreeSet;

class L1 {
    public static void main(String[] args) {
        TreeSet<Company2> emps = new TreeSet<Company2>();
        
        emps.add(new Company2("infosys", 45));
        emps.add(new Company2("tcs", 37));
        emps.add(new Company2("ibm", 22));
        emps.add(new Company2("wipro", 10));
        emps.add(new Company2("cisco", 15));

        System.out.println(emps);
    }
}
