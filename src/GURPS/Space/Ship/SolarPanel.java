package GURPS.Space.Ship;

public class SolarPanel extends ShipPart {
    byte power = 1;
    boolean retracted;

    public SolarPanel (int size, long cost, int techLvl) {
        this.size=size;
        this.cost=cost;
        this.techLvl=techLvl;
    }
}
