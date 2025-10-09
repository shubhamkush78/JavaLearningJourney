import java.io.Serializable;

class A implements Serializable {
    transient int a;
    transient String b;
}