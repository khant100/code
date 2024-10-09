package DSACCodingInt.Queue;

public abstract class Animal {

    public Animal(String name) {
        this.name = name;
    }
    public int getOrder() {
        return order;
    }
    public void setOrder(int order) {
        this.order = order;
    }

    private String name ;
    private int order;


  public boolean isOlderThan(Animal a){
      return this.order<a.order;
  }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
