package DesignPattern.AbstractFactory;

public class PCFactory implements ComputerFactory {
    private String hdd;
    private String cpu;
    String ram;
    public PCFactory (String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public computer createComputer() {
        return new PC(this.ram,this.hdd,this.cpu);
    }
}
