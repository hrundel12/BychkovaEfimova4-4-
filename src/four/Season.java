package four;

class Season {
    private String name;
    private int averageTemp;

    public static final Season WINTER = new Season("Зима", -5);
    public static final Season SPRING = new Season("Весна", 10);
    public static final Season SUMMER = new Season("Лето", 25);
    public static final Season AUTUMN = new Season("Осень", 15);

    private Season(String name, int averageTemp) {
        this.name = name;
        this.averageTemp = averageTemp;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public String getDescription() {
        return this == SUMMER ? "Теплое время года" : "Холодное время года";
    }

    @Override
    public String toString() {
        return name;
    }
}

class TestSeason {
    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.println("Любимое время года: " + favorite + ", температура: " + favorite.getAverageTemp() + ", описание: " + favorite.getDescription());
        printSeasonInfo(favorite);
        for (Season season : new Season[]{Season.WINTER, Season.SPRING, Season.SUMMER, Season.AUTUMN}) {
            System.out.println(season + ": " + season.getAverageTemp() + ", " + season.getDescription());
        }
    }

    static void printSeasonInfo(Season season) {
        if (season == Season.SUMMER) System.out.println("Я люблю лето");
        else if (season == Season.WINTER) System.out.println("Я люблю зиму");
        else if (season == Season.SPRING) System.out.println("Я люблю весну");
        else if (season == Season.AUTUMN) System.out.println("Я люблю осень");
    }
}