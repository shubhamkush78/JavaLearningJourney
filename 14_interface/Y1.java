interface NN { 

}

class Y1 implements NN {
    public static void main(String[] args) {
        Y1 x = new Y1();

        System.out.println(x.toString());
        System.out.println(x.hashCode());
    }
}
