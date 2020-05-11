package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;




@DisplayName("Testing CocktailDrink implementation")
class CocktailDrinkTest {
private CocktailDrink C1;
private CocktailDrink C2;

    @BeforeEach
    void setup(){
        C1 = new PinaColada();
        C2 = new LongIslandIceTea();
    }
    @Test
    void testGetCalories() {
        assertEquals(C1.getCalories(),294.0);
        assertEquals(C2.getCalories(),282.68000000000006);
    }

    @Test
    void testGetVolume(){
        assertEquals(C1.getVolume(),22);
        assertEquals(C2.getVolume(),18.4);
    }
}