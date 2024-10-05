package Methods;

public class studentChallenge3 {
    static int max(int... asd) {
        if (asd.length == 0) return Integer.MIN_VALUE;
        int Max = asd[0];
        for (int x : asd) {
            if (x > Max) Max = x;
        }
        return Max;
    }

    static int sum(int... asd) {
        int total = 0;
        for (int x : asd) {
            total = total + x;
        }
        return total;
    }

    static int discount(int... asd) {
        int dis = sum(asd);
        if (dis > 500) return 20;
        else if (dis > 300) {
            return 15;
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println("Maximum of numbers using var args");
        System.out.println(max(1, 5, 31, 215, 2, 15, 12, 1, 12, 151, 32, 156, 1));
        System.out.println(" ");
        System.out.println("Sum of all elements using var args");
        System.out.println(sum(1, 524, 98, 18, 49, 48, 24, 6, 3));
        System.out.println(" ");
        System.out.println("Calculate discount using var args");
        System.out.println(discount(1, 524, 98, 18, 49, 48, 24, 6, 3) + "%");
    }
}
