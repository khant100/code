package DesignPattern.AbstractFactory;

public class Server extends computer{

    String ram;
    String ssd;
    String cpu;

    public Server(String ram, String ssd, String cpu) {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    @Override
    public String ram() {
        return this.ram;
    }

    @Override
    public String ssd() {
        return this.ssd;
    }

    @Override
    public String cpu() {
        return this.cpu;
    }


}
