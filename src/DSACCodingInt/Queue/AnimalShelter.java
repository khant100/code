package DSACCodingInt.Queue;

import java.util.LinkedList;

public class AnimalShelter {

    LinkedList<Cat> cat = new LinkedList<>();
    LinkedList<Dog> dogs = new LinkedList<>();
    int order=0;

    public  void  enque(Animal a ){
        a.setOrder(order);
        order++;
        if(a instanceof Cat){
            cat.add((Cat) a);
        }
        if(a instanceof Dog){
            dogs.add((Dog) a);
        }
    }

    public Animal Deque(){
        if(cat.isEmpty()&&dogs.isEmpty()){
            return null;
        }
        if(cat.isEmpty()){
          return   dogs.poll();
        }
        if (dogs.isEmpty()){
        return   cat.poll();
        }
        Cat c = cat.peek();
        Dog d = dogs.peek();

        if(c.isOlderThan(d)){
        return   cat.poll();
        }else{
            return dogs.poll();
        }
    }


    public void printShelter(){
        System.out.println("Shelter");
        for(Cat c:cat){
            System.out.println("->"+c.toString());
        }
        for (Dog d :dogs){
            System.out.println("-"+d.toString());
        }

    }

    public static void main(String args[]){
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enque(new Cat("Sissy"));
        animalShelter.enque(new Dog("Milo"));
        animalShelter.enque(new Cat("Tom"));
        animalShelter.enque(new Cat("Goffy"));
        animalShelter.printShelter();
        System.out.println("animal --> removed "+animalShelter.Deque());
        System.out.print("animal --> removed "+animalShelter.Deque());
        animalShelter.printShelter();
    }
}
