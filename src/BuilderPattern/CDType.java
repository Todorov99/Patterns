package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class CDType {

    private List<Packing> items = new ArrayList<>();

    public void addItem(Packing packs) {
        this.items.add(packs);
    }

    public void getCost(){

        for (Packing pack : this.items) {
            pack.price();
        }
    }

    public void showItems() {
        for (Packing packs : this.items) {
            System.out.println("CD name:" + packs.pack());
            System.out.println("Price:" + packs.price());
        }
    }
}
