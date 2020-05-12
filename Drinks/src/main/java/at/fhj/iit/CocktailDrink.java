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
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    public double getVolume(LongIslandIceTea liit){

        double sum = 0;

        for (int i = 0; i < liit.ingredients.size(); i++){
            sum += liit.ingredients.get(i);
        }

        return sum/100;
    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    public double getVolume(PinaColada pc){

        double sum = 0;

        for (int i = 0; i < pc.ingredients.size(); i++){
            sum += pc.ingredients.get(i);
        }

        return sum/100;
    }

    /**
     * Calculates and returns calories of drink
     *
     * @return the calories of drink
     */
    public abstract double getCalories();
}

