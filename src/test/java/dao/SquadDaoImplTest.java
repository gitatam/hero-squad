package dao;

import models.Squad;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SquadDaoImplTest {

    private List<Squad> testArray;
    private final Squad testSquadOne = new Squad(1, "one", "one");
    private final Squad testSquadTwo = new Squad(2, "two", "two");

    @Before
    public void setUp() throws Exception {
        testArray = new ArrayList<>(Arrays.asList());
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAdd_AbleToAddSquadObject_true() {
        SquadDaoImpl implTest = new SquadDaoImpl();
        Squad testOne = testSquadOne;
        assertTrue(implTest.addSquad(testOne));
    }

//    TODO:Revisit test
    @Test
    public void testArrayListMatch_AllSquadsAreCorrectlyReturned_true(){
        SquadDaoImpl implTest = new SquadDaoImpl();
        assertArrayEquals(testArray.toArray(), implTest.findAllSquads().toArray());
    }

}