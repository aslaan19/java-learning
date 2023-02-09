import java.util.ArrayList;

public class Container {
    private ArrayList<Integer> items;
    private int maxWeight;

    public Container() {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public boolean addItem(int itemWeight) {
        int currentWeight = 0;
        for (int item : items) {
            currentWeight += item;
        }

        if (currentWeight + itemWeight <= maxWeight) {
            items.add(itemWeight);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Integer> getItems() {
        return items;
    }
}
