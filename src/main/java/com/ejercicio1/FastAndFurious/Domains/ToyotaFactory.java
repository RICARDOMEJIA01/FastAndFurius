package com.ejercicio1.FastAndFurious.Domains;

public class ToyotaFactory implements IVehicleFactory{
    @Override
    public IChasis crearChasis() {
        return new ChasisToyota();
    }

    @Override
    public IMotor crearMotor() {
        return new MotorToyota();
    }

    @Override
    public ICojineria crearCojineria() {
        return new CojineriaToyota();
    }
}
