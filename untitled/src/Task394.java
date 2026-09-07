public class Task394 {
    public static int countZeros(int number) {
        if (number == 0) {
            return 1;
        }
        return countZerosHelper(Math.abs(number));
    }

    private static int countZerosHelper(int number) {
        if (number == 0) {
            return 0;
        }

        if (number % 10 == 0) {
            return 1 + countZerosHelper(number / 10);
        }

        return countZerosHelper(number / 10);
    }

    private static void runExamples() {
        System.out.println(countZeros(1020));
        System.out.println(countZeros(5000));
        System.out.println(countZeros(123));
        System.out.println(countZeros(908070));
    }

    public static void main(String[] args) {
        runExamples();
    }
}