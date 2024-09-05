package DesignPattern.AdaptorDesignPattern.Adaptor;

import DesignPattern.AdaptorDesignPattern.Adaptee.WeightMachince;

public class WeightMachniceAdaptorImpl implements WeightMachineAdaptor{

    WeightMachince weightMachince;

    public WeightMachniceAdaptorImpl(WeightMachince weightMachince) {
        this.weightMachince = weightMachince;
    }

    @Override
    public double getWeightInKgs() {
        double weightInPound = weightMachince.getWeightInPounds();
        double weightInkg = weightInPound *.45;
        return weightInkg;
    }
}
