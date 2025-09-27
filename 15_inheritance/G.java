class C { }
class B extends C implements T { }
class A extends B implements X,Y { }

interface X extends Z {  }
interface Y {  }
interface Z {  }
interface T {  }

class G {
    public static void main(String[] args) {
        A a = new A();

        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);
        System.out.println(a instanceof X);
        System.out.println(a instanceof Y);
        System.out.println(a instanceof Z);
        System.out.println(a instanceof T);
        System.out.println(a instanceof Object);
    }    
}
