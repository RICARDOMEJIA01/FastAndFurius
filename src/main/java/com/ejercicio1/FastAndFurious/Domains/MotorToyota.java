package com.ejercicio1.FastAndFurious.Domains;

public class MotorToyota implements IMotor{
    @Override
    public int getPotenciaMaxima() {
        return 250;
    }

    @Override
    public int getNoPieza() {
        return 6;
    }

    @Override
    public String getTecnologia() {
        return "Híbrido";
    }
}
