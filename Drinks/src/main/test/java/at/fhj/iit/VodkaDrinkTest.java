package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing VodkaDrink implementation")
class VodkaDrinkTest {

    private ArrayList VodkaLiquids = new ArrayList<VodkaDrink>();
    private VodkaDrink VL;
    private VodkaShot VS;
    private VodkaShot BVS;
    private VodkaShot EmptyShot;
    private VodkaDrink VodkaE;
    private VodkaDrink EmptyDrink;
    private Liquid Energy = new Liquid("Energy Drink", 0.32,0);
    private Liquid VodkaBottle = new Liquid("Vodka Bottle", 0.7, 37.5);
    private Liquid VodkaShot = new Liquid("Vodka Shot", 0.02, 37.5);
    private Liquid BigVodkaShot = new Liquid("Big Vodka Shot",0.08,37.5);
    private Liquid Nothing = new Liquid("Nothing",0,0);

    @BeforeEach
    void setup() {
        VL = new VodkaLongdrink("TestLongDrink", VodkaBottle);
        VS = new VodkaShot(VodkaShot);
        BVS = new VodkaShot(BigVodkaShot);
        VodkaE = new VodkaLongdrink("VodkaE",VodkaLongdrink.createMix("VodkaE",BVS,Energy));
        EmptyShot = new VodkaShot(Nothing);
    }

    @Test
    @DisplayName("Testing calculateEffects Method")
    void calculateEffects() {
        VodkaLiquids.add(VS);
        VodkaLiquids.add(VS);
        VodkaLiquids.add(VS);
        assertEquals(VodkaDrink.calculateEffects(15, Gender.MALE, 70, VodkaLiquids), "Tipsy");
        VodkaLiquids.add(VodkaE);
        assertEquals(VodkaDrink.calculateEffects(15, Gender.MALE, 70, VodkaLiquids), "No driving");
        VodkaLiquids.add(VodkaE);
        VodkaLiquids.add(VodkaE);
        assertEquals(VodkaDrink.calculateEffects(15, Gender.MALE, 70, VodkaLiquids), "Drunk");
        VodkaLiquids.add(VodkaE);
        assertEquals(VodkaDrink.calculateEffects(15, Gender.MALE, 70, VodkaLiquids), "Very drunk");
        VodkaLiquids.add(VodkaE);
        VodkaLiquids.add(VodkaE);
        assertEquals(VodkaDrink.calculateEffects(15, Gender.MALE, 70, VodkaLiquids), "Alcohol poisoning");
        VodkaLiquids.add(VodkaE);
        VodkaLiquids.add(VodkaE);
        assertEquals(VodkaDrink.calculateEffects(15, Gender.MALE, 70, VodkaLiquids), "Probably dead");
        VodkaLiquids.add(VodkaE);
        VodkaLiquids.add(VodkaE);
        assertEquals(VodkaDrink.calculateEffects(15, Gender.MALE, 70, VodkaLiquids), "You dead");
        VodkaLiquids.clear();

        VodkaLiquids.add(VL);
        assertEquals(VodkaDrink.calculateEffects(60,Gender.FEMALE, 65,VodkaLiquids),"You dead");
        VodkaLiquids.clear();

        VodkaLiquids.add(VL);
        assertEquals(VodkaDrink.calculateEffects(60,Gender.MALE,100,VodkaLiquids),"Very drunk");
        VodkaLiquids.clear();

        VodkaLiquids.add(VS);
        assertEquals(VodkaDrink.calculateEffects(1, Gender.MALE, 1, VodkaLiquids), "You dead");
        VodkaLiquids.clear();

        VodkaLiquids.add(VL);
        VodkaLiquids.add(VL);
        VodkaLiquids.add(VL);
        assertEquals(VodkaDrink.calculateEffects(5, Gender.MALE, 150, VodkaLiquids), "You dead");
    }

    @Test
    @DisplayName("Testing createMix Method")
    void testCreateMix() {

        assertEquals(EmptyDrink = new VodkaLongdrink("ErrorVodka", VodkaLongdrink.createMix("No mix", VS, Nothing)),EmptyDrink);

        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            EmptyDrink = new VodkaLongdrink("ErrorVodka", VodkaLongdrink.createMix("No mix", EmptyShot, Nothing));
        });
        assertEquals(exception.getMessage() ,"Drinks have to have a volume");

    }

    @Test
    @DisplayName("Testing getAlcoholPercent Method")
    void testGetAlcoholPercent() {
        assertEquals(VL.getAlcoholPercent(), 37.5);
        assertEquals(VS.getAlcoholPercent(), 37.5);
        assertEquals(BVS.getAlcoholPercent(), 37.5);
        assertEquals(VodkaE.getAlcoholPercent(),7.5);
    }

    @Test
    @DisplayName("Testing getVolume Method")
    void testGetVolume() {
        assertEquals(VL.getVolume(), 0.7);
        assertEquals(VS.getVolume(), 0.02);
        assertEquals(BVS.getVolume(),0.08);
        assertEquals(VodkaE.getVolume(),0.4);
    }

    @Test
    @DisplayName("Testing isAlcoholic Method")
    void testIsAlcoholic() {
        assertEquals(VL.isAlcoholic(), true);
        assertEquals(VS.isAlcoholic(), true);
        assertEquals(BVS.isAlcoholic(), true);
        assertEquals(VodkaE.isAlcoholic(),true);
        assertEquals(EmptyShot.isAlcoholic(),false);
    }
}