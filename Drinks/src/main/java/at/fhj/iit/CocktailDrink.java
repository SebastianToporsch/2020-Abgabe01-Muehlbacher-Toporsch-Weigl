package at.fhj.iit;

public abstract class CocktailDrink extends Drink {

    /**
     * Creates a CocktailDrink object with given name
     *
     * @param name name of the drink
     */
    public CocktailDrink(String name) {
        super(name);
    }

    /**
     * Calculates and returns calories of drink
     *
     * @return the calories of drink
     */
    public double getCalories(){
        return 0;
    }
}
