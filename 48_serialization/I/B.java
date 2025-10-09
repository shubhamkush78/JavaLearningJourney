import java.io.Serializable;

class B implements Serializable {
    transient int a = 55;
    transient String b = "abc";
}