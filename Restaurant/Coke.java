package Restaurant;

public class Coke extends Drinks{

    private double price = 50;

    public Coke(Food newfood){
        super(newfood);
    }

    public String prepareFood(){
        return super.prepareFood() + " with Coke";
    }

    public double foodPrice(){
        return super.foodPrice() + price;
    }

}
