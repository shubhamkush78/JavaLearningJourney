import java.util.ArrayList;

class Rental<P> {
    ArrayList<P> products = new ArrayList<>();

    void add(P product) {
        products.add(product);
    }

    P rent() {
        return products.remove(0);
    }
}
