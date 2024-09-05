package DesignPattern.AbstractFactory;

public abstract class computer {

    public abstract String ram();
    public abstract String ssd();
    public abstract String cpu();
    @Override
    public String toString(){
        return "RAM= "+this.ram()+", HDD="+this.ssd()+", CPU="+this.cpu();
    }
}
