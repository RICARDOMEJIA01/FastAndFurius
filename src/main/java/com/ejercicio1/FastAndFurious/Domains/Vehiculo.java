package com.ejercicio1.FastAndFurious.Domains;

import java.time.LocalDate;

public class Vehiculo {
    private IChasis chasis;
    private IMotor motor;
    private ICojineria cojineria;
    private String color;
    private LocalDate fechaEnsamblaje;
    private String numeroEnsamblaje;

    public Vehiculo(IChasis chasis, IMotor motor, ICojineria cojineria, String color, LocalDate fechaEnsamblaje, String numeroEnsamblaje) {
        this.chasis = chasis;
        this.motor = motor;
        this.cojineria = cojineria;
        this.color = color;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    public IChasis getChasis() {
        return chasis;
    }

    public void setChasis(IChasis chasis) {
        this.chasis = chasis;
    }

    public IMotor getMotor() {
        return motor;
    }

    public void setMotor(IMotor motor) {
        this.motor = motor;
    }

    public ICojineria getCojineria() {
        return cojineria;
    }

    public void setCojineria(ICojineria cojineria) {
        this.cojineria = cojineria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getFechaEnsamblaje() {
        return fechaEnsamblaje;
    }

    public void setFechaEnsamblaje(LocalDate fechaEnsamblaje) {
        this.fechaEnsamblaje = fechaEnsamblaje;
    }

    public String getNumeroEnsamblaje() {
        return numeroEnsamblaje;
    }

    public void setNumeroEnsamblaje(String numeroEnsamblaje) {
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "chasis=" + chasis +
                ", motor=" + motor +
                ", cojineria=" + cojineria +
                ", color='" + color + '\'' +
                ", fechaEnsamblaje=" + fechaEnsamblaje +
                ", numeroEnsamblaje='" + numeroEnsamblaje + '\'' +
                '}';
    }
}
