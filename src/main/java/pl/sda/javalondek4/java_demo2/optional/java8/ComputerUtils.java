package pl.sda.javalondek4.java_demo2.optional.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputerUtils {
    private ComputerUtils() {
        throw new UnsupportedOperationException("This class shouldn't be instantiated!!!");
    }


    public static String getGraphicsCardGoodApproach(Computer computer) {
        String result = Optional.ofNullable(computer)
                // ugly code :)
//            .map(comp -> {
//                var maybeGc = comp.getGraphicsCard();
//                if (maybeGc.isPresent()) {
//                    return maybeGc.get();
//                } else {
//                    return null;
//                })
//            .map(comp -> comp.getGraphicsCard().get()) // very dangerous!!!!
//            .map(comp -> comp.getGraphicsCard().orElse(null)) // can be ok...
                .flatMap(comp -> comp.getGraphicsCard()) // if Optional inside Optional use flatMap
                .flatMap(gc -> gc.getModel()) // my must provide mapping to Optional
                .orElse("no model");

        //the same but with map()  v.1
        Optional.ofNullable(computer)
                .map(comp -> comp.getGraphicsCard())
                .orElse(Optional.empty())
                .map(gc -> gc.getModel())
                .orElse(Optional.empty())
                .orElse("no model");

        //v.2 a little bit prettier - with using var
        var maybeGraphicsCard = Optional.ofNullable(computer)
                .map(comp -> comp.getGraphicsCard())
                .orElse(Optional.empty());
        maybeGraphicsCard.map(gc -> gc.getModel())
                .orElse(Optional.empty())
                .orElse("no model");
        return result;
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
