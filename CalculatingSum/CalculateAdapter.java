package CalculatingSum;

public class CalculateAdapter implements Calculate {

    AdvancedCalculator advancedCalculator;

    public CalculateAdapter(String filetype){
        if(filetype.equalsIgnoreCase("char")){
            advancedCalculator = new CharCalculator();
        }else if(filetype.equalsIgnoreCase("float")){

        }
    }


    @Override
    public int calculate_sum(String filename, String filetype) {

        if(filetype.equalsIgnoreCase("char")){
            return advancedCalculator.calculateChar(filename);
        }
        else if(filetype.equalsIgnoreCase("float")){
            return advancedCalculator.calculateFloat(filename);
        }


        return 0;
    }
}

