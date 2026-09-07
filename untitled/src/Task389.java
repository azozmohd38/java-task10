public class Task389 {
    public static int sumEven(int n) {
        if (n <= 0) {
            return 0;
        }
        int current = (n % 2 == 0) ? n : 0;
        return current + sumEven(n - 1);
    }

    public static void main(String[] args) {
        IO.println(sumEven(2));
        IO.println(sumEven(6));
        IO.println(sumEven(10));
        IO.println(sumEven(1));
    }
}
