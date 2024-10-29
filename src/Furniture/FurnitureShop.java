package Furniture;

// FurnitureShop.java
public class FurnitureShop {
    public static void main(String[] args) {
        Furniture chair = new Chair("Дерево", 3000, true);
        Furniture table = new Table("Металл", 7000, 4);

        chair.displayInfo();
        table.displayInfo();
    }
}
