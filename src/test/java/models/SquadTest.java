package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SquadTest {
    private Squad squadTest;
    private final int expectedSquadSize = 6;
    private final String expectedSquadName = "Suicide Squad";
    private final String expectedObligation = "Black ops mission and save the world from powerful threats";

    @Test
    public void newSquadObjectInstantiatesCorrectly_true() {
        squadTest = new Squad(expectedSquadSize, expectedSquadName, expectedObligation);
        assertTrue(true);
    }

    @Test
    public void SquadInstantiatesWithRightSize_6() {
        squadTest = new Squad(expectedSquadSize, expectedSquadName, expectedObligation);
        int actualSquadSize = squadTest.getSquadSize();
        assertEquals(expectedSquadSize, actualSquadSize);
    }

    @Test
    public void SquadInstantiatesWithRightName_expectedSquadName() {
        squadTest = new Squad(expectedSquadSize, expectedSquadName, expectedObligation);
        String actualSquadName = squadTest.getSquadName();
        assertEquals(expectedSquadName, actualSquadName);
    }

    @Test
    public void SquadInstantiatesWithRightObligation_expectedObligation() {
        squadTest = new Squad(expectedSquadSize, expectedSquadName, expectedObligation);
        String actualSquadObligation = squadTest.getSquadObligation();
        assertEquals(expectedObligation, actualSquadObligation);
    }

//    TOOD: Add test for slug getter
    @Test
    public void SquadInstantiatesWithRightSlug_expectedSlug() {}

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}