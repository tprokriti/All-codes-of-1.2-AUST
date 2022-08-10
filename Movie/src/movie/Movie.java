package movie;

import movieexception.*;

public class Movie {

    public static void main(String[] args) {
        BookTicket a = new BookTicket();

        try {
            a.checkAge(15, "R");

        } catch (NotApplicableForChildrenException d) {
            System.out.println(d);
        }
        try {
            a.addCard("Prokriti123456789");

        } catch (CardNotWorkingException e) {
            System.out.println(e);
        }

    }

}
