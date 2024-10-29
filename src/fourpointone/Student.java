package fourpointone;

class Student {
    protected String name;
    protected String university;

    public Student(String name, String university) {
        this.name = name;
        this.university = university;
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", Университет: " + university;
    }
}

class Schoolboy extends Student {
    private String school;

    public Schoolboy(String name, String school) {
        super(name, "Не указано");
        this.school = school;
    }

    @Override
    public String toString() {
        return "Школьник: " + name + ", Школа: " + school;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Schoolboy("Алексей", "Гимназия №1");
        students[1] = new Schoolboy("Мария", "Лицей №2");
        students[2] = new Student("Иван", "МГУ");
        students[3] = new Student("Ольга", "СПбГУ");

        System.out.println("Школьники:");
        for (Student student : students) {
            if (student instanceof Schoolboy) {
                System.out.println(student);
            }
        }

        System.out.println("\nСтуденты:");
        for (Student student : students) {
            if (student instanceof Student && !(student instanceof Schoolboy)) {
                System.out.println(student);
            }
        }
    }
}