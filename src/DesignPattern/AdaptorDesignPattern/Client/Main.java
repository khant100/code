package DesignPattern.AdaptorDesignPattern.Client;

import DesignPattern.AdaptorDesignPattern.Adaptee.WeightMachniceForBabies;
import DesignPattern.AdaptorDesignPattern.Adaptor.WeightMachineAdaptor;
import DesignPattern.AdaptorDesignPattern.Adaptor.WeightMachniceAdaptorImpl;

public class Main {

    public static void main(String args[]){
        WeightMachineAdaptor weightMachineAdaptor = new WeightMachniceAdaptorImpl(new WeightMachniceForBabies());
        System.out.println(" : "+weightMachineAdaptor.getWeightInKgs());
    }
}
