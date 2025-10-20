import java.lang.annotation.Annotation;

@interface LL {

}

@interface MM {

}

@interface NN {

}

@LL
@MM
@NN
class R {
    public static void main(String[] args) {
        Class k = R.class;

        Annotation[] arr = k.getAnnotations();

        for(Annotation next : arr){
            System.out.println(next);
        }
    }    
}
