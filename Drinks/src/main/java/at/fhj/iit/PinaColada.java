package at.fhj.iit;

public class PinaColada extends CocktailDrink {

    /**
     * amount of lemon juice in centiliter
     */
    private double lemonJuice = 2.0;

    /**
     * amount of coconut cream in centiliter
     */
    private double coconutCream = 4.0;

    /**
     * amount of whipped cream in centiliter
     */
    private double whippedCream = 2.0;

    /**
     * amount of rum in centiliter
     */
    private double rum = 6.0;

    /**
     * amount of pineapple juice in centiliter
     */
    private double pineappleJuice = 8.0;

    /**
     * Creates a PinaColada object with given name and the amount of all the ingredients
     *
     * @param name name of the cocktail
     * @param lemonJuice amount of lemon juice in the cocktail
     * @param coconutCream amount of coconut cream in the cocktail
     * @param whippedCream amount of whipped cream in the cocktail
     * @param rum amount of rum in the cocktail
     * @param pineappleJuice amount of pineapple juice in the cocktail
     *
     */
    public PinaColada(String name, double lemonJuice, double coconutCream, double whippedCream, double rum, double pineappleJuice) {
        super(name);
        this.lemonJuice = lemonJuice;
        this.coconutCream = coconutCream;
        this.whippedCream = whippedCream;
        this.rum = rum;
        this.pineappleJuice = pineappleJuice;
    }

    /**
     * Creates a PinaColada with its usual ingredients
     */
    public PinaColada(){
        super("Piña Colada");
    }

    /**
     * Calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    public double getVolume() {
        return 0;
    }

    /**
     * Calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    public double getAlcoholPercent() {
        return 0;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    public boolean isAlcoholic() {
        return false;
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
