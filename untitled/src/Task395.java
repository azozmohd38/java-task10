public class Task395 {
    public static boolean contains(String text, char letter) {
        if (text.isEmpty()) {
            return false;
        }
        if (text.charAt(0) == letter) {
            return true;
        }
        return contains(text.substring(1), letter);
    }

    public static void main(String[] args) {
        System.out.println(contains("hello", 'e'));
        System.out.println(contains("world", 'z'));
        System.out.println(contains("java", 'a'));
        System.out.println(contains("", 'x'));
    }
}
