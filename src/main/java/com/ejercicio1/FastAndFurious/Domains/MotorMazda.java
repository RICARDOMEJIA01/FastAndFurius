package com.ejercicio1.FastAndFurious.Domains;

public class MotorMazda implements IMotor{
    @Override
    public int getPotenciaMaxima() {
        return 200;
    }

    @Override
    public int getNoPieza() {
        return 7;
    }

    @Override
    public String getTecnologia() {
        return "eléctrico";
    }
}
