package GURPS.Space.Ship;

public class ElecRockEngine extends Engine {

    boolean highEnergy = true;

    public ElecRockEngine (int size, long cost, byte type, String name, double acceleration, double deltaV, short fuelType, int workspace, int techLvl) {
        this.size=size;
        this.cost=cost;
        this.type=type;
        this.name=name;
        this.acceleration=acceleration;
        this.deltaV=deltaV;
        this.fuelType=fuelType;
        this.workspace=workspace;
        this.techLvl=techLvl;
    }
}
