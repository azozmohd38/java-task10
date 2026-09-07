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

        int count = (number % 10 == 0) ? 1 : 0;
        return count + countZerosHelper(number / 10);
    }

    public static void main(String[] args) {
        IO.println(countZeros(1020));
        IO.println(countZeros(5000));
        IO.println(countZeros(123));
        IO.println(countZeros(908070));
    }
}