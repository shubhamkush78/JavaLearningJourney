import java.io.*;

class B {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee emp = (Employee)(new ObjectInputStream(new FileInputStream("golu.txt")).readObject());
    
        System.out.println(emp.name);
        System.out.println(emp.age);
        System.out.println(emp.designation);
        System.out.println(emp.salary);
    }
}
