package pl.sda.javalondek4.java_demo.exception;

import java.util.Random;

public class ExceptionGenerator {

    public String nick() throws NoNickException {
        Random random = new Random();
        if (random.nextInt(100) % 2 == 0) {
            return "maniek";
        } else {
            throw new NoNickException("I have no nick... yet:P");
        }
    }
}
