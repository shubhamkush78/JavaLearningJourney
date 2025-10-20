@interface AAA {
    String name();
}

@AAA
class Y1 {
    
}


// Y1.java:5: error: annotation @AAA is missing a default value for the element 'name'
// @AAA
// ^
// 1 error