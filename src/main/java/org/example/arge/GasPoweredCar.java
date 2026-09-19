package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the gas powered car's engine is starting";
    }

    @Override
    public String drive() {
        runEngine();
        System.out.println(getClass().getSimpleName());
        return "the gas powered car is driving";
    }

    @Override
    protected String runEngine() {
        System.out.println(getClass().getSimpleName());
        return "the gas powered car's engine is running";
    }
}
