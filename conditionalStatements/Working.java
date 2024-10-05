package conditionalStatements;

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Working {
    public static void main(String[] args) {
        int a=9 , b=39, c=47;
        System.out.println("Both conditions should be true: " +(a<b && a<c));
        System.out.println("Both conditions should be true: "+(a<b && a>c));
        System.out.println("One of the conditions should be true: "+(a<b||a<c));
        System.out.println("One of the conditions should be true: "+(a>b||a>c));
        int n= 43;
        if(n>0) System.out.println("Number is positive");
        else System.out.println("Number is negative");

        if(a>b && a>c){ System.out.println("a is the biggest variable");}
        else if ( b>c) {
            System.out.println("b is the biggest variable");
        }
        else{
            System.out.println("c is the biggest variable");
        }
    }
}
