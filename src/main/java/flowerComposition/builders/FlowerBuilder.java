package flowerComposition.builders;

import flowerComposition.builders.rootBuilder.ComponentBuilder;
import flowerComposition.components.Flower;
import flowerComposition.components.interfaces.Item;

/**
 * Create flower is basing on input options like name and color of flower.
 */
public class FlowerBuilder extends ComponentBuilder {


    public FlowerBuilder() {

    }

    /**
     * Get inputs of user. Check input for existing at enum flowers of shop.
     * @return new Flower
     */
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
