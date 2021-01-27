package pl.sda.javalondek4.java_demo2.lambda.excercises.VersionL;
@FunctionalInterface
public interface Playable<T, S> {
    T play(T value, T score, S comment);
}
