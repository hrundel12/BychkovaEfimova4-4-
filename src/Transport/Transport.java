package Transport;

// Transport.java
public abstract class Transport {
    protected double speed;
    protected double pricePerKm;

    public Transport(double speed, double pricePerKm) {
        this.speed = speed;
        this.pricePerKm = pricePerKm;
    }

    public abstract double calculateTime(double distance);
    public abstract double calculateCost(double distance);
    public abstract void displayInfo();
}