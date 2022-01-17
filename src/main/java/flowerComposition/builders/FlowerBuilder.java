package flowerComposition.builders;

import flowerComposition.builders.rootBuilder.ComponentBuilder;
import flowerComposition.components.Flower;
import flowerComposition.components.Wrap;
import flowerComposition.components.interfaces.Item;

public class FlowerBuilder extends ComponentBuilder {


    public FlowerBuilder() {

    }

    @Override
    public Item createItem() {
        System.out.println("1) Pass name of flower;");
        System.out.println("2) Pass color of flower.");
        super.getInputs();
        if (Item.checkValues(this.inputName, this.inputColor, new Flower())) {
            return new Flower(Flower.getOriginItem(this.inputName, this.inputColor));
        }
        return null;
    }
}
