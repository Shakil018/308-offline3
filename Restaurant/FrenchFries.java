package Restaurant;

public class FrenchFries extends Appetizers{
    private double price = 100.00;


    public FrenchFries(Food newfood){
        super(newfood);
    }

    public String prepareFood(){
        return super.prepareFood() + " with French Fries";
    }

    public double foodPrice(){
        return super.foodPrice() + price;
    }

}
