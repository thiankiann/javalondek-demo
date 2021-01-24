package pl.sda.javalondek4.java_demo2.lambda.calculator;

@FunctionalInterface
public interface MyAdder {
    long addWithComment(long a ,long b , String comment);
}
