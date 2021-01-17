package pl.sda.javalondek4.java_demo.lambda.calculator;

public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("playing with calc lambdas");

        Adder adder = (int a, int b) -> {
            return a + b;
        };
        Adder adder2 = (first, second) -> {
//            first.length(); - wrong type!!!!
            return first + second;
        };

        StrangeOne strangeOne = (int a, int b) -> {
            return a + b;
        };
    }
}
