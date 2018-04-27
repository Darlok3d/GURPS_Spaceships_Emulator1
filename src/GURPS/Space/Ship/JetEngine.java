package GURPS.Space.Ship;

public class JetEngine extends ShipPart {
    int acceleration = 1;
    short fuelType = 6;

    public JetEngine (int size, long cost, int workspace, int techLvl) {
        this.size=size;
        this.cost=cost;
        this.workspace=workspace;
        this.techLvl=techLvl;
    }
}
