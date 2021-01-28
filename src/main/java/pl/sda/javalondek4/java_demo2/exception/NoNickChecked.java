package pl.sda.javalondek4.java_demo2.exception;

public class NoNickChecked extends Exception{
    public NoNickChecked() {
    }

    public NoNickChecked(String message) {
        super(message);
    }

    public NoNickChecked(String message, Throwable cause) {
        super(message, cause);
    }

    public NoNickChecked(Throwable cause) {
        super(cause);
    }

    public NoNickChecked(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
