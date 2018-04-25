package GURPS.Space.Ship;

public class Reactor extends ShipPart {
    String name;
    byte type;
    byte power;
    boolean derated;
    int enduranceCap;
    int enduranceLeft;

    public Reactor (int size, long cost, byte type, String name, boolean violate, boolean derated, byte power, int endurance, int workspace, int techLvl) {
        this.size=size;
        this.cost=cost;
        this.type=type;
        this.name=name;
        this.violate=violate;
        this.derated=derated;
        this.power=power;
        this.enduranceCap=endurance;
        this.enduranceLeft=endurance;
    }

}
