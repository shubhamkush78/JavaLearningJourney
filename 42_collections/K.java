import java.util.HashMap;

class K {
    public static void main(String[] args) {
        HashMap<Student1,College> records = new HashMap<Student1,College>();
        
        records.put(new Student1("om", 12), new College("JEC"));
        records.put(new Student1("ram", 9), new College("Global"));
        records.put(new Student1("golu", 15), new College("SRIT"));
        records.put(new Student1("raju", 13), new College("GGITS"));
        records.put(new Student1("kaju", 18), new College("JEC"));

        System.out.println(records);
        
        Student1 x = new Student1("golu", 15);
        System.out.println(records.containsKey(x));
        System.out.println(records.get(x));
        System.out.println(records.remove(x));
        System.out.println(records);
    }
}
