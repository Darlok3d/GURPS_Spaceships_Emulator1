package GURPS.Space.Ship;

public class MiningRefinery extends ShipPart {
    boolean type;
    String typeName;
    double productivity;

    public MiningRefinery (int size, long cost, boolean type, String typeName, double productivity, int workspace, int techLvl) {
        this.size=size;
        this.cost=cost;
        this.type=type;
        this.typeName=typeName;
        this.productivity=productivity;
        this.workspace=workspace;
        this.techLvl=techLvl;
    }
}
