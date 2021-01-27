package pl.sda.javalondek4.java_demo2.lambda.excercises.versionA;

@FunctionalInterface
public interface Playable<T> {
    void play(T t);
}
