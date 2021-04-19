package Restaurant;

public class BeefPizza extends Pizza{

    private double price = 300;

    public String prepareFood(){
        return "Beef pizza";
    }

    public double foodPrice(){
        return price;
    }
}
