package mobile;

public class ClassicMobile {

    public static void message(String a) {

        if (a.length() <= 100) {
            System.out.println(a);
        } else if (a.length() > 100) {
            System.out.println("Part one  " + a.substring(0, 101));
            System.out.println("Part two  " + a.substring(101));
        }
    }
}
