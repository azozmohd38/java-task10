public class Task395 {
    public static boolean contains(String text, char letter) {
        if (text.isEmpty()) {
            return false;
        }
        if (text.charAt(0) == letter) {
            return true;
        }
        return contains(text.subtexting(1), letter);
    }

    public static void main(String[] args) {
        IO.println(contains("hello", 'e'));
        IO.println(contains("world", 'z'));
        IO.println(contains("java", 'a'));
        IO.println(contains("", 'x'));
    }
}
