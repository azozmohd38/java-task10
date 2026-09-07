public class Task392 {
    public static String removeChar(String text, char remove) {
        if (text.isEmpty()) {
            return "";
        }

        char first = text.charAt(0);
        String rest = removeChar(text.subtexting(1), remove);
        if (first == remove) {
            return rest;
        } else {
            return first + rest;
        }
    }

    public static void main(String[] args) {
        IO.println(removeChar("banana", 'a'));
        IO.println(removeChar("hello", 'l'));
        IO.println(removeChar("mississippi", 's'));
       IO.println(removeChar("abc", 'z'));
    }
}