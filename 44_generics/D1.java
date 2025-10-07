class BB {

}

class D1 {
    public static void main(String[] args) {
        BB x = new BB(); 
        BB<String> y = new BB<String>(); 
        BB<Student> z = new BB<Student>(); 
    }
}




// D1.java:8: error: type BB does not take parameters
//         BB<String> y = new BB<String>();
//           ^
// D1.java:8: error: type BB does not take parameters
//         BB<String> y = new BB<String>();
//                              ^
// D1.java:9: error: type BB does not take parameters
//         BB<Student> z = new BB<Student>();
//           ^
// D1.java:9: error: type BB does not take parameters
//         BB<Student> z = new BB<Student>();
//                               ^
// 4 errors