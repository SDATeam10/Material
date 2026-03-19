package solid.ocp.compliant;

public class DrivingMode implements DriverModeInterface{
    protected int power;
    protected int suspensionHeight;

    public DrivingMode(int p, int sh){
        this.power = p;
        this.suspensionHeight = sh;
    }

    public void setMode(Vehicle v){
        v.setPower(this.power);
        v.setSuspensionHeight(this.suspensionHeight);
    }
}
