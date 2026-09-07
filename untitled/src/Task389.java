public class Task389 {
    public static int sumEven(int n) {
        if (n <= 0) {
            return 0;
        }
        int evenNumber = (n % 2 == 0) ? n : 0;
        return evenNumber + sumEven(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumEven(2));
        System.out.println(sumEven(6));
        System.out.println(sumEven(10));
        System.out.println(sumEven(1));
    }
}
