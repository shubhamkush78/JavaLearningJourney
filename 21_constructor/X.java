// V4.java continued...

class User {
    String name;
    String dob;
    String contact;
    
    User(String name, String dob, String contact) {
        this.name = name;
        this.dob = dob;
        this.contact = contact;
    }
}

class Student extends User {
    String degree;
    String branch;
    String college;

    Student(String name, String dob, String contact, String degree, String branch, String college) {
        super(name, dob, contact);
        this.degree = degree;
        this.branch = branch;
        this.college = college;
    }   

    public String toString() {
        return "My Name: " + name + " \nDob: " + dob + " \nContact: " + contact + " \nDegree: " + degree + " \nBranch: " + branch + " \nCollege: " + college;
    }
}

class Teacher extends User {
    int experience;
    float salary;
    String designation;

    Teacher(String name, String dob, String contact, int experience, float salary, String designation) {
        super(name, dob, contact);
        this.experience = experience;
        this.salary = salary;
        this.designation = designation;
    }

    public String toString() {
        return "My Name: " + name + " Dob: " + dob + " Contact: " + contact + " Experience: " + experience + " Salary: " + salary + " Designation: " + designation;
    }
}

class X {
    public static void main(String[] args) {
        Student x = new Student("Raju", "2022-01-01", "1111111111", "PHd", "It", "Dholakpur");
        Teacher y = new Teacher("Mr Bean", "1957-01-11", "2222222222", 60, 20000000, "HOD");

        // System.out.println("++++++++Student+++++++++Before");
        // System.out.println("Name: " + x.name);
        // System.out.println("Dob: " + x.dob);
        // System.out.println("Contact: " + x.contact);
        // System.out.println("Degree: " + x.degree);
        // System.out.println("Branch: " + x.branch);
        // System.out.println("College: " + x.college);
        
        // System.out.println("\n\n++++++++Teacher+++++++++Before");
        // System.out.println("Name: " + y.name);
        // System.out.println("Dob: " + y.dob);
        // System.out.println("Contact: " + y.contact);
        // System.out.println("Experience: " + y.experience);
        // System.out.println("Salary: " + y.salary);
        // System.out.println("Designation: " + y.designation);
        System.out.println("######################################################### ");
        System.out.println(x);
        System.out.println(y);

    }    
}
