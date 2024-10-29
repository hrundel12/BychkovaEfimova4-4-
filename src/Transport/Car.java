package Transport;

// Car.java
public class Car extends Transport {
    public Car(double speed, double pricePerKm) {
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
        System.out.println("Автомобиль: скорость = " + speed + " км/ч, цена за км = " + pricePerKm);
    }
}

