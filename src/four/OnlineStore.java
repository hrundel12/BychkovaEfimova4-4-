package four;

import java.util.ArrayList;
import java.util.List;

class OnlineStore {
    private List<String> cart = new ArrayList<>();
    private List<String> catalogs = List.of("Электроника", "Одежда", "Продукты");
    private List<String> products = List.of("Телефон", "Компьютер", "Кофе");

    void authenticate(String login, String password) {
        System.out.println("Аутентификация для: " + login);
    }

    void viewCatalogs() {
        System.out.println("Список каталогов товаров: " + catalogs);
    }

    void viewProducts(String catalog) {
        System.out.println("Список товаров каталога " + catalog + ": " + products);
    }

    void addToCart(String product) {
        cart.add(product);
        System.out.println("Товар добавлен в корзину: " + product);
    }

    void purchase() {
        System.out.println("Покупка товаров из корзины: " + cart);
        cart.clear();
    }
}

class StoreTest {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();
        store.authenticate("user", "pass");
        store.viewCatalogs();
        store.viewProducts("Электроника");
        store.addToCart("Телефон");
        store.purchase();
    }
}