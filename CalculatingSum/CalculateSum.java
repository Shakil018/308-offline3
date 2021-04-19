package CalculatingSum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalculateSum {

    CalculateAdapter calculateAdapter;

    public int calculate_sum(String filename, String filetype){
        if(filetype.equalsIgnoreCase("int")){

            int sum = 0;

            try {
                File my_file = new File(filename);
                Scanner myReader = new Scanner(my_file);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    String [] all_ints = data.split(" ");

                    for(String num : all_ints){
                        sum += Integer.parseInt(num);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("File error occurred.");
                e.printStackTrace();
            }

            return sum;
        }


        else if(filetype.equalsIgnoreCase("char") || filetype.equalsIgnoreCase("float")){

            calculateAdapter = new CalculateAdapter(filetype);
            return calculateAdapter.calculate_sum(filename, filetype);
        }
        else{
            System.out.println("Invalid filetype");
            return 0;
        }
    }
}
