package Restaurant;

public class VeggiPizza extends Pizza{
    private double price = 200;


    public String prepareFood(){
        return "Veggi pizza";
    }

    public double foodPrice(){
        return price;
    }
}
