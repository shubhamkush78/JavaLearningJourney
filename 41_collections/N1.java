import java.util.TreeSet;

class N1 {
    public static void main(String[] args) {
        TreeSet<Worker1> emps = new TreeSet<Worker1>();
        
        emps.add(new Worker1("infosys", 45));
        emps.add(new Worker1("tcs", 37));
        emps.add(new Worker1("ibm", 22));
        emps.add(new Worker1("zensar", 7));
        emps.add(new Worker1("wipro", 10));
        emps.add(new Worker1("cisco", 15));

        System.out.println(emps);
    }
}
