package Furniture;

// Furniture.java
public abstract class Furniture {
    protected String material;
    protected double price;

    public Furniture(String material, double price) {
        this.material = material;
        this.price = price;
    }

    public abstract void displayInfo();
}