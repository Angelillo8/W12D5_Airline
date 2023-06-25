import com.codeclan.example.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    @Before
    public void before() {
        passenger = new Passenger("Julieta", 3);

    }

    @Test
    public void hasName() {
        assertEquals("Julieta", passenger.getName());
    }

    @Test
    public void hasBags() {
        assertEquals(3, passenger.getNumberOfBags());
    }
}

