public class Task393 {
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        int halfPower = power(base, exponent / 2);
        if (exponent % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return base * halfPower * halfPower;
        }
    }

    private static void runExamples() {
        System.out.println(power(2, 10));
        System.out.println(power(3, 4));
        System.out.println(power(5, 3));
        System.out.println(power(2, 0));
    }

    public static void main(String[] args) {
        runExamples();
    }
}