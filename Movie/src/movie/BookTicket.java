package movie;

import movieexception.*;

public class BookTicket extends Eligibility {

    public void addCard(String cardNo) {
        if (cardNo.length() < 16) {
            throw new CardNotWorkingException("Invalid Card");
        } else {
            System.out.println("Card is valid");
        }
    }

}
