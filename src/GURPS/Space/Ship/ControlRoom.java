package GURPS.Space.Ship;

public class ControlRoom extends ShipPart {
    int complexity;
    int sensors;
    int controlStations;

    public ControlRoom (int size, long cost, int complexity, int sensors, int controlStations, int workspace, int techLvl) {
        this.size=size;
        this.cost=cost;
        this.complexity=complexity;
        this.sensors=sensors;
        this.controlStations=controlStations;
        this.workspace=workspace;
        this.techLvl=techLvl;
    }
}
