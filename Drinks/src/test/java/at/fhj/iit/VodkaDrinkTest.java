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
    private Liquid Wasser = new Liquid("Wasser",0.3, 0);
    private Liquid Wein = new Liquid("Wein", 0.125, 13);
    private Liquid VodkaBottle = new Liquid("Vodka Bottle",0.7,37.5);
    private Liquid VodkaShot = new Liquid("Vodka Shot",0.02,37.5);

    @BeforeEach
    void setup(){
        VL = new VodkaLongdrink("TestLongdrink",VodkaBottle,Wasser);
        VS = new VodkaShot(VodkaShot);
        VodkaLiquids.add(VL);
        VodkaLiquids.add(VS);


    }
    @Test
    void calculateEffects() {
        assertEquals(VodkaDrink.calculateEffects(1,Gender.MALE,70,VodkaLiquids),"You dead");
    }
}