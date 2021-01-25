package pl.sda.javalondek4.java_demo2.lambda.calculator;

public class CalcDemo {
    public static void main(String[] args) {
        System.out.println("playing with calc lambdas");

        Adder<Integer> adder =  (Integer a , Integer b) -> {
            return a + b;
        };
        Adder<Integer> adder1 = (first, second) -> {
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

        Subtraction<Integer> subtraction = (a ,b ) ->  a-b;

        Multiplication<Integer> mult = (a, b) -> a*b ;

        Division<Integer> division = (a,b) -> a/b;

        Operation<Double> operationDiv = (a,b) -> a/b;

    }
}
