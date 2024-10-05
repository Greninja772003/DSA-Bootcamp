package langPackage;

public class mathClassDemo {
    public static void main(String[] args) {
        System.out.println("Absolute: "+ StrictMath.abs(-127));
        System.out.println("square root: "+ Math.sqrt(9.0));
        System.out.println(Math.floorDiv(100,7));
        System.out.println(Math.exp(5));
        System.out.println(Math.log10(543));
        int a = 943, b=8934;
        System.out.println(Math.fma(a,b,34));
        System.out.println(Math.tan(45*Math.PI/180));
        System.out.println(Math.pow(2,5));
        System.out.println(Math.nextAfter(13,12));
    }
}
