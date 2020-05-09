package at.fhj.iit;

public class LongIslandIceTea extends CocktailDrink{

    /**
     * amount of vodka in centiliter
     */
    private double vodka = 4.0;

    /**
     * amount of tequila in centiliter
     */
    private double tequila = 2.0;

    /**
     * amount of rum in centiliter
     */
    private double rum = 2.0;

    /**
     * amount of gin in centiliter
     */
    private double gin = 2.0;

    /**
     * amount of lemon juice in centiliter
     */
    private double lemonJuice = 3.0;

    /**
     * amount of cola in centiliter
     */
    private double cola = 4.4;

    /**
     * amount of sugar syrup in centiliter
     */
    private double sugarSyrup = 1.0;

    /**
     * Creates a LongIslandIceTea object with given name and the amount of all the ingredients
     *
     * @param name name of the cocktail
     * @param vodka amount of vodka in the cocktail
     * @param tequila amount of tequila in the cocktail
     * @param rum amount of rum in the cocktail
     * @param gin amount of gin in the cocktail
     * @param lemonJuice amount of lemon juice in the cocktail
     * @param cola amount of cola in the cocktail
     * @param sugarSyrup amount of sugar syrup in the cocktail
     *
     */
    public LongIslandIceTea(String name, double vodka, double tequila, double rum, double gin, double lemonJuice, double cola, double sugarSyrup) {
        super(name);
        this.vodka = vodka;
        this.tequila = tequila;
        this.rum = rum;
        this.gin = gin;
        this.lemonJuice = lemonJuice;
        this.cola = cola;
        this.sugarSyrup = sugarSyrup;
    }

    /**
     * Creates a LongIslandIceTea with its usual ingredients
     */
    public LongIslandIceTea(){
        super("Long Island Ice Tea");
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
