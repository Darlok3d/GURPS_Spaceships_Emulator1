package GURPS.Space.Ship;

import java.util.HashMap;

public class Habitat extends ShipPart {
    int roomSlots;
    HashMap<String, HashMap<String, Integer>> rooms;

    public Habitat (int size, HashMap<String, HashMap<String, Integer>> rooms, long cost, int roomSlots, int workspace, int techLvl) {
        this.size=size;
        this.rooms=rooms;
        this.cost=cost;
        this.roomSlots=roomSlots;
        this.workspace=workspace;
        this.techLvl=techLvl;
    }
}
