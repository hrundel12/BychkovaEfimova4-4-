package Furniture;

// Table.java
public class Table extends Furniture {
    private int seats;

    public Table(String material, double price, int seats) {
        super(material, price);
        this.seats = seats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стол из материала: " + material + ", цена: " + price + ", количество мест: " + seats);
    }
}
