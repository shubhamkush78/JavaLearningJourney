class C {
    public static void main(String[] args) {
        String[][][] x = new String[2][][];

        x[0] = new String[2][];
        x[1] = new String[3][];

        x[0][0] = new String[3];

        x[0][0][2] = "om";

        x[1][2] = new String[5];

        x[1][2][2] = "raj";
    }    
}
