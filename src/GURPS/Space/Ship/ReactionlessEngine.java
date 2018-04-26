package GURPS.Space.Ship;

public class ReactionlessEngine extends Engine {
    byte fuelType = 14;
    boolean highEnergy = true;

    public ReactionlessEngine (int size, long cost, byte type, String name, double acceleration, int workspace, int techLvl) {
        this.size=size;
        this.cost=cost;
        this.type=type;
        this.name=name;
        this.acceleration=acceleration;
        this.workspace=workspace;
        this.techLvl=techLvl;
    }
}
