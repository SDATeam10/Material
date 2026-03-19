package solid.lsp.compliant;

public class Car implements ICar{

    private int gear;
	private boolean passengerAirBagOn;

    Car() {
		this.gear = 0;
		this.passengerAirBagOn = false;
	}

    @Override
	public int changeGear(int n) {
		this.gear = n;
		return this.gear;
	}

    @Override
	public void accelerate() {
		//do something to accelerate the car
		 System.out.println("Car is accelerating");
	}

    @Override
	public void switchPassengerAirBag(boolean on) {
		this.passengerAirBagOn = on;
		System.out.println("Passenger AirBag is " + (this.passengerAirBagOn ? "ON" : "OFF"));
	}
}
