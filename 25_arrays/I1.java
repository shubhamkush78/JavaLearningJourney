class I1 {
    public static void main(String[] args) {
        Student[] x = {
            new Student("aa", 12),
            new Student("bb", 13),
            new Student("cc", 14)
        };

        System.out.println(x[0].name);        
        System.out.println(x[1].name);        
        System.out.println(x[2].name);        
    }    
}
