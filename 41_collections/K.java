import java.util.TreeSet;

class K {
    public static void main(String[] args) {
        TreeSet<Employer> emps = new TreeSet<Employer>();
        
        emps.add(new Employer("infosys", 45));
        emps.add(new Employer("tcs", 37));
        emps.add(new Employer("ibm", 22));
        emps.add(new Employer("wipro", 10));
        emps.add(new Employer("cisco", 15));

        System.out.println(emps);
    }
}



// Exception in thread "main" java.lang.ClassCastException: class Employer cannot be cast to class java.lang.Comparable (Employer is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
//         at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
//         at java.base/java.util.TreeMap.put(TreeMap.java:785)
//         at java.base/java.util.TreeMap.put(TreeMap.java:534)
//         at java.base/java.util.TreeSet.add(TreeSet.java:255)
//         at K.main(K.java:7)