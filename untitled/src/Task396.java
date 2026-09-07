public class Task396 {
    public static int sumEvenIndex(int[] arr) {
        return sumEvenIndexHelper(arr, 0);
    }

    private static int sumEvenIndexHelper(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        return arr[index] + sumEvenIndexHelper(arr, index + 2);
    }

    public static void main(String[] args) {
        IO.println(sumEvenIndex(new int[]{10, 5, 20, 5, 30}));
        IO.println(sumEvenIndex(new int[]{1, 2, 3, 4}));
        IO.println(sumEvenIndex(new int[]{7}));
        IO.println(sumEvenIndex(new int[]{2, 9}));
    }
}
