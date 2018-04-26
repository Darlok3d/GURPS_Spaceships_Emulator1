package GURPS.Space.Ship;

import java.util.HashMap;
import java.util.Map;

public class PartConstructor {  //Singleton
    private static HashMap<String, HashMap<Integer, Attributes>> armorMap;
    private static HashMap<Integer, Double> cargoHoldMap;
    private static HashMap<Integer, Attributes> cloakDevMap;
    private static HashMap<Integer, Attributes> contGravLiftMap;
    private static HashMap<Integer, Attributes> contRoomMap;
    private static HashMap<Integer, Attributes> defECMMap;
    private static HashMap<Integer, Attributes> engRoomMap;
    private static HashMap<Integer, Attributes> enhSensArrMap;
    private static HashMap<Integer, Long> extClampMap;
    private static HashMap<Integer, Attributes> factMap;
    private static HashMap<Integer, Attributes> forceScrLightMap;
    private static HashMap<Integer, Attributes> forceScrHeavyMap;
    private static HashMap<Integer, Attributes> fuelTankMap;
    private static HashMap<Integer, Attributes> habMap;
    private static HashMap<Integer, Attributes> hangarMap;
    private static HashMap<Integer, Attributes> jetEngMap;
    private static HashMap<Integer, Attributes> jumpGateMap;
    private static HashMap<Integer, Attributes> minRefMap;
    private static HashMap<Integer, Attributes> openSpMap;
    private static HashMap<Integer, Attributes> pasSeatMap;
    private static HashMap<Integer, Attributes> chemPowMap;
    private static HashMap<Integer, Attributes> reactorMap;
    private static HashMap<Integer, Attributes> ramscoopMap;
    private static HashMap<Integer, Attributes> chemRockMap;
    private static HashMap<Integer, Attributes> elecRockMap;
    private static HashMap<Integer, Attributes> fissRockMap;
    private static HashMap<Integer, Attributes> nuclPulseMap;
    private static HashMap<Integer, Attributes> fusRockMap;
    private static HashMap<Integer, Attributes> antimatterEngineMap;
    private static HashMap<Integer, Attributes> reactionlessEngineMap;
    private static HashMap<Integer, Attributes> robotArmMap;
    private static HashMap<Integer, Attributes> softLandMap;

    private static HashMap<String, String> descriptionMap = new HashMap<>();


    public PartConstructor() {
        int[] modernSM = {5,6,7,8,9,10,11,12,13,14,15};

        /*ARMOR TABLES*/

        armorMap = new HashMap<>(10);;
        /*Ice Armor*/
        String iceDescription =
                        "This is armor made from frozen water. It may be used to\n" +
                        "represent spacecraft built from hollowed-out comets or Kuiper\n" +
                        "Belt objects, although ice is sometimes added atop other\n" +
                        "armor as cheap shielding for space stations. Ice armor systems\n" +
                        "provide semi-ablative dDR that protects the hull section\n" +
                        "it is installed in. Ice armor is not available for SM+5 to\n" +
                        "SM+7 hulls, nor for streamlined hulls. Cost is negligible.";
        int[] iceSM = {8,9,10,11,12,13,14,15};
        long[] iceCost = {0,0,0,0,0,0,0,0};
        Integer[] iceDR = {1,2,2,3,5,7,10,15};
        armorMap.put("ArmIce",mapFill(iceSM, iceCost, iceDR));
        descriptionMap.put("ArmIce", iceDescription);

        /*Stone Armor*/
        String stoneDescription =
                        "This is rock armor for vessels that are hollowed-out asteroids,\n" +
                        "or covered with a layer of rock or slag. Stone dDR is semiablative.\n" +
                        "It is unavailable for SM+5-6 hulls, or for streamlined hulls.\n" +
                        "Cost is negligible.";
        int[] stoneSM = {7,8,9,10,11,12,13,14,15};
        long[] stoneCost = {0,0,0,0,0,0,0,0,0};
        Integer[] stoneDR = {1,2,2,3,5,7,10,15,20};
        armorMap.put("ArmStone",mapFill(stoneSM, stoneCost, stoneDR));
        descriptionMap.put("ArmStone", stoneDescription);

        /*Steel Armor*/
        String steelDescription =
                        "This is armor made of high-quality steel plate. It is common\n" +
                        "due to its low cost.";
        long[] steelCost = {6,20,60,200,600,2000,6000,20000,60000,200000,600000};
        Integer[] steelUSDR = {1,2,3,5,7,10,15,20,30,50,70};
        Integer[] steelSLDR = {0,1,2,3,5,7,10,15,20,30,50};
        armorMap.put("ArmSteelUS",mapFill(modernSM, steelCost, steelUSDR));
        armorMap.put("ArmSteelSL",mapFill(modernSM, steelCost, steelSLDR));
        descriptionMap.put("ArmSteelUS", steelDescription);
        descriptionMap.put("ArmSteelSL", steelDescription);

        /*Light Alloy Armor*/
        String lightAllDescription =
                        "This is armor made of aerospace-grade aluminum or titanium alloys.";
        long[] lightAllCost = {15,50,150,500,1500,5000,15000,50000,150000,500000,1500000};
        Integer[] lightAllUSDR = {2,3,5,7,10,15,20,30,50,70,100};
        Integer[] lightAllSLDR = {1,2,3,5,7,10,15,20,30,50,70};
        armorMap.put("ArmLightAllUS",mapFill(modernSM, lightAllCost, lightAllUSDR));
        armorMap.put("ArmLightAllSL",mapFill(modernSM, lightAllCost, lightAllSLDR));
        descriptionMap.put("ArmLightAllUS", lightAllDescription);
        descriptionMap.put("ArmLightAllSL", lightAllDescription);

        /*Metallic Laminate Armor*/
        String metLamDescription =
                        "This is titanium, aluminum, beryllium, or ultra-hard steel alloy\n" +
                        "further reinforced by the addition of carbon fibers, ceramic\n" +
                        "fibers, or intermetallic laminates.";
        long[] metLamCost = {30,100,300,1000,3000,10000,30000,100000,300000,1000000,3000000};
        Integer[] metLamUSDR = {3,5,7,10,15,20,30,50,70,100,150};
        Integer[] metLamSLDR = {2,3,5,7,10,15,20,30,50,70,100};
        armorMap.put("ArmMetLamUS",mapFill(modernSM, metLamCost, metLamUSDR));
        armorMap.put("ArmMetLamSL",mapFill(modernSM, metLamCost, metLamSLDR));
        descriptionMap.put("ArmMetLamUS", metLamDescription);
        descriptionMap.put("ArmMetLamSL", metLamDescription);

        /*Advanced Metallic Laminate Armor*/
        String advMetLamDescription =
                        "This is armor similar to metallic laminate, but the alloy is reinforced\n" +
                        "through the addition of super-strong carbon nanotubes, boron nanotubes,\n" +
                        "or diamond whiskers.";
        long[] advMetLamCost = {60,200,600,2000,6000,20000,60000,200000,600000,2000000,6000000};
        Integer[] advMetLamUSDR = {5,7,10,15,20,30,50,70,100,150,200};
        Integer[] advMetLamSLDR = {3,5,7,10,15,20,30,50,70,100,150};
        armorMap.put("ArmAdvMetLamUS",mapFill(modernSM, advMetLamCost, advMetLamUSDR));
        armorMap.put("ArmAdvMetLamSL",mapFill(modernSM, advMetLamCost, advMetLamSLDR));
        descriptionMap.put("ArmAdvMetLamUS", advMetLamDescription);
        descriptionMap.put("ArmAdvMetLamSL", advMetLamDescription);

        /*Nanocomposite Armor*/
        String nanoDescription =
                        "This armor uses ultra-strength carbon or boron nanotube-reinforced polymers.\n" +
                        "It can also represent biotech hulls far stronger than the organic hull.";
        long[] nanoCost = {150,500,1500,5000,15000,50000,150000,500000,1500000,5000000,15000000};
        Integer[] nanoUSDR = {7,10,15,20,30,50,70,100,150,200,300};
        Integer[] nanoSLDR = {5,7,10,15,20,30,50,70,100,150,200};
        armorMap.put("ArmNanocompUS",mapFill(modernSM, nanoCost, nanoUSDR));
        armorMap.put("ArmNanocompSL",mapFill(modernSM, nanoCost, nanoSLDR));
        descriptionMap.put("ArmNanocompUS", nanoDescription);
        descriptionMap.put("ArmNanocompSL", nanoDescription);

        /*Organic Armor*/
        String organicDescription =
                        "This is low-cost armor made of advanced biotech materials (space-adapted wood or living tissue,\n" +
                        "living bioplastic, etc.) Use this for spacecraft with living or high-biotech wood hulls.\n" +
                        "DR is halved (round down) against burning or corrosion damage. TL11 if engineered or manufactured\n" +
                        "rather than found (e.g., the body or wood of a space life form).";
        long[] organicCost = {10,30,100,300,1000,3000,10000,30000,100000,300000,1000000};
        Integer[] organicUSDR = {2,3,5,7,10,15,20,30,50,70,100};
        Integer[] organicSLDR = {1,2,3,5,7,10,15,20,30,50,70};
        armorMap.put("OrganicArmUS",mapFill(modernSM, organicCost, organicUSDR));
        armorMap.put("OrganicArmSL",mapFill(modernSM, organicCost, organicSLDR));
        descriptionMap.put("OrganicArmUS", organicDescription);
        descriptionMap.put("OrganicArmSL", organicDescription);

        /*Diamondoid Armor*/
        String diamondDescription =
                        "This armor system uses super-hard nano-fabricated materials such as diamondoid, ultra-hard \n" +
                        "fullerites,or cubic boron nitride. Can also represent exotic superscience “crystal” armors";
        long[] diamondCost = {300,1000,3000,10000,30000,100000,300000,1000000,3000000,10000000,30000000};
        Integer[] diamondUSDR = {10,15,20,30,50,70,100,150,200,300,500};
        Integer[] diamondSLDR = {7,10,15,20,30,50,70,100,150,200,300};
        armorMap.put("ArmDiamondUS",mapFill(modernSM, diamondCost, diamondUSDR));
        armorMap.put("ArmDiamondSL",mapFill(modernSM, diamondCost, diamondSLDR));
        descriptionMap.put("ArmDiamondUS", diamondDescription);
        descriptionMap.put("ArmDiamondSL", diamondDescription);

        /*Exotic Laminate Armor*/
        String exoticDescription =
                        "Tougher armor than diamondoid, usually a complex laminate of ultra-hard materials\n" +
                        "and high-density exotic matter.";
        long[] exoticCost = {600,2000,6000,20000,60000,200000,600000,2000000,6000000,20000000,60000000};
        Integer[] exoticLamUSDR = {15,20,30,50,70,100,150,200,300,500,700};
        Integer[] exoticLamSLDR = {10,15,20,30,50,70,100,150,200,300,500};
        armorMap.put("ArmExoticUS",mapFill(modernSM, exoticCost, exoticLamUSDR));
        armorMap.put("ArmExoticSL",mapFill(modernSM, exoticCost, exoticLamSLDR));
        descriptionMap.put("ArmExoticUS", exoticDescription);
        descriptionMap.put("ArmExoticSL", exoticDescription);

        /*CARGO HOLD TABLE*/
        cargoHoldMap = new HashMap<>(11);
        double[] cargoHoldCap = {1.5,5.0,15.0,50.0,150.0,500.0,1500.0,5000.0,15000.0,50000.0,150000.0};
        for (int j=0; j<modernSM.length; j++)
            cargoHoldMap.put(modernSM[j], cargoHoldCap[j]);

        /*CLOAKING DEVICE TABLE*/
        long[] clDevCost = {1,3,10,30,100,300,1000,3000,10000,30000,100000};  //cost in million of credits
        Integer[] clDevWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        cloakDevMap = mapFill(modernSM, clDevCost, clDevWorkSp);

        /*CONTRAGRAVITY LIFTER TABLE*/
        long[] contGravLiftCost = {300,1000,3000,10000,30000,100000,300000,1000000,3000000,10000000,30000000};
        Integer[] contGravLiftWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        contGravLiftMap = mapFill(modernSM, contGravLiftCost, contGravLiftWorkSp);

        /*CONTROL ROOM TABLE*/
        long[] contRoomCost = {60,200,600,2000,6000,20000,60000,200000,600000,2000000,6000000};
        Integer[] contRoomCompl = {6,7,7,8,8,9,9,10,10,11,11};
        Integer[] contRoomSens = {-6,-5,-4,-3,-2,-1,0,1,2,3,4};
        Integer[] contRoomContStations = {1,2,3,4,6,10,15,20,30,40,60};
        Integer[] contRoomWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        contRoomMap = mapFill(modernSM, contRoomCost, contRoomCompl, contRoomSens, contRoomContStations, contRoomWorkSp);

        /*DEFENSIVE ECM TABLE*/
        long[] defECMCost = {300,1000,3000,10000,30000,100000,300000,1000000,3000000,10000000,30000000};
        Integer[] defECMWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        defECMMap = mapFill(modernSM, defECMCost, defECMWorkSp);

        /*ENGINE ROOM TABLE*/
        int[] engRoomSize = {5,6,7,8,9};
        long[] engRoomCost = {15,30,100,300,1000};
        Integer[] engRoomWorkSp = {1,1,1,1,2};
        engRoomMap = mapFill(engRoomSize, engRoomCost, engRoomWorkSp);

        /*ENHANCED SENSOR ARRAY TABLE*/
        long[] enhSenArrCost = {60,200,600,2000,6000,20000,60000,200000,600000,2000000,6000000};
        Integer[] enhSenArrLevel = {-4,-3,-2,-1,0,1,2,3,4,5,6};
        Integer[] enhSenArrWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        enhSensArrMap = mapFill(modernSM, enhSenArrCost, enhSenArrLevel, enhSenArrWorkSp);

        /*EXTERNAL CLAMP TABLE*/
        extClampMap = new HashMap<>(11);
        long[] extClampCost = {3,10,30,100,300,1000,3000,10000,30000,100000,300000};
        for (int j=0; j<modernSM.length; j++)
            extClampMap.put(modernSM[j], extClampCost[j]);

        /*FACTORY TABLE*/
        int[] factSM = {6,7,8,9,10,11,12,13,14,15};
        long[] factCost = {5,15,50,150,500,1500,5000,15000,50000,150000};  //cost in millions credits
        Integer[] factProdMon = {5,15,50,150,500,1500,5000,15000,50000,150000};
        Integer[] factProdVol = {1,3,10,30,100,300,1000,3000,10000,30000}; //2x value
        Integer[] factWorkSp = {0,0,0,0,1,3,10,30,100,300};
        factMap=mapFill(factSM, factCost, factProdMon, factProdVol, factWorkSp);

        /*FORCE SCREEN TABLE*/
        long[] forceScrLightCost = {500,1500,5000,15000,50000,150000,500000,1500000,5000000,15000000,50000000};
        long[] forceScrHeavyCost = {1500,5000,15000,50000,150000,500000,1500000,5000000,15000000,50000000,150000000};
        Integer[] dDR1 = {20,30,50,70,100,150,250,350,500,700,1000};
        Integer[] dDR2 = {30,50,70,100,150,250,350,500,700,1000,1500};
        Integer[] forceScreenWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        forceScrLightMap=mapFill(modernSM, forceScrLightCost, dDR1, dDR2, forceScreenWorkSp);
        forceScrHeavyMap=mapFill(modernSM, forceScrHeavyCost, dDR1, dDR2, forceScreenWorkSp);

        /*FUEL TANK TABLE*/

        long[] fuelTankCost = {10,30,100,300,1000,3000,10000,30000,100000,300000,1000000};
        Double[] fuelTankCap = {1.5,5.0,15.0,50.0,150.0,500.0,1500.0,5000.0,15000.0,50000.0,150000.0};
        fuelTankMap = mapFill(modernSM, fuelTankCost, fuelTankCap);


        /*HABITAT TABLE*/
        int[] habSM = {6,7,8,9,10,11,12,13,14,15};
        long[] habCost = {100,300,1000,3000,10000,30000,100000,300000,1000000,3000000};
        Integer[] habSlots = {1,2,6,20,60,200,600,2000,6000,20000};
        Integer[] habWorkSp = {0,0,0,0,1,3,10,30,100,300};
        habMap = mapFill(habSM, habCost, habSlots, habWorkSp);

        /*HANGAR BAY TABLE*/
        long[] hangarCost = {3,10,30,100,300,1000,3000,10000,30000,100000,300000};
        Integer[] hangarCap = {1,3,10,30,100,300,1000,3000,10000,30000,100000};
        Integer[] hangarLaunchRate = {1,3,10,20,50,100,200,500,1000,2000,5000};
        Integer[] hangarWorksSp = {0,0,0,0,0,1,3,10,30,100,300};
        hangarMap=mapFill(modernSM, hangarCost, hangarCap, hangarLaunchRate, hangarWorksSp);

        /*JET ENGINE TABLE*/
        long[] jetEngCost = {300,1000,3000,10000,30000,100000,300000,1000000,3000000,100000000,30000000};
        Integer[] jetEngWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        jetEngMap = mapFill(modernSM, jetEngCost, jetEngWorkSp);

        /*JUMP GATE MAP*/
        int[] jumpGateSM = {9,10,11,12,13,14,15};
        long[] jumpGateCost = {150,500,1500,5000,15000,50000,150000,500000};  //cost in millions credits
        Integer[] jumpGateTonnage = {100,300,1000,3000,10000,30000,100000};
        Integer[] jumpGateWorkSp = {1,1,3,10,30,100,300};
        jumpGateMap = mapFill(jumpGateSM, jumpGateCost, jumpGateTonnage, jumpGateWorkSp);

        /*MINING AND REFINERY TABLE*/
        long[] minRefCost = {30,100,300,1000,3000,10000,30000,100000,300000,1000000,3000000};
        Double[] minRefMin = {0.15,0.5,1.5,5.0,15.0,50.0,150.0,500.0,1500.0,5000.0,15000.0};
        Double[] minRefRef = {0.5,1.5,5.0,15.0,50.0,150.0,500.0,1500.0,5000.0,15000.0,50000.0};
        Integer[] minRefWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        minRefMap = mapFill(modernSM, minRefCost, minRefMin, minRefRef, minRefWorkSp);

        /*OPEN SPACE TABLE*/
        int[] openSpSM = {8,9,10,11,12,13,14,15};
        long[] openSpCost = {100,200,500,1000,2000,5000,10000,20000};
        Integer[] openSpSlots = {1,2,5,10,20,50,100,200};
        Integer[] openSpWorkSp = {0,0,1,3,10,30,100,300};
        openSpMap = mapFill(openSpSM, openSpCost, openSpSlots, openSpWorkSp);

        /*PASSENGER SEATS TABLE*/
        long[] pasSeatCost = {10,30,100,300,1000,3000,10000,30000,100000,300000,1000000};
        Integer[] pasSeatSeats = {2,6,20,60,200,600,2000,6000,20000,60000,200000};
        pasSeatMap = mapFill(modernSM, pasSeatCost, pasSeatSeats);

        /*CHEMICAL POWER PLANT TABLE*/
        long[] chemPowCost = {15,50,150,500,1500,5000,15000,50000,150000,500000,1500000};
        Integer[] chemPowWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        chemPowMap = mapFill(modernSM, chemPowCost, chemPowWorkSp);

        /*REACTOR POWER PLANT TABLE*/
        long[] reactPowFissionCost = {100,300,1000,3000,10000,30000,100000,300000,1000000,3000000,10000000};
        Integer[] reactPowFusionCost = {300,1000,3000,10000,30000,100000,300000,1000000,3000000,10000000,30000000};
        Integer[] reactPowAntiMatCost = {600,2000,6000,20000,60000,200000,600000,2000000,6000000,20000000,60000000};
        Integer[] reactPowSupFusionCost = {1000,3000,10000,30000,100000,300000,1000000,3000000,10000000,30000000,100000000};
        Integer[] reactPowTotalConvCost = {2000,6000,20000,60000,200000,600000,2000000,6000000,20000000,60000000,200000000};
        Integer[] reactPowWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        reactorMap=mapFill(modernSM, reactPowFissionCost, reactPowFusionCost, reactPowAntiMatCost, reactPowSupFusionCost, reactPowTotalConvCost, reactPowWorkSp);

        /*RAMSCOOP TABLE*/
        long[] ramscoopCost = {3,10,30,100,300,1000,3000,10000,30000,100000,300000};        // cost in millions credits
        Integer[] ramscoopWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        ramscoopMap=mapFill(modernSM, ramscoopCost, ramscoopWorkSp);

        /*CHEMICAL ROCKET ENGINE TABLE*/
        long[] chemRockCost = {60,200,600,2000,6000,20000,60000,200000,600000,2000000,6000000};
        Integer[] chemRockWorkSp  = {0,0,0,0,0,1,3,10,30,100,300};
        chemRockMap=mapFill(modernSM, chemRockCost, chemRockWorkSp);

        /*ELECTRIC ROCKET ENGINE TABLE*/
        long[] elecRockCost = {100,300,1000,3000,10000,30000,100000,300000,1000000,3000000,10000000};
        Integer[] elecRockWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        elecRockMap=mapFill(modernSM, elecRockCost, elecRockWorkSp);

        /*FISSION ROCKET ENGINE TABLE*/
        long[] fissRockCost = {150,500,1500,5000,15000,50000,150000,500000,1500000,5000000,15000000};
        Integer[] fissRockWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        fissRockMap=mapFill(modernSM, fissRockCost, fissRockWorkSp);

        /*NUCLEAR PULSE ROCKET ENGINE TABLE*/
        long[] nuclPulseCost = {300,1000,3000,10000,30000,100000,300000,1000000,3000000,10000000,30000000};
        Integer[] nuclPulseWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        nuclPulseMap=mapFill(modernSM, nuclPulseCost, nuclPulseWorkSp);

        /*FUSION ROCKET ENGINE TABLE*/
        long[] fusRockCost = {300,1000,3000,10000,30000,100000,300000,1000000,3000000,10000000,30000000};
        Integer[] fusRockWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        fusRockMap=mapFill(modernSM, fusRockCost, fusRockWorkSp);

        /*ANTIMATTER AND TOTAL CONVERSION ENGINE TABLE*/
        long[] antimatterEngineCost = {150,500,1500,5000,15000,50000,150000,500000,1500000,5000000,15000000};
        Integer[] antimatterEngineWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        antimatterEngineMap=mapFill(modernSM, antimatterEngineCost, antimatterEngineWorkSp);

        /*REACTIONLESS ENGINE TABLE*/
        long[] rottartyReactLessEngCost = {15,50,150,500,1500,5000,15000,50000,150000,500000,1500000};
        Long[] standartReactLessEngCost = {30L,100L,300L,1000L,3000L,10000L,30000L,100000L,300000L,1000000L,3000000L};
        Long[] hotReactLessEngCost = {100L,300L,1000L,3000L,10000L,30000L,100000L,300000L,1000000L,3000000L,10000000L};
        Long[] superReactLessEngCost = {200L,600L,2000L,6000L,20000L,60000L,200000L,600000L,2000000L,6000000L,20000000L};
        Long[] subwarpReactLessEngCost = {300L,1000L,3000L,10000L,30000L,100000L,300000L,1000000L,3000000L,10000000L,30000000L};
        Integer[] reactionlessEngineWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        reactionlessEngineMap=mapFill(modernSM, rottartyReactLessEngCost, standartReactLessEngCost, hotReactLessEngCost,
                superReactLessEngCost, subwarpReactLessEngCost, reactionlessEngineWorkSp);

        /*ROBOT ARM TABLE*/
        long[] robotArmCost = {300L,1000L,3000L,10000L,30000L,100000L,300000L,1000000L,3000000L,10000000L,30000000L};
        Integer[] robotArmST = {20,30,50,70,100,150,200,300,500,700,1000};
        Integer[] robotArmWorkSp = {0,0,0,0,0,1,3,10,30,100,300};
        robotArmMap=mapFill(modernSM, robotArmCost, robotArmST, robotArmWorkSp);

        /*SOFT-LANDING SYSTEM TABLE*/
        long[] softLandCost = {50,100,200,500,1000,2000,5000,10000,20000,50000,100000};
        softLandMap=mapFill(modernSM, softLandCost);










    }

    public Armor constructArmor (String type, int size, int techLvl) {
        Attributes attributes = armorMap.get(type).get(size);
        int dDR=(int)attributes.getVal1();
        long cost=attributes.getCost();
        String description = descriptionMap.get(type);
        Armor armor = new Armor(type, size, dDR, cost, description, techLvl);
        return armor;
    }

    public CargoHold constructCargoHold (int size, double shieldCap, double refShieldCap, double refCap, int techLvl) {
        double totalCap=cargoHoldMap.get(size);
        if ((totalCap-shieldCap-refShieldCap-refCap)<0)
            return null;
        else {
            double standardCap = totalCap - shieldCap - refShieldCap - refCap;
            return new CargoHold(size, standardCap, shieldCap, refShieldCap, refCap, techLvl);
        }
    }

    public CloakDevice constructCloakDev (int size, int techLvl) {
        Attributes attributes = cloakDevMap.get(size);
        long cost= attributes.getCost();
        int workspace=(int)attributes.getVal1();
        return new CloakDevice(size, cost, workspace, techLvl);
    }

    public ContGravLifter constructContGravLifter (int size, int techLvl) {
        Attributes attributes = contGravLiftMap.get(size);
        long cost= attributes.getCost();
        int workspace=(int) attributes.getVal1();
        return new ContGravLifter(size, cost, workspace, techLvl);
    }

    public ControlRoom constructContRoom (int size, int techLvl) {
        Attributes attributes = contRoomMap.get(size);
        long cost= attributes.getCost();
        int complexity = (int)attributes.getVal1();
        int sensors = (int)attributes.getVal2();
        int contStations = (int)attributes.getVal3();
        int workspace = (int)attributes.getVal4();

        return new ControlRoom(size, cost, complexity, sensors, contStations, workspace, techLvl);
    }

    public DefensiveECM constructDefECM (int size, int techLvl) {
        Attributes attributes = defECMMap.get(size);
        long cost = attributes.getCost();
        int workspace =(int)attributes.getVal1();

        return new DefensiveECM(size, cost, workspace, techLvl);
    }

    public EngineRoom constructEngineRoom (int size, int techLvl) {
        Attributes attributes = engRoomMap.get(size);
        long cost = attributes.getCost();
        int workspace =(int)attributes.getVal1();

        return new EngineRoom(size, cost, workspace, techLvl);
    }

    public EnhSensArray constructEnhSensArray (int size, byte type, int techLvl) {
        Attributes attributes = enhSensArrMap.get(size);
        int sensors = (int)attributes.getVal1();
        int workspace = (int)attributes.getVal2();
        long cost = attributes.getCost();
        if ((type==1)||(type==2)) cost=cost*5;
        else if (type==3) cost=cost*10;

        return new EnhSensArray(size, cost, sensors, workspace, type, techLvl);
    }

    public ExternalClamp constructExtClamp (int size, int techLvl) {
        long cost = extClampMap.get(size);
        return new ExternalClamp(size, cost, techLvl);
    }

    public Factory constructFactory (int size, byte typeNum, int techLvl) {
        Attributes attributes=factMap.get(size);
        String[] factType = {"Fabricator", "Robofac", "Nanofactory", "Replicator"};
        int workspace=(int)attributes.getVal3();
        if (typeNum==0) {
            long cost=(attributes.getCost()*1000);
            int prodMon=(int)attributes.getVal1();
            double prodVol=0;

            return new Factory(typeNum, factType[typeNum], size, cost, prodMon, prodVol, workspace, techLvl);
        }
        if (typeNum==1) {
            long cost=(attributes.getCost()*2000);
            int prodMon=(int)attributes.getVal1()*2;
            double prodVol=0;

            return new Factory(typeNum, factType[typeNum], size, cost, prodMon, prodVol, workspace, techLvl);
        }
        if (typeNum==3) {
            long cost=(attributes.getCost()*4000);
            int prodMon=(int)attributes.getVal1()*20;
            double prodVol=0;

            return new Factory(typeNum, factType[typeNum], size, cost, prodMon, prodVol, workspace, techLvl);
        }
        if (typeNum==4) {
            long cost=(attributes.getCost()*20000);
            int prodMon=0;
            double prodVol=(double)attributes.getVal2()/2;

            return new Factory(typeNum, factType[typeNum], size, cost, prodMon, prodVol, workspace, techLvl);
        }

        return null;
    }

    public ForceScreen constructForceScreen (int size, byte typeNum, int techLvl) {
        String[] forceScreenType = {"Light Force Screen", "Heavy Force Screen"};
        String typeName = forceScreenType[typeNum];
        Attributes attributes;
        if (typeNum==1)
            attributes = forceScrHeavyMap.get(size);
        else
            attributes = forceScrLightMap.get(size);
        int dDR, workspace;
        if (techLvl<12)
            dDR=(int)attributes.getVal1();
        else
            dDR=(int)attributes.getVal2();
        long cost=attributes.getCost();
        workspace=(int)attributes.getVal3();

        return new ForceScreen(size, typeNum, typeName, cost, dDR, workspace, techLvl);
    }

    public FuelTank constructFuelTank (int size, int techLvl) {
        Attributes attributes = fuelTankMap.get(size);
        long cost = attributes.getCost();
        double capacity = (double)attributes.getVal1();

        return new FuelTank(size, cost, capacity, techLvl);
    }

    public Habitat constructHabitat (int size, HashMap <String, HashMap<String, Integer>> rooms, int techLvl) {
        Attributes attributes = habMap.get(size);
        long cost = attributes.getCost();
        if (rooms.containsKey("Lab")) {
            for (Map.Entry<String, Integer> entry : rooms.get("Lab").entrySet()) {
                String key = entry.getKey();
                Integer val = entry.getValue();
                if (key.equals("Physics Lab"))
                    cost=cost+(val*10000);
                else
                    cost=cost+(val*1000);
            }
        }
        if (rooms.containsKey("Sickbay")) {
            if (rooms.get("Sickbay").containsKey("AutoMedbay"))
                cost=cost+(int)(rooms.get("Sickbay").get("AutoMedbay"))*100;
        }
        int slots = (int)attributes.getVal1();
        int workspace = (int)attributes.getVal2();

        return new Habitat(size, rooms, cost, slots, workspace, techLvl);
    }

    public HangarBay constructHangarBay (int size, int techLvl) {
        Attributes attributes = hangarMap.get(size);
        long cost = attributes.getCost();
        int capacity = (int)attributes.getVal1();
        int lauchRate = (int)attributes.getVal2();
        int workspace = (int)attributes.getVal3();

        return new HangarBay(size, cost, capacity, lauchRate, workspace, techLvl);
    }

    public JetEngine constructJetEngine (int size, int techLvl) {
        Attributes attributes = jetEngMap.get(size);
        long cost = attributes.getCost();
        int workspace= (int)attributes.getVal1();
        return new JetEngine(size, cost, workspace, techLvl);
    }

    public JumpGate constructJumpGate (int size, int techLvl) {
        Attributes attributes = jumpGateMap.get(size);
        long cost = attributes.getCost();
        int tonnage = (int)attributes.getVal1();
        int workspace = (int)attributes.getVal2();

        return new JumpGate(size, cost, tonnage, workspace, techLvl);
    }

    public MiningRefinery constructMinRef (int size, boolean type, int techLvl) {
        Attributes attributes = minRefMap.get(size);
        long cost = attributes.getCost();
        double productivity;
        String typeName;
        if (type==true) {
            productivity=(double)attributes.getVal1();
            typeName="Miner";
        }
        else {
            productivity=(double)attributes.getVal2();
            typeName="Refinery";
        }
        int workspace = (int)attributes.getVal3();
        return new MiningRefinery(size, cost, type, typeName, productivity, workspace, techLvl);
    }

    public OpenSpace constructOpenSpace (int size, String name, boolean farm, int techLvl) {
        Attributes attributes = openSpMap.get(size);
        long cost=attributes.getCost();
        int slots=(int)attributes.getVal1();
        int workspace=(int)attributes.getVal2();

        return new OpenSpace(size, name, farm, cost, slots, workspace, techLvl);
    }

    public PassSeats constructPassSeats (int size, int techLvl) {
        Attributes attributes = pasSeatMap.get(size);
        long cost=attributes.getCost();
        int seats=(int)attributes.getVal1();

        return new PassSeats(size, cost, seats, techLvl);
    }

    public ChemPowPlant constructChemPow (int size, byte type, int techLvl) {
        Attributes attributes = chemPowMap.get(size);
        long cost;
        byte power;
        int endurance;
        String name;
        int workspace = (int)attributes.getVal1();
        if (type==0) {
            cost = attributes.getCost();
            name = "Fuel Cell";
            power=1;
            if (techLvl==7)
                endurance=3;
            else if (techLvl==8)
                endurance=6;
            else if (techLvl==9)
                endurance=12;
            else
                endurance=24;

        }
        else {
            cost = attributes.getCost()*2;
            name = "MHD Turbine";
            power=2;
            if (techLvl==9)
                endurance=6;
            else
                endurance=12;
        }

        return new ChemPowPlant(size, cost, name, type, power, endurance, workspace, techLvl);
    }

    public Reactor constructReactor (int size, byte type, byte powProduct, int techLvl) {
        Attributes attributes = reactorMap.get(size);
        long cost;
        String name;
        byte power;
        int endurance;
        boolean derated=false;
        boolean violate=false;
        int workspace=(int)attributes.getVal5();
        if (type==0) {
            name = "Fission Reactor";
            power=1;
            cost=attributes.getCost();
            if (techLvl==8)
                endurance=219000;
            else if (techLvl==9)
                endurance=438000;
            else
                endurance=657000;
        }
        else if (type==1) {
            name = "Fusion Reactor";
            cost=(long)attributes.getVal1();
            if (techLvl==9)
                endurance=438000;
            else if (techLvl==10)
                endurance=1752000;
            else if (techLvl==11)
                endurance=5256000;
            else
                endurance=1314000000;
            if (powProduct==1) {
                power=1;
                derated=true;
                endurance=endurance*2;
            }
            else
                power=2;
        }
        else if (type==2) {
            name = "Antimatter Reactor";
            cost=(long)attributes.getVal2();
            violate=true;
            if (techLvl==10)
                endurance=17520;
            else if (techLvl==11)
                endurance=175200;
            else
                endurance=1752000;
            if (powProduct<4) {
                derated=true;
                cost=cost/100*(25*powProduct);
                endurance=endurance*(100+(25*(4-powProduct)))/100;
                power=powProduct;
            }
            else
                power=4;
        }
        else if (type==3) {
            name = "Super Fusion Reactor";
            cost=(long)attributes.getVal3();
            if (techLvl == 11)
                endurance=3504000;
            else
                endurance=876000000;
            if (powProduct<4) {
                derated=true;
                cost=cost/100*(25*powProduct);
                endurance=endurance*(100+(25*(4-powProduct)))/100;
                power=powProduct;
            }
            else
                power=4;
        }
        else {
            name = "Total Conversion Reactor";
            cost = (long) attributes.getVal4();
            endurance = -1;
            power = 5;
        }

        return new Reactor(size, cost, type, name, violate, derated, power, endurance, workspace, techLvl);
    }

    public Ramscoop constructRamscoop (int size, int techLvl) {
        Attributes attributes=ramscoopMap.get(size);
        long cost=attributes.getCost();
        int workspace=(int)attributes.getVal1();

        return new Ramscoop(size, cost, workspace, techLvl);
    }

    public ChemRockEngine constructChemRockEngine (int size, byte type, int techLvl) {
        Attributes attributes=chemRockMap.get(size);
        String name;
        double acceleration;
        double deltaV;
        byte fuelType;
        boolean violate;
        long cost = attributes.getCost();
        int workspace = (int)attributes.getVal1();
        if (type==0) {
            name = "Chemical Rocket Engine";
            acceleration = 3.0;
            violate = false;
            deltaV = 0.15;
            fuelType = 4;
        }
        else {
            name = "HEDM Chemical Rocket Engine";
            acceleration = 2.0;
            cost=cost*50/100;
            violate = true;
            deltaV = 0.5;
            fuelType = 7;
        }

        return new ChemRockEngine(size, cost, type, name, violate, acceleration, deltaV, fuelType, workspace, techLvl);
    }

    public ElecRockEngine constructElecRockEngine (int size, byte type, int techLvl) {
        Attributes attributes = elecRockMap.get(size);
        long cost = attributes.getCost();
        String name;
        double acceleration;
        double deltaV;
        byte fuelType;
        int workspace = (int)attributes.getVal1();
        if (type==0) {
            name = "Ion Drive";
            acceleration = 0.0005;
            deltaV = 3.0;
            fuelType = 2;
        }
        else if (type==1) {
            name = "Mass Driver Engine";
            acceleration = 0.01;
            deltaV = 0.3;
            fuelType = 3;
        }
        else {
            name = "High Thrust Mass Driver Engine";
            acceleration = 0.02;
            deltaV = 0.15;
            fuelType = 3;
        }

        return new ElecRockEngine(size, cost, type, name, acceleration, deltaV, fuelType, workspace, techLvl);
    }

    public FissionRockEngine constructFissionRockEngine (int size, byte type, int techLvl) {
        Attributes attributes = fissRockMap.get(size);
        long cost = attributes.getCost();
        String name;
        double acceleration;
        double deltaV;
        byte fuelType;
        boolean violate = false;
        int workspace = (int)attributes.getVal1();
        if (type==0) {
            name = "Nuclear Thermal Rocket";
            fuelType = 0;
            if (techLvl==7) {
                acceleration = 0.1;
                deltaV = 0.3;
            }
            else if (techLvl==8) {
                acceleration = 0.2;
                deltaV = 0.3;
            }
            else {
                acceleration = 0.5;
                deltaV = 0.45;
            }
        }
        else if (type==1) {
            name = "Nuclear Light Bulb";
            fuelType = 5;
            deltaV = 0.8;
            if (techLvl==9)
                acceleration = 0.01;
            else
                acceleration = 0.05;
        }
        else {
            name = "Nuclear Saltwater Rocket";
            fuelType = 10;
            acceleration = 2.0;
            deltaV = 2.5;
            violate = true;
        }

        return new FissionRockEngine(size, cost, type, name, violate, acceleration, deltaV, fuelType, workspace, techLvl);
    }

    public NuclPulseRockEngine constructNuclPulseRockEngine (int size, byte type, int techLvl) {
        Attributes attributes = nuclPulseMap.get(size);
        long cost = attributes.getCost();
        String name="";
        double acceleration=0.0;
        double deltaV=0.0;
        byte fuelType=9;
        int workspace = (int)attributes.getVal1();
        if (type==0) {
            name = "Orion Drive";
            acceleration = 2.0;
            if (techLvl==7)
                deltaV=2;
            else if (techLvl==8)
                deltaV=3;
            else if (techLvl==9)
                deltaV=4;
            else
                deltaV=8;
        }
        else if (type==2) {
            name = "Fusion Pulse Drive";
            if (techLvl==9) {
                acceleration=0.01;
                deltaV=5;
            }
            else if (techLvl==10) {
                acceleration=0.05;
                deltaV=10;

            }
            else {
                acceleration=0.05;
                deltaV=40;
            }
        }
        else if (type==4) {
            name = "Advanced Fusion Pulse Drive";
            acceleration=0.005;
            cost=cost*2;
            if (techLvl==9)
                deltaV=20;
            else if (techLvl==10)
                deltaV=100;
            else
                deltaV=350;
        }
        else if (type==6) {
            name = "Super Fusion Pulse Drive";
            deltaV=350;
            cost=cost*4;
            if (techLvl==11)
                acceleration=20;
            else
                acceleration=100;
        }
        if ((type==1)||(type==3)||(type==5)||(type==7)) {
            name="High Thrust "+name;
            acceleration=acceleration*2;
            deltaV=deltaV/2;
        }

        return new NuclPulseRockEngine(size, cost, type, name, acceleration, deltaV, fuelType, workspace, techLvl);
    }

    public FusionRockEngine constructFusionRockEngine (int size, byte type, int techLvl) {
        Attributes attributes=fusRockMap.get(size);
        long cost = attributes.getCost();
        int workspace = (int)attributes.getVal1();
        String name="";
        double acceleration=0.0;
        double deltaV=0.0;
        byte fuelType=0;
        if (type==0) {
            name = "Fusion Rocket";
            acceleration=0.005;
            if (techLvl==9)
                deltaV=12;
            else if (techLvl==10)
                deltaV=60;
            else if (techLvl==11)
                deltaV=180;
            else
                deltaV=450;
        }
        else if (type==2) {
            name = "Fusion Torch";
            acceleration = 0.5;
            cost=cost*2;
            if (techLvl==10)
                deltaV=15;
            else if (techLvl==11)
                deltaV=45;
            else
                deltaV=150;
        }
        else if (type==4) {
            name = "Super Fusion Torch";
            acceleration = 50;
            deltaV = 450;
        }
        if ((type==1)||(type==3)||(type==5)||(type==7)) {
            name="High Thrust "+name;
            acceleration=acceleration*2;
            deltaV=deltaV/2;
        }

        return new FusionRockEngine(size, cost, type, name, acceleration, deltaV, fuelType, workspace, techLvl);
    }

    public AntimatterEngine constructAntimatterEngine (int size, byte type, int techLvl) {
        Attributes attributes = antimatterEngineMap.get(size);
        long cost = attributes.getCost();
        int workspace = (int)attributes.getVal1();
        String name;
        double acceleration;
        double deltaV;
        byte fuelType;
        if (type==0) {
            name = "Antimatter Thermal Rocket";
            fuelType = 8;
            deltaV = 1.8;
            if (techLvl==9)
                acceleration=0.1;
            else if (techLvl==10)
                acceleration=0.2;
            else
                acceleration=0.4;
        }
        else if (type==1) {
            name = "Antimatter Plasma Rocket";
            fuelType = 11;
            acceleration=0.01;
            if (techLvl==10)
                deltaV=120;
            else
                deltaV=360;
        }
        else if (type==2) {
            name = "Antimatter Plasma Torch";
            fuelType = 11;
            acceleration=1;
            if (techLvl==10)
                deltaV=120;
            else
                deltaV=360;
        }
        else if (type==3) {
            name = "Super Antimatter Plasma Torch";
            fuelType = 11;
            acceleration = 100;
            deltaV = 360;
        }
        else if (type==4) {
            name = "Antimatter Pion";
            fuelType = 13;
            acceleration = 0.005;
            deltaV = 3400;
        }
        else if (type==5) {
            name = "Antimatter Pion Torch";
            fuelType = 13;
            acceleration = 0.1;
            deltaV = 3400;
        }
        else if (type==6) {
            name = "Total Conversion Torch";
            fuelType = 5;
            acceleration = 1;
            deltaV = 10000;
        }
        else {
            name = "Super Conversion Torch";
            fuelType = 5;
            acceleration = 50;
            deltaV = 10000;
        }
        if ((type==0)||(type==1)||(type==2)||(type==3)) {
            name="High Thrust "+name;
            acceleration=acceleration*2;
            deltaV=deltaV/2;
        }

        return new AntimatterEngine(size, cost, type, name, acceleration, deltaV, fuelType, workspace, techLvl);
    }

    public ReactionlessEngine constructReactionlessEngine (int size, byte type, int techLvl) {
        Attributes attributes = reactionlessEngineMap.get(size);
        String name;
        double acceleration;
        long cost;
        int workspace = (int)attributes.getVal5();
        if (type==0) {
            name="Rotary Reactionless Engine";
            acceleration=0.1;
            cost=attributes.getCost();
        }
        else if (type==1) {
            name="Standard Reactionless Engine";
            cost=(long)attributes.getVal1();
            if (techLvl==10)
                acceleration=0.5;
            else
                acceleration=1;
        }
        else if (type==2) {
            name="Hot Reactionless Engine";
            cost=(long)attributes.getVal2();
            if (techLvl==10)
                acceleration=1;
            else
                acceleration=2;
        }
        else if (type==3) {
            name="Super Reactionless Engine";
            cost=(long)attributes.getVal3();
            if (techLvl==11)
                acceleration=50;
            else
                acceleration=100;
        }
        else {
            name="Subwarp";
            cost=(long)attributes.getVal4();
            acceleration=500;
        }

        return new ReactionlessEngine(size, cost, type, name, acceleration, workspace, techLvl);
    }

    public RobotArm constructRobotArm (int size, int techLvl) {
        Attributes attributes=robotArmMap.get(size);
        long cost=attributes.getCost();
        int sT=(int)attributes.getVal1();
        int workspace=(int)attributes.getVal2();

        return new RobotArm(size, cost, sT, workspace, techLvl);
    }

    public SoftLanding constructSoftLandint (int size, int techLvl) {
        Attributes attributes=softLandMap.get(size);
        long cost = attributes.getCost();

        return new SoftLanding(size, cost, techLvl);
    }






    HashMap<Integer, Attributes> mapFill (int[] sm, long[] cost) {
        HashMap<Integer, Attributes> map = new HashMap<>(11);
        for (int i=0; i<sm.length; i++)
            map.put(sm[i], new Attributes(cost[i]));
        return map;
    }

    <T1>HashMap<Integer, Attributes> mapFill (int[] sm, long[] cost, T1[] val1) {
        HashMap<Integer, Attributes> map = new HashMap<>(11);
        for (int i=0; i<sm.length; i++)
            map.put(sm[i], new Attributes(cost[i], val1[i]));
        return map;
    }

    <T1,T2>HashMap<Integer, Attributes> mapFill (int[] sm, long[] cost, T1[] val1, T2[] val2) {
        HashMap<Integer, Attributes> map = new HashMap<>(11);
        for (int i=0; i<sm.length; i++)
            map.put(sm[i], new Attributes(cost[i], val1[i], val2[i]));
        return map;
    }

    <T1,T2,T3>HashMap<Integer, Attributes> mapFill (int[] sm, long[] cost, T1[] val1, T2[] val2, T3[] val3) {
        HashMap<Integer, Attributes> map = new HashMap<>(11);
        for (int i=0; i<sm.length; i++)
            map.put(sm[i], new Attributes(cost[i], val1[i], val2[i], val3[i]));
        return map;
    }

    <T1,T2,T3,T4>HashMap<Integer, Attributes> mapFill (int[] sm, long[] cost, T1[] val1, T2[] val2, T3[] val3, T4[] val4) {
        HashMap<Integer, Attributes> map = new HashMap<>(11);
        for (int i=0; i<sm.length; i++)
            map.put(sm[i], new Attributes(cost[i], val1[i], val2[i], val3[i], val4[i]));
        return map;
    }

    <T1,T2,T3,T4,T5>HashMap<Integer, Attributes> mapFill (int[] sm, long[] cost, T1[] val1, T2[] val2, T3[] val3, T4[] val4, T5[] val5) {
        HashMap<Integer, Attributes> map = new HashMap<>(11);
        for (int i=0; i<sm.length; i++)
            map.put(sm[i], new Attributes(cost[i], val1[i], val2[i], val3[i], val4[i], val5[i]));
        return map;
    }


}
