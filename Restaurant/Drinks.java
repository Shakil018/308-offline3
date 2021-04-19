package Restaurant;

public abstract class Drinks extends FoodDecorator{

    public Drinks(Food newfood){
        super(newfood);
    }

}
