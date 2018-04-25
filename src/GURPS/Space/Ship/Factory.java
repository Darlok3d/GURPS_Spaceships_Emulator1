package GURPS.Space.Ship;

public class Factory extends ShipPart {
    String typeName;
    byte type;
    int productMoney;
    double productVolume;

    public Factory (byte type, String typeName, int size, long cost, int productMoney, double productVolume, int workspace, int techLvl) {
        this.type=type;
        this.typeName=typeName;
        this.size=size;
        this.cost=cost;
        this.productMoney=productMoney;
        this.productVolume=productVolume;
        this.workspace=workspace;
        this.techLvl=techLvl;
    }

}
