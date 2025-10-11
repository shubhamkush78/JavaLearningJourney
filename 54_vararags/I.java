class I {
    public static void main(String[] args) {
        pro("Hitesh", 12, 88, 99, 77, 66);
    }   
    
    static void pro(String name, int age, int... marks) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        System.out.print("Marks: ");
        for(int next : marks)
            System.out.print(next + ", ");
            
        System.out.println();
    }
}
