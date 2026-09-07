public class Task394 {
    public static int countZeros(int num) {
        if (num == 0) {
            return 1;
        }
        return countZerosHelper(Math.abs(num));
    }

    private static int countZerosHelper(int num) {
        if (num == 0) {
            return 0;
        }

        int count = (num % 10 == 0) ? 1 : 0;
        return count + countZerosHelper(num / 10);
    }

    public static void main(String[] args) {
        IO.println(countZeros(1020));
        IO.println(countZeros(5000));
        IO.println(countZeros(123));
        IO.println(countZeros(908070));
    }
}