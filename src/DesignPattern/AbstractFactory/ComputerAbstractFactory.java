package DesignPattern.AbstractFactory;

public class ComputerAbstractFactory {
    public static computer getComputer(ComputerFactory factory){
        return factory.createComputer();
    }
}
