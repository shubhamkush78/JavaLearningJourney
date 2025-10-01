class Y2 {
    public static void main(String[] args) {
        String name = "vikram";
        int age = 21;
        float marks = 79.21f;
        
        //format-specifiers: %s, %d, %f...
        String str = String.format("My Name Is: %s and My Age is %d and My Marks: %.2f", name, age, marks);

        System.out.println(str);
    }
}