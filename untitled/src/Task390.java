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

    private static void runExamples() {
        System.out.println(countDigit(2222, 2));
        System.out.println(countDigit(12321, 1));
        System.out.println(countDigit(5050, 0));
        System.out.println(countDigit(789, 6));
    }

    public static void main(String[] args) {
        runExamples();
    }
}
