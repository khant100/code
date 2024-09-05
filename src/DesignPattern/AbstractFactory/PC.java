package DesignPattern.AbstractFactory;

public class PC extends computer{

    public PC(String ram, String ssd, String cpu) {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    String ram;
    String ssd;
    String cpu;

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
