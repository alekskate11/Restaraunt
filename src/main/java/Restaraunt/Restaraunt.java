package Restaraunt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Restaraunt {
    private List<Food> order_customer;
    private List<String> ita_food;
    private List<String> sp_food;
private HashMap<String,Enum> causine_detector;
    Country_causine causineEnum;




    public void setCausineIT() {
        this.causineEnum = Country_causine.ITALIAN;
    }
    public void setCausineSp() {
        this.causineEnum = Country_causine.SPANISH;
    }

    public Country_causine getCausineEnum() {
        return causineEnum;
    }
public  boolean Menu_dish_check_ita(List<String> ita_food,String menu_choice,Food food){
        boolean flag=false;
    String temp="";
    String name;
    Iterator<String> iterator=ita_food.iterator();
    while (iterator.hasNext()){
        temp=iterator.next();
        int res=0;
        res=temp.compareToIgnoreCase(menu_choice);

        if(temp.startsWith(menu_choice) || res==0 || temp.startsWith(menu_choice,2)){
            flag=true;
            food.setName(temp);
            break;
        }
    }
        return flag;
}
    public enum Country_causine{ITALIAN,SPANISH};

}
