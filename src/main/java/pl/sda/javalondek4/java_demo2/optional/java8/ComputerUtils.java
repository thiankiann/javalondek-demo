package pl.sda.javalondek4.java_demo2.optional.java8;

public class ComputerUtils {
    private ComputerUtils() {
        throw new UnsupportedOperationException("This class shouldn't be instantiated!!!");
    }
   public static String getGraphicsCardModelFirstNaiveApproach(Computer computer) {
        return computer.getGraphicsCard().getModel();
    }
    public static String getGraphicsCardGoodApproach(Computer computer) {

    }
    public static void main(String[] args) {
        Computer nullComputer = null;
        Computer withoutGraphicsCard = new Computer(null);
        Computer withUnknownModel = new Computer(new GraphicsCard(null));
        Computer personalComputer = new Computer(new GraphicsCard("nVidia RTX 380"));
        getGraphicsCardGoodApproach(withoutGraphicsCard);
        getGraphicsCardGoodApproach(withUnknownModel);
        getGraphicsCardGoodApproach(personalComputer);
        getGraphicsCardGoodApproach(nullComputer);
    }
}
