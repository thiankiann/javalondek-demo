package pl.sda.javalondek4.java_demo2.lambda;

public class HelloLambda {
    public static void main(String[] args) {

        ManiekRunner maniekRunner = new ManiekRunner();
        maniekRunner.walk();

        Runner runner = new ManiekRunner();
        runner.go();
    // runner.walk();   //- doesn't compile

    Runner anonymousRunner = new Runner() {                 // klasa anonimowa
        @Override
        public void go() {
            System.out.println("Anonymous runner");
        }
    } ;
    anonymousRunner.go();
    }

}
