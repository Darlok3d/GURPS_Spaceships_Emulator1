package GURPS.Space.Ship;

import java.util.HashSet;

abstract class ShipPart {

    boolean isDisabled = false;
    boolean isDestroyed = false;
    boolean highEnergy = false;
    boolean violate = false;
    short hitpoints;
    HashSet<Crewman> occupied;
    int size, techLvl;
    int workspace;
    long cost;
    String description;


}



