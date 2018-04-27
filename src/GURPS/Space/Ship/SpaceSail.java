package GURPS.Space.Ship;

public class SpaceSail extends Engine {
    short fuelType = 14;

    public SpaceSail (int size, long cost, byte type, String name, double acceleration, int workspace, int techLvl) {
        this.size=size;
        this.cost=cost;
        this.type=type;
        this.name=name;
        this.acceleration=acceleration;
        this.workspace=workspace;
        this.techLvl=techLvl;
    }
}
