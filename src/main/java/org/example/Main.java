package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        CarSkeleton gasPoweredCar = new GasPoweredCar(
                "Gas prototype",
                "A combustion engine prototype",
                12.4,
                4
        );
        CarSkeleton electricCar = new ElectricCar(
                "Electric prototype",
                "A battery powered prototype",
                350.0,
                85
        );
        CarSkeleton hybridCar = new HybridCar(
                "Hybrid prototype",
                "A dual engine prototype",
                18.5,
                50,
                4
        );

        testCarSkeleton(gasPoweredCar);
        testCarSkeleton(electricCar);
        testCarSkeleton(hybridCar);
    }

    private static void testCarSkeleton(CarSkeleton carSkeleton) {
        System.out.println(carSkeleton.getClass().getSimpleName());
        System.out.println(carSkeleton.startEngine());
        System.out.println(carSkeleton.drive());
    }
}
