package GURPS.Space.Ship;

import java.util.HashSet;

public class HangarBay extends ShipPart {
    int capacity;
    int launchRate;
    HashSet<Ship> ships;

    public HangarBay (int size, long cost, int capacity, int launchRate, int workspace, int techLvl) {
        this.size=size;
        this.cost=cost;
        this.capacity=capacity;
        this.launchRate=launchRate;
        this.workspace=workspace;
        this.techLvl=techLvl;
    }

    public void launchShip (Ship ship) {
        this.ships.remove(ship);
    }

    public void dockShip (Ship ship) {
        this.ships.add(ship);
    }
}
