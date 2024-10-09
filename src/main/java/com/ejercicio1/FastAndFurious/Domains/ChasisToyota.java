package com.ejercicio1.FastAndFurious.Domains;

public class ChasisToyota implements IChasis{
    @Override
    public int getNoEjes() {
        return 4;
    }

    @Override
    public int getNoPieza() {
        return 2;
    }

    @Override
    public String getTipoTransmision() {
        return "Automática";
    }
}
