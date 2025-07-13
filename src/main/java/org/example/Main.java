package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Model S Dual Motor", 550.6, 45);
        tesla.startEngine();
    }
}