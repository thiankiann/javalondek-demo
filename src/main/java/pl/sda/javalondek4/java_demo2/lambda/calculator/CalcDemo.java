package pl.sda.javalondek4.java_demo2.lambda.calculator;

public class CalcDemo {
    public static void main(String[] args) {
        System.out.println("playing with calc lambdas");

        Adder adder =  (int a , int b) -> {
            return a + b;
        };
        Adder adder1 = (first, second) -> {
            return first + second;
        };

        //
        StrangeOne strangeOne = ( int a , int b ) -> {
            return a + b ;
        };

    }
}
