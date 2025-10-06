import java.util.ArrayList;

class E {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add("mohan");
        x.add(true);
        x.add(56.34);
        x.add(500);
        x.add(new E());

        System.out.println(x);
    }

    public String toString() {
        return "Kaise Ho!!";
    }
}
