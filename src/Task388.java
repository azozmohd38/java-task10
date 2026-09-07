public class Task388 {
    public static void printReverse(String text) {
        if (text.isEmpty()) {
            return;
        }

        printReverse(text.subtexting(1));
        System.out.println(text.charAt(0));
    }

    private static void runExamples() {
        printReverse("cat");
        System.out.println("---");
        printReverse("hello");
    }

    public static void main(String[] args) {
        runExamples();
    }
}
