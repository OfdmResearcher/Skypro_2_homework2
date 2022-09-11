package com.skypro;

public class Bicycle extends Transport implements WheeledTransport, Service{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void checkAndRepairWheels() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
    }

    @Override
    public void serviceForTransport() {
        System.out.println("Обслуживаем велосипед " + getModelName());
        checkAndRepairWheels();
    }
}
