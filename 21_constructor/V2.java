class User {
    String name;
    String dob;
    String contact;
}

class Student extends User {
    // String name;
    // String dob;
    // String contact;
    String degree;
    String branch;
    String college;

    Student(String name, String dob, String contact, String degree, String branch, String college) {
        this.name = name;
        this.dob = dob;
        this.contact = contact;
        this.degree = degree;
        this.branch = branch;
        this.college = college;
    }   
}

class Teacher extends User {
    // String name;
    // String dob;
    // String contact;
    int experience;
    float salary;
    String designation;

    Teacher(String name, String dob, String contact, int experience, float salary, String designation) {
        this.name = name;
        this.dob = dob;
        this.contact = contact;
        this.experience = experience;
        this.salary = salary;
        this.designation = designation;
    }
}

class V2 {
    public static void main(String[] args) {
        Student x = new Student("Bholu", "1999-12-23", "7777777777", "MTech", "EC", "SRIT");
        Teacher y = new Teacher("V K Jadhav", "1972-01-11", "9999999999", 21, 150000, "HOD");

        System.out.println("++++++++Student+++++++++Before");
        System.out.println("Name: " + x.name);
        System.out.println("Dob: " + x.dob);
        System.out.println("Contact: " + x.contact);
        System.out.println("Degree: " + x.degree);
        System.out.println("Branch: " + x.branch);
        System.out.println("College: " + x.college);
        
        System.out.println("\n\n++++++++Teacher+++++++++Before");
        System.out.println("Name: " + y.name);
        System.out.println("Dob: " + y.dob);
        System.out.println("Contact: " + y.contact);
        System.out.println("Experience: " + y.experience);
        System.out.println("Salary: " + y.salary);
        System.out.println("Designation: " + y.designation);
    }    
}
