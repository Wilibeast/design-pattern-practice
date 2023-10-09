package org.example.model;

public class CarBuilder {
    private int numberOfSeats;
    private int numberOfDoors;
    private int numberOfWheels;
    private EngineType engineType;
    private SeatType seatType;
    private TransmissionType transmissionType;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public CarBuilder numberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        return this;
    }

    public CarBuilder numberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public CarBuilder numberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        return this;
    }

    public CarBuilder engineType(EngineType engineType) {
        this.engineType = engineType;
        return this;
    }

    public CarBuilder seatType(SeatType seatType) {
        this.seatType = seatType;
        return this;
    }

    public CarBuilder transmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
        return this;
    }

    public Car build() {
        return new Car(this);
    }
}
