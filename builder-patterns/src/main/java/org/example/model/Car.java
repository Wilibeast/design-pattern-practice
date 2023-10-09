package org.example.model;

public class Car {
    private final int numberOfSeats;
    private final int numberOfDoors;
    private final int numberOfWheels;
    private final EngineType engineType;
    private final SeatType seatType;
    private final TransmissionType transmissionType;

    public Car(CarBuilder carBuilder) {
        this.numberOfSeats = carBuilder.getNumberOfSeats();
        this.numberOfDoors = carBuilder.getNumberOfDoors();
        this.numberOfWheels = carBuilder.getNumberOfWheels();
        this.engineType = carBuilder.getEngineType();
        this.seatType = carBuilder.getSeatType();
        this.transmissionType = carBuilder.getTransmissionType();
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                ", numberOfDoors=" + numberOfDoors +
                ", numberOfWheels=" + numberOfWheels +
                ", engineType=" + engineType +
                ", seatType=" + seatType +
                ", transmissionType=" + transmissionType +
                '}';
    }
}
