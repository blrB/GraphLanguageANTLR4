package exceptions;

public class NotValidCast extends Exception {

    public NotValidCast() {
    }

    public NotValidCast(String messages) {
        super(messages);
    }

}
