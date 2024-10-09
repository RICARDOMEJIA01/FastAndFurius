package com.ejercicio1.FastAndFurious.Domains;

public class MazdaFactory implements IVehicleFactory{
    @Override
    public IChasis crearChasis() {
        return new ChasisMazda();
    }

    @Override
    public IMotor crearMotor() {
        return new MotorMazda();
    }

    @Override
    public ICojineria crearCojineria() {
        return new CojineriaMazda();
    }
}
