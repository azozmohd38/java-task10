public class Task396 {
    public static int sumEvenIndex(int[] numbers) {
        return sumEvenIndexHelper(numbers, 0);
    }

    private static int sumEvenIndexHelper(int[] numbers, int index) {
        if (index >= numbers.length) {
            return 0;
        }
        return numbers[index] + sumEvenIndexHelper(numbers, index + 2);
    }

    public static void main(String[] args) {
        IO.println(sumEvenIndex(new int[]{10, 5, 20, 5, 30}));
        IO.println(sumEvenIndex(new int[]{1, 2, 3, 4}));
        IO.println(sumEvenIndex(new int[]{7}));
        IO.println(sumEvenIndex(new int[]{2, 9}));
    }
}
