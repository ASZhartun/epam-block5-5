package flowerComposition;

import flowerComposition.builders.FlowerBuilder;
import flowerComposition.builders.WrapBuilder;
import flowerComposition.components.Flower;
import flowerComposition.components.Wrap;
import flowerComposition.components.interfaces.Item;

import java.util.Scanner;

public class FlowerComposer {
    public static Scanner scanner;
    private final FlowerBuilder flowerBuilder;
    private final WrapBuilder wrapBuilder;
    private final Bouquet bouquet;

    public FlowerComposer() {
        scanner = new Scanner(System.in);
        flowerBuilder = new FlowerBuilder();
        wrapBuilder = new WrapBuilder();
        bouquet = new Bouquet();
        printAssortments();
    }

    public void addFlower() {
        bouquet.addFlower((Flower) flowerBuilder.createItem());
    }

    public void addWrapper() {
        bouquet.addWrapper((Wrap) wrapBuilder.createItem());
    }

    public void getInfo() {
        System.out.println(bouquet.toString());
    }

    public void printAssortments() {
        System.out.println("We has next flowers:");
        for (Flower.FlowerType item :
                Flower.FlowerType.values()) {
            System.out.println(item);
        }
        System.out.println("We has next wrappers:");
        for (Wrap.WrapType item :
                Wrap.WrapType.values()) {
            System.out.println(item);
        }
    }
}
