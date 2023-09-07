package Restaraunt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static Restaraunt.Food.Add_dishes_ita;

public class Main_restaraunt {
    public static void main(String[] args) throws Exception{
Restaraunt restaraunt=new Restaraunt();
Food food = new Food();
int food_choice;
boolean flag=false;
Cart cart=new Cart();
List<Food> cart_order=new ArrayList<>();
        String temp="";
         List<String> ita_food=new ArrayList<>();
        List<String> sp_food=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("You are welcome to our restaraunt");
        System.out.println("To show menu-1, exit -0");
        int choice=2;
        choice=sc.nextInt();
        if(choice==1) {
        Add_dishes_ita(ita_food, sp_food);
            System.out.println(ita_food);
            System.out.println(sp_food);
        }
        String menu_choice="";
        String str;
sc.nextLine();
        while(choice!=0){

    System.out.println("Please enter name of the dish you want to order,show menu-1,show your order -2, exit - 0");
    menu_choice=sc.nextLine();

       flag=restaraunt.Menu_dish_check_ita(ita_food,menu_choice,food);
            if(ita_food.contains(menu_choice) || flag==true){
                System.out.println("Italian causine");
                restaraunt.setCausineIT();
                if(flag!=true){
                    food.setName(menu_choice);
                }
                food.setPrice();
                food.setGrams();
                System.out.println(food);
                System.out.println("Add choice to cart -'+'");
                menu_choice=sc.nextLine();
                if(menu_choice.equals("+")){
                    cart_order.add(food);
                    cart.Add_tocheck(food.getPrice());
                    cart.setList_order(cart_order);
                }
            }
            else {
                System.out.println("there are no such dish in menu");
            }
    try{
        choice=Integer.parseInt(menu_choice);
        if(choice==0){
            System.out.println(cart);
            System.out.println("you exit");

            throw new Exception();
        }
    }catch (Exception e){
    }
            if(menu_choice.equals("2")){
                System.out.println(cart_order);
            }
            flag=restaraunt.Menu_dish_check_ita(sp_food,menu_choice,food);
     if(sp_food.contains(menu_choice)|| flag==true) {
        System.out.println("Spanish causine");
        restaraunt.setCausineSp();
         if(flag!=true){
             food.setName(menu_choice);
         }
         food.setPrice();
         food.setGrams();
         System.out.println(food);
         System.out.println("Add choice to cart -'+'");
         menu_choice=sc.nextLine();
         if(menu_choice.equals("+")){
             cart_order.add(food);
             cart.Add_tocheck(food.getPrice());
             cart.setList_order(cart_order);
         }
     }

        try{
            choice=Integer.parseInt(menu_choice);
            if( choice==1){
                System.out.println(ita_food);
                System.out.println(sp_food);
            }
        }catch (NumberFormatException e1){
        }

food=new Food();
            flag=false;


        }

    }
}
