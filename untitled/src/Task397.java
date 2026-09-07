public class Task397 {
    public static String toBinary(int number) {
        if (number == 0 || number == 1) {
            return String.valueOf(number);
        }

        String previous = toBinary(number / 2);
        return previous + (number % 2);
    }

    private static void runExamples() {
        System.out.println(toBinary(2));
        System.out.println(toBinary(5));
        System.out.println(toBinary(10));
        System.out.println(toBinary(1));
    }

    public static void main(String[] args) {
        runExamples();
    }
}
