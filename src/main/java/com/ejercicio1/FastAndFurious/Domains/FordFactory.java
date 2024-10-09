package com.ejercicio1.FastAndFurious.Domains;

public class FordFactory implements IVehicleFactory{
    @Override
    public IChasis crearChasis() {
        return new ChasisFord();
    }

    @Override
    public IMotor crearMotor() {
        return new MotorFord();
    }

    @Override
    public ICojineria crearCojineria() {
        return new CojineriaFord();
    }
}
