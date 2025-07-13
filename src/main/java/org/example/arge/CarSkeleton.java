package org.example.arge;

public class CarSkeleton {
  private String name;
  private String description;

  public CarSkeleton() {
  }

  public CarSkeleton(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public void startEngine() {
    System.out.println("the car's engine is starting");
  }

  public void drive() {
    System.out.println("Driving the car");
    runEngine();
  }

  protected void runEngine() {
    System.out.println("Engine is running");
  }

  public String getDescription() {
    return description;
  }

  public String getName() {
    return name;
  }
}
