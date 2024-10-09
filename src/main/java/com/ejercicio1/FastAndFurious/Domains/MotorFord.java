package com.ejercicio1.FastAndFurious.Domains;

public class MotorFord implements IMotor{
    @Override
    public int getPotenciaMaxima() {
        return 230;
    }

    @Override
    public int getNoPieza() {
        return 7;
    }

    @Override
    public String getTecnologia() {
        return "térmico";
    }
}
