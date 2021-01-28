package pl.sda.javalondek4.java_demo2.lambda;

@FunctionalInterface
public interface WorkLifeBalance {

    void hardWork();
    default void sleep(int time) {}

    public static void main(String[] args) {

        // 1. implement WorkLifeBalance in separate class
        // 2. use WorkLifeBalance as anonymous class

        WorkLifeBalance workLifeBalance = new WorkLifeBalance() {               //to jest Klasa Anonimowa
            @Override
            public void hardWork() {
                System.out.println("work");
            }

            @Override
            public void sleep(int time) {
                System.out.println("sleep");
            }
            // hardWork
//            () -> {}
            // sleep
//            (int time) -> {}
        };                           //tu jest ; -> bo to jest Klasa Anonimowa

    WorkLifeBalance workLifeBalanceAfterCovid = () -> System.out.println("Normal Job");     // robi to samo co powyzsza klasa anonimowa

    }

}
