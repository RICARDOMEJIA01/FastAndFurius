package com.ejercicio1.FastAndFurious.Controllers;

import com.ejercicio1.FastAndFurious.Domains.*;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/ensamblar")
public class VehicleController {
    @PostMapping
    public Vehiculo ensamblarVehiculo(@RequestBody VehiculoRequest request) {

        IVehicleFactory factory;

        switch (request.getMarca().toLowerCase()) {
            case "toyota":
                factory = new ToyotaFactory();
                break;
            case "ford":
                factory = new FordFactory();
                break;
            case "mazda":
                factory = new MazdaFactory();
                break;
            default:
                throw new IllegalArgumentException("Marca no soportada");
        }

        IChasis chasis = factory.crearChasis();
        IMotor motor = factory.crearMotor();
        ICojineria cojineria = factory.crearCojineria();

        return new Vehiculo(chasis, motor, cojineria, request.getColor(), request.getFechaEnsamblaje(), request.getNumeroEnsamblaje());
    }
}

