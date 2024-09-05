package DesignPattern.AbstractFactory;

public class ServerFactory implements ComputerFactory {private String ram;
    private String hdd;
    private String cpu;
    private String ram1;
    public ServerFactory(String ram1, String hdd, String cpu){
        this.ram1=ram1;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public computer createComputer() {
        return new Server(this.ram1,this.hdd,this.cpu);
    }
}
