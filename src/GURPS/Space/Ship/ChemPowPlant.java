package GURPS.Space.Ship;

public class ChemPowPlant extends ShipPart {
    String name;
    byte type;
    byte power;
    int enduranceCap;
    int enduranceLeft;

    public ChemPowPlant (int size, long cost, String name, byte type, byte power, int endurance, int workspace, int techLvl) {
        this.size=size;
        this.cost=cost;
        this.type=type;
        this.name=name;
        this.power=power;
        this.workspace=workspace;
        this.techLvl=techLvl;
        this.enduranceCap=endurance;
        this.enduranceLeft=endurance;
    }
}
