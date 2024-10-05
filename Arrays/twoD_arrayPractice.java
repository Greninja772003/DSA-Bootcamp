package Arrays;

public class twoD_arrayPractice {
    public static void main(String[] args) {
        int arr[][] = new int [5][5];

        int arr2[][]={{23,53,46,7},{65,437,5,4}};

        int arr3[][];
        arr3= new int [5][5];

        int[]arr4[] = new int[5][5];

        int[] e ,f[];
        e= new int[5];//e is a linear array
        f= new int[3][5];//f is a 2-d array

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int x[]:arr2) {
            for (int y:x) {
                System.out.println(y);
            }
        }
        System.out.println(" ");
        //Jagged Array
        int arr5[][];
        arr5 = new int[3][];
        arr5[0]= new int[3];
        arr5[1]= new int[4];
        arr5[2]= new int[6];
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.print(arr5[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
