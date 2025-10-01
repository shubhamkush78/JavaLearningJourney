class J1 {
    public static void main(String[] args) {
        Student[] x = {
            new Student("raju", 2),
            new Student("jaggu", 5),
            new Student("bheem", 8)
        };

        for(Student next : x) {
            System.out.println(next + " ~");
        }
    }    
}