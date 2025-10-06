import java.util.TreeSet;

class O {
    public static void main(String[] args) {
        TreeSet<Worker2> emps = new TreeSet<Worker2>();
        
        emps.add(new Worker2("infosys", 45));
        emps.add(new Worker2("tcs", 37));
        emps.add(new Worker2("satyam", 55));
        emps.add(new Worker2("ibm", 22));
        emps.add(new Worker2("zensar", 7));
        emps.add(new Worker2("wipro", 10));
        emps.add(new Worker2("cisco", 15));

        System.out.println(emps);
    }
}
