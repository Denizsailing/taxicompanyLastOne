package org.example;

class Driver extends Person implements Worker {
    private double hourlyRate;

    public Driver(String name, int age, double hourlyRate) {
        super(name, age);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * 40 * 52;
    }
}