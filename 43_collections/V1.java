import java.util.ArrayList;
import java.util.Collections;

class V1 {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<Student1>();
        
        list.add(new Student1("om", 12));
        list.add(new Student1("ram", 9));
        list.add(new Student1("jay", 7));
        list.add(new Student1("veeru", 15));
        list.add(new Student1("raju", 17));
        list.add(new Student1("golu", 11));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
