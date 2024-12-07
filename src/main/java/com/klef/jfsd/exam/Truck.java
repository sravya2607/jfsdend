package com.klef.jfsd.exam;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Truck extends Vehicle {
    @Column(nullable = false)
    private int loadCapacity;

    // Getters and Setters
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
