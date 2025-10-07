import java.util.HashMap;

class J {
    public static void main(String[] args) {
        HashMap<Student1,Float> records = new HashMap<Student1,Float>();
        
        records.put(new Student1("om", 12), 78.56f);
        records.put(new Student1("ram", 9), 62.12f);
        records.put(new Student1("golu", 15), 87.22f);
        records.put(new Student1("raju", 13), 56.11f);

        System.out.println(records);
        
        Student1 x = new Student1("golu", 15);
        // System.out.println(records.containsKey(x));
        System.out.println(records.remove(x));
        // System.out.println(records.get(x));
        System.out.println(records);
    }
}
