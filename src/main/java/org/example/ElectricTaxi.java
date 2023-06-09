package org.example;

import org.example.interfaces.IEnvironmentFriendly;

class ElectricTaxi extends TaxiCar implements IEnvironmentFriendly {
    private String ecoCertification;

    public ElectricTaxi(String model, int passengers, double fare, String ecoCertification) {
        super(model, passengers, fare);
        this.ecoCertification = ecoCertification;
    }

    @Override
    public double calculateFare(int distance) {
        return fare * distance * 0.8;
    }

    @Override
    public String getEcoCertification() {
        return ecoCertification;
    }

    @Override
    public void setEcoCertification(String ecoCertification) {
        this.ecoCertification = ecoCertification;
    }
}