package Restaurant;

public class OnionRings extends Appetizers{

    private double price = 100.00;


    public OnionRings(Food newfood){
        super(newfood);
    }

    public String prepareFood(){
        return super.prepareFood() + " with Onion Rings";
    }

    public double foodPrice(){
        return super.foodPrice() + price;
    }
}
