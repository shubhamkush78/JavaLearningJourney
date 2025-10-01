class O {
    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40, 50};

        int sum = 0;

        for(int next : x) {
            sum = sum + next;
        }

        System.out.println(sum);
    }    
}
