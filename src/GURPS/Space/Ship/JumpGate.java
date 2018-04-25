package GURPS.Space.Ship;

public class JumpGate extends ShipPart {
    int tonnage;

    public JumpGate(int size, long cost, int tonnage, int workspace, int techLvl) {
        this.size=size;
        this.cost=cost;
        this.tonnage = tonnage;
        this.workspace=workspace;
        this.techLvl=techLvl;
    }
}
