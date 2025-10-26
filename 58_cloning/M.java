class Teacher implements Cloneable {
    String name;
    int age;
    Address addr;

    Teacher(String name, int age, Address addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public Teacher clone() {
        Teacher emp = null;

        try{
            emp = (Teacher)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return emp;
    }
}

class Address {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

class M {
    public static void main(String[] args) {
        Teacher t = new Teacher("Ganesh", 28, new Address("Jbp", "MP"));

        Teacher y = t.clone();

        System.out.println(t.name + " - " + t.age + " - " + t.addr.city + " - " + t.addr.state);
        System.out.println(y.name + " - " + y.age + " - " + y.addr.city + " - " + y.addr.state);
    
        System.out.println(t);
        System.out.println(y);
        System.out.println(t.addr);
        System.out.println(y.addr);
    }    
}
