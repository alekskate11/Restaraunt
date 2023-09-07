package Restaraunt;

import java.util.List;

public class Food {

    private String name;
    private double price;

    private int grams;

    public Food() {
    }

    public Food(String name, double price, int grams) {
        this.name = name;
        this.price = price;
        this.grams = grams;
    }
    public static void Add_dishes_ita(List<String> ita_food, List <String> sp_food){
        ita_food.add("Carpaccio");
        ita_food.add("Pizza");
        ita_food.add("Tortellini");
        ita_food.add("Lasagne");
        ita_food.add("Risotto");
        ita_food.add("Tiramisu");
        ita_food.add("Gelato");
        sp_food.add("Gazpacho");
        sp_food.add("Paella");
        sp_food.add("Tortilla");
        sp_food.add("Jamón");
        sp_food.add("Gambas");
        sp_food.add("Patatas bravas");
        sp_food.add("Churros");
        sp_food.add("Albondigas");
        sp_food.add("Croquetas");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        double price=1;
        price=(double) (10+Math.random()*100);

        this.price = price;

    }


    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", grams=" + grams +
                '}';
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams() {
        int grams=1;
        grams=(int)(100+Math.random()*400);
        this.grams = grams;
    }
    public void Rating_detector(int rate){
        if(rate>=0 && rate <2){
            Rating bad = Rating.BAD;
        }
        if(rate>2 && rate<3.5){
            Rating tasty = Rating.TASTY;
        }
        if(rate>3.5 && rate<=5){
            Rating delicious=Rating.DELICIOUS;
        }
    }

    public enum Type_food{MEAT, FISH, DRINKS,ALCOHOL,DESSERT,VEGAN,FRUITS};
 public enum Rating{BAD,TASTY,DELICIOUS};

}
