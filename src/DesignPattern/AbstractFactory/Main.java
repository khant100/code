package DesignPattern.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        computer  pc = ComputerAbstractFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        computer server = ComputerAbstractFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
    }
}
