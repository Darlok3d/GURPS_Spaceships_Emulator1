package GURPS.Space.Ship;

public class Ramscoop extends ShipPart {

    public Ramscoop (int size, long cost, int workspace, int techLvl) {
        this.size=size;
        this.cost=cost*1000;
        this.workspace=workspace;
        this.techLvl=techLvl;
    }
}
