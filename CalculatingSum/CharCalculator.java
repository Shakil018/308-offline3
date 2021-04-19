package CalculatingSum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharCalculator implements  AdvancedCalculator{
    @Override
    public int calculateChar(String filename) {

        int sum = 0;


        try {
            File my_file = new File(filename);
            Scanner myReader = new Scanner(my_file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String [] all_chars = data.split(" ");

                for(String num : all_chars){
                    char ch = num.charAt(0);
                    sum += ch;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File error occurred.");
            e.printStackTrace();
        }

        return sum;
    }

    @Override
    public int calculateFloat(String filename) {
        return 0;
    }
}
