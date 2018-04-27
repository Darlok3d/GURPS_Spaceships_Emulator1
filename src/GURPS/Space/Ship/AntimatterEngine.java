package GURPS.Space.Ship;

public class AntimatterEngine extends Engine {

    public AntimatterEngine (int size, long cost, byte type, String name, double acceleration, double deltaV, short fuelType, int workspace, int techLvl) {
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
