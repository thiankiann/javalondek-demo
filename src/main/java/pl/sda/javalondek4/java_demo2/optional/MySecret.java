package pl.sda.javalondek4.java_demo2.optional;

import static java.util.Objects.nonNull;

public class MySecret {
    String mySecret ;

    public MySecret(String mySecret) {
        this.mySecret = mySecret;
    }

    public String getMySecret() {
        return mySecret;
    }

    public void setMySecret(String mySecret) {
        this.mySecret = mySecret;
    }

    @Override
    public String toString() {
        return "MySecret{" +
                "mySecret='" + mySecret + '\'' +
                '}';
    }

    public static void main(String[] args) {
        MySecret realOne = new MySecret("I like learning JVM technologies");
        MySecret withNullContent= new MySecret(null);

        printSecretLenght(realOne);
        printSecretLenght(withNullContent);
    }


    public static void printSecretLenght(MySecret mySecret){

        int secretLength ; //= mySecret.getMySecret() != null ? mySecret.getMySecret().length() : 0;

            secretLength = nonNull(mySecret.getMySecret()) ? mySecret.getMySecret().length() : 0;

        /* to jest to samo co
        if(mySecret.getMySecret() != null) {
            secretLength = mySecret.getMySecret().length();
        }else{
            secretLength = 0;
        }
        */

        System.out.println(" My Secret has: " + secretLength + "characters" );
    }
}
