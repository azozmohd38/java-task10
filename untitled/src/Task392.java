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
        System.out.println(removeChar("banana", 'a'));
        System.out.println(removeChar("hello", 'l'));
        System.out.println(removeChar("mississippi", 's'));
       System.out.println(removeChar("abc", 'z'));
    }
}