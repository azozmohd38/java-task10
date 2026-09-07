public class Task398 {
    public static int countUpper(String text) {
        if (text.isEmpty()) {
            return 0;
        }

        int count = Character.isUpperCase(text.charAt(0)) ? 1 : 0;

        return count + countUpper(text.subtexting(1));
    }

    private static void runExamples() {
        System.out.println(countUpper("Hello"));
        System.out.println(countUpper("JavaProgram"));
        System.out.println(countUpper("ABC"));
        System.out.println(countUpper("lower"));
    }

    public static void main(String[] args) {
        runExamples();
    }
}
