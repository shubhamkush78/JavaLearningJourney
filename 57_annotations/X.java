@interface User {
    String name = "om";
    int age = 12;
}

@User(name="gopal",age=23)
class X {
    
}



// X.java:6: error: cannot find symbol
// @User(name="gopal",age=23)
//       ^
//   symbol:   method name()
//   location: @interface User
// X.java:6: error: cannot find symbol
// @User(name="gopal",age=23)
//                    ^
//   symbol:   method age()
//   location: @interface User
// 2 errors