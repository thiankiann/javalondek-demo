package pl.sda.javalondek4.java_demo.lambda;

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
    }

    public static void handleRunner(Runner anyRunner) {
        System.out.println("calling handleRunner()");

        anyRunner.go();
    }
}
