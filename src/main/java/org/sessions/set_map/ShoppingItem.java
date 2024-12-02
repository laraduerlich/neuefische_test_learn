package org.sessions.set_map;

import java.util.Objects;

public class ShoppingItem {
    private String itemName;
    private int price;

    public ShoppingItem(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingItem that = (ShoppingItem) o;
        return price == that.price && Objects.equals(itemName, that.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, price);
    }

    @Override
    public String toString() {
        return "ShoppingItem{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                '}';
    }
}
