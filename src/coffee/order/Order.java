package coffee.order;

public class Order {
    private final String name;
    private final int number;

    public Order(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return number + " | " + name;
    }
}

