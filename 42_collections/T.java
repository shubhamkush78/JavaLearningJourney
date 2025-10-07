import java.util.TreeMap;

class T {
    public static void main(String[] args) {
        TreeMap<Employee2,Company> map = new TreeMap<Employee2,Company>();
        
        map.put(new Employee2("mohan", 21), new Company("TCS"));
        map.put(new Employee2("chetan", 31), new Company("Infosys"));
        map.put(new Employee2("sumit", 56), new Company("Wipro"));
        map.put(new Employee2("vikki", 28), new Company("Zensar"));
        map.put(new Employee2("john", 47), new Company("IBM"));

        System.out.println(map);
    }
}
