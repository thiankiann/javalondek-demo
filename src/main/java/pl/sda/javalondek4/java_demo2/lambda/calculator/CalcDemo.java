package pl.sda.javalondek4.java_demo2.lambda.calculator;

import org.w3c.dom.ls.LSOutput;

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

        StringAdder stringAdder = ( one , two ) -> {
            return one.concat(two);
        };

        MyAdder myAdder = (a,b , c) -> {
          //  System.out.println( " comentarz : %s",  c );// nie wiem czemu nie chcialo wydrukowac w ten sposob
            System.out.println(c);
            return a+b;
        };
            //wydrukujmy
        myAdder.addWithComment(5,10,"should be 15") ;

        Substraction substraction = (a ,b ) ->  a-b;

        Mult mult = (a,b) -> a*b ;

        Division division = (a,b) -> a/b;

    }
}
