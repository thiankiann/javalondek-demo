package pl.sda.javalondek4.java_demo2.exception;

public class ExceptionExample {
    public static void main(String[] args) {

        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();

        String myNick;
        try {
            myNick= exceptionGenerator.nick();
        } catch (NoNickChecked noNickChecked) {
            System.out.println("Problem with nick generator");
            myNick = "this user has no Nick" ;
        } finally { // third // always
        // myNick = "from finally:)"; // it always overrides nick:(
    }
        System.out.println("My nick is: " + myNick);

        System.out.println("Now with runtime exceptions...");
        try {
             myNick= exceptionGenerator.nickWithRuntimeException();
        }catch (NoNickRuntimeExc e){
            System.out.println("wyjatek z RuntimeException");
            myNick = "Przypisanie z runtimeExcepion";
        }
        System.out.println("My nick now is: " + myNick);


   //     String nullString = null;
   //     nullString.concat("ma kota");


        System.out.println("With dealer:):):)");
        NickDealer nickDealer = new NickDealer(new ExceptionGenerator());
        String myNickDealer;
        try {
            myNickDealer = nickDealer.NickFromDealer();
        } catch (NoNickChecked noNickChecked) {
            myNickDealer = "default nick name";
        }
        System.out.println("Nick from myDealer: " + myNickDealer);


        try {
            myNickDealer = nickDealer.Nick();
        } catch (NoNickRuntimeExc exc) {
            myNickDealer = "unexpected value....";
        }
        System.out.println("Nick from dealer: " + myNickDealer);
        System.out.println("Here???");

    }


}
