class I {
    public static void main(String[] args) {
        System.out.println(1);

        if(args.length == 0) {
            MissingCommandLineArgumentException e = new MissingCommandLineArgumentException();

            try {
                throw e;
            } catch(MissingCommandLineArgumentException x) {
                System.out.println(x);
            }
        } else {
            System.out.println(args[0]);
        }

        System.out.println(2);
    }    
}


class MissingCommandLineArgumentException extends Exception {

} 