package Transport;

// TransportTest.java
public class TransportTest {
    public static void main(String[] args) {
        Transport car = new Car(80, 5);
        Transport airplane = new Airplane(600, 50);

        double distance = 500; // расстояние для тестирования

        System.out.println("Автомобиль:");
        car.displayInfo();
        System.out.println("Время: " + car.calculateTime(distance) + " часов");
        System.out.println("Стоимость: " + car.calculateCost(distance) + " руб.");

        System.out.println("\nСамолет:");
        airplane.displayInfo();
        System.out.println("Время: " + airplane.calculateTime(distance) + " часов");
        System.out.println("Стоимость: " + airplane.calculateCost(distance) + " руб.");
    }
}