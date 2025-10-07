import java.util.HashMap;

class H {
    public static void main(String[] args) {
        HashMap<Student,Float> records = new HashMap<Student,Float>();
        
        records.put(new Student("om", 12), 78.56f);
        records.put(new Student("ram", 9), 62.12f);
        records.put(new Student("golu", 15), 87.22f);
        records.put(new Student("raju", 13), 56.11f);

        System.out.println(records);
    }
}
