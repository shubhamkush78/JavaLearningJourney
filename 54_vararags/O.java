class O {
    public static void main(String[] args) {
        pro();
    }   
    
    static void pro(int count, int... values) {
        System.out.println(count);

        for(int next : values)
            System.out.println(next);
    }
}



// O.java:3: error: method pro in class O cannot be applied to given types;
//         pro();
//         ^
//   required: int,int[]
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error
