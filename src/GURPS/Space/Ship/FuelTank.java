package GURPS.Space.Ship;

public class FuelTank extends ShipPart {
    double maxCap;
    double fuelLeft;
    byte fuelType;
    String fuelTypeName;
    int deltaV;

    public FuelTank(int size, long cost, double maxCap, int techLvl) {
        this.size=size;
        this.cost=cost;
        this.maxCap = maxCap;
        this.techLvl=techLvl;
    }
}
