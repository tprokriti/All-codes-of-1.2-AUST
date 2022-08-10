package movieexception;

public class CardNotWorkingException extends RuntimeException {

    public CardNotWorkingException(String abc) {
        super(abc);
    }
}
