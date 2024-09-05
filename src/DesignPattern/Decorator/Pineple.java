package DesignPattern.Decorator;

public class Pineple extends Topping{

    BasePizza basePizza;

    public Pineple(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+20;
    }
}
