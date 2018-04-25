package GURPS.Space.Ship;

public class PassSeats extends ShipPart {
    int seats;

    public PassSeats (int size, long cost, int seats, int techLvl) {
        this.size=size;
        this.cost=cost;
        this.seats=seats;
        this.techLvl=techLvl;
    }
}
