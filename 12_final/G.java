class AA {

}

final class BB extends AA {

}

class G {
    public static void main(String[] args) {
        AA x = new BB();
        
        BB y = (BB)x;
    }    
}
