package pl.sda.javalondek4.java_demo2.lambda.calculator;

public interface Operation<T> {
    T operation( T first, T second);
}
