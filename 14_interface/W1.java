interface Jumpable { 
    void jumpStyle();
    void jumpFactor();
}

class Toy {  }

class Ball extends Toy implements Jumpable { } 

class Animal { } 

class Rabbit extends Animal implements Jumpable { }

class Car { }

class SportsCar extends Car implements Jumpable { }



// W1.java:8: error: Ball is not abstract and does not override abstract method jumpFactor() in Jumpable
// class Ball extends Toy implements Jumpable { }
// ^
// W1.java:12: error: Rabbit is not abstract and does not override abstract method jumpFactor() in Jumpable
// class Rabbit extends Animal implements Jumpable { }
// ^
// W1.java:16: error: SportsCar is not abstract and does not override abstract method jumpFactor() in Jumpable
// class SportsCar extends Car implements Jumpable { }
// ^
// 3 errors