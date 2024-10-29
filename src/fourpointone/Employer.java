package fourpointone;

class Employer {
    protected String firstName;
    protected String lastName;
    protected double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    @Override
    public String toString() {
        return "Employer: " + firstName + " " + lastName + ", Income: " + getIncome();
    }
}

class Manager extends Employer {
    private double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return super.getIncome() * 12 + averageSum;
    }

    @Override
    public String toString() {
        return "Manager: " + firstName + " " + lastName + ", Income: " + getIncome();
    }
}

class EmployerTest {
    public static void main(String[] args) {
        Employer[] employees = new Employer[3];
        employees[0] = new Employer("Иван", "Иванов", 50000);
        employees[1] = new Manager("Петр", "Петров", 60000, 20000);
        employees[2] = new Manager("Сергей", "Сергеев", 70000, 15000);

        for (Employer employee : employees) {
            System.out.println(employee);
        }
    }
}
