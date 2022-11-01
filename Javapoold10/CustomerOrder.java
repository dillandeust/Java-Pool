import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {
    private static float finalP;
    Stock stock;
    List<Food> order = new ArrayList<Food>();
    List<Menu> orderMenu = new ArrayList<Menu>();

    public CustomerOrder(Stock stock) {
        this.stock = stock;
    }

    public boolean addItem(Food food) throws NoSuchFoodException {
        stock.remove(food.getClass());
        order.add(food);
        return true;
    }

    public boolean removeItem(Food food) throws NoSuchFoodException {
        for (int i = 0; i < order.size(); i++) {
            if (food == order.get(i)) {
                stock.add(food.getClass());
                order.remove(food);
                return true;
            }
        }
        return false;
    }

    public float getPrice() {
        float finalPrice=0;
        float finalPriceMenu=0;
        // float finalP;

        for (int i = 0; i < order.size(); i++) {
            finalPrice += order.get(i).getPrice(); 
        }
        for (int j = 0; j < orderMenu.size() ; j++) {

            finalPriceMenu += orderMenu.get(j).getPrice();

        }
        return (finalPriceMenu + finalPrice);
    }

    public boolean addMenu(Menu menu) throws NoSuchFoodException {
        if (stock.store.get(menu.getDrink().getClass()) > 0 && stock.store.get(menu.getMeal().getClass()) > 0)
            orderMenu.add(menu);
        return true;
    }

    public boolean removeMenu(Menu menu) throws NoSuchFoodException {
        for (int i = 0; i < orderMenu.size(); i++) {
            if (menu == orderMenu.get(i)) {
                orderMenu.remove(menu);
                removeItem(menu.getDrink());
                removeItem(menu.getMeal());
                return true;
            }
        }
        return false;
    }

    void printOrder() {
        System.out.println("Your order is composed of:");
        for (int i = 0; i < orderMenu.size(); i++) {
            System.out.println(
                    "- " + orderMenu.get(i).getClass().getName() + " menu (" + orderMenu.get(i).getPrice() + " euros)");
            System.out.println("-> drink: " + orderMenu.get(i).getDrink().getClass().getName());
            System.out.println("-> meal: " + orderMenu.get(i).getMeal().getClass().getName());
        }
        for (int i = 0; i < order.size(); i++) {
            System.out.println("- " + order.get(i).getClass().getName() + "(" + order.get(i).getPrice() + " euros)");
        }

        System.out.println("For a total of " + getPrice() + " euros.");

    }

}
