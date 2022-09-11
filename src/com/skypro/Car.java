package com.skypro;

public class Car extends Transport implements WheeledTransport, EngineTransport, Service{

    public Car(String modelName, int wheelsCount) {
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
        System.out.println("Меняем покрышку у машины");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у машины");
    }


    @Override
    public void serviceForTransport() {
        System.out.println("Обслуживаем машину " + getModelName());
        checkAndRepairWheels();
        checkEngine();
    }
}
