package com.skypro;

public class Truck extends Transport implements WheeledTransport,EngineTransport,TrailerTransport, Service {

    public Truck(String modelName, int wheelsCount) {
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
        System.out.println("Меняем покрышку у грузовика");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовика");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп у грузовика");
    }


    @Override
    public void serviceForTransport() {
        System.out.println("Обслуживаем " + getModelName());
        checkAndRepairWheels();
        checkEngine();
        checkTrailer();

    }
}
