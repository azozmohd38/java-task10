public class Task393 {
    public static int power(int b, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPower = power(b, n / 2);
        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return b * halfPower * halfPower;
        }
    }

    public static void main(String[] args) {
        IO.println(power(2, 10));
        IO.println(power(3, 4));
        IO.println(power(5, 3));
        IO.println(power(2, 0));
    }
}