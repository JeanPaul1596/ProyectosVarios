/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author jeanp
 */
@Named(value = "ringView")
@RequestScoped
public class RingView implements Serializable {
     
    private List<Car> cars;
    private Car selectedCar;
     
    @PostConstruct
    public void init() {
        cars = new ArrayList<Car>();
         
        cars.add(new Car("1", "Ford", 2000, "Black"));
        cars.add(new Car("2", "Audi", 2003, "Orange"));
        cars.add(new Car("4", "BMW", 2012, "Red"));
        cars.add(new Car("5", "Fiat", 2001, "Yellow"));
        cars.add(new Car("6", "Mercedes", 2014, "Blue"));
    }
 
    public List<Car> getCars() {
        return cars;
    }
 
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
 
    public Car getSelectedCar() {
        return selectedCar;
    }
 
    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }
}