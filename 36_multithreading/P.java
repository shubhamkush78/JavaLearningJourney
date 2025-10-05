class KThread extends Thread {
    public void run() {

    }
}

class P {
    public static void main(String[] args) {
        KThread e = new KThread();

        System.out.println(e.isAlive());
    }
}
