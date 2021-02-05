package pl.sda.javalondek4.java_demo2.optional;

import java.util.Optional;

import static java.util.Objects.nonNull;

public class MySecret<T> {
    T mySecret;

    public MySecret(T mySecret) {

        this.mySecret = mySecret;
    }

    public T getMySecret() {

        return mySecret;
    }

    public void setMySecret(T mySecret) {

        this.mySecret = mySecret;
    }

    @Override
    public String toString() {
        return "MySecret{" +
                "mySecret='" + mySecret + '\'' +
                '}';
    }

    public static void main(String[] args) {
        MySecret<String> realOne = new MySecret<>("I like learning JVM technologies");
        MySecret<String> withNullContent = new MySecret<>(null);

        printSecretLenght(realOne);
        printSecretLenght(withNullContent);
    }


    public static void printSecretLenght(MySecret<String> mySecret) {

        int secretLength; //= mySecret.getMySecret() != null ? mySecret.getMySecret().length() : 0;

        secretLength = nonNull(mySecret.getMySecret()) ? mySecret.getMySecret().length() : 0;

        /* to jest to samo co
        if(mySecret.getMySecret() != null) {
            secretLength = mySecret.getMySecret().length();
        }else{
            secretLength = 0;
        }
        */

        System.out.println(" My Secret has: " + secretLength + "characters");
    }

    public static <T> void processSecret(T optional) {

        //make optional from T
        Optional<T> opt = Optional.ofNullable(optional);

        // T unpacked = opt.get();  //ZLE!
        T unpacked;
        if (opt.isPresent()) {
            unpacked = opt.get();
        } else {
            unpacked = null;
        }

        unpacked = opt.orElse(null);
        unpacked = (T) opt.or(() -> null);

        Optional<String> string = Optional.empty();
        Optional<String> fromOptional = string.or(() -> Optional.of("no value"));
    }

}
