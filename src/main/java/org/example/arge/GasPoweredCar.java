package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
  private double avgKmPerLitre;
  private int cylinders;

  public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
    super(name, description);
    this.avgKmPerLitre = avgKmPerLitre;
    this.cylinders = cylinders;
  }

  @Override
  public void startEngine() {
    System.out.println("gas-powered car's engine is starting");
  }

  @Override
  public void drive() {
    System.out.println("Driving the gas-powered car");
    runEngine();
  }

  @Override
  protected void runEngine() {
    System.out.println("gas-powered engine is running");
  }

  public double getAvgKmPerLitre() {
    return avgKmPerLitre;
  }

  public int getCylinders() {
    return cylinders;
  }
}
