package solid.srp.compliant;

public class RefuelManager {
    
    public static void reFuel(Vehicle v){
        v.setRemainingFuel(v.getMaxFuel());
    }

    public static void reFuel(Vehicle v, int newFuel){
        if (v.getRemainingFuel() + newFuel > v.getMaxFuel())
            v.setRemainingFuel(v.getMaxFuel());
        else
            v.setRemainingFuel(v.getRemainingFuel() + newFuel);
    }
}
