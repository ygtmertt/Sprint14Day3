package org.example.arge;

public class ElectricCar extends CarSkeleton {
  private double avgKmPerCharge;
  private int batterySize;

  public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
    super(name, description);
    this.avgKmPerCharge = avgKmPerCharge;
    this.batterySize = batterySize;
  }

  @Override
  public void startEngine() {
    System.out.println("electric car's engine is starting");
  }

  @Override
  public void drive() {
    System.out.println("Driving the electric car");
    runEngine();
  }

  @Override
  protected void runEngine() {
    System.out.println("electric engine is running");
  }

  public double getAvgKmPerCharge() {
    return avgKmPerCharge;
  }

  public int getBatterySize() {
    return batterySize;
  }
}
