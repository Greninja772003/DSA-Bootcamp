package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class studentChallenge1 {
    static boolean isPrime(int n){
        for (int i = 2;i <(n/2); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    static int gcd(int a, int b){
      while(a!=b){
          if(a>b){
              a = a-b;
          }
          if(b>a){
              b= b-a;
          }

      }
        return a;
    }
static int search(int []arr){
        int max = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]>max){
            max = arr[i];
        }
    }
        return  max;
}
    public static void main(String[] args) {
        System.out.println("Find a number is Prime or not");
        System.out.println("Enter a number to check whether it is prime or not");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() ;
        System.out.println("The given number is a prime number: "+isPrime(n));

        System.out.println(" ");
        System.out.println("Find GCD of 2 numbers");
        System.out.println("Enter two numbers");
        int num1= in.nextInt();
        int num2 = in.nextInt();
        System.out.println("GCD of the given numbers is: "+ gcd(num1,num2));

        System.out.println(" ");
        System.out.println("Find max element is an Array");
        int []arr = {1,2,48,654,83,52,466,54,84563,54985,45,432,1};
        System.out.println("Maximum element in the given array is: "+ search(arr));
    }
}
