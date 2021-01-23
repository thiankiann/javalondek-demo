package pl.sda.javalondek4.java_demo2.lambda;

public class WorkLifeBalanceImplementation implements WorkLifeBalance {

        @Override
        public void hardWork() {

            System.out.println("Work");
        }

        @Override
        public void sleep(int time) {

            System.out.println("Sleep");
        }
}
