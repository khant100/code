package DesignPattern.Decorator;

public class Main {

    public static void main(String args[]){
        BasePizza pizza = new Pineple(new Margerita());

        System.out.println("cost of Pizza "+pizza.cost());
    }
}
