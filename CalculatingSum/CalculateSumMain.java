package CalculatingSum;

import java.util.Scanner;

public class CalculateSumMain {

    public static void main(String[] args){

        CalculateSum calculator = new CalculateSum();

        Scanner reader = new Scanner(System.in);

        System.out.println("Input quit to break");


        while(true){
            System.out.println("Input filename: ");

            String filename = reader.nextLine();

            if(filename.equalsIgnoreCase("quit")){
                break;
            }

            System.out.println("Input filetype: ");

            String filetype = reader.nextLine();

            calculator.calculate_sum(filename, filetype);

        }

    }
}
