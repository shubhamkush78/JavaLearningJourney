import java.util.ArrayList;

class L {
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
        x.add("ram");
        x.add("raju");
        x.add("golu");
        x.add("kaliya");
        x.add("bheem");

        return x;
    }
}
