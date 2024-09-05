package DesignPattern.Factory;

public class CarFactory {

    public static Car getInstance(String car){

        if(car==null||car.length()==0){
            return null;
        }
        if(car.equalsIgnoreCase("Hundai")){
            return new Hundai();
        }else if(car.equalsIgnoreCase("Maruti")){
            return new Maruti();
        }else if(car.equalsIgnoreCase("Tesla")){
            return new Tesla();
        }
        else {
            return null;
        }


    }


    public  static void main(String args[]){

    System.out.println(" "+getInstance("Maruti"));

    }

}
