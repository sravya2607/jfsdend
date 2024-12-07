package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Controller {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Vehicle.class);
        configuration.addAnnotatedClass(Car.class);
        configuration.addAnnotatedClass(Truck.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Adding a general Vehicle
        Vehicle vehicle = new Car(); // Using Car as a placeholder
        vehicle.setName("Generic Vehicle");
        vehicle.setType("Generic");
        vehicle.setMaxSpeed(100);
        vehicle.setColor("Grey");
        session.persist(vehicle);

        // Adding a Car
        Car car = new Car();
        car.setName("Sedan");
        car.setType("Car");
        car.setMaxSpeed(180);
        car.setColor("Red");
        car.setNumberOfDoors(4);
        session.persist(car);

        // Adding a Truck
        Truck truck = new Truck();
        truck.setName("Cargo");
        truck.setType("Truck");
        truck.setMaxSpeed(120);
        truck.setColor("Blue");
        truck.setLoadCapacity(10000); // Load Capacity in kg
        session.persist(truck);

        transaction.commit();

        System.out.println("Records inserted successfully!");

        session.close();
        sessionFactory.close();
    }
}
