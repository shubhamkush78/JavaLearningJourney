class C {
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "yam";
        x.age = 1000;

        System.out.println(x.name + " - " + x.age);
        
        x.name = "ganesh";
        x.age = 0;

        System.out.println(x.name + " - " + x.age);
    }
}