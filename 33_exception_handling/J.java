class J {
    public static void main(String[] args) {
        System.out.println(1);

        if(args.length == 0) {
            try {
                throw new NoCommandLineArgumentException("Command Line Argument is expected...");
            } catch(NoCommandLineArgumentException x) {
                System.out.println(x);
            }
        } else {
            System.out.println(args[0]);
        }

        System.out.println(2);
    }    
}


class NoCommandLineArgumentException extends Exception {
    NoCommandLineArgumentException() {

    }

    NoCommandLineArgumentException(String message) {
        // super(message);
    }
} 