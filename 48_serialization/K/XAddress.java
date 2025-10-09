import java.io.Serializable;

class XAddress extends Address implements Serializable {
    XAddress(String city, String state) {
        super(city, state);
    }
    
    XAddress() {
        
    }
}
