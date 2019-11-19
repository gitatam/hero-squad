package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquadTest {

    @Test
    public void newSquadObjectInstantiatesCorrectly_true(){
        Squad squad = new Squad(6, "Suicide Squad", "Black ops mission and save the world from powerful threats");
        assertEquals(true, squad instanceof Squad);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}