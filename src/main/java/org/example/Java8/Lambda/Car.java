package org.example.Java8.Lambda;

import java.util.ArrayList;
import java.util.List;

public class Car {
    static String model , color ;
    static int year;

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", "white", 2019));
        cars.add(new Car("Tesla", "black", 2021));
        cars.add(new Car("BMW", "white", 2018));
        cars.add(new Car("BMW", "red", 2017));
        cars.add(new Car("Audi", "blue", 2022));

//        Cartester c = new Cartester();
//        c.testDrive(cars,(Car a) -> {
//            return a.year >= 2018;
//        });

    }



    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
static class Cartester {
    @FunctionalInterface
    interface lambda {
        public abstract boolean needToTest(Car car);
    }
    public void drive() {
        System.out.println(color + " " + model + " is driving " + year);
    }

    public void testDrive(List<Car> cars, String modelToTest) {
        for (Car car : cars) {
            if (car.model.equals(modelToTest)) {
                car.drive();
            }
        }
    }
}

    private void drive() {
    }
}
