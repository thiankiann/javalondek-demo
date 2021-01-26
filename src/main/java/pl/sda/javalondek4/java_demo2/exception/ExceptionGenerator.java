package pl.sda.javalondek4.java_demo2.exception;

import java.util.Random;

public class ExceptionGenerator {

    public String nick() throws NoNickExceptions{
        Random random = new Random();

        if(random.nextInt(100) % 2 ==1){
            return "Maniek";
        }else{
            throw new NoNickExceptions("I have no nick yet");
        }
    }
}
