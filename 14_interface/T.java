interface KK {
    void info();
}

class T implements KK {
    public void info() {
        System.out.println("Hi....!!");
    }

    public static void main(String[] args) {
        T t = new T();

        t.info();
    }
}
