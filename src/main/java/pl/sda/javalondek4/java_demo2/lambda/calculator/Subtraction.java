package pl.sda.javalondek4.java_demo2.lambda.calculator;

@FunctionalInterface
public interface Subtraction <T> {
    
    T sub (T a , T b);
}
