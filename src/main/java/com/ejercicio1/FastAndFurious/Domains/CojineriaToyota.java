package com.ejercicio1.FastAndFurious.Domains;

public class CojineriaToyota implements ICojineria{
    @Override
    public int getNoPieza() {
        return 6;
    }

    @Override
    public String getMaterial() {
        return "Cuero";
    }
}
