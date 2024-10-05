package operatorsAndExpression;

import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value length, breath and height of cuboid: ");
        int length, breath, height;
        double volume, area;
        length = in.nextInt();
        breath = in.nextInt();
        height = in.nextInt();
        int frontBack = length*height;
        int rightLeft = breath*height;
        int bottomTop = length*breath;
        area = 2*(frontBack+rightLeft+bottomTop);
        volume = length*breath*height;
        System.out.println("Total area of cuboid is: " + area);
        System.out.println("Total volume of cuboid is: " + volume);
    }
}
