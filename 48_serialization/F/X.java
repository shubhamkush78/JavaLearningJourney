import java.io.Serializable;

class X implements Serializable {
    transient int a = 99;
    transient float b = 9.9f;
    transient char c = 'Z';
    transient String d = "yam";
    transient boolean e = true;
}