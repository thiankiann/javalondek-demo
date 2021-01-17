package pl.sda.javalondek4.java_demo2.lambda;
/*
public class HelloLambda {
    public static void main(String[] args) {

        ManiekRunner maniekRunner = new ManiekRunner();
        maniekRunner.walk();

        Runner runner = new ManiekRunner();
       // runner.go();  //1
        handleRunner(runner);
    // runner.walk();   //- doesn't compile

    Runner anonymousRunner = new Runner() {                 // klasa anonimowa
        @Override
        public void go() {
            System.out.println("Anonymous runner");
        }
    } ;
    //anonymousRunner.go();  //2
        handleRunner(anonymousRunner);
    }
    public static void handleRunner(Runner anyRunner) {
        System.out.println("handleRunner()");
        anyRunner.go();
    }
}
*/
public class HelloLambda {
    public static void main(String[] args) {
        ManiekRunner maniekRunner = new ManiekRunner();
        maniekRunner.walk();
        Runner runner = new ManiekRunner();
        handleRunner(runner);
//        runner.walk(); - doesn't compile
        // define anonymous class
        Runner anonymousRunner = new Runner() {
            @Override
            public void go() {
                System.out.println("Anonymous runner");
            }
        };
        handleRunner(anonymousRunner);
        // call handleRunner user anonymous class
        handleRunner(new Runner() {
            @Override
            public void go() {
                System.out.println("inside method call");
            }
        });
        // using lambda - super happy:)
        handleRunner(() -> System.out.println("inside lambda call"));
    }
    public static void handleRunner(Runner anyRunner) {
        System.out.println("calling handleRunner()");
        anyRunner.go();
    }
}