package Restaurant;

public class Coffee extends  Drinks{

    private double price = 100;

    public Coffee(Food newfood){
        super(newfood);
    }

    public String prepareFood(){
        return super.prepareFood() + " with Coffee";
    }

    public double foodPrice(){
        return super.foodPrice() + price;
    }
}
