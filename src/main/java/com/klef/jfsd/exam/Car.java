package com.klef.jfsd.exam;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle {
    @Column(nullable = false)
    private int numberOfDoors;

    // Getters and Setters
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
