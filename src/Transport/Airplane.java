package Transport;

// Airplane.java
public class Airplane extends Transport {
    public Airplane(double speed, double pricePerKm) {
        super(speed, pricePerKm);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public double calculateCost(double distance) {
        return distance * pricePerKm;
    }

    @Override
    public void displayInfo() {
        System.out.println("Самолет: скорость = " + speed + " км/ч, цена за км = " + pricePerKm);
    }
}
