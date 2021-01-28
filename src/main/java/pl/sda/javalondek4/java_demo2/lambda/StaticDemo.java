package pl.sda.javalondek4.java_demo2.lambda;

public class StaticDemo {

    public static void demo() {
        System.out.println("static demo");
    }
    public  void crash() {
        System.out.println("static demo");
    }
    public static void main(String[] args) {
        demo();
        StaticDemo.demo();

        StaticDemo empty = null;
        empty.demo();

        empty.crash();
    }

}
