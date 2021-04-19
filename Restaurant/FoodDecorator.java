package Restaurant;

public abstract class FoodDecorator implements Food{

    private Food newfood;

    public FoodDecorator(Food newfood){
        this.newfood = newfood;
    }

    public String prepareFood(){
        return newfood.prepareFood();
    }

    public double foodPrice(){
        return newfood.foodPrice();
    }

}
