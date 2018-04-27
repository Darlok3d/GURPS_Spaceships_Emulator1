package GURPS.Space.Ship;

public class StarDrive extends ShipPart {
    boolean highEnergy = true;
    byte type;
    String name;
    byte ftlRating;

    public StarDrive (int size, long cost, byte type, String name, byte ftlRating, int workspace, int techLvl) {
        this.size=size;
        this.cost=cost;
        this.type=type;
        this.ftlRating=ftlRating;
        this.workspace=workspace;
        this.techLvl=techLvl;
    }
}
