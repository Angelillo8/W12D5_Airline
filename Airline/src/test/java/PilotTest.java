import com.codeclan.example.Pilot;
import com.codeclan.example.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;
    @Before
    public void before() {
        pilot = new Pilot("Roberto", Rank.CAPTAIN, "57608974K");

    }

    @Test
    public void hasName() {
        assertEquals("Roberto", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canFlyPlane() {
        assertEquals("I'm flying the plane.", pilot.flyPlane());
    }
}
