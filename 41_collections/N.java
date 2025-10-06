import java.util.TreeSet;

class N {
    public static void main(String[] args) {
        TreeSet<Worker> emps = new TreeSet<Worker>();
        
        emps.add(new Worker("infosys", 45));
        emps.add(new Worker("tcs", 37));
        emps.add(new Worker("ibm", 22));
        emps.add(new Worker("zensar", 7));
        emps.add(new Worker("wipro", 10));
        emps.add(new Worker("cisco", 15));

        System.out.println(emps);
    }
}
