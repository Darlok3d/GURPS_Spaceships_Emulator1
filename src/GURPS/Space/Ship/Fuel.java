package GURPS.Space.Ship;

public class Fuel {
    /*
    0  Water
    1  Coolant
    2  Argon
    3  Rock Dust
    4  Rocket Fuel
    5  Hydrogen
    6  Jet Fuel
    7  HEDM
    8  Antimatter-catalyzed hydrogen
    9  Nuclear pellets
    10 Uranium-saltwater
    11 Antimatter-boosted hydrogen
    12 Nuclear bomb pulse units
    13 Antimatter
    */


    static String[] fuelName = {"Water", "Coolant", "Argon", "Rock Dust", "Rocket Fuel", "Hydrogen", "Jet Fuel", "HEDM", "Antimatter-catalyzed hydrogen",
            "Nuclear pellets", "Uranium-saltwater", "Antimatter-boosted hydrogen", "Nuclear bomb pulse units", "Antimatter"};
    static long[] fuelCost = {20, 150, 180, 2, 800, 2000, 4000, 6000, 20000, 50000, 100000, 12000000, 250000, 10000000000000L};

    public String getFuelName (byte type) {
        return fuelName[type];
    }

    public long getFuelCost (byte type) {
        return fuelCost[type];
    }

}
