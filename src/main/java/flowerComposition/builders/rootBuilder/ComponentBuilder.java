package flowerComposition.builders.rootBuilder;

import flowerComposition.FlowerComposer;
import flowerComposition.components.interfaces.Item;

import java.util.Locale;

public abstract class ComponentBuilder {
    protected String inputName;
    protected String inputColor;

    public ComponentBuilder() {

    }

    public void getInputs() {
        this.inputName = FlowerComposer.scanner.nextLine().toLowerCase(Locale.ROOT);
        this.inputColor = FlowerComposer.scanner.nextLine().toLowerCase(Locale.ROOT);
    }

    public abstract Item createItem();
}
