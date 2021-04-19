package Restaurant;

import java.util.Scanner;

public class RestaurantMain {

    public static void main(String[] args){

        System.out.println("1. Beef Pizza with French fry (300tk, 100tk)");
        System.out.println("2. Veggi Pizza with onion rings (200tk, 100tk)");
        System.out.println("3. A combo meal with Veggi Pizza, French Fry and Coke (200tk, 100tk, 50tk)");
        System.out.println("4. A combo meal with Veggi Pizza, Onion Rings and Coffee (200tk, 100tk, 100tk)");
        System.out.println("5. A Beef Pizza only (300tk)");
        System.out.println("6. Exit");


        while(true){
            System.out.println("Enter your choice: ");

            Scanner reader = new Scanner(System.in);

            int choice = Integer.parseInt((String) reader.nextLine());

            if(choice == 1){
                Food food = new FrenchFries((Food)new BeefPizza());

                System.out.println(food.prepareFood());
                System.out.println("price : " + food.foodPrice());
            }
            else if (choice == 2){

                Food food = new OnionRings((Food) new VeggiPizza());

                System.out.println(food.prepareFood());
                System.out.println("price : " + food.foodPrice());
            }
            else if (choice == 3){

                Food food = new Coke((Food) new FrenchFries((Food) new VeggiPizza()));


                System.out.println(food.prepareFood());
                System.out.println("price : " + food.foodPrice());
            }
            else if (choice == 4){

                Food food = new Coffee((Food) new OnionRings((Food) new VeggiPizza()));


                System.out.println(food.prepareFood());
                System.out.println("price : " + food.foodPrice());
            }
            else if (choice == 5){
                Food food = new BeefPizza();

                System.out.println(food.prepareFood());
                System.out.println("price : " + food.foodPrice());
            }
            else if (choice == 6){
                break;
            }


        }









    }

}
