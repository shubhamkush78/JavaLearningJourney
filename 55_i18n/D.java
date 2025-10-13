import java.util.Date;

class D {
    public static void main(String[] args) {
        Date x = new Date();

        System.out.println(x);

        Date y = new Date(x.getTime()+3600000);
        System.out.println(y);
    }    
}
