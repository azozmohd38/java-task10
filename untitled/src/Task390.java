public class Task390 {
    public static int countDigit(int num, int digit) {
        num = Math.abs(num);
        if (num == 0) {
            return 0;
        }

        int lastDigit = num % 10;
        int count = (lastDigit == digit) ? 1 : 0;

        return count + countDigit(num / 10, digit);
    }

    public static void main(String[] args) {
        IO.println(countDigit(2222, 2));
        IO.println(countDigit(12321, 1));
        IO.println(countDigit(5050, 0));
        IO.println(countDigit(789, 6));
    }
}
