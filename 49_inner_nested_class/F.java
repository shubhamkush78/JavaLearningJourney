class AA {
    class BB {

    }
}

class F {
    public static void main(String[] args) {
        AA x = new AA();
        // BB y = x.new BB();
        AA.BB y = x.new BB();
    }
}
