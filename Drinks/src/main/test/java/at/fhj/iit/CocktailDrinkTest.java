package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing CocktailDrink implementation")
class CocktailDrinkTest {
private CocktailDrink C1;
private CocktailDrink C2;
private CocktailDrink C3;
private CocktailDrink C4;
private CocktailDrink C5;
private CocktailDrink C6;

    @BeforeEach
    @DisplayName("Setting everything up for testing")
    /***
     * Sets up 6 drinks
     * 2 Standard Drinks which use the standard values
     * 2 empty drinks with name
     * 2 drinks with no name
     */
    void setup(){
        C1 = new PinaColada();
        C2 = new LongIslandIceTea();
        C3 = new PinaColada("Pina",0,0,0,0,0);
        C4 = new LongIslandIceTea("Long Island",0,0,0,0,0,0,0);
        C5 = new PinaColada("",5,5,5,5,5);
        C6 = new LongIslandIceTea("",5,5,5,5,5,5,5);
    }


    @Test
    @DisplayName("Testing getCalories Method")
    /***
     * Tests if calories get calculated right
     */
    void testGetCalories() {
        assertEquals(C1.getCalories(),294.0);
        assertEquals(C2.getCalories(),282.68000000000006);
        assertEquals(C3.getCalories(),0);
        assertEquals(C4.getCalories(),0);
        assertEquals(C5.getCalories(),378);
        assertEquals(C6.getCalories(),650.5);
    }


    @Test
    @DisplayName("Testing getVolume Method")
    /***
     *  Tests if getVolume returns the right Values
     */
    void testGetVolume(){
        assertEquals(C1.getVolume(),22);
        assertEquals(C2.getVolume(),18.4);
        assertEquals(C3.getVolume(),0);
        assertEquals(C4.getVolume(),0);
        assertEquals(C5.getVolume(),25);
        assertEquals(C6.getVolume(),35);
    }

    @Test
    @DisplayName("Testing getAlcoholPercent Method")
    /***
     *  Tests if getAlcoholPercent returns the right values
     */
    void testGetAlcoholPercent(){
        assertEquals(C1.getAlcoholPercent(),10.909090909090908);
        assertEquals(C2.getAlcoholPercent(),22.282608695652176);
        assertEquals(C3.getAlcoholPercent(),0);
        assertEquals(C4.getAlcoholPercent(),0);
        assertEquals(C5.getAlcoholPercent(),8);
        assertEquals(C6.getAlcoholPercent(),23.571428571428573);
    }

    @Test
    @DisplayName("Testing names")
    /***
     * Tests if the name is saved correctly
     */
    void testName(){
        assertEquals(C1.name,"Piña Colada");
        assertEquals(C2.name,"Long Island Ice Tea");
        assertEquals(C3.name,"Pina");
        assertEquals(C4.name,"Long Island");
        assertEquals(C5.name,"");
        assertEquals(C6.name,"");
    }

    @Test
    @DisplayName("Testing isAlcoholic Method")
    /***
     * Tests if isAlcoholic returns the right values
     */
    void testAlcoholic(){
        assertEquals(C1.isAlcoholic(),true);
        assertEquals(C2.isAlcoholic(),true);
        assertEquals(C3.isAlcoholic(),false);
        assertEquals(C4.isAlcoholic(),false);
        assertEquals(C5.isAlcoholic(),true);
        assertEquals(C6.isAlcoholic(),true);
    }
}