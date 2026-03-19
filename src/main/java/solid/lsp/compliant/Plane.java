package solid.lsp.compliant;

public class Plane implements IPlane{
    
    private int gear;

    Plane(){
        this.gear = 0;
    }

    @Override
	public int changeGear(int n) {
		this.gear = n;
		return this.gear;
	}

    @Override
	public void accelerate() {
		//do something to accelerate the plane
		 System.out.println("Plane is accelerating");
	}

    @Override
	public void takeoff() {
		//do something to takeoff the plane
		 System.out.println("Plane is taking off");
		
	}

    @Override
	public void land() {
		//do something to land the plane
		 System.out.println("Plane is landing");
		
	}

}
