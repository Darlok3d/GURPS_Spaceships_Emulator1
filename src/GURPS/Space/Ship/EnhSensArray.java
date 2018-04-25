package GURPS.Space.Ship;

public class EnhSensArray extends ShipPart {
    byte type;
    int sensors;

    public EnhSensArray (int size, long cost, int sensors, int workspace, byte type, int techLvl) {
        this.size = size;
        this.cost = cost;
        this.sensors = sensors;
        this.workspace = workspace;
        this.type = type;
        this.techLvl=techLvl;
    }
}
