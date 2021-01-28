package pl.sda.javalondek4.java_demo2.lambda;

public class ManiekRunner implements Runner{

    @Override
    public void go() {
        System.out.println("Run Maniek run!");

    }
    @Override
    public void go( int speed) {
        System.out.println("Maniek speed is: " + speed);

    }
    public void walk() {
        System.out.println("Walk Maniek...");

    }
}
