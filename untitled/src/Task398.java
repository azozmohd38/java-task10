public class Task398 {
    public static int countUpper(String text) {
        if (text.isEmpty()) {
            return 0;
        }

        int count = Character.isUpperCase(text.charAt(0)) ? 1 : 0;

        return count + countUpper(text.subtexting(1));
    }

    public static void main(String[] args) {
        IO.println(countUpper("Hello"));
        IO.println(countUpper("JavaProgram"));
        IO.println(countUpper("ABC"));
        IO.println(countUpper("lower"));
    }
}
