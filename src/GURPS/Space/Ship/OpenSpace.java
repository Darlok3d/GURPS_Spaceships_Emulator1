package GURPS.Space.Ship;

public class OpenSpace extends ShipPart {
    int slots;
    boolean farm;
    String name;

    public OpenSpace (int size, String name, boolean farm, long cost, int slots, int workspace, int techLvl) {
        this.size=size;
        this.name=name;
        this.farm=farm;
        this.cost=cost;
        this.slots=slots;
        this.workspace=workspace;
        this.techLvl=techLvl;
    }
}
