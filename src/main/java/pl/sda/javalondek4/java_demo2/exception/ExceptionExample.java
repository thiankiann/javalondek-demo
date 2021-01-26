package pl.sda.javalondek4.java_demo2.exception;

public class ExceptionExample {
    public static void main(String[] args) {

        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();

        String myNick;
        try {
            myNick= exceptionGenerator.nick();
        } catch (NoNickExceptions noNickExceptions) {
            System.out.println("Problem with nick generator");
            myNick = "this user has no Nick" ;
        }

        String nullString = null;
        nullString.concat("ma kota");
    }
}
