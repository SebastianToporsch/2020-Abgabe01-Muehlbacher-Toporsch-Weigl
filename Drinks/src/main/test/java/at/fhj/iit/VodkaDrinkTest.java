package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing VodkaDrink implementation")
class VodkaDrinkTest {
    private ArrayList VodkaLiquids = new ArrayList<VodkaDrink>();
    private VodkaDrink VL;
    private VodkaDrink VS;
    private VodkaDrink VodkaE;
    private Liquid Wasser = new Liquid("Wasser", 0.3, 0);
    private Liquid Wein = new Liquid("Wein", 0.125, 13);
    private Liquid Energy = new Liquid("Energy Drink", 0.33,0);
    private Liquid VodkaBottle = new Liquid("Vodka Bottle", 0.7, 40);
    private Liquid VodkaShot = new Liquid("Vodka Shot", 0.02, 37.5);

    @BeforeEach
    void setup() {
        VL = new VodkaLongdrink("TestLongDrink", VodkaBottle, Wasser);
        VS = new VodkaShot(VodkaShot);
        VodkaE = new VodkaLongdrink("VodkaEnergy", VodkaBottle, Energy);
        VodkaLiquids.add(VS);
        VodkaLiquids.add(VS);


    }

    @Test
    void calculateEffects() {
        assertEquals(VodkaDrink.calculateEffects(90, Gender.MALE, 100, VodkaLiquids), "Tipsy");
        //assertEquals(VodkaDrink.calculateEffects(90, Gender.MALE, 100, VodkaLiquids), "No driving");

    }

    @Test
    void testGetAlcoholPercent() {
        assertEquals(VL.getAlcoholPercent(), 28);
        assertEquals(VS.getAlcoholPercent(), 37.5);

    }

    @Test
    void testGetVolume() {
        assertEquals(VL.getVolume(), 1);
    }

    @Test
    void testIsAlcoholic() {
        assertEquals(VL.isAlcoholic(), true);
        assertEquals(VS.isAlcoholic(), true);
    }
}