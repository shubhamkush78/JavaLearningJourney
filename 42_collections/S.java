import java.util.TreeMap;

class S {
    public static void main(String[] args) {
        TreeMap<Employee1,Company> map = new TreeMap<Employee1,Company>();
        
        map.put(new Employee1("mohan", 21), new Company("TCS"));
        map.put(new Employee1("chetan", 31), new Company("Infosys"));
        map.put(new Employee1("sumit", 56), new Company("Wipro"));
        map.put(new Employee1("vikki", 28), new Company("Zensar"));
        map.put(new Employee1("john", 47), new Company("IBM"));

        System.out.println(map);
    }
}
