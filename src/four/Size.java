package four;

class Size {
    private String name;
    private int euroSize;

    public static final Size XXS = new Size("XXS", 32);
    public static final Size XS = new Size("XS", 34);
    public static final Size S = new Size("S", 36);
    public static final Size M = new Size("M", 38);
    public static final Size L = new Size("L", 40);

    private Size(String name, int euroSize) {
        this.name = name;
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return this == XXS ? "Детский размер" : "Взрослый размер";
    }

    @Override
    public String toString() {
        return name;
    }

    public static Size[] values() {
        return new Size[]{XXS, XS, S, M, L};
    }
}

interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWoman();
}

abstract class Clothes {
    Size size;
    double price;
    String color;

    Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }
}

class TShirt extends Clothes implements MenClothing, WomenClothing {
    TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Футболка мужская: " + size + ", " + price + ", " + color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Футболка женская: " + size + ", " + price + ", " + color);
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {
    Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Штаны мужские: " + size + ", " + price + ", " + color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Штаны женские: " + size + ", " + price + ", " + color);
    }
}

class Skirt extends Clothes implements WomenClothing {
    Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Юбка: " + size + ", " + price + ", " + color);
    }
}

class Tie extends Clothes implements MenClothing {
    Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук: " + size + ", " + price + ", " + color);
    }
}

class Atelier {
    void dressWomen(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof WomenClothing) ((WomenClothing) c).dressWoman();
        }
    }

    void dressMen(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof MenClothing) ((MenClothing) c).dressMan();
        }
    }
}

class AtelierTest {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 15.99, "Красный"),
                new Pants(Size.L, 25.50, "Синий"),
                new Skirt(Size.S, 19.99, "Черный"),
                new Tie(Size.XS, 10.00, "Зеленый")
        };

        Atelier atelier = new Atelier();
        System.out.println("Женская одежда:");
        atelier.dressWomen(clothes);

        System.out.println("\nМужская одежда:");
        atelier.dressMen(clothes);
    }
}