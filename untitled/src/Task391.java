public class Task391 {
    public static boolean isSorted(int[] numbers) {
        return isSortedHelper(numbers, 0);
    }

    private static boolean isSortedHelper(int[] numbers, int index) {
        if (index >= numbers.length - 1) {
            return true;
        }
        if (numbers[index] > numbers[index + 1]) {
            return false;
        }
        return isSortedHelper(numbers, index + 1);
    }

    public static void main(String[] args) {
        IO.println(isSorted(new int[]{1, 2, 3, 4}));
        IO.println(isSorted(new int[]{1, 5, 2, 8}));
        IO.println(isSorted(new int[]{10, 20, 30}));
        IO.println(isSorted(new int[]{3, 3, 3}));
    }
}
