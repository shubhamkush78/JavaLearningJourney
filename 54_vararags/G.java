class G {
    public static void main(String[] args) {
        pro(78);
        pro(78, 45, 90);
        pro(78, 45, 90, 34, 85);
        pro();
    }   
    
    // variable number of arguments(varargs)
    static void pro(int... x) {

        for(int next : x) {
            System.out.print(next + ", ");
        }

        System.out.println();
    }
}
