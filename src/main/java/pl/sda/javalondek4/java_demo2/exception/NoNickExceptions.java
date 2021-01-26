package pl.sda.javalondek4.java_demo2.exception;

public class NoNickExceptions extends Exception{
    public NoNickExceptions() {
    }

    public NoNickExceptions(String message) {
        super(message);
    }

    public NoNickExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public NoNickExceptions(Throwable cause) {
        super(cause);
    }

    public NoNickExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
