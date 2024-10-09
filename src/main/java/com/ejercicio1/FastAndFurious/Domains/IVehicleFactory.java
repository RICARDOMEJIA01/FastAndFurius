package com.ejercicio1.FastAndFurious.Domains;

public interface IVehicleFactory {
    IChasis crearChasis();
    IMotor crearMotor();
    ICojineria crearCojineria();
}
