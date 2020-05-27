package com.company;

import java.util.ArrayList;
import java.util.List;

public class Car implements Comparable<Car> {
    public String model;
    public int manufactureYear;

    public Car(String model, int manufactureYear) {
        this.model = model;
        this.manufactureYear = manufactureYear;
    }
    public static void ListCollectionCars() {
        List<Car> cars = new ArrayList<>();

        Car c1 = new Car("Porshe", 1995);
        Car c2 = new Car("Mercedes", 1990);
        Car c3 = new Car("Lamborghini", 1997);
        Car c4 = new Car("Ferrari", 2000);
        Car c5 = new Car("Aston Martin", 2011);
        Car c6 = new Car("Volvo", 2017);
        Car c7 = new Car("Infinity", 2020);
        Car c8 = new Car("Toyota", 2002);
        Car c9 = new Car("Rolls Royce", 2008);
        Car c10 = new Car("BMW", 2018);

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        cars.add(c8);
        cars.add(c9);
        cars.add(c10);
    }

    @Override
    public int compareTo(Car cars) {
    return this.manufactureYear.compareTo(cars.manufactureYear);
    }
}
