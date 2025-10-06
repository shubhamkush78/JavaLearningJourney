import java.util.TreeSet;

class P {
    public static void main(String[] args) {
        TreeSet<Worker3> emps = new TreeSet<Worker3>();
        
        emps.add(new Worker3("infosys", 45));
        // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        emps.add(new Worker3("tcs", 37));
        // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        emps.add(new Worker3("satyam", 55));
        // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        emps.add(new Worker3("ibm", 22));
        // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        emps.add(new Worker3("zensar", 7));
        // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        emps.add(new Worker3("wipro", 10));
        // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        emps.add(new Worker3("cisco", 15));

        System.out.println(emps);
    }
}
