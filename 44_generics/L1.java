import java.util.ArrayList;

class L1 {
    //new code ....
    public static void main(String[] args) {
        //calling the old code...
        ArrayList<String> list = pro();

        System.out.println(list);
    }  
    
    // ArrayList<String> list = new ArrayList();

    //old code....
    static ArrayList pro() {
        ArrayList x = new ArrayList();

        x.add("om");
        x.add(12);
        x.add(true);
        x.add(2.3);

        return x;
    }
}
