package zomato;

import food.Food;

public class Zomato {

        public Food food;
        public int ratings;

        public boolean delivered(Food food){
            boolean isordered=false;
            if(ratings==5){
                System.out.println("Amount Paid,Collect ur order");
                if(food!=null){
                    this.food=food;
                    this.food.displayDetails();
                    isordered=true;
                    System.out.println("Ordered Delivered");
                }
                else
                    System.out.println("NOT FOUND");

            }
            else System.out.println("Order pending amount not payed.........");
            return isordered;
        }
    }


