package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HeroTest {
    private Hero heroTest;
    private final int expectedAge = 25;
    private final String expectedName = "Harley Quinn";
    private final String expectedPower = "Acquired superhuman strength and agility";
    private final String expectedWeakness = "!sane";
    private final Squad expectedSquad = new Squad(6, "Suicide Squad", "Black ops mission and save the world from powerful threats");


    @Test
    public void newHeroObjectInstantiatesCorrectly_true() {
        heroTest = new Hero(expectedName, expectedAge, expectedPower, expectedWeakness, expectedSquad.getSquadName());
        assertTrue(true);
    }

    @Test
    public void HeroInstantiatesWithRightName_expectedName() {
        heroTest = new Hero(expectedName, expectedAge, expectedPower, expectedWeakness, expectedSquad.getSquadName());
        String actualName = heroTest.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void HeroInstantiatesWithRightAge_expectedAge() {
        heroTest = new Hero(expectedName, expectedAge, expectedPower, expectedWeakness, expectedSquad.getSquadName());
        int actualAge = heroTest.getAge();
        assertEquals(expectedAge, actualAge);
    }

    @Test
    public void HeroInstantiatesWithRightPower_expectedPower() {
        heroTest = new Hero(expectedName, expectedAge, expectedPower, expectedWeakness, expectedSquad.getSquadName());
        String actualPower = heroTest.getPower();
        assertEquals(expectedPower, actualPower);
    }

    @Test
    public void HeroInstantiatesWithRightWeakness_expectedWeakness() {
        heroTest = new Hero(expectedName, expectedAge, expectedPower, expectedWeakness, expectedSquad.getSquadName());
        String actualWeakness = heroTest.getWeakness();
        assertEquals(expectedWeakness, actualWeakness);
    }

    @Test
    public void testSetSquad_expectedSquad(){
        heroTest = new Hero(expectedName, expectedAge, expectedPower, expectedWeakness, expectedSquad.getSquadName());
        heroTest.setSquad(expectedSquad.getSquadName());
        assertEquals(expectedSquad.getSquadName(), heroTest.getSquad());
    }

    @Test
    public void testGetSquad_expectedSquad() {
        heroTest = new Hero(expectedName, expectedAge, expectedPower, expectedWeakness, expectedSquad.getSquadName());
        String actualSquad = heroTest.getSquad();
        assertEquals(expectedSquad.getSquadName(), actualSquad);
    }
}