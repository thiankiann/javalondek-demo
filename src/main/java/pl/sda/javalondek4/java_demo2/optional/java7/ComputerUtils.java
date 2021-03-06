package pl.sda.javalondek4.java_demo2.optional.java7;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputerUtils {
    private ComputerUtils() {

        throw new UnsupportedOperationException("This class shouldn't be instantiated!!!");
    }
    public static String getGraphicsCardModelFirstNaiveApproach(Computer computer) {
        return computer.getGraphicsCard().getModel();
    }/*
    public static String getGraphicsCardGoodApproach(Computer computer) {
        String result = null;
        if (computer != null) {
            GraphicsCard graphicsCard = computer.getGraphicsCard();
            if (graphicsCard != null) {
                result = graphicsCard.getModel();
            }
        }
        return result;

    }*/  /*
    public static String getGCModelWithJava8(Computer computer) {
        return Optional.ofNullable(computer)
                .map(comp -> comp.getGraphicsCard())
                .map(graphicsCard -> graphicsCard.getModel())
                .orElse("no model");
    }
    */
    public static String getGCModelWithJava7(Computer computer){
        String graphicCardModel1=null;
        if(computer != null){
            GraphicsCard graphicsCard = computer.getGraphicsCard();
            if (graphicsCard != null){
                graphicCardModel1 = computer.getGraphicsCard().getModel();
            }
        }else System.out.println("no card Model");
        return graphicCardModel1 ;




    }
    public static String getGCModelWithJava8(Computer computer){

// Lekcja 5  - var -y w generykach

        //        Optional<Computer> maybeComputer = Optional.ofNullable(computer);
//        Optional<GraphicsCard> maybeGraphicCard = maybeComputer.map(comp -> comp.getGraphicsCard());
//        Optional<String> maybeModel = maybeGraphicCard.map(graphicsCard -> graphicsCard.getModel());
//        return Optional.ofNullable(computer)
//            .map(comp -> comp.getGraphicsCard())
//            .map(graphicsCard -> graphicsCard.getModel())
//            .orElse("no model");
        var maybeComputer = Optional.ofNullable(computer);
        var maybeGraphicCard = maybeComputer.map(comp -> comp.getGraphicsCard());
        var maybeModel = maybeGraphicCard.map(graphicsCard -> graphicsCard.getModel());
        // another approach

        var maybeModelOfGC = Optional.ofNullable(computer)
                .map(comp -> comp.getGraphicsCard())
                .map(graphicsCard -> graphicsCard.getModel());
        maybeModelOfGC.orElse("no model");
        return maybeModel.orElse("no model");
    }

    public static void main(String[] args) {
        Computer withoutGraphicsCard = new Computer(null);
        Computer withUnknownModel = new Computer(new GraphicsCard(null));
        Computer personalComputer = new Computer(new GraphicsCard("nVidia RTX 380"));

        getGraphicsCardModelFirstNaiveApproach(withoutGraphicsCard);
        getGraphicsCardModelFirstNaiveApproach(withUnknownModel);
        getGraphicsCardModelFirstNaiveApproach(personalComputer);

        System.out.println(getGCModelWithJava8( personalComputer));
    }
}
