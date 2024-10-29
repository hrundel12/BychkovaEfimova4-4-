package four;

class Computer {
    private String brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public static final String DELL = "Dell";
    public static final String HP = "HP";
    public static final String ASUS = "Asus";
    public static final String APPLE = "Apple";

    Computer(String brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    void displayInfo() {
        System.out.println("Компьютер: " + brand + ", процессор: " + processor.model + ", память: " + memory.capacity + "GB, монитор: " + monitor.size + " дюймов");
    }
}

class Processor {
    String model;
    double speed;

    Processor(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }
}

class Memory {
    int capacity;

    Memory(int capacity) {
        this.capacity = capacity;
    }
}

class Monitor {
    double size;

    Monitor(double size) {
        this.size = size;
    }
}

class ComputerTest {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7", 3.6);
        Memory memory = new Memory(16);
        Monitor monitor = new Monitor(27);
        Computer computer = new Computer(Computer.APPLE, processor, memory, monitor);
        computer.displayInfo();
    }
}