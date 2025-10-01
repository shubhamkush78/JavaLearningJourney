class I {
    public static void main(String[] args) {
        Student[] x = new Student[] {
            new Student("aa", 12),
            new Student("bb", 13),
            new Student("cc", 14)
        };

        System.out.println(x[2].name);        
    }    
}
