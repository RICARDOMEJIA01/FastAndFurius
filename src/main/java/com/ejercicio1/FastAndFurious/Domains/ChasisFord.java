package com.ejercicio1.FastAndFurious.Domains;

public class ChasisFord implements IChasis{
    @Override
    public int getNoEjes() {
        return 5;
    }

    @Override
    public int getNoPieza() {
        return 10;
    }

    @Override
    public String getTipoTransmision() {
        return "";
    }
}
