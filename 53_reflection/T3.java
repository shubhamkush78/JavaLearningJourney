import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

class T3 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class k = Class.forName("User");

        Constructor[] arr = k.getDeclaredConstructors();
        
        for(Constructor next : arr) {
            System.out.print(Modifier.toString(next.getModifiers()) + " " + next.getName() + "(");

            Class[] ar = next.getParameterTypes();
            for(Class cl : ar)
                System.out.print(cl.getName() + ", ");

            System.out.print(")");

            Class[] exp = next.getExceptionTypes();
            if(exp.length != 0)
                System.out.print(" throws ");
            for(Class nx : exp)
                System.out.print(nx.getName() + ", ");

            System.out.println();
        }
    }
}
