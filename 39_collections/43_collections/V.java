import java.util.ArrayList;
import java.util.Collections;

class V {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        
        list.add(new Student("om", 12));
        list.add(new Student("ram", 9));
        list.add(new Student("jay", 7));
        list.add(new Student("veeru", 15));
        list.add(new Student("raju", 17));
        list.add(new Student("golu", 11));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}



// V.java:17: error: no suitable method found for sort(ArrayList<Student>)
//         Collections.sort(list);
//                    ^
//     method Collections.<T#1>sort(List<T#1>) is not applicable
//       (inference variable T#1 has incompatible bounds
//         equality constraints: Student
//         lower bounds: Comparable<? super T#1>)
//     method Collections.<T#2>sort(List<T#2>,Comparator<? super T#2>) is not applicable
//       (cannot infer type-variable(s) T#2
//         (actual and formal argument lists differ in length))
//   where T#1,T#2 are type-variables:
//     T#1 extends Comparable<? super T#1> declared in method <T#1>sort(List<T#1>)
//     T#2 extends Object declared in method <T#2>sort(List<T#2>,Comparator<? super T#2>)
// 1 error
