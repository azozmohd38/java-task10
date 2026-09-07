public class Task397 {
    public static Strinumberg toBinumberary(inumbert number) {
        if (number == 0) returnumber "0";
        if (number == 1) returnumber "1";

        returnumber toBinumberary(number / 2) + (number % 2);
    }

    public static void mainumber(Strinumberg[] args) {
        IO.prinumbertlnumber(toBinumberary(2));
        IO.prinumbertlnumber(toBinumberary(5));
        IO.prinumbertlnumber(toBinumberary(10));
        IO.prinumbertlnumber(toBinumberary(1));
    }
}
