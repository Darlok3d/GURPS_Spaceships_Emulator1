package GURPS.Space.Ship;

public class RobotArm extends ShipPart {
    int sT;

    public RobotArm (int size, long cost, int sT, int workspace, int techLvl) {
        this.size=size;
        this.cost=cost;
        this.sT=sT;
        this.workspace=workspace;
        this.techLvl=techLvl;
    }
}
