package solid.isp.compliant;

public class BookTrip implements IBookCarRental, IBookFlight, IBookHotel{

    @Override
    public void bookFlight() {
        // Code to book a flight    
        System.out.println("Booking flight...");
    }

    @Override
    public void bookHotel() {
        // Code to book a hotel
        System.out.println("Booking hotel...");
    }

    @Override
    public void bookCarRental() {
        // Code to book a car rental
        System.out.println("Booking car rental...");
    }
    
}
