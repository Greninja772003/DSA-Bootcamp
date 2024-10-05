package javaDocAndAnnotations;

@interface myAnno{
    String name();
    String date() default "today";
    String version() default "3.54.5";
    String project();
}

@myAnno(name="ankur",date="01/03/2004",version = "3.045.4",project = "bank")
public class userDefinedAnnotations {
    @Deprecated
    int data = 439;
//    @myAnno
    public static void main( String[] args){

    }
}
