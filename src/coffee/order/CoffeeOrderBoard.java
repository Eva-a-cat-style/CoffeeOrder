package coffee.order;
import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private final List<Order> orders;
    private int nextNumber;

    public CoffeeOrderBoard() {
        this.orders = new ArrayList<>();
        this.nextNumber = 1;
    }

    public void addNewOrder(String name) {
        Order order = new Order(name, nextNumber);
        orders.add(order);
        nextNumber++;
    }

    public Order deliver() {
        if (!orders.isEmpty()) {
            return orders.removeFirst();
        }
        return null;
    }

    public Order deliver(int number) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getNumber() == number) {
                return orders.remove(i);
            }
        }
        return null;
    }

    public void draw() {
        System.out.println("                 ");
        System.out.println("Number | Name");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

