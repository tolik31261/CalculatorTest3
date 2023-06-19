package exeprions;

public class DivizionByZero extends IllegalArgumentException{
    public DivizionByZero() {
    }

    public DivizionByZero(String s) {
        super(s);
    }

    public DivizionByZero(String message, Throwable cause) {
        super(message, cause);
    }

    public DivizionByZero(Throwable cause) {
        super(cause);
    }
}