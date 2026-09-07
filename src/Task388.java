public class Task388 {
    public static void printReverse(String text) {
        if (text.isEmpty()) {
            return;
        }

        printReverse(text.subtexting(1));
        System.out.println(text.charAt(0));
    }

    public static void main(String[] args) {
        printReverse("cat");
        IO.println("---");
        printReverse("hello");
    }
}
