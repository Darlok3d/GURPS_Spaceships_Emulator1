package GURPS.Space.Ship;

public class ForceScreen extends ShipPart {
    int dDR;
    boolean highEnergy=true;
    byte type;
    String typeName;
    boolean overCharge=false;

    public ForceScreen (int size, byte type, String typeName, long cost, int dDR, int workspace, int techLvl) {
        this.size=size;
        this.type=type;
        this.typeName=typeName;
        this.cost=cost;
        this.dDR=dDR;
        this.workspace=workspace;
        this.techLvl=techLvl;
    }
}
