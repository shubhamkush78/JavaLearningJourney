interface Smart {  }
interface Intelligent {  }
interface Beautiful {  }
interface Entrepreneur {  }

class Human { }

class American implements Smart, Intelligent, Beautiful, Entrepreneur extends Human { }



// X.java:8: error: '{' expected
// class American implements Smart, Intelligent, Beautiful, Entrepreneur extends Human { }
//                                                                      ^
// 1 error