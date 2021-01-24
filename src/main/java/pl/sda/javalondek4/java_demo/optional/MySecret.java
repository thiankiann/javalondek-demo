package pl.sda.javalondek4.java_demo.optional;

import static java.util.Objects.nonNull;

public class MySecret {
    private String secret;

    public MySecret(String secret) {
        this.secret = secret;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "MySecret{" +
            "secret='" + secret + '\'' +
            '}';
    }

    public static void main(String[] args) {
        MySecret realOne = new MySecret("I like learning and teaching JVM technologies:P");
        MySecret withNullContent = new MySecret(null);
        printSecretLength(realOne);
        printSecretLength(withNullContent);
    }

    public static void printSecretLength(MySecret mySecret) {
        int secretLen = mySecret.getSecret() != null ? mySecret.getSecret().length() : 0;
        secretLen = nonNull(mySecret.getSecret()) ? mySecret.getSecret().length() : 0;
        // the same functionality
//        if (mySecret.getSecret() != null) {
//            secretLen = mySecret.getSecret().length();
//        } else {
//            secretLen = 0;
//        }
        System.out.println("My secret has " + secretLen + " characters");
    }
}
