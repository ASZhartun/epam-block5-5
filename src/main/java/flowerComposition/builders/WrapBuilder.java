package flowerComposition.builders;

import flowerComposition.builders.rootBuilder.ComponentBuilder;
import flowerComposition.components.Wrap;
import flowerComposition.components.interfaces.Item;
/**
 * Create wrap is basing on input options like texture and color of wrap.
 */
public class WrapBuilder extends ComponentBuilder {
    public WrapBuilder() {

    }
    /**
     * Get inputs of user. Check input for existing at enum <a href="#">WrapType</a> of shop.
     * @return new Wrap.
     */
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
