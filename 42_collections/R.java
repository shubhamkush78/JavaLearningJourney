import java.util.TreeMap;

class R {
    public static void main(String[] args) {
        TreeMap<Employee,Company> map = new TreeMap<Employee,Company>();
        
        map.put(new Employee("mohan", 21), new Company("TCS"));
        map.put(new Employee("chetan", 31), new Company("Infosys"));
        map.put(new Employee("sumit", 56), new Company("Wipro"));
        map.put(new Employee("vikki", 28), new Company("Zensar"));
        map.put(new Employee("john", 47), new Company("IBM"));

        System.out.println(map);
    }
}
