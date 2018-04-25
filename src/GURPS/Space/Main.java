package GURPS.Space;

import GURPS.Space.Ship.Armor;
import GURPS.Space.Ship.PartConstructor;
import GURPS.Space.Ship.*;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here
        PartConstructor constructor = new PartConstructor();
        Armor armor = constructor.constructArmor("ArmSteelUS", 5, 9);
    }
}
