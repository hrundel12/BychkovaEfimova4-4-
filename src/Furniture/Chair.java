package Furniture;

// Chair.java
public class Chair extends Furniture {
    private boolean hasArmrests;

    public Chair(String material, double price, boolean hasArmrests) {
        super(material, price);
        this.hasArmrests = hasArmrests;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стул из материала: " + material + ", цена: " + price + ", с подлокотниками: " + hasArmrests);
    }
}


