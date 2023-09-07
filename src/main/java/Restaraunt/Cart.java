package Restaraunt;

import java.util.List;

public class Cart {
    private double total_price;
    private List<Food> list_order;

    public List<Food> getList_order() {
        return list_order;
    }

    public void addList_order(Food list_order) {
        this.list_order.add(list_order);
    }

    public void setList_order(List<Food> list_order) {
        this.list_order = list_order;
    }

    public  void Add_tocheck(double money){
        this.total_price+=money;

    }

    @Override
    public String toString() {
        return "Cart{" +
                "total_price=" + total_price +
                ", list_order=" + list_order +
                '}';
    }
}
