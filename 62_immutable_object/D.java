class D {
    public static void main(String[] args) {
        Student5 x = new Student5("vijay", 23);

        System.out.println(x.getName() + " - " + x.getAge());
        
        x.setName("ganesh");
        x.setAge(0);
        
        System.out.println(x.getName() + " - " + x.getAge());
    }
}