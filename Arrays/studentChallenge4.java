package Arrays;

import java.util.Arrays;

public class studentChallenge4 {
    public static void main(String[] args) {
        System.out.println("Adding two matrices");
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        int[][] arr3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int x[] : arr3) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Multiplying two matrices");
        int[][] arr4 = new int[3][3 ];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arr4[i][j]=arr4[i][j]+ arr1[i][k]*arr2[k][j];
//                    The outermost loop iterates over the rows of the first matrix A. It starts with i=0 and goes up
//                    to i=2 since there are three rows in a square matrix.
//                    Inside the outer loop, there is another loop that iterates over the columns of the second matrix
//                    B. It starts with j=0 and goes up to j=2 since there are three columns in a square matrix.
//                    Within the second loop, there is a third loop that iterates over the elements within each row of
//                    A or column of B. It starts with k=0 and goes up to k=2.
//                    Inside this innermost loop, we calculate each element of the resulting matrix C using the
//                    formula: C[i][j] += A[i][k] * B[k][j]. This means we are taking each element from row i of A and
//                    multiplying it with its corresponding element from column j of B and adding it to the existing
//                    value of C[i][j].
//                    After all iterations are complete, we print out the resulting matrix C using nested loops again
//                    to iterate through its elements and display them in a readable format.
                }
            }
        }
        for (int x[] : arr4) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Sorting array objects");
        String[] str = {"java","python","javaScript","ruby","c++","rust","kotlin"};
        System.out.println("Array before sorting: "+ Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("Array after sorting: "+ Arrays.toString(str));

    }
}
