package fourpointone;

class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0);
    }

    public Phone() {
        this("Unknown", "Unknown", 0);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номера " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Сообщение отправлено на номера:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    public void displayInfo() {
        System.out.println("Номер: " + number + ", Модель: " + model + ", Вес: " + weight);
    }
}

class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "Model1", 150);
        Phone phone2 = new Phone("987654321", "Model2");
        Phone phone3 = new Phone();

        phone1.displayInfo();
        phone2.displayInfo();
        phone3.displayInfo();

        phone1.receiveCall("Алексей");
        phone2.receiveCall("Мария", "987654321");
        phone1.sendMessage("111", "222", "333");
    }
}