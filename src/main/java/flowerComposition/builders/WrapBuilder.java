package flowerComposition.builders;

import flowerComposition.builders.rootBuilder.ComponentBuilder;
import flowerComposition.components.Wrap;
import flowerComposition.components.interfaces.Item;

public class WrapBuilder extends ComponentBuilder {
    public WrapBuilder() {

    }

    @Override
    public Item createItem() {
        System.out.println("1) Pass texture of wrap;");
        System.out.println("2) Pass color of wrap.");
        super.getInputs();
        if (Item.checkValues(this.inputName, this.inputColor, new Wrap())) {
            return new Wrap(Wrap.getOriginItem(this.inputName, this.inputColor));
        }
        return null;
    }
}
