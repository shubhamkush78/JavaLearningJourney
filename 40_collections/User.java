class User {
    String name;
    int age;
    
    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public boolean equals(Object obj) {
        User u1 = this;
        User u2 = (User)obj;

        String nm1 = u1.name;
        String nm2 = u2.name;

        int ag1 = u1.age;
        int ag2 = u2.age;

        boolean flag = nm1.equals(nm2) && ag1 == ag2;

        System.out.println("equals: " + u1 + " # " + u2 + " - " + flag);

        return flag;
    }

    public int hashCode() {
        String abc = " abcdefghijklmnopqrstuvwxyz";

        int sum = 0;
        
        for(int i=0;i<name.length();i++) {
            char nx = name.charAt(i);
            int pv = abc.indexOf(nx); 
            // sum = sum + pv;
            sum += pv;
        }

        sum += age;

        System.out.println("hashCode: " + name + " - " + age + " - " + sum);

        return sum;
    }
}
