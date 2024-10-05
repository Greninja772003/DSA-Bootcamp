package handlingException;

public class demo2 {
    public static void main(String[] args) {
        int[] arr = {23, 43, 46, 432, 0};
        try {
            int x = arr[3] / arr[2];
            System.out.println("Result of Division is: " + x);
            try {
                System.out.println(arr[87]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be zero");
        }
        System.out.println("last line of program.......");
    }
}
