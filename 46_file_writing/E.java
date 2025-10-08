import java.io.FileWriter;

class E {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("yamraj.txt");

            fw.write(65);
            fw.write(66);
            fw.write(67);

            fw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
