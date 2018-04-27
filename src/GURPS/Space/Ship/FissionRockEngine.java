package GURPS.Space.Ship;

public class FissionRockEngine extends Engine {

    public FissionRockEngine (int size, long cost, byte type, String name, boolean violate, double acceleration, double deltaV, short fuelType, int workspace, int techLvl) {
        this.size=size;
        this.cost=cost;
        this.type=type;
        this.name=name;
        this.violate=violate;
        this.acceleration=acceleration;
        this.deltaV=deltaV;
        this.fuelType=fuelType;
        this.workspace=workspace;
        this.techLvl=techLvl;
    }
}
