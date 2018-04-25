package GURPS.Space.Ship;

import java.util.ArrayList;

public class CargoHold extends ShipPart {
    double standardCap;
    double standardCapFree;
    double shieldCap;
    double shieldCapFree;
    double refShieldCap;
    double refShieldCapFree;
    double refCap;
    double refCapFree;
    ArrayList<Cargo> cargoStandard;
    ArrayList<Cargo> cargoShield;
    ArrayList<Cargo> cargoRefShield;
    ArrayList<Cargo> cargoRef;

    public CargoHold (int size, double standardCap, double shieldCap, double refShieldCap, double refCap, int techLvl) {
        this.size=size;
        this.standardCap=standardCap;
        this.shieldCap=shieldCap;
        this.refShieldCap=refShieldCap;
        this.refCap=refCap;
        this.cost=(long)((refCap*500)+(refShieldCap*4250)+(shieldCap*4000));
        this.cargoStandard=new ArrayList<>((int)standardCap);
        this.cargoShield=new ArrayList<>((int)shieldCap);
        this.cargoRefShield=new ArrayList<>((int)refShieldCap);
        this.cargoRef=new ArrayList<>((int)refCap);
        this.techLvl=techLvl;
    }

    public void loadCargo (Cargo cargo, byte loadType) {
        if (loadType==0) {
            if (standardCapFree<cargo.mass)
                return;
            else {
                cargoStandard.add(cargo);
                standardCapFree=standardCapFree-cargo.mass;
            }
        }

        if (loadType==1) {
            if (shieldCapFree<cargo.mass)
                return;
            else {
                cargoShield.add(cargo);
                shieldCapFree=shieldCapFree-cargo.mass;
            }
        }

        if (loadType==2) {
            if (refShieldCapFree<cargo.mass)
                return;
            else {
                cargoRefShield.add(cargo);
                refShieldCapFree=refShieldCapFree-cargo.mass;
            }
        }

        if (loadType==3) {
            if (refCapFree<cargo.mass)
                return;
            else {
                cargoRef.add(cargo);
                refCapFree=refCapFree-cargo.mass;
            }
        }
    }

}

class Cargo {
    double mass;
    String name;
    boolean violate;
}
