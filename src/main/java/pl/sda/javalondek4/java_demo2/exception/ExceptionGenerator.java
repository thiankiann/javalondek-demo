package pl.sda.javalondek4.java_demo2.exception;

import java.util.Random;


public class ExceptionGenerator {

    public String nick() throws NoNickChecked {
        Random random = new Random();

        if(random.nextInt(100) % 2 ==1){
            return "Maniek";
        }else{
            throw new NoNickChecked("I have no nick yet");
        }
    }

    public String nickWithRuntimeException() throws NoNickRuntimeExc {
        Random random = new Random();

        if(random.nextInt(100) % 2 ==1){
            return "Maniek";
        }else{
            throw new NoNickRuntimeExc("I have no nick yet");
        }
    }
}
