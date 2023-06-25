import com.codeclan.example.CabinCrewMember;
import com.codeclan.example.Passenger;
import com.codeclan.example.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;
    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Pedro", Rank.FLIGHT_ATTENDANT);

    }

    @Test
    public void hasName() {
        assertEquals("Pedro", cabinCrewMember.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessage() {
        assertEquals("Fasten your seat belts.", cabinCrewMember.relayMessage());
    }
}
