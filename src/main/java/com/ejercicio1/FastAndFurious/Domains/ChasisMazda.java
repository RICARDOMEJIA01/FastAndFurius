package com.ejercicio1.FastAndFurious.Domains;

public class ChasisMazda implements IChasis{
    @Override
    public int getNoEjes() {
        return 6;
    }

    @Override
    public int getNoPieza() {
        return 5;
    }

    @Override
    public String getTipoTransmision() {
        return "mecánica";
    }
}
