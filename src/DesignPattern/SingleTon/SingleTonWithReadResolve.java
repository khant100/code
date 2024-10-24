package DesignPattern.SingleTon;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingleTonWithReadResolve implements Serializable {
    private static final long serialVersionUID = 1L;

   private static SingleTonWithReadResolve singleton;

   private SingleTonWithReadResolve(){
       if(singleton!=null){
           throw new IllegalStateException("Instance already created");
       }
   }

   public static SingleTonWithReadResolve getInstance(){
       if(singleton==null){
           if(singleton==null){
               singleton = new SingleTonWithReadResolve();
           }

       }
       return singleton;
   }

   // this will ensure that deserilization return same instance
   private Object readResolve() throws ObjectStreamException{
       return getInstance();
   }



}

