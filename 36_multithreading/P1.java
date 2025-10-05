class K1Thread extends Thread {
    public void run() {

    }
}

class P1 {
    public static void main(String[] args) {
        K1Thread e = new K1Thread();

        System.out.println(e.isAlive());

        e.start();

        System.out.println(e.isAlive());
    }
}
