import com.codeclan.example.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Pilot pilot1;
    Pilot pilot2;
    CabinCrewMember leadAttendant;
    CabinCrewMember flightAttendant;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    Passenger passenger5;

    Flight flight;

    @Before
    public void before() {
        flight = new Flight("FR756", "EDI", "MAD", "5:45", 2000, 6);
        pilot1 = new Pilot("Roberto", Rank.CAPTAIN, "1234567P");
        pilot2 = new Pilot("Morag", Rank.CAPTAIN, "1234567H");
        leadAttendant = new CabinCrewMember("Julia", Rank.LEAD_ATTENDANT);
        flightAttendant = new CabinCrewMember("Greg", Rank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Luis", 3);
        passenger2 = new Passenger("Eva", 2);
        passenger3 = new Passenger("Charles", 2);
        passenger4 = new Passenger("Catriona", 3);
        passenger5 = new Passenger("Alberto", 2);
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        flight.addCabinCrewMembers(leadAttendant);
        flight.addCabinCrewMembers(flightAttendant);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        flight.bookPassenger(passenger4);
        flight.bookPassenger(passenger5);
    }

    @Test
    public void hasDestination() {
        assertEquals("EDI", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("MAD", flight.getDepartureAirport());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("5:45", flight.getDepartureTime());
    }

    @Test
    public void hasTotalWeightAllowance() {
        assertEquals(2000, flight.getTotalWeightAllowance());
    }

    @Test
    public void canBookPassenger() {
        Passenger passenger6 = new Passenger("Luisita", 2);
        Passenger passenger7 = new Passenger("Carlita", 2);
        flight.bookPassenger(passenger6);
        assertEquals(6, flight.getCapacity());
        flight.bookPassenger(passenger7);
        assertEquals(6, flight.getCapacity());
    }
}
