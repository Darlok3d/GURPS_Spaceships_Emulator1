package GURPS.Space.Ship;

public class Armor extends ShipPart {
    String type;
    boolean semiablative;
    int dDR;

    Armor(String type, int size, int dDR, long cost, String description, int techLvl) {
        this.type=type;
        this.size=size;
        this.dDR=dDR;
        this.cost=cost*1000;
        this.description=description;
        this.techLvl=techLvl;
        if ((type.equals("IceArm"))||type.equals("StoneArm"))
            semiablative=true;
    }

}
